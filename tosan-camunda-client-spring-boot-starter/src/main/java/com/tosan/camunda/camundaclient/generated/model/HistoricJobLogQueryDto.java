package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tosan.camunda.camundaclient.generated.model.HistoricJobLogQueryDtoSortingInner;
import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * A Historic Job Log instance query which defines a list of Historic Job Log instances
 */

@Schema(name = "HistoricJobLogQueryDto", description = "A Historic Job Log instance query which defines a list of Historic Job Log instances")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class HistoricJobLogQueryDto {

  private String logId = null;

  private String jobId = null;

  private String jobExceptionMessage = null;

  private String jobDefinitionId = null;

  private String jobDefinitionType = null;

  private String jobDefinitionConfiguration = null;

  @Valid
  private List<String> activityIdIn;

  @Valid
  private List<String> failedActivityIdIn;

  @Valid
  private List<String> executionIdIn;

  private String processInstanceId = null;

  private String processDefinitionId = null;

  private String processDefinitionKey = null;

  private String deploymentId = null;

  @Valid
  private List<String> tenantIdIn;

  private Boolean withoutTenantId = null;

  private String hostname = null;

  private Long jobPriorityLowerThanOrEquals = null;

  private Long jobPriorityHigherThanOrEquals = null;

  private Boolean creationLog = null;

  private Boolean failureLog = null;

  private Boolean successLog = null;

  private Boolean deletionLog = null;

  @Valid
  private List<@Valid HistoricJobLogQueryDtoSortingInner> sorting;

  public HistoricJobLogQueryDto logId(String logId) {
    this.logId = logId;
    return this;
  }

  /**
   * Filter by historic job log id.
   * @return logId
  */
  
  @Schema(name = "logId", description = "Filter by historic job log id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("logId")
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
  */
  
  @Schema(name = "jobId", description = "Filter by job id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jobId")
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
  */
  
  @Schema(name = "jobExceptionMessage", description = "Filter by job exception message.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jobExceptionMessage")
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
  */
  
  @Schema(name = "jobDefinitionId", description = "Filter by job definition id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jobDefinitionId")
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
  */
  
  @Schema(name = "jobDefinitionType", description = "Filter by job definition type. See the [User Guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/the-job-executor/#job-creation) for more information about job definition types.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jobDefinitionType")
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
  */
  
  @Schema(name = "jobDefinitionConfiguration", description = "Filter by job definition configuration.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jobDefinitionConfiguration")
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
  */
  
  @Schema(name = "activityIdIn", description = "Only include historic job logs which belong to one of the passed activity ids.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activityIdIn")
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
  */
  
  @Schema(name = "failedActivityIdIn", description = "Only include historic job logs which belong to failures of one of the passed activity ids.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("failedActivityIdIn")
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
  */
  
  @Schema(name = "executionIdIn", description = "Only include historic job logs which belong to one of the passed execution ids.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("executionIdIn")
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
  */
  
  @Schema(name = "processInstanceId", description = "Filter by process instance id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processInstanceId")
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
  */
  
  @Schema(name = "processDefinitionId", description = "Filter by process definition id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionId")
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
  */
  
  @Schema(name = "processDefinitionKey", description = "Filter by process definition key.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionKey")
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
  */
  
  @Schema(name = "deploymentId", description = "Filter by deployment id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deploymentId")
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
  */
  
  @Schema(name = "tenantIdIn", description = "Only include historic job log entries which belong to one of the passed and comma- separated tenant ids.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tenantIdIn")
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
  */
  
  @Schema(name = "withoutTenantId", description = "Only include historic job log entries that belong to no tenant. Value may only be `true`, as `false` is the default behavior.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("withoutTenantId")
  public Boolean getWithoutTenantId() {
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
  */
  
  @Schema(name = "hostname", description = "Filter by hostname.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hostname")
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
  */
  
  @Schema(name = "jobPriorityLowerThanOrEquals", description = "Only include logs for which the associated job had a priority lower than or equal to the given value. Value must be a valid `long` value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jobPriorityLowerThanOrEquals")
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
  */
  
  @Schema(name = "jobPriorityHigherThanOrEquals", description = "Only include logs for which the associated job had a priority higher than or equal to the given value. Value must be a valid `long` value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jobPriorityHigherThanOrEquals")
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
  */
  
  @Schema(name = "creationLog", description = "Only include creation logs. Value may only be `true`, as `false` is the default behavior.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creationLog")
  public Boolean getCreationLog() {
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
  */
  
  @Schema(name = "failureLog", description = "Only include failure logs. Value may only be `true`, as `false` is the default behavior.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("failureLog")
  public Boolean getFailureLog() {
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
  */
  
  @Schema(name = "successLog", description = "Only include success logs. Value may only be `true`, as `false` is the default behavior.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("successLog")
  public Boolean getSuccessLog() {
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
  */
  
  @Schema(name = "deletionLog", description = "Only include deletion logs. Value may only be `true`, as `false` is the default behavior.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deletionLog")
  public Boolean getDeletionLog() {
    return deletionLog;
  }

  public void setDeletionLog(Boolean deletionLog) {
    this.deletionLog = deletionLog;
  }

  public HistoricJobLogQueryDto sorting(List<@Valid HistoricJobLogQueryDtoSortingInner> sorting) {
    this.sorting = sorting;
    return this;
  }

  public HistoricJobLogQueryDto addSortingItem(HistoricJobLogQueryDtoSortingInner sortingItem) {
    if (this.sorting == null) {
      this.sorting = new ArrayList<>();
    }
    this.sorting.add(sortingItem);
    return this;
  }

  /**
   * An array of criteria to sort the result by. Each element of the array is                        an object that specifies one ordering. The position in the array                        identifies the rank of an ordering, i.e., whether it is primary, secondary,                        etc. Sorting has no effect for `count` endpoints
   * @return sorting
  */
  @Valid 
  @Schema(name = "sorting", description = "An array of criteria to sort the result by. Each element of the array is                        an object that specifies one ordering. The position in the array                        identifies the rank of an ordering, i.e., whether it is primary, secondary,                        etc. Sorting has no effect for `count` endpoints", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sorting")
  public List<@Valid HistoricJobLogQueryDtoSortingInner> getSorting() {
    return sorting;
  }

  public void setSorting(List<@Valid HistoricJobLogQueryDtoSortingInner> sorting) {
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

