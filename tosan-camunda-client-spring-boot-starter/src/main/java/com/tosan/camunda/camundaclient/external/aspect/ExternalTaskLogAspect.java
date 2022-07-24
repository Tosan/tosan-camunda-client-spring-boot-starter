package com.tosan.camunda.camundaclient.external.aspect;

import com.tosan.camunda.api.ExecutionState;
import com.tosan.camunda.api.ExternalTaskExecutionLogDto;
import com.tosan.camunda.api.Worker;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.camunda.bpm.client.task.ExternalTask;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author M.khoshnevisan
 * @since 10/27/2021
 */
@Aspect
@Component
@Slf4j
@Order(20)
public class ExternalTaskLogAspect extends ExternalTaskBaseAspect{

    @Around(value = "externalTaskHandler()")
    public Object logExecuteExternalTask(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        ExternalTask externalTask = (ExternalTask) args[0];
        final Worker worker = extractWorker(pjp);
        ExternalTaskExecutionLogDto startExternalTaskExecutionLogDto =
                createExternalTaskExecutionLogDto(externalTask, worker, ExecutionState.START);
        log.info(startExternalTaskExecutionLogDto.toString());

        try {
            Object result = pjp.proceed();
            ExternalTaskExecutionLogDto endExternalTaskExecutionLogDto =
                    createExternalTaskExecutionLogDto(externalTask, worker, ExecutionState.SUCCESS);
            log.info(endExternalTaskExecutionLogDto.toString());
            return result;
        } catch (Throwable throwable) {
            ExternalTaskExecutionLogDto endExternalTaskExecutionLogDto =
                    createExternalTaskExecutionLogDto(externalTask, worker, ExecutionState.FAIL);
            log.info(endExternalTaskExecutionLogDto.toString());
            log.error("exception occurred in task {}", throwable);
            throw throwable;
        }
    }

    private ExternalTaskExecutionLogDto createExternalTaskExecutionLogDto(
            ExternalTask externalTask, Worker worker, ExecutionState executionState) {
        return new ExternalTaskExecutionLogDto()
                .setExecutionState(executionState)
                .setWorker(worker.getWorkerName())
                .setProcessInstanceId(externalTask.getProcessInstanceId())
                .setBusinessKey(externalTask.getBusinessKey())
                .setVariables(externalTask.getAllVariables());
    }
}
