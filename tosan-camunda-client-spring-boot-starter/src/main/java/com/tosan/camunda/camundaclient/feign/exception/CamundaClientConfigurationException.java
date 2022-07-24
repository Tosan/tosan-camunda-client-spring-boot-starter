package com.tosan.camunda.camundaclient.feign.exception;

import com.tosan.client.http.starter.impl.feign.exception.FeignConfigurationException;

/**
 * @author M.khoshnevisan
 * @since 1/17/2022
 */
public class CamundaClientConfigurationException extends FeignConfigurationException {
    public CamundaClientConfigurationException(String message) {
        super(message);
    }

    public CamundaClientConfigurationException(String message, Throwable cause) {
        super(message, cause);
    }
}
