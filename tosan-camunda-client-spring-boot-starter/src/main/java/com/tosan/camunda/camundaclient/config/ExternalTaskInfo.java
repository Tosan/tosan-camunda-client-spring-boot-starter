package com.tosan.camunda.camundaclient.config;

import java.util.HashMap;
import java.util.Map;

public class ExternalTaskInfo {

    private Map<String, Object> variables;

    public ExternalTaskInfo(Map<String, Object> variables) {
        this.variables = variables;
    }

    public Map<String, Object> getVariables() {
        if (this.variables == null) {
            this.variables = new HashMap<>();
        }
        return this.variables;
    }
}