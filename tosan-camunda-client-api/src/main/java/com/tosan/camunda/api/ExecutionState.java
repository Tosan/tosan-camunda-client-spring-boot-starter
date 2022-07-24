package com.tosan.camunda.api;

public enum ExecutionState {
    /**
     * start
     */
    START,
    /**
     * termination with success
     */
    SUCCESS,
    /**
     * termination with failure
     */
    FAIL
}
