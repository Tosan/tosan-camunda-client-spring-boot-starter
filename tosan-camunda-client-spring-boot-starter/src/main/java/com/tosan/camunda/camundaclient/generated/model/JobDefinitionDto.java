package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * JobDefinitionDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class JobDefinitionDto {

  private String id = null;

  private String processDefinitionId = null;

  private String processDefinitionKey = null;

  private String activityId = null;

  private String jobType = null;

  private String jobConfiguration = null;

  private Long overridingJobPriority = null;

  private Boolean suspended = null;

  private String tenantId = null;

  private String deploymentId = null;

  public JobDefinitionDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the job definition.
   * @return id
  */
  
  @Schema(name = "id", description = "The id of the job definition.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public JobDefinitionDto processDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
    return this;
  }

  /**
   * The id of the process definition this job definition is associated with.
   * @return processDefinitionId
  */
  
  @Schema(name = "processDefinitionId", description = "The id of the process definition this job definition is associated with.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionId")
  public String getProcessDefinitionId() {
    return processDefinitionId;
  }

  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }

  public JobDefinitionDto processDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
    return this;
  }

  /**
   * The key of the process definition this job definition is associated with.
   * @return processDefinitionKey
  */
  
  @Schema(name = "processDefinitionKey", description = "The key of the process definition this job definition is associated with.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionKey")
  public String getProcessDefinitionKey() {
    return processDefinitionKey;
  }

  public void setProcessDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
  }

  public JobDefinitionDto activityId(String activityId) {
    this.activityId = activityId;
    return this;
  }

  /**
   * The id of the activity this job definition is associated with.
   * @return activityId
  */
  
  @Schema(name = "activityId", description = "The id of the activity this job definition is associated with.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activityId")
  public String getActivityId() {
    return activityId;
  }

  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }

  public JobDefinitionDto jobType(String jobType) {
    this.jobType = jobType;
    return this;
  }

  /**
   * The type of the job which is running for this job definition. See the [User Guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/the-job-executor/#job-creation) for more information about job types.
   * @return jobType
  */
  
  @Schema(name = "jobType", description = "The type of the job which is running for this job definition. See the [User Guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/the-job-executor/#job-creation) for more information about job types.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jobType")
  public String getJobType() {
    return jobType;
  }

  public void setJobType(String jobType) {
    this.jobType = jobType;
  }

  public JobDefinitionDto jobConfiguration(String jobConfiguration) {
    this.jobConfiguration = jobConfiguration;
    return this;
  }

  /**
   * The configuration of a job definition provides details about the jobs which will be created. For example: for timer jobs it is the timer configuration.
   * @return jobConfiguration
  */
  
  @Schema(name = "jobConfiguration", description = "The configuration of a job definition provides details about the jobs which will be created. For example: for timer jobs it is the timer configuration.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jobConfiguration")
  public String getJobConfiguration() {
    return jobConfiguration;
  }

  public void setJobConfiguration(String jobConfiguration) {
    this.jobConfiguration = jobConfiguration;
  }

  public JobDefinitionDto overridingJobPriority(Long overridingJobPriority) {
    this.overridingJobPriority = overridingJobPriority;
    return this;
  }

  /**
   * The execution priority defined for jobs that are created based on this definition. May be `null` when the priority has not been overridden on the job definition level.
   * @return overridingJobPriority
  */
  
  @Schema(name = "overridingJobPriority", description = "The execution priority defined for jobs that are created based on this definition. May be `null` when the priority has not been overridden on the job definition level.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("overridingJobPriority")
  public Long getOverridingJobPriority() {
    return overridingJobPriority;
  }

  public void setOverridingJobPriority(Long overridingJobPriority) {
    this.overridingJobPriority = overridingJobPriority;
  }

  public JobDefinitionDto suspended(Boolean suspended) {
    this.suspended = suspended;
    return this;
  }

  /**
   * Indicates whether this job definition is suspended or not.
   * @return suspended
  */
  
  @Schema(name = "suspended", description = "Indicates whether this job definition is suspended or not.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("suspended")
  public Boolean getSuspended() {
    return suspended;
  }

  public void setSuspended(Boolean suspended) {
    this.suspended = suspended;
  }

  public JobDefinitionDto tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * The id of the tenant this job definition is associated with.
   * @return tenantId
  */
  
  @Schema(name = "tenantId", description = "The id of the tenant this job definition is associated with.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tenantId")
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public JobDefinitionDto deploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
    return this;
  }

  /**
   * The id of the deployment this job definition is related to. In a deployment-aware setup, this leads to all jobs of the same definition being executed on the same node.
   * @return deploymentId
  */
  
  @Schema(name = "deploymentId", description = "The id of the deployment this job definition is related to. In a deployment-aware setup, this leads to all jobs of the same definition being executed on the same node.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deploymentId")
  public String getDeploymentId() {
    return deploymentId;
  }

  public void setDeploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobDefinitionDto jobDefinitionDto = (JobDefinitionDto) o;
    return Objects.equals(this.id, jobDefinitionDto.id) &&
        Objects.equals(this.processDefinitionId, jobDefinitionDto.processDefinitionId) &&
        Objects.equals(this.processDefinitionKey, jobDefinitionDto.processDefinitionKey) &&
        Objects.equals(this.activityId, jobDefinitionDto.activityId) &&
        Objects.equals(this.jobType, jobDefinitionDto.jobType) &&
        Objects.equals(this.jobConfiguration, jobDefinitionDto.jobConfiguration) &&
        Objects.equals(this.overridingJobPriority, jobDefinitionDto.overridingJobPriority) &&
        Objects.equals(this.suspended, jobDefinitionDto.suspended) &&
        Objects.equals(this.tenantId, jobDefinitionDto.tenantId) &&
        Objects.equals(this.deploymentId, jobDefinitionDto.deploymentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, processDefinitionId, processDefinitionKey, activityId, jobType, jobConfiguration, overridingJobPriority, suspended, tenantId, deploymentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobDefinitionDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
    sb.append("    jobConfiguration: ").append(toIndentedString(jobConfiguration)).append("\n");
    sb.append("    overridingJobPriority: ").append(toIndentedString(overridingJobPriority)).append("\n");
    sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
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

