package com.tosan.camunda.camundaclient.util;

import com.tosan.camunda.api.ExceptionIncidentState;
import com.tosan.camunda.camundaclient.config.RetryConfig;
import org.camunda.bpm.client.task.ExternalTask;
import org.camunda.bpm.client.task.ExternalTaskService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static com.tosan.camunda.api.Constants.INCIDENT_TO_BPMN_ERROR_CODE;
import static com.tosan.camunda.camundaclient.external.ExternalTaskService.createTaskInfo;
import static org.mockito.Mockito.*;

/**
 * @author M.khoshnevisan
 * @since 6/27/2023
 */
public class ExternalTaskResultUtilUTest {
    private RetryConfig retryConfig;
    private Object[] args;
    private ExternalTaskService externalTaskService;
    private ExternalTask externalTask;
    private ExternalTaskResultUtil externalTaskResultUtil;
    private Map<String, Object> variables = new HashMap<>();
    private Integer retryCount = 7;
    private Long retryInterval = 8000L;
    private String testId = "testId";

    @BeforeEach
    public void setup() {
        retryConfig = mock(RetryConfig.class);
        when(retryConfig.getRetryCount()).thenReturn(retryCount);
        when(retryConfig.getRetryInterval()).thenReturn(retryInterval.intValue());
        args = new Object[2];
        externalTaskService = mock(ExternalTaskService.class);
        externalTask = mock(ExternalTask.class);
        args[0] = externalTask;
        args[1] = externalTaskService;
        externalTaskResultUtil = new ExternalTaskResultUtil(retryConfig);
        when(externalTask.getId()).thenReturn(testId);
        when(externalTask.getAllVariables()).thenReturn(variables);
        createTaskInfo(externalTask);
    }

    @Test
    public void testDeclareTaskCompleted_callNormally_declareTaskCompleted() {
        externalTaskResultUtil.declareTaskCompleted(args);
        verify(externalTaskService, timeout(1)).complete(eq(externalTask), eq(variables));
    }

    @Test
    public void testHandleException_repeatableExceptionWithNullRetry_setRetryCountAndHandleFailure() {
        when(externalTask.getRetries()).thenReturn(null);
        String message = "test";
        externalTaskResultUtil.handleException(ExceptionIncidentState.REPEATABLE, new Exception(message), args, true);
        verify(externalTaskService, times(1)).handleFailure(eq(testId), eq(message), anyString(),
                eq(retryCount), eq(retryInterval), eq(variables), eq(null));
    }

    @Test
    public void testHandleException_repeatableExceptionWithNonNullRetry_setRetryCountAndHandleFailure() {
        Integer externalRetryCount = 3;
        when(externalTask.getRetries()).thenReturn(externalRetryCount);
        String message = "test";
        externalTaskResultUtil.handleException(ExceptionIncidentState.REPEATABLE, new Exception(message), args, true);
        verify(externalTaskService, times(1)).handleFailure(eq(testId), eq(message), anyString(),
                eq(externalRetryCount - 1), eq(retryInterval), eq(variables), eq(null));
    }

    @Test
    public void testHandleException_repeatableExceptionWithZeroRetryLeftAndFalseIncidentToBpmnError_setRetryCountAndHandleFailure() {
        Integer externalRetryCount = 1;
        when(externalTask.getRetries()).thenReturn(externalRetryCount);
        String message = "test";
        externalTaskResultUtil.handleException(ExceptionIncidentState.REPEATABLE, new Exception(message), args, false);
        verify(externalTaskService, times(1)).handleFailure(eq(testId), eq(message), anyString(),
                eq(externalRetryCount - 1), eq(0L), eq(variables), eq(null));
    }

    @Test
    public void testHandleException_repeatableExceptionWithZeroRetryLeftAndTrueIncidentToBpmnError_handleBpmnError() {
        Integer externalRetryCount = 1;
        when(externalTask.getRetries()).thenReturn(externalRetryCount);
        String message = "test";
        externalTaskResultUtil.handleException(ExceptionIncidentState.REPEATABLE, new Exception(message), args, true);
        verify(externalTaskService, times(1)).handleBpmnError(eq(externalTask), eq(INCIDENT_TO_BPMN_ERROR_CODE),
                eq("converted to BpmnError instead of incident"));
    }

    @Test
    public void testHandleException_nonRepeatableExceptionWithFalseIncidentToBpmnError_setRetryCountAndHandleFailure() {
        Integer externalRetryCount = 5;
        when(externalTask.getRetries()).thenReturn(externalRetryCount);
        String message = "test";
        externalTaskResultUtil.handleException(ExceptionIncidentState.NON_REPEATABLE, new Exception(message), args, false);
        verify(externalTaskService, times(1)).handleFailure(eq(testId), eq(message), anyString(),
                eq(0), eq(0L), eq(variables), eq(null));
    }

    @Test
    public void testHandleException_nonRepeatableExceptionWithTrueIncidentToBpmnError_setRetryCountAndHandleFailure() {
        String message = "test";
        externalTaskResultUtil.handleException(ExceptionIncidentState.NON_REPEATABLE, new Exception(message), args, true);
        verify(externalTaskService, times(1)).handleFailure(eq(testId), eq(message), anyString(),
                eq(0), eq(0L), eq(variables), eq(null));
    }
}