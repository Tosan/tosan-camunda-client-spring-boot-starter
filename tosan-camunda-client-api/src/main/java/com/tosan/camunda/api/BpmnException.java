package com.tosan.camunda.api;

/**
 * @author Shahryar Safizadeh
 * @since 12/26/2023
 */
public class BpmnException extends RuntimeException {
    public BpmnException() {
    }

    public BpmnException(String message) {
        super(message);
    }

    public BpmnException(String message, Throwable cause) {
        super(message, cause);
    }
}