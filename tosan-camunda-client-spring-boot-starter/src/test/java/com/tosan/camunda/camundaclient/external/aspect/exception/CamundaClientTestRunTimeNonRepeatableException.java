package com.tosan.camunda.camundaclient.external.aspect.exception;

import com.tosan.camunda.api.CamundaClientRuntimeIncident;
import com.tosan.camunda.api.ExceptionIncidentState;

/**
 * @author M.khoshnevisan
 * @since 3/15/2022
 */
public class CamundaClientTestRunTimeNonRepeatableException extends RuntimeException implements CamundaClientRuntimeIncident {
    @Override
    public ExceptionIncidentState getExceptionIncidentState() {
        return ExceptionIncidentState.NON_REPEATABLE;
    }
}