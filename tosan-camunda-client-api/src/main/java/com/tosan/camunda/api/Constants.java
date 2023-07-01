package com.tosan.camunda.api;

/**
 *constant variables
 *
 * @author M.khoshnevisan
 * @since 11/30/2021
 */
public class Constants {

    /**
     * business key variable name in MDC
     */
    public static final String BUSINESS_KEY_MDC_FIELD_NAME = "business-key";
    /**
     * worker variable name in MDC
     */
    public static final String WORKER_MDC_FIELD_NAME = "worker";
    /**
     * error code for times when incident change into bpmn error
     */
    public static final String INCIDENT_TO_BPMN_ERROR_CODE = "incidentToBpmnError";
}
