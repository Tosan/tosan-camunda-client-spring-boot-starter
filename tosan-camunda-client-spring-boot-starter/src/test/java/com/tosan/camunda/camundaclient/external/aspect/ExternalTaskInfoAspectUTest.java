package com.tosan.camunda.camundaclient.external.aspect;

import com.tosan.camunda.camundaclient.external.ExternalTaskService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.camunda.bpm.client.task.ExternalTask;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class ExternalTaskInfoAspectUTest {

    private ExternalTaskInfoAspect externalTaskInfoAspect = new ExternalTaskInfoAspect();
    private MockedStatic<ExternalTaskService> externalTaskService = mockStatic(ExternalTaskService.class);

    @AfterEach
    public void cleanUpStatic() {
        externalTaskService.close();
    }

    @Test
    public void testHandleTaskInfo_callWithNoException_createInfoAndRemoveFinally() throws Throwable {
        ProceedingJoinPoint pjp = mock(ProceedingJoinPoint.class);
        Object[] args = new Object[1];
        ExternalTask externalTask = mock(ExternalTask.class);
        args[0] = externalTask;
        when(pjp.getArgs()).thenReturn(args);
        externalTaskInfoAspect.handleTaskInfo(pjp);
        externalTaskService.verify(() -> ExternalTaskService.createTaskInfo(eq(externalTask)));
        externalTaskService.verify(() -> ExternalTaskService.removeTaskInfo(eq(externalTask)));
    }

    @Test
    public void testHandleTaskInfo_callWithException_createInfoAndRemoveFinally() throws Throwable {
        ProceedingJoinPoint pjp = mock(ProceedingJoinPoint.class);
        Object[] args = new Object[1];
        ExternalTask externalTask = mock(ExternalTask.class);
        args[0] = externalTask;
        when(pjp.getArgs()).thenReturn(args);
        when(pjp.proceed()).thenThrow(new RuntimeException());
        assertThrows(RuntimeException.class, () -> externalTaskInfoAspect.handleTaskInfo(pjp));
        externalTaskService.verify(() -> ExternalTaskService.createTaskInfo(eq(externalTask)));
        externalTaskService.verify(() -> ExternalTaskService.removeTaskInfo(eq(externalTask)));
    }
}