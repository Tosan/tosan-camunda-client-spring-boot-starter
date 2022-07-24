package com.tosan.camunda.camundaclient.config;

import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

/**
 * @author M.khoshnevisan
 * @since 11/3/2021
 */
@Validated
public class RetryConfig {

    /**
     * max retry count after technical repeatable exception
     */
    private Integer retryCount = 3;

    /**
     * retry interval in milliseconds
     */
    @NotNull
    private Integer retryInterval;

    /**
     * @return max retry count after technical repeatable exception
     */
    public Integer getRetryCount() {
        return retryCount;
    }

    /**
     * @param retryCount max retry count after technical repeatable exception
     */
    public void setRetryCount(Integer retryCount) {
        this.retryCount = retryCount;
    }

    /**
     * @return retry interval in milliseconds
     */
    public Integer getRetryInterval() {
        return retryInterval;
    }

    /**
     * @param retryInterval retry interval in milliseconds
     */
    public void setRetryInterval(Integer retryInterval) {
        this.retryInterval = retryInterval;
    }

    @Override
    public String toString() {
        return "RetryConfig{\n" +
                "retryCount=" + retryCount + "\n" +
                ", retryInterval=" + retryInterval + "\n" +
                '}';
    }
}
