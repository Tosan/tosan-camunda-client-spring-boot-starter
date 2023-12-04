package com.tosan.camunda.camundaclient.config;

import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.client.backoff.ExponentialBackoffStrategy;
import org.camunda.bpm.client.task.ExternalTask;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;

import java.util.Date;
import java.util.List;
import java.util.concurrent.Future;

/**
 * @author Shahryar Safizadeh
 * @since 11/20/2023
 */
@Slf4j
@Validated
public class ParallelBackoffStrategy extends ExponentialBackoffStrategy {

    @Value("${camunda.bpm.client.execution.wait-duration-per-task}")
    private Long waitDurationPerTask;

    private ParallelTaskExecutor parallelTaskExecutor;

    public ParallelBackoffStrategy(ParallelTaskExecutor parallelTaskExecutor) {
        this.parallelTaskExecutor = parallelTaskExecutor;
    }

    @Override
    public void reconfigure(List<ExternalTask> externalTasks) {
        super.reconfigure(externalTasks);
        if (!externalTasks.isEmpty()) {
            try {
                waitForTaskCompletion(externalTasks);
            } catch (InterruptedException | RuntimeException e) {
                log.error("Error happened in main thread while waiting for tasks in backoff strategy!!!", e);
            }
        }
    }

    private void waitForTaskCompletion(List<ExternalTask> externalTasks) throws InterruptedException {
        if (waitDurationPerTask == null) {
            throw new RuntimeException("camunda.bpm.client.execution.wait-duration-per-task is not set or is not valid.");
        } else {
            Date expireDate = new Date(System.currentTimeMillis() + waitDurationPerTask * externalTasks.size());
            while (!isAllTasksCompleted(parallelTaskExecutor.getFutures())) {
                Date currentTime = new Date(System.currentTimeMillis());
                if (expireDate.before(currentTime)) {
                    break;
                }
                Thread.sleep(5000);
            }
            cancelAllFutures(parallelTaskExecutor.getFutures());
            parallelTaskExecutor.getFutures().clear();
        }
    }

    private void cancelAllFutures(List<Future<?>> futures) {
        for (Future future : futures) {
            if (!future.isDone() && !future.isCancelled()) {
                log.error("Future : {} did not complete before wait duration time and got canceled.", future);
                future.cancel(true);
            }
        }
    }

    private boolean isAllTasksCompleted(List<Future<?>> futures) {
        for (Future future : futures) {
            if (!future.isDone()) {
                return false;
            }
        }
        return true;
    }
}