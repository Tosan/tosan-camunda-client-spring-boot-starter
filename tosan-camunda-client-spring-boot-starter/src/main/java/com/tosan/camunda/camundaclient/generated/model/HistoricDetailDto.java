package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;

/**
 * HistoricDetailDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class HistoricDetailDto   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("processDefinitionKey")
  private String processDefinitionKey = null;

  @JsonProperty("processDefinitionId")
  private String processDefinitionId = null;

  @JsonProperty("processInstanceId")
  private String processInstanceId = null;

  @JsonProperty("activityInstanceId")
  private String activityInstanceId = null;

  @JsonProperty("executionId")
  private String executionId = null;

  @JsonProperty("caseDefinitionKey")
  private String caseDefinitionKey = null;

  @JsonProperty("caseDefinitionId")
  private String caseDefinitionId = null;

  @JsonProperty("caseInstanceId")
  private String caseInstanceId = null;

  @JsonProperty("caseExecutionId")
  private String caseExecutionId = null;

  @JsonProperty("taskId")
  private String taskId = null;

  @JsonProperty("tenantId")
  private String tenantId = null;

  @JsonProperty("userOperationId")
  private String userOperationId = null;

  @JsonProperty("time")
  private OffsetDateTime time = null;

  @JsonProperty("removalTime")
  private OffsetDateTime removalTime = null;

  @JsonProperty("rootProcessInstanceId")
  private String rootProcessInstanceId = null;

  @JsonProperty("fieldId")
  private String fieldId = null;

  @JsonProperty("fieldValue")
  private Object fieldValue = null;

  @JsonProperty("variableName")
  private String variableName = null;

  @JsonProperty("variableInstanceId")
  private String variableInstanceId = null;

  @JsonProperty("variableType")
  private String variableType = null;

  @JsonProperty("value")
  private Object value = null;

  @JsonProperty("valueInfo")
  @Valid
  private Map<String, Object> valueInfo = null;

  @JsonProperty("initial")
  private Boolean initial = null;

  @JsonProperty("revision")
  private Integer revision = null;

  @JsonProperty("errorMessage")
  private String errorMessage = null;

  public HistoricDetailDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the historic detail.
   * @return id
   **/
  @Schema(description = "The id of the historic detail.")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public HistoricDetailDto type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the historic detail. Either `formField` for a submitted form field value or `variableUpdate` for variable updates.
   * @return type
   **/
  @Schema(description = "The type of the historic detail. Either `formField` for a submitted form field value or `variableUpdate` for variable updates.")
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public HistoricDetailDto processDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
    return this;
  }

  /**
   * The key of the process definition that this historic detail belongs to.
   * @return processDefinitionKey
   **/
  @Schema(description = "The key of the process definition that this historic detail belongs to.")
  
    public String getProcessDefinitionKey() {
    return processDefinitionKey;
  }

  public void setProcessDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
  }

  public HistoricDetailDto processDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
    return this;
  }

  /**
   * The id of the process definition that this historic detail belongs to.
   * @return processDefinitionId
   **/
  @Schema(description = "The id of the process definition that this historic detail belongs to.")
  
    public String getProcessDefinitionId() {
    return processDefinitionId;
  }

  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }

  public HistoricDetailDto processInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
    return this;
  }

  /**
   * The id of the process instance the historic detail belongs to.
   * @return processInstanceId
   **/
  @Schema(description = "The id of the process instance the historic detail belongs to.")
  
    public String getProcessInstanceId() {
    return processInstanceId;
  }

  public void setProcessInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
  }

  public HistoricDetailDto activityInstanceId(String activityInstanceId) {
    this.activityInstanceId = activityInstanceId;
    return this;
  }

  /**
   * The id of the activity instance the historic detail belongs to.
   * @return activityInstanceId
   **/
  @Schema(description = "The id of the activity instance the historic detail belongs to.")
  
    public String getActivityInstanceId() {
    return activityInstanceId;
  }

  public void setActivityInstanceId(String activityInstanceId) {
    this.activityInstanceId = activityInstanceId;
  }

  public HistoricDetailDto executionId(String executionId) {
    this.executionId = executionId;
    return this;
  }

  /**
   * The id of the execution the historic detail belongs to.
   * @return executionId
   **/
  @Schema(description = "The id of the execution the historic detail belongs to.")
  
    public String getExecutionId() {
    return executionId;
  }

  public void setExecutionId(String executionId) {
    this.executionId = executionId;
  }

  public HistoricDetailDto caseDefinitionKey(String caseDefinitionKey) {
    this.caseDefinitionKey = caseDefinitionKey;
    return this;
  }

  /**
   * The key of the case definition that this historic detail belongs to.
   * @return caseDefinitionKey
   **/
  @Schema(description = "The key of the case definition that this historic detail belongs to.")
  
    public String getCaseDefinitionKey() {
    return caseDefinitionKey;
  }

  public void setCaseDefinitionKey(String caseDefinitionKey) {
    this.caseDefinitionKey = caseDefinitionKey;
  }

  public HistoricDetailDto caseDefinitionId(String caseDefinitionId) {
    this.caseDefinitionId = caseDefinitionId;
    return this;
  }

  /**
   * The id of the case definition that this historic detail belongs to.
   * @return caseDefinitionId
   **/
  @Schema(description = "The id of the case definition that this historic detail belongs to.")
  
    public String getCaseDefinitionId() {
    return caseDefinitionId;
  }

  public void setCaseDefinitionId(String caseDefinitionId) {
    this.caseDefinitionId = caseDefinitionId;
  }

  public HistoricDetailDto caseInstanceId(String caseInstanceId) {
    this.caseInstanceId = caseInstanceId;
    return this;
  }

  /**
   * The id of the case instance the historic detail belongs to.
   * @return caseInstanceId
   **/
  @Schema(description = "The id of the case instance the historic detail belongs to.")
  
    public String getCaseInstanceId() {
    return caseInstanceId;
  }

  public void setCaseInstanceId(String caseInstanceId) {
    this.caseInstanceId = caseInstanceId;
  }

  public HistoricDetailDto caseExecutionId(String caseExecutionId) {
    this.caseExecutionId = caseExecutionId;
    return this;
  }

  /**
   * The id of the case execution the historic detail belongs to.
   * @return caseExecutionId
   **/
  @Schema(description = "The id of the case execution the historic detail belongs to.")
  
    public String getCaseExecutionId() {
    return caseExecutionId;
  }

  public void setCaseExecutionId(String caseExecutionId) {
    this.caseExecutionId = caseExecutionId;
  }

  public HistoricDetailDto taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

  /**
   * The id of the task the historic detail belongs to.
   * @return taskId
   **/
  @Schema(description = "The id of the task the historic detail belongs to.")
  
    public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  public HistoricDetailDto tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * The id of the tenant that this historic detail belongs to.
   * @return tenantId
   **/
  @Schema(description = "The id of the tenant that this historic detail belongs to.")
  
    public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public HistoricDetailDto userOperationId(String userOperationId) {
    this.userOperationId = userOperationId;
    return this;
  }

  /**
   * The id of user operation which links historic detail with [user operation log](https://docs.camunda.org/manual/7.17/reference/rest/history/user-operation-log/) entries.
   * @return userOperationId
   **/
  @Schema(description = "The id of user operation which links historic detail with [user operation log](https://docs.camunda.org/manual/7.17/reference/rest/history/user-operation-log/) entries.")
  
    public String getUserOperationId() {
    return userOperationId;
  }

  public void setUserOperationId(String userOperationId) {
    this.userOperationId = userOperationId;
  }

  public HistoricDetailDto time(OffsetDateTime time) {
    this.time = time;
    return this;
  }

  /**
   * The time when this historic detail occurred. Default [format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.
   * @return time
   **/
  @Schema(description = "The time when this historic detail occurred. Default [format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.")
  
    @Valid
    public OffsetDateTime getTime() {
    return time;
  }

  public void setTime(OffsetDateTime time) {
    this.time = time;
  }

  public HistoricDetailDto removalTime(OffsetDateTime removalTime) {
    this.removalTime = removalTime;
    return this;
  }

  /**
   * The time after which the historic detail should be removed by the History Cleanup job. Default [format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.
   * @return removalTime
   **/
  @Schema(description = "The time after which the historic detail should be removed by the History Cleanup job. Default [format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.")
  
    @Valid
    public OffsetDateTime getRemovalTime() {
    return removalTime;
  }

  public void setRemovalTime(OffsetDateTime removalTime) {
    this.removalTime = removalTime;
  }

  public HistoricDetailDto rootProcessInstanceId(String rootProcessInstanceId) {
    this.rootProcessInstanceId = rootProcessInstanceId;
    return this;
  }

  /**
   * The process instance id of the root process instance that initiated the process containing this historic detail.
   * @return rootProcessInstanceId
   **/
  @Schema(description = "The process instance id of the root process instance that initiated the process containing this historic detail.")
  
    public String getRootProcessInstanceId() {
    return rootProcessInstanceId;
  }

  public void setRootProcessInstanceId(String rootProcessInstanceId) {
    this.rootProcessInstanceId = rootProcessInstanceId;
  }

  public HistoricDetailDto fieldId(String fieldId) {
    this.fieldId = fieldId;
    return this;
  }

  /**
   * The id of the form field.  **Note:** This property is only set for a `HistoricVariableUpdate` historic details. In these cases, the value of the `type` property is `formField`.
   * @return fieldId
   **/
  @Schema(description = "The id of the form field.  **Note:** This property is only set for a `HistoricVariableUpdate` historic details. In these cases, the value of the `type` property is `formField`.")
  
    public String getFieldId() {
    return fieldId;
  }

  public void setFieldId(String fieldId) {
    this.fieldId = fieldId;
  }

  public HistoricDetailDto fieldValue(Object fieldValue) {
    this.fieldValue = fieldValue;
    return this;
  }

  /**
   * The submitted form field value. The value differs depending on the form field's type and on the `deserializeValue` parameter.  **Note:** This property is only set for a `HistoricVariableUpdate` historic details. In these cases, the value of the `type` property is `formField`.
   * @return fieldValue
   **/
  @Schema(description = "The submitted form field value. The value differs depending on the form field's type and on the `deserializeValue` parameter.  **Note:** This property is only set for a `HistoricVariableUpdate` historic details. In these cases, the value of the `type` property is `formField`.")
  
    public Object getFieldValue() {
    return fieldValue;
  }

  public void setFieldValue(Object fieldValue) {
    this.fieldValue = fieldValue;
  }

  public HistoricDetailDto variableName(String variableName) {
    this.variableName = variableName;
    return this;
  }

  /**
   * The name of the variable which has been updated.  **Note:** This property is only set for a `HistoricVariableUpdate` historic details. In these cases, the value of the `type` property is `variableUpdate`.
   * @return variableName
   **/
  @Schema(description = "The name of the variable which has been updated.  **Note:** This property is only set for a `HistoricVariableUpdate` historic details. In these cases, the value of the `type` property is `variableUpdate`.")
  
    public String getVariableName() {
    return variableName;
  }

  public void setVariableName(String variableName) {
    this.variableName = variableName;
  }

  public HistoricDetailDto variableInstanceId(String variableInstanceId) {
    this.variableInstanceId = variableInstanceId;
    return this;
  }

  /**
   * The id of the associated variable instance.  **Note:** This property is only set for a `HistoricVariableUpdate` historic details. In these cases, the value of the `type` property is `variableUpdate`.
   * @return variableInstanceId
   **/
  @Schema(description = "The id of the associated variable instance.  **Note:** This property is only set for a `HistoricVariableUpdate` historic details. In these cases, the value of the `type` property is `variableUpdate`.")
  
    public String getVariableInstanceId() {
    return variableInstanceId;
  }

  public void setVariableInstanceId(String variableInstanceId) {
    this.variableInstanceId = variableInstanceId;
  }

  public HistoricDetailDto variableType(String variableType) {
    this.variableType = variableType;
    return this;
  }

  /**
   * The value type of the variable.  **Note:** This property is only set for a `HistoricVariableUpdate` historic details. In these cases, the value of the `type` property is `variableUpdate`.
   * @return variableType
   **/
  @Schema(description = "The value type of the variable.  **Note:** This property is only set for a `HistoricVariableUpdate` historic details. In these cases, the value of the `type` property is `variableUpdate`.")
  
    public String getVariableType() {
    return variableType;
  }

  public void setVariableType(String variableType) {
    this.variableType = variableType;
  }

  public HistoricDetailDto value(Object value) {
    this.value = value;
    return this;
  }

  /**
   * The variable's value. Value differs depending on the variable's type and on the deserializeValues parameter.  **Note:** This property is only set for a `HistoricVariableUpdate` historic details. In these cases, the value of the `type` property is `variableUpdate`.
   * @return value
   **/
  @Schema(description = "The variable's value. Value differs depending on the variable's type and on the deserializeValues parameter.  **Note:** This property is only set for a `HistoricVariableUpdate` historic details. In these cases, the value of the `type` property is `variableUpdate`.")
  
    public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }

  public HistoricDetailDto valueInfo(Map<String, Object> valueInfo) {
    this.valueInfo = valueInfo;
    return this;
  }

  public HistoricDetailDto putValueInfoItem(String key, Object valueInfoItem) {
    if (this.valueInfo == null) {
      this.valueInfo = new HashMap<>();
    }
    this.valueInfo.put(key, valueInfoItem);
    return this;
  }

  /**
   * A JSON object containing additional, value-type-dependent properties. For variables of type `Object`, the following properties are returned:  * `objectTypeName`: A string representation of the object's type name. * `serializationDataFormat`: The serialization format used to store the variable.  **Note:** This property is only set for a `HistoricVariableUpdate` historic details. In these cases, the value of the `type` property is `variableUpdate`.
   * @return valueInfo
   **/
  @Schema(description = "A JSON object containing additional, value-type-dependent properties. For variables of type `Object`, the following properties are returned:  * `objectTypeName`: A string representation of the object's type name. * `serializationDataFormat`: The serialization format used to store the variable.  **Note:** This property is only set for a `HistoricVariableUpdate` historic details. In these cases, the value of the `type` property is `variableUpdate`.")
  
    public Map<String, Object> getValueInfo() {
    return valueInfo;
  }

  public void setValueInfo(Map<String, Object> valueInfo) {
    this.valueInfo = valueInfo;
  }

  public HistoricDetailDto initial(Boolean initial) {
    this.initial = initial;
    return this;
  }

  /**
   * Returns `true` for variable updates that contains the initial values of the variables.  **Note:** This property is only set for a `HistoricVariableUpdate` historic details. In these cases, the value of the `type` property is `variableUpdate`.
   * @return initial
   **/
  @Schema(description = "Returns `true` for variable updates that contains the initial values of the variables.  **Note:** This property is only set for a `HistoricVariableUpdate` historic details. In these cases, the value of the `type` property is `variableUpdate`.")
  
    public Boolean isInitial() {
    return initial;
  }

  public void setInitial(Boolean initial) {
    this.initial = initial;
  }

  public HistoricDetailDto revision(Integer revision) {
    this.revision = revision;
    return this;
  }

  /**
   * The revision of the historic variable update.  **Note:** This property is only set for a `HistoricVariableUpdate` historic details. In these cases, the value of the `type` property is `variableUpdate`.
   * @return revision
   **/
  @Schema(description = "The revision of the historic variable update.  **Note:** This property is only set for a `HistoricVariableUpdate` historic details. In these cases, the value of the `type` property is `variableUpdate`.")
  
    public Integer getRevision() {
    return revision;
  }

  public void setRevision(Integer revision) {
    this.revision = revision;
  }

  public HistoricDetailDto errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * An error message in case a Java Serialized Object could not be de-serialized.  **Note:** This property is only set for a `HistoricVariableUpdate` historic details. In these cases, the value of the `type` property is `variableUpdate`.
   * @return errorMessage
   **/
  @Schema(description = "An error message in case a Java Serialized Object could not be de-serialized.  **Note:** This property is only set for a `HistoricVariableUpdate` historic details. In these cases, the value of the `type` property is `variableUpdate`.")
  
    public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricDetailDto historicDetailDto = (HistoricDetailDto) o;
    return Objects.equals(this.id, historicDetailDto.id) &&
        Objects.equals(this.type, historicDetailDto.type) &&
        Objects.equals(this.processDefinitionKey, historicDetailDto.processDefinitionKey) &&
        Objects.equals(this.processDefinitionId, historicDetailDto.processDefinitionId) &&
        Objects.equals(this.processInstanceId, historicDetailDto.processInstanceId) &&
        Objects.equals(this.activityInstanceId, historicDetailDto.activityInstanceId) &&
        Objects.equals(this.executionId, historicDetailDto.executionId) &&
        Objects.equals(this.caseDefinitionKey, historicDetailDto.caseDefinitionKey) &&
        Objects.equals(this.caseDefinitionId, historicDetailDto.caseDefinitionId) &&
        Objects.equals(this.caseInstanceId, historicDetailDto.caseInstanceId) &&
        Objects.equals(this.caseExecutionId, historicDetailDto.caseExecutionId) &&
        Objects.equals(this.taskId, historicDetailDto.taskId) &&
        Objects.equals(this.tenantId, historicDetailDto.tenantId) &&
        Objects.equals(this.userOperationId, historicDetailDto.userOperationId) &&
        Objects.equals(this.time, historicDetailDto.time) &&
        Objects.equals(this.removalTime, historicDetailDto.removalTime) &&
        Objects.equals(this.rootProcessInstanceId, historicDetailDto.rootProcessInstanceId) &&
        Objects.equals(this.fieldId, historicDetailDto.fieldId) &&
        Objects.equals(this.fieldValue, historicDetailDto.fieldValue) &&
        Objects.equals(this.variableName, historicDetailDto.variableName) &&
        Objects.equals(this.variableInstanceId, historicDetailDto.variableInstanceId) &&
        Objects.equals(this.variableType, historicDetailDto.variableType) &&
        Objects.equals(this.value, historicDetailDto.value) &&
        Objects.equals(this.valueInfo, historicDetailDto.valueInfo) &&
        Objects.equals(this.initial, historicDetailDto.initial) &&
        Objects.equals(this.revision, historicDetailDto.revision) &&
        Objects.equals(this.errorMessage, historicDetailDto.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, processDefinitionKey, processDefinitionId, processInstanceId, activityInstanceId, executionId, caseDefinitionKey, caseDefinitionId, caseInstanceId, caseExecutionId, taskId, tenantId, userOperationId, time, removalTime, rootProcessInstanceId, fieldId, fieldValue, variableName, variableInstanceId, variableType, value, valueInfo, initial, revision, errorMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricDetailDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    activityInstanceId: ").append(toIndentedString(activityInstanceId)).append("\n");
    sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
    sb.append("    caseDefinitionKey: ").append(toIndentedString(caseDefinitionKey)).append("\n");
    sb.append("    caseDefinitionId: ").append(toIndentedString(caseDefinitionId)).append("\n");
    sb.append("    caseInstanceId: ").append(toIndentedString(caseInstanceId)).append("\n");
    sb.append("    caseExecutionId: ").append(toIndentedString(caseExecutionId)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    userOperationId: ").append(toIndentedString(userOperationId)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    removalTime: ").append(toIndentedString(removalTime)).append("\n");
    sb.append("    rootProcessInstanceId: ").append(toIndentedString(rootProcessInstanceId)).append("\n");
    sb.append("    fieldId: ").append(toIndentedString(fieldId)).append("\n");
    sb.append("    fieldValue: ").append(toIndentedString(fieldValue)).append("\n");
    sb.append("    variableName: ").append(toIndentedString(variableName)).append("\n");
    sb.append("    variableInstanceId: ").append(toIndentedString(variableInstanceId)).append("\n");
    sb.append("    variableType: ").append(toIndentedString(variableType)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueInfo: ").append(toIndentedString(valueInfo)).append("\n");
    sb.append("    initial: ").append(toIndentedString(initial)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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
