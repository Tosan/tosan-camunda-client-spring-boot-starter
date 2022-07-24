package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * HistoricTaskInstanceDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class HistoricTaskInstanceDto   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("processDefinitionKey")
  private String processDefinitionKey = null;

  @JsonProperty("processDefinitionId")
  private String processDefinitionId = null;

  @JsonProperty("processInstanceId")
  private String processInstanceId = null;

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

  @JsonProperty("activityInstanceId")
  private String activityInstanceId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("deleteReason")
  private String deleteReason = null;

  @JsonProperty("owner")
  private String owner = null;

  @JsonProperty("assignee")
  private String assignee = null;

  @JsonProperty("startTime")
  private OffsetDateTime startTime = null;

  @JsonProperty("endTime")
  private OffsetDateTime endTime = null;

  @JsonProperty("duration")
  private Long duration = null;

  @JsonProperty("taskDefinitionKey")
  private String taskDefinitionKey = null;

  @JsonProperty("priority")
  private Integer priority = null;

  @JsonProperty("due")
  private OffsetDateTime due = null;

  @JsonProperty("parentTaskId")
  private String parentTaskId = null;

  @JsonProperty("followUp")
  private OffsetDateTime followUp = null;

  @JsonProperty("tenantId")
  private String tenantId = null;

  @JsonProperty("removalTime")
  private OffsetDateTime removalTime = null;

  @JsonProperty("rootProcessInstanceId")
  private String rootProcessInstanceId = null;

  public HistoricTaskInstanceDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The task id.
   * @return id
   **/
  @Schema(description = "The task id.")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public HistoricTaskInstanceDto processDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
    return this;
  }

  /**
   * The key of the process definition the task belongs to.
   * @return processDefinitionKey
   **/
  @Schema(description = "The key of the process definition the task belongs to.")
  
    public String getProcessDefinitionKey() {
    return processDefinitionKey;
  }

  public void setProcessDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
  }

  public HistoricTaskInstanceDto processDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
    return this;
  }

  /**
   * The id of the process definition the task belongs to.
   * @return processDefinitionId
   **/
  @Schema(description = "The id of the process definition the task belongs to.")
  
    public String getProcessDefinitionId() {
    return processDefinitionId;
  }

  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }

  public HistoricTaskInstanceDto processInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
    return this;
  }

  /**
   * The id of the process instance the task belongs to.
   * @return processInstanceId
   **/
  @Schema(description = "The id of the process instance the task belongs to.")
  
    public String getProcessInstanceId() {
    return processInstanceId;
  }

  public void setProcessInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
  }

  public HistoricTaskInstanceDto executionId(String executionId) {
    this.executionId = executionId;
    return this;
  }

  /**
   * The id of the execution the task belongs to.
   * @return executionId
   **/
  @Schema(description = "The id of the execution the task belongs to.")
  
    public String getExecutionId() {
    return executionId;
  }

  public void setExecutionId(String executionId) {
    this.executionId = executionId;
  }

  public HistoricTaskInstanceDto caseDefinitionKey(String caseDefinitionKey) {
    this.caseDefinitionKey = caseDefinitionKey;
    return this;
  }

  /**
   * The key of the case definition the task belongs to.
   * @return caseDefinitionKey
   **/
  @Schema(description = "The key of the case definition the task belongs to.")
  
    public String getCaseDefinitionKey() {
    return caseDefinitionKey;
  }

  public void setCaseDefinitionKey(String caseDefinitionKey) {
    this.caseDefinitionKey = caseDefinitionKey;
  }

  public HistoricTaskInstanceDto caseDefinitionId(String caseDefinitionId) {
    this.caseDefinitionId = caseDefinitionId;
    return this;
  }

  /**
   * The id of the case definition the task belongs to.
   * @return caseDefinitionId
   **/
  @Schema(description = "The id of the case definition the task belongs to.")
  
    public String getCaseDefinitionId() {
    return caseDefinitionId;
  }

  public void setCaseDefinitionId(String caseDefinitionId) {
    this.caseDefinitionId = caseDefinitionId;
  }

  public HistoricTaskInstanceDto caseInstanceId(String caseInstanceId) {
    this.caseInstanceId = caseInstanceId;
    return this;
  }

  /**
   * The id of the case instance the task belongs to.
   * @return caseInstanceId
   **/
  @Schema(description = "The id of the case instance the task belongs to.")
  
    public String getCaseInstanceId() {
    return caseInstanceId;
  }

  public void setCaseInstanceId(String caseInstanceId) {
    this.caseInstanceId = caseInstanceId;
  }

  public HistoricTaskInstanceDto caseExecutionId(String caseExecutionId) {
    this.caseExecutionId = caseExecutionId;
    return this;
  }

  /**
   * The id of the case execution the task belongs to.
   * @return caseExecutionId
   **/
  @Schema(description = "The id of the case execution the task belongs to.")
  
    public String getCaseExecutionId() {
    return caseExecutionId;
  }

  public void setCaseExecutionId(String caseExecutionId) {
    this.caseExecutionId = caseExecutionId;
  }

  public HistoricTaskInstanceDto activityInstanceId(String activityInstanceId) {
    this.activityInstanceId = activityInstanceId;
    return this;
  }

  /**
   * The id of the activity that this object is an instance of.
   * @return activityInstanceId
   **/
  @Schema(description = "The id of the activity that this object is an instance of.")
  
    public String getActivityInstanceId() {
    return activityInstanceId;
  }

  public void setActivityInstanceId(String activityInstanceId) {
    this.activityInstanceId = activityInstanceId;
  }

  public HistoricTaskInstanceDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The task name.
   * @return name
   **/
  @Schema(description = "The task name.")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public HistoricTaskInstanceDto description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The task's description.
   * @return description
   **/
  @Schema(description = "The task's description.")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public HistoricTaskInstanceDto deleteReason(String deleteReason) {
    this.deleteReason = deleteReason;
    return this;
  }

  /**
   * The task's delete reason.
   * @return deleteReason
   **/
  @Schema(description = "The task's delete reason.")
  
    public String getDeleteReason() {
    return deleteReason;
  }

  public void setDeleteReason(String deleteReason) {
    this.deleteReason = deleteReason;
  }

  public HistoricTaskInstanceDto owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * The owner's id.
   * @return owner
   **/
  @Schema(description = "The owner's id.")
  
    public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public HistoricTaskInstanceDto assignee(String assignee) {
    this.assignee = assignee;
    return this;
  }

  /**
   * The assignee's id.
   * @return assignee
   **/
  @Schema(description = "The assignee's id.")
  
    public String getAssignee() {
    return assignee;
  }

  public void setAssignee(String assignee) {
    this.assignee = assignee;
  }

  public HistoricTaskInstanceDto startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * The time the task was started. Default [format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.
   * @return startTime
   **/
  @Schema(description = "The time the task was started. Default [format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.")
  
    @Valid
    public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  public HistoricTaskInstanceDto endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * The time the task ended. Default [format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.
   * @return endTime
   **/
  @Schema(description = "The time the task ended. Default [format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.")
  
    @Valid
    public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }

  public HistoricTaskInstanceDto duration(Long duration) {
    this.duration = duration;
    return this;
  }

  /**
   * The time the task took to finish (in milliseconds).
   * @return duration
   **/
  @Schema(description = "The time the task took to finish (in milliseconds).")
  
    public Long getDuration() {
    return duration;
  }

  public void setDuration(Long duration) {
    this.duration = duration;
  }

  public HistoricTaskInstanceDto taskDefinitionKey(String taskDefinitionKey) {
    this.taskDefinitionKey = taskDefinitionKey;
    return this;
  }

  /**
   * The task's key.
   * @return taskDefinitionKey
   **/
  @Schema(description = "The task's key.")
  
    public String getTaskDefinitionKey() {
    return taskDefinitionKey;
  }

  public void setTaskDefinitionKey(String taskDefinitionKey) {
    this.taskDefinitionKey = taskDefinitionKey;
  }

  public HistoricTaskInstanceDto priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * The task's priority.
   * @return priority
   **/
  @Schema(description = "The task's priority.")
  
    public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public HistoricTaskInstanceDto due(OffsetDateTime due) {
    this.due = due;
    return this;
  }

  /**
   * The task's due date. Default [format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.
   * @return due
   **/
  @Schema(description = "The task's due date. Default [format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.")
  
    @Valid
    public OffsetDateTime getDue() {
    return due;
  }

  public void setDue(OffsetDateTime due) {
    this.due = due;
  }

  public HistoricTaskInstanceDto parentTaskId(String parentTaskId) {
    this.parentTaskId = parentTaskId;
    return this;
  }

  /**
   * The id of the parent task, if this task is a subtask.
   * @return parentTaskId
   **/
  @Schema(description = "The id of the parent task, if this task is a subtask.")
  
    public String getParentTaskId() {
    return parentTaskId;
  }

  public void setParentTaskId(String parentTaskId) {
    this.parentTaskId = parentTaskId;
  }

  public HistoricTaskInstanceDto followUp(OffsetDateTime followUp) {
    this.followUp = followUp;
    return this;
  }

  /**
   * The follow-up date for the task. Default [format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.
   * @return followUp
   **/
  @Schema(description = "The follow-up date for the task. Default [format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.")
  
    @Valid
    public OffsetDateTime getFollowUp() {
    return followUp;
  }

  public void setFollowUp(OffsetDateTime followUp) {
    this.followUp = followUp;
  }

  public HistoricTaskInstanceDto tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * The tenant id of the task instance.
   * @return tenantId
   **/
  @Schema(description = "The tenant id of the task instance.")
  
    public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public HistoricTaskInstanceDto removalTime(OffsetDateTime removalTime) {
    this.removalTime = removalTime;
    return this;
  }

  /**
   * The time after which the task should be removed by the History Cleanup job. Default [format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.
   * @return removalTime
   **/
  @Schema(description = "The time after which the task should be removed by the History Cleanup job. Default [format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.")
  
    @Valid
    public OffsetDateTime getRemovalTime() {
    return removalTime;
  }

  public void setRemovalTime(OffsetDateTime removalTime) {
    this.removalTime = removalTime;
  }

  public HistoricTaskInstanceDto rootProcessInstanceId(String rootProcessInstanceId) {
    this.rootProcessInstanceId = rootProcessInstanceId;
    return this;
  }

  /**
   * The process instance id of the root process instance that initiated the process containing this task.
   * @return rootProcessInstanceId
   **/
  @Schema(description = "The process instance id of the root process instance that initiated the process containing this task.")
  
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
    HistoricTaskInstanceDto historicTaskInstanceDto = (HistoricTaskInstanceDto) o;
    return Objects.equals(this.id, historicTaskInstanceDto.id) &&
        Objects.equals(this.processDefinitionKey, historicTaskInstanceDto.processDefinitionKey) &&
        Objects.equals(this.processDefinitionId, historicTaskInstanceDto.processDefinitionId) &&
        Objects.equals(this.processInstanceId, historicTaskInstanceDto.processInstanceId) &&
        Objects.equals(this.executionId, historicTaskInstanceDto.executionId) &&
        Objects.equals(this.caseDefinitionKey, historicTaskInstanceDto.caseDefinitionKey) &&
        Objects.equals(this.caseDefinitionId, historicTaskInstanceDto.caseDefinitionId) &&
        Objects.equals(this.caseInstanceId, historicTaskInstanceDto.caseInstanceId) &&
        Objects.equals(this.caseExecutionId, historicTaskInstanceDto.caseExecutionId) &&
        Objects.equals(this.activityInstanceId, historicTaskInstanceDto.activityInstanceId) &&
        Objects.equals(this.name, historicTaskInstanceDto.name) &&
        Objects.equals(this.description, historicTaskInstanceDto.description) &&
        Objects.equals(this.deleteReason, historicTaskInstanceDto.deleteReason) &&
        Objects.equals(this.owner, historicTaskInstanceDto.owner) &&
        Objects.equals(this.assignee, historicTaskInstanceDto.assignee) &&
        Objects.equals(this.startTime, historicTaskInstanceDto.startTime) &&
        Objects.equals(this.endTime, historicTaskInstanceDto.endTime) &&
        Objects.equals(this.duration, historicTaskInstanceDto.duration) &&
        Objects.equals(this.taskDefinitionKey, historicTaskInstanceDto.taskDefinitionKey) &&
        Objects.equals(this.priority, historicTaskInstanceDto.priority) &&
        Objects.equals(this.due, historicTaskInstanceDto.due) &&
        Objects.equals(this.parentTaskId, historicTaskInstanceDto.parentTaskId) &&
        Objects.equals(this.followUp, historicTaskInstanceDto.followUp) &&
        Objects.equals(this.tenantId, historicTaskInstanceDto.tenantId) &&
        Objects.equals(this.removalTime, historicTaskInstanceDto.removalTime) &&
        Objects.equals(this.rootProcessInstanceId, historicTaskInstanceDto.rootProcessInstanceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, processDefinitionKey, processDefinitionId, processInstanceId, executionId, caseDefinitionKey, caseDefinitionId, caseInstanceId, caseExecutionId, activityInstanceId, name, description, deleteReason, owner, assignee, startTime, endTime, duration, taskDefinitionKey, priority, due, parentTaskId, followUp, tenantId, removalTime, rootProcessInstanceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricTaskInstanceDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
    sb.append("    caseDefinitionKey: ").append(toIndentedString(caseDefinitionKey)).append("\n");
    sb.append("    caseDefinitionId: ").append(toIndentedString(caseDefinitionId)).append("\n");
    sb.append("    caseInstanceId: ").append(toIndentedString(caseInstanceId)).append("\n");
    sb.append("    caseExecutionId: ").append(toIndentedString(caseExecutionId)).append("\n");
    sb.append("    activityInstanceId: ").append(toIndentedString(activityInstanceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    deleteReason: ").append(toIndentedString(deleteReason)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    taskDefinitionKey: ").append(toIndentedString(taskDefinitionKey)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    due: ").append(toIndentedString(due)).append("\n");
    sb.append("    parentTaskId: ").append(toIndentedString(parentTaskId)).append("\n");
    sb.append("    followUp: ").append(toIndentedString(followUp)).append("\n");
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
