package com.tosan.camunda.api;

/**
 *
 * interface indicating technical error
 * for considering exception as technical exception , exception class must implement this interface
 *
 * @author M.khoshnevisan
 * @since 1/23/2022
 */
public interface CamundaClientRuntimeIncident {

    ExceptionIncidentState getExceptionIncidentState();
}
