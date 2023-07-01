package com.tosan.camunda.camundaclient.test;

import com.tosan.camunda.api.Worker;
import com.tosan.camunda.camundaclient.config.CamundaClientExternalTaskSubscription;
import com.tosan.camunda.camundaclient.external.ExternalWorker;
import org.camunda.bpm.client.task.ExternalTask;
import org.camunda.bpm.client.task.ExternalTaskService;
import org.springframework.stereotype.Component;

/**
 * @author M.khoshnevisan
 * @since 6/26/2023
 */
@Component
@CamundaClientExternalTaskSubscription(topicName = "reportError",
        processDefinitionKey = "SimpleProcess",
        includeExtensionProperties = true)
public class ReportErrorWorker implements ExternalWorker {
    @Override
    public Worker getWorker() {
        return WorkerType.ERROR_WORKER;
    }

    @Override
    public void execute(ExternalTask externalTask, ExternalTaskService externalTaskService) {
        System.out.println("simple process resulted in error- error report");
    }
}