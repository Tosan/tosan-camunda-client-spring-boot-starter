package com.tosan.camunda.camundaclient.config;

import org.camunda.bpm.client.spring.SpringTopicSubscription;
import org.camunda.bpm.client.spring.annotation.ExternalTaskSubscription;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

/**
 * @author M.khoshnevisan
 * @since 6/26/2023
 */
@Documented
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@ExternalTaskSubscription
public @interface CamundaClientExternalTaskSubscription {

    String STRING_NULL_VALUE = "$null$";
    long LONG_NULL_VALUE = Long.MIN_VALUE;
    /**
     * @return autoOpen <ul>
     * <li>{@code true}: the client immediately starts to fetch for External Tasks
     * <li>{@code false}: topic subscription can be opened after application start by calling
     * {@link SpringTopicSubscription#open()}
     */
    @AliasFor(annotation = ExternalTaskSubscription.class)
    boolean autoOpen() default true;

    /**
     * Alias for {@link #value()}.
     *
     * @return topicName of the Service Task in the BPMN process model the client subscribes to
     */
    @AliasFor(annotation = ExternalTaskSubscription.class)
    String topicName() default STRING_NULL_VALUE;

    /**
     * Alias for {@link #topicName()}.
     *
     * @return topicName of the Service Task in the BPMN process model the client subscribes to
     */
    @AliasFor(annotation = ExternalTaskSubscription.class)
    String value() default STRING_NULL_VALUE;

    /**
     * @return lockDuration <ul>
     * <li> in milliseconds to lock the external tasks
     * <li> must be greater than zero
     * <li> the default lock duration is 20 seconds (20,000 milliseconds)
     * <li> overrides the lock duration configured on bootstrapping the client
     * </ul>
     */
    @AliasFor(annotation = ExternalTaskSubscription.class)
    long lockDuration() default LONG_NULL_VALUE;

    /**
     * @return variableNames of variables which are supposed to be retrieved. All variables are
     * retrieved by default.
     */
    @AliasFor(annotation = ExternalTaskSubscription.class)
    String[] variableNames() default {STRING_NULL_VALUE};

    /**
     * @return localVariables
     * whether or not variables from greater scope than the external task
     * should be fetched. <code>false</code> means all variables visible
     * in the scope of the external task will be fetched,
     * <code>true</code> means only local variables (to the scope of the
     * external task) will be fetched
     */
    @AliasFor(annotation = ExternalTaskSubscription.class)
    boolean localVariables() default false;

    /**
     * @return businessKey to filter for external tasks that are supposed to be fetched and locked
     */
    @AliasFor(annotation = ExternalTaskSubscription.class)
    String businessKey() default STRING_NULL_VALUE;

    /**
     * @return processDefinitionId to filter for external tasks that are supposed to be fetched and
     * locked
     */
    @AliasFor(annotation = ExternalTaskSubscription.class)
    String processDefinitionId() default STRING_NULL_VALUE;

    /**
     * @return processDefinitionIds to filter for external tasks that are supposed to be fetched and
     * locked
     */
    @AliasFor(annotation = ExternalTaskSubscription.class)
    String[] processDefinitionIdIn() default {STRING_NULL_VALUE};

    /**
     * @return processDefinitionKey to filter for external tasks that are supposed to be fetched and
     * locked
     */
    @AliasFor(annotation = ExternalTaskSubscription.class)
    String processDefinitionKey() default STRING_NULL_VALUE;

    /**
     * @return processDefinitionKeyIn to filter for external tasks that are supposed to be fetched
     * and locked
     */
    @AliasFor(annotation = ExternalTaskSubscription.class)
    String[] processDefinitionKeyIn() default {STRING_NULL_VALUE};

    /**
     * @return processDefinitionVersionTag to filter for external tasks that are supposed to be
     * fetched and locked
     */
    @AliasFor(annotation = ExternalTaskSubscription.class)
    String processDefinitionVersionTag() default STRING_NULL_VALUE;

    /**
     * @return processVariables of which the external tasks to be retrieved are related to. Each
     * value is instance of {@link ExternalTaskSubscription.ProcessVariable}
     */
    @AliasFor(annotation = ExternalTaskSubscription.class)
    ExternalTaskSubscription.ProcessVariable[] processVariables()
            default {@ExternalTaskSubscription.ProcessVariable(name = STRING_NULL_VALUE, value = STRING_NULL_VALUE)};

    /**
     * @return Filter for external tasks without tenant
     */
    @AliasFor(annotation = ExternalTaskSubscription.class)
    boolean withoutTenantId() default false;

    /**
     * @return tenantIds to filter for external tasks that are supposed to be fetched and locked
     */
    @AliasFor(annotation = ExternalTaskSubscription.class)
    String[] tenantIdIn() default {STRING_NULL_VALUE};

    /**
     * @return includeExtensionProperties
     * whether or not to include custom extension properties for fetched
     * external tasks. <code>true</code> means all extensionProperties
     * defined in the external task activity will be provided.
     * <code>false</code> means custom extension properties are not
     * available within the external-task-client. The default is
     * <code>false</code>.
     */
    @AliasFor(annotation = ExternalTaskSubscription.class)
    boolean includeExtensionProperties() default false;

    /**
     * @return changeIncidentToBpmnError
     * whether incident change into bpmnError after retry times passed
     * this option work for repeatable exceptions
     */
    boolean changeIncidentToBpmnError() default false;
}