package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;

/**
 * HistoricIdentityLinkLogDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class HistoricIdentityLinkLogDto   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("time")
  private OffsetDateTime time = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("userId")
  private String userId = null;

  @JsonProperty("groupId")
  private String groupId = null;

  @JsonProperty("taskId")
  private String taskId = null;

  @JsonProperty("processDefinitionId")
  private String processDefinitionId = null;

  @JsonProperty("processDefinitionKey")
  private String processDefinitionKey = null;

  @JsonProperty("operationType")
  private String operationType = null;

  @JsonProperty("assignerId")
  private String assignerId = null;

  @JsonProperty("tenantId")
  private String tenantId = null;

  @JsonProperty("removalTime")
  private OffsetDateTime removalTime = null;

  @JsonProperty("rootProcessInstanceId")
  private String rootProcessInstanceId = null;

  public HistoricIdentityLinkLogDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Id of the Historic identity link entry.
   * @return id
   **/
  @Schema(description = "Id of the Historic identity link entry.")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public HistoricIdentityLinkLogDto time(OffsetDateTime time) {
    this.time = time;
    return this;
  }

  /**
   * The time when the identity link is logged.  [Default format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.
   * @return time
   **/
  @Schema(description = "The time when the identity link is logged.  [Default format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.")
  
    @Valid
    public OffsetDateTime getTime() {
    return time;
  }

  public void setTime(OffsetDateTime time) {
    this.time = time;
  }

  public HistoricIdentityLinkLogDto type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of identity link (candidate/assignee/owner).
   * @return type
   **/
  @Schema(description = "The type of identity link (candidate/assignee/owner).")
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public HistoricIdentityLinkLogDto userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * The id of the user/assignee.
   * @return userId
   **/
  @Schema(description = "The id of the user/assignee.")
  
    public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public HistoricIdentityLinkLogDto groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * The id of the group.
   * @return groupId
   **/
  @Schema(description = "The id of the group.")
  
    public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public HistoricIdentityLinkLogDto taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

  /**
   * The id of the task.
   * @return taskId
   **/
  @Schema(description = "The id of the task.")
  
    public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  public HistoricIdentityLinkLogDto processDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
    return this;
  }

  /**
   * The id of the process definition.
   * @return processDefinitionId
   **/
  @Schema(description = "The id of the process definition.")
  
    public String getProcessDefinitionId() {
    return processDefinitionId;
  }

  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }

  public HistoricIdentityLinkLogDto processDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
    return this;
  }

  /**
   * The key of the process definition.
   * @return processDefinitionKey
   **/
  @Schema(description = "The key of the process definition.")
  
    public String getProcessDefinitionKey() {
    return processDefinitionKey;
  }

  public void setProcessDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
  }

  public HistoricIdentityLinkLogDto operationType(String operationType) {
    this.operationType = operationType;
    return this;
  }

  /**
   * Type of operation (add/delete).
   * @return operationType
   **/
  @Schema(description = "Type of operation (add/delete).")
  
    public String getOperationType() {
    return operationType;
  }

  public void setOperationType(String operationType) {
    this.operationType = operationType;
  }

  public HistoricIdentityLinkLogDto assignerId(String assignerId) {
    this.assignerId = assignerId;
    return this;
  }

  /**
   * The id of the assigner.
   * @return assignerId
   **/
  @Schema(description = "The id of the assigner.")
  
    public String getAssignerId() {
    return assignerId;
  }

  public void setAssignerId(String assignerId) {
    this.assignerId = assignerId;
  }

  public HistoricIdentityLinkLogDto tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * The id of the tenant.
   * @return tenantId
   **/
  @Schema(description = "The id of the tenant.")
  
    public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public HistoricIdentityLinkLogDto removalTime(OffsetDateTime removalTime) {
    this.removalTime = removalTime;
    return this;
  }

  /**
   * The time after which the identity link should be removed by the History Cleanup job.  [Default format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.
   * @return removalTime
   **/
  @Schema(description = "The time after which the identity link should be removed by the History Cleanup job.  [Default format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.")
  
    @Valid
    public OffsetDateTime getRemovalTime() {
    return removalTime;
  }

  public void setRemovalTime(OffsetDateTime removalTime) {
    this.removalTime = removalTime;
  }

  public HistoricIdentityLinkLogDto rootProcessInstanceId(String rootProcessInstanceId) {
    this.rootProcessInstanceId = rootProcessInstanceId;
    return this;
  }

  /**
   * The process instance id of the root process instance that initiated the process containing this identity link.
   * @return rootProcessInstanceId
   **/
  @Schema(description = "The process instance id of the root process instance that initiated the process containing this identity link.")
  
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
    HistoricIdentityLinkLogDto historicIdentityLinkLogDto = (HistoricIdentityLinkLogDto) o;
    return Objects.equals(this.id, historicIdentityLinkLogDto.id) &&
        Objects.equals(this.time, historicIdentityLinkLogDto.time) &&
        Objects.equals(this.type, historicIdentityLinkLogDto.type) &&
        Objects.equals(this.userId, historicIdentityLinkLogDto.userId) &&
        Objects.equals(this.groupId, historicIdentityLinkLogDto.groupId) &&
        Objects.equals(this.taskId, historicIdentityLinkLogDto.taskId) &&
        Objects.equals(this.processDefinitionId, historicIdentityLinkLogDto.processDefinitionId) &&
        Objects.equals(this.processDefinitionKey, historicIdentityLinkLogDto.processDefinitionKey) &&
        Objects.equals(this.operationType, historicIdentityLinkLogDto.operationType) &&
        Objects.equals(this.assignerId, historicIdentityLinkLogDto.assignerId) &&
        Objects.equals(this.tenantId, historicIdentityLinkLogDto.tenantId) &&
        Objects.equals(this.removalTime, historicIdentityLinkLogDto.removalTime) &&
        Objects.equals(this.rootProcessInstanceId, historicIdentityLinkLogDto.rootProcessInstanceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, time, type, userId, groupId, taskId, processDefinitionId, processDefinitionKey, operationType, assignerId, tenantId, removalTime, rootProcessInstanceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricIdentityLinkLogDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
    sb.append("    assignerId: ").append(toIndentedString(assignerId)).append("\n");
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
