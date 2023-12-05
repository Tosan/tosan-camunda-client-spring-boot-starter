package com.tosan.camunda.camundaclient.external.aspect;

import com.tosan.camunda.api.CamundaClientRuntimeIncident;
import com.tosan.camunda.api.ExceptionIncidentState;
import com.tosan.camunda.camundaclient.config.CamundaClientExternalTaskSubscription;
import com.tosan.camunda.camundaclient.util.ExternalTaskResultUtil;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;

/**
 * @author M.khoshnevisan
 * @since 11/1/2021
 */
@Aspect
@Order(40)
@Slf4j
@AllArgsConstructor
public class ExternalTaskResultAspect extends ExternalTaskBaseAspect {

    private final ExternalTaskResultUtil externalTaskResultUtil;

    @Around(value = "externalTaskHandler()")
    public Object sendResults(ProceedingJoinPoint pjp) throws Throwable {
        boolean convertToBpmnError = checkConvertToBpmnErrorInCaseOfIncident(pjp);
        try {
            Object proceed = pjp.proceed();
            if (Thread.currentThread().isInterrupted()) {
                log.error("Thread has been interrupted before completion.");
                throw new InterruptedException("Thread has been interrupted before completion.");
            } else {
                externalTaskResultUtil.declareTaskCompleted(pjp.getArgs());
            }
            return proceed;
        } catch (Exception e) {
            if (Thread.currentThread().isInterrupted() || e.getCause() instanceof InterruptedException) {
                throw new InterruptedException("Task has been interrupted before completion.");
            } else if (e instanceof CamundaClientRuntimeIncident) {
                CamundaClientRuntimeIncident runtimeIncident = (CamundaClientRuntimeIncident) e;
                externalTaskResultUtil.handleException(runtimeIncident.getExceptionIncidentState(), e, pjp.getArgs(), convertToBpmnError);
            } else {
                externalTaskResultUtil.handleException(ExceptionIncidentState.NON_REPEATABLE, e, pjp.getArgs(), convertToBpmnError);
            }
            throw e;
        }
    }

    private boolean checkConvertToBpmnErrorInCaseOfIncident(ProceedingJoinPoint pjp) {
        try {
            MethodSignature signature = (MethodSignature) pjp.getSignature();
            Class declaringType = signature.getDeclaringType();
            CamundaClientExternalTaskSubscription externalTaskSubscription = (CamundaClientExternalTaskSubscription)
                    declaringType.getAnnotation(CamundaClientExternalTaskSubscription.class);
            if (externalTaskSubscription == null) {
                return false;
            }
            return externalTaskSubscription.changeIncidentToBpmnError();
        } catch (Exception e) {
            log.error("error on extracting bpmn error to incident", e);
            return false;
        }
    }
}
