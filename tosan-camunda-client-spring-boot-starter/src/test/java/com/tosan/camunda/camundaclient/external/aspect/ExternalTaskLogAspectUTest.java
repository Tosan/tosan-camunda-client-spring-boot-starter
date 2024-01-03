package com.tosan.camunda.camundaclient.external.aspect;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.read.ListAppender;
import com.tosan.camunda.camundaclient.external.aspect.worker.TestWorker;
import org.aspectj.lang.ProceedingJoinPoint;
import org.camunda.bpm.client.task.ExternalTask;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.UUID;

import static com.tosan.camunda.camundaclient.external.testUtil.TestLogUtil.getAppenderList;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ExternalTaskLogAspectUTest {

    private ExternalTaskLogAspect externalTaskLogAspect = new ExternalTaskLogAspect();
    private ProceedingJoinPoint pjp;
    private ExternalTask externalTask;
    private String processInstanceId = UUID.randomUUID().toString();
    private String businessKey = UUID.randomUUID().toString();

    @BeforeEach
    public void setUp() {
        pjp = mock(ProceedingJoinPoint.class);
        TestWorker testWorker = new TestWorker();
        when(pjp.getTarget()).thenReturn(testWorker);
        when(pjp.getThis()).thenReturn(testWorker);
        Object[] args = new Object[1];
        when(pjp.getArgs()).thenReturn(args);
        externalTask = mock(ExternalTask.class);
        args[0] = externalTask;
        when(externalTask.getProcessInstanceId()).thenReturn(processInstanceId);
        when(externalTask.getBusinessKey()).thenReturn(businessKey);
        when(externalTask.getId()).thenReturn("1");
    }

    @Test
    public void testLogExternalTaskExecution_normalExternalTask_logRequestCorrectly() throws Throwable {
        ListAppender<ILoggingEvent> appenderList = getAppenderList(ExternalTaskLogAspect.class);
        externalTaskLogAspect.logExternalTaskExecution(pjp);
        List<ILoggingEvent> list = appenderList.list;
        String startLog = list.get(0).getMessage();
        assertTrue(startLog.contains("workerName='TEST_WORKER'"));
        assertTrue(startLog.contains("executionState=START"));
        assertTrue(startLog.contains("processInstanceId='" + processInstanceId + "'"));
        assertTrue(startLog.contains("businessKey='" + businessKey + "'"));
    }
}