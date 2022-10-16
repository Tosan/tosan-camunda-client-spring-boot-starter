package com.tosan.camunda.camundaclient.external.aspect;

import com.tosan.camunda.api.Worker;
import com.tosan.camunda.camundaclient.external.aspect.worker.TestWorker;
import com.tosan.camunda.camundaclient.external.aspect.worker.TestWorkerType;
import com.tosan.camunda.camundaclient.external.aspect.worker.TestWorkerWithNoType;
import org.aspectj.lang.ProceedingJoinPoint;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ExternalTaskBaseAspectUTest {

    private ExternalTaskBaseAspect externalTaskBaseAspect = new ExternalTaskInfoAspect();

    @Test
    public void testExtractWorker_workerWithWorkerType_recognizeWorkerCorrectly() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        ProceedingJoinPoint pjp = mock(ProceedingJoinPoint.class);
        TestWorker testWorker = new TestWorker();
        when(pjp.getTarget()).thenReturn(testWorker);
        when(pjp.getThis()).thenReturn(testWorker);
        Worker worker = externalTaskBaseAspect.extractWorker(pjp);
        assertEquals(TestWorkerType.TEST_WORKER, worker);
    }

    @Test
    public void testExtractWorker_workerWithNullType_returnNull() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        ProceedingJoinPoint pjp = mock(ProceedingJoinPoint.class);
        TestWorkerWithNoType testWorker = new TestWorkerWithNoType();
        when(pjp.getTarget()).thenReturn(testWorker);
        when(pjp.getThis()).thenReturn(testWorker);
        Worker worker = externalTaskBaseAspect.extractWorker(pjp);
        assertNull(worker);
    }
}