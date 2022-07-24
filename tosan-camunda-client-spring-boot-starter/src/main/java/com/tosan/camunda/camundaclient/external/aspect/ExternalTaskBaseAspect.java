package com.tosan.camunda.camundaclient.external.aspect;

import com.tosan.camunda.api.Worker;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Pointcut;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author M.khoshnevisan
 * @since 11/1/2021
 */
public class ExternalTaskBaseAspect {

    @Pointcut(value = "execution(public * com.tosan.camunda.camundaclient.external.ExternalWorker+" +
            ".execute(org.camunda.bpm.client.task.ExternalTask, org.camunda.bpm.client.task.ExternalTaskService))")
    public void externalTaskHandler() {
    }

    public Worker extractWorker(ProceedingJoinPoint pjp)
            throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Class<?> aClass = pjp.getTarget().getClass();
        Method getWorker = aClass.getDeclaredMethod("getWorker");
        Worker worker = (Worker)getWorker.invoke(pjp.getThis());
        return worker;
    }
}
