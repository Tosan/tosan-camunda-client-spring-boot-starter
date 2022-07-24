package com.tosan.camunda.camundaclient.test;

import com.tosan.camunda.api.Worker;

/**
 * @author M.khoshnevisan
 * @since 3/15/2022
 */
public enum WorkerType implements Worker {

    TEST_WORKER("TEST_WORKER");

    private String workerName;

    WorkerType(String workerName) {
        this.workerName = workerName;
    }

    @Override
    public String getWorkerName() {
        return workerName;
    }
}