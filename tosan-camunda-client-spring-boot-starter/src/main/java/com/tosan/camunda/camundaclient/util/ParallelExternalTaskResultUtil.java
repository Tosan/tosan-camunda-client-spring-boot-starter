package com.tosan.camunda.camundaclient.util;

import com.tosan.camunda.api.ExceptionIncidentState;
import com.tosan.camunda.camundaclient.config.RetryConfig;
import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.client.task.ExternalTask;
import org.camunda.bpm.client.task.ExternalTaskService;

/**
 * @author Shahryar Safizadeh
 * @since 12/5/2023
 */
@Slf4j
public class ParallelExternalTaskResultUtil extends ExternalTaskResultUtil {

    public ParallelExternalTaskResultUtil(RetryConfig retryConfig) {
        super(retryConfig);
    }

    @Override
    public void declareTaskCompleted(Object[] args) {
        ExternalTask externalTask = getExternalTask(args);
        String businessKey = externalTask.getBusinessKey().intern();
        log.info("Acquiring lock for business key:{}", businessKey);
        synchronized (businessKey) {
            log.debug("Lock has been acquired by task with business key: {}", businessKey);
            super.declareTaskCompleted(args);
        }
        log.info("Lock has been released from task with business key: {}", businessKey);
    }

    @Override
    public void handleBpmnException(ExternalTask externalTask, ExternalTaskService externalTaskService, String errorCode, String errorMessage) {
        String businessKey = externalTask.getBusinessKey().intern();
        log.info("Acquiring lock for business key:{}", businessKey);
        synchronized (businessKey) {
            log.debug("Lock has been acquired by task with business key: {}", businessKey);
            super.handleBpmnException(externalTask, externalTaskService, errorCode, errorMessage);
        }
        log.info("Lock has been released from task with business key: {}", businessKey);
    }

    @Override
    public void handleException(ExceptionIncidentState exceptionIncidentState, Exception e, Object[] args, boolean convertToBpmnError) {
        ExternalTask externalTask = getExternalTask(args);
        String businessKey = externalTask.getBusinessKey().intern();
        log.info("Acquiring lock for business key:{}", businessKey);
        synchronized (businessKey) {
            log.debug("Lock has been acquired by task with business key: {}", businessKey);
            super.handleException(exceptionIncidentState, e, args, convertToBpmnError);
        }
        log.info("Lock has been released from task with business key: {}", businessKey);
    }
}