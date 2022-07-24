package com.tosan.camunda.camundaclient.config;

import org.springframework.validation.annotation.Validated;

/**
 * @author M.khoshnevisan
 * @since 1/23/2022
 */
@Validated
public class CamundaRestServiceConfig {

    /**
     * rest service connection timeout to camunda server in milliseconds
     */
    private Integer connectionTimeout = 5000;

    /**
     * rest service request timeout to camunda server in milliseconds
     */
    private Integer requestTimeout = 10000;

    /**
     * @return rest service connection timeout to camunda server in milliseconds
     */
    public Integer getConnectionTimeout() {
        return connectionTimeout;
    }

    /**
     * @param connectionTimeout rest service connection timeout to camunda server in milliseconds
     */
    public void setConnectionTimeout(Integer connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }

    /**
     * @return rest service request timeout to camunda server in milliseconds
     */
    public Integer getRequestTimeout() {
        return requestTimeout;
    }

    /**
     * @param requestTimeout rest service request timeout to camunda server in milliseconds
     */
    public void setRequestTimeout(Integer requestTimeout) {
        this.requestTimeout = requestTimeout;
    }

    @Override
    public String toString() {
        return "CamundaRestServiceConfig{\n" +
                "connectionTimeout=" + connectionTimeout + "\n" +
                ", requestTimeout=" + requestTimeout + "\n" +
                '}';
    }
}
