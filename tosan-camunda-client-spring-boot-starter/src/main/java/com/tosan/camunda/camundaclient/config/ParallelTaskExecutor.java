package com.tosan.camunda.camundaclient.config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.camunda.bpm.client.task.ExternalTask;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author Shahryar Safizadeh
 * @since 11/20/2023
 */
@Slf4j
public class ParallelTaskExecutor {
    private ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
    private ExecutorService executorService;
    private static List<Future<?>> futures = new ArrayList<>();

    public ParallelTaskExecutor(ExecutorService executorService) {
        this.executorService = executorService;
    }

    public Future<?> submitToExecutor(ProceedingJoinPoint pjp) {
        Future<?> future = executorService.submit(() -> {
            try {
                pjp.proceed();
            } catch (Throwable e) {
                if (e instanceof RuntimeException runtimeException) {
                    throw runtimeException;
                }
                throw new RuntimeException(e);
            }
        });
        return future;
    }

    public void scheduledTaskCancellation(Future<?> future, ExternalTask externalTask) {
        scheduledExecutorService.schedule(() -> {
            if (!future.isDone()) {
                log.info("Task : {} is canceled by scheduledCanceller!!!", externalTask.getBusinessKey());
                future.cancel(true);
            }
        }, 5, TimeUnit.SECONDS);
    }

    public List<Future<?>> getFutures() {
        return futures;
    }
}
