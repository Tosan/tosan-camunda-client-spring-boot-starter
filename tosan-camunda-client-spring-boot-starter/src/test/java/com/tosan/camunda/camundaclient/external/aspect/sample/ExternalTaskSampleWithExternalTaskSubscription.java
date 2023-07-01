package com.tosan.camunda.camundaclient.external.aspect.sample;

import org.camunda.bpm.client.spring.annotation.ExternalTaskSubscription;

/**
 * @author M.khoshnevisan
 * @since 6/27/2023
 */
@ExternalTaskSubscription(
        topicName = "externalTaskTopic",
        processDefinitionKey = "externalTaskProcess",
        includeExtensionProperties = true
)
public class ExternalTaskSampleWithExternalTaskSubscription {
}