package com.tosan.camunda.api;

/**
 * @author M.khoshnevisan
 * @since 10/31/2021
 */
public enum ExceptionIncidentState {

    /**
     * repeatable exception such as TimeoutException
     */
    REPEATABLE,
    /**
     * not repeatable exception such as NullPointerException
     * this type change into incident immediately
     */
    NON_REPEATABLE
}
