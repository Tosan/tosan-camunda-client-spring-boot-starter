package com.tosan.camunda.camundaclient.external.aspect;

import com.tosan.camunda.api.ExceptionIncidentState;
import com.tosan.camunda.camundaclient.external.aspect.exception.CamundaClientTestRunTimeNonRepeatableException;
import com.tosan.camunda.camundaclient.external.aspect.exception.CamundaClientTestRuntimeException;
import com.tosan.camunda.camundaclient.external.aspect.sample.ExternalTaskSampleWithExternalTaskSubscription;
import com.tosan.camunda.camundaclient.external.aspect.sample.ExternalTaskSampleWithFalseIncidentToBpmnError;
import com.tosan.camunda.camundaclient.external.aspect.sample.ExternalTaskSampleWithTrueIncidentToBpmnError;
import com.tosan.camunda.camundaclient.util.ExternalTaskResultUtil;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

/**
 * @author M.khoshnevisan
 * @since 6/27/2023
 */
public class ExternalTaskResultAspectUTest {
    private ExternalTaskResultUtil externalTaskResultUtil;
    private ExternalTaskResultAspect externalTaskResultAspect;

    @BeforeEach
    public void setup() {
        externalTaskResultUtil = mock(ExternalTaskResultUtil.class);
        externalTaskResultAspect = new ExternalTaskResultAspect(externalTaskResultUtil);
    }

    @Test
    public void testSendResults_proceedWithNoException_declareTaskComplete() throws Throwable {
        ProceedingJoinPoint pjp = mock(ProceedingJoinPoint.class);
        mockCamundaExternalTaskAnnotation(pjp, ExternalTaskSampleWithExternalTaskSubscription.class);
        Object[] args = new Object[2];
        when(pjp.getArgs()).thenReturn(args);
        when(pjp.proceed()).thenReturn(new Object());
        externalTaskResultAspect.sendResults(pjp);
        verify(externalTaskResultUtil, times(1)).declareTaskCompleted(eq(args));
    }

    @Test
    public void testSendResults_proceedWithCamundaClientRuntimeNonRepeatableException_declareExceptionState() throws Throwable {
        ProceedingJoinPoint pjp = mock(ProceedingJoinPoint.class);
        mockCamundaExternalTaskAnnotation(pjp, ExternalTaskSampleWithExternalTaskSubscription.class);
        Object[] args = new Object[2];
        when(pjp.getArgs()).thenReturn(args);
        CamundaClientTestRunTimeNonRepeatableException nonRepeatableException = new CamundaClientTestRunTimeNonRepeatableException();
        when(pjp.proceed()).thenThrow(nonRepeatableException);
        assertThrows(CamundaClientTestRunTimeNonRepeatableException.class, () -> externalTaskResultAspect.sendResults(pjp));
        verify(externalTaskResultUtil, times(1)).handleException(eq(ExceptionIncidentState.NON_REPEATABLE),
                eq(nonRepeatableException), eq(args), eq(false));
    }

    @Test
    public void testSendResults_proceedWithCamundaClientRuntimeRepeatableException_declareExceptionState() throws Throwable {
        ProceedingJoinPoint pjp = mock(ProceedingJoinPoint.class);
        mockCamundaExternalTaskAnnotation(pjp, ExternalTaskSampleWithExternalTaskSubscription.class);
        Object[] args = new Object[2];
        when(pjp.getArgs()).thenReturn(args);
        CamundaClientTestRuntimeException runtimeException = new CamundaClientTestRuntimeException();
        when(pjp.proceed()).thenThrow(runtimeException);
        assertThrows(CamundaClientTestRuntimeException.class, () -> externalTaskResultAspect.sendResults(pjp));
        verify(externalTaskResultUtil, times(1)).handleException(eq(ExceptionIncidentState.REPEATABLE),
                eq(runtimeException), eq(args), eq(false));
    }

    @Test
    public void testSendResults_proceedWithNonCamundaClientExceptionType_declareNonRepeatableException() throws Throwable {
        ProceedingJoinPoint pjp = mock(ProceedingJoinPoint.class);
        mockCamundaExternalTaskAnnotation(pjp, ExternalTaskSampleWithExternalTaskSubscription.class);
        Object[] args = new Object[2];
        when(pjp.getArgs()).thenReturn(args);
        Exception exception = new Exception();
        when(pjp.proceed()).thenThrow(exception);
        assertThrows(Exception.class, () -> externalTaskResultAspect.sendResults(pjp));
        verify(externalTaskResultUtil, times(1)).handleException(eq(ExceptionIncidentState.NON_REPEATABLE),
                eq(exception), eq(args), eq(false));
    }

    @Test
    public void testSendResults_proceedWithTrueIncidentToBpmnError_declareExceptionWithTrueIncidentToBpmnError() throws Throwable {
        ProceedingJoinPoint pjp = mock(ProceedingJoinPoint.class);
        mockCamundaExternalTaskAnnotation(pjp, ExternalTaskSampleWithTrueIncidentToBpmnError.class);
        Object[] args = new Object[2];
        when(pjp.getArgs()).thenReturn(args);
        Exception exception = new Exception();
        when(pjp.proceed()).thenThrow(exception);
        assertThrows(Exception.class, () -> externalTaskResultAspect.sendResults(pjp));
        verify(externalTaskResultUtil, times(1)).handleException(eq(ExceptionIncidentState.NON_REPEATABLE),
                eq(exception), eq(args), eq(true));
    }

    @Test
    public void testSendResults_proceedWithFalseIncidentToBpmnError_declareExceptionWithFalseIncidentToBpmnError() throws Throwable {
        ProceedingJoinPoint pjp = mock(ProceedingJoinPoint.class);
        mockCamundaExternalTaskAnnotation(pjp, ExternalTaskSampleWithFalseIncidentToBpmnError.class);
        Object[] args = new Object[2];
        when(pjp.getArgs()).thenReturn(args);
        Exception exception = new Exception();
        when(pjp.proceed()).thenThrow(exception);
        assertThrows(Exception.class, () -> externalTaskResultAspect.sendResults(pjp));
        verify(externalTaskResultUtil, times(1)).handleException(eq(ExceptionIncidentState.NON_REPEATABLE),
                eq(exception), eq(args), eq(false));
    }

    @Test
    public void testSendResults_exceptionHappenInGettingIncidentToBpmnErrorFlag_declareExceptionWithFalseIncidentToBpmnError() throws Throwable {
        ProceedingJoinPoint pjp = mock(ProceedingJoinPoint.class);
        Object[] args = new Object[2];
        when(pjp.getArgs()).thenReturn(args);
        Exception exception = new Exception();
        when(pjp.proceed()).thenThrow(exception);
        assertThrows(Exception.class, () -> externalTaskResultAspect.sendResults(pjp));
        verify(externalTaskResultUtil, times(1)).handleException(eq(ExceptionIncidentState.NON_REPEATABLE),
                eq(exception), eq(args), eq(false));
    }

    private void mockCamundaExternalTaskAnnotation(ProceedingJoinPoint pjp, Class declaringType) {
        MethodSignature methodSignature = mock(MethodSignature.class);
        when(pjp.getSignature()).thenReturn(methodSignature);
        when(methodSignature.getDeclaringType()).thenReturn(declaringType);
    }
}