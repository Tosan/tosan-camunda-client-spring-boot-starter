package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;

/**
 * HistoricActivityInstanceDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class HistoricActivityInstanceDto   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("parentActivityInstanceId")
  private String parentActivityInstanceId = null;

  @JsonProperty("activityId")
  private String activityId = null;

  @JsonProperty("activityName")
  private String activityName = null;

  @JsonProperty("activityType")
  private String activityType = null;

  @JsonProperty("processDefinitionKey")
  private String processDefinitionKey = null;

  @JsonProperty("processDefinitionId")
  private String processDefinitionId = null;

  @JsonProperty("processInstanceId")
  private String processInstanceId = null;

  @JsonProperty("executionId")
  private String executionId = null;

  @JsonProperty("taskId")
  private String taskId = null;

  @JsonProperty("assignee")
  private String assignee = null;

  @JsonProperty("calledProcessInstanceId")
  private String calledProcessInstanceId = null;

  @JsonProperty("calledCaseInstanceId")
  private String calledCaseInstanceId = null;

  @JsonProperty("startTime")
  private OffsetDateTime startTime = null;

  @JsonProperty("endTime")
  private OffsetDateTime endTime = null;

  @JsonProperty("durationInMillis")
  private Long durationInMillis = null;

  @JsonProperty("canceled")
  private Boolean canceled = null;

  @JsonProperty("completeScope")
  private Boolean completeScope = null;

  @JsonProperty("tenantId")
  private String tenantId = null;

  @JsonProperty("removalTime")
  private OffsetDateTime removalTime = null;

  @JsonProperty("rootProcessInstanceId")
  private String rootProcessInstanceId = null;

  public HistoricActivityInstanceDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the activity instance.
   * @return id
   **/
  @Schema(description = "The id of the activity instance.")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public HistoricActivityInstanceDto parentActivityInstanceId(String parentActivityInstanceId) {
    this.parentActivityInstanceId = parentActivityInstanceId;
    return this;
  }

  /**
   * The id of the parent activity instance, for example a sub process instance.
   * @return parentActivityInstanceId
   **/
  @Schema(description = "The id of the parent activity instance, for example a sub process instance.")
  
    public String getParentActivityInstanceId() {
    return parentActivityInstanceId;
  }

  public void setParentActivityInstanceId(String parentActivityInstanceId) {
    this.parentActivityInstanceId = parentActivityInstanceId;
  }

  public HistoricActivityInstanceDto activityId(String activityId) {
    this.activityId = activityId;
    return this;
  }

  /**
   * The id of the activity that this object is an instance of.
   * @return activityId
   **/
  @Schema(description = "The id of the activity that this object is an instance of.")
  
    public String getActivityId() {
    return activityId;
  }

  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }

  public HistoricActivityInstanceDto activityName(String activityName) {
    this.activityName = activityName;
    return this;
  }

  /**
   * The name of the activity that this object is an instance of.
   * @return activityName
   **/
  @Schema(description = "The name of the activity that this object is an instance of.")
  
    public String getActivityName() {
    return activityName;
  }

  public void setActivityName(String activityName) {
    this.activityName = activityName;
  }

  public HistoricActivityInstanceDto activityType(String activityType) {
    this.activityType = activityType;
    return this;
  }

  /**
   * The type of the activity that this object is an instance of.
   * @return activityType
   **/
  @Schema(description = "The type of the activity that this object is an instance of.")
  
    public String getActivityType() {
    return activityType;
  }

  public void setActivityType(String activityType) {
    this.activityType = activityType;
  }

  public HistoricActivityInstanceDto processDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
    return this;
  }

  /**
   * The key of the process definition that this activity instance belongs to.
   * @return processDefinitionKey
   **/
  @Schema(description = "The key of the process definition that this activity instance belongs to.")
  
    public String getProcessDefinitionKey() {
    return processDefinitionKey;
  }

  public void setProcessDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
  }

  public HistoricActivityInstanceDto processDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
    return this;
  }

  /**
   * The id of the process definition that this activity instance belongs to.
   * @return processDefinitionId
   **/
  @Schema(description = "The id of the process definition that this activity instance belongs to.")
  
    public String getProcessDefinitionId() {
    return processDefinitionId;
  }

  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }

  public HistoricActivityInstanceDto processInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
    return this;
  }

  /**
   * The id of the process instance that this activity instance belongs to.
   * @return processInstanceId
   **/
  @Schema(description = "The id of the process instance that this activity instance belongs to.")
  
    public String getProcessInstanceId() {
    return processInstanceId;
  }

  public void setProcessInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
  }

  public HistoricActivityInstanceDto executionId(String executionId) {
    this.executionId = executionId;
    return this;
  }

  /**
   * The id of the execution that executed this activity instance.
   * @return executionId
   **/
  @Schema(description = "The id of the execution that executed this activity instance.")
  
    public String getExecutionId() {
    return executionId;
  }

  public void setExecutionId(String executionId) {
    this.executionId = executionId;
  }

  public HistoricActivityInstanceDto taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

  /**
   * The id of the task that is associated to this activity instance. Is only set if the activity is a user task.
   * @return taskId
   **/
  @Schema(description = "The id of the task that is associated to this activity instance. Is only set if the activity is a user task.")
  
    public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  public HistoricActivityInstanceDto assignee(String assignee) {
    this.assignee = assignee;
    return this;
  }

  /**
   * The assignee of the task that is associated to this activity instance. Is only set if the activity is a user task.
   * @return assignee
   **/
  @Schema(description = "The assignee of the task that is associated to this activity instance. Is only set if the activity is a user task.")
  
    public String getAssignee() {
    return assignee;
  }

  public void setAssignee(String assignee) {
    this.assignee = assignee;
  }

  public HistoricActivityInstanceDto calledProcessInstanceId(String calledProcessInstanceId) {
    this.calledProcessInstanceId = calledProcessInstanceId;
    return this;
  }

  /**
   * The id of the called process instance. Is only set if the activity is a call activity and the called instance a process instance.
   * @return calledProcessInstanceId
   **/
  @Schema(description = "The id of the called process instance. Is only set if the activity is a call activity and the called instance a process instance.")
  
    public String getCalledProcessInstanceId() {
    return calledProcessInstanceId;
  }

  public void setCalledProcessInstanceId(String calledProcessInstanceId) {
    this.calledProcessInstanceId = calledProcessInstanceId;
  }

  public HistoricActivityInstanceDto calledCaseInstanceId(String calledCaseInstanceId) {
    this.calledCaseInstanceId = calledCaseInstanceId;
    return this;
  }

  /**
   * The id of the called case instance. Is only set if the activity is a call activity and the called instance a case instance.
   * @return calledCaseInstanceId
   **/
  @Schema(description = "The id of the called case instance. Is only set if the activity is a call activity and the called instance a case instance.")
  
    public String getCalledCaseInstanceId() {
    return calledCaseInstanceId;
  }

  public void setCalledCaseInstanceId(String calledCaseInstanceId) {
    this.calledCaseInstanceId = calledCaseInstanceId;
  }

  public HistoricActivityInstanceDto startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * The time the instance was started. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.
   * @return startTime
   **/
  @Schema(description = "The time the instance was started. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.")
  
    @Valid
    public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  public HistoricActivityInstanceDto endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * The time the instance ended. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.
   * @return endTime
   **/
  @Schema(description = "The time the instance ended. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.")
  
    @Valid
    public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }

  public HistoricActivityInstanceDto durationInMillis(Long durationInMillis) {
    this.durationInMillis = durationInMillis;
    return this;
  }

  /**
   * The time the instance took to finish (in milliseconds).
   * @return durationInMillis
   **/
  @Schema(description = "The time the instance took to finish (in milliseconds).")
  
    public Long getDurationInMillis() {
    return durationInMillis;
  }

  public void setDurationInMillis(Long durationInMillis) {
    this.durationInMillis = durationInMillis;
  }

  public HistoricActivityInstanceDto canceled(Boolean canceled) {
    this.canceled = canceled;
    return this;
  }

  /**
   * If `true`, this activity instance is canceled.
   * @return canceled
   **/
  @Schema(description = "If `true`, this activity instance is canceled.")
  
    public Boolean isCanceled() {
    return canceled;
  }

  public void setCanceled(Boolean canceled) {
    this.canceled = canceled;
  }

  public HistoricActivityInstanceDto completeScope(Boolean completeScope) {
    this.completeScope = completeScope;
    return this;
  }

  /**
   * If `true`, this activity instance did complete a BPMN 2.0 scope.
   * @return completeScope
   **/
  @Schema(description = "If `true`, this activity instance did complete a BPMN 2.0 scope.")
  
    public Boolean isCompleteScope() {
    return completeScope;
  }

  public void setCompleteScope(Boolean completeScope) {
    this.completeScope = completeScope;
  }

  public HistoricActivityInstanceDto tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * The tenant id of the activity instance.
   * @return tenantId
   **/
  @Schema(description = "The tenant id of the activity instance.")
  
    public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public HistoricActivityInstanceDto removalTime(OffsetDateTime removalTime) {
    this.removalTime = removalTime;
    return this;
  }

  /**
   * The time after which the activity instance should be removed by the History Cleanup job. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.
   * @return removalTime
   **/
  @Schema(description = "The time after which the activity instance should be removed by the History Cleanup job. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.")
  
    @Valid
    public OffsetDateTime getRemovalTime() {
    return removalTime;
  }

  public void setRemovalTime(OffsetDateTime removalTime) {
    this.removalTime = removalTime;
  }

  public HistoricActivityInstanceDto rootProcessInstanceId(String rootProcessInstanceId) {
    this.rootProcessInstanceId = rootProcessInstanceId;
    return this;
  }

  /**
   * The process instance id of the root process instance that initiated the process containing this activity instance.
   * @return rootProcessInstanceId
   **/
  @Schema(description = "The process instance id of the root process instance that initiated the process containing this activity instance.")
  
    public String getRootProcessInstanceId() {
    return rootProcessInstanceId;
  }

  public void setRootProcessInstanceId(String rootProcessInstanceId) {
    this.rootProcessInstanceId = rootProcessInstanceId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricActivityInstanceDto historicActivityInstanceDto = (HistoricActivityInstanceDto) o;
    return Objects.equals(this.id, historicActivityInstanceDto.id) &&
        Objects.equals(this.parentActivityInstanceId, historicActivityInstanceDto.parentActivityInstanceId) &&
        Objects.equals(this.activityId, historicActivityInstanceDto.activityId) &&
        Objects.equals(this.activityName, historicActivityInstanceDto.activityName) &&
        Objects.equals(this.activityType, historicActivityInstanceDto.activityType) &&
        Objects.equals(this.processDefinitionKey, historicActivityInstanceDto.processDefinitionKey) &&
        Objects.equals(this.processDefinitionId, historicActivityInstanceDto.processDefinitionId) &&
        Objects.equals(this.processInstanceId, historicActivityInstanceDto.processInstanceId) &&
        Objects.equals(this.executionId, historicActivityInstanceDto.executionId) &&
        Objects.equals(this.taskId, historicActivityInstanceDto.taskId) &&
        Objects.equals(this.assignee, historicActivityInstanceDto.assignee) &&
        Objects.equals(this.calledProcessInstanceId, historicActivityInstanceDto.calledProcessInstanceId) &&
        Objects.equals(this.calledCaseInstanceId, historicActivityInstanceDto.calledCaseInstanceId) &&
        Objects.equals(this.startTime, historicActivityInstanceDto.startTime) &&
        Objects.equals(this.endTime, historicActivityInstanceDto.endTime) &&
        Objects.equals(this.durationInMillis, historicActivityInstanceDto.durationInMillis) &&
        Objects.equals(this.canceled, historicActivityInstanceDto.canceled) &&
        Objects.equals(this.completeScope, historicActivityInstanceDto.completeScope) &&
        Objects.equals(this.tenantId, historicActivityInstanceDto.tenantId) &&
        Objects.equals(this.removalTime, historicActivityInstanceDto.removalTime) &&
        Objects.equals(this.rootProcessInstanceId, historicActivityInstanceDto.rootProcessInstanceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parentActivityInstanceId, activityId, activityName, activityType, processDefinitionKey, processDefinitionId, processInstanceId, executionId, taskId, assignee, calledProcessInstanceId, calledCaseInstanceId, startTime, endTime, durationInMillis, canceled, completeScope, tenantId, removalTime, rootProcessInstanceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricActivityInstanceDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentActivityInstanceId: ").append(toIndentedString(parentActivityInstanceId)).append("\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    activityName: ").append(toIndentedString(activityName)).append("\n");
    sb.append("    activityType: ").append(toIndentedString(activityType)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    calledProcessInstanceId: ").append(toIndentedString(calledProcessInstanceId)).append("\n");
    sb.append("    calledCaseInstanceId: ").append(toIndentedString(calledCaseInstanceId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    durationInMillis: ").append(toIndentedString(durationInMillis)).append("\n");
    sb.append("    canceled: ").append(toIndentedString(canceled)).append("\n");
    sb.append("    completeScope: ").append(toIndentedString(completeScope)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    removalTime: ").append(toIndentedString(removalTime)).append("\n");
    sb.append("    rootProcessInstanceId: ").append(toIndentedString(rootProcessInstanceId)).append("\n");
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
