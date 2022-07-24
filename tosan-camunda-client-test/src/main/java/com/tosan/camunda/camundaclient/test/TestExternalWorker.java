package com.tosan.camunda.camundaclient.test;

import com.tosan.camunda.api.Worker;
import com.tosan.camunda.camundaclient.external.ExternalWorker;
import com.tosan.camunda.camundaclient.test.exception.CamundaClientTestException;
import org.camunda.bpm.client.spring.annotation.ExternalTaskSubscription;
import org.camunda.bpm.client.task.ExternalTask;
import org.camunda.bpm.client.task.ExternalTaskService;
import org.springframework.stereotype.Component;

/**
 * @author M.khoshnevisan
 * @since 3/15/2022
 */
@Component
@ExternalTaskSubscription(
        topicName = "testTopic",
        processDefinitionKey = "process",
        includeExtensionProperties = true
)
public class TestExternalWorker implements ExternalWorker {
    @Override
    public Worker getWorker() {
        return WorkerType.TEST_WORKER;
    }

    /**
     * declare business exceptions as checked exception and handle it with handleBpmnError
     * declare technical exceptions as unchecked exception and implement it from CamundaClientRuntimeIncident
     * these runtime exceptions will be handled automatically by camunda client aspect
     * /aspect also declare external task completed automatically if no exception happen during execution
     * @param externalTask
     * @param externalTaskService
     */
    @Override
    public void execute(ExternalTask externalTask, ExternalTaskService externalTaskService) {
        try {
            handleExecution();
        } catch (CamundaClientTestException e) {
            externalTaskService.handleBpmnError(externalTask, e.getClass().getSimpleName());
        }
    }

    private void handleExecution() throws CamundaClientTestException {
        //business here
        System.out.println("business handled successfully");
    }
}
