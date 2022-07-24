package com.tosan.camunda.camundaclient.external.aspect;

import com.tosan.camunda.api.CamundaClientRuntimeIncident;
import com.tosan.camunda.api.ExceptionIncidentState;
import com.tosan.camunda.camundaclient.config.CamundaClientConfig;
import com.tosan.camunda.camundaclient.config.RetryConfig;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.camunda.bpm.client.task.ExternalTask;
import org.camunda.bpm.client.task.ExternalTaskService;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Objects;

/**
 * @author M.khoshnevisan
 * @since 11/1/2021
 */
@Component
@Aspect
@Order(40)
@Slf4j
public class ExternalTaskResultAspect extends ExternalTaskBaseAspect {

    private final RetryConfig retryConfig;

    public ExternalTaskResultAspect(CamundaClientConfig camundaClientConfig) {
        this.retryConfig = camundaClientConfig.getRetry();
    }

    @Around(value = "externalTaskHandler()")
    public Object sendResults(ProceedingJoinPoint pjp) throws Throwable {
        try {
            Object proceed = pjp.proceed();
            declareTaskCompleted(pjp);
            return proceed;
        } catch (Exception e) {
            if (e instanceof CamundaClientRuntimeIncident) {
                CamundaClientRuntimeIncident camundaClientRuntimeIncident = (CamundaClientRuntimeIncident) e;
                handleException(camundaClientRuntimeIncident.getExceptionIncidentState(), e, pjp);
            } else {
                handleException(ExceptionIncidentState.NON_REPEATABLE, e, pjp);
            }
            throw e;
        }
    }

    private void declareTaskCompleted(ProceedingJoinPoint pjp) {
        Object[] args = pjp.getArgs();
        ExternalTask externalTask = (ExternalTask) args[0];
        ExternalTaskService externalTaskService = (ExternalTaskService) args[1];
        externalTaskService.complete(externalTask);
    }

    private void handleException(ExceptionIncidentState exceptionIncidentState,
                                 Exception e, ProceedingJoinPoint pjp) {

        Object[] args = pjp.getArgs();
        ExternalTask externalTask = (ExternalTask) args[0];
        ExternalTaskService externalTaskService = (ExternalTaskService) args[1];
        int retryCount = exceptionIncidentState.equals(ExceptionIncidentState.NON_REPEATABLE) ? 0 :
                calculateRetries(externalTask.getRetries());
        int retryInterval = (retryCount == 0 ? 0 : retryConfig.getRetryInterval());
        log.info("determined retry count:{} with retry interval{}", retryCount, retryInterval);
        externalTaskService.handleFailure(externalTask, e.getMessage(), getStackTrace(e),
                retryCount, retryInterval);
    }

    private int calculateRetries(Integer retries) {
        if (retries == null) {
            return retryConfig.getRetryCount();
        }
        return retries <= 0 ? retries : retries - 1;
    }

    private String getStackTrace(final Throwable throwable) {
        if (Objects.nonNull(throwable.getCause())) {
            return this.getStackTrace(throwable.getCause());
        }
        StringWriter stackTrace = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stackTrace, true);
        throwable.printStackTrace(printWriter);
        return stackTrace.getBuffer().toString();
    }
}
