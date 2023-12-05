package com.tosan.camunda.camundaclient.util;

import com.tosan.camunda.api.ExceptionIncidentState;
import com.tosan.camunda.camundaclient.config.ExternalTaskInfo;
import com.tosan.camunda.camundaclient.config.RetryConfig;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.client.task.ExternalTask;
import org.camunda.bpm.client.task.ExternalTaskService;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Objects;

import static com.tosan.camunda.api.Constants.INCIDENT_TO_BPMN_ERROR_CODE;
import static com.tosan.camunda.camundaclient.external.ExternalTaskService.getTaskInfo;

/**
 * @author M.khoshnevisan
 * @since 6/27/2023
 */
@Slf4j
@AllArgsConstructor
public class ExternalTaskResultUtil {

    private final RetryConfig retryConfig;

    public void declareTaskCompleted(Object[] args) {
        ExternalTask externalTask = getExternalTask(args);
        ExternalTaskService externalTaskService = getExternalTaskService(args);
        ExternalTaskInfo taskInfo = getTaskInfo(externalTask);
        externalTaskService.complete(externalTask, taskInfo.getVariables());
    }

    public void handleBpmnException(ExternalTask externalTask, ExternalTaskService externalTaskService, String errorCode, String errorMessage) {
        externalTaskService.handleBpmnError(externalTask, errorCode, errorMessage, getTaskInfo(externalTask).getVariables());
    }

    public void handleException(ExceptionIncidentState exceptionIncidentState,
                                Exception e, Object[] args, boolean convertToBpmnError) {
        ExternalTask externalTask = getExternalTask(args);
        ExternalTaskService externalTaskService = getExternalTaskService(args);
        ExternalTaskInfo taskInfo = getTaskInfo(externalTask);
        int retryCount = exceptionIncidentState.equals(ExceptionIncidentState.NON_REPEATABLE) ? 0 :
                calculateRetries(externalTask.getRetries());
        int retryInterval = (retryCount == 0 ? 0 : retryConfig.getRetryInterval());
        log.info("determined retry count:{} with retry interval{}", retryCount, retryInterval);
        if (exceptionIncidentState.equals(ExceptionIncidentState.REPEATABLE) && convertToBpmnError && retryCount == 0) {
            log.info("converted repeatable exception to bpmn error");
            handleBpmnException(externalTask, externalTaskService, INCIDENT_TO_BPMN_ERROR_CODE, "converted to BpmnError instead of incident");
        } else {
            externalTaskService.handleFailure(externalTask.getId(), e.getMessage(), getStackTrace(e),
                    retryCount, retryInterval, taskInfo.getVariables(), null);
        }
    }

    protected ExternalTask getExternalTask(Object[] args) {
        return (ExternalTask) args[0];
    }

    protected ExternalTaskService getExternalTaskService(Object[] args) {
        return (ExternalTaskService) args[1];
    }

    private int calculateRetries(Integer retries) {
        if (retries == null) {
            return retryConfig.getRetryCount();
        }
        return retries <= 0 ? retries : retries - 1;
    }

    private String getStackTrace(final Throwable throwable) {
        if (Objects.nonNull(throwable.getCause())) {
            return this.getStackTrace(throwable.getCause());
        }
        StringWriter stackTrace = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stackTrace, true);
        throwable.printStackTrace(printWriter);
        return stackTrace.getBuffer().toString();
    }
}