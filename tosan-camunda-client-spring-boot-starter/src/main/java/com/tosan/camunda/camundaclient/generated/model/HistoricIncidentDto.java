package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * HistoricIncidentDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class HistoricIncidentDto   {
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

  @JsonProperty("rootProcessInstanceId")
  private String rootProcessInstanceId = null;

  @JsonProperty("createTime")
  private OffsetDateTime createTime = null;

  @JsonProperty("endTime")
  private OffsetDateTime endTime = null;

  @JsonProperty("removalTime")
  private OffsetDateTime removalTime = null;

  @JsonProperty("incidentType")
  private String incidentType = null;

  @JsonProperty("activityId")
  private String activityId = null;

  @JsonProperty("failedActivityId")
  private String failedActivityId = null;

  @JsonProperty("causeIncidentId")
  private String causeIncidentId = null;

  @JsonProperty("rootCauseIncidentId")
  private String rootCauseIncidentId = null;

  @JsonProperty("configuration")
  private String _configuration = null;

  @JsonProperty("historyConfiguration")
  private String historyConfiguration = null;

  @JsonProperty("incidentMessage")
  private String incidentMessage = null;

  @JsonProperty("tenantId")
  private String tenantId = null;

  @JsonProperty("jobDefinitionId")
  private String jobDefinitionId = null;

  @JsonProperty("open")
  private Boolean open = null;

  @JsonProperty("deleted")
  private Boolean deleted = null;

  @JsonProperty("resolved")
  private Boolean resolved = null;

  @JsonProperty("annotation")
  private String annotation = null;

  public HistoricIncidentDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the incident.
   * @return id
   **/
  @Schema(description = "The id of the incident.")
  
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
   **/
  @Schema(description = "The key of the process definition this incident is associated with.")
  
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
   **/
  @Schema(description = "The id of the process definition this incident is associated with.")
  
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
   **/
  @Schema(description = "The key of the process definition this incident is associated with.")
  
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
   **/
  @Schema(description = "The id of the execution this incident is associated with.")
  
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
   **/
  @Schema(description = "The process instance id of the root process instance that initiated the process containing this incident.")
  
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
   **/
  @Schema(description = "The time this incident happened.  [Default format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.")
  
    @Valid
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
   **/
  @Schema(description = "The time this incident has been deleted or resolved.  [Default format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.")
  
    @Valid
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
   **/
  @Schema(description = "The time after which the incident should be removed by the History Cleanup job. [Default format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.")
  
    @Valid
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
   **/
  @Schema(description = "The type of incident, for example: `failedJobs` will be returned in case of an incident which identified a failed job during the execution of a process instance. See the [User Guide](/manual/develop/user- guide/process-engine/incidents/#incident-types) for a list of incident types.")
  
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
   **/
  @Schema(description = "The id of the activity this incident is associated with.")
  
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
   **/
  @Schema(description = "The id of the activity on which the last exception occurred.")
  
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
   **/
  @Schema(description = "The id of the associated cause incident which has been triggered.")
  
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
   **/
  @Schema(description = "The id of the associated root cause incident which has been triggered.")
  
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
   **/
  @Schema(description = "The payload of this incident.")
  
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
   **/
  @Schema(description = "The payload of this incident at the time when it occurred.")
  
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
   **/
  @Schema(description = "The message of this incident.")
  
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
   **/
  @Schema(description = "The id of the tenant this incident is associated with.")
  
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
   **/
  @Schema(description = "The job definition id the incident is associated with.")
  
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
   **/
  @Schema(description = "If true, this incident is open.")
  
    public Boolean isOpen() {
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
   **/
  @Schema(description = "If true, this incident has been deleted.")
  
    public Boolean isDeleted() {
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
   **/
  @Schema(description = "If true, this incident has been resolved.")
  
    public Boolean isResolved() {
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
   **/
  @Schema(description = "The annotation set to the incident.")
  
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
