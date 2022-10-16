package com.tosan.camunda.camundaclient.external.aspect.worker;

import com.tosan.camunda.api.Worker;
import com.tosan.camunda.camundaclient.external.ExternalWorker;
import org.camunda.bpm.client.task.ExternalTask;
import org.camunda.bpm.client.task.ExternalTaskService;

public class TestWorker implements ExternalWorker {
    @Override
    public Worker getWorker() {
        return TestWorkerType.TEST_WORKER;
    }

    @Override
    public void execute(ExternalTask externalTask, ExternalTaskService externalTaskService) {

    }
}