package com.tosan.camunda.camundaclient.test.exception;

import com.tosan.camunda.api.CamundaClientRuntimeIncident;
import com.tosan.camunda.api.ExceptionIncidentState;

/**
 * @author M.khoshnevisan
 * @since 3/15/2022
 */
public class CamundaClientTestRuntimeException extends RuntimeException implements CamundaClientRuntimeIncident {
    @Override
    public ExceptionIncidentState getExceptionIncidentState() {
        return ExceptionIncidentState.REPEATABLE;
    }
}
