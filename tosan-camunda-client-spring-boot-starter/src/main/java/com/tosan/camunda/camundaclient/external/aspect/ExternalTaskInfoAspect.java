package com.tosan.camunda.camundaclient.external.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.camunda.bpm.client.task.ExternalTask;
import org.springframework.core.annotation.Order;

import static com.tosan.camunda.camundaclient.external.ExternalTaskService.createTaskInfo;
import static com.tosan.camunda.camundaclient.external.ExternalTaskService.removeTaskInfo;

@Aspect
@Order(10)
@Slf4j
public class ExternalTaskInfoAspect extends ExternalTaskBaseAspect {
    @Around(value = "externalTaskHandler()")
    public Object handleTaskInfo(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        ExternalTask externalTask = (ExternalTask) args[0];
        try {
            createTaskInfo(externalTask);
            return pjp.proceed();
        } finally {
            removeTaskInfo(externalTask);
        }
    }
}