package com.tosan.camunda.camundaclient.external.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.camunda.bpm.client.task.ExternalTask;
import org.slf4j.MDC;
import org.springframework.core.annotation.Order;

import static com.tosan.camunda.api.Constants.BUSINESS_KEY_MDC_FIELD_NAME;
import static com.tosan.camunda.api.Constants.WORKER_MDC_FIELD_NAME;

/**
 * @author M.khoshnevisan
 * @since 11/3/2021
 */
@Order(10)
@Aspect
public class ExternalTaskMdcAspect extends ExternalTaskBaseAspect {

    @Around(value = "externalTaskHandler()")
    public Object logExecuteExternalTask(ProceedingJoinPoint pjp) throws Throwable {
        ExternalTask externalTask = (ExternalTask) pjp.getArgs()[0];
        MDC.put(BUSINESS_KEY_MDC_FIELD_NAME, externalTask.getBusinessKey());
        MDC.put(WORKER_MDC_FIELD_NAME, extractWorker(pjp).getWorkerName());
        try {
            return pjp.proceed();
        } finally {
            MDC.clear();
        }
    }
}
