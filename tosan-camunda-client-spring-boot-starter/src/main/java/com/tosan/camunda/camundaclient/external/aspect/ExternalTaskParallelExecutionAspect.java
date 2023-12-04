package com.tosan.camunda.camundaclient.external.aspect;

import com.tosan.camunda.camundaclient.config.ParallelTaskExecutor;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.camunda.bpm.client.task.ExternalTask;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.Order;

import java.util.concurrent.Future;

/**
 * @author Shahryar Safizadeh
 * @since 11/20/2023
 */
@Aspect
@Order(5)
@Slf4j
@AllArgsConstructor
public class ExternalTaskParallelExecutionAspect extends ExternalTaskBaseAspect {

    @Value("${camunda.bpm.client.execution.multi-instance-enabled}")
    private boolean isMultiInstanceEnabled;

    private ParallelTaskExecutor parallelTaskExecutor;

    public ExternalTaskParallelExecutionAspect(ParallelTaskExecutor parallelTaskExecutor) {
        this.parallelTaskExecutor = parallelTaskExecutor;
    }

    @Around(value = "externalTaskHandler()")
    public Object executeRunnableTask(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        ExternalTask externalTask = (ExternalTask) args[0];
        Future<?> future = parallelTaskExecutor.submitToExecutor(pjp);
        parallelTaskExecutor.getFutures().add(future);
        if (isMultiInstanceEnabled) {
            parallelTaskExecutor.scheduledTaskCancellation(future, externalTask);
        }
        return null;
    }
}