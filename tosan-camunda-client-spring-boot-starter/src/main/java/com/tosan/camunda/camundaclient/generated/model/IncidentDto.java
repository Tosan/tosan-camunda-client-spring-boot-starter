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
 * IncidentDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class IncidentDto {

  private String id = null;

  private String processDefinitionId = null;

  private String processInstanceId = null;

  private String executionId = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime incidentTimestamp = null;

  private String incidentType = null;

  private String activityId = null;

  private String failedActivityId = null;

  private String causeIncidentId = null;

  private String rootCauseIncidentId = null;

  private String _configuration = null;

  private String tenantId = null;

  private String incidentMessage = null;

  private String jobDefinitionId = null;

  private String annotation = null;

  public IncidentDto id(String id) {
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

  public IncidentDto processDefinitionId(String processDefinitionId) {
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

  public IncidentDto processInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
    return this;
  }

  /**
   * The id of the process instance this incident is associated with.
   * @return processInstanceId
  */
  
  @Schema(name = "processInstanceId", description = "The id of the process instance this incident is associated with.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processInstanceId")
  public String getProcessInstanceId() {
    return processInstanceId;
  }

  public void setProcessInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
  }

  public IncidentDto executionId(String executionId) {
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

  public IncidentDto incidentTimestamp(OffsetDateTime incidentTimestamp) {
    this.incidentTimestamp = incidentTimestamp;
    return this;
  }

  /**
   * The time this incident happened. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.
   * @return incidentTimestamp
  */
  @Valid 
  @Schema(name = "incidentTimestamp", description = "The time this incident happened. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("incidentTimestamp")
  public OffsetDateTime getIncidentTimestamp() {
    return incidentTimestamp;
  }

  public void setIncidentTimestamp(OffsetDateTime incidentTimestamp) {
    this.incidentTimestamp = incidentTimestamp;
  }

  public IncidentDto incidentType(String incidentType) {
    this.incidentType = incidentType;
    return this;
  }

  /**
   * The type of incident, for example: `failedJobs` will be returned in case of an incident which identified a failed job during the execution of a process instance. See the [User Guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/incidents/#incident-types) for a list of incident types.
   * @return incidentType
  */
  
  @Schema(name = "incidentType", description = "The type of incident, for example: `failedJobs` will be returned in case of an incident which identified a failed job during the execution of a process instance. See the [User Guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/incidents/#incident-types) for a list of incident types.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("incidentType")
  public String getIncidentType() {
    return incidentType;
  }

  public void setIncidentType(String incidentType) {
    this.incidentType = incidentType;
  }

  public IncidentDto activityId(String activityId) {
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

  public IncidentDto failedActivityId(String failedActivityId) {
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

  public IncidentDto causeIncidentId(String causeIncidentId) {
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

  public IncidentDto rootCauseIncidentId(String rootCauseIncidentId) {
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

  public IncidentDto _configuration(String _configuration) {
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

  public IncidentDto tenantId(String tenantId) {
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

  public IncidentDto incidentMessage(String incidentMessage) {
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

  public IncidentDto jobDefinitionId(String jobDefinitionId) {
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

  public IncidentDto annotation(String annotation) {
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
    IncidentDto incidentDto = (IncidentDto) o;
    return Objects.equals(this.id, incidentDto.id) &&
        Objects.equals(this.processDefinitionId, incidentDto.processDefinitionId) &&
        Objects.equals(this.processInstanceId, incidentDto.processInstanceId) &&
        Objects.equals(this.executionId, incidentDto.executionId) &&
        Objects.equals(this.incidentTimestamp, incidentDto.incidentTimestamp) &&
        Objects.equals(this.incidentType, incidentDto.incidentType) &&
        Objects.equals(this.activityId, incidentDto.activityId) &&
        Objects.equals(this.failedActivityId, incidentDto.failedActivityId) &&
        Objects.equals(this.causeIncidentId, incidentDto.causeIncidentId) &&
        Objects.equals(this.rootCauseIncidentId, incidentDto.rootCauseIncidentId) &&
        Objects.equals(this._configuration, incidentDto._configuration) &&
        Objects.equals(this.tenantId, incidentDto.tenantId) &&
        Objects.equals(this.incidentMessage, incidentDto.incidentMessage) &&
        Objects.equals(this.jobDefinitionId, incidentDto.jobDefinitionId) &&
        Objects.equals(this.annotation, incidentDto.annotation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, processDefinitionId, processInstanceId, executionId, incidentTimestamp, incidentType, activityId, failedActivityId, causeIncidentId, rootCauseIncidentId, _configuration, tenantId, incidentMessage, jobDefinitionId, annotation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
    sb.append("    incidentTimestamp: ").append(toIndentedString(incidentTimestamp)).append("\n");
    sb.append("    incidentType: ").append(toIndentedString(incidentType)).append("\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    failedActivityId: ").append(toIndentedString(failedActivityId)).append("\n");
    sb.append("    causeIncidentId: ").append(toIndentedString(causeIncidentId)).append("\n");
    sb.append("    rootCauseIncidentId: ").append(toIndentedString(rootCauseIncidentId)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    incidentMessage: ").append(toIndentedString(incidentMessage)).append("\n");
    sb.append("    jobDefinitionId: ").append(toIndentedString(jobDefinitionId)).append("\n");
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

