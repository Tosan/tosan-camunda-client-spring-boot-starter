package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;

/**
 * TaskDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class TaskDto   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("assignee")
  private String assignee = null;

  @JsonProperty("owner")
  private String owner = null;

  @JsonProperty("created")
  private OffsetDateTime created = null;

  @JsonProperty("due")
  private OffsetDateTime due = null;

  @JsonProperty("followUp")
  private OffsetDateTime followUp = null;

  /**
   * The task's delegation state. Possible values are `PENDING` and `RESOLVED`.
   */
  public enum DelegationStateEnum {
    PENDING("PENDING"),
    
    RESOLVED("RESOLVED");

    private String value;

    DelegationStateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DelegationStateEnum fromValue(String text) {
      for (DelegationStateEnum b : DelegationStateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("delegationState")
  private DelegationStateEnum delegationState = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("executionId")
  private String executionId = null;

  @JsonProperty("parentTaskId")
  private String parentTaskId = null;

  @JsonProperty("priority")
  private Integer priority = null;

  @JsonProperty("processDefinitionId")
  private String processDefinitionId = null;

  @JsonProperty("processInstanceId")
  private String processInstanceId = null;

  @JsonProperty("caseExecutionId")
  private String caseExecutionId = null;

  @JsonProperty("caseDefinitionId")
  private String caseDefinitionId = null;

  @JsonProperty("caseInstanceId")
  private String caseInstanceId = null;

  @JsonProperty("taskDefinitionKey")
  private String taskDefinitionKey = null;

  @JsonProperty("suspended")
  private Boolean suspended = null;

  @JsonProperty("formKey")
  private String formKey = null;

  @JsonProperty("camundaFormRef")
  @Valid
  private Map<String, CamundaFormRef> camundaFormRef = null;

  @JsonProperty("tenantId")
  private String tenantId = null;

  public TaskDto id(String id) {
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

  public TaskDto name(String name) {
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

  public TaskDto assignee(String assignee) {
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

  public TaskDto owner(String owner) {
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

  public TaskDto created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * The date the task was created on. [Default format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.
   * @return created
   **/
  @Schema(description = "The date the task was created on. [Default format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.")
  
    @Valid
    public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public TaskDto due(OffsetDateTime due) {
    this.due = due;
    return this;
  }

  /**
   * The task's due date. [Default format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.
   * @return due
   **/
  @Schema(description = "The task's due date. [Default format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.")
  
    @Valid
    public OffsetDateTime getDue() {
    return due;
  }

  public void setDue(OffsetDateTime due) {
    this.due = due;
  }

  public TaskDto followUp(OffsetDateTime followUp) {
    this.followUp = followUp;
    return this;
  }

  /**
   * The follow-up date for the task. [Default format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.
   * @return followUp
   **/
  @Schema(description = "The follow-up date for the task. [Default format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.")
  
    @Valid
    public OffsetDateTime getFollowUp() {
    return followUp;
  }

  public void setFollowUp(OffsetDateTime followUp) {
    this.followUp = followUp;
  }

  public TaskDto delegationState(DelegationStateEnum delegationState) {
    this.delegationState = delegationState;
    return this;
  }

  /**
   * The task's delegation state. Possible values are `PENDING` and `RESOLVED`.
   * @return delegationState
   **/
  @Schema(description = "The task's delegation state. Possible values are `PENDING` and `RESOLVED`.")
  
    public DelegationStateEnum getDelegationState() {
    return delegationState;
  }

  public void setDelegationState(DelegationStateEnum delegationState) {
    this.delegationState = delegationState;
  }

  public TaskDto description(String description) {
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

  public TaskDto executionId(String executionId) {
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

  public TaskDto parentTaskId(String parentTaskId) {
    this.parentTaskId = parentTaskId;
    return this;
  }

  /**
   * The id the parent task, if this task is a subtask.
   * @return parentTaskId
   **/
  @Schema(description = "The id the parent task, if this task is a subtask.")
  
    public String getParentTaskId() {
    return parentTaskId;
  }

  public void setParentTaskId(String parentTaskId) {
    this.parentTaskId = parentTaskId;
  }

  public TaskDto priority(Integer priority) {
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

  public TaskDto processDefinitionId(String processDefinitionId) {
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

  public TaskDto processInstanceId(String processInstanceId) {
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

  public TaskDto caseExecutionId(String caseExecutionId) {
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

  public TaskDto caseDefinitionId(String caseDefinitionId) {
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

  public TaskDto caseInstanceId(String caseInstanceId) {
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

  public TaskDto taskDefinitionKey(String taskDefinitionKey) {
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

  public TaskDto suspended(Boolean suspended) {
    this.suspended = suspended;
    return this;
  }

  /**
   * Whether the task belongs to a process instance that is suspended.
   * @return suspended
   **/
  @Schema(description = "Whether the task belongs to a process instance that is suspended.")
  
    public Boolean isSuspended() {
    return suspended;
  }

  public void setSuspended(Boolean suspended) {
    this.suspended = suspended;
  }

  public TaskDto formKey(String formKey) {
    this.formKey = formKey;
    return this;
  }

  /**
   * If not `null`, the form key for the task.
   * @return formKey
   **/
  @Schema(description = "If not `null`, the form key for the task.")
  
    public String getFormKey() {
    return formKey;
  }

  public void setFormKey(String formKey) {
    this.formKey = formKey;
  }

  public TaskDto camundaFormRef(Map<String, CamundaFormRef> camundaFormRef) {
    this.camundaFormRef = camundaFormRef;
    return this;
  }

  public TaskDto putCamundaFormRefItem(String key, CamundaFormRef camundaFormRefItem) {
    if (this.camundaFormRef == null) {
      this.camundaFormRef = new HashMap<>();
    }
    this.camundaFormRef.put(key, camundaFormRefItem);
    return this;
  }

  /**
   * A reference to a specific version of a Camunda Form.
   * @return camundaFormRef
   **/
  @Schema(description = "A reference to a specific version of a Camunda Form.")
      @Valid
    public Map<String, CamundaFormRef> getCamundaFormRef() {
    return camundaFormRef;
  }

  public void setCamundaFormRef(Map<String, CamundaFormRef> camundaFormRef) {
    this.camundaFormRef = camundaFormRef;
  }

  public TaskDto tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * If not `null`, the tenant id of the task.
   * @return tenantId
   **/
  @Schema(description = "If not `null`, the tenant id of the task.")
  
    public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskDto taskDto = (TaskDto) o;
    return Objects.equals(this.id, taskDto.id) &&
        Objects.equals(this.name, taskDto.name) &&
        Objects.equals(this.assignee, taskDto.assignee) &&
        Objects.equals(this.owner, taskDto.owner) &&
        Objects.equals(this.created, taskDto.created) &&
        Objects.equals(this.due, taskDto.due) &&
        Objects.equals(this.followUp, taskDto.followUp) &&
        Objects.equals(this.delegationState, taskDto.delegationState) &&
        Objects.equals(this.description, taskDto.description) &&
        Objects.equals(this.executionId, taskDto.executionId) &&
        Objects.equals(this.parentTaskId, taskDto.parentTaskId) &&
        Objects.equals(this.priority, taskDto.priority) &&
        Objects.equals(this.processDefinitionId, taskDto.processDefinitionId) &&
        Objects.equals(this.processInstanceId, taskDto.processInstanceId) &&
        Objects.equals(this.caseExecutionId, taskDto.caseExecutionId) &&
        Objects.equals(this.caseDefinitionId, taskDto.caseDefinitionId) &&
        Objects.equals(this.caseInstanceId, taskDto.caseInstanceId) &&
        Objects.equals(this.taskDefinitionKey, taskDto.taskDefinitionKey) &&
        Objects.equals(this.suspended, taskDto.suspended) &&
        Objects.equals(this.formKey, taskDto.formKey) &&
        Objects.equals(this.camundaFormRef, taskDto.camundaFormRef) &&
        Objects.equals(this.tenantId, taskDto.tenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, assignee, owner, created, due, followUp, delegationState, description, executionId, parentTaskId, priority, processDefinitionId, processInstanceId, caseExecutionId, caseDefinitionId, caseInstanceId, taskDefinitionKey, suspended, formKey, camundaFormRef, tenantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    due: ").append(toIndentedString(due)).append("\n");
    sb.append("    followUp: ").append(toIndentedString(followUp)).append("\n");
    sb.append("    delegationState: ").append(toIndentedString(delegationState)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
    sb.append("    parentTaskId: ").append(toIndentedString(parentTaskId)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    caseExecutionId: ").append(toIndentedString(caseExecutionId)).append("\n");
    sb.append("    caseDefinitionId: ").append(toIndentedString(caseDefinitionId)).append("\n");
    sb.append("    caseInstanceId: ").append(toIndentedString(caseInstanceId)).append("\n");
    sb.append("    taskDefinitionKey: ").append(toIndentedString(taskDefinitionKey)).append("\n");
    sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
    sb.append("    formKey: ").append(toIndentedString(formKey)).append("\n");
    sb.append("    camundaFormRef: ").append(toIndentedString(camundaFormRef)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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
