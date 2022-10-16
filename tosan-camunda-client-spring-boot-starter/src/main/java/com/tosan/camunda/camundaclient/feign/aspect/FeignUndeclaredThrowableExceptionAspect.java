package com.tosan.camunda.camundaclient.feign.aspect;

import com.tosan.camunda.camundaclient.feign.exception.CamundaClientException;
import com.tosan.client.http.starter.impl.feign.exception.FeignClientRequestExecuteException;
import com.tosan.client.http.starter.impl.feign.exception.UnknownException;
import feign.FeignException;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

import java.lang.reflect.UndeclaredThrowableException;

/**
 * @author M.khoshnevisan
 * @since 1/17/2022
 */
@Aspect
public class FeignUndeclaredThrowableExceptionAspect {

    @AfterThrowing(pointcut = "execution(* com.tosan.camunda.camundaclient.generated.api.*.*(..))",
            throwing = "exception")
    public void processCoreException(Exception exception) throws Throwable {
        if (exception instanceof UndeclaredThrowableException) {
            Throwable undeclaredThrowable = ((UndeclaredThrowableException) exception).getUndeclaredThrowable();
            if (undeclaredThrowable instanceof UnknownException) {
                UnknownException unknownException = (UnknownException) undeclaredThrowable;
                throw new CamundaClientException(unknownException.getJsonResponse(), unknownException);
            }
            throw new CamundaClientException(undeclaredThrowable.getMessage(), undeclaredThrowable);
        } else if (exception instanceof FeignException) {
            throw new FeignClientRequestExecuteException(exception.getMessage(), exception);
        } else {
            throw exception;
        }
    }
}
