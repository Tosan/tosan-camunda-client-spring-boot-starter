package com.tosan.camunda.camundaclient.config;

import com.tosan.camunda.camundaclient.config.enumuration.ExecutionType;

/**
 * @author Shahryar Safizadeh
 * @since 12/4/2023
 */
public class ExecutionConfig {
    /**
     * wait duration per task in parallel backoff strategy
     */
    private Long waitDurationPerTask;

    /**
     * thread pool size for parallel executor
     */
    private int threadPoolSize;

    /**
     * type of execution
     */
    private ExecutionType executionType;

    /**
     * is multi-instance enabled
     */
    private boolean isMultiInstanceEnabled;

    /**
     * @return wait duration per task in parallel backoff strategy
     */
    public Long getWaitDurationPerTask() {
        return waitDurationPerTask;
    }

    /**
     * @param waitDurationPerTask wait duration per task in parallel backoff strategy
     */
    public void setWaitDurationPerTask(Long waitDurationPerTask) {
        this.waitDurationPerTask = waitDurationPerTask;
    }

    /**
     * @return thread pool size for parallel executor
     */
    public int getThreadPoolSize() {
        return threadPoolSize;
    }

    /**
     * @param threadPoolSize thread pool size for parallel executor
     */
    public void setThreadPoolSize(int threadPoolSize) {
        this.threadPoolSize = threadPoolSize;
    }

    /**
     * @return type of execution
     */
    public ExecutionType getExecutionType() {
        return executionType;
    }

    /**
     * @param executionType type of execution
     */
    public void setExecutionType(ExecutionType executionType) {
        this.executionType = executionType;
    }

    /**
     * @return is multi-instance enabled
     */
    public boolean isMultiInstanceEnabled() {
        return isMultiInstanceEnabled;
    }

    /**
     * @param multiInstanceEnabled is multi-instance enabled
     */
    public void setMultiInstanceEnabled(boolean multiInstanceEnabled) {
        isMultiInstanceEnabled = multiInstanceEnabled;
    }

    @Override
    public String toString() {
        return "ExecutionConfig{" +
                "waitDurationPerTask=" + waitDurationPerTask +
                ", threadPoolSize=" + threadPoolSize +
                ", executionType=" + executionType +
                ", isMultiInstanceEnabled=" + isMultiInstanceEnabled +
                '}';
    }
}