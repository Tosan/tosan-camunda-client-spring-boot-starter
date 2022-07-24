package com.tosan.camunda.api;

import lombok.Getter;

import java.util.Map;

/**
 * @author M.khoshnevisan
 * @since 10/27/2021
 */
@Getter
public class ExternalTaskExecutionLogDto {

    /**
     * execution state
     */
    private ExecutionState executionState;
    /**
     * worker name
     */
    private String workerName;
    /**
     * process instance id
     */
    private String processInstanceId;
    /**
     * business key
     */
    private String businessKey;
    /**
     * variables
     */
    private Map<String, Object> variables;

    /**
     * @param executionState execution state
     * @return
     */
    public ExternalTaskExecutionLogDto setExecutionState(ExecutionState executionState) {
        this.executionState = executionState;
        return this;
    }

    /**
     * @param workerName worker name
     * @return
     */
    public ExternalTaskExecutionLogDto setWorker(String workerName) {
        this.workerName = workerName;
        return this;
    }

    /**
     * @param processInstanceId process instance id
     * @return
     */
    public ExternalTaskExecutionLogDto setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
        return this;
    }

    /**
     * @param businessKey business key
     * @return
     */
    public ExternalTaskExecutionLogDto setBusinessKey(String businessKey) {
        this.businessKey = businessKey;
        return this;
    }

    /**
     * @param variables variables
     * @return
     */
    public ExternalTaskExecutionLogDto setVariables(Map<String, Object> variables) {
        this.variables = variables;
        return this;
    }

    @Override
    public String toString() {
        return "ExternalTaskExecutionLogDto{\n" +
                "executionState=" + executionState + "\n" +
                ", workerName='" + workerName + '\'' + "\n" +
                ", processInstanceId='" + processInstanceId + '\'' + "\n" +
                ", businessKey='" + businessKey + '\'' + "\n" +
                ", variables=" + variables + "\n" +
                '}';
    }
}