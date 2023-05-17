package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;

/**
 * A Job definition query which defines a list of Job definitions
 */
@Schema(description = "A Job definition query which defines a list of Job definitions")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class JobDefinitionQueryDto   {
  @JsonProperty("jobDefinitionId")
  private String jobDefinitionId = null;

  @JsonProperty("activityIdIn")
  @Valid
  private List<String> activityIdIn = null;

  @JsonProperty("processDefinitionId")
  private String processDefinitionId = null;

  @JsonProperty("processDefinitionKey")
  private String processDefinitionKey = null;

  @JsonProperty("jobType")
  private String jobType = null;

  @JsonProperty("jobConfiguration")
  private String jobConfiguration = null;

  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("suspended")
  private Boolean suspended = null;

  @JsonProperty("withOverridingJobPriority")
  private Boolean withOverridingJobPriority = null;

  @JsonProperty("tenantIdIn")
  @Valid
  private List<String> tenantIdIn = null;

  @JsonProperty("withoutTenantId")
  private Boolean withoutTenantId = null;

  @JsonProperty("includeJobDefinitionsWithoutTenantId")
  private Boolean includeJobDefinitionsWithoutTenantId = null;

  @JsonProperty("sorting")
  @Valid
  private List<JobDefinitionQueryDtoSorting> sorting = null;

  public JobDefinitionQueryDto jobDefinitionId(String jobDefinitionId) {
    this.jobDefinitionId = jobDefinitionId;
    return this;
  }

  /**
   * Filter by job definition id.
   * @return jobDefinitionId
   **/
  @Schema(description = "Filter by job definition id.")
  
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
   **/
  @Schema(description = "Only include job definitions which belong to one of the passed activity ids.")
  
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
   **/
  @Schema(description = "Only include job definitions which exist for the given process definition id.")
  
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
   **/
  @Schema(description = "Only include job definitions which exist for the given process definition key.")
  
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
   **/
  @Schema(description = "Only include job definitions which exist for the given job type. See the [User Guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/the-job-executor/#job-creation) for more information about job types.")
  
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
   **/
  @Schema(description = "Only include job definitions which exist for the given job configuration. For example: for timer jobs it is the timer configuration.")
  
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
   **/
  @Schema(description = "Only include active job definitions. Value may only be `true`, as `false` is the default behavior.")
  
    public Boolean isActive() {
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
   **/
  @Schema(description = "Only include suspended job definitions. Value may only be `true`, as `false` is the default behavior.")
  
    public Boolean isSuspended() {
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
   **/
  @Schema(description = "Only include job definitions that have an overriding job priority defined. The only effective value is `true`. If set to `false`, this filter is not applied.")
  
    public Boolean isWithOverridingJobPriority() {
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
   **/
  @Schema(description = "Only include job definitions which belong to one of the passed tenant ids.")
  
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
   **/
  @Schema(description = "Only include job definitions which belong to no tenant. Value may only be `true`, as `false` is the default behavior.")
  
    public Boolean isWithoutTenantId() {
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
   **/
  @Schema(description = "Include job definitions which belong to no tenant. Can be used in combination with `tenantIdIn`. Value may only be `true`, as `false` is the default behavior.")
  
    public Boolean isIncludeJobDefinitionsWithoutTenantId() {
    return includeJobDefinitionsWithoutTenantId;
  }

  public void setIncludeJobDefinitionsWithoutTenantId(Boolean includeJobDefinitionsWithoutTenantId) {
    this.includeJobDefinitionsWithoutTenantId = includeJobDefinitionsWithoutTenantId;
  }

  public JobDefinitionQueryDto sorting(List<JobDefinitionQueryDtoSorting> sorting) {
    this.sorting = sorting;
    return this;
  }

  public JobDefinitionQueryDto addSortingItem(JobDefinitionQueryDtoSorting sortingItem) {
    if (this.sorting == null) {
      this.sorting = new ArrayList<>();
    }
    this.sorting.add(sortingItem);
    return this;
  }

  /**
   * An array of criteria to sort the result by. Each element of the array is                        an object that specifies one ordering. The position in the array                        identifies the rank of an ordering, i.e., whether it is primary, secondary,                        etc. Sorting has no effect for `count` endpoints.
   * @return sorting
   **/
  @Schema(description = "An array of criteria to sort the result by. Each element of the array is                        an object that specifies one ordering. The position in the array                        identifies the rank of an ordering, i.e., whether it is primary, secondary,                        etc. Sorting has no effect for `count` endpoints.")
      @Valid
    public List<JobDefinitionQueryDtoSorting> getSorting() {
    return sorting;
  }

  public void setSorting(List<JobDefinitionQueryDtoSorting> sorting) {
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
