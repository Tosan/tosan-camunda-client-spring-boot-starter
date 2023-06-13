package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tosan.camunda.camundaclient.generated.model.HistoricTaskInstanceQueryDtoSortingInner;
import com.tosan.camunda.camundaclient.generated.model.VariableQueryParameterDto;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * A Historic Task instance query which defines a list of Historic Task instances
 */

@Schema(name = "HistoricTaskInstanceQueryDto", description = "A Historic Task instance query which defines a list of Historic Task instances")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class HistoricTaskInstanceQueryDto {

  private String taskId = null;

  private String taskParentTaskId = null;

  private String processInstanceId = null;

  private String processInstanceBusinessKey = null;

  @Valid
  private List<String> processInstanceBusinessKeyIn;

  private String processInstanceBusinessKeyLike = null;

  private String executionId = null;

  private String processDefinitionId = null;

  private String processDefinitionKey = null;

  private String processDefinitionName = null;

  private String caseInstanceId = null;

  private String caseExecutionId = null;

  private String caseDefinitionId = null;

  private String caseDefinitionKey = null;

  private String caseDefinitionName = null;

  @Valid
  private List<String> activityInstanceIdIn;

  private String taskName = null;

  private String taskNameLike = null;

  private String taskDescription = null;

  private String taskDescriptionLike = null;

  private String taskDefinitionKey = null;

  @Valid
  private List<String> taskDefinitionKeyIn;

  private String taskDeleteReason = null;

  private String taskDeleteReasonLike = null;

  private String taskAssignee = null;

  private String taskAssigneeLike = null;

  private String taskOwner = null;

  private String taskOwnerLike = null;

  private Integer taskPriority = null;

  private Boolean assigned = null;

  private Boolean unassigned = null;

  private Boolean finished = null;

  private Boolean unfinished = null;

  private Boolean processFinished = null;

  private Boolean processUnfinished = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime taskDueDate = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime taskDueDateBefore = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime taskDueDateAfter = null;

  private Boolean withoutTaskDueDate = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime taskFollowUpDate = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime taskFollowUpDateBefore = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime taskFollowUpDateAfter = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startedBefore = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startedAfter = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime finishedBefore = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime finishedAfter = null;

  @Valid
  private List<String> tenantIdIn;

  private Boolean withoutTenantId = null;

  @Valid
  private List<@Valid VariableQueryParameterDto> taskVariables;

  @Valid
  private List<@Valid VariableQueryParameterDto> processVariables;

  private Boolean variableNamesIgnoreCase = null;

  private Boolean variableValuesIgnoreCase = null;

  private String taskInvolvedUser = null;

  private String taskInvolvedGroup = null;

  private String taskHadCandidateUser = null;

  private String taskHadCandidateGroup = null;

  private Boolean withCandidateGroups = null;

  private Boolean withoutCandidateGroups = null;

  @Valid
  private List<@Valid HistoricTaskInstanceQueryDto> orQueries;

  @Valid
  private List<@Valid HistoricTaskInstanceQueryDtoSortingInner> sorting;

  public HistoricTaskInstanceQueryDto taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

  /**
   * Filter by task id.
   * @return taskId
  */
  
  @Schema(name = "taskId", description = "Filter by task id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taskId")
  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  public HistoricTaskInstanceQueryDto taskParentTaskId(String taskParentTaskId) {
    this.taskParentTaskId = taskParentTaskId;
    return this;
  }

  /**
   * Filter by parent task id.
   * @return taskParentTaskId
  */
  
  @Schema(name = "taskParentTaskId", description = "Filter by parent task id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taskParentTaskId")
  public String getTaskParentTaskId() {
    return taskParentTaskId;
  }

  public void setTaskParentTaskId(String taskParentTaskId) {
    this.taskParentTaskId = taskParentTaskId;
  }

  public HistoricTaskInstanceQueryDto processInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
    return this;
  }

  /**
   * Filter by process instance id.
   * @return processInstanceId
  */
  
  @Schema(name = "processInstanceId", description = "Filter by process instance id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processInstanceId")
  public String getProcessInstanceId() {
    return processInstanceId;
  }

  public void setProcessInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
  }

  public HistoricTaskInstanceQueryDto processInstanceBusinessKey(String processInstanceBusinessKey) {
    this.processInstanceBusinessKey = processInstanceBusinessKey;
    return this;
  }

  /**
   * Filter by process instance business key.
   * @return processInstanceBusinessKey
  */
  
  @Schema(name = "processInstanceBusinessKey", description = "Filter by process instance business key.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processInstanceBusinessKey")
  public String getProcessInstanceBusinessKey() {
    return processInstanceBusinessKey;
  }

  public void setProcessInstanceBusinessKey(String processInstanceBusinessKey) {
    this.processInstanceBusinessKey = processInstanceBusinessKey;
  }

  public HistoricTaskInstanceQueryDto processInstanceBusinessKeyIn(List<String> processInstanceBusinessKeyIn) {
    this.processInstanceBusinessKeyIn = processInstanceBusinessKeyIn;
    return this;
  }

  public HistoricTaskInstanceQueryDto addProcessInstanceBusinessKeyInItem(String processInstanceBusinessKeyInItem) {
    if (this.processInstanceBusinessKeyIn == null) {
      this.processInstanceBusinessKeyIn = new ArrayList<>();
    }
    this.processInstanceBusinessKeyIn.add(processInstanceBusinessKeyInItem);
    return this;
  }

  /**
   * Filter by process instances with one of the give business keys. The keys need to be in a comma-separated list.
   * @return processInstanceBusinessKeyIn
  */
  
  @Schema(name = "processInstanceBusinessKeyIn", description = "Filter by process instances with one of the give business keys. The keys need to be in a comma-separated list.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processInstanceBusinessKeyIn")
  public List<String> getProcessInstanceBusinessKeyIn() {
    return processInstanceBusinessKeyIn;
  }

  public void setProcessInstanceBusinessKeyIn(List<String> processInstanceBusinessKeyIn) {
    this.processInstanceBusinessKeyIn = processInstanceBusinessKeyIn;
  }

  public HistoricTaskInstanceQueryDto processInstanceBusinessKeyLike(String processInstanceBusinessKeyLike) {
    this.processInstanceBusinessKeyLike = processInstanceBusinessKeyLike;
    return this;
  }

  /**
   * Filter by  process instance business key that has the parameter value as a substring.
   * @return processInstanceBusinessKeyLike
  */
  
  @Schema(name = "processInstanceBusinessKeyLike", description = "Filter by  process instance business key that has the parameter value as a substring.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processInstanceBusinessKeyLike")
  public String getProcessInstanceBusinessKeyLike() {
    return processInstanceBusinessKeyLike;
  }

  public void setProcessInstanceBusinessKeyLike(String processInstanceBusinessKeyLike) {
    this.processInstanceBusinessKeyLike = processInstanceBusinessKeyLike;
  }

  public HistoricTaskInstanceQueryDto executionId(String executionId) {
    this.executionId = executionId;
    return this;
  }

  /**
   * Filter by the id of the execution that executed the task.
   * @return executionId
  */
  
  @Schema(name = "executionId", description = "Filter by the id of the execution that executed the task.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("executionId")
  public String getExecutionId() {
    return executionId;
  }

  public void setExecutionId(String executionId) {
    this.executionId = executionId;
  }

  public HistoricTaskInstanceQueryDto processDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
    return this;
  }

  /**
   * Filter by process definition id.
   * @return processDefinitionId
  */
  
  @Schema(name = "processDefinitionId", description = "Filter by process definition id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionId")
  public String getProcessDefinitionId() {
    return processDefinitionId;
  }

  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }

  public HistoricTaskInstanceQueryDto processDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
    return this;
  }

  /**
   * Restrict to tasks that belong to a process definition with the given key.
   * @return processDefinitionKey
  */
  
  @Schema(name = "processDefinitionKey", description = "Restrict to tasks that belong to a process definition with the given key.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionKey")
  public String getProcessDefinitionKey() {
    return processDefinitionKey;
  }

  public void setProcessDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
  }

  public HistoricTaskInstanceQueryDto processDefinitionName(String processDefinitionName) {
    this.processDefinitionName = processDefinitionName;
    return this;
  }

  /**
   * Restrict to tasks that belong to a process definition with the given name.
   * @return processDefinitionName
  */
  
  @Schema(name = "processDefinitionName", description = "Restrict to tasks that belong to a process definition with the given name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionName")
  public String getProcessDefinitionName() {
    return processDefinitionName;
  }

  public void setProcessDefinitionName(String processDefinitionName) {
    this.processDefinitionName = processDefinitionName;
  }

  public HistoricTaskInstanceQueryDto caseInstanceId(String caseInstanceId) {
    this.caseInstanceId = caseInstanceId;
    return this;
  }

  /**
   * Filter by case instance id.
   * @return caseInstanceId
  */
  
  @Schema(name = "caseInstanceId", description = "Filter by case instance id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("caseInstanceId")
  public String getCaseInstanceId() {
    return caseInstanceId;
  }

  public void setCaseInstanceId(String caseInstanceId) {
    this.caseInstanceId = caseInstanceId;
  }

  public HistoricTaskInstanceQueryDto caseExecutionId(String caseExecutionId) {
    this.caseExecutionId = caseExecutionId;
    return this;
  }

  /**
   * Filter by the id of the case execution that executed the task.
   * @return caseExecutionId
  */
  
  @Schema(name = "caseExecutionId", description = "Filter by the id of the case execution that executed the task.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("caseExecutionId")
  public String getCaseExecutionId() {
    return caseExecutionId;
  }

  public void setCaseExecutionId(String caseExecutionId) {
    this.caseExecutionId = caseExecutionId;
  }

  public HistoricTaskInstanceQueryDto caseDefinitionId(String caseDefinitionId) {
    this.caseDefinitionId = caseDefinitionId;
    return this;
  }

  /**
   * Filter by case definition id.
   * @return caseDefinitionId
  */
  
  @Schema(name = "caseDefinitionId", description = "Filter by case definition id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("caseDefinitionId")
  public String getCaseDefinitionId() {
    return caseDefinitionId;
  }

  public void setCaseDefinitionId(String caseDefinitionId) {
    this.caseDefinitionId = caseDefinitionId;
  }

  public HistoricTaskInstanceQueryDto caseDefinitionKey(String caseDefinitionKey) {
    this.caseDefinitionKey = caseDefinitionKey;
    return this;
  }

  /**
   * Restrict to tasks that belong to a case definition with the given key.
   * @return caseDefinitionKey
  */
  
  @Schema(name = "caseDefinitionKey", description = "Restrict to tasks that belong to a case definition with the given key.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("caseDefinitionKey")
  public String getCaseDefinitionKey() {
    return caseDefinitionKey;
  }

  public void setCaseDefinitionKey(String caseDefinitionKey) {
    this.caseDefinitionKey = caseDefinitionKey;
  }

  public HistoricTaskInstanceQueryDto caseDefinitionName(String caseDefinitionName) {
    this.caseDefinitionName = caseDefinitionName;
    return this;
  }

  /**
   * Restrict to tasks that belong to a case definition with the given name.
   * @return caseDefinitionName
  */
  
  @Schema(name = "caseDefinitionName", description = "Restrict to tasks that belong to a case definition with the given name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("caseDefinitionName")
  public String getCaseDefinitionName() {
    return caseDefinitionName;
  }

  public void setCaseDefinitionName(String caseDefinitionName) {
    this.caseDefinitionName = caseDefinitionName;
  }

  public HistoricTaskInstanceQueryDto activityInstanceIdIn(List<String> activityInstanceIdIn) {
    this.activityInstanceIdIn = activityInstanceIdIn;
    return this;
  }

  public HistoricTaskInstanceQueryDto addActivityInstanceIdInItem(String activityInstanceIdInItem) {
    if (this.activityInstanceIdIn == null) {
      this.activityInstanceIdIn = new ArrayList<>();
    }
    this.activityInstanceIdIn.add(activityInstanceIdInItem);
    return this;
  }

  /**
   * Only include tasks which belong to one of the passed  activity instance ids.
   * @return activityInstanceIdIn
  */
  
  @Schema(name = "activityInstanceIdIn", description = "Only include tasks which belong to one of the passed  activity instance ids.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activityInstanceIdIn")
  public List<String> getActivityInstanceIdIn() {
    return activityInstanceIdIn;
  }

  public void setActivityInstanceIdIn(List<String> activityInstanceIdIn) {
    this.activityInstanceIdIn = activityInstanceIdIn;
  }

  public HistoricTaskInstanceQueryDto taskName(String taskName) {
    this.taskName = taskName;
    return this;
  }

  /**
   * Restrict to tasks that have the given name.
   * @return taskName
  */
  
  @Schema(name = "taskName", description = "Restrict to tasks that have the given name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taskName")
  public String getTaskName() {
    return taskName;
  }

  public void setTaskName(String taskName) {
    this.taskName = taskName;
  }

  public HistoricTaskInstanceQueryDto taskNameLike(String taskNameLike) {
    this.taskNameLike = taskNameLike;
    return this;
  }

  /**
   * Restrict to tasks that have a name with the given parameter value as substring.
   * @return taskNameLike
  */
  
  @Schema(name = "taskNameLike", description = "Restrict to tasks that have a name with the given parameter value as substring.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taskNameLike")
  public String getTaskNameLike() {
    return taskNameLike;
  }

  public void setTaskNameLike(String taskNameLike) {
    this.taskNameLike = taskNameLike;
  }

  public HistoricTaskInstanceQueryDto taskDescription(String taskDescription) {
    this.taskDescription = taskDescription;
    return this;
  }

  /**
   * Restrict to tasks that have the given description.
   * @return taskDescription
  */
  
  @Schema(name = "taskDescription", description = "Restrict to tasks that have the given description.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taskDescription")
  public String getTaskDescription() {
    return taskDescription;
  }

  public void setTaskDescription(String taskDescription) {
    this.taskDescription = taskDescription;
  }

  public HistoricTaskInstanceQueryDto taskDescriptionLike(String taskDescriptionLike) {
    this.taskDescriptionLike = taskDescriptionLike;
    return this;
  }

  /**
   * Restrict to tasks that have a description that has the parameter value as a substring.
   * @return taskDescriptionLike
  */
  
  @Schema(name = "taskDescriptionLike", description = "Restrict to tasks that have a description that has the parameter value as a substring.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taskDescriptionLike")
  public String getTaskDescriptionLike() {
    return taskDescriptionLike;
  }

  public void setTaskDescriptionLike(String taskDescriptionLike) {
    this.taskDescriptionLike = taskDescriptionLike;
  }

  public HistoricTaskInstanceQueryDto taskDefinitionKey(String taskDefinitionKey) {
    this.taskDefinitionKey = taskDefinitionKey;
    return this;
  }

  /**
   * Restrict to tasks that have the given key.
   * @return taskDefinitionKey
  */
  
  @Schema(name = "taskDefinitionKey", description = "Restrict to tasks that have the given key.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taskDefinitionKey")
  public String getTaskDefinitionKey() {
    return taskDefinitionKey;
  }

  public void setTaskDefinitionKey(String taskDefinitionKey) {
    this.taskDefinitionKey = taskDefinitionKey;
  }

  public HistoricTaskInstanceQueryDto taskDefinitionKeyIn(List<String> taskDefinitionKeyIn) {
    this.taskDefinitionKeyIn = taskDefinitionKeyIn;
    return this;
  }

  public HistoricTaskInstanceQueryDto addTaskDefinitionKeyInItem(String taskDefinitionKeyInItem) {
    if (this.taskDefinitionKeyIn == null) {
      this.taskDefinitionKeyIn = new ArrayList<>();
    }
    this.taskDefinitionKeyIn.add(taskDefinitionKeyInItem);
    return this;
  }

  /**
   * Restrict to tasks that have one of the passed  task definition keys.
   * @return taskDefinitionKeyIn
  */
  
  @Schema(name = "taskDefinitionKeyIn", description = "Restrict to tasks that have one of the passed  task definition keys.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taskDefinitionKeyIn")
  public List<String> getTaskDefinitionKeyIn() {
    return taskDefinitionKeyIn;
  }

  public void setTaskDefinitionKeyIn(List<String> taskDefinitionKeyIn) {
    this.taskDefinitionKeyIn = taskDefinitionKeyIn;
  }

  public HistoricTaskInstanceQueryDto taskDeleteReason(String taskDeleteReason) {
    this.taskDeleteReason = taskDeleteReason;
    return this;
  }

  /**
   * Restrict to tasks that have the given delete reason.
   * @return taskDeleteReason
  */
  
  @Schema(name = "taskDeleteReason", description = "Restrict to tasks that have the given delete reason.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taskDeleteReason")
  public String getTaskDeleteReason() {
    return taskDeleteReason;
  }

  public void setTaskDeleteReason(String taskDeleteReason) {
    this.taskDeleteReason = taskDeleteReason;
  }

  public HistoricTaskInstanceQueryDto taskDeleteReasonLike(String taskDeleteReasonLike) {
    this.taskDeleteReasonLike = taskDeleteReasonLike;
    return this;
  }

  /**
   * Restrict to tasks that have a delete reason that has the parameter value as a substring.
   * @return taskDeleteReasonLike
  */
  
  @Schema(name = "taskDeleteReasonLike", description = "Restrict to tasks that have a delete reason that has the parameter value as a substring.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taskDeleteReasonLike")
  public String getTaskDeleteReasonLike() {
    return taskDeleteReasonLike;
  }

  public void setTaskDeleteReasonLike(String taskDeleteReasonLike) {
    this.taskDeleteReasonLike = taskDeleteReasonLike;
  }

  public HistoricTaskInstanceQueryDto taskAssignee(String taskAssignee) {
    this.taskAssignee = taskAssignee;
    return this;
  }

  /**
   * Restrict to tasks that the given user is assigned to.
   * @return taskAssignee
  */
  
  @Schema(name = "taskAssignee", description = "Restrict to tasks that the given user is assigned to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taskAssignee")
  public String getTaskAssignee() {
    return taskAssignee;
  }

  public void setTaskAssignee(String taskAssignee) {
    this.taskAssignee = taskAssignee;
  }

  public HistoricTaskInstanceQueryDto taskAssigneeLike(String taskAssigneeLike) {
    this.taskAssigneeLike = taskAssigneeLike;
    return this;
  }

  /**
   * Restrict to tasks that are assigned to users with the parameter value as a substring.
   * @return taskAssigneeLike
  */
  
  @Schema(name = "taskAssigneeLike", description = "Restrict to tasks that are assigned to users with the parameter value as a substring.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taskAssigneeLike")
  public String getTaskAssigneeLike() {
    return taskAssigneeLike;
  }

  public void setTaskAssigneeLike(String taskAssigneeLike) {
    this.taskAssigneeLike = taskAssigneeLike;
  }

  public HistoricTaskInstanceQueryDto taskOwner(String taskOwner) {
    this.taskOwner = taskOwner;
    return this;
  }

  /**
   * Restrict to tasks that the given user owns.
   * @return taskOwner
  */
  
  @Schema(name = "taskOwner", description = "Restrict to tasks that the given user owns.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taskOwner")
  public String getTaskOwner() {
    return taskOwner;
  }

  public void setTaskOwner(String taskOwner) {
    this.taskOwner = taskOwner;
  }

  public HistoricTaskInstanceQueryDto taskOwnerLike(String taskOwnerLike) {
    this.taskOwnerLike = taskOwnerLike;
    return this;
  }

  /**
   * Restrict to tasks that are owned by users with the parameter value as a substring.
   * @return taskOwnerLike
  */
  
  @Schema(name = "taskOwnerLike", description = "Restrict to tasks that are owned by users with the parameter value as a substring.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taskOwnerLike")
  public String getTaskOwnerLike() {
    return taskOwnerLike;
  }

  public void setTaskOwnerLike(String taskOwnerLike) {
    this.taskOwnerLike = taskOwnerLike;
  }

  public HistoricTaskInstanceQueryDto taskPriority(Integer taskPriority) {
    this.taskPriority = taskPriority;
    return this;
  }

  /**
   * Restrict to tasks that have the given priority.
   * @return taskPriority
  */
  
  @Schema(name = "taskPriority", description = "Restrict to tasks that have the given priority.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taskPriority")
  public Integer getTaskPriority() {
    return taskPriority;
  }

  public void setTaskPriority(Integer taskPriority) {
    this.taskPriority = taskPriority;
  }

  public HistoricTaskInstanceQueryDto assigned(Boolean assigned) {
    this.assigned = assigned;
    return this;
  }

  /**
   * If set to `true`, restricts the query to all tasks that are assigned.
   * @return assigned
  */
  
  @Schema(name = "assigned", description = "If set to `true`, restricts the query to all tasks that are assigned.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assigned")
  public Boolean getAssigned() {
    return assigned;
  }

  public void setAssigned(Boolean assigned) {
    this.assigned = assigned;
  }

  public HistoricTaskInstanceQueryDto unassigned(Boolean unassigned) {
    this.unassigned = unassigned;
    return this;
  }

  /**
   * If set to `true`, restricts the query to all tasks that are unassigned.
   * @return unassigned
  */
  
  @Schema(name = "unassigned", description = "If set to `true`, restricts the query to all tasks that are unassigned.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("unassigned")
  public Boolean getUnassigned() {
    return unassigned;
  }

  public void setUnassigned(Boolean unassigned) {
    this.unassigned = unassigned;
  }

  public HistoricTaskInstanceQueryDto finished(Boolean finished) {
    this.finished = finished;
    return this;
  }

  /**
   * Only include finished tasks. Value may only be `true`, as `false` is the default behavior.
   * @return finished
  */
  
  @Schema(name = "finished", description = "Only include finished tasks. Value may only be `true`, as `false` is the default behavior.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("finished")
  public Boolean getFinished() {
    return finished;
  }

  public void setFinished(Boolean finished) {
    this.finished = finished;
  }

  public HistoricTaskInstanceQueryDto unfinished(Boolean unfinished) {
    this.unfinished = unfinished;
    return this;
  }

  /**
   * Only include unfinished tasks. Value may only be `true`, as `false` is the default behavior.
   * @return unfinished
  */
  
  @Schema(name = "unfinished", description = "Only include unfinished tasks. Value may only be `true`, as `false` is the default behavior.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("unfinished")
  public Boolean getUnfinished() {
    return unfinished;
  }

  public void setUnfinished(Boolean unfinished) {
    this.unfinished = unfinished;
  }

  public HistoricTaskInstanceQueryDto processFinished(Boolean processFinished) {
    this.processFinished = processFinished;
    return this;
  }

  /**
   * Only include tasks of finished processes. Value may only be `true`, as `false` is the default behavior.
   * @return processFinished
  */
  
  @Schema(name = "processFinished", description = "Only include tasks of finished processes. Value may only be `true`, as `false` is the default behavior.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processFinished")
  public Boolean getProcessFinished() {
    return processFinished;
  }

  public void setProcessFinished(Boolean processFinished) {
    this.processFinished = processFinished;
  }

  public HistoricTaskInstanceQueryDto processUnfinished(Boolean processUnfinished) {
    this.processUnfinished = processUnfinished;
    return this;
  }

  /**
   * Only include tasks of unfinished processes. Value may only be `true`, as `false` is the default behavior.
   * @return processUnfinished
  */
  
  @Schema(name = "processUnfinished", description = "Only include tasks of unfinished processes. Value may only be `true`, as `false` is the default behavior.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processUnfinished")
  public Boolean getProcessUnfinished() {
    return processUnfinished;
  }

  public void setProcessUnfinished(Boolean processUnfinished) {
    this.processUnfinished = processUnfinished;
  }

  public HistoricTaskInstanceQueryDto taskDueDate(OffsetDateTime taskDueDate) {
    this.taskDueDate = taskDueDate;
    return this;
  }

  /**
   * Restrict to tasks that are due on the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.
   * @return taskDueDate
  */
  @Valid 
  @Schema(name = "taskDueDate", description = "Restrict to tasks that are due on the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taskDueDate")
  public OffsetDateTime getTaskDueDate() {
    return taskDueDate;
  }

  public void setTaskDueDate(OffsetDateTime taskDueDate) {
    this.taskDueDate = taskDueDate;
  }

  public HistoricTaskInstanceQueryDto taskDueDateBefore(OffsetDateTime taskDueDateBefore) {
    this.taskDueDateBefore = taskDueDateBefore;
    return this;
  }

  /**
   * Restrict to tasks that are due before the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.
   * @return taskDueDateBefore
  */
  @Valid 
  @Schema(name = "taskDueDateBefore", description = "Restrict to tasks that are due before the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taskDueDateBefore")
  public OffsetDateTime getTaskDueDateBefore() {
    return taskDueDateBefore;
  }

  public void setTaskDueDateBefore(OffsetDateTime taskDueDateBefore) {
    this.taskDueDateBefore = taskDueDateBefore;
  }

  public HistoricTaskInstanceQueryDto taskDueDateAfter(OffsetDateTime taskDueDateAfter) {
    this.taskDueDateAfter = taskDueDateAfter;
    return this;
  }

  /**
   * Restrict to tasks that are due after the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.
   * @return taskDueDateAfter
  */
  @Valid 
  @Schema(name = "taskDueDateAfter", description = "Restrict to tasks that are due after the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taskDueDateAfter")
  public OffsetDateTime getTaskDueDateAfter() {
    return taskDueDateAfter;
  }

  public void setTaskDueDateAfter(OffsetDateTime taskDueDateAfter) {
    this.taskDueDateAfter = taskDueDateAfter;
  }

  public HistoricTaskInstanceQueryDto withoutTaskDueDate(Boolean withoutTaskDueDate) {
    this.withoutTaskDueDate = withoutTaskDueDate;
    return this;
  }

  /**
   * Only include tasks which have no due date. Value may only be `true`, as `false` is the default behavior.
   * @return withoutTaskDueDate
  */
  
  @Schema(name = "withoutTaskDueDate", description = "Only include tasks which have no due date. Value may only be `true`, as `false` is the default behavior.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("withoutTaskDueDate")
  public Boolean getWithoutTaskDueDate() {
    return withoutTaskDueDate;
  }

  public void setWithoutTaskDueDate(Boolean withoutTaskDueDate) {
    this.withoutTaskDueDate = withoutTaskDueDate;
  }

  public HistoricTaskInstanceQueryDto taskFollowUpDate(OffsetDateTime taskFollowUpDate) {
    this.taskFollowUpDate = taskFollowUpDate;
    return this;
  }

  /**
   * Restrict to tasks that have a followUp date on the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.
   * @return taskFollowUpDate
  */
  @Valid 
  @Schema(name = "taskFollowUpDate", description = "Restrict to tasks that have a followUp date on the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taskFollowUpDate")
  public OffsetDateTime getTaskFollowUpDate() {
    return taskFollowUpDate;
  }

  public void setTaskFollowUpDate(OffsetDateTime taskFollowUpDate) {
    this.taskFollowUpDate = taskFollowUpDate;
  }

  public HistoricTaskInstanceQueryDto taskFollowUpDateBefore(OffsetDateTime taskFollowUpDateBefore) {
    this.taskFollowUpDateBefore = taskFollowUpDateBefore;
    return this;
  }

  /**
   * Restrict to tasks that have a followUp date before the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.
   * @return taskFollowUpDateBefore
  */
  @Valid 
  @Schema(name = "taskFollowUpDateBefore", description = "Restrict to tasks that have a followUp date before the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taskFollowUpDateBefore")
  public OffsetDateTime getTaskFollowUpDateBefore() {
    return taskFollowUpDateBefore;
  }

  public void setTaskFollowUpDateBefore(OffsetDateTime taskFollowUpDateBefore) {
    this.taskFollowUpDateBefore = taskFollowUpDateBefore;
  }

  public HistoricTaskInstanceQueryDto taskFollowUpDateAfter(OffsetDateTime taskFollowUpDateAfter) {
    this.taskFollowUpDateAfter = taskFollowUpDateAfter;
    return this;
  }

  /**
   * Restrict to tasks that have a followUp date after the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.
   * @return taskFollowUpDateAfter
  */
  @Valid 
  @Schema(name = "taskFollowUpDateAfter", description = "Restrict to tasks that have a followUp date after the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taskFollowUpDateAfter")
  public OffsetDateTime getTaskFollowUpDateAfter() {
    return taskFollowUpDateAfter;
  }

  public void setTaskFollowUpDateAfter(OffsetDateTime taskFollowUpDateAfter) {
    this.taskFollowUpDateAfter = taskFollowUpDateAfter;
  }

  public HistoricTaskInstanceQueryDto startedBefore(OffsetDateTime startedBefore) {
    this.startedBefore = startedBefore;
    return this;
  }

  /**
   * Restrict to tasks that were started before the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.
   * @return startedBefore
  */
  @Valid 
  @Schema(name = "startedBefore", description = "Restrict to tasks that were started before the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startedBefore")
  public OffsetDateTime getStartedBefore() {
    return startedBefore;
  }

  public void setStartedBefore(OffsetDateTime startedBefore) {
    this.startedBefore = startedBefore;
  }

  public HistoricTaskInstanceQueryDto startedAfter(OffsetDateTime startedAfter) {
    this.startedAfter = startedAfter;
    return this;
  }

  /**
   * Restrict to tasks that were started after the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.
   * @return startedAfter
  */
  @Valid 
  @Schema(name = "startedAfter", description = "Restrict to tasks that were started after the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startedAfter")
  public OffsetDateTime getStartedAfter() {
    return startedAfter;
  }

  public void setStartedAfter(OffsetDateTime startedAfter) {
    this.startedAfter = startedAfter;
  }

  public HistoricTaskInstanceQueryDto finishedBefore(OffsetDateTime finishedBefore) {
    this.finishedBefore = finishedBefore;
    return this;
  }

  /**
   * Restrict to tasks that were finished before the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.
   * @return finishedBefore
  */
  @Valid 
  @Schema(name = "finishedBefore", description = "Restrict to tasks that were finished before the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("finishedBefore")
  public OffsetDateTime getFinishedBefore() {
    return finishedBefore;
  }

  public void setFinishedBefore(OffsetDateTime finishedBefore) {
    this.finishedBefore = finishedBefore;
  }

  public HistoricTaskInstanceQueryDto finishedAfter(OffsetDateTime finishedAfter) {
    this.finishedAfter = finishedAfter;
    return this;
  }

  /**
   * Restrict to tasks that were finished after the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.
   * @return finishedAfter
  */
  @Valid 
  @Schema(name = "finishedAfter", description = "Restrict to tasks that were finished after the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("finishedAfter")
  public OffsetDateTime getFinishedAfter() {
    return finishedAfter;
  }

  public void setFinishedAfter(OffsetDateTime finishedAfter) {
    this.finishedAfter = finishedAfter;
  }

  public HistoricTaskInstanceQueryDto tenantIdIn(List<String> tenantIdIn) {
    this.tenantIdIn = tenantIdIn;
    return this;
  }

  public HistoricTaskInstanceQueryDto addTenantIdInItem(String tenantIdInItem) {
    if (this.tenantIdIn == null) {
      this.tenantIdIn = new ArrayList<>();
    }
    this.tenantIdIn.add(tenantIdInItem);
    return this;
  }

  /**
   * Filter by a  list of tenant ids. A task instance must have one of the given tenant ids.
   * @return tenantIdIn
  */
  
  @Schema(name = "tenantIdIn", description = "Filter by a  list of tenant ids. A task instance must have one of the given tenant ids.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tenantIdIn")
  public List<String> getTenantIdIn() {
    return tenantIdIn;
  }

  public void setTenantIdIn(List<String> tenantIdIn) {
    this.tenantIdIn = tenantIdIn;
  }

  public HistoricTaskInstanceQueryDto withoutTenantId(Boolean withoutTenantId) {
    this.withoutTenantId = withoutTenantId;
    return this;
  }

  /**
   * Only include historic task instances that belong to no tenant. Value may only be `true`, as `false` is the default behavior.
   * @return withoutTenantId
  */
  
  @Schema(name = "withoutTenantId", description = "Only include historic task instances that belong to no tenant. Value may only be `true`, as `false` is the default behavior.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("withoutTenantId")
  public Boolean getWithoutTenantId() {
    return withoutTenantId;
  }

  public void setWithoutTenantId(Boolean withoutTenantId) {
    this.withoutTenantId = withoutTenantId;
  }

  public HistoricTaskInstanceQueryDto taskVariables(List<@Valid VariableQueryParameterDto> taskVariables) {
    this.taskVariables = taskVariables;
    return this;
  }

  public HistoricTaskInstanceQueryDto addTaskVariablesItem(VariableQueryParameterDto taskVariablesItem) {
    if (this.taskVariables == null) {
      this.taskVariables = new ArrayList<>();
    }
    this.taskVariables.add(taskVariablesItem);
    return this;
  }

  /**
   * Only include tasks that have variables with certain values. Variable filtering expressions are comma-separated and are structured as follows:  A valid parameter value has the form `key_operator_value`. `key` is the variable name, `operator` is the comparison operator to be used and `value` the variable value. **Note:** Values are always treated as `String` objects on server side.   Valid operator values are: * `eq` - equal to; * `neq` - not equal to; * `gt` - greater than; * `gteq` - greater than or equal to; * `lt` - lower than; * `lteq` - lower than or equal to; * `like`.  `key` and `value` may not contain underscore or comma characters.
   * @return taskVariables
  */
  @Valid 
  @Schema(name = "taskVariables", description = "Only include tasks that have variables with certain values. Variable filtering expressions are comma-separated and are structured as follows:  A valid parameter value has the form `key_operator_value`. `key` is the variable name, `operator` is the comparison operator to be used and `value` the variable value. **Note:** Values are always treated as `String` objects on server side.   Valid operator values are: * `eq` - equal to; * `neq` - not equal to; * `gt` - greater than; * `gteq` - greater than or equal to; * `lt` - lower than; * `lteq` - lower than or equal to; * `like`.  `key` and `value` may not contain underscore or comma characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taskVariables")
  public List<@Valid VariableQueryParameterDto> getTaskVariables() {
    return taskVariables;
  }

  public void setTaskVariables(List<@Valid VariableQueryParameterDto> taskVariables) {
    this.taskVariables = taskVariables;
  }

  public HistoricTaskInstanceQueryDto processVariables(List<@Valid VariableQueryParameterDto> processVariables) {
    this.processVariables = processVariables;
    return this;
  }

  public HistoricTaskInstanceQueryDto addProcessVariablesItem(VariableQueryParameterDto processVariablesItem) {
    if (this.processVariables == null) {
      this.processVariables = new ArrayList<>();
    }
    this.processVariables.add(processVariablesItem);
    return this;
  }

  /**
   * Only include tasks that belong to process instances that have variables with certain values. Variable filtering expressions are comma-separated and are structured as follows:  A valid parameter value has the form `key_operator_value`. `key` is the variable name, `operator` is the comparison operator to be used and `value` the variable value. **Note:** Values are always treated as `String` objects on server side.   Valid operator values are: * `eq` - equal to; * `neq` - not equal to; * `gt` - greater than; * `gteq` - greater than or equal to; * `lt` - lower than; * `lteq` - lower than or equal to; * `like`; * `notLike`.  `key` and `value` may not contain underscore or comma characters.
   * @return processVariables
  */
  @Valid 
  @Schema(name = "processVariables", description = "Only include tasks that belong to process instances that have variables with certain values. Variable filtering expressions are comma-separated and are structured as follows:  A valid parameter value has the form `key_operator_value`. `key` is the variable name, `operator` is the comparison operator to be used and `value` the variable value. **Note:** Values are always treated as `String` objects on server side.   Valid operator values are: * `eq` - equal to; * `neq` - not equal to; * `gt` - greater than; * `gteq` - greater than or equal to; * `lt` - lower than; * `lteq` - lower than or equal to; * `like`; * `notLike`.  `key` and `value` may not contain underscore or comma characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processVariables")
  public List<@Valid VariableQueryParameterDto> getProcessVariables() {
    return processVariables;
  }

  public void setProcessVariables(List<@Valid VariableQueryParameterDto> processVariables) {
    this.processVariables = processVariables;
  }

  public HistoricTaskInstanceQueryDto variableNamesIgnoreCase(Boolean variableNamesIgnoreCase) {
    this.variableNamesIgnoreCase = variableNamesIgnoreCase;
    return this;
  }

  /**
   * Match the variable name provided in `taskVariables` and `processVariables` case- insensitively. If set to `true` **variableName** and **variablename** are treated as equal.
   * @return variableNamesIgnoreCase
  */
  
  @Schema(name = "variableNamesIgnoreCase", description = "Match the variable name provided in `taskVariables` and `processVariables` case- insensitively. If set to `true` **variableName** and **variablename** are treated as equal.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("variableNamesIgnoreCase")
  public Boolean getVariableNamesIgnoreCase() {
    return variableNamesIgnoreCase;
  }

  public void setVariableNamesIgnoreCase(Boolean variableNamesIgnoreCase) {
    this.variableNamesIgnoreCase = variableNamesIgnoreCase;
  }

  public HistoricTaskInstanceQueryDto variableValuesIgnoreCase(Boolean variableValuesIgnoreCase) {
    this.variableValuesIgnoreCase = variableValuesIgnoreCase;
    return this;
  }

  /**
   * Match the variable value provided in `taskVariables` and `processVariables` case- insensitively. If set to `true` **variableValue** and **variablevalue** are treated as equal.
   * @return variableValuesIgnoreCase
  */
  
  @Schema(name = "variableValuesIgnoreCase", description = "Match the variable value provided in `taskVariables` and `processVariables` case- insensitively. If set to `true` **variableValue** and **variablevalue** are treated as equal.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("variableValuesIgnoreCase")
  public Boolean getVariableValuesIgnoreCase() {
    return variableValuesIgnoreCase;
  }

  public void setVariableValuesIgnoreCase(Boolean variableValuesIgnoreCase) {
    this.variableValuesIgnoreCase = variableValuesIgnoreCase;
  }

  public HistoricTaskInstanceQueryDto taskInvolvedUser(String taskInvolvedUser) {
    this.taskInvolvedUser = taskInvolvedUser;
    return this;
  }

  /**
   * Restrict to tasks with a historic identity link to the given user.
   * @return taskInvolvedUser
  */
  
  @Schema(name = "taskInvolvedUser", description = "Restrict to tasks with a historic identity link to the given user.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taskInvolvedUser")
  public String getTaskInvolvedUser() {
    return taskInvolvedUser;
  }

  public void setTaskInvolvedUser(String taskInvolvedUser) {
    this.taskInvolvedUser = taskInvolvedUser;
  }

  public HistoricTaskInstanceQueryDto taskInvolvedGroup(String taskInvolvedGroup) {
    this.taskInvolvedGroup = taskInvolvedGroup;
    return this;
  }

  /**
   * Restrict to tasks with a historic identity link to the given group.
   * @return taskInvolvedGroup
  */
  
  @Schema(name = "taskInvolvedGroup", description = "Restrict to tasks with a historic identity link to the given group.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taskInvolvedGroup")
  public String getTaskInvolvedGroup() {
    return taskInvolvedGroup;
  }

  public void setTaskInvolvedGroup(String taskInvolvedGroup) {
    this.taskInvolvedGroup = taskInvolvedGroup;
  }

  public HistoricTaskInstanceQueryDto taskHadCandidateUser(String taskHadCandidateUser) {
    this.taskHadCandidateUser = taskHadCandidateUser;
    return this;
  }

  /**
   * Restrict to tasks with a historic identity link to the given candidate user.
   * @return taskHadCandidateUser
  */
  
  @Schema(name = "taskHadCandidateUser", description = "Restrict to tasks with a historic identity link to the given candidate user.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taskHadCandidateUser")
  public String getTaskHadCandidateUser() {
    return taskHadCandidateUser;
  }

  public void setTaskHadCandidateUser(String taskHadCandidateUser) {
    this.taskHadCandidateUser = taskHadCandidateUser;
  }

  public HistoricTaskInstanceQueryDto taskHadCandidateGroup(String taskHadCandidateGroup) {
    this.taskHadCandidateGroup = taskHadCandidateGroup;
    return this;
  }

  /**
   * Restrict to tasks with a historic identity link to the given candidate group.
   * @return taskHadCandidateGroup
  */
  
  @Schema(name = "taskHadCandidateGroup", description = "Restrict to tasks with a historic identity link to the given candidate group.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taskHadCandidateGroup")
  public String getTaskHadCandidateGroup() {
    return taskHadCandidateGroup;
  }

  public void setTaskHadCandidateGroup(String taskHadCandidateGroup) {
    this.taskHadCandidateGroup = taskHadCandidateGroup;
  }

  public HistoricTaskInstanceQueryDto withCandidateGroups(Boolean withCandidateGroups) {
    this.withCandidateGroups = withCandidateGroups;
    return this;
  }

  /**
   * Only include tasks which have a candidate group. Value may only be `true`, as `false` is the default behavior.
   * @return withCandidateGroups
  */
  
  @Schema(name = "withCandidateGroups", description = "Only include tasks which have a candidate group. Value may only be `true`, as `false` is the default behavior.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("withCandidateGroups")
  public Boolean getWithCandidateGroups() {
    return withCandidateGroups;
  }

  public void setWithCandidateGroups(Boolean withCandidateGroups) {
    this.withCandidateGroups = withCandidateGroups;
  }

  public HistoricTaskInstanceQueryDto withoutCandidateGroups(Boolean withoutCandidateGroups) {
    this.withoutCandidateGroups = withoutCandidateGroups;
    return this;
  }

  /**
   * Only include tasks which have no candidate group. Value may only be `true`, as `false` is the default behavior.
   * @return withoutCandidateGroups
  */
  
  @Schema(name = "withoutCandidateGroups", description = "Only include tasks which have no candidate group. Value may only be `true`, as `false` is the default behavior.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("withoutCandidateGroups")
  public Boolean getWithoutCandidateGroups() {
    return withoutCandidateGroups;
  }

  public void setWithoutCandidateGroups(Boolean withoutCandidateGroups) {
    this.withoutCandidateGroups = withoutCandidateGroups;
  }

  public HistoricTaskInstanceQueryDto orQueries(List<@Valid HistoricTaskInstanceQueryDto> orQueries) {
    this.orQueries = orQueries;
    return this;
  }

  public HistoricTaskInstanceQueryDto addOrQueriesItem(HistoricTaskInstanceQueryDto orQueriesItem) {
    if (this.orQueries == null) {
      this.orQueries = new ArrayList<>();
    }
    this.orQueries.add(orQueriesItem);
    return this;
  }

  /**
   * A JSON array of nested historic task instance queries with OR semantics.  A task instance matches a nested query if it fulfills at least one of the query's predicates.  With multiple nested queries, a task instance must fulfill at least one predicate of each query ([Conjunctive Normal Form](https://en.wikipedia.org/wiki/Conjunctive_normal_form)).  All task instance query properties can be used except for: `sorting`, `withCandidateGroups`, ` withoutCandidateGroups`.  See the [User Guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/process-engine-api/#or-queries) for more information about OR queries.
   * @return orQueries
  */
  @Valid 
  @Schema(name = "orQueries", description = "A JSON array of nested historic task instance queries with OR semantics.  A task instance matches a nested query if it fulfills at least one of the query's predicates.  With multiple nested queries, a task instance must fulfill at least one predicate of each query ([Conjunctive Normal Form](https://en.wikipedia.org/wiki/Conjunctive_normal_form)).  All task instance query properties can be used except for: `sorting`, `withCandidateGroups`, ` withoutCandidateGroups`.  See the [User Guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/process-engine-api/#or-queries) for more information about OR queries.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orQueries")
  public List<@Valid HistoricTaskInstanceQueryDto> getOrQueries() {
    return orQueries;
  }

  public void setOrQueries(List<@Valid HistoricTaskInstanceQueryDto> orQueries) {
    this.orQueries = orQueries;
  }

  public HistoricTaskInstanceQueryDto sorting(List<@Valid HistoricTaskInstanceQueryDtoSortingInner> sorting) {
    this.sorting = sorting;
    return this;
  }

  public HistoricTaskInstanceQueryDto addSortingItem(HistoricTaskInstanceQueryDtoSortingInner sortingItem) {
    if (this.sorting == null) {
      this.sorting = new ArrayList<>();
    }
    this.sorting.add(sortingItem);
    return this;
  }

  /**
   * An array of criteria to sort the result by. Each element of the array is                     an object that specifies one ordering. The position in the array                     identifies the rank of an ordering, i.e., whether it is primary, secondary,                     etc. Sorting has no effect for `count` endpoints
   * @return sorting
  */
  @Valid 
  @Schema(name = "sorting", description = "An array of criteria to sort the result by. Each element of the array is                     an object that specifies one ordering. The position in the array                     identifies the rank of an ordering, i.e., whether it is primary, secondary,                     etc. Sorting has no effect for `count` endpoints", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sorting")
  public List<@Valid HistoricTaskInstanceQueryDtoSortingInner> getSorting() {
    return sorting;
  }

  public void setSorting(List<@Valid HistoricTaskInstanceQueryDtoSortingInner> sorting) {
    this.sorting = sorting;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricTaskInstanceQueryDto historicTaskInstanceQueryDto = (HistoricTaskInstanceQueryDto) o;
    return Objects.equals(this.taskId, historicTaskInstanceQueryDto.taskId) &&
        Objects.equals(this.taskParentTaskId, historicTaskInstanceQueryDto.taskParentTaskId) &&
        Objects.equals(this.processInstanceId, historicTaskInstanceQueryDto.processInstanceId) &&
        Objects.equals(this.processInstanceBusinessKey, historicTaskInstanceQueryDto.processInstanceBusinessKey) &&
        Objects.equals(this.processInstanceBusinessKeyIn, historicTaskInstanceQueryDto.processInstanceBusinessKeyIn) &&
        Objects.equals(this.processInstanceBusinessKeyLike, historicTaskInstanceQueryDto.processInstanceBusinessKeyLike) &&
        Objects.equals(this.executionId, historicTaskInstanceQueryDto.executionId) &&
        Objects.equals(this.processDefinitionId, historicTaskInstanceQueryDto.processDefinitionId) &&
        Objects.equals(this.processDefinitionKey, historicTaskInstanceQueryDto.processDefinitionKey) &&
        Objects.equals(this.processDefinitionName, historicTaskInstanceQueryDto.processDefinitionName) &&
        Objects.equals(this.caseInstanceId, historicTaskInstanceQueryDto.caseInstanceId) &&
        Objects.equals(this.caseExecutionId, historicTaskInstanceQueryDto.caseExecutionId) &&
        Objects.equals(this.caseDefinitionId, historicTaskInstanceQueryDto.caseDefinitionId) &&
        Objects.equals(this.caseDefinitionKey, historicTaskInstanceQueryDto.caseDefinitionKey) &&
        Objects.equals(this.caseDefinitionName, historicTaskInstanceQueryDto.caseDefinitionName) &&
        Objects.equals(this.activityInstanceIdIn, historicTaskInstanceQueryDto.activityInstanceIdIn) &&
        Objects.equals(this.taskName, historicTaskInstanceQueryDto.taskName) &&
        Objects.equals(this.taskNameLike, historicTaskInstanceQueryDto.taskNameLike) &&
        Objects.equals(this.taskDescription, historicTaskInstanceQueryDto.taskDescription) &&
        Objects.equals(this.taskDescriptionLike, historicTaskInstanceQueryDto.taskDescriptionLike) &&
        Objects.equals(this.taskDefinitionKey, historicTaskInstanceQueryDto.taskDefinitionKey) &&
        Objects.equals(this.taskDefinitionKeyIn, historicTaskInstanceQueryDto.taskDefinitionKeyIn) &&
        Objects.equals(this.taskDeleteReason, historicTaskInstanceQueryDto.taskDeleteReason) &&
        Objects.equals(this.taskDeleteReasonLike, historicTaskInstanceQueryDto.taskDeleteReasonLike) &&
        Objects.equals(this.taskAssignee, historicTaskInstanceQueryDto.taskAssignee) &&
        Objects.equals(this.taskAssigneeLike, historicTaskInstanceQueryDto.taskAssigneeLike) &&
        Objects.equals(this.taskOwner, historicTaskInstanceQueryDto.taskOwner) &&
        Objects.equals(this.taskOwnerLike, historicTaskInstanceQueryDto.taskOwnerLike) &&
        Objects.equals(this.taskPriority, historicTaskInstanceQueryDto.taskPriority) &&
        Objects.equals(this.assigned, historicTaskInstanceQueryDto.assigned) &&
        Objects.equals(this.unassigned, historicTaskInstanceQueryDto.unassigned) &&
        Objects.equals(this.finished, historicTaskInstanceQueryDto.finished) &&
        Objects.equals(this.unfinished, historicTaskInstanceQueryDto.unfinished) &&
        Objects.equals(this.processFinished, historicTaskInstanceQueryDto.processFinished) &&
        Objects.equals(this.processUnfinished, historicTaskInstanceQueryDto.processUnfinished) &&
        Objects.equals(this.taskDueDate, historicTaskInstanceQueryDto.taskDueDate) &&
        Objects.equals(this.taskDueDateBefore, historicTaskInstanceQueryDto.taskDueDateBefore) &&
        Objects.equals(this.taskDueDateAfter, historicTaskInstanceQueryDto.taskDueDateAfter) &&
        Objects.equals(this.withoutTaskDueDate, historicTaskInstanceQueryDto.withoutTaskDueDate) &&
        Objects.equals(this.taskFollowUpDate, historicTaskInstanceQueryDto.taskFollowUpDate) &&
        Objects.equals(this.taskFollowUpDateBefore, historicTaskInstanceQueryDto.taskFollowUpDateBefore) &&
        Objects.equals(this.taskFollowUpDateAfter, historicTaskInstanceQueryDto.taskFollowUpDateAfter) &&
        Objects.equals(this.startedBefore, historicTaskInstanceQueryDto.startedBefore) &&
        Objects.equals(this.startedAfter, historicTaskInstanceQueryDto.startedAfter) &&
        Objects.equals(this.finishedBefore, historicTaskInstanceQueryDto.finishedBefore) &&
        Objects.equals(this.finishedAfter, historicTaskInstanceQueryDto.finishedAfter) &&
        Objects.equals(this.tenantIdIn, historicTaskInstanceQueryDto.tenantIdIn) &&
        Objects.equals(this.withoutTenantId, historicTaskInstanceQueryDto.withoutTenantId) &&
        Objects.equals(this.taskVariables, historicTaskInstanceQueryDto.taskVariables) &&
        Objects.equals(this.processVariables, historicTaskInstanceQueryDto.processVariables) &&
        Objects.equals(this.variableNamesIgnoreCase, historicTaskInstanceQueryDto.variableNamesIgnoreCase) &&
        Objects.equals(this.variableValuesIgnoreCase, historicTaskInstanceQueryDto.variableValuesIgnoreCase) &&
        Objects.equals(this.taskInvolvedUser, historicTaskInstanceQueryDto.taskInvolvedUser) &&
        Objects.equals(this.taskInvolvedGroup, historicTaskInstanceQueryDto.taskInvolvedGroup) &&
        Objects.equals(this.taskHadCandidateUser, historicTaskInstanceQueryDto.taskHadCandidateUser) &&
        Objects.equals(this.taskHadCandidateGroup, historicTaskInstanceQueryDto.taskHadCandidateGroup) &&
        Objects.equals(this.withCandidateGroups, historicTaskInstanceQueryDto.withCandidateGroups) &&
        Objects.equals(this.withoutCandidateGroups, historicTaskInstanceQueryDto.withoutCandidateGroups) &&
        Objects.equals(this.orQueries, historicTaskInstanceQueryDto.orQueries) &&
        Objects.equals(this.sorting, historicTaskInstanceQueryDto.sorting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskId, taskParentTaskId, processInstanceId, processInstanceBusinessKey, processInstanceBusinessKeyIn, processInstanceBusinessKeyLike, executionId, processDefinitionId, processDefinitionKey, processDefinitionName, caseInstanceId, caseExecutionId, caseDefinitionId, caseDefinitionKey, caseDefinitionName, activityInstanceIdIn, taskName, taskNameLike, taskDescription, taskDescriptionLike, taskDefinitionKey, taskDefinitionKeyIn, taskDeleteReason, taskDeleteReasonLike, taskAssignee, taskAssigneeLike, taskOwner, taskOwnerLike, taskPriority, assigned, unassigned, finished, unfinished, processFinished, processUnfinished, taskDueDate, taskDueDateBefore, taskDueDateAfter, withoutTaskDueDate, taskFollowUpDate, taskFollowUpDateBefore, taskFollowUpDateAfter, startedBefore, startedAfter, finishedBefore, finishedAfter, tenantIdIn, withoutTenantId, taskVariables, processVariables, variableNamesIgnoreCase, variableValuesIgnoreCase, taskInvolvedUser, taskInvolvedGroup, taskHadCandidateUser, taskHadCandidateGroup, withCandidateGroups, withoutCandidateGroups, orQueries, sorting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricTaskInstanceQueryDto {\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    taskParentTaskId: ").append(toIndentedString(taskParentTaskId)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    processInstanceBusinessKey: ").append(toIndentedString(processInstanceBusinessKey)).append("\n");
    sb.append("    processInstanceBusinessKeyIn: ").append(toIndentedString(processInstanceBusinessKeyIn)).append("\n");
    sb.append("    processInstanceBusinessKeyLike: ").append(toIndentedString(processInstanceBusinessKeyLike)).append("\n");
    sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    processDefinitionName: ").append(toIndentedString(processDefinitionName)).append("\n");
    sb.append("    caseInstanceId: ").append(toIndentedString(caseInstanceId)).append("\n");
    sb.append("    caseExecutionId: ").append(toIndentedString(caseExecutionId)).append("\n");
    sb.append("    caseDefinitionId: ").append(toIndentedString(caseDefinitionId)).append("\n");
    sb.append("    caseDefinitionKey: ").append(toIndentedString(caseDefinitionKey)).append("\n");
    sb.append("    caseDefinitionName: ").append(toIndentedString(caseDefinitionName)).append("\n");
    sb.append("    activityInstanceIdIn: ").append(toIndentedString(activityInstanceIdIn)).append("\n");
    sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
    sb.append("    taskNameLike: ").append(toIndentedString(taskNameLike)).append("\n");
    sb.append("    taskDescription: ").append(toIndentedString(taskDescription)).append("\n");
    sb.append("    taskDescriptionLike: ").append(toIndentedString(taskDescriptionLike)).append("\n");
    sb.append("    taskDefinitionKey: ").append(toIndentedString(taskDefinitionKey)).append("\n");
    sb.append("    taskDefinitionKeyIn: ").append(toIndentedString(taskDefinitionKeyIn)).append("\n");
    sb.append("    taskDeleteReason: ").append(toIndentedString(taskDeleteReason)).append("\n");
    sb.append("    taskDeleteReasonLike: ").append(toIndentedString(taskDeleteReasonLike)).append("\n");
    sb.append("    taskAssignee: ").append(toIndentedString(taskAssignee)).append("\n");
    sb.append("    taskAssigneeLike: ").append(toIndentedString(taskAssigneeLike)).append("\n");
    sb.append("    taskOwner: ").append(toIndentedString(taskOwner)).append("\n");
    sb.append("    taskOwnerLike: ").append(toIndentedString(taskOwnerLike)).append("\n");
    sb.append("    taskPriority: ").append(toIndentedString(taskPriority)).append("\n");
    sb.append("    assigned: ").append(toIndentedString(assigned)).append("\n");
    sb.append("    unassigned: ").append(toIndentedString(unassigned)).append("\n");
    sb.append("    finished: ").append(toIndentedString(finished)).append("\n");
    sb.append("    unfinished: ").append(toIndentedString(unfinished)).append("\n");
    sb.append("    processFinished: ").append(toIndentedString(processFinished)).append("\n");
    sb.append("    processUnfinished: ").append(toIndentedString(processUnfinished)).append("\n");
    sb.append("    taskDueDate: ").append(toIndentedString(taskDueDate)).append("\n");
    sb.append("    taskDueDateBefore: ").append(toIndentedString(taskDueDateBefore)).append("\n");
    sb.append("    taskDueDateAfter: ").append(toIndentedString(taskDueDateAfter)).append("\n");
    sb.append("    withoutTaskDueDate: ").append(toIndentedString(withoutTaskDueDate)).append("\n");
    sb.append("    taskFollowUpDate: ").append(toIndentedString(taskFollowUpDate)).append("\n");
    sb.append("    taskFollowUpDateBefore: ").append(toIndentedString(taskFollowUpDateBefore)).append("\n");
    sb.append("    taskFollowUpDateAfter: ").append(toIndentedString(taskFollowUpDateAfter)).append("\n");
    sb.append("    startedBefore: ").append(toIndentedString(startedBefore)).append("\n");
    sb.append("    startedAfter: ").append(toIndentedString(startedAfter)).append("\n");
    sb.append("    finishedBefore: ").append(toIndentedString(finishedBefore)).append("\n");
    sb.append("    finishedAfter: ").append(toIndentedString(finishedAfter)).append("\n");
    sb.append("    tenantIdIn: ").append(toIndentedString(tenantIdIn)).append("\n");
    sb.append("    withoutTenantId: ").append(toIndentedString(withoutTenantId)).append("\n");
    sb.append("    taskVariables: ").append(toIndentedString(taskVariables)).append("\n");
    sb.append("    processVariables: ").append(toIndentedString(processVariables)).append("\n");
    sb.append("    variableNamesIgnoreCase: ").append(toIndentedString(variableNamesIgnoreCase)).append("\n");
    sb.append("    variableValuesIgnoreCase: ").append(toIndentedString(variableValuesIgnoreCase)).append("\n");
    sb.append("    taskInvolvedUser: ").append(toIndentedString(taskInvolvedUser)).append("\n");
    sb.append("    taskInvolvedGroup: ").append(toIndentedString(taskInvolvedGroup)).append("\n");
    sb.append("    taskHadCandidateUser: ").append(toIndentedString(taskHadCandidateUser)).append("\n");
    sb.append("    taskHadCandidateGroup: ").append(toIndentedString(taskHadCandidateGroup)).append("\n");
    sb.append("    withCandidateGroups: ").append(toIndentedString(withCandidateGroups)).append("\n");
    sb.append("    withoutCandidateGroups: ").append(toIndentedString(withoutCandidateGroups)).append("\n");
    sb.append("    orQueries: ").append(toIndentedString(orQueries)).append("\n");
    sb.append("    sorting: ").append(toIndentedString(sorting)).append("\n");
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

