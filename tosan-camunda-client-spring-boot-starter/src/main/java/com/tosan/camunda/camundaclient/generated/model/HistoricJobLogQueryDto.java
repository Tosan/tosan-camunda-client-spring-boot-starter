package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;

/**
 * A Historic Job Log instance query which defines a list of Historic Job Log instances
 */
@Schema(description = "A Historic Job Log instance query which defines a list of Historic Job Log instances")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class HistoricJobLogQueryDto   {
  @JsonProperty("logId")
  private String logId = null;

  @JsonProperty("jobId")
  private String jobId = null;

  @JsonProperty("jobExceptionMessage")
  private String jobExceptionMessage = null;

  @JsonProperty("jobDefinitionId")
  private String jobDefinitionId = null;

  @JsonProperty("jobDefinitionType")
  private String jobDefinitionType = null;

  @JsonProperty("jobDefinitionConfiguration")
  private String jobDefinitionConfiguration = null;

  @JsonProperty("activityIdIn")
  @Valid
  private List<String> activityIdIn = null;

  @JsonProperty("failedActivityIdIn")
  @Valid
  private List<String> failedActivityIdIn = null;

  @JsonProperty("executionIdIn")
  @Valid
  private List<String> executionIdIn = null;

  @JsonProperty("processInstanceId")
  private String processInstanceId = null;

  @JsonProperty("processDefinitionId")
  private String processDefinitionId = null;

  @JsonProperty("processDefinitionKey")
  private String processDefinitionKey = null;

  @JsonProperty("deploymentId")
  private String deploymentId = null;

  @JsonProperty("tenantIdIn")
  @Valid
  private List<String> tenantIdIn = null;

  @JsonProperty("withoutTenantId")
  private Boolean withoutTenantId = null;

  @JsonProperty("hostname")
  private String hostname = null;

  @JsonProperty("jobPriorityLowerThanOrEquals")
  private Long jobPriorityLowerThanOrEquals = null;

  @JsonProperty("jobPriorityHigherThanOrEquals")
  private Long jobPriorityHigherThanOrEquals = null;

  @JsonProperty("creationLog")
  private Boolean creationLog = null;

  @JsonProperty("failureLog")
  private Boolean failureLog = null;

  @JsonProperty("successLog")
  private Boolean successLog = null;

  @JsonProperty("deletionLog")
  private Boolean deletionLog = null;

  @JsonProperty("sorting")
  @Valid
  private List<HistoricJobLogQueryDtoSorting> sorting = null;

  public HistoricJobLogQueryDto logId(String logId) {
    this.logId = logId;
    return this;
  }

  /**
   * Filter by historic job log id.
   * @return logId
   **/
  @Schema(description = "Filter by historic job log id.")
  
    public String getLogId() {
    return logId;
  }

  public void setLogId(String logId) {
    this.logId = logId;
  }

  public HistoricJobLogQueryDto jobId(String jobId) {
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

  public HistoricJobLogQueryDto jobExceptionMessage(String jobExceptionMessage) {
    this.jobExceptionMessage = jobExceptionMessage;
    return this;
  }

  /**
   * Filter by job exception message.
   * @return jobExceptionMessage
   **/
  @Schema(description = "Filter by job exception message.")
  
    public String getJobExceptionMessage() {
    return jobExceptionMessage;
  }

  public void setJobExceptionMessage(String jobExceptionMessage) {
    this.jobExceptionMessage = jobExceptionMessage;
  }

  public HistoricJobLogQueryDto jobDefinitionId(String jobDefinitionId) {
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

  public HistoricJobLogQueryDto jobDefinitionType(String jobDefinitionType) {
    this.jobDefinitionType = jobDefinitionType;
    return this;
  }

  /**
   * Filter by job definition type. See the [User Guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/the-job-executor/#job-creation) for more information about job definition types.
   * @return jobDefinitionType
   **/
  @Schema(description = "Filter by job definition type. See the [User Guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/the-job-executor/#job-creation) for more information about job definition types.")
  
    public String getJobDefinitionType() {
    return jobDefinitionType;
  }

  public void setJobDefinitionType(String jobDefinitionType) {
    this.jobDefinitionType = jobDefinitionType;
  }

  public HistoricJobLogQueryDto jobDefinitionConfiguration(String jobDefinitionConfiguration) {
    this.jobDefinitionConfiguration = jobDefinitionConfiguration;
    return this;
  }

  /**
   * Filter by job definition configuration.
   * @return jobDefinitionConfiguration
   **/
  @Schema(description = "Filter by job definition configuration.")
  
    public String getJobDefinitionConfiguration() {
    return jobDefinitionConfiguration;
  }

  public void setJobDefinitionConfiguration(String jobDefinitionConfiguration) {
    this.jobDefinitionConfiguration = jobDefinitionConfiguration;
  }

  public HistoricJobLogQueryDto activityIdIn(List<String> activityIdIn) {
    this.activityIdIn = activityIdIn;
    return this;
  }

  public HistoricJobLogQueryDto addActivityIdInItem(String activityIdInItem) {
    if (this.activityIdIn == null) {
      this.activityIdIn = new ArrayList<>();
    }
    this.activityIdIn.add(activityIdInItem);
    return this;
  }

  /**
   * Only include historic job logs which belong to one of the passed activity ids.
   * @return activityIdIn
   **/
  @Schema(description = "Only include historic job logs which belong to one of the passed activity ids.")
  
    public List<String> getActivityIdIn() {
    return activityIdIn;
  }

  public void setActivityIdIn(List<String> activityIdIn) {
    this.activityIdIn = activityIdIn;
  }

  public HistoricJobLogQueryDto failedActivityIdIn(List<String> failedActivityIdIn) {
    this.failedActivityIdIn = failedActivityIdIn;
    return this;
  }

  public HistoricJobLogQueryDto addFailedActivityIdInItem(String failedActivityIdInItem) {
    if (this.failedActivityIdIn == null) {
      this.failedActivityIdIn = new ArrayList<>();
    }
    this.failedActivityIdIn.add(failedActivityIdInItem);
    return this;
  }

  /**
   * Only include historic job logs which belong to failures of one of the passed activity ids.
   * @return failedActivityIdIn
   **/
  @Schema(description = "Only include historic job logs which belong to failures of one of the passed activity ids.")
  
    public List<String> getFailedActivityIdIn() {
    return failedActivityIdIn;
  }

  public void setFailedActivityIdIn(List<String> failedActivityIdIn) {
    this.failedActivityIdIn = failedActivityIdIn;
  }

  public HistoricJobLogQueryDto executionIdIn(List<String> executionIdIn) {
    this.executionIdIn = executionIdIn;
    return this;
  }

  public HistoricJobLogQueryDto addExecutionIdInItem(String executionIdInItem) {
    if (this.executionIdIn == null) {
      this.executionIdIn = new ArrayList<>();
    }
    this.executionIdIn.add(executionIdInItem);
    return this;
  }

  /**
   * Only include historic job logs which belong to one of the passed execution ids.
   * @return executionIdIn
   **/
  @Schema(description = "Only include historic job logs which belong to one of the passed execution ids.")
  
    public List<String> getExecutionIdIn() {
    return executionIdIn;
  }

  public void setExecutionIdIn(List<String> executionIdIn) {
    this.executionIdIn = executionIdIn;
  }

  public HistoricJobLogQueryDto processInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
    return this;
  }

  /**
   * Filter by process instance id.
   * @return processInstanceId
   **/
  @Schema(description = "Filter by process instance id.")
  
    public String getProcessInstanceId() {
    return processInstanceId;
  }

  public void setProcessInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
  }

  public HistoricJobLogQueryDto processDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
    return this;
  }

  /**
   * Filter by process definition id.
   * @return processDefinitionId
   **/
  @Schema(description = "Filter by process definition id.")
  
    public String getProcessDefinitionId() {
    return processDefinitionId;
  }

  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }

  public HistoricJobLogQueryDto processDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
    return this;
  }

  /**
   * Filter by process definition key.
   * @return processDefinitionKey
   **/
  @Schema(description = "Filter by process definition key.")
  
    public String getProcessDefinitionKey() {
    return processDefinitionKey;
  }

  public void setProcessDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
  }

  public HistoricJobLogQueryDto deploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
    return this;
  }

  /**
   * Filter by deployment id.
   * @return deploymentId
   **/
  @Schema(description = "Filter by deployment id.")
  
    public String getDeploymentId() {
    return deploymentId;
  }

  public void setDeploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
  }

  public HistoricJobLogQueryDto tenantIdIn(List<String> tenantIdIn) {
    this.tenantIdIn = tenantIdIn;
    return this;
  }

  public HistoricJobLogQueryDto addTenantIdInItem(String tenantIdInItem) {
    if (this.tenantIdIn == null) {
      this.tenantIdIn = new ArrayList<>();
    }
    this.tenantIdIn.add(tenantIdInItem);
    return this;
  }

  /**
   * Only include historic job log entries which belong to one of the passed and comma- separated tenant ids.
   * @return tenantIdIn
   **/
  @Schema(description = "Only include historic job log entries which belong to one of the passed and comma- separated tenant ids.")
  
    public List<String> getTenantIdIn() {
    return tenantIdIn;
  }

  public void setTenantIdIn(List<String> tenantIdIn) {
    this.tenantIdIn = tenantIdIn;
  }

  public HistoricJobLogQueryDto withoutTenantId(Boolean withoutTenantId) {
    this.withoutTenantId = withoutTenantId;
    return this;
  }

  /**
   * Only include historic job log entries that belong to no tenant. Value may only be `true`, as `false` is the default behavior.
   * @return withoutTenantId
   **/
  @Schema(description = "Only include historic job log entries that belong to no tenant. Value may only be `true`, as `false` is the default behavior.")
  
    public Boolean isWithoutTenantId() {
    return withoutTenantId;
  }

  public void setWithoutTenantId(Boolean withoutTenantId) {
    this.withoutTenantId = withoutTenantId;
  }

  public HistoricJobLogQueryDto hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

  /**
   * Filter by hostname.
   * @return hostname
   **/
  @Schema(description = "Filter by hostname.")
  
    public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public HistoricJobLogQueryDto jobPriorityLowerThanOrEquals(Long jobPriorityLowerThanOrEquals) {
    this.jobPriorityLowerThanOrEquals = jobPriorityLowerThanOrEquals;
    return this;
  }

  /**
   * Only include logs for which the associated job had a priority lower than or equal to the given value. Value must be a valid `long` value.
   * @return jobPriorityLowerThanOrEquals
   **/
  @Schema(description = "Only include logs for which the associated job had a priority lower than or equal to the given value. Value must be a valid `long` value.")
  
    public Long getJobPriorityLowerThanOrEquals() {
    return jobPriorityLowerThanOrEquals;
  }

  public void setJobPriorityLowerThanOrEquals(Long jobPriorityLowerThanOrEquals) {
    this.jobPriorityLowerThanOrEquals = jobPriorityLowerThanOrEquals;
  }

  public HistoricJobLogQueryDto jobPriorityHigherThanOrEquals(Long jobPriorityHigherThanOrEquals) {
    this.jobPriorityHigherThanOrEquals = jobPriorityHigherThanOrEquals;
    return this;
  }

  /**
   * Only include logs for which the associated job had a priority higher than or equal to the given value. Value must be a valid `long` value.
   * @return jobPriorityHigherThanOrEquals
   **/
  @Schema(description = "Only include logs for which the associated job had a priority higher than or equal to the given value. Value must be a valid `long` value.")
  
    public Long getJobPriorityHigherThanOrEquals() {
    return jobPriorityHigherThanOrEquals;
  }

  public void setJobPriorityHigherThanOrEquals(Long jobPriorityHigherThanOrEquals) {
    this.jobPriorityHigherThanOrEquals = jobPriorityHigherThanOrEquals;
  }

  public HistoricJobLogQueryDto creationLog(Boolean creationLog) {
    this.creationLog = creationLog;
    return this;
  }

  /**
   * Only include creation logs. Value may only be `true`, as `false` is the default behavior.
   * @return creationLog
   **/
  @Schema(description = "Only include creation logs. Value may only be `true`, as `false` is the default behavior.")
  
    public Boolean isCreationLog() {
    return creationLog;
  }

  public void setCreationLog(Boolean creationLog) {
    this.creationLog = creationLog;
  }

  public HistoricJobLogQueryDto failureLog(Boolean failureLog) {
    this.failureLog = failureLog;
    return this;
  }

  /**
   * Only include failure logs. Value may only be `true`, as `false` is the default behavior.
   * @return failureLog
   **/
  @Schema(description = "Only include failure logs. Value may only be `true`, as `false` is the default behavior.")
  
    public Boolean isFailureLog() {
    return failureLog;
  }

  public void setFailureLog(Boolean failureLog) {
    this.failureLog = failureLog;
  }

  public HistoricJobLogQueryDto successLog(Boolean successLog) {
    this.successLog = successLog;
    return this;
  }

  /**
   * Only include success logs. Value may only be `true`, as `false` is the default behavior.
   * @return successLog
   **/
  @Schema(description = "Only include success logs. Value may only be `true`, as `false` is the default behavior.")
  
    public Boolean isSuccessLog() {
    return successLog;
  }

  public void setSuccessLog(Boolean successLog) {
    this.successLog = successLog;
  }

  public HistoricJobLogQueryDto deletionLog(Boolean deletionLog) {
    this.deletionLog = deletionLog;
    return this;
  }

  /**
   * Only include deletion logs. Value may only be `true`, as `false` is the default behavior.
   * @return deletionLog
   **/
  @Schema(description = "Only include deletion logs. Value may only be `true`, as `false` is the default behavior.")
  
    public Boolean isDeletionLog() {
    return deletionLog;
  }

  public void setDeletionLog(Boolean deletionLog) {
    this.deletionLog = deletionLog;
  }

  public HistoricJobLogQueryDto sorting(List<HistoricJobLogQueryDtoSorting> sorting) {
    this.sorting = sorting;
    return this;
  }

  public HistoricJobLogQueryDto addSortingItem(HistoricJobLogQueryDtoSorting sortingItem) {
    if (this.sorting == null) {
      this.sorting = new ArrayList<>();
    }
    this.sorting.add(sortingItem);
    return this;
  }

  /**
   * An array of criteria to sort the result by. Each element of the array is                        an object that specifies one ordering. The position in the array                        identifies the rank of an ordering, i.e., whether it is primary, secondary,                        etc. Sorting has no effect for `count` endpoints
   * @return sorting
   **/
  @Schema(description = "An array of criteria to sort the result by. Each element of the array is                        an object that specifies one ordering. The position in the array                        identifies the rank of an ordering, i.e., whether it is primary, secondary,                        etc. Sorting has no effect for `count` endpoints")
      @Valid
    public List<HistoricJobLogQueryDtoSorting> getSorting() {
    return sorting;
  }

  public void setSorting(List<HistoricJobLogQueryDtoSorting> sorting) {
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
    HistoricJobLogQueryDto historicJobLogQueryDto = (HistoricJobLogQueryDto) o;
    return Objects.equals(this.logId, historicJobLogQueryDto.logId) &&
        Objects.equals(this.jobId, historicJobLogQueryDto.jobId) &&
        Objects.equals(this.jobExceptionMessage, historicJobLogQueryDto.jobExceptionMessage) &&
        Objects.equals(this.jobDefinitionId, historicJobLogQueryDto.jobDefinitionId) &&
        Objects.equals(this.jobDefinitionType, historicJobLogQueryDto.jobDefinitionType) &&
        Objects.equals(this.jobDefinitionConfiguration, historicJobLogQueryDto.jobDefinitionConfiguration) &&
        Objects.equals(this.activityIdIn, historicJobLogQueryDto.activityIdIn) &&
        Objects.equals(this.failedActivityIdIn, historicJobLogQueryDto.failedActivityIdIn) &&
        Objects.equals(this.executionIdIn, historicJobLogQueryDto.executionIdIn) &&
        Objects.equals(this.processInstanceId, historicJobLogQueryDto.processInstanceId) &&
        Objects.equals(this.processDefinitionId, historicJobLogQueryDto.processDefinitionId) &&
        Objects.equals(this.processDefinitionKey, historicJobLogQueryDto.processDefinitionKey) &&
        Objects.equals(this.deploymentId, historicJobLogQueryDto.deploymentId) &&
        Objects.equals(this.tenantIdIn, historicJobLogQueryDto.tenantIdIn) &&
        Objects.equals(this.withoutTenantId, historicJobLogQueryDto.withoutTenantId) &&
        Objects.equals(this.hostname, historicJobLogQueryDto.hostname) &&
        Objects.equals(this.jobPriorityLowerThanOrEquals, historicJobLogQueryDto.jobPriorityLowerThanOrEquals) &&
        Objects.equals(this.jobPriorityHigherThanOrEquals, historicJobLogQueryDto.jobPriorityHigherThanOrEquals) &&
        Objects.equals(this.creationLog, historicJobLogQueryDto.creationLog) &&
        Objects.equals(this.failureLog, historicJobLogQueryDto.failureLog) &&
        Objects.equals(this.successLog, historicJobLogQueryDto.successLog) &&
        Objects.equals(this.deletionLog, historicJobLogQueryDto.deletionLog) &&
        Objects.equals(this.sorting, historicJobLogQueryDto.sorting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logId, jobId, jobExceptionMessage, jobDefinitionId, jobDefinitionType, jobDefinitionConfiguration, activityIdIn, failedActivityIdIn, executionIdIn, processInstanceId, processDefinitionId, processDefinitionKey, deploymentId, tenantIdIn, withoutTenantId, hostname, jobPriorityLowerThanOrEquals, jobPriorityHigherThanOrEquals, creationLog, failureLog, successLog, deletionLog, sorting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricJobLogQueryDto {\n");
    
    sb.append("    logId: ").append(toIndentedString(logId)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    jobExceptionMessage: ").append(toIndentedString(jobExceptionMessage)).append("\n");
    sb.append("    jobDefinitionId: ").append(toIndentedString(jobDefinitionId)).append("\n");
    sb.append("    jobDefinitionType: ").append(toIndentedString(jobDefinitionType)).append("\n");
    sb.append("    jobDefinitionConfiguration: ").append(toIndentedString(jobDefinitionConfiguration)).append("\n");
    sb.append("    activityIdIn: ").append(toIndentedString(activityIdIn)).append("\n");
    sb.append("    failedActivityIdIn: ").append(toIndentedString(failedActivityIdIn)).append("\n");
    sb.append("    executionIdIn: ").append(toIndentedString(executionIdIn)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
    sb.append("    tenantIdIn: ").append(toIndentedString(tenantIdIn)).append("\n");
    sb.append("    withoutTenantId: ").append(toIndentedString(withoutTenantId)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    jobPriorityLowerThanOrEquals: ").append(toIndentedString(jobPriorityLowerThanOrEquals)).append("\n");
    sb.append("    jobPriorityHigherThanOrEquals: ").append(toIndentedString(jobPriorityHigherThanOrEquals)).append("\n");
    sb.append("    creationLog: ").append(toIndentedString(creationLog)).append("\n");
    sb.append("    failureLog: ").append(toIndentedString(failureLog)).append("\n");
    sb.append("    successLog: ").append(toIndentedString(successLog)).append("\n");
    sb.append("    deletionLog: ").append(toIndentedString(deletionLog)).append("\n");
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
