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
 * JobDefinitionsSuspensionStateDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class JobDefinitionsSuspensionStateDto {

  private String processDefinitionId = null;

  private String processDefinitionKey = null;

  private String processDefinitionTenantId = null;

  private Boolean processDefinitionWithoutTenantId = null;

  private Boolean includeJobs = null;

  private String executionDate = null;

  private Boolean suspended = null;

  public JobDefinitionsSuspensionStateDto processDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
    return this;
  }

  /**
   * The process definition id of the job definitions to activate or suspend.
   * @return processDefinitionId
  */
  
  @Schema(name = "processDefinitionId", description = "The process definition id of the job definitions to activate or suspend.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionId")
  public String getProcessDefinitionId() {
    return processDefinitionId;
  }

  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }

  public JobDefinitionsSuspensionStateDto processDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
    return this;
  }

  /**
   * The process definition key of the job definitions to activate or suspend.
   * @return processDefinitionKey
  */
  
  @Schema(name = "processDefinitionKey", description = "The process definition key of the job definitions to activate or suspend.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionKey")
  public String getProcessDefinitionKey() {
    return processDefinitionKey;
  }

  public void setProcessDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
  }

  public JobDefinitionsSuspensionStateDto processDefinitionTenantId(String processDefinitionTenantId) {
    this.processDefinitionTenantId = processDefinitionTenantId;
    return this;
  }

  /**
   * Only activate or suspend job definitions of a process definition which belongs to a tenant with the given id.  Note that this parameter will only be considered  in combination with `processDefinitionKey`.
   * @return processDefinitionTenantId
  */
  
  @Schema(name = "processDefinitionTenantId", description = "Only activate or suspend job definitions of a process definition which belongs to a tenant with the given id.  Note that this parameter will only be considered  in combination with `processDefinitionKey`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionTenantId")
  public String getProcessDefinitionTenantId() {
    return processDefinitionTenantId;
  }

  public void setProcessDefinitionTenantId(String processDefinitionTenantId) {
    this.processDefinitionTenantId = processDefinitionTenantId;
  }

  public JobDefinitionsSuspensionStateDto processDefinitionWithoutTenantId(Boolean processDefinitionWithoutTenantId) {
    this.processDefinitionWithoutTenantId = processDefinitionWithoutTenantId;
    return this;
  }

  /**
   * Only activate or suspend job definitions of a process definition which belongs to no tenant. Value may only be `true`, as `false` is the default behavior.  Note that this parameter will only be considered  in combination with `processDefinitionKey`.
   * @return processDefinitionWithoutTenantId
  */
  
  @Schema(name = "processDefinitionWithoutTenantId", description = "Only activate or suspend job definitions of a process definition which belongs to no tenant. Value may only be `true`, as `false` is the default behavior.  Note that this parameter will only be considered  in combination with `processDefinitionKey`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionWithoutTenantId")
  public Boolean getProcessDefinitionWithoutTenantId() {
    return processDefinitionWithoutTenantId;
  }

  public void setProcessDefinitionWithoutTenantId(Boolean processDefinitionWithoutTenantId) {
    this.processDefinitionWithoutTenantId = processDefinitionWithoutTenantId;
  }

  public JobDefinitionsSuspensionStateDto includeJobs(Boolean includeJobs) {
    this.includeJobs = includeJobs;
    return this;
  }

  /**
   * A `Boolean` value which indicates whether to activate or suspend also all jobs of the referenced job definitions. When the value is set to `true`, all jobs of the provided job definitions will be activated or suspended and when the value is set to `false`, the suspension state of all jobs of the provided job definitions will not be updated.
   * @return includeJobs
  */
  
  @Schema(name = "includeJobs", description = "A `Boolean` value which indicates whether to activate or suspend also all jobs of the referenced job definitions. When the value is set to `true`, all jobs of the provided job definitions will be activated or suspended and when the value is set to `false`, the suspension state of all jobs of the provided job definitions will not be updated.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("includeJobs")
  public Boolean getIncludeJobs() {
    return includeJobs;
  }

  public void setIncludeJobs(Boolean includeJobs) {
    this.includeJobs = includeJobs;
  }

  public JobDefinitionsSuspensionStateDto executionDate(String executionDate) {
    this.executionDate = executionDate;
    return this;
  }

  /**
   * The date on which the referenced job definitions will be activated or suspended. If null, the suspension state of the given job definitions is updated immediately. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM- dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.
   * @return executionDate
  */
  
  @Schema(name = "executionDate", description = "The date on which the referenced job definitions will be activated or suspended. If null, the suspension state of the given job definitions is updated immediately. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM- dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("executionDate")
  public String getExecutionDate() {
    return executionDate;
  }

  public void setExecutionDate(String executionDate) {
    this.executionDate = executionDate;
  }

  public JobDefinitionsSuspensionStateDto suspended(Boolean suspended) {
    this.suspended = suspended;
    return this;
  }

  /**
   * A Boolean value which indicates whether to activate or suspend a given instance  (e.g. process instance, job, job definition, or batch). When the value is set to true,  the given instance will be suspended and when the value is set to false,  the given instance will be activated.
   * @return suspended
  */
  
  @Schema(name = "suspended", description = "A Boolean value which indicates whether to activate or suspend a given instance  (e.g. process instance, job, job definition, or batch). When the value is set to true,  the given instance will be suspended and when the value is set to false,  the given instance will be activated.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("suspended")
  public Boolean getSuspended() {
    return suspended;
  }

  public void setSuspended(Boolean suspended) {
    this.suspended = suspended;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobDefinitionsSuspensionStateDto jobDefinitionsSuspensionStateDto = (JobDefinitionsSuspensionStateDto) o;
    return Objects.equals(this.processDefinitionId, jobDefinitionsSuspensionStateDto.processDefinitionId) &&
        Objects.equals(this.processDefinitionKey, jobDefinitionsSuspensionStateDto.processDefinitionKey) &&
        Objects.equals(this.processDefinitionTenantId, jobDefinitionsSuspensionStateDto.processDefinitionTenantId) &&
        Objects.equals(this.processDefinitionWithoutTenantId, jobDefinitionsSuspensionStateDto.processDefinitionWithoutTenantId) &&
        Objects.equals(this.includeJobs, jobDefinitionsSuspensionStateDto.includeJobs) &&
        Objects.equals(this.executionDate, jobDefinitionsSuspensionStateDto.executionDate) &&
        Objects.equals(this.suspended, jobDefinitionsSuspensionStateDto.suspended);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processDefinitionId, processDefinitionKey, processDefinitionTenantId, processDefinitionWithoutTenantId, includeJobs, executionDate, suspended);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobDefinitionsSuspensionStateDto {\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    processDefinitionTenantId: ").append(toIndentedString(processDefinitionTenantId)).append("\n");
    sb.append("    processDefinitionWithoutTenantId: ").append(toIndentedString(processDefinitionWithoutTenantId)).append("\n");
    sb.append("    includeJobs: ").append(toIndentedString(includeJobs)).append("\n");
    sb.append("    executionDate: ").append(toIndentedString(executionDate)).append("\n");
    sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
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

