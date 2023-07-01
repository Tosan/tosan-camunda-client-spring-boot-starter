package com.tosan.camunda.camundaclient.test;

import com.tosan.camunda.api.Worker;
import com.tosan.camunda.camundaclient.config.CamundaClientExternalTaskSubscription;
import com.tosan.camunda.camundaclient.external.ExternalWorker;
import com.tosan.camunda.camundaclient.test.exception.CamundaClientTestRuntimeException;
import org.camunda.bpm.client.task.ExternalTask;
import org.camunda.bpm.client.task.ExternalTaskService;
import org.springframework.stereotype.Component;

/**
 * @author M.khoshnevisan
 * @since 6/26/2023
 */
@Component
@CamundaClientExternalTaskSubscription(topicName = "incidentServiceTask",
        processDefinitionKey = "SimpleProcess",
        includeExtensionProperties = true,
        changeIncidentToBpmnError = true)
public class TestCamundaClientWorker implements ExternalWorker {
    @Override
    public Worker getWorker() {
        return WorkerType.SIMPLE_WORKER;
    }

    /**
     * be careful when changeIncidentToBpmnError is enabled you must define boundary error event for the task.
     *
     * @param externalTask
     * @param externalTaskService
     */
    @Override
    public void execute(ExternalTask externalTask, ExternalTaskService externalTaskService) {
        if (true) {
            throw new CamundaClientTestRuntimeException();
        }

    }
}