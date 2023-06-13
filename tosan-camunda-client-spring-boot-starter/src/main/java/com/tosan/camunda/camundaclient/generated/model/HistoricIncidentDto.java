package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * HistoricIncidentDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class HistoricIncidentDto {

  private String id = null;

  private String processDefinitionKey = null;

  private String processDefinitionId = null;

  private String processInstanceId = null;

  private String executionId = null;

  private String rootProcessInstanceId = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createTime = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime endTime = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime removalTime = null;

  private String incidentType = null;

  private String activityId = null;

  private String failedActivityId = null;

  private String causeIncidentId = null;

  private String rootCauseIncidentId = null;

  private String _configuration = null;

  private String historyConfiguration = null;

  private String incidentMessage = null;

  private String tenantId = null;

  private String jobDefinitionId = null;

  private Boolean open = null;

  private Boolean deleted = null;

  private Boolean resolved = null;

  private String annotation = null;

  public HistoricIncidentDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the incident.
   * @return id
  */
  
  @Schema(name = "id", description = "The id of the incident.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public HistoricIncidentDto processDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
    return this;
  }

  /**
   * The key of the process definition this incident is associated with.
   * @return processDefinitionKey
  */
  
  @Schema(name = "processDefinitionKey", description = "The key of the process definition this incident is associated with.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionKey")
  public String getProcessDefinitionKey() {
    return processDefinitionKey;
  }

  public void setProcessDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
  }

  public HistoricIncidentDto processDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
    return this;
  }

  /**
   * The id of the process definition this incident is associated with.
   * @return processDefinitionId
  */
  
  @Schema(name = "processDefinitionId", description = "The id of the process definition this incident is associated with.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionId")
  public String getProcessDefinitionId() {
    return processDefinitionId;
  }

  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }

  public HistoricIncidentDto processInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
    return this;
  }

  /**
   * The key of the process definition this incident is associated with.
   * @return processInstanceId
  */
  
  @Schema(name = "processInstanceId", description = "The key of the process definition this incident is associated with.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processInstanceId")
  public String getProcessInstanceId() {
    return processInstanceId;
  }

  public void setProcessInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
  }

  public HistoricIncidentDto executionId(String executionId) {
    this.executionId = executionId;
    return this;
  }

  /**
   * The id of the execution this incident is associated with.
   * @return executionId
  */
  
  @Schema(name = "executionId", description = "The id of the execution this incident is associated with.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("executionId")
  public String getExecutionId() {
    return executionId;
  }

  public void setExecutionId(String executionId) {
    this.executionId = executionId;
  }

  public HistoricIncidentDto rootProcessInstanceId(String rootProcessInstanceId) {
    this.rootProcessInstanceId = rootProcessInstanceId;
    return this;
  }

  /**
   * The process instance id of the root process instance that initiated the process containing this incident.
   * @return rootProcessInstanceId
  */
  
  @Schema(name = "rootProcessInstanceId", description = "The process instance id of the root process instance that initiated the process containing this incident.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rootProcessInstanceId")
  public String getRootProcessInstanceId() {
    return rootProcessInstanceId;
  }

  public void setRootProcessInstanceId(String rootProcessInstanceId) {
    this.rootProcessInstanceId = rootProcessInstanceId;
  }

  public HistoricIncidentDto createTime(OffsetDateTime createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * The time this incident happened.  [Default format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.
   * @return createTime
  */
  @Valid 
  @Schema(name = "createTime", description = "The time this incident happened.  [Default format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createTime")
  public OffsetDateTime getCreateTime() {
    return createTime;
  }

  public void setCreateTime(OffsetDateTime createTime) {
    this.createTime = createTime;
  }

  public HistoricIncidentDto endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * The time this incident has been deleted or resolved.  [Default format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.
   * @return endTime
  */
  @Valid 
  @Schema(name = "endTime", description = "The time this incident has been deleted or resolved.  [Default format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endTime")
  public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }

  public HistoricIncidentDto removalTime(OffsetDateTime removalTime) {
    this.removalTime = removalTime;
    return this;
  }

  /**
   * The time after which the incident should be removed by the History Cleanup job. [Default format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.
   * @return removalTime
  */
  @Valid 
  @Schema(name = "removalTime", description = "The time after which the incident should be removed by the History Cleanup job. [Default format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("removalTime")
  public OffsetDateTime getRemovalTime() {
    return removalTime;
  }

  public void setRemovalTime(OffsetDateTime removalTime) {
    this.removalTime = removalTime;
  }

  public HistoricIncidentDto incidentType(String incidentType) {
    this.incidentType = incidentType;
    return this;
  }

  /**
   * The type of incident, for example: `failedJobs` will be returned in case of an incident which identified a failed job during the execution of a process instance. See the [User Guide](/manual/develop/user- guide/process-engine/incidents/#incident-types) for a list of incident types.
   * @return incidentType
  */
  
  @Schema(name = "incidentType", description = "The type of incident, for example: `failedJobs` will be returned in case of an incident which identified a failed job during the execution of a process instance. See the [User Guide](/manual/develop/user- guide/process-engine/incidents/#incident-types) for a list of incident types.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("incidentType")
  public String getIncidentType() {
    return incidentType;
  }

  public void setIncidentType(String incidentType) {
    this.incidentType = incidentType;
  }

  public HistoricIncidentDto activityId(String activityId) {
    this.activityId = activityId;
    return this;
  }

  /**
   * The id of the activity this incident is associated with.
   * @return activityId
  */
  
  @Schema(name = "activityId", description = "The id of the activity this incident is associated with.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activityId")
  public String getActivityId() {
    return activityId;
  }

  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }

  public HistoricIncidentDto failedActivityId(String failedActivityId) {
    this.failedActivityId = failedActivityId;
    return this;
  }

  /**
   * The id of the activity on which the last exception occurred.
   * @return failedActivityId
  */
  
  @Schema(name = "failedActivityId", description = "The id of the activity on which the last exception occurred.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("failedActivityId")
  public String getFailedActivityId() {
    return failedActivityId;
  }

  public void setFailedActivityId(String failedActivityId) {
    this.failedActivityId = failedActivityId;
  }

  public HistoricIncidentDto causeIncidentId(String causeIncidentId) {
    this.causeIncidentId = causeIncidentId;
    return this;
  }

  /**
   * The id of the associated cause incident which has been triggered.
   * @return causeIncidentId
  */
  
  @Schema(name = "causeIncidentId", description = "The id of the associated cause incident which has been triggered.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("causeIncidentId")
  public String getCauseIncidentId() {
    return causeIncidentId;
  }

  public void setCauseIncidentId(String causeIncidentId) {
    this.causeIncidentId = causeIncidentId;
  }

  public HistoricIncidentDto rootCauseIncidentId(String rootCauseIncidentId) {
    this.rootCauseIncidentId = rootCauseIncidentId;
    return this;
  }

  /**
   * The id of the associated root cause incident which has been triggered.
   * @return rootCauseIncidentId
  */
  
  @Schema(name = "rootCauseIncidentId", description = "The id of the associated root cause incident which has been triggered.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rootCauseIncidentId")
  public String getRootCauseIncidentId() {
    return rootCauseIncidentId;
  }

  public void setRootCauseIncidentId(String rootCauseIncidentId) {
    this.rootCauseIncidentId = rootCauseIncidentId;
  }

  public HistoricIncidentDto _configuration(String _configuration) {
    this._configuration = _configuration;
    return this;
  }

  /**
   * The payload of this incident.
   * @return _configuration
  */
  
  @Schema(name = "configuration", description = "The payload of this incident.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("configuration")
  public String getConfiguration() {
    return _configuration;
  }

  public void setConfiguration(String _configuration) {
    this._configuration = _configuration;
  }

  public HistoricIncidentDto historyConfiguration(String historyConfiguration) {
    this.historyConfiguration = historyConfiguration;
    return this;
  }

  /**
   * The payload of this incident at the time when it occurred.
   * @return historyConfiguration
  */
  
  @Schema(name = "historyConfiguration", description = "The payload of this incident at the time when it occurred.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("historyConfiguration")
  public String getHistoryConfiguration() {
    return historyConfiguration;
  }

  public void setHistoryConfiguration(String historyConfiguration) {
    this.historyConfiguration = historyConfiguration;
  }

  public HistoricIncidentDto incidentMessage(String incidentMessage) {
    this.incidentMessage = incidentMessage;
    return this;
  }

  /**
   * The message of this incident.
   * @return incidentMessage
  */
  
  @Schema(name = "incidentMessage", description = "The message of this incident.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("incidentMessage")
  public String getIncidentMessage() {
    return incidentMessage;
  }

  public void setIncidentMessage(String incidentMessage) {
    this.incidentMessage = incidentMessage;
  }

  public HistoricIncidentDto tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * The id of the tenant this incident is associated with.
   * @return tenantId
  */
  
  @Schema(name = "tenantId", description = "The id of the tenant this incident is associated with.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tenantId")
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public HistoricIncidentDto jobDefinitionId(String jobDefinitionId) {
    this.jobDefinitionId = jobDefinitionId;
    return this;
  }

  /**
   * The job definition id the incident is associated with.
   * @return jobDefinitionId
  */
  
  @Schema(name = "jobDefinitionId", description = "The job definition id the incident is associated with.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jobDefinitionId")
  public String getJobDefinitionId() {
    return jobDefinitionId;
  }

  public void setJobDefinitionId(String jobDefinitionId) {
    this.jobDefinitionId = jobDefinitionId;
  }

  public HistoricIncidentDto open(Boolean open) {
    this.open = open;
    return this;
  }

  /**
   * If true, this incident is open.
   * @return open
  */
  
  @Schema(name = "open", description = "If true, this incident is open.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("open")
  public Boolean getOpen() {
    return open;
  }

  public void setOpen(Boolean open) {
    this.open = open;
  }

  public HistoricIncidentDto deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

  /**
   * If true, this incident has been deleted.
   * @return deleted
  */
  
  @Schema(name = "deleted", description = "If true, this incident has been deleted.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deleted")
  public Boolean getDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  public HistoricIncidentDto resolved(Boolean resolved) {
    this.resolved = resolved;
    return this;
  }

  /**
   * If true, this incident has been resolved.
   * @return resolved
  */
  
  @Schema(name = "resolved", description = "If true, this incident has been resolved.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resolved")
  public Boolean getResolved() {
    return resolved;
  }

  public void setResolved(Boolean resolved) {
    this.resolved = resolved;
  }

  public HistoricIncidentDto annotation(String annotation) {
    this.annotation = annotation;
    return this;
  }

  /**
   * The annotation set to the incident.
   * @return annotation
  */
  
  @Schema(name = "annotation", description = "The annotation set to the incident.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("annotation")
  public String getAnnotation() {
    return annotation;
  }

  public void setAnnotation(String annotation) {
    this.annotation = annotation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricIncidentDto historicIncidentDto = (HistoricIncidentDto) o;
    return Objects.equals(this.id, historicIncidentDto.id) &&
        Objects.equals(this.processDefinitionKey, historicIncidentDto.processDefinitionKey) &&
        Objects.equals(this.processDefinitionId, historicIncidentDto.processDefinitionId) &&
        Objects.equals(this.processInstanceId, historicIncidentDto.processInstanceId) &&
        Objects.equals(this.executionId, historicIncidentDto.executionId) &&
        Objects.equals(this.rootProcessInstanceId, historicIncidentDto.rootProcessInstanceId) &&
        Objects.equals(this.createTime, historicIncidentDto.createTime) &&
        Objects.equals(this.endTime, historicIncidentDto.endTime) &&
        Objects.equals(this.removalTime, historicIncidentDto.removalTime) &&
        Objects.equals(this.incidentType, historicIncidentDto.incidentType) &&
        Objects.equals(this.activityId, historicIncidentDto.activityId) &&
        Objects.equals(this.failedActivityId, historicIncidentDto.failedActivityId) &&
        Objects.equals(this.causeIncidentId, historicIncidentDto.causeIncidentId) &&
        Objects.equals(this.rootCauseIncidentId, historicIncidentDto.rootCauseIncidentId) &&
        Objects.equals(this._configuration, historicIncidentDto._configuration) &&
        Objects.equals(this.historyConfiguration, historicIncidentDto.historyConfiguration) &&
        Objects.equals(this.incidentMessage, historicIncidentDto.incidentMessage) &&
        Objects.equals(this.tenantId, historicIncidentDto.tenantId) &&
        Objects.equals(this.jobDefinitionId, historicIncidentDto.jobDefinitionId) &&
        Objects.equals(this.open, historicIncidentDto.open) &&
        Objects.equals(this.deleted, historicIncidentDto.deleted) &&
        Objects.equals(this.resolved, historicIncidentDto.resolved) &&
        Objects.equals(this.annotation, historicIncidentDto.annotation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, processDefinitionKey, processDefinitionId, processInstanceId, executionId, rootProcessInstanceId, createTime, endTime, removalTime, incidentType, activityId, failedActivityId, causeIncidentId, rootCauseIncidentId, _configuration, historyConfiguration, incidentMessage, tenantId, jobDefinitionId, open, deleted, resolved, annotation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricIncidentDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
    sb.append("    rootProcessInstanceId: ").append(toIndentedString(rootProcessInstanceId)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    removalTime: ").append(toIndentedString(removalTime)).append("\n");
    sb.append("    incidentType: ").append(toIndentedString(incidentType)).append("\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    failedActivityId: ").append(toIndentedString(failedActivityId)).append("\n");
    sb.append("    causeIncidentId: ").append(toIndentedString(causeIncidentId)).append("\n");
    sb.append("    rootCauseIncidentId: ").append(toIndentedString(rootCauseIncidentId)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    historyConfiguration: ").append(toIndentedString(historyConfiguration)).append("\n");
    sb.append("    incidentMessage: ").append(toIndentedString(incidentMessage)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    jobDefinitionId: ").append(toIndentedString(jobDefinitionId)).append("\n");
    sb.append("    open: ").append(toIndentedString(open)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    resolved: ").append(toIndentedString(resolved)).append("\n");
    sb.append("    annotation: ").append(toIndentedString(annotation)).append("\n");
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

