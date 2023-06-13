package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tosan.camunda.camundaclient.generated.model.TaskQueryDtoSortingInner;
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
 * A Task query which defines a group of Tasks.
 */

@Schema(name = "TaskQueryDto", description = "A Task query which defines a group of Tasks.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class TaskQueryDto {

  private String processInstanceId = null;

  @Valid
  private List<String> processInstanceIdIn;

  private String processInstanceBusinessKey = null;

  private String processInstanceBusinessKeyExpression = null;

  @Valid
  private List<String> processInstanceBusinessKeyIn;

  private String processInstanceBusinessKeyLike = null;

  private String processInstanceBusinessKeyLikeExpression = null;

  private String processDefinitionId = null;

  private String processDefinitionKey = null;

  @Valid
  private List<String> processDefinitionKeyIn;

  private String processDefinitionName = null;

  private String processDefinitionNameLike = null;

  private String executionId = null;

  private String caseInstanceId = null;

  private String caseInstanceBusinessKey = null;

  private String caseInstanceBusinessKeyLike = null;

  private String caseDefinitionId = null;

  private String caseDefinitionKey = null;

  private String caseDefinitionName = null;

  private String caseDefinitionNameLike = null;

  private String caseExecutionId = null;

  @Valid
  private List<String> activityInstanceIdIn;

  @Valid
  private List<String> tenantIdIn;

  private Boolean withoutTenantId = null;

  private String assignee = null;

  private String assigneeExpression = null;

  private String assigneeLike = null;

  private String assigneeLikeExpression = null;

  @Valid
  private List<String> assigneeIn;

  @Valid
  private List<String> assigneeNotIn;

  private String owner = null;

  private String ownerExpression = null;

  private String candidateGroup = null;

  private String candidateGroupExpression = null;

  private String candidateUser = null;

  private String candidateUserExpression = null;

  private Boolean includeAssignedTasks = null;

  private String involvedUser = null;

  private String involvedUserExpression = null;

  private Boolean assigned = null;

  private Boolean unassigned = null;

  private String taskDefinitionKey = null;

  @Valid
  private List<String> taskDefinitionKeyIn;

  private String taskDefinitionKeyLike = null;

  private String name = null;

  private String nameNotEqual = null;

  private String nameLike = null;

  private String nameNotLike = null;

  private String description = null;

  private String descriptionLike = null;

  private Integer priority = null;

  private Integer maxPriority = null;

  private Integer minPriority = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dueDate = null;

  private String dueDateExpression = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dueAfter = null;

  private String dueAfterExpression = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dueBefore = null;

  private String dueBeforeExpression = null;

  private Boolean withoutDueDate = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime followUpDate = null;

  private String followUpDateExpression = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime followUpAfter = null;

  private String followUpAfterExpression = null;

  private String followUpBefore = null;

  private String followUpBeforeExpression = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime followUpBeforeOrNotExistent = null;

  private String followUpBeforeOrNotExistentExpression = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdOn = null;

  private String createdOnExpression = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAfter = null;

  private String createdAfterExpression = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdBefore = null;

  private String createdBeforeExpression = null;

  /**
   * Restrict to tasks that are in the given delegation state. Valid values are `PENDING` and `RESOLVED`.
   */
  public enum DelegationStateEnum {
    PENDING("PENDING"),
    
    RESOLVED("RESOLVED");

    private String value;

    DelegationStateEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DelegationStateEnum fromValue(String value) {
      for (DelegationStateEnum b : DelegationStateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  private DelegationStateEnum delegationState = null;

  @Valid
  private List<String> candidateGroups;

  private String candidateGroupsExpression = null;

  private Boolean withCandidateGroups = null;

  private Boolean withoutCandidateGroups = null;

  private Boolean withCandidateUsers = null;

  private Boolean withoutCandidateUsers = null;

  private Boolean active = null;

  private Boolean suspended = null;

  @Valid
  private List<@Valid VariableQueryParameterDto> taskVariables;

  @Valid
  private List<@Valid VariableQueryParameterDto> processVariables;

  @Valid
  private List<@Valid VariableQueryParameterDto> caseInstanceVariables;

  private Boolean variableNamesIgnoreCase = null;

  private Boolean variableValuesIgnoreCase = null;

  private String parentTaskId = null;

  @Valid
  private List<@Valid TaskQueryDto> orQueries;

  @Valid
  private List<@Valid TaskQueryDtoSortingInner> sorting;

  public TaskQueryDto processInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
    return this;
  }

  /**
   * Restrict to tasks that belong to process instances with the given id.
   * @return processInstanceId
  */
  
  @Schema(name = "processInstanceId", description = "Restrict to tasks that belong to process instances with the given id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processInstanceId")
  public String getProcessInstanceId() {
    return processInstanceId;
  }

  public void setProcessInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
  }

  public TaskQueryDto processInstanceIdIn(List<String> processInstanceIdIn) {
    this.processInstanceIdIn = processInstanceIdIn;
    return this;
  }

  public TaskQueryDto addProcessInstanceIdInItem(String processInstanceIdInItem) {
    if (this.processInstanceIdIn == null) {
      this.processInstanceIdIn = new ArrayList<>();
    }
    this.processInstanceIdIn.add(processInstanceIdInItem);
    return this;
  }

  /**
   * Restrict to tasks that belong to process instances with the given ids.
   * @return processInstanceIdIn
  */
  
  @Schema(name = "processInstanceIdIn", description = "Restrict to tasks that belong to process instances with the given ids.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processInstanceIdIn")
  public List<String> getProcessInstanceIdIn() {
    return processInstanceIdIn;
  }

  public void setProcessInstanceIdIn(List<String> processInstanceIdIn) {
    this.processInstanceIdIn = processInstanceIdIn;
  }

  public TaskQueryDto processInstanceBusinessKey(String processInstanceBusinessKey) {
    this.processInstanceBusinessKey = processInstanceBusinessKey;
    return this;
  }

  /**
   * Restrict to tasks that belong to process instances with the given business key.
   * @return processInstanceBusinessKey
  */
  
  @Schema(name = "processInstanceBusinessKey", description = "Restrict to tasks that belong to process instances with the given business key.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processInstanceBusinessKey")
  public String getProcessInstanceBusinessKey() {
    return processInstanceBusinessKey;
  }

  public void setProcessInstanceBusinessKey(String processInstanceBusinessKey) {
    this.processInstanceBusinessKey = processInstanceBusinessKey;
  }

  public TaskQueryDto processInstanceBusinessKeyExpression(String processInstanceBusinessKeyExpression) {
    this.processInstanceBusinessKeyExpression = processInstanceBusinessKeyExpression;
    return this;
  }

  /**
   * Restrict to tasks that belong to process instances with the given business key which  is described by an expression. See the  [user guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/expression-language/#internal-context-functions) for more information on available functions.
   * @return processInstanceBusinessKeyExpression
  */
  
  @Schema(name = "processInstanceBusinessKeyExpression", description = "Restrict to tasks that belong to process instances with the given business key which  is described by an expression. See the  [user guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/expression-language/#internal-context-functions) for more information on available functions.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processInstanceBusinessKeyExpression")
  public String getProcessInstanceBusinessKeyExpression() {
    return processInstanceBusinessKeyExpression;
  }

  public void setProcessInstanceBusinessKeyExpression(String processInstanceBusinessKeyExpression) {
    this.processInstanceBusinessKeyExpression = processInstanceBusinessKeyExpression;
  }

  public TaskQueryDto processInstanceBusinessKeyIn(List<String> processInstanceBusinessKeyIn) {
    this.processInstanceBusinessKeyIn = processInstanceBusinessKeyIn;
    return this;
  }

  public TaskQueryDto addProcessInstanceBusinessKeyInItem(String processInstanceBusinessKeyInItem) {
    if (this.processInstanceBusinessKeyIn == null) {
      this.processInstanceBusinessKeyIn = new ArrayList<>();
    }
    this.processInstanceBusinessKeyIn.add(processInstanceBusinessKeyInItem);
    return this;
  }

  /**
   * Restrict to tasks that belong to process instances with one of the give business keys.  The keys need to be in a comma-separated list.
   * @return processInstanceBusinessKeyIn
  */
  
  @Schema(name = "processInstanceBusinessKeyIn", description = "Restrict to tasks that belong to process instances with one of the give business keys.  The keys need to be in a comma-separated list.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processInstanceBusinessKeyIn")
  public List<String> getProcessInstanceBusinessKeyIn() {
    return processInstanceBusinessKeyIn;
  }

  public void setProcessInstanceBusinessKeyIn(List<String> processInstanceBusinessKeyIn) {
    this.processInstanceBusinessKeyIn = processInstanceBusinessKeyIn;
  }

  public TaskQueryDto processInstanceBusinessKeyLike(String processInstanceBusinessKeyLike) {
    this.processInstanceBusinessKeyLike = processInstanceBusinessKeyLike;
    return this;
  }

  /**
   * Restrict to tasks that have a process instance business key that has the parameter  value as a substring.
   * @return processInstanceBusinessKeyLike
  */
  
  @Schema(name = "processInstanceBusinessKeyLike", description = "Restrict to tasks that have a process instance business key that has the parameter  value as a substring.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processInstanceBusinessKeyLike")
  public String getProcessInstanceBusinessKeyLike() {
    return processInstanceBusinessKeyLike;
  }

  public void setProcessInstanceBusinessKeyLike(String processInstanceBusinessKeyLike) {
    this.processInstanceBusinessKeyLike = processInstanceBusinessKeyLike;
  }

  public TaskQueryDto processInstanceBusinessKeyLikeExpression(String processInstanceBusinessKeyLikeExpression) {
    this.processInstanceBusinessKeyLikeExpression = processInstanceBusinessKeyLikeExpression;
    return this;
  }

  /**
   * Restrict to tasks that have a process instance business key that has the parameter  value as a substring and is described by an expression. See the [user guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/expression-language/#internal-context-functions)  for more information on available functions.
   * @return processInstanceBusinessKeyLikeExpression
  */
  
  @Schema(name = "processInstanceBusinessKeyLikeExpression", description = "Restrict to tasks that have a process instance business key that has the parameter  value as a substring and is described by an expression. See the [user guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/expression-language/#internal-context-functions)  for more information on available functions.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processInstanceBusinessKeyLikeExpression")
  public String getProcessInstanceBusinessKeyLikeExpression() {
    return processInstanceBusinessKeyLikeExpression;
  }

  public void setProcessInstanceBusinessKeyLikeExpression(String processInstanceBusinessKeyLikeExpression) {
    this.processInstanceBusinessKeyLikeExpression = processInstanceBusinessKeyLikeExpression;
  }

  public TaskQueryDto processDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
    return this;
  }

  /**
   * Restrict to tasks that belong to a process definition with the given id.
   * @return processDefinitionId
  */
  
  @Schema(name = "processDefinitionId", description = "Restrict to tasks that belong to a process definition with the given id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionId")
  public String getProcessDefinitionId() {
    return processDefinitionId;
  }

  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }

  public TaskQueryDto processDefinitionKey(String processDefinitionKey) {
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

  public TaskQueryDto processDefinitionKeyIn(List<String> processDefinitionKeyIn) {
    this.processDefinitionKeyIn = processDefinitionKeyIn;
    return this;
  }

  public TaskQueryDto addProcessDefinitionKeyInItem(String processDefinitionKeyInItem) {
    if (this.processDefinitionKeyIn == null) {
      this.processDefinitionKeyIn = new ArrayList<>();
    }
    this.processDefinitionKeyIn.add(processDefinitionKeyInItem);
    return this;
  }

  /**
   * Restrict to tasks that belong to a process definition with one of the given keys. The  keys need to be in a comma-separated list.
   * @return processDefinitionKeyIn
  */
  
  @Schema(name = "processDefinitionKeyIn", description = "Restrict to tasks that belong to a process definition with one of the given keys. The  keys need to be in a comma-separated list.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionKeyIn")
  public List<String> getProcessDefinitionKeyIn() {
    return processDefinitionKeyIn;
  }

  public void setProcessDefinitionKeyIn(List<String> processDefinitionKeyIn) {
    this.processDefinitionKeyIn = processDefinitionKeyIn;
  }

  public TaskQueryDto processDefinitionName(String processDefinitionName) {
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

  public TaskQueryDto processDefinitionNameLike(String processDefinitionNameLike) {
    this.processDefinitionNameLike = processDefinitionNameLike;
    return this;
  }

  /**
   * Restrict to tasks that have a process definition name that has the parameter value as  a substring.
   * @return processDefinitionNameLike
  */
  
  @Schema(name = "processDefinitionNameLike", description = "Restrict to tasks that have a process definition name that has the parameter value as  a substring.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionNameLike")
  public String getProcessDefinitionNameLike() {
    return processDefinitionNameLike;
  }

  public void setProcessDefinitionNameLike(String processDefinitionNameLike) {
    this.processDefinitionNameLike = processDefinitionNameLike;
  }

  public TaskQueryDto executionId(String executionId) {
    this.executionId = executionId;
    return this;
  }

  /**
   * Restrict to tasks that belong to an execution with the given id.
   * @return executionId
  */
  
  @Schema(name = "executionId", description = "Restrict to tasks that belong to an execution with the given id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("executionId")
  public String getExecutionId() {
    return executionId;
  }

  public void setExecutionId(String executionId) {
    this.executionId = executionId;
  }

  public TaskQueryDto caseInstanceId(String caseInstanceId) {
    this.caseInstanceId = caseInstanceId;
    return this;
  }

  /**
   * Restrict to tasks that belong to case instances with the given id.
   * @return caseInstanceId
  */
  
  @Schema(name = "caseInstanceId", description = "Restrict to tasks that belong to case instances with the given id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("caseInstanceId")
  public String getCaseInstanceId() {
    return caseInstanceId;
  }

  public void setCaseInstanceId(String caseInstanceId) {
    this.caseInstanceId = caseInstanceId;
  }

  public TaskQueryDto caseInstanceBusinessKey(String caseInstanceBusinessKey) {
    this.caseInstanceBusinessKey = caseInstanceBusinessKey;
    return this;
  }

  /**
   * Restrict to tasks that belong to case instances with the given business key.
   * @return caseInstanceBusinessKey
  */
  
  @Schema(name = "caseInstanceBusinessKey", description = "Restrict to tasks that belong to case instances with the given business key.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("caseInstanceBusinessKey")
  public String getCaseInstanceBusinessKey() {
    return caseInstanceBusinessKey;
  }

  public void setCaseInstanceBusinessKey(String caseInstanceBusinessKey) {
    this.caseInstanceBusinessKey = caseInstanceBusinessKey;
  }

  public TaskQueryDto caseInstanceBusinessKeyLike(String caseInstanceBusinessKeyLike) {
    this.caseInstanceBusinessKeyLike = caseInstanceBusinessKeyLike;
    return this;
  }

  /**
   * Restrict to tasks that have a case instance business key that has the parameter value  as a substring.
   * @return caseInstanceBusinessKeyLike
  */
  
  @Schema(name = "caseInstanceBusinessKeyLike", description = "Restrict to tasks that have a case instance business key that has the parameter value  as a substring.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("caseInstanceBusinessKeyLike")
  public String getCaseInstanceBusinessKeyLike() {
    return caseInstanceBusinessKeyLike;
  }

  public void setCaseInstanceBusinessKeyLike(String caseInstanceBusinessKeyLike) {
    this.caseInstanceBusinessKeyLike = caseInstanceBusinessKeyLike;
  }

  public TaskQueryDto caseDefinitionId(String caseDefinitionId) {
    this.caseDefinitionId = caseDefinitionId;
    return this;
  }

  /**
   * Restrict to tasks that belong to a case definition with the given id.
   * @return caseDefinitionId
  */
  
  @Schema(name = "caseDefinitionId", description = "Restrict to tasks that belong to a case definition with the given id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("caseDefinitionId")
  public String getCaseDefinitionId() {
    return caseDefinitionId;
  }

  public void setCaseDefinitionId(String caseDefinitionId) {
    this.caseDefinitionId = caseDefinitionId;
  }

  public TaskQueryDto caseDefinitionKey(String caseDefinitionKey) {
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

  public TaskQueryDto caseDefinitionName(String caseDefinitionName) {
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

  public TaskQueryDto caseDefinitionNameLike(String caseDefinitionNameLike) {
    this.caseDefinitionNameLike = caseDefinitionNameLike;
    return this;
  }

  /**
   * Restrict to tasks that have a case definition name that has the parameter value as a  substring.
   * @return caseDefinitionNameLike
  */
  
  @Schema(name = "caseDefinitionNameLike", description = "Restrict to tasks that have a case definition name that has the parameter value as a  substring.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("caseDefinitionNameLike")
  public String getCaseDefinitionNameLike() {
    return caseDefinitionNameLike;
  }

  public void setCaseDefinitionNameLike(String caseDefinitionNameLike) {
    this.caseDefinitionNameLike = caseDefinitionNameLike;
  }

  public TaskQueryDto caseExecutionId(String caseExecutionId) {
    this.caseExecutionId = caseExecutionId;
    return this;
  }

  /**
   * Restrict to tasks that belong to a case execution with the given id.
   * @return caseExecutionId
  */
  
  @Schema(name = "caseExecutionId", description = "Restrict to tasks that belong to a case execution with the given id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("caseExecutionId")
  public String getCaseExecutionId() {
    return caseExecutionId;
  }

  public void setCaseExecutionId(String caseExecutionId) {
    this.caseExecutionId = caseExecutionId;
  }

  public TaskQueryDto activityInstanceIdIn(List<String> activityInstanceIdIn) {
    this.activityInstanceIdIn = activityInstanceIdIn;
    return this;
  }

  public TaskQueryDto addActivityInstanceIdInItem(String activityInstanceIdInItem) {
    if (this.activityInstanceIdIn == null) {
      this.activityInstanceIdIn = new ArrayList<>();
    }
    this.activityInstanceIdIn.add(activityInstanceIdInItem);
    return this;
  }

  /**
   * Only include tasks which belong to one of the passed and comma-separated activity  instance ids.
   * @return activityInstanceIdIn
  */
  
  @Schema(name = "activityInstanceIdIn", description = "Only include tasks which belong to one of the passed and comma-separated activity  instance ids.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activityInstanceIdIn")
  public List<String> getActivityInstanceIdIn() {
    return activityInstanceIdIn;
  }

  public void setActivityInstanceIdIn(List<String> activityInstanceIdIn) {
    this.activityInstanceIdIn = activityInstanceIdIn;
  }

  public TaskQueryDto tenantIdIn(List<String> tenantIdIn) {
    this.tenantIdIn = tenantIdIn;
    return this;
  }

  public TaskQueryDto addTenantIdInItem(String tenantIdInItem) {
    if (this.tenantIdIn == null) {
      this.tenantIdIn = new ArrayList<>();
    }
    this.tenantIdIn.add(tenantIdInItem);
    return this;
  }

  /**
   * Only include tasks which belong to one of the passed and comma-separated  tenant ids.
   * @return tenantIdIn
  */
  
  @Schema(name = "tenantIdIn", description = "Only include tasks which belong to one of the passed and comma-separated  tenant ids.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tenantIdIn")
  public List<String> getTenantIdIn() {
    return tenantIdIn;
  }

  public void setTenantIdIn(List<String> tenantIdIn) {
    this.tenantIdIn = tenantIdIn;
  }

  public TaskQueryDto withoutTenantId(Boolean withoutTenantId) {
    this.withoutTenantId = withoutTenantId;
    return this;
  }

  /**
   * Only include tasks which belong to no tenant. Value may only be `true`,  as `false` is the default behavior.
   * @return withoutTenantId
  */
  
  @Schema(name = "withoutTenantId", description = "Only include tasks which belong to no tenant. Value may only be `true`,  as `false` is the default behavior.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("withoutTenantId")
  public Boolean getWithoutTenantId() {
    return withoutTenantId;
  }

  public void setWithoutTenantId(Boolean withoutTenantId) {
    this.withoutTenantId = withoutTenantId;
  }

  public TaskQueryDto assignee(String assignee) {
    this.assignee = assignee;
    return this;
  }

  /**
   * Restrict to tasks that the given user is assigned to.
   * @return assignee
  */
  
  @Schema(name = "assignee", description = "Restrict to tasks that the given user is assigned to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assignee")
  public String getAssignee() {
    return assignee;
  }

  public void setAssignee(String assignee) {
    this.assignee = assignee;
  }

  public TaskQueryDto assigneeExpression(String assigneeExpression) {
    this.assigneeExpression = assigneeExpression;
    return this;
  }

  /**
   * Restrict to tasks that the user described by the given expression is assigned to. See the [user guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/expression-language/#internal-context-functions)  for more information on available functions.
   * @return assigneeExpression
  */
  
  @Schema(name = "assigneeExpression", description = "Restrict to tasks that the user described by the given expression is assigned to. See the [user guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/expression-language/#internal-context-functions)  for more information on available functions.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assigneeExpression")
  public String getAssigneeExpression() {
    return assigneeExpression;
  }

  public void setAssigneeExpression(String assigneeExpression) {
    this.assigneeExpression = assigneeExpression;
  }

  public TaskQueryDto assigneeLike(String assigneeLike) {
    this.assigneeLike = assigneeLike;
    return this;
  }

  /**
   * Restrict to tasks that have an assignee that has the parameter  value as a substring.
   * @return assigneeLike
  */
  
  @Schema(name = "assigneeLike", description = "Restrict to tasks that have an assignee that has the parameter  value as a substring.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assigneeLike")
  public String getAssigneeLike() {
    return assigneeLike;
  }

  public void setAssigneeLike(String assigneeLike) {
    this.assigneeLike = assigneeLike;
  }

  public TaskQueryDto assigneeLikeExpression(String assigneeLikeExpression) {
    this.assigneeLikeExpression = assigneeLikeExpression;
    return this;
  }

  /**
   * Restrict to tasks that have an assignee that has the parameter value described by the  given expression as a substring. See the  [user guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/expression-language/#internal-context-functions)  for more information on available functions.
   * @return assigneeLikeExpression
  */
  
  @Schema(name = "assigneeLikeExpression", description = "Restrict to tasks that have an assignee that has the parameter value described by the  given expression as a substring. See the  [user guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/expression-language/#internal-context-functions)  for more information on available functions.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assigneeLikeExpression")
  public String getAssigneeLikeExpression() {
    return assigneeLikeExpression;
  }

  public void setAssigneeLikeExpression(String assigneeLikeExpression) {
    this.assigneeLikeExpression = assigneeLikeExpression;
  }

  public TaskQueryDto assigneeIn(List<String> assigneeIn) {
    this.assigneeIn = assigneeIn;
    return this;
  }

  public TaskQueryDto addAssigneeInItem(String assigneeInItem) {
    if (this.assigneeIn == null) {
      this.assigneeIn = new ArrayList<>();
    }
    this.assigneeIn.add(assigneeInItem);
    return this;
  }

  /**
   * Only include tasks which are assigned to one of the passed and comma-separated user ids.
   * @return assigneeIn
  */
  
  @Schema(name = "assigneeIn", description = "Only include tasks which are assigned to one of the passed and comma-separated user ids.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assigneeIn")
  public List<String> getAssigneeIn() {
    return assigneeIn;
  }

  public void setAssigneeIn(List<String> assigneeIn) {
    this.assigneeIn = assigneeIn;
  }

  public TaskQueryDto assigneeNotIn(List<String> assigneeNotIn) {
    this.assigneeNotIn = assigneeNotIn;
    return this;
  }

  public TaskQueryDto addAssigneeNotInItem(String assigneeNotInItem) {
    if (this.assigneeNotIn == null) {
      this.assigneeNotIn = new ArrayList<>();
    }
    this.assigneeNotIn.add(assigneeNotInItem);
    return this;
  }

  /**
   * Only include tasks which are not assigned to one of the passed and comma-separated user ids.
   * @return assigneeNotIn
  */
  
  @Schema(name = "assigneeNotIn", description = "Only include tasks which are not assigned to one of the passed and comma-separated user ids.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assigneeNotIn")
  public List<String> getAssigneeNotIn() {
    return assigneeNotIn;
  }

  public void setAssigneeNotIn(List<String> assigneeNotIn) {
    this.assigneeNotIn = assigneeNotIn;
  }

  public TaskQueryDto owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Restrict to tasks that the given user owns.
   * @return owner
  */
  
  @Schema(name = "owner", description = "Restrict to tasks that the given user owns.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("owner")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public TaskQueryDto ownerExpression(String ownerExpression) {
    this.ownerExpression = ownerExpression;
    return this;
  }

  /**
   * Restrict to tasks that the user described by the given expression owns. See the  [user guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/expression-language/#internal-context-functions)  for more information on available functions.
   * @return ownerExpression
  */
  
  @Schema(name = "ownerExpression", description = "Restrict to tasks that the user described by the given expression owns. See the  [user guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/expression-language/#internal-context-functions)  for more information on available functions.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ownerExpression")
  public String getOwnerExpression() {
    return ownerExpression;
  }

  public void setOwnerExpression(String ownerExpression) {
    this.ownerExpression = ownerExpression;
  }

  public TaskQueryDto candidateGroup(String candidateGroup) {
    this.candidateGroup = candidateGroup;
    return this;
  }

  /**
   * Only include tasks that are offered to the given group.
   * @return candidateGroup
  */
  
  @Schema(name = "candidateGroup", description = "Only include tasks that are offered to the given group.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("candidateGroup")
  public String getCandidateGroup() {
    return candidateGroup;
  }

  public void setCandidateGroup(String candidateGroup) {
    this.candidateGroup = candidateGroup;
  }

  public TaskQueryDto candidateGroupExpression(String candidateGroupExpression) {
    this.candidateGroupExpression = candidateGroupExpression;
    return this;
  }

  /**
   * Only include tasks that are offered to the group described by the given expression.  See the  [user guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/expression-language/#internal-context-functions)  for more information on available functions.
   * @return candidateGroupExpression
  */
  
  @Schema(name = "candidateGroupExpression", description = "Only include tasks that are offered to the group described by the given expression.  See the  [user guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/expression-language/#internal-context-functions)  for more information on available functions.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("candidateGroupExpression")
  public String getCandidateGroupExpression() {
    return candidateGroupExpression;
  }

  public void setCandidateGroupExpression(String candidateGroupExpression) {
    this.candidateGroupExpression = candidateGroupExpression;
  }

  public TaskQueryDto candidateUser(String candidateUser) {
    this.candidateUser = candidateUser;
    return this;
  }

  /**
   * Only include tasks that are offered to the given user or to one of his groups.
   * @return candidateUser
  */
  
  @Schema(name = "candidateUser", description = "Only include tasks that are offered to the given user or to one of his groups.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("candidateUser")
  public String getCandidateUser() {
    return candidateUser;
  }

  public void setCandidateUser(String candidateUser) {
    this.candidateUser = candidateUser;
  }

  public TaskQueryDto candidateUserExpression(String candidateUserExpression) {
    this.candidateUserExpression = candidateUserExpression;
    return this;
  }

  /**
   * Only include tasks that are offered to the user described by the given expression.  See the  [user guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/expression-language/#internal-context-functions)  for more information on available functions.
   * @return candidateUserExpression
  */
  
  @Schema(name = "candidateUserExpression", description = "Only include tasks that are offered to the user described by the given expression.  See the  [user guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/expression-language/#internal-context-functions)  for more information on available functions.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("candidateUserExpression")
  public String getCandidateUserExpression() {
    return candidateUserExpression;
  }

  public void setCandidateUserExpression(String candidateUserExpression) {
    this.candidateUserExpression = candidateUserExpression;
  }

  public TaskQueryDto includeAssignedTasks(Boolean includeAssignedTasks) {
    this.includeAssignedTasks = includeAssignedTasks;
    return this;
  }

  /**
   * Also include tasks that are assigned to users in candidate queries. Default is to only  include tasks that are not assigned to any user if you query by candidate user or group(s).
   * @return includeAssignedTasks
  */
  
  @Schema(name = "includeAssignedTasks", description = "Also include tasks that are assigned to users in candidate queries. Default is to only  include tasks that are not assigned to any user if you query by candidate user or group(s).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("includeAssignedTasks")
  public Boolean getIncludeAssignedTasks() {
    return includeAssignedTasks;
  }

  public void setIncludeAssignedTasks(Boolean includeAssignedTasks) {
    this.includeAssignedTasks = includeAssignedTasks;
  }

  public TaskQueryDto involvedUser(String involvedUser) {
    this.involvedUser = involvedUser;
    return this;
  }

  /**
   * Only include tasks that the given user is involved in. A user is involved in a task if  an identity link exists between task and user (e.g., the user is the assignee).
   * @return involvedUser
  */
  
  @Schema(name = "involvedUser", description = "Only include tasks that the given user is involved in. A user is involved in a task if  an identity link exists between task and user (e.g., the user is the assignee).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("involvedUser")
  public String getInvolvedUser() {
    return involvedUser;
  }

  public void setInvolvedUser(String involvedUser) {
    this.involvedUser = involvedUser;
  }

  public TaskQueryDto involvedUserExpression(String involvedUserExpression) {
    this.involvedUserExpression = involvedUserExpression;
    return this;
  }

  /**
   * Only include tasks that the user described by the given expression is involved in. A user is involved in a task if an identity link exists between task and user (e.g., the user is the assignee). See the [user guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/expression-language/#internal-context-functions) for more information on available functions.
   * @return involvedUserExpression
  */
  
  @Schema(name = "involvedUserExpression", description = "Only include tasks that the user described by the given expression is involved in. A user is involved in a task if an identity link exists between task and user (e.g., the user is the assignee). See the [user guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/expression-language/#internal-context-functions) for more information on available functions.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("involvedUserExpression")
  public String getInvolvedUserExpression() {
    return involvedUserExpression;
  }

  public void setInvolvedUserExpression(String involvedUserExpression) {
    this.involvedUserExpression = involvedUserExpression;
  }

  public TaskQueryDto assigned(Boolean assigned) {
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

  public TaskQueryDto unassigned(Boolean unassigned) {
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

  public TaskQueryDto taskDefinitionKey(String taskDefinitionKey) {
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

  public TaskQueryDto taskDefinitionKeyIn(List<String> taskDefinitionKeyIn) {
    this.taskDefinitionKeyIn = taskDefinitionKeyIn;
    return this;
  }

  public TaskQueryDto addTaskDefinitionKeyInItem(String taskDefinitionKeyInItem) {
    if (this.taskDefinitionKeyIn == null) {
      this.taskDefinitionKeyIn = new ArrayList<>();
    }
    this.taskDefinitionKeyIn.add(taskDefinitionKeyInItem);
    return this;
  }

  /**
   * Restrict to tasks that have one of the given keys. The keys need to be in a comma-separated list.
   * @return taskDefinitionKeyIn
  */
  
  @Schema(name = "taskDefinitionKeyIn", description = "Restrict to tasks that have one of the given keys. The keys need to be in a comma-separated list.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taskDefinitionKeyIn")
  public List<String> getTaskDefinitionKeyIn() {
    return taskDefinitionKeyIn;
  }

  public void setTaskDefinitionKeyIn(List<String> taskDefinitionKeyIn) {
    this.taskDefinitionKeyIn = taskDefinitionKeyIn;
  }

  public TaskQueryDto taskDefinitionKeyLike(String taskDefinitionKeyLike) {
    this.taskDefinitionKeyLike = taskDefinitionKeyLike;
    return this;
  }

  /**
   * Restrict to tasks that have a key that has the parameter value as a substring.
   * @return taskDefinitionKeyLike
  */
  
  @Schema(name = "taskDefinitionKeyLike", description = "Restrict to tasks that have a key that has the parameter value as a substring.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taskDefinitionKeyLike")
  public String getTaskDefinitionKeyLike() {
    return taskDefinitionKeyLike;
  }

  public void setTaskDefinitionKeyLike(String taskDefinitionKeyLike) {
    this.taskDefinitionKeyLike = taskDefinitionKeyLike;
  }

  public TaskQueryDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Restrict to tasks that have the given name.
   * @return name
  */
  
  @Schema(name = "name", description = "Restrict to tasks that have the given name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TaskQueryDto nameNotEqual(String nameNotEqual) {
    this.nameNotEqual = nameNotEqual;
    return this;
  }

  /**
   * Restrict to tasks that do not have the given name.
   * @return nameNotEqual
  */
  
  @Schema(name = "nameNotEqual", description = "Restrict to tasks that do not have the given name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nameNotEqual")
  public String getNameNotEqual() {
    return nameNotEqual;
  }

  public void setNameNotEqual(String nameNotEqual) {
    this.nameNotEqual = nameNotEqual;
  }

  public TaskQueryDto nameLike(String nameLike) {
    this.nameLike = nameLike;
    return this;
  }

  /**
   * Restrict to tasks that have a name with the given parameter value as substring.
   * @return nameLike
  */
  
  @Schema(name = "nameLike", description = "Restrict to tasks that have a name with the given parameter value as substring.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nameLike")
  public String getNameLike() {
    return nameLike;
  }

  public void setNameLike(String nameLike) {
    this.nameLike = nameLike;
  }

  public TaskQueryDto nameNotLike(String nameNotLike) {
    this.nameNotLike = nameNotLike;
    return this;
  }

  /**
   * Restrict to tasks that do not have a name with the given parameter value as substring.
   * @return nameNotLike
  */
  
  @Schema(name = "nameNotLike", description = "Restrict to tasks that do not have a name with the given parameter value as substring.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nameNotLike")
  public String getNameNotLike() {
    return nameNotLike;
  }

  public void setNameNotLike(String nameNotLike) {
    this.nameNotLike = nameNotLike;
  }

  public TaskQueryDto description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Restrict to tasks that have the given description.
   * @return description
  */
  
  @Schema(name = "description", description = "Restrict to tasks that have the given description.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TaskQueryDto descriptionLike(String descriptionLike) {
    this.descriptionLike = descriptionLike;
    return this;
  }

  /**
   * Restrict to tasks that have a description that has the parameter value as a substring.
   * @return descriptionLike
  */
  
  @Schema(name = "descriptionLike", description = "Restrict to tasks that have a description that has the parameter value as a substring.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("descriptionLike")
  public String getDescriptionLike() {
    return descriptionLike;
  }

  public void setDescriptionLike(String descriptionLike) {
    this.descriptionLike = descriptionLike;
  }

  public TaskQueryDto priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Restrict to tasks that have the given priority.
   * @return priority
  */
  
  @Schema(name = "priority", description = "Restrict to tasks that have the given priority.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("priority")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public TaskQueryDto maxPriority(Integer maxPriority) {
    this.maxPriority = maxPriority;
    return this;
  }

  /**
   * Restrict to tasks that have a lower or equal priority.
   * @return maxPriority
  */
  
  @Schema(name = "maxPriority", description = "Restrict to tasks that have a lower or equal priority.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxPriority")
  public Integer getMaxPriority() {
    return maxPriority;
  }

  public void setMaxPriority(Integer maxPriority) {
    this.maxPriority = maxPriority;
  }

  public TaskQueryDto minPriority(Integer minPriority) {
    this.minPriority = minPriority;
    return this;
  }

  /**
   * Restrict to tasks that have a higher or equal priority.
   * @return minPriority
  */
  
  @Schema(name = "minPriority", description = "Restrict to tasks that have a higher or equal priority.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minPriority")
  public Integer getMinPriority() {
    return minPriority;
  }

  public void setMinPriority(Integer minPriority) {
    this.minPriority = minPriority;
  }

  public TaskQueryDto dueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
    return this;
  }

  /**
   * Restrict to tasks that are due on the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.546+0200`.
   * @return dueDate
  */
  @Valid 
  @Schema(name = "dueDate", description = "Restrict to tasks that are due on the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.546+0200`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dueDate")
  public OffsetDateTime getDueDate() {
    return dueDate;
  }

  public void setDueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
  }

  public TaskQueryDto dueDateExpression(String dueDateExpression) {
    this.dueDateExpression = dueDateExpression;
    return this;
  }

  /**
   * Restrict to tasks that are due on the date described by the given expression. See the [user guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/expression-language/#internal-context-functions) for more information on available functions. The expression must evaluate to a `java.util.Date` or `org.joda.time.DateTime` object.
   * @return dueDateExpression
  */
  
  @Schema(name = "dueDateExpression", description = "Restrict to tasks that are due on the date described by the given expression. See the [user guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/expression-language/#internal-context-functions) for more information on available functions. The expression must evaluate to a `java.util.Date` or `org.joda.time.DateTime` object.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dueDateExpression")
  public String getDueDateExpression() {
    return dueDateExpression;
  }

  public void setDueDateExpression(String dueDateExpression) {
    this.dueDateExpression = dueDateExpression;
  }

  public TaskQueryDto dueAfter(OffsetDateTime dueAfter) {
    this.dueAfter = dueAfter;
    return this;
  }

  /**
   * Restrict to tasks that are due after the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.435+0200`.
   * @return dueAfter
  */
  @Valid 
  @Schema(name = "dueAfter", description = "Restrict to tasks that are due after the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.435+0200`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dueAfter")
  public OffsetDateTime getDueAfter() {
    return dueAfter;
  }

  public void setDueAfter(OffsetDateTime dueAfter) {
    this.dueAfter = dueAfter;
  }

  public TaskQueryDto dueAfterExpression(String dueAfterExpression) {
    this.dueAfterExpression = dueAfterExpression;
    return this;
  }

  /**
   * Restrict to tasks that are due after the date described by the given expression. See the [user guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/expression-language/#internal-context-functions) for more information on available functions. The expression must evaluate to a `java.util.Date` or `org.joda.time.DateTime` object.
   * @return dueAfterExpression
  */
  
  @Schema(name = "dueAfterExpression", description = "Restrict to tasks that are due after the date described by the given expression. See the [user guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/expression-language/#internal-context-functions) for more information on available functions. The expression must evaluate to a `java.util.Date` or `org.joda.time.DateTime` object.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dueAfterExpression")
  public String getDueAfterExpression() {
    return dueAfterExpression;
  }

  public void setDueAfterExpression(String dueAfterExpression) {
    this.dueAfterExpression = dueAfterExpression;
  }

  public TaskQueryDto dueBefore(OffsetDateTime dueBefore) {
    this.dueBefore = dueBefore;
    return this;
  }

  /**
   * Restrict to tasks that are due before the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.243+0200`.
   * @return dueBefore
  */
  @Valid 
  @Schema(name = "dueBefore", description = "Restrict to tasks that are due before the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.243+0200`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dueBefore")
  public OffsetDateTime getDueBefore() {
    return dueBefore;
  }

  public void setDueBefore(OffsetDateTime dueBefore) {
    this.dueBefore = dueBefore;
  }

  public TaskQueryDto dueBeforeExpression(String dueBeforeExpression) {
    this.dueBeforeExpression = dueBeforeExpression;
    return this;
  }

  /**
   * Restrict to tasks that are due before the date described by the given expression. See the [user guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/expression-language/#internal-context-functions) for more information on available functions. The expression must evaluate to a `java.util.Date` or `org.joda.time.DateTime` object.
   * @return dueBeforeExpression
  */
  
  @Schema(name = "dueBeforeExpression", description = "Restrict to tasks that are due before the date described by the given expression. See the [user guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/expression-language/#internal-context-functions) for more information on available functions. The expression must evaluate to a `java.util.Date` or `org.joda.time.DateTime` object.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dueBeforeExpression")
  public String getDueBeforeExpression() {
    return dueBeforeExpression;
  }

  public void setDueBeforeExpression(String dueBeforeExpression) {
    this.dueBeforeExpression = dueBeforeExpression;
  }

  public TaskQueryDto withoutDueDate(Boolean withoutDueDate) {
    this.withoutDueDate = withoutDueDate;
    return this;
  }

  /**
   * Only include tasks which have no due date. Value may only be `true`,  as `false` is the default behavior.
   * @return withoutDueDate
  */
  
  @Schema(name = "withoutDueDate", description = "Only include tasks which have no due date. Value may only be `true`,  as `false` is the default behavior.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("withoutDueDate")
  public Boolean getWithoutDueDate() {
    return withoutDueDate;
  }

  public void setWithoutDueDate(Boolean withoutDueDate) {
    this.withoutDueDate = withoutDueDate;
  }

  public TaskQueryDto followUpDate(OffsetDateTime followUpDate) {
    this.followUpDate = followUpDate;
    return this;
  }

  /**
   * Restrict to tasks that have a followUp date on the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.342+0200`.
   * @return followUpDate
  */
  @Valid 
  @Schema(name = "followUpDate", description = "Restrict to tasks that have a followUp date on the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.342+0200`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("followUpDate")
  public OffsetDateTime getFollowUpDate() {
    return followUpDate;
  }

  public void setFollowUpDate(OffsetDateTime followUpDate) {
    this.followUpDate = followUpDate;
  }

  public TaskQueryDto followUpDateExpression(String followUpDateExpression) {
    this.followUpDateExpression = followUpDateExpression;
    return this;
  }

  /**
   * Restrict to tasks that have a followUp date on the date described by the given expression. See the [user guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/expression-language/#internal-context-functions) for more information on available functions. The expression must evaluate to a `java.util.Date` or `org.joda.time.DateTime` object.
   * @return followUpDateExpression
  */
  
  @Schema(name = "followUpDateExpression", description = "Restrict to tasks that have a followUp date on the date described by the given expression. See the [user guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/expression-language/#internal-context-functions) for more information on available functions. The expression must evaluate to a `java.util.Date` or `org.joda.time.DateTime` object.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("followUpDateExpression")
  public String getFollowUpDateExpression() {
    return followUpDateExpression;
  }

  public void setFollowUpDateExpression(String followUpDateExpression) {
    this.followUpDateExpression = followUpDateExpression;
  }

  public TaskQueryDto followUpAfter(OffsetDateTime followUpAfter) {
    this.followUpAfter = followUpAfter;
    return this;
  }

  /**
   * Restrict to tasks that have a followUp date after the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.542+0200`.
   * @return followUpAfter
  */
  @Valid 
  @Schema(name = "followUpAfter", description = "Restrict to tasks that have a followUp date after the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.542+0200`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("followUpAfter")
  public OffsetDateTime getFollowUpAfter() {
    return followUpAfter;
  }

  public void setFollowUpAfter(OffsetDateTime followUpAfter) {
    this.followUpAfter = followUpAfter;
  }

  public TaskQueryDto followUpAfterExpression(String followUpAfterExpression) {
    this.followUpAfterExpression = followUpAfterExpression;
    return this;
  }

  /**
   * Restrict to tasks that have a followUp date after the date described by the given expression. See the [user guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/expression-language/#internal-context-functions) for more information on available functions. The expression must evaluate to a `java.util.Date` or `org.joda.time.DateTime` object.
   * @return followUpAfterExpression
  */
  
  @Schema(name = "followUpAfterExpression", description = "Restrict to tasks that have a followUp date after the date described by the given expression. See the [user guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/expression-language/#internal-context-functions) for more information on available functions. The expression must evaluate to a `java.util.Date` or `org.joda.time.DateTime` object.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("followUpAfterExpression")
  public String getFollowUpAfterExpression() {
    return followUpAfterExpression;
  }

  public void setFollowUpAfterExpression(String followUpAfterExpression) {
    this.followUpAfterExpression = followUpAfterExpression;
  }

  public TaskQueryDto followUpBefore(String followUpBefore) {
    this.followUpBefore = followUpBefore;
    return this;
  }

  /**
   * Restrict to tasks that have a followUp date before the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.234+0200`.
   * @return followUpBefore
  */
  
  @Schema(name = "followUpBefore", description = "Restrict to tasks that have a followUp date before the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.234+0200`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("followUpBefore")
  public String getFollowUpBefore() {
    return followUpBefore;
  }

  public void setFollowUpBefore(String followUpBefore) {
    this.followUpBefore = followUpBefore;
  }

  public TaskQueryDto followUpBeforeExpression(String followUpBeforeExpression) {
    this.followUpBeforeExpression = followUpBeforeExpression;
    return this;
  }

  /**
   * Restrict to tasks that have a followUp date before the date described by the given expression. See the [user guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/expression-language/#internal-context-functions) for more information on available functions. The expression must evaluate to a `java.util.Date` or `org.joda.time.DateTime` object.
   * @return followUpBeforeExpression
  */
  
  @Schema(name = "followUpBeforeExpression", description = "Restrict to tasks that have a followUp date before the date described by the given expression. See the [user guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/expression-language/#internal-context-functions) for more information on available functions. The expression must evaluate to a `java.util.Date` or `org.joda.time.DateTime` object.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("followUpBeforeExpression")
  public String getFollowUpBeforeExpression() {
    return followUpBeforeExpression;
  }

  public void setFollowUpBeforeExpression(String followUpBeforeExpression) {
    this.followUpBeforeExpression = followUpBeforeExpression;
  }

  public TaskQueryDto followUpBeforeOrNotExistent(OffsetDateTime followUpBeforeOrNotExistent) {
    this.followUpBeforeOrNotExistent = followUpBeforeOrNotExistent;
    return this;
  }

  /**
   * Restrict to tasks that have no followUp date or a followUp date before the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.432+0200`. The typical use case is to query all `active` tasks for a user for a given date.
   * @return followUpBeforeOrNotExistent
  */
  @Valid 
  @Schema(name = "followUpBeforeOrNotExistent", description = "Restrict to tasks that have no followUp date or a followUp date before the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.432+0200`. The typical use case is to query all `active` tasks for a user for a given date.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("followUpBeforeOrNotExistent")
  public OffsetDateTime getFollowUpBeforeOrNotExistent() {
    return followUpBeforeOrNotExistent;
  }

  public void setFollowUpBeforeOrNotExistent(OffsetDateTime followUpBeforeOrNotExistent) {
    this.followUpBeforeOrNotExistent = followUpBeforeOrNotExistent;
  }

  public TaskQueryDto followUpBeforeOrNotExistentExpression(String followUpBeforeOrNotExistentExpression) {
    this.followUpBeforeOrNotExistentExpression = followUpBeforeOrNotExistentExpression;
    return this;
  }

  /**
   * Restrict to tasks that have no followUp date or a followUp date before the date described by the given expression. See the [user guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/expression-language/#internal-context-functions) for more information on available functions. The expression must evaluate to a `java.util.Date` or `org.joda.time.DateTime` object.
   * @return followUpBeforeOrNotExistentExpression
  */
  
  @Schema(name = "followUpBeforeOrNotExistentExpression", description = "Restrict to tasks that have no followUp date or a followUp date before the date described by the given expression. See the [user guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/expression-language/#internal-context-functions) for more information on available functions. The expression must evaluate to a `java.util.Date` or `org.joda.time.DateTime` object.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("followUpBeforeOrNotExistentExpression")
  public String getFollowUpBeforeOrNotExistentExpression() {
    return followUpBeforeOrNotExistentExpression;
  }

  public void setFollowUpBeforeOrNotExistentExpression(String followUpBeforeOrNotExistentExpression) {
    this.followUpBeforeOrNotExistentExpression = followUpBeforeOrNotExistentExpression;
  }

  public TaskQueryDto createdOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
    return this;
  }

  /**
   * Restrict to tasks that were created on the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.324+0200`.
   * @return createdOn
  */
  @Valid 
  @Schema(name = "createdOn", description = "Restrict to tasks that were created on the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.324+0200`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdOn")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
  }

  public TaskQueryDto createdOnExpression(String createdOnExpression) {
    this.createdOnExpression = createdOnExpression;
    return this;
  }

  /**
   * Restrict to tasks that were created on the date described by the given expression. See the [user guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/expression-language/#internal-context-functions) for more information on available functions. The expression must evaluate to a `java.util.Date` or `org.joda.time.DateTime` object.
   * @return createdOnExpression
  */
  
  @Schema(name = "createdOnExpression", description = "Restrict to tasks that were created on the date described by the given expression. See the [user guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/expression-language/#internal-context-functions) for more information on available functions. The expression must evaluate to a `java.util.Date` or `org.joda.time.DateTime` object.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdOnExpression")
  public String getCreatedOnExpression() {
    return createdOnExpression;
  }

  public void setCreatedOnExpression(String createdOnExpression) {
    this.createdOnExpression = createdOnExpression;
  }

  public TaskQueryDto createdAfter(OffsetDateTime createdAfter) {
    this.createdAfter = createdAfter;
    return this;
  }

  /**
   * Restrict to tasks that were created after the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.342+0200`.
   * @return createdAfter
  */
  @Valid 
  @Schema(name = "createdAfter", description = "Restrict to tasks that were created after the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.342+0200`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdAfter")
  public OffsetDateTime getCreatedAfter() {
    return createdAfter;
  }

  public void setCreatedAfter(OffsetDateTime createdAfter) {
    this.createdAfter = createdAfter;
  }

  public TaskQueryDto createdAfterExpression(String createdAfterExpression) {
    this.createdAfterExpression = createdAfterExpression;
    return this;
  }

  /**
   * Restrict to tasks that were created after the date described by the given expression. See the [user guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/expression-language/#internal-context-functions) for more information on available functions. The expression must evaluate to a `java.util.Date` or `org.joda.time.DateTime` object.
   * @return createdAfterExpression
  */
  
  @Schema(name = "createdAfterExpression", description = "Restrict to tasks that were created after the date described by the given expression. See the [user guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/expression-language/#internal-context-functions) for more information on available functions. The expression must evaluate to a `java.util.Date` or `org.joda.time.DateTime` object.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdAfterExpression")
  public String getCreatedAfterExpression() {
    return createdAfterExpression;
  }

  public void setCreatedAfterExpression(String createdAfterExpression) {
    this.createdAfterExpression = createdAfterExpression;
  }

  public TaskQueryDto createdBefore(OffsetDateTime createdBefore) {
    this.createdBefore = createdBefore;
    return this;
  }

  /**
   * Restrict to tasks that were created before the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.332+0200`.
   * @return createdBefore
  */
  @Valid 
  @Schema(name = "createdBefore", description = "Restrict to tasks that were created before the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.332+0200`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdBefore")
  public OffsetDateTime getCreatedBefore() {
    return createdBefore;
  }

  public void setCreatedBefore(OffsetDateTime createdBefore) {
    this.createdBefore = createdBefore;
  }

  public TaskQueryDto createdBeforeExpression(String createdBeforeExpression) {
    this.createdBeforeExpression = createdBeforeExpression;
    return this;
  }

  /**
   * Restrict to tasks that were created before the date described by the given expression. See the [user guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/expression-language/#internal-context-functions) for more information on available functions. The expression must evaluate to a `java.util.Date` or `org.joda.time.DateTime` object.
   * @return createdBeforeExpression
  */
  
  @Schema(name = "createdBeforeExpression", description = "Restrict to tasks that were created before the date described by the given expression. See the [user guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/expression-language/#internal-context-functions) for more information on available functions. The expression must evaluate to a `java.util.Date` or `org.joda.time.DateTime` object.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdBeforeExpression")
  public String getCreatedBeforeExpression() {
    return createdBeforeExpression;
  }

  public void setCreatedBeforeExpression(String createdBeforeExpression) {
    this.createdBeforeExpression = createdBeforeExpression;
  }

  public TaskQueryDto delegationState(DelegationStateEnum delegationState) {
    this.delegationState = delegationState;
    return this;
  }

  /**
   * Restrict to tasks that are in the given delegation state. Valid values are `PENDING` and `RESOLVED`.
   * @return delegationState
  */
  
  @Schema(name = "delegationState", description = "Restrict to tasks that are in the given delegation state. Valid values are `PENDING` and `RESOLVED`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("delegationState")
  public DelegationStateEnum getDelegationState() {
    return delegationState;
  }

  public void setDelegationState(DelegationStateEnum delegationState) {
    this.delegationState = delegationState;
  }

  public TaskQueryDto candidateGroups(List<String> candidateGroups) {
    this.candidateGroups = candidateGroups;
    return this;
  }

  public TaskQueryDto addCandidateGroupsItem(String candidateGroupsItem) {
    if (this.candidateGroups == null) {
      this.candidateGroups = new ArrayList<>();
    }
    this.candidateGroups.add(candidateGroupsItem);
    return this;
  }

  /**
   * Restrict to tasks that are offered to any of the given candidate groups. Takes a comma-separated list of group names, so for example `developers,support,sales`.
   * @return candidateGroups
  */
  
  @Schema(name = "candidateGroups", description = "Restrict to tasks that are offered to any of the given candidate groups. Takes a comma-separated list of group names, so for example `developers,support,sales`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("candidateGroups")
  public List<String> getCandidateGroups() {
    return candidateGroups;
  }

  public void setCandidateGroups(List<String> candidateGroups) {
    this.candidateGroups = candidateGroups;
  }

  public TaskQueryDto candidateGroupsExpression(String candidateGroupsExpression) {
    this.candidateGroupsExpression = candidateGroupsExpression;
    return this;
  }

  /**
   * Restrict to tasks that are offered to any of the candidate groups described by the given expression. See the [user guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/expression-language/#internal-context-functions) for more information on available functions. The expression must evaluate to `java.util.List` of Strings.
   * @return candidateGroupsExpression
  */
  
  @Schema(name = "candidateGroupsExpression", description = "Restrict to tasks that are offered to any of the candidate groups described by the given expression. See the [user guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/expression-language/#internal-context-functions) for more information on available functions. The expression must evaluate to `java.util.List` of Strings.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("candidateGroupsExpression")
  public String getCandidateGroupsExpression() {
    return candidateGroupsExpression;
  }

  public void setCandidateGroupsExpression(String candidateGroupsExpression) {
    this.candidateGroupsExpression = candidateGroupsExpression;
  }

  public TaskQueryDto withCandidateGroups(Boolean withCandidateGroups) {
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

  public TaskQueryDto withoutCandidateGroups(Boolean withoutCandidateGroups) {
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

  public TaskQueryDto withCandidateUsers(Boolean withCandidateUsers) {
    this.withCandidateUsers = withCandidateUsers;
    return this;
  }

  /**
   * Only include tasks which have a candidate user. Value may only be `true`, as `false` is the default behavior.
   * @return withCandidateUsers
  */
  
  @Schema(name = "withCandidateUsers", description = "Only include tasks which have a candidate user. Value may only be `true`, as `false` is the default behavior.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("withCandidateUsers")
  public Boolean getWithCandidateUsers() {
    return withCandidateUsers;
  }

  public void setWithCandidateUsers(Boolean withCandidateUsers) {
    this.withCandidateUsers = withCandidateUsers;
  }

  public TaskQueryDto withoutCandidateUsers(Boolean withoutCandidateUsers) {
    this.withoutCandidateUsers = withoutCandidateUsers;
    return this;
  }

  /**
   * Only include tasks which have no candidate users. Value may only be `true`, as `false` is the default behavior.
   * @return withoutCandidateUsers
  */
  
  @Schema(name = "withoutCandidateUsers", description = "Only include tasks which have no candidate users. Value may only be `true`, as `false` is the default behavior.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("withoutCandidateUsers")
  public Boolean getWithoutCandidateUsers() {
    return withoutCandidateUsers;
  }

  public void setWithoutCandidateUsers(Boolean withoutCandidateUsers) {
    this.withoutCandidateUsers = withoutCandidateUsers;
  }

  public TaskQueryDto active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Only include active tasks. Value may only be `true`, as `false` is the default behavior.
   * @return active
  */
  
  @Schema(name = "active", description = "Only include active tasks. Value may only be `true`, as `false` is the default behavior.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public TaskQueryDto suspended(Boolean suspended) {
    this.suspended = suspended;
    return this;
  }

  /**
   * Only include suspended tasks. Value may only be `true`, as `false` is the default behavior.
   * @return suspended
  */
  
  @Schema(name = "suspended", description = "Only include suspended tasks. Value may only be `true`, as `false` is the default behavior.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("suspended")
  public Boolean getSuspended() {
    return suspended;
  }

  public void setSuspended(Boolean suspended) {
    this.suspended = suspended;
  }

  public TaskQueryDto taskVariables(List<@Valid VariableQueryParameterDto> taskVariables) {
    this.taskVariables = taskVariables;
    return this;
  }

  public TaskQueryDto addTaskVariablesItem(VariableQueryParameterDto taskVariablesItem) {
    if (this.taskVariables == null) {
      this.taskVariables = new ArrayList<>();
    }
    this.taskVariables.add(taskVariablesItem);
    return this;
  }

  /**
   * A JSON array to only include tasks that have variables with certain values. The array consists of JSON objects with three properties `name`, `operator` and `value`. `name` is the variable name, `operator` is the comparison operator to be used and `value` the variable value. `value` may be of type `String`, `Number` or `Boolean`.  Valid `operator` values are: `eq` - equal to; `neq` - not equal to; `gt` - greater than; `gteq` - greater than or equal to; `lt` - lower than; `lteq` - lower than or equal to; `like`. `key` and `value` may not contain underscore or comma characters.
   * @return taskVariables
  */
  @Valid 
  @Schema(name = "taskVariables", description = "A JSON array to only include tasks that have variables with certain values. The array consists of JSON objects with three properties `name`, `operator` and `value`. `name` is the variable name, `operator` is the comparison operator to be used and `value` the variable value. `value` may be of type `String`, `Number` or `Boolean`.  Valid `operator` values are: `eq` - equal to; `neq` - not equal to; `gt` - greater than; `gteq` - greater than or equal to; `lt` - lower than; `lteq` - lower than or equal to; `like`. `key` and `value` may not contain underscore or comma characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taskVariables")
  public List<@Valid VariableQueryParameterDto> getTaskVariables() {
    return taskVariables;
  }

  public void setTaskVariables(List<@Valid VariableQueryParameterDto> taskVariables) {
    this.taskVariables = taskVariables;
  }

  public TaskQueryDto processVariables(List<@Valid VariableQueryParameterDto> processVariables) {
    this.processVariables = processVariables;
    return this;
  }

  public TaskQueryDto addProcessVariablesItem(VariableQueryParameterDto processVariablesItem) {
    if (this.processVariables == null) {
      this.processVariables = new ArrayList<>();
    }
    this.processVariables.add(processVariablesItem);
    return this;
  }

  /**
   * A JSON array to only include tasks that belong to a process instance with variables with certain values. The array consists of JSON objects with three properties `name`, `operator` and `value`. `name` is the variable name, `operator` is the comparison operator to be used and `value` the variable value. `value` may be of type `String`, `Number` or `Boolean`.  Valid `operator` values are: `eq` - equal to; `neq` - not equal to; `gt` - greater than; `gteq` - greater than or equal to; `lt` - lower than; `lteq` - lower than or equal to; `like`; `notLike`. `key` and `value` may not contain underscore or comma characters.
   * @return processVariables
  */
  @Valid 
  @Schema(name = "processVariables", description = "A JSON array to only include tasks that belong to a process instance with variables with certain values. The array consists of JSON objects with three properties `name`, `operator` and `value`. `name` is the variable name, `operator` is the comparison operator to be used and `value` the variable value. `value` may be of type `String`, `Number` or `Boolean`.  Valid `operator` values are: `eq` - equal to; `neq` - not equal to; `gt` - greater than; `gteq` - greater than or equal to; `lt` - lower than; `lteq` - lower than or equal to; `like`; `notLike`. `key` and `value` may not contain underscore or comma characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processVariables")
  public List<@Valid VariableQueryParameterDto> getProcessVariables() {
    return processVariables;
  }

  public void setProcessVariables(List<@Valid VariableQueryParameterDto> processVariables) {
    this.processVariables = processVariables;
  }

  public TaskQueryDto caseInstanceVariables(List<@Valid VariableQueryParameterDto> caseInstanceVariables) {
    this.caseInstanceVariables = caseInstanceVariables;
    return this;
  }

  public TaskQueryDto addCaseInstanceVariablesItem(VariableQueryParameterDto caseInstanceVariablesItem) {
    if (this.caseInstanceVariables == null) {
      this.caseInstanceVariables = new ArrayList<>();
    }
    this.caseInstanceVariables.add(caseInstanceVariablesItem);
    return this;
  }

  /**
   * A JSON array to only include tasks that belong to a case instance with variables with certain values. The array consists of JSON objects with three properties `name`, `operator` and `value`. `name` is the variable name, `operator` is the comparison operator to be used and `value` the variable value. `value` may be of type `String`, `Number` or `Boolean`.  Valid `operator` values are: `eq` - equal to; `neq` - not equal to; `gt` - greater than; `gteq` - greater than or equal to; `lt` - lower than; `lteq` - lower than or equal to; `like`. `key` and `value` may not contain underscore or comma characters.
   * @return caseInstanceVariables
  */
  @Valid 
  @Schema(name = "caseInstanceVariables", description = "A JSON array to only include tasks that belong to a case instance with variables with certain values. The array consists of JSON objects with three properties `name`, `operator` and `value`. `name` is the variable name, `operator` is the comparison operator to be used and `value` the variable value. `value` may be of type `String`, `Number` or `Boolean`.  Valid `operator` values are: `eq` - equal to; `neq` - not equal to; `gt` - greater than; `gteq` - greater than or equal to; `lt` - lower than; `lteq` - lower than or equal to; `like`. `key` and `value` may not contain underscore or comma characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("caseInstanceVariables")
  public List<@Valid VariableQueryParameterDto> getCaseInstanceVariables() {
    return caseInstanceVariables;
  }

  public void setCaseInstanceVariables(List<@Valid VariableQueryParameterDto> caseInstanceVariables) {
    this.caseInstanceVariables = caseInstanceVariables;
  }

  public TaskQueryDto variableNamesIgnoreCase(Boolean variableNamesIgnoreCase) {
    this.variableNamesIgnoreCase = variableNamesIgnoreCase;
    return this;
  }

  /**
   * Match all variable names in this query case-insensitively. If set `variableName` and `variablename` are treated as equal.
   * @return variableNamesIgnoreCase
  */
  
  @Schema(name = "variableNamesIgnoreCase", description = "Match all variable names in this query case-insensitively. If set `variableName` and `variablename` are treated as equal.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("variableNamesIgnoreCase")
  public Boolean getVariableNamesIgnoreCase() {
    return variableNamesIgnoreCase;
  }

  public void setVariableNamesIgnoreCase(Boolean variableNamesIgnoreCase) {
    this.variableNamesIgnoreCase = variableNamesIgnoreCase;
  }

  public TaskQueryDto variableValuesIgnoreCase(Boolean variableValuesIgnoreCase) {
    this.variableValuesIgnoreCase = variableValuesIgnoreCase;
    return this;
  }

  /**
   * Match all variable values in this query case-insensitively. If set `variableValue` and `variablevalue` are treated as equal.
   * @return variableValuesIgnoreCase
  */
  
  @Schema(name = "variableValuesIgnoreCase", description = "Match all variable values in this query case-insensitively. If set `variableValue` and `variablevalue` are treated as equal.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("variableValuesIgnoreCase")
  public Boolean getVariableValuesIgnoreCase() {
    return variableValuesIgnoreCase;
  }

  public void setVariableValuesIgnoreCase(Boolean variableValuesIgnoreCase) {
    this.variableValuesIgnoreCase = variableValuesIgnoreCase;
  }

  public TaskQueryDto parentTaskId(String parentTaskId) {
    this.parentTaskId = parentTaskId;
    return this;
  }

  /**
   * Restrict query to all tasks that are sub tasks of the given task. Takes a task id.
   * @return parentTaskId
  */
  
  @Schema(name = "parentTaskId", description = "Restrict query to all tasks that are sub tasks of the given task. Takes a task id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parentTaskId")
  public String getParentTaskId() {
    return parentTaskId;
  }

  public void setParentTaskId(String parentTaskId) {
    this.parentTaskId = parentTaskId;
  }

  public TaskQueryDto orQueries(List<@Valid TaskQueryDto> orQueries) {
    this.orQueries = orQueries;
    return this;
  }

  public TaskQueryDto addOrQueriesItem(TaskQueryDto orQueriesItem) {
    if (this.orQueries == null) {
      this.orQueries = new ArrayList<>();
    }
    this.orQueries.add(orQueriesItem);
    return this;
  }

  /**
   * A JSON array of nested task queries with OR semantics. A task matches a nested query if it fulfills *at least one* of the query's predicates. With multiple nested queries, a task must fulfill at least one predicate of *each* query ([Conjunctive Normal Form](https://en.wikipedia.org/wiki/Conjunctive_normal_form)).  All task query properties can be used except for: `sorting`, `withCandidateGroups`, `withoutCandidateGroups`, `withCandidateUsers`, `withoutCandidateUsers`  See the [User guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/process-engine-api/#or-queries) for more information about OR queries.
   * @return orQueries
  */
  @Valid 
  @Schema(name = "orQueries", description = "A JSON array of nested task queries with OR semantics. A task matches a nested query if it fulfills *at least one* of the query's predicates. With multiple nested queries, a task must fulfill at least one predicate of *each* query ([Conjunctive Normal Form](https://en.wikipedia.org/wiki/Conjunctive_normal_form)).  All task query properties can be used except for: `sorting`, `withCandidateGroups`, `withoutCandidateGroups`, `withCandidateUsers`, `withoutCandidateUsers`  See the [User guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/process-engine-api/#or-queries) for more information about OR queries.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orQueries")
  public List<@Valid TaskQueryDto> getOrQueries() {
    return orQueries;
  }

  public void setOrQueries(List<@Valid TaskQueryDto> orQueries) {
    this.orQueries = orQueries;
  }

  public TaskQueryDto sorting(List<@Valid TaskQueryDtoSortingInner> sorting) {
    this.sorting = sorting;
    return this;
  }

  public TaskQueryDto addSortingItem(TaskQueryDtoSortingInner sortingItem) {
    if (this.sorting == null) {
      this.sorting = new ArrayList<>();
    }
    this.sorting.add(sortingItem);
    return this;
  }

  /**
   * Apply sorting of the result
   * @return sorting
  */
  @Valid 
  @Schema(name = "sorting", description = "Apply sorting of the result", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sorting")
  public List<@Valid TaskQueryDtoSortingInner> getSorting() {
    return sorting;
  }

  public void setSorting(List<@Valid TaskQueryDtoSortingInner> sorting) {
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
    TaskQueryDto taskQueryDto = (TaskQueryDto) o;
    return Objects.equals(this.processInstanceId, taskQueryDto.processInstanceId) &&
        Objects.equals(this.processInstanceIdIn, taskQueryDto.processInstanceIdIn) &&
        Objects.equals(this.processInstanceBusinessKey, taskQueryDto.processInstanceBusinessKey) &&
        Objects.equals(this.processInstanceBusinessKeyExpression, taskQueryDto.processInstanceBusinessKeyExpression) &&
        Objects.equals(this.processInstanceBusinessKeyIn, taskQueryDto.processInstanceBusinessKeyIn) &&
        Objects.equals(this.processInstanceBusinessKeyLike, taskQueryDto.processInstanceBusinessKeyLike) &&
        Objects.equals(this.processInstanceBusinessKeyLikeExpression, taskQueryDto.processInstanceBusinessKeyLikeExpression) &&
        Objects.equals(this.processDefinitionId, taskQueryDto.processDefinitionId) &&
        Objects.equals(this.processDefinitionKey, taskQueryDto.processDefinitionKey) &&
        Objects.equals(this.processDefinitionKeyIn, taskQueryDto.processDefinitionKeyIn) &&
        Objects.equals(this.processDefinitionName, taskQueryDto.processDefinitionName) &&
        Objects.equals(this.processDefinitionNameLike, taskQueryDto.processDefinitionNameLike) &&
        Objects.equals(this.executionId, taskQueryDto.executionId) &&
        Objects.equals(this.caseInstanceId, taskQueryDto.caseInstanceId) &&
        Objects.equals(this.caseInstanceBusinessKey, taskQueryDto.caseInstanceBusinessKey) &&
        Objects.equals(this.caseInstanceBusinessKeyLike, taskQueryDto.caseInstanceBusinessKeyLike) &&
        Objects.equals(this.caseDefinitionId, taskQueryDto.caseDefinitionId) &&
        Objects.equals(this.caseDefinitionKey, taskQueryDto.caseDefinitionKey) &&
        Objects.equals(this.caseDefinitionName, taskQueryDto.caseDefinitionName) &&
        Objects.equals(this.caseDefinitionNameLike, taskQueryDto.caseDefinitionNameLike) &&
        Objects.equals(this.caseExecutionId, taskQueryDto.caseExecutionId) &&
        Objects.equals(this.activityInstanceIdIn, taskQueryDto.activityInstanceIdIn) &&
        Objects.equals(this.tenantIdIn, taskQueryDto.tenantIdIn) &&
        Objects.equals(this.withoutTenantId, taskQueryDto.withoutTenantId) &&
        Objects.equals(this.assignee, taskQueryDto.assignee) &&
        Objects.equals(this.assigneeExpression, taskQueryDto.assigneeExpression) &&
        Objects.equals(this.assigneeLike, taskQueryDto.assigneeLike) &&
        Objects.equals(this.assigneeLikeExpression, taskQueryDto.assigneeLikeExpression) &&
        Objects.equals(this.assigneeIn, taskQueryDto.assigneeIn) &&
        Objects.equals(this.assigneeNotIn, taskQueryDto.assigneeNotIn) &&
        Objects.equals(this.owner, taskQueryDto.owner) &&
        Objects.equals(this.ownerExpression, taskQueryDto.ownerExpression) &&
        Objects.equals(this.candidateGroup, taskQueryDto.candidateGroup) &&
        Objects.equals(this.candidateGroupExpression, taskQueryDto.candidateGroupExpression) &&
        Objects.equals(this.candidateUser, taskQueryDto.candidateUser) &&
        Objects.equals(this.candidateUserExpression, taskQueryDto.candidateUserExpression) &&
        Objects.equals(this.includeAssignedTasks, taskQueryDto.includeAssignedTasks) &&
        Objects.equals(this.involvedUser, taskQueryDto.involvedUser) &&
        Objects.equals(this.involvedUserExpression, taskQueryDto.involvedUserExpression) &&
        Objects.equals(this.assigned, taskQueryDto.assigned) &&
        Objects.equals(this.unassigned, taskQueryDto.unassigned) &&
        Objects.equals(this.taskDefinitionKey, taskQueryDto.taskDefinitionKey) &&
        Objects.equals(this.taskDefinitionKeyIn, taskQueryDto.taskDefinitionKeyIn) &&
        Objects.equals(this.taskDefinitionKeyLike, taskQueryDto.taskDefinitionKeyLike) &&
        Objects.equals(this.name, taskQueryDto.name) &&
        Objects.equals(this.nameNotEqual, taskQueryDto.nameNotEqual) &&
        Objects.equals(this.nameLike, taskQueryDto.nameLike) &&
        Objects.equals(this.nameNotLike, taskQueryDto.nameNotLike) &&
        Objects.equals(this.description, taskQueryDto.description) &&
        Objects.equals(this.descriptionLike, taskQueryDto.descriptionLike) &&
        Objects.equals(this.priority, taskQueryDto.priority) &&
        Objects.equals(this.maxPriority, taskQueryDto.maxPriority) &&
        Objects.equals(this.minPriority, taskQueryDto.minPriority) &&
        Objects.equals(this.dueDate, taskQueryDto.dueDate) &&
        Objects.equals(this.dueDateExpression, taskQueryDto.dueDateExpression) &&
        Objects.equals(this.dueAfter, taskQueryDto.dueAfter) &&
        Objects.equals(this.dueAfterExpression, taskQueryDto.dueAfterExpression) &&
        Objects.equals(this.dueBefore, taskQueryDto.dueBefore) &&
        Objects.equals(this.dueBeforeExpression, taskQueryDto.dueBeforeExpression) &&
        Objects.equals(this.withoutDueDate, taskQueryDto.withoutDueDate) &&
        Objects.equals(this.followUpDate, taskQueryDto.followUpDate) &&
        Objects.equals(this.followUpDateExpression, taskQueryDto.followUpDateExpression) &&
        Objects.equals(this.followUpAfter, taskQueryDto.followUpAfter) &&
        Objects.equals(this.followUpAfterExpression, taskQueryDto.followUpAfterExpression) &&
        Objects.equals(this.followUpBefore, taskQueryDto.followUpBefore) &&
        Objects.equals(this.followUpBeforeExpression, taskQueryDto.followUpBeforeExpression) &&
        Objects.equals(this.followUpBeforeOrNotExistent, taskQueryDto.followUpBeforeOrNotExistent) &&
        Objects.equals(this.followUpBeforeOrNotExistentExpression, taskQueryDto.followUpBeforeOrNotExistentExpression) &&
        Objects.equals(this.createdOn, taskQueryDto.createdOn) &&
        Objects.equals(this.createdOnExpression, taskQueryDto.createdOnExpression) &&
        Objects.equals(this.createdAfter, taskQueryDto.createdAfter) &&
        Objects.equals(this.createdAfterExpression, taskQueryDto.createdAfterExpression) &&
        Objects.equals(this.createdBefore, taskQueryDto.createdBefore) &&
        Objects.equals(this.createdBeforeExpression, taskQueryDto.createdBeforeExpression) &&
        Objects.equals(this.delegationState, taskQueryDto.delegationState) &&
        Objects.equals(this.candidateGroups, taskQueryDto.candidateGroups) &&
        Objects.equals(this.candidateGroupsExpression, taskQueryDto.candidateGroupsExpression) &&
        Objects.equals(this.withCandidateGroups, taskQueryDto.withCandidateGroups) &&
        Objects.equals(this.withoutCandidateGroups, taskQueryDto.withoutCandidateGroups) &&
        Objects.equals(this.withCandidateUsers, taskQueryDto.withCandidateUsers) &&
        Objects.equals(this.withoutCandidateUsers, taskQueryDto.withoutCandidateUsers) &&
        Objects.equals(this.active, taskQueryDto.active) &&
        Objects.equals(this.suspended, taskQueryDto.suspended) &&
        Objects.equals(this.taskVariables, taskQueryDto.taskVariables) &&
        Objects.equals(this.processVariables, taskQueryDto.processVariables) &&
        Objects.equals(this.caseInstanceVariables, taskQueryDto.caseInstanceVariables) &&
        Objects.equals(this.variableNamesIgnoreCase, taskQueryDto.variableNamesIgnoreCase) &&
        Objects.equals(this.variableValuesIgnoreCase, taskQueryDto.variableValuesIgnoreCase) &&
        Objects.equals(this.parentTaskId, taskQueryDto.parentTaskId) &&
        Objects.equals(this.orQueries, taskQueryDto.orQueries) &&
        Objects.equals(this.sorting, taskQueryDto.sorting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processInstanceId, processInstanceIdIn, processInstanceBusinessKey, processInstanceBusinessKeyExpression, processInstanceBusinessKeyIn, processInstanceBusinessKeyLike, processInstanceBusinessKeyLikeExpression, processDefinitionId, processDefinitionKey, processDefinitionKeyIn, processDefinitionName, processDefinitionNameLike, executionId, caseInstanceId, caseInstanceBusinessKey, caseInstanceBusinessKeyLike, caseDefinitionId, caseDefinitionKey, caseDefinitionName, caseDefinitionNameLike, caseExecutionId, activityInstanceIdIn, tenantIdIn, withoutTenantId, assignee, assigneeExpression, assigneeLike, assigneeLikeExpression, assigneeIn, assigneeNotIn, owner, ownerExpression, candidateGroup, candidateGroupExpression, candidateUser, candidateUserExpression, includeAssignedTasks, involvedUser, involvedUserExpression, assigned, unassigned, taskDefinitionKey, taskDefinitionKeyIn, taskDefinitionKeyLike, name, nameNotEqual, nameLike, nameNotLike, description, descriptionLike, priority, maxPriority, minPriority, dueDate, dueDateExpression, dueAfter, dueAfterExpression, dueBefore, dueBeforeExpression, withoutDueDate, followUpDate, followUpDateExpression, followUpAfter, followUpAfterExpression, followUpBefore, followUpBeforeExpression, followUpBeforeOrNotExistent, followUpBeforeOrNotExistentExpression, createdOn, createdOnExpression, createdAfter, createdAfterExpression, createdBefore, createdBeforeExpression, delegationState, candidateGroups, candidateGroupsExpression, withCandidateGroups, withoutCandidateGroups, withCandidateUsers, withoutCandidateUsers, active, suspended, taskVariables, processVariables, caseInstanceVariables, variableNamesIgnoreCase, variableValuesIgnoreCase, parentTaskId, orQueries, sorting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskQueryDto {\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    processInstanceIdIn: ").append(toIndentedString(processInstanceIdIn)).append("\n");
    sb.append("    processInstanceBusinessKey: ").append(toIndentedString(processInstanceBusinessKey)).append("\n");
    sb.append("    processInstanceBusinessKeyExpression: ").append(toIndentedString(processInstanceBusinessKeyExpression)).append("\n");
    sb.append("    processInstanceBusinessKeyIn: ").append(toIndentedString(processInstanceBusinessKeyIn)).append("\n");
    sb.append("    processInstanceBusinessKeyLike: ").append(toIndentedString(processInstanceBusinessKeyLike)).append("\n");
    sb.append("    processInstanceBusinessKeyLikeExpression: ").append(toIndentedString(processInstanceBusinessKeyLikeExpression)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    processDefinitionKeyIn: ").append(toIndentedString(processDefinitionKeyIn)).append("\n");
    sb.append("    processDefinitionName: ").append(toIndentedString(processDefinitionName)).append("\n");
    sb.append("    processDefinitionNameLike: ").append(toIndentedString(processDefinitionNameLike)).append("\n");
    sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
    sb.append("    caseInstanceId: ").append(toIndentedString(caseInstanceId)).append("\n");
    sb.append("    caseInstanceBusinessKey: ").append(toIndentedString(caseInstanceBusinessKey)).append("\n");
    sb.append("    caseInstanceBusinessKeyLike: ").append(toIndentedString(caseInstanceBusinessKeyLike)).append("\n");
    sb.append("    caseDefinitionId: ").append(toIndentedString(caseDefinitionId)).append("\n");
    sb.append("    caseDefinitionKey: ").append(toIndentedString(caseDefinitionKey)).append("\n");
    sb.append("    caseDefinitionName: ").append(toIndentedString(caseDefinitionName)).append("\n");
    sb.append("    caseDefinitionNameLike: ").append(toIndentedString(caseDefinitionNameLike)).append("\n");
    sb.append("    caseExecutionId: ").append(toIndentedString(caseExecutionId)).append("\n");
    sb.append("    activityInstanceIdIn: ").append(toIndentedString(activityInstanceIdIn)).append("\n");
    sb.append("    tenantIdIn: ").append(toIndentedString(tenantIdIn)).append("\n");
    sb.append("    withoutTenantId: ").append(toIndentedString(withoutTenantId)).append("\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    assigneeExpression: ").append(toIndentedString(assigneeExpression)).append("\n");
    sb.append("    assigneeLike: ").append(toIndentedString(assigneeLike)).append("\n");
    sb.append("    assigneeLikeExpression: ").append(toIndentedString(assigneeLikeExpression)).append("\n");
    sb.append("    assigneeIn: ").append(toIndentedString(assigneeIn)).append("\n");
    sb.append("    assigneeNotIn: ").append(toIndentedString(assigneeNotIn)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    ownerExpression: ").append(toIndentedString(ownerExpression)).append("\n");
    sb.append("    candidateGroup: ").append(toIndentedString(candidateGroup)).append("\n");
    sb.append("    candidateGroupExpression: ").append(toIndentedString(candidateGroupExpression)).append("\n");
    sb.append("    candidateUser: ").append(toIndentedString(candidateUser)).append("\n");
    sb.append("    candidateUserExpression: ").append(toIndentedString(candidateUserExpression)).append("\n");
    sb.append("    includeAssignedTasks: ").append(toIndentedString(includeAssignedTasks)).append("\n");
    sb.append("    involvedUser: ").append(toIndentedString(involvedUser)).append("\n");
    sb.append("    involvedUserExpression: ").append(toIndentedString(involvedUserExpression)).append("\n");
    sb.append("    assigned: ").append(toIndentedString(assigned)).append("\n");
    sb.append("    unassigned: ").append(toIndentedString(unassigned)).append("\n");
    sb.append("    taskDefinitionKey: ").append(toIndentedString(taskDefinitionKey)).append("\n");
    sb.append("    taskDefinitionKeyIn: ").append(toIndentedString(taskDefinitionKeyIn)).append("\n");
    sb.append("    taskDefinitionKeyLike: ").append(toIndentedString(taskDefinitionKeyLike)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameNotEqual: ").append(toIndentedString(nameNotEqual)).append("\n");
    sb.append("    nameLike: ").append(toIndentedString(nameLike)).append("\n");
    sb.append("    nameNotLike: ").append(toIndentedString(nameNotLike)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    descriptionLike: ").append(toIndentedString(descriptionLike)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    maxPriority: ").append(toIndentedString(maxPriority)).append("\n");
    sb.append("    minPriority: ").append(toIndentedString(minPriority)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    dueDateExpression: ").append(toIndentedString(dueDateExpression)).append("\n");
    sb.append("    dueAfter: ").append(toIndentedString(dueAfter)).append("\n");
    sb.append("    dueAfterExpression: ").append(toIndentedString(dueAfterExpression)).append("\n");
    sb.append("    dueBefore: ").append(toIndentedString(dueBefore)).append("\n");
    sb.append("    dueBeforeExpression: ").append(toIndentedString(dueBeforeExpression)).append("\n");
    sb.append("    withoutDueDate: ").append(toIndentedString(withoutDueDate)).append("\n");
    sb.append("    followUpDate: ").append(toIndentedString(followUpDate)).append("\n");
    sb.append("    followUpDateExpression: ").append(toIndentedString(followUpDateExpression)).append("\n");
    sb.append("    followUpAfter: ").append(toIndentedString(followUpAfter)).append("\n");
    sb.append("    followUpAfterExpression: ").append(toIndentedString(followUpAfterExpression)).append("\n");
    sb.append("    followUpBefore: ").append(toIndentedString(followUpBefore)).append("\n");
    sb.append("    followUpBeforeExpression: ").append(toIndentedString(followUpBeforeExpression)).append("\n");
    sb.append("    followUpBeforeOrNotExistent: ").append(toIndentedString(followUpBeforeOrNotExistent)).append("\n");
    sb.append("    followUpBeforeOrNotExistentExpression: ").append(toIndentedString(followUpBeforeOrNotExistentExpression)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    createdOnExpression: ").append(toIndentedString(createdOnExpression)).append("\n");
    sb.append("    createdAfter: ").append(toIndentedString(createdAfter)).append("\n");
    sb.append("    createdAfterExpression: ").append(toIndentedString(createdAfterExpression)).append("\n");
    sb.append("    createdBefore: ").append(toIndentedString(createdBefore)).append("\n");
    sb.append("    createdBeforeExpression: ").append(toIndentedString(createdBeforeExpression)).append("\n");
    sb.append("    delegationState: ").append(toIndentedString(delegationState)).append("\n");
    sb.append("    candidateGroups: ").append(toIndentedString(candidateGroups)).append("\n");
    sb.append("    candidateGroupsExpression: ").append(toIndentedString(candidateGroupsExpression)).append("\n");
    sb.append("    withCandidateGroups: ").append(toIndentedString(withCandidateGroups)).append("\n");
    sb.append("    withoutCandidateGroups: ").append(toIndentedString(withoutCandidateGroups)).append("\n");
    sb.append("    withCandidateUsers: ").append(toIndentedString(withCandidateUsers)).append("\n");
    sb.append("    withoutCandidateUsers: ").append(toIndentedString(withoutCandidateUsers)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
    sb.append("    taskVariables: ").append(toIndentedString(taskVariables)).append("\n");
    sb.append("    processVariables: ").append(toIndentedString(processVariables)).append("\n");
    sb.append("    caseInstanceVariables: ").append(toIndentedString(caseInstanceVariables)).append("\n");
    sb.append("    variableNamesIgnoreCase: ").append(toIndentedString(variableNamesIgnoreCase)).append("\n");
    sb.append("    variableValuesIgnoreCase: ").append(toIndentedString(variableValuesIgnoreCase)).append("\n");
    sb.append("    parentTaskId: ").append(toIndentedString(parentTaskId)).append("\n");
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

