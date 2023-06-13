package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tosan.camunda.camundaclient.generated.model.VariableValueDto;
import java.util.HashMap;
import java.util.Map;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CorrelationMessageDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class CorrelationMessageDto {

  private String messageName = null;

  private String businessKey = null;

  private String tenantId = null;

  private Boolean withoutTenantId = null;

  private String processInstanceId = null;

  @Valid
  private Map<String, VariableValueDto> correlationKeys;

  @Valid
  private Map<String, VariableValueDto> localCorrelationKeys;

  @Valid
  private Map<String, VariableValueDto> processVariables;

  @Valid
  private Map<String, VariableValueDto> processVariablesLocal;

  private Boolean all = null;

  private Boolean resultEnabled = null;

  private Boolean variablesInResultEnabled = null;

  public CorrelationMessageDto messageName(String messageName) {
    this.messageName = messageName;
    return this;
  }

  /**
   * The name of the message to deliver.
   * @return messageName
  */
  
  @Schema(name = "messageName", description = "The name of the message to deliver.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("messageName")
  public String getMessageName() {
    return messageName;
  }

  public void setMessageName(String messageName) {
    this.messageName = messageName;
  }

  public CorrelationMessageDto businessKey(String businessKey) {
    this.businessKey = businessKey;
    return this;
  }

  /**
   * Used for correlation of process instances that wait for incoming messages. Will only correlate to executions that belong to a process instance with the provided business key.
   * @return businessKey
  */
  
  @Schema(name = "businessKey", description = "Used for correlation of process instances that wait for incoming messages. Will only correlate to executions that belong to a process instance with the provided business key.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("businessKey")
  public String getBusinessKey() {
    return businessKey;
  }

  public void setBusinessKey(String businessKey) {
    this.businessKey = businessKey;
  }

  public CorrelationMessageDto tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Used to correlate the message for a tenant with the given id. Will only correlate to executions and process definitions which belong to the tenant. Must not be supplied in conjunction with a `withoutTenantId`.
   * @return tenantId
  */
  
  @Schema(name = "tenantId", description = "Used to correlate the message for a tenant with the given id. Will only correlate to executions and process definitions which belong to the tenant. Must not be supplied in conjunction with a `withoutTenantId`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tenantId")
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public CorrelationMessageDto withoutTenantId(Boolean withoutTenantId) {
    this.withoutTenantId = withoutTenantId;
    return this;
  }

  /**
   * A Boolean value that indicates whether the message should only be correlated to executions and process definitions which belong to no tenant or not. Value may only be `true`, as `false` is the default behavior. Must not be supplied in conjunction with a `tenantId`.
   * @return withoutTenantId
  */
  
  @Schema(name = "withoutTenantId", description = "A Boolean value that indicates whether the message should only be correlated to executions and process definitions which belong to no tenant or not. Value may only be `true`, as `false` is the default behavior. Must not be supplied in conjunction with a `tenantId`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("withoutTenantId")
  public Boolean getWithoutTenantId() {
    return withoutTenantId;
  }

  public void setWithoutTenantId(Boolean withoutTenantId) {
    this.withoutTenantId = withoutTenantId;
  }

  public CorrelationMessageDto processInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
    return this;
  }

  /**
   * Used to correlate the message to the process instance with the given id.
   * @return processInstanceId
  */
  
  @Schema(name = "processInstanceId", description = "Used to correlate the message to the process instance with the given id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processInstanceId")
  public String getProcessInstanceId() {
    return processInstanceId;
  }

  public void setProcessInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
  }

  public CorrelationMessageDto correlationKeys(Map<String, VariableValueDto> correlationKeys) {
    this.correlationKeys = correlationKeys;
    return this;
  }

  public CorrelationMessageDto putCorrelationKeysItem(String key, VariableValueDto correlationKeysItem) {
    if (this.correlationKeys == null) {
      this.correlationKeys = new HashMap<>();
    }
    this.correlationKeys.put(key, correlationKeysItem);
    return this;
  }

  /**
   * Used for correlation of process instances that wait for incoming messages. Has to be a JSON object containing key-value pairs that are matched against process instance variables during correlation. Each key is a variable name and each value a JSON variable value object with the following properties.
   * @return correlationKeys
  */
  @Valid 
  @Schema(name = "correlationKeys", description = "Used for correlation of process instances that wait for incoming messages. Has to be a JSON object containing key-value pairs that are matched against process instance variables during correlation. Each key is a variable name and each value a JSON variable value object with the following properties.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("correlationKeys")
  public Map<String, VariableValueDto> getCorrelationKeys() {
    return correlationKeys;
  }

  public void setCorrelationKeys(Map<String, VariableValueDto> correlationKeys) {
    this.correlationKeys = correlationKeys;
  }

  public CorrelationMessageDto localCorrelationKeys(Map<String, VariableValueDto> localCorrelationKeys) {
    this.localCorrelationKeys = localCorrelationKeys;
    return this;
  }

  public CorrelationMessageDto putLocalCorrelationKeysItem(String key, VariableValueDto localCorrelationKeysItem) {
    if (this.localCorrelationKeys == null) {
      this.localCorrelationKeys = new HashMap<>();
    }
    this.localCorrelationKeys.put(key, localCorrelationKeysItem);
    return this;
  }

  /**
   * Local variables used for correlation of executions (process instances) that wait for incoming messages. Has to be a JSON object containing key-value pairs that are matched against local variables during correlation. Each key is a variable name and each value a JSON variable value object with the following properties.
   * @return localCorrelationKeys
  */
  @Valid 
  @Schema(name = "localCorrelationKeys", description = "Local variables used for correlation of executions (process instances) that wait for incoming messages. Has to be a JSON object containing key-value pairs that are matched against local variables during correlation. Each key is a variable name and each value a JSON variable value object with the following properties.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("localCorrelationKeys")
  public Map<String, VariableValueDto> getLocalCorrelationKeys() {
    return localCorrelationKeys;
  }

  public void setLocalCorrelationKeys(Map<String, VariableValueDto> localCorrelationKeys) {
    this.localCorrelationKeys = localCorrelationKeys;
  }

  public CorrelationMessageDto processVariables(Map<String, VariableValueDto> processVariables) {
    this.processVariables = processVariables;
    return this;
  }

  public CorrelationMessageDto putProcessVariablesItem(String key, VariableValueDto processVariablesItem) {
    if (this.processVariables == null) {
      this.processVariables = new HashMap<>();
    }
    this.processVariables.put(key, processVariablesItem);
    return this;
  }

  /**
   * A map of variables that is injected into the triggered execution or process instance after the message has been delivered. Each key is a variable name and each value a JSON variable value object with the following properties.
   * @return processVariables
  */
  @Valid 
  @Schema(name = "processVariables", description = "A map of variables that is injected into the triggered execution or process instance after the message has been delivered. Each key is a variable name and each value a JSON variable value object with the following properties.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processVariables")
  public Map<String, VariableValueDto> getProcessVariables() {
    return processVariables;
  }

  public void setProcessVariables(Map<String, VariableValueDto> processVariables) {
    this.processVariables = processVariables;
  }

  public CorrelationMessageDto processVariablesLocal(Map<String, VariableValueDto> processVariablesLocal) {
    this.processVariablesLocal = processVariablesLocal;
    return this;
  }

  public CorrelationMessageDto putProcessVariablesLocalItem(String key, VariableValueDto processVariablesLocalItem) {
    if (this.processVariablesLocal == null) {
      this.processVariablesLocal = new HashMap<>();
    }
    this.processVariablesLocal.put(key, processVariablesLocalItem);
    return this;
  }

  /**
   * A map of local variables that is injected into the triggered execution or process instance after the message has been delivered. Each key is a variable name and each value a JSON variable value object with the following properties.
   * @return processVariablesLocal
  */
  @Valid 
  @Schema(name = "processVariablesLocal", description = "A map of local variables that is injected into the triggered execution or process instance after the message has been delivered. Each key is a variable name and each value a JSON variable value object with the following properties.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processVariablesLocal")
  public Map<String, VariableValueDto> getProcessVariablesLocal() {
    return processVariablesLocal;
  }

  public void setProcessVariablesLocal(Map<String, VariableValueDto> processVariablesLocal) {
    this.processVariablesLocal = processVariablesLocal;
  }

  public CorrelationMessageDto all(Boolean all) {
    this.all = all;
    return this;
  }

  /**
   * A Boolean value that indicates whether the message should be correlated to exactly one entity or multiple entities. If the value is set to `false`, the message will be correlated to exactly one entity (execution or process definition). If the value is set to `true`, the message will be correlated to multiple executions and a process definition that can be instantiated by this message in one go.
   * @return all
  */
  
  @Schema(name = "all", description = "A Boolean value that indicates whether the message should be correlated to exactly one entity or multiple entities. If the value is set to `false`, the message will be correlated to exactly one entity (execution or process definition). If the value is set to `true`, the message will be correlated to multiple executions and a process definition that can be instantiated by this message in one go.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("all")
  public Boolean getAll() {
    return all;
  }

  public void setAll(Boolean all) {
    this.all = all;
  }

  public CorrelationMessageDto resultEnabled(Boolean resultEnabled) {
    this.resultEnabled = resultEnabled;
    return this;
  }

  /**
   * A Boolean value that indicates whether the result of the correlation should be returned or not. If this property is set to `true`, there will be returned a list of message correlation result objects. Depending on the all property, there will be either one ore more returned results in the list.  The default value is `false`, which means no result will be returned.
   * @return resultEnabled
  */
  
  @Schema(name = "resultEnabled", description = "A Boolean value that indicates whether the result of the correlation should be returned or not. If this property is set to `true`, there will be returned a list of message correlation result objects. Depending on the all property, there will be either one ore more returned results in the list.  The default value is `false`, which means no result will be returned.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resultEnabled")
  public Boolean getResultEnabled() {
    return resultEnabled;
  }

  public void setResultEnabled(Boolean resultEnabled) {
    this.resultEnabled = resultEnabled;
  }

  public CorrelationMessageDto variablesInResultEnabled(Boolean variablesInResultEnabled) {
    this.variablesInResultEnabled = variablesInResultEnabled;
    return this;
  }

  /**
   * A Boolean value that indicates whether the result of the correlation should contain process variables or not. The parameter resultEnabled should be set to `true` in order to use this it.  The default value is `false`, which means the variables will not be returned.
   * @return variablesInResultEnabled
  */
  
  @Schema(name = "variablesInResultEnabled", description = "A Boolean value that indicates whether the result of the correlation should contain process variables or not. The parameter resultEnabled should be set to `true` in order to use this it.  The default value is `false`, which means the variables will not be returned.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("variablesInResultEnabled")
  public Boolean getVariablesInResultEnabled() {
    return variablesInResultEnabled;
  }

  public void setVariablesInResultEnabled(Boolean variablesInResultEnabled) {
    this.variablesInResultEnabled = variablesInResultEnabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CorrelationMessageDto correlationMessageDto = (CorrelationMessageDto) o;
    return Objects.equals(this.messageName, correlationMessageDto.messageName) &&
        Objects.equals(this.businessKey, correlationMessageDto.businessKey) &&
        Objects.equals(this.tenantId, correlationMessageDto.tenantId) &&
        Objects.equals(this.withoutTenantId, correlationMessageDto.withoutTenantId) &&
        Objects.equals(this.processInstanceId, correlationMessageDto.processInstanceId) &&
        Objects.equals(this.correlationKeys, correlationMessageDto.correlationKeys) &&
        Objects.equals(this.localCorrelationKeys, correlationMessageDto.localCorrelationKeys) &&
        Objects.equals(this.processVariables, correlationMessageDto.processVariables) &&
        Objects.equals(this.processVariablesLocal, correlationMessageDto.processVariablesLocal) &&
        Objects.equals(this.all, correlationMessageDto.all) &&
        Objects.equals(this.resultEnabled, correlationMessageDto.resultEnabled) &&
        Objects.equals(this.variablesInResultEnabled, correlationMessageDto.variablesInResultEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageName, businessKey, tenantId, withoutTenantId, processInstanceId, correlationKeys, localCorrelationKeys, processVariables, processVariablesLocal, all, resultEnabled, variablesInResultEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorrelationMessageDto {\n");
    sb.append("    messageName: ").append(toIndentedString(messageName)).append("\n");
    sb.append("    businessKey: ").append(toIndentedString(businessKey)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    withoutTenantId: ").append(toIndentedString(withoutTenantId)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    correlationKeys: ").append(toIndentedString(correlationKeys)).append("\n");
    sb.append("    localCorrelationKeys: ").append(toIndentedString(localCorrelationKeys)).append("\n");
    sb.append("    processVariables: ").append(toIndentedString(processVariables)).append("\n");
    sb.append("    processVariablesLocal: ").append(toIndentedString(processVariablesLocal)).append("\n");
    sb.append("    all: ").append(toIndentedString(all)).append("\n");
    sb.append("    resultEnabled: ").append(toIndentedString(resultEnabled)).append("\n");
    sb.append("    variablesInResultEnabled: ").append(toIndentedString(variablesInResultEnabled)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

