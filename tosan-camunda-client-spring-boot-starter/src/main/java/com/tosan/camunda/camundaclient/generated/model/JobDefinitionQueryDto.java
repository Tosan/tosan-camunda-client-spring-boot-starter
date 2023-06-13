package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tosan.camunda.camundaclient.generated.model.JobDefinitionQueryDtoSortingInner;
import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * A Job definition query which defines a list of Job definitions
 */

@Schema(name = "JobDefinitionQueryDto", description = "A Job definition query which defines a list of Job definitions")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class JobDefinitionQueryDto {

  private String jobDefinitionId = null;

  @Valid
  private List<String> activityIdIn;

  private String processDefinitionId = null;

  private String processDefinitionKey = null;

  private String jobType = null;

  private String jobConfiguration = null;

  private Boolean active = null;

  private Boolean suspended = null;

  private Boolean withOverridingJobPriority = null;

  @Valid
  private List<String> tenantIdIn;

  private Boolean withoutTenantId = null;

  private Boolean includeJobDefinitionsWithoutTenantId = null;

  @Valid
  private List<@Valid JobDefinitionQueryDtoSortingInner> sorting;

  public JobDefinitionQueryDto jobDefinitionId(String jobDefinitionId) {
    this.jobDefinitionId = jobDefinitionId;
    return this;
  }

  /**
   * Filter by job definition id.
   * @return jobDefinitionId
  */
  
  @Schema(name = "jobDefinitionId", description = "Filter by job definition id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jobDefinitionId")
  public String getJobDefinitionId() {
    return jobDefinitionId;
  }

  public void setJobDefinitionId(String jobDefinitionId) {
    this.jobDefinitionId = jobDefinitionId;
  }

  public JobDefinitionQueryDto activityIdIn(List<String> activityIdIn) {
    this.activityIdIn = activityIdIn;
    return this;
  }

  public JobDefinitionQueryDto addActivityIdInItem(String activityIdInItem) {
    if (this.activityIdIn == null) {
      this.activityIdIn = new ArrayList<>();
    }
    this.activityIdIn.add(activityIdInItem);
    return this;
  }

  /**
   * Only include job definitions which belong to one of the passed activity ids.
   * @return activityIdIn
  */
  
  @Schema(name = "activityIdIn", description = "Only include job definitions which belong to one of the passed activity ids.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activityIdIn")
  public List<String> getActivityIdIn() {
    return activityIdIn;
  }

  public void setActivityIdIn(List<String> activityIdIn) {
    this.activityIdIn = activityIdIn;
  }

  public JobDefinitionQueryDto processDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
    return this;
  }

  /**
   * Only include job definitions which exist for the given process definition id.
   * @return processDefinitionId
  */
  
  @Schema(name = "processDefinitionId", description = "Only include job definitions which exist for the given process definition id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionId")
  public String getProcessDefinitionId() {
    return processDefinitionId;
  }

  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }

  public JobDefinitionQueryDto processDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
    return this;
  }

  /**
   * Only include job definitions which exist for the given process definition key.
   * @return processDefinitionKey
  */
  
  @Schema(name = "processDefinitionKey", description = "Only include job definitions which exist for the given process definition key.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionKey")
  public String getProcessDefinitionKey() {
    return processDefinitionKey;
  }

  public void setProcessDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
  }

  public JobDefinitionQueryDto jobType(String jobType) {
    this.jobType = jobType;
    return this;
  }

  /**
   * Only include job definitions which exist for the given job type. See the [User Guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/the-job-executor/#job-creation) for more information about job types.
   * @return jobType
  */
  
  @Schema(name = "jobType", description = "Only include job definitions which exist for the given job type. See the [User Guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/the-job-executor/#job-creation) for more information about job types.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jobType")
  public String getJobType() {
    return jobType;
  }

  public void setJobType(String jobType) {
    this.jobType = jobType;
  }

  public JobDefinitionQueryDto jobConfiguration(String jobConfiguration) {
    this.jobConfiguration = jobConfiguration;
    return this;
  }

  /**
   * Only include job definitions which exist for the given job configuration. For example: for timer jobs it is the timer configuration.
   * @return jobConfiguration
  */
  
  @Schema(name = "jobConfiguration", description = "Only include job definitions which exist for the given job configuration. For example: for timer jobs it is the timer configuration.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jobConfiguration")
  public String getJobConfiguration() {
    return jobConfiguration;
  }

  public void setJobConfiguration(String jobConfiguration) {
    this.jobConfiguration = jobConfiguration;
  }

  public JobDefinitionQueryDto active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Only include active job definitions. Value may only be `true`, as `false` is the default behavior.
   * @return active
  */
  
  @Schema(name = "active", description = "Only include active job definitions. Value may only be `true`, as `false` is the default behavior.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public JobDefinitionQueryDto suspended(Boolean suspended) {
    this.suspended = suspended;
    return this;
  }

  /**
   * Only include suspended job definitions. Value may only be `true`, as `false` is the default behavior.
   * @return suspended
  */
  
  @Schema(name = "suspended", description = "Only include suspended job definitions. Value may only be `true`, as `false` is the default behavior.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("suspended")
  public Boolean getSuspended() {
    return suspended;
  }

  public void setSuspended(Boolean suspended) {
    this.suspended = suspended;
  }

  public JobDefinitionQueryDto withOverridingJobPriority(Boolean withOverridingJobPriority) {
    this.withOverridingJobPriority = withOverridingJobPriority;
    return this;
  }

  /**
   * Only include job definitions that have an overriding job priority defined. The only effective value is `true`. If set to `false`, this filter is not applied.
   * @return withOverridingJobPriority
  */
  
  @Schema(name = "withOverridingJobPriority", description = "Only include job definitions that have an overriding job priority defined. The only effective value is `true`. If set to `false`, this filter is not applied.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("withOverridingJobPriority")
  public Boolean getWithOverridingJobPriority() {
    return withOverridingJobPriority;
  }

  public void setWithOverridingJobPriority(Boolean withOverridingJobPriority) {
    this.withOverridingJobPriority = withOverridingJobPriority;
  }

  public JobDefinitionQueryDto tenantIdIn(List<String> tenantIdIn) {
    this.tenantIdIn = tenantIdIn;
    return this;
  }

  public JobDefinitionQueryDto addTenantIdInItem(String tenantIdInItem) {
    if (this.tenantIdIn == null) {
      this.tenantIdIn = new ArrayList<>();
    }
    this.tenantIdIn.add(tenantIdInItem);
    return this;
  }

  /**
   * Only include job definitions which belong to one of the passed tenant ids.
   * @return tenantIdIn
  */
  
  @Schema(name = "tenantIdIn", description = "Only include job definitions which belong to one of the passed tenant ids.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tenantIdIn")
  public List<String> getTenantIdIn() {
    return tenantIdIn;
  }

  public void setTenantIdIn(List<String> tenantIdIn) {
    this.tenantIdIn = tenantIdIn;
  }

  public JobDefinitionQueryDto withoutTenantId(Boolean withoutTenantId) {
    this.withoutTenantId = withoutTenantId;
    return this;
  }

  /**
   * Only include job definitions which belong to no tenant. Value may only be `true`, as `false` is the default behavior.
   * @return withoutTenantId
  */
  
  @Schema(name = "withoutTenantId", description = "Only include job definitions which belong to no tenant. Value may only be `true`, as `false` is the default behavior.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("withoutTenantId")
  public Boolean getWithoutTenantId() {
    return withoutTenantId;
  }

  public void setWithoutTenantId(Boolean withoutTenantId) {
    this.withoutTenantId = withoutTenantId;
  }

  public JobDefinitionQueryDto includeJobDefinitionsWithoutTenantId(Boolean includeJobDefinitionsWithoutTenantId) {
    this.includeJobDefinitionsWithoutTenantId = includeJobDefinitionsWithoutTenantId;
    return this;
  }

  /**
   * Include job definitions which belong to no tenant. Can be used in combination with `tenantIdIn`. Value may only be `true`, as `false` is the default behavior.
   * @return includeJobDefinitionsWithoutTenantId
  */
  
  @Schema(name = "includeJobDefinitionsWithoutTenantId", description = "Include job definitions which belong to no tenant. Can be used in combination with `tenantIdIn`. Value may only be `true`, as `false` is the default behavior.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("includeJobDefinitionsWithoutTenantId")
  public Boolean getIncludeJobDefinitionsWithoutTenantId() {
    return includeJobDefinitionsWithoutTenantId;
  }

  public void setIncludeJobDefinitionsWithoutTenantId(Boolean includeJobDefinitionsWithoutTenantId) {
    this.includeJobDefinitionsWithoutTenantId = includeJobDefinitionsWithoutTenantId;
  }

  public JobDefinitionQueryDto sorting(List<@Valid JobDefinitionQueryDtoSortingInner> sorting) {
    this.sorting = sorting;
    return this;
  }

  public JobDefinitionQueryDto addSortingItem(JobDefinitionQueryDtoSortingInner sortingItem) {
    if (this.sorting == null) {
      this.sorting = new ArrayList<>();
    }
    this.sorting.add(sortingItem);
    return this;
  }

  /**
   * An array of criteria to sort the result by. Each element of the array is                        an object that specifies one ordering. The position in the array                        identifies the rank of an ordering, i.e., whether it is primary, secondary,                        etc. Sorting has no effect for `count` endpoints.
   * @return sorting
  */
  @Valid 
  @Schema(name = "sorting", description = "An array of criteria to sort the result by. Each element of the array is                        an object that specifies one ordering. The position in the array                        identifies the rank of an ordering, i.e., whether it is primary, secondary,                        etc. Sorting has no effect for `count` endpoints.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sorting")
  public List<@Valid JobDefinitionQueryDtoSortingInner> getSorting() {
    return sorting;
  }

  public void setSorting(List<@Valid JobDefinitionQueryDtoSortingInner> sorting) {
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
    JobDefinitionQueryDto jobDefinitionQueryDto = (JobDefinitionQueryDto) o;
    return Objects.equals(this.jobDefinitionId, jobDefinitionQueryDto.jobDefinitionId) &&
        Objects.equals(this.activityIdIn, jobDefinitionQueryDto.activityIdIn) &&
        Objects.equals(this.processDefinitionId, jobDefinitionQueryDto.processDefinitionId) &&
        Objects.equals(this.processDefinitionKey, jobDefinitionQueryDto.processDefinitionKey) &&
        Objects.equals(this.jobType, jobDefinitionQueryDto.jobType) &&
        Objects.equals(this.jobConfiguration, jobDefinitionQueryDto.jobConfiguration) &&
        Objects.equals(this.active, jobDefinitionQueryDto.active) &&
        Objects.equals(this.suspended, jobDefinitionQueryDto.suspended) &&
        Objects.equals(this.withOverridingJobPriority, jobDefinitionQueryDto.withOverridingJobPriority) &&
        Objects.equals(this.tenantIdIn, jobDefinitionQueryDto.tenantIdIn) &&
        Objects.equals(this.withoutTenantId, jobDefinitionQueryDto.withoutTenantId) &&
        Objects.equals(this.includeJobDefinitionsWithoutTenantId, jobDefinitionQueryDto.includeJobDefinitionsWithoutTenantId) &&
        Objects.equals(this.sorting, jobDefinitionQueryDto.sorting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobDefinitionId, activityIdIn, processDefinitionId, processDefinitionKey, jobType, jobConfiguration, active, suspended, withOverridingJobPriority, tenantIdIn, withoutTenantId, includeJobDefinitionsWithoutTenantId, sorting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobDefinitionQueryDto {\n");
    sb.append("    jobDefinitionId: ").append(toIndentedString(jobDefinitionId)).append("\n");
    sb.append("    activityIdIn: ").append(toIndentedString(activityIdIn)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
    sb.append("    jobConfiguration: ").append(toIndentedString(jobConfiguration)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
    sb.append("    withOverridingJobPriority: ").append(toIndentedString(withOverridingJobPriority)).append("\n");
    sb.append("    tenantIdIn: ").append(toIndentedString(tenantIdIn)).append("\n");
    sb.append("    withoutTenantId: ").append(toIndentedString(withoutTenantId)).append("\n");
    sb.append("    includeJobDefinitionsWithoutTenantId: ").append(toIndentedString(includeJobDefinitionsWithoutTenantId)).append("\n");
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

