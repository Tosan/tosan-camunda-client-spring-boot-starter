package com.tosan.camunda.camundaclient.external.aspect;

import com.tosan.camunda.camundaclient.config.ParallelTaskExecutor;
import org.aspectj.lang.ProceedingJoinPoint;
import org.camunda.bpm.client.task.ExternalTask;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

/**
 * @author Shahryar Safizadeh
 * @since 12/4/2023
 */
public class ExternalTaskParallelExecutionAspectUTest {
    private ExternalTaskParallelExecutionAspect externalTaskParallelExecutionAspect;
    private ParallelTaskExecutor parallelTaskExecutor;
    private ProceedingJoinPoint pjp;

    @BeforeEach
    public void setup() {
        parallelTaskExecutor = mock(ParallelTaskExecutor.class);
        pjp = mock(ProceedingJoinPoint.class);
        externalTaskParallelExecutionAspect = new ExternalTaskParallelExecutionAspect(parallelTaskExecutor);
    }

    @Test
    public void testExecuteRunnableTask_simpleCallWithNoException_submitTaskSuccessfully() throws Throwable {
        Object[] args = new Object[1];
        ExternalTask externalTask = mock(ExternalTask.class);
        args[0] = externalTask;
        when(pjp.getArgs()).thenReturn(args);
        externalTaskParallelExecutionAspect.executeRunnableTask(pjp);
        verify(parallelTaskExecutor).submitToExecutor(pjp);
    }
}