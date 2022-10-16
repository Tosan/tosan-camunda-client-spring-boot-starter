package com.tosan.camunda.camundaclient.external;

import com.tosan.camunda.camundaclient.config.ExternalTaskInfo;
import org.camunda.bpm.client.task.ExternalTask;

import java.util.HashMap;
import java.util.Map;

public class ExternalTaskService {

    private static final Map<String, ExternalTaskInfo> TASK_INFO_MAP = new HashMap<>();

    public static ExternalTaskInfo getTaskInfo(ExternalTask externalTask) {
        return TASK_INFO_MAP.get(externalTask.getId());
    }

    public static ExternalTaskInfo createTaskInfo(ExternalTask externalTask) {
        ExternalTaskInfo externalTaskInfo = new ExternalTaskInfo(externalTask.getAllVariables());
        TASK_INFO_MAP.put(externalTask.getId(), externalTaskInfo);
        return externalTaskInfo;
    }

    public static void removeTaskInfo(ExternalTask externalTask) {
        TASK_INFO_MAP.remove(externalTask.getId());
    }
}