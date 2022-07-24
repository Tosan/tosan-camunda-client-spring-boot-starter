package com.tosan.camunda.camundaclient.feign.exception;

/**
 * @author M.khoshnevisan
 * @since 1/30/2022
 */
public class CamundaClientException extends RuntimeException {

    public CamundaClientException(String message, Throwable cause) {
        super(message, cause);
    }
}
