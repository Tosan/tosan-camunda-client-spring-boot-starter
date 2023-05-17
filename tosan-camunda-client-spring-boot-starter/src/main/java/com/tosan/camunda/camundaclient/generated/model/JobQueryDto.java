package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;

/**
 * A Job instance query which defines a list of Job instances
 */
@Schema(description = "A Job instance query which defines a list of Job instances")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class JobQueryDto   {
  @JsonProperty("jobId")
  private String jobId = null;

  @JsonProperty("jobIds")
  @Valid
  private List<String> jobIds = null;

  @JsonProperty("jobDefinitionId")
  private String jobDefinitionId = null;

  @JsonProperty("processInstanceId")
  private String processInstanceId = null;

  @JsonProperty("processInstanceIds")
  @Valid
  private List<String> processInstanceIds = null;

  @JsonProperty("executionId")
  private String executionId = null;

  @JsonProperty("processDefinitionId")
  private String processDefinitionId = null;

  @JsonProperty("processDefinitionKey")
  private String processDefinitionKey = null;

  @JsonProperty("activityId")
  private String activityId = null;

  @JsonProperty("withRetriesLeft")
  private Boolean withRetriesLeft = null;

  @JsonProperty("executable")
  private Boolean executable = null;

  @JsonProperty("timers")
  private Boolean timers = null;

  @JsonProperty("messages")
  private Boolean messages = null;

  @JsonProperty("dueDates")
  @Valid
  private List<JobConditionQueryParameterDto> dueDates = null;

  @JsonProperty("createTimes")
  @Valid
  private List<JobConditionQueryParameterDto> createTimes = null;

  @JsonProperty("withException")
  private Boolean withException = null;

  @JsonProperty("exceptionMessage")
  private String exceptionMessage = null;

  @JsonProperty("failedActivityId")
  private String failedActivityId = null;

  @JsonProperty("noRetriesLeft")
  private Boolean noRetriesLeft = null;

  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("suspended")
  private Boolean suspended = null;

  @JsonProperty("priorityLowerThanOrEquals")
  private Long priorityLowerThanOrEquals = null;

  @JsonProperty("priorityHigherThanOrEquals")
  private Long priorityHigherThanOrEquals = null;

  @JsonProperty("tenantIdIn")
  @Valid
  private List<String> tenantIdIn = null;

  @JsonProperty("withoutTenantId")
  private Boolean withoutTenantId = null;

  @JsonProperty("includeJobsWithoutTenantId")
  private Boolean includeJobsWithoutTenantId = null;

  @JsonProperty("sorting")
  @Valid
  private List<JobQueryDtoSorting> sorting = null;

  public JobQueryDto jobId(String jobId) {
    this.jobId = jobId;
    return this;
  }

  /**
   * Filter by job id.
   * @return jobId
   **/
  @Schema(description = "Filter by job id.")
  
    public String getJobId() {
    return jobId;
  }

  public void setJobId(String jobId) {
    this.jobId = jobId;
  }

  public JobQueryDto jobIds(List<String> jobIds) {
    this.jobIds = jobIds;
    return this;
  }

  public JobQueryDto addJobIdsItem(String jobIdsItem) {
    if (this.jobIds == null) {
      this.jobIds = new ArrayList<>();
    }
    this.jobIds.add(jobIdsItem);
    return this;
  }

  /**
   * Filter by a  list of job ids.
   * @return jobIds
   **/
  @Schema(description = "Filter by a  list of job ids.")
  
    public List<String> getJobIds() {
    return jobIds;
  }

  public void setJobIds(List<String> jobIds) {
    this.jobIds = jobIds;
  }

  public JobQueryDto jobDefinitionId(String jobDefinitionId) {
    this.jobDefinitionId = jobDefinitionId;
    return this;
  }

  /**
   * Only select jobs which exist for the given job definition.
   * @return jobDefinitionId
   **/
  @Schema(description = "Only select jobs which exist for the given job definition.")
  
    public String getJobDefinitionId() {
    return jobDefinitionId;
  }

  public void setJobDefinitionId(String jobDefinitionId) {
    this.jobDefinitionId = jobDefinitionId;
  }

  public JobQueryDto processInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
    return this;
  }

  /**
   * Only select jobs which exist for the given process instance.
   * @return processInstanceId
   **/
  @Schema(description = "Only select jobs which exist for the given process instance.")
  
    public String getProcessInstanceId() {
    return processInstanceId;
  }

  public void setProcessInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
  }

  public JobQueryDto processInstanceIds(List<String> processInstanceIds) {
    this.processInstanceIds = processInstanceIds;
    return this;
  }

  public JobQueryDto addProcessInstanceIdsItem(String processInstanceIdsItem) {
    if (this.processInstanceIds == null) {
      this.processInstanceIds = new ArrayList<>();
    }
    this.processInstanceIds.add(processInstanceIdsItem);
    return this;
  }

  /**
   * Only select jobs which exist for the given  list of process instance ids.
   * @return processInstanceIds
   **/
  @Schema(description = "Only select jobs which exist for the given  list of process instance ids.")
  
    public List<String> getProcessInstanceIds() {
    return processInstanceIds;
  }

  public void setProcessInstanceIds(List<String> processInstanceIds) {
    this.processInstanceIds = processInstanceIds;
  }

  public JobQueryDto executionId(String executionId) {
    this.executionId = executionId;
    return this;
  }

  /**
   * Only select jobs which exist for the given execution.
   * @return executionId
   **/
  @Schema(description = "Only select jobs which exist for the given execution.")
  
    public String getExecutionId() {
    return executionId;
  }

  public void setExecutionId(String executionId) {
    this.executionId = executionId;
  }

  public JobQueryDto processDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
    return this;
  }

  /**
   * Filter by the id of the process definition the jobs run on.
   * @return processDefinitionId
   **/
  @Schema(description = "Filter by the id of the process definition the jobs run on.")
  
    public String getProcessDefinitionId() {
    return processDefinitionId;
  }

  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }

  public JobQueryDto processDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
    return this;
  }

  /**
   * Filter by the key of the process definition the jobs run on.
   * @return processDefinitionKey
   **/
  @Schema(description = "Filter by the key of the process definition the jobs run on.")
  
    public String getProcessDefinitionKey() {
    return processDefinitionKey;
  }

  public void setProcessDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
  }

  public JobQueryDto activityId(String activityId) {
    this.activityId = activityId;
    return this;
  }

  /**
   * Only select jobs which exist for an activity with the given id.
   * @return activityId
   **/
  @Schema(description = "Only select jobs which exist for an activity with the given id.")
  
    public String getActivityId() {
    return activityId;
  }

  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }

  public JobQueryDto withRetriesLeft(Boolean withRetriesLeft) {
    this.withRetriesLeft = withRetriesLeft;
    return this;
  }

  /**
   * Only select jobs which have retries left. Value may only be `true`, as `false` is the default behavior.
   * @return withRetriesLeft
   **/
  @Schema(description = "Only select jobs which have retries left. Value may only be `true`, as `false` is the default behavior.")
  
    public Boolean isWithRetriesLeft() {
    return withRetriesLeft;
  }

  public void setWithRetriesLeft(Boolean withRetriesLeft) {
    this.withRetriesLeft = withRetriesLeft;
  }

  public JobQueryDto executable(Boolean executable) {
    this.executable = executable;
    return this;
  }

  /**
   * Only select jobs which are executable, i.e., retries > 0 and due date is `null` or due date is in the past. Value may only be `true`, as `false` is the default behavior.
   * @return executable
   **/
  @Schema(description = "Only select jobs which are executable, i.e., retries > 0 and due date is `null` or due date is in the past. Value may only be `true`, as `false` is the default behavior.")
  
    public Boolean isExecutable() {
    return executable;
  }

  public void setExecutable(Boolean executable) {
    this.executable = executable;
  }

  public JobQueryDto timers(Boolean timers) {
    this.timers = timers;
    return this;
  }

  /**
   * Only select jobs that are timers. Cannot be used together with `messages`. Value may only be `true`, as `false` is the default behavior.
   * @return timers
   **/
  @Schema(description = "Only select jobs that are timers. Cannot be used together with `messages`. Value may only be `true`, as `false` is the default behavior.")
  
    public Boolean isTimers() {
    return timers;
  }

  public void setTimers(Boolean timers) {
    this.timers = timers;
  }

  public JobQueryDto messages(Boolean messages) {
    this.messages = messages;
    return this;
  }

  /**
   * Only select jobs that are messages. Cannot be used together with `timers`. Value may only be `true`, as `false` is the default behavior.
   * @return messages
   **/
  @Schema(description = "Only select jobs that are messages. Cannot be used together with `timers`. Value may only be `true`, as `false` is the default behavior.")
  
    public Boolean isMessages() {
    return messages;
  }

  public void setMessages(Boolean messages) {
    this.messages = messages;
  }

  public JobQueryDto dueDates(List<JobConditionQueryParameterDto> dueDates) {
    this.dueDates = dueDates;
    return this;
  }

  public JobQueryDto addDueDatesItem(JobConditionQueryParameterDto dueDatesItem) {
    if (this.dueDates == null) {
      this.dueDates = new ArrayList<>();
    }
    this.dueDates.add(dueDatesItem);
    return this;
  }

  /**
   * Only select jobs where the due date is lower or higher than the given date. 
   * @return dueDates
   **/
  @Schema(description = "Only select jobs where the due date is lower or higher than the given date. ")
      @Valid
    public List<JobConditionQueryParameterDto> getDueDates() {
    return dueDates;
  }

  public void setDueDates(List<JobConditionQueryParameterDto> dueDates) {
    this.dueDates = dueDates;
  }

  public JobQueryDto createTimes(List<JobConditionQueryParameterDto> createTimes) {
    this.createTimes = createTimes;
    return this;
  }

  public JobQueryDto addCreateTimesItem(JobConditionQueryParameterDto createTimesItem) {
    if (this.createTimes == null) {
      this.createTimes = new ArrayList<>();
    }
    this.createTimes.add(createTimesItem);
    return this;
  }

  /**
   * Only select jobs created before or after the given date. 
   * @return createTimes
   **/
  @Schema(description = "Only select jobs created before or after the given date. ")
      @Valid
    public List<JobConditionQueryParameterDto> getCreateTimes() {
    return createTimes;
  }

  public void setCreateTimes(List<JobConditionQueryParameterDto> createTimes) {
    this.createTimes = createTimes;
  }

  public JobQueryDto withException(Boolean withException) {
    this.withException = withException;
    return this;
  }

  /**
   * Only select jobs that failed due to an exception. Value may only be `true`, as `false` is the default behavior.
   * @return withException
   **/
  @Schema(description = "Only select jobs that failed due to an exception. Value may only be `true`, as `false` is the default behavior.")
  
    public Boolean isWithException() {
    return withException;
  }

  public void setWithException(Boolean withException) {
    this.withException = withException;
  }

  public JobQueryDto exceptionMessage(String exceptionMessage) {
    this.exceptionMessage = exceptionMessage;
    return this;
  }

  /**
   * Only select jobs that failed due to an exception with the given message.
   * @return exceptionMessage
   **/
  @Schema(description = "Only select jobs that failed due to an exception with the given message.")
  
    public String getExceptionMessage() {
    return exceptionMessage;
  }

  public void setExceptionMessage(String exceptionMessage) {
    this.exceptionMessage = exceptionMessage;
  }

  public JobQueryDto failedActivityId(String failedActivityId) {
    this.failedActivityId = failedActivityId;
    return this;
  }

  /**
   * Only select jobs that failed due to an exception at an activity with the given id.
   * @return failedActivityId
   **/
  @Schema(description = "Only select jobs that failed due to an exception at an activity with the given id.")
  
    public String getFailedActivityId() {
    return failedActivityId;
  }

  public void setFailedActivityId(String failedActivityId) {
    this.failedActivityId = failedActivityId;
  }

  public JobQueryDto noRetriesLeft(Boolean noRetriesLeft) {
    this.noRetriesLeft = noRetriesLeft;
    return this;
  }

  /**
   * Only select jobs which have no retries left. Value may only be `true`, as `false` is the default behavior.
   * @return noRetriesLeft
   **/
  @Schema(description = "Only select jobs which have no retries left. Value may only be `true`, as `false` is the default behavior.")
  
    public Boolean isNoRetriesLeft() {
    return noRetriesLeft;
  }

  public void setNoRetriesLeft(Boolean noRetriesLeft) {
    this.noRetriesLeft = noRetriesLeft;
  }

  public JobQueryDto active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Only include active jobs. Value may only be `true`, as `false` is the default behavior.
   * @return active
   **/
  @Schema(description = "Only include active jobs. Value may only be `true`, as `false` is the default behavior.")
  
    public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public JobQueryDto suspended(Boolean suspended) {
    this.suspended = suspended;
    return this;
  }

  /**
   * Only include suspended jobs. Value may only be `true`, as `false` is the default behavior.
   * @return suspended
   **/
  @Schema(description = "Only include suspended jobs. Value may only be `true`, as `false` is the default behavior.")
  
    public Boolean isSuspended() {
    return suspended;
  }

  public void setSuspended(Boolean suspended) {
    this.suspended = suspended;
  }

  public JobQueryDto priorityLowerThanOrEquals(Long priorityLowerThanOrEquals) {
    this.priorityLowerThanOrEquals = priorityLowerThanOrEquals;
    return this;
  }

  /**
   * Only include jobs with a priority lower than or equal to the given value. Value must be a valid `long` value.
   * @return priorityLowerThanOrEquals
   **/
  @Schema(description = "Only include jobs with a priority lower than or equal to the given value. Value must be a valid `long` value.")
  
    public Long getPriorityLowerThanOrEquals() {
    return priorityLowerThanOrEquals;
  }

  public void setPriorityLowerThanOrEquals(Long priorityLowerThanOrEquals) {
    this.priorityLowerThanOrEquals = priorityLowerThanOrEquals;
  }

  public JobQueryDto priorityHigherThanOrEquals(Long priorityHigherThanOrEquals) {
    this.priorityHigherThanOrEquals = priorityHigherThanOrEquals;
    return this;
  }

  /**
   * Only include jobs with a priority higher than or equal to the given value. Value must be a valid `long` value.
   * @return priorityHigherThanOrEquals
   **/
  @Schema(description = "Only include jobs with a priority higher than or equal to the given value. Value must be a valid `long` value.")
  
    public Long getPriorityHigherThanOrEquals() {
    return priorityHigherThanOrEquals;
  }

  public void setPriorityHigherThanOrEquals(Long priorityHigherThanOrEquals) {
    this.priorityHigherThanOrEquals = priorityHigherThanOrEquals;
  }

  public JobQueryDto tenantIdIn(List<String> tenantIdIn) {
    this.tenantIdIn = tenantIdIn;
    return this;
  }

  public JobQueryDto addTenantIdInItem(String tenantIdInItem) {
    if (this.tenantIdIn == null) {
      this.tenantIdIn = new ArrayList<>();
    }
    this.tenantIdIn.add(tenantIdInItem);
    return this;
  }

  /**
   * Only include jobs which belong to one of the passed  tenant ids.
   * @return tenantIdIn
   **/
  @Schema(description = "Only include jobs which belong to one of the passed  tenant ids.")
  
    public List<String> getTenantIdIn() {
    return tenantIdIn;
  }

  public void setTenantIdIn(List<String> tenantIdIn) {
    this.tenantIdIn = tenantIdIn;
  }

  public JobQueryDto withoutTenantId(Boolean withoutTenantId) {
    this.withoutTenantId = withoutTenantId;
    return this;
  }

  /**
   * Only include jobs which belong to no tenant. Value may only be `true`, as `false` is the default behavior.
   * @return withoutTenantId
   **/
  @Schema(description = "Only include jobs which belong to no tenant. Value may only be `true`, as `false` is the default behavior.")
  
    public Boolean isWithoutTenantId() {
    return withoutTenantId;
  }

  public void setWithoutTenantId(Boolean withoutTenantId) {
    this.withoutTenantId = withoutTenantId;
  }

  public JobQueryDto includeJobsWithoutTenantId(Boolean includeJobsWithoutTenantId) {
    this.includeJobsWithoutTenantId = includeJobsWithoutTenantId;
    return this;
  }

  /**
   * Include jobs which belong to no tenant. Can be used in combination with `tenantIdIn`. Value may only be `true`, as `false` is the default behavior.
   * @return includeJobsWithoutTenantId
   **/
  @Schema(description = "Include jobs which belong to no tenant. Can be used in combination with `tenantIdIn`. Value may only be `true`, as `false` is the default behavior.")
  
    public Boolean isIncludeJobsWithoutTenantId() {
    return includeJobsWithoutTenantId;
  }

  public void setIncludeJobsWithoutTenantId(Boolean includeJobsWithoutTenantId) {
    this.includeJobsWithoutTenantId = includeJobsWithoutTenantId;
  }

  public JobQueryDto sorting(List<JobQueryDtoSorting> sorting) {
    this.sorting = sorting;
    return this;
  }

  public JobQueryDto addSortingItem(JobQueryDtoSorting sortingItem) {
    if (this.sorting == null) {
      this.sorting = new ArrayList<>();
    }
    this.sorting.add(sortingItem);
    return this;
  }

  /**
   * An array of criteria to sort the result by. Each element of the array is                        an object that specifies one ordering. The position in the array                        identifies the rank of an ordering, i.e., whether it is primary, secondary,                        etc. Does not have an effect for the `count` endpoint.
   * @return sorting
   **/
  @Schema(description = "An array of criteria to sort the result by. Each element of the array is                        an object that specifies one ordering. The position in the array                        identifies the rank of an ordering, i.e., whether it is primary, secondary,                        etc. Does not have an effect for the `count` endpoint.")
      @Valid
    public List<JobQueryDtoSorting> getSorting() {
    return sorting;
  }

  public void setSorting(List<JobQueryDtoSorting> sorting) {
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
    JobQueryDto jobQueryDto = (JobQueryDto) o;
    return Objects.equals(this.jobId, jobQueryDto.jobId) &&
        Objects.equals(this.jobIds, jobQueryDto.jobIds) &&
        Objects.equals(this.jobDefinitionId, jobQueryDto.jobDefinitionId) &&
        Objects.equals(this.processInstanceId, jobQueryDto.processInstanceId) &&
        Objects.equals(this.processInstanceIds, jobQueryDto.processInstanceIds) &&
        Objects.equals(this.executionId, jobQueryDto.executionId) &&
        Objects.equals(this.processDefinitionId, jobQueryDto.processDefinitionId) &&
        Objects.equals(this.processDefinitionKey, jobQueryDto.processDefinitionKey) &&
        Objects.equals(this.activityId, jobQueryDto.activityId) &&
        Objects.equals(this.withRetriesLeft, jobQueryDto.withRetriesLeft) &&
        Objects.equals(this.executable, jobQueryDto.executable) &&
        Objects.equals(this.timers, jobQueryDto.timers) &&
        Objects.equals(this.messages, jobQueryDto.messages) &&
        Objects.equals(this.dueDates, jobQueryDto.dueDates) &&
        Objects.equals(this.createTimes, jobQueryDto.createTimes) &&
        Objects.equals(this.withException, jobQueryDto.withException) &&
        Objects.equals(this.exceptionMessage, jobQueryDto.exceptionMessage) &&
        Objects.equals(this.failedActivityId, jobQueryDto.failedActivityId) &&
        Objects.equals(this.noRetriesLeft, jobQueryDto.noRetriesLeft) &&
        Objects.equals(this.active, jobQueryDto.active) &&
        Objects.equals(this.suspended, jobQueryDto.suspended) &&
        Objects.equals(this.priorityLowerThanOrEquals, jobQueryDto.priorityLowerThanOrEquals) &&
        Objects.equals(this.priorityHigherThanOrEquals, jobQueryDto.priorityHigherThanOrEquals) &&
        Objects.equals(this.tenantIdIn, jobQueryDto.tenantIdIn) &&
        Objects.equals(this.withoutTenantId, jobQueryDto.withoutTenantId) &&
        Objects.equals(this.includeJobsWithoutTenantId, jobQueryDto.includeJobsWithoutTenantId) &&
        Objects.equals(this.sorting, jobQueryDto.sorting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId, jobIds, jobDefinitionId, processInstanceId, processInstanceIds, executionId, processDefinitionId, processDefinitionKey, activityId, withRetriesLeft, executable, timers, messages, dueDates, createTimes, withException, exceptionMessage, failedActivityId, noRetriesLeft, active, suspended, priorityLowerThanOrEquals, priorityHigherThanOrEquals, tenantIdIn, withoutTenantId, includeJobsWithoutTenantId, sorting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobQueryDto {\n");
    
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    jobIds: ").append(toIndentedString(jobIds)).append("\n");
    sb.append("    jobDefinitionId: ").append(toIndentedString(jobDefinitionId)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    processInstanceIds: ").append(toIndentedString(processInstanceIds)).append("\n");
    sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    withRetriesLeft: ").append(toIndentedString(withRetriesLeft)).append("\n");
    sb.append("    executable: ").append(toIndentedString(executable)).append("\n");
    sb.append("    timers: ").append(toIndentedString(timers)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    dueDates: ").append(toIndentedString(dueDates)).append("\n");
    sb.append("    createTimes: ").append(toIndentedString(createTimes)).append("\n");
    sb.append("    withException: ").append(toIndentedString(withException)).append("\n");
    sb.append("    exceptionMessage: ").append(toIndentedString(exceptionMessage)).append("\n");
    sb.append("    failedActivityId: ").append(toIndentedString(failedActivityId)).append("\n");
    sb.append("    noRetriesLeft: ").append(toIndentedString(noRetriesLeft)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
    sb.append("    priorityLowerThanOrEquals: ").append(toIndentedString(priorityLowerThanOrEquals)).append("\n");
    sb.append("    priorityHigherThanOrEquals: ").append(toIndentedString(priorityHigherThanOrEquals)).append("\n");
    sb.append("    tenantIdIn: ").append(toIndentedString(tenantIdIn)).append("\n");
    sb.append("    withoutTenantId: ").append(toIndentedString(withoutTenantId)).append("\n");
    sb.append("    includeJobsWithoutTenantId: ").append(toIndentedString(includeJobsWithoutTenantId)).append("\n");
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
