package com.tosan.camunda.camundaclient.external.aspect.worker;

import com.tosan.camunda.api.Worker;

public enum TestWorkerType implements Worker {

    TEST_WORKER("TEST_WORKER");

    private String workerName;

    TestWorkerType(String workerName) {
        this.workerName = workerName;
    }

    @Override
    public String getWorkerName() {
        return workerName;
    }
}