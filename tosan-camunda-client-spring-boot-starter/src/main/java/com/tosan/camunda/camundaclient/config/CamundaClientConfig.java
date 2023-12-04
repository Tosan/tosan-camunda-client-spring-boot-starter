package com.tosan.camunda.camundaclient.config;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.camunda.bpm.client.spring.boot.starter.ClientProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.validation.annotation.Validated;

/**
 * @author M.khoshnevisan
 * @since 12/13/2021
 */
@Validated
public class CamundaClientConfig extends ClientProperties {

    /**
     * retry config for technical repeatable exceptions
     */
    @NestedConfigurationProperty
    @NotNull
    @Valid
    private RetryConfig retry;

    /**
     * rest service configuration
     */
    @NestedConfigurationProperty
    @NotNull
    @Valid
    private CamundaRestServiceConfig restServiceConfig;

    /**
     * execution configuration
     */
    @NestedConfigurationProperty
    @Valid
    private ExecutionConfig execution;

    /**
     * @return retry config for technical repeatable exceptions
     */
    public RetryConfig getRetry() {
        return retry;
    }

    /**
     * @param retry retry config for technical repeatable exceptions
     */
    public void setRetry(RetryConfig retry) {
        this.retry = retry;
    }

    /**
     * @return rest service configuration
     */
    public CamundaRestServiceConfig getRestServiceConfig() {
        return restServiceConfig;
    }

    /**
     * @param restServiceConfig rest service configuration
     */
    public void setRestServiceConfig(CamundaRestServiceConfig restServiceConfig) {
        this.restServiceConfig = restServiceConfig;
    }

    /**
     * @return execution configuration
     */
    public ExecutionConfig getExecution() {
        return execution;
    }

    /**
     * @param execution execution configuration
     */
    public void setExecution(ExecutionConfig execution) {
        this.execution = execution;
    }

    @Override
    public String toString() {
        return "CamundaClientConfig{" +
                "retry=" + retry +
                ", restServiceConfig=" + restServiceConfig +
                ", execution=" + execution +
                '}';
    }
}
