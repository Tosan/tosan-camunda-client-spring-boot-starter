package com.tosan.camunda.camundaclient.external.aspect.sample;

import com.tosan.camunda.camundaclient.config.CamundaClientExternalTaskSubscription;

/**
 * @author M.khoshnevisan
 * @since 6/27/2023
 */
@CamundaClientExternalTaskSubscription(topicName = "reportError",
        processDefinitionKey = "SimpleProcess",
        includeExtensionProperties = true)
public class ExternalTaskSampleWithFalseIncidentToBpmnError {
}