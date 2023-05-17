package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;

/**
 * A Historic Task instance query which defines a list of Historic Task instances
 */
@Schema(description = "A Historic Task instance query which defines a list of Historic Task instances")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class HistoricTaskInstanceQueryDto   {
  @JsonProperty("taskId")
  private String taskId = null;

  @JsonProperty("taskParentTaskId")
  private String taskParentTaskId = null;

  @JsonProperty("processInstanceId")
  private String processInstanceId = null;

  @JsonProperty("processInstanceBusinessKey")
  private String processInstanceBusinessKey = null;

  @JsonProperty("processInstanceBusinessKeyIn")
  @Valid
  private List<String> processInstanceBusinessKeyIn = null;

  @JsonProperty("processInstanceBusinessKeyLike")
  private String processInstanceBusinessKeyLike = null;

  @JsonProperty("executionId")
  private String executionId = null;

  @JsonProperty("processDefinitionId")
  private String processDefinitionId = null;

  @JsonProperty("processDefinitionKey")
  private String processDefinitionKey = null;

  @JsonProperty("processDefinitionName")
  private String processDefinitionName = null;

  @JsonProperty("caseInstanceId")
  private String caseInstanceId = null;

  @JsonProperty("caseExecutionId")
  private String caseExecutionId = null;

  @JsonProperty("caseDefinitionId")
  private String caseDefinitionId = null;

  @JsonProperty("caseDefinitionKey")
  private String caseDefinitionKey = null;

  @JsonProperty("caseDefinitionName")
  private String caseDefinitionName = null;

  @JsonProperty("activityInstanceIdIn")
  @Valid
  private List<String> activityInstanceIdIn = null;

  @JsonProperty("taskName")
  private String taskName = null;

  @JsonProperty("taskNameLike")
  private String taskNameLike = null;

  @JsonProperty("taskDescription")
  private String taskDescription = null;

  @JsonProperty("taskDescriptionLike")
  private String taskDescriptionLike = null;

  @JsonProperty("taskDefinitionKey")
  private String taskDefinitionKey = null;

  @JsonProperty("taskDefinitionKeyIn")
  @Valid
  private List<String> taskDefinitionKeyIn = null;

  @JsonProperty("taskDeleteReason")
  private String taskDeleteReason = null;

  @JsonProperty("taskDeleteReasonLike")
  private String taskDeleteReasonLike = null;

  @JsonProperty("taskAssignee")
  private String taskAssignee = null;

  @JsonProperty("taskAssigneeLike")
  private String taskAssigneeLike = null;

  @JsonProperty("taskOwner")
  private String taskOwner = null;

  @JsonProperty("taskOwnerLike")
  private String taskOwnerLike = null;

  @JsonProperty("taskPriority")
  private Integer taskPriority = null;

  @JsonProperty("assigned")
  private Boolean assigned = null;

  @JsonProperty("unassigned")
  private Boolean unassigned = null;

  @JsonProperty("finished")
  private Boolean finished = null;

  @JsonProperty("unfinished")
  private Boolean unfinished = null;

  @JsonProperty("processFinished")
  private Boolean processFinished = null;

  @JsonProperty("processUnfinished")
  private Boolean processUnfinished = null;

  @JsonProperty("taskDueDate")
  private OffsetDateTime taskDueDate = null;

  @JsonProperty("taskDueDateBefore")
  private OffsetDateTime taskDueDateBefore = null;

  @JsonProperty("taskDueDateAfter")
  private OffsetDateTime taskDueDateAfter = null;

  @JsonProperty("withoutTaskDueDate")
  private Boolean withoutTaskDueDate = null;

  @JsonProperty("taskFollowUpDate")
  private OffsetDateTime taskFollowUpDate = null;

  @JsonProperty("taskFollowUpDateBefore")
  private OffsetDateTime taskFollowUpDateBefore = null;

  @JsonProperty("taskFollowUpDateAfter")
  private OffsetDateTime taskFollowUpDateAfter = null;

  @JsonProperty("startedBefore")
  private OffsetDateTime startedBefore = null;

  @JsonProperty("startedAfter")
  private OffsetDateTime startedAfter = null;

  @JsonProperty("finishedBefore")
  private OffsetDateTime finishedBefore = null;

  @JsonProperty("finishedAfter")
  private OffsetDateTime finishedAfter = null;

  @JsonProperty("tenantIdIn")
  @Valid
  private List<String> tenantIdIn = null;

  @JsonProperty("withoutTenantId")
  private Boolean withoutTenantId = null;

  @JsonProperty("taskVariables")
  @Valid
  private List<VariableQueryParameterDto> taskVariables = null;

  @JsonProperty("processVariables")
  @Valid
  private List<VariableQueryParameterDto> processVariables = null;

  @JsonProperty("variableNamesIgnoreCase")
  private Boolean variableNamesIgnoreCase = null;

  @JsonProperty("variableValuesIgnoreCase")
  private Boolean variableValuesIgnoreCase = null;

  @JsonProperty("taskInvolvedUser")
  private String taskInvolvedUser = null;

  @JsonProperty("taskInvolvedGroup")
  private String taskInvolvedGroup = null;

  @JsonProperty("taskHadCandidateUser")
  private String taskHadCandidateUser = null;

  @JsonProperty("taskHadCandidateGroup")
  private String taskHadCandidateGroup = null;

  @JsonProperty("withCandidateGroups")
  private Boolean withCandidateGroups = null;

  @JsonProperty("withoutCandidateGroups")
  private Boolean withoutCandidateGroups = null;

  @JsonProperty("orQueries")
  @Valid
  private List<HistoricTaskInstanceQueryDto> orQueries = null;

  @JsonProperty("sorting")
  @Valid
  private List<HistoricTaskInstanceQueryDtoSorting> sorting = null;

  public HistoricTaskInstanceQueryDto taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

  /**
   * Filter by task id.
   * @return taskId
   **/
  @Schema(description = "Filter by task id.")
  
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
   **/
  @Schema(description = "Filter by parent task id.")
  
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
   **/
  @Schema(description = "Filter by process instance id.")
  
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
   **/
  @Schema(description = "Filter by process instance business key.")
  
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
   **/
  @Schema(description = "Filter by process instances with one of the give business keys. The keys need to be in a comma-separated list.")
  
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
   **/
  @Schema(description = "Filter by  process instance business key that has the parameter value as a substring.")
  
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
   **/
  @Schema(description = "Filter by the id of the execution that executed the task.")
  
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
   **/
  @Schema(description = "Filter by process definition id.")
  
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
   **/
  @Schema(description = "Restrict to tasks that belong to a process definition with the given key.")
  
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
   **/
  @Schema(description = "Restrict to tasks that belong to a process definition with the given name.")
  
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
   **/
  @Schema(description = "Filter by case instance id.")
  
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
   **/
  @Schema(description = "Filter by the id of the case execution that executed the task.")
  
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
   **/
  @Schema(description = "Filter by case definition id.")
  
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
   **/
  @Schema(description = "Restrict to tasks that belong to a case definition with the given key.")
  
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
   **/
  @Schema(description = "Restrict to tasks that belong to a case definition with the given name.")
  
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
   **/
  @Schema(description = "Only include tasks which belong to one of the passed  activity instance ids.")
  
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
   **/
  @Schema(description = "Restrict to tasks that have the given name.")
  
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
   **/
  @Schema(description = "Restrict to tasks that have a name with the given parameter value as substring.")
  
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
   **/
  @Schema(description = "Restrict to tasks that have the given description.")
  
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
   **/
  @Schema(description = "Restrict to tasks that have a description that has the parameter value as a substring.")
  
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
   **/
  @Schema(description = "Restrict to tasks that have the given key.")
  
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
   **/
  @Schema(description = "Restrict to tasks that have one of the passed  task definition keys.")
  
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
   **/
  @Schema(description = "Restrict to tasks that have the given delete reason.")
  
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
   **/
  @Schema(description = "Restrict to tasks that have a delete reason that has the parameter value as a substring.")
  
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
   **/
  @Schema(description = "Restrict to tasks that the given user is assigned to.")
  
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
   **/
  @Schema(description = "Restrict to tasks that are assigned to users with the parameter value as a substring.")
  
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
   **/
  @Schema(description = "Restrict to tasks that the given user owns.")
  
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
   **/
  @Schema(description = "Restrict to tasks that are owned by users with the parameter value as a substring.")
  
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
   **/
  @Schema(description = "Restrict to tasks that have the given priority.")
  
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
   **/
  @Schema(description = "If set to `true`, restricts the query to all tasks that are assigned.")
  
    public Boolean isAssigned() {
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
   **/
  @Schema(description = "If set to `true`, restricts the query to all tasks that are unassigned.")
  
    public Boolean isUnassigned() {
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
   **/
  @Schema(description = "Only include finished tasks. Value may only be `true`, as `false` is the default behavior.")
  
    public Boolean isFinished() {
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
   **/
  @Schema(description = "Only include unfinished tasks. Value may only be `true`, as `false` is the default behavior.")
  
    public Boolean isUnfinished() {
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
   **/
  @Schema(description = "Only include tasks of finished processes. Value may only be `true`, as `false` is the default behavior.")
  
    public Boolean isProcessFinished() {
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
   **/
  @Schema(description = "Only include tasks of unfinished processes. Value may only be `true`, as `false` is the default behavior.")
  
    public Boolean isProcessUnfinished() {
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
   **/
  @Schema(description = "Restrict to tasks that are due on the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.")
  
    @Valid
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
   **/
  @Schema(description = "Restrict to tasks that are due before the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.")
  
    @Valid
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
   **/
  @Schema(description = "Restrict to tasks that are due after the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.")
  
    @Valid
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
   **/
  @Schema(description = "Only include tasks which have no due date. Value may only be `true`, as `false` is the default behavior.")
  
    public Boolean isWithoutTaskDueDate() {
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
   **/
  @Schema(description = "Restrict to tasks that have a followUp date on the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.")
  
    @Valid
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
   **/
  @Schema(description = "Restrict to tasks that have a followUp date before the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.")
  
    @Valid
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
   **/
  @Schema(description = "Restrict to tasks that have a followUp date after the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.")
  
    @Valid
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
   **/
  @Schema(description = "Restrict to tasks that were started before the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.")
  
    @Valid
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
   **/
  @Schema(description = "Restrict to tasks that were started after the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.")
  
    @Valid
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
   **/
  @Schema(description = "Restrict to tasks that were finished before the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.")
  
    @Valid
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
   **/
  @Schema(description = "Restrict to tasks that were finished after the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.")
  
    @Valid
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
   **/
  @Schema(description = "Filter by a  list of tenant ids. A task instance must have one of the given tenant ids.")
  
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
   **/
  @Schema(description = "Only include historic task instances that belong to no tenant. Value may only be `true`, as `false` is the default behavior.")
  
    public Boolean isWithoutTenantId() {
    return withoutTenantId;
  }

  public void setWithoutTenantId(Boolean withoutTenantId) {
    this.withoutTenantId = withoutTenantId;
  }

  public HistoricTaskInstanceQueryDto taskVariables(List<VariableQueryParameterDto> taskVariables) {
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
   **/
  @Schema(description = "Only include tasks that have variables with certain values. Variable filtering expressions are comma-separated and are structured as follows:  A valid parameter value has the form `key_operator_value`. `key` is the variable name, `operator` is the comparison operator to be used and `value` the variable value. **Note:** Values are always treated as `String` objects on server side.   Valid operator values are: * `eq` - equal to; * `neq` - not equal to; * `gt` - greater than; * `gteq` - greater than or equal to; * `lt` - lower than; * `lteq` - lower than or equal to; * `like`.  `key` and `value` may not contain underscore or comma characters.")
      @Valid
    public List<VariableQueryParameterDto> getTaskVariables() {
    return taskVariables;
  }

  public void setTaskVariables(List<VariableQueryParameterDto> taskVariables) {
    this.taskVariables = taskVariables;
  }

  public HistoricTaskInstanceQueryDto processVariables(List<VariableQueryParameterDto> processVariables) {
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
   **/
  @Schema(description = "Only include tasks that belong to process instances that have variables with certain values. Variable filtering expressions are comma-separated and are structured as follows:  A valid parameter value has the form `key_operator_value`. `key` is the variable name, `operator` is the comparison operator to be used and `value` the variable value. **Note:** Values are always treated as `String` objects on server side.   Valid operator values are: * `eq` - equal to; * `neq` - not equal to; * `gt` - greater than; * `gteq` - greater than or equal to; * `lt` - lower than; * `lteq` - lower than or equal to; * `like`; * `notLike`.  `key` and `value` may not contain underscore or comma characters.")
      @Valid
    public List<VariableQueryParameterDto> getProcessVariables() {
    return processVariables;
  }

  public void setProcessVariables(List<VariableQueryParameterDto> processVariables) {
    this.processVariables = processVariables;
  }

  public HistoricTaskInstanceQueryDto variableNamesIgnoreCase(Boolean variableNamesIgnoreCase) {
    this.variableNamesIgnoreCase = variableNamesIgnoreCase;
    return this;
  }

  /**
   * Match the variable name provided in `taskVariables` and `processVariables` case- insensitively. If set to `true` **variableName** and **variablename** are treated as equal.
   * @return variableNamesIgnoreCase
   **/
  @Schema(description = "Match the variable name provided in `taskVariables` and `processVariables` case- insensitively. If set to `true` **variableName** and **variablename** are treated as equal.")
  
    public Boolean isVariableNamesIgnoreCase() {
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
   **/
  @Schema(description = "Match the variable value provided in `taskVariables` and `processVariables` case- insensitively. If set to `true` **variableValue** and **variablevalue** are treated as equal.")
  
    public Boolean isVariableValuesIgnoreCase() {
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
   **/
  @Schema(description = "Restrict to tasks with a historic identity link to the given user.")
  
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
   **/
  @Schema(description = "Restrict to tasks with a historic identity link to the given group.")
  
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
   **/
  @Schema(description = "Restrict to tasks with a historic identity link to the given candidate user.")
  
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
   **/
  @Schema(description = "Restrict to tasks with a historic identity link to the given candidate group.")
  
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
   **/
  @Schema(description = "Only include tasks which have a candidate group. Value may only be `true`, as `false` is the default behavior.")
  
    public Boolean isWithCandidateGroups() {
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
   **/
  @Schema(description = "Only include tasks which have no candidate group. Value may only be `true`, as `false` is the default behavior.")
  
    public Boolean isWithoutCandidateGroups() {
    return withoutCandidateGroups;
  }

  public void setWithoutCandidateGroups(Boolean withoutCandidateGroups) {
    this.withoutCandidateGroups = withoutCandidateGroups;
  }

  public HistoricTaskInstanceQueryDto orQueries(List<HistoricTaskInstanceQueryDto> orQueries) {
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
   **/
  @Schema(description = "A JSON array of nested historic task instance queries with OR semantics.  A task instance matches a nested query if it fulfills at least one of the query's predicates.  With multiple nested queries, a task instance must fulfill at least one predicate of each query ([Conjunctive Normal Form](https://en.wikipedia.org/wiki/Conjunctive_normal_form)).  All task instance query properties can be used except for: `sorting`, `withCandidateGroups`, ` withoutCandidateGroups`.  See the [User Guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/process-engine-api/#or-queries) for more information about OR queries.")
      @Valid
    public List<HistoricTaskInstanceQueryDto> getOrQueries() {
    return orQueries;
  }

  public void setOrQueries(List<HistoricTaskInstanceQueryDto> orQueries) {
    this.orQueries = orQueries;
  }

  public HistoricTaskInstanceQueryDto sorting(List<HistoricTaskInstanceQueryDtoSorting> sorting) {
    this.sorting = sorting;
    return this;
  }

  public HistoricTaskInstanceQueryDto addSortingItem(HistoricTaskInstanceQueryDtoSorting sortingItem) {
    if (this.sorting == null) {
      this.sorting = new ArrayList<>();
    }
    this.sorting.add(sortingItem);
    return this;
  }

  /**
   * An array of criteria to sort the result by. Each element of the array is                     an object that specifies one ordering. The position in the array                     identifies the rank of an ordering, i.e., whether it is primary, secondary,                     etc. Sorting has no effect for `count` endpoints
   * @return sorting
   **/
  @Schema(description = "An array of criteria to sort the result by. Each element of the array is                     an object that specifies one ordering. The position in the array                     identifies the rank of an ordering, i.e., whether it is primary, secondary,                     etc. Sorting has no effect for `count` endpoints")
      @Valid
    public List<HistoricTaskInstanceQueryDtoSorting> getSorting() {
    return sorting;
  }

  public void setSorting(List<HistoricTaskInstanceQueryDtoSorting> sorting) {
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
