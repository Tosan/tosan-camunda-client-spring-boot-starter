package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tosan.camunda.camundaclient.generated.model.ExternalTaskQueryDtoSortingInner;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * A JSON object with the following properties:
 */

@Schema(name = "ExternalTaskQueryDto", description = "A JSON object with the following properties:")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class ExternalTaskQueryDto {

  private String externalTaskId = null;

  @Valid
  private List<String> externalTaskIdIn;

  private String topicName = null;

  private String workerId = null;

  private Boolean locked = null;

  private Boolean notLocked = null;

  private Boolean withRetriesLeft = null;

  private Boolean noRetriesLeft = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lockExpirationAfter = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lockExpirationBefore = null;

  private String activityId = null;

  @Valid
  private List<String> activityIdIn;

  private String executionId = null;

  private String processInstanceId = null;

  @Valid
  private List<String> processInstanceIdIn;

  private String processDefinitionId = null;

  @Valid
  private List<String> tenantIdIn;

  private Boolean active = null;

  private Boolean suspended = null;

  private Long priorityHigherThanOrEquals = null;

  private Long priorityLowerThanOrEquals = null;

  @Valid
  private List<@Valid ExternalTaskQueryDtoSortingInner> sorting;

  public ExternalTaskQueryDto externalTaskId(String externalTaskId) {
    this.externalTaskId = externalTaskId;
    return this;
  }

  /**
   * Filter by an external task's id.
   * @return externalTaskId
  */
  
  @Schema(name = "externalTaskId", description = "Filter by an external task's id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("externalTaskId")
  public String getExternalTaskId() {
    return externalTaskId;
  }

  public void setExternalTaskId(String externalTaskId) {
    this.externalTaskId = externalTaskId;
  }

  public ExternalTaskQueryDto externalTaskIdIn(List<String> externalTaskIdIn) {
    this.externalTaskIdIn = externalTaskIdIn;
    return this;
  }

  public ExternalTaskQueryDto addExternalTaskIdInItem(String externalTaskIdInItem) {
    if (this.externalTaskIdIn == null) {
      this.externalTaskIdIn = new ArrayList<>();
    }
    this.externalTaskIdIn.add(externalTaskIdInItem);
    return this;
  }

  /**
   * Filter by the comma-separated list of external task ids.
   * @return externalTaskIdIn
  */
  
  @Schema(name = "externalTaskIdIn", description = "Filter by the comma-separated list of external task ids.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("externalTaskIdIn")
  public List<String> getExternalTaskIdIn() {
    return externalTaskIdIn;
  }

  public void setExternalTaskIdIn(List<String> externalTaskIdIn) {
    this.externalTaskIdIn = externalTaskIdIn;
  }

  public ExternalTaskQueryDto topicName(String topicName) {
    this.topicName = topicName;
    return this;
  }

  /**
   * Filter by an external task topic.
   * @return topicName
  */
  
  @Schema(name = "topicName", description = "Filter by an external task topic.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("topicName")
  public String getTopicName() {
    return topicName;
  }

  public void setTopicName(String topicName) {
    this.topicName = topicName;
  }

  public ExternalTaskQueryDto workerId(String workerId) {
    this.workerId = workerId;
    return this;
  }

  /**
   * Filter by the id of the worker that the task was most recently locked by.
   * @return workerId
  */
  
  @Schema(name = "workerId", description = "Filter by the id of the worker that the task was most recently locked by.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("workerId")
  public String getWorkerId() {
    return workerId;
  }

  public void setWorkerId(String workerId) {
    this.workerId = workerId;
  }

  public ExternalTaskQueryDto locked(Boolean locked) {
    this.locked = locked;
    return this;
  }

  /**
   * Only include external tasks that are currently locked (i.e., they have a lock time and it has not expired). Value may only be `true`, as `false` matches any external task.
   * @return locked
  */
  
  @Schema(name = "locked", description = "Only include external tasks that are currently locked (i.e., they have a lock time and it has not expired). Value may only be `true`, as `false` matches any external task.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locked")
  public Boolean getLocked() {
    return locked;
  }

  public void setLocked(Boolean locked) {
    this.locked = locked;
  }

  public ExternalTaskQueryDto notLocked(Boolean notLocked) {
    this.notLocked = notLocked;
    return this;
  }

  /**
   * Only include external tasks that are currently not locked (i.e., they have no lock or it has expired). Value may only be `true`, as `false` matches any external task.
   * @return notLocked
  */
  
  @Schema(name = "notLocked", description = "Only include external tasks that are currently not locked (i.e., they have no lock or it has expired). Value may only be `true`, as `false` matches any external task.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notLocked")
  public Boolean getNotLocked() {
    return notLocked;
  }

  public void setNotLocked(Boolean notLocked) {
    this.notLocked = notLocked;
  }

  public ExternalTaskQueryDto withRetriesLeft(Boolean withRetriesLeft) {
    this.withRetriesLeft = withRetriesLeft;
    return this;
  }

  /**
   * Only include external tasks that have a positive (&gt; 0) number of retries (or `null`). Value may only be `true`, as `false` matches any external task.
   * @return withRetriesLeft
  */
  
  @Schema(name = "withRetriesLeft", description = "Only include external tasks that have a positive (&gt; 0) number of retries (or `null`). Value may only be `true`, as `false` matches any external task.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("withRetriesLeft")
  public Boolean getWithRetriesLeft() {
    return withRetriesLeft;
  }

  public void setWithRetriesLeft(Boolean withRetriesLeft) {
    this.withRetriesLeft = withRetriesLeft;
  }

  public ExternalTaskQueryDto noRetriesLeft(Boolean noRetriesLeft) {
    this.noRetriesLeft = noRetriesLeft;
    return this;
  }

  /**
   * Only include external tasks that have 0 retries. Value may only be `true`, as `false` matches any external task.
   * @return noRetriesLeft
  */
  
  @Schema(name = "noRetriesLeft", description = "Only include external tasks that have 0 retries. Value may only be `true`, as `false` matches any external task.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("noRetriesLeft")
  public Boolean getNoRetriesLeft() {
    return noRetriesLeft;
  }

  public void setNoRetriesLeft(Boolean noRetriesLeft) {
    this.noRetriesLeft = noRetriesLeft;
  }

  public ExternalTaskQueryDto lockExpirationAfter(OffsetDateTime lockExpirationAfter) {
    this.lockExpirationAfter = lockExpirationAfter;
    return this;
  }

  /**
   * Restrict to external tasks that have a lock that expires after a given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.
   * @return lockExpirationAfter
  */
  @Valid 
  @Schema(name = "lockExpirationAfter", description = "Restrict to external tasks that have a lock that expires after a given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lockExpirationAfter")
  public OffsetDateTime getLockExpirationAfter() {
    return lockExpirationAfter;
  }

  public void setLockExpirationAfter(OffsetDateTime lockExpirationAfter) {
    this.lockExpirationAfter = lockExpirationAfter;
  }

  public ExternalTaskQueryDto lockExpirationBefore(OffsetDateTime lockExpirationBefore) {
    this.lockExpirationBefore = lockExpirationBefore;
    return this;
  }

  /**
   * Restrict to external tasks that have a lock that expires before a given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.
   * @return lockExpirationBefore
  */
  @Valid 
  @Schema(name = "lockExpirationBefore", description = "Restrict to external tasks that have a lock that expires before a given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lockExpirationBefore")
  public OffsetDateTime getLockExpirationBefore() {
    return lockExpirationBefore;
  }

  public void setLockExpirationBefore(OffsetDateTime lockExpirationBefore) {
    this.lockExpirationBefore = lockExpirationBefore;
  }

  public ExternalTaskQueryDto activityId(String activityId) {
    this.activityId = activityId;
    return this;
  }

  /**
   * Filter by the id of the activity that an external task is created for.
   * @return activityId
  */
  
  @Schema(name = "activityId", description = "Filter by the id of the activity that an external task is created for.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activityId")
  public String getActivityId() {
    return activityId;
  }

  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }

  public ExternalTaskQueryDto activityIdIn(List<String> activityIdIn) {
    this.activityIdIn = activityIdIn;
    return this;
  }

  public ExternalTaskQueryDto addActivityIdInItem(String activityIdInItem) {
    if (this.activityIdIn == null) {
      this.activityIdIn = new ArrayList<>();
    }
    this.activityIdIn.add(activityIdInItem);
    return this;
  }

  /**
   * Filter by the comma-separated list of ids of the activities that an external task is created for.
   * @return activityIdIn
  */
  
  @Schema(name = "activityIdIn", description = "Filter by the comma-separated list of ids of the activities that an external task is created for.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activityIdIn")
  public List<String> getActivityIdIn() {
    return activityIdIn;
  }

  public void setActivityIdIn(List<String> activityIdIn) {
    this.activityIdIn = activityIdIn;
  }

  public ExternalTaskQueryDto executionId(String executionId) {
    this.executionId = executionId;
    return this;
  }

  /**
   * Filter by the id of the execution that an external task belongs to.
   * @return executionId
  */
  
  @Schema(name = "executionId", description = "Filter by the id of the execution that an external task belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("executionId")
  public String getExecutionId() {
    return executionId;
  }

  public void setExecutionId(String executionId) {
    this.executionId = executionId;
  }

  public ExternalTaskQueryDto processInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
    return this;
  }

  /**
   * Filter by the id of the process instance that an external task belongs to.
   * @return processInstanceId
  */
  
  @Schema(name = "processInstanceId", description = "Filter by the id of the process instance that an external task belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processInstanceId")
  public String getProcessInstanceId() {
    return processInstanceId;
  }

  public void setProcessInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
  }

  public ExternalTaskQueryDto processInstanceIdIn(List<String> processInstanceIdIn) {
    this.processInstanceIdIn = processInstanceIdIn;
    return this;
  }

  public ExternalTaskQueryDto addProcessInstanceIdInItem(String processInstanceIdInItem) {
    if (this.processInstanceIdIn == null) {
      this.processInstanceIdIn = new ArrayList<>();
    }
    this.processInstanceIdIn.add(processInstanceIdInItem);
    return this;
  }

  /**
   * Filter by a comma-separated list of process instance ids that an external task may belong to.
   * @return processInstanceIdIn
  */
  
  @Schema(name = "processInstanceIdIn", description = "Filter by a comma-separated list of process instance ids that an external task may belong to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processInstanceIdIn")
  public List<String> getProcessInstanceIdIn() {
    return processInstanceIdIn;
  }

  public void setProcessInstanceIdIn(List<String> processInstanceIdIn) {
    this.processInstanceIdIn = processInstanceIdIn;
  }

  public ExternalTaskQueryDto processDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
    return this;
  }

  /**
   * Filter by the id of the process definition that an external task belongs to.
   * @return processDefinitionId
  */
  
  @Schema(name = "processDefinitionId", description = "Filter by the id of the process definition that an external task belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionId")
  public String getProcessDefinitionId() {
    return processDefinitionId;
  }

  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }

  public ExternalTaskQueryDto tenantIdIn(List<String> tenantIdIn) {
    this.tenantIdIn = tenantIdIn;
    return this;
  }

  public ExternalTaskQueryDto addTenantIdInItem(String tenantIdInItem) {
    if (this.tenantIdIn == null) {
      this.tenantIdIn = new ArrayList<>();
    }
    this.tenantIdIn.add(tenantIdInItem);
    return this;
  }

  /**
   * Filter by a comma-separated list of tenant ids. An external task must have one of the given tenant ids.
   * @return tenantIdIn
  */
  
  @Schema(name = "tenantIdIn", description = "Filter by a comma-separated list of tenant ids. An external task must have one of the given tenant ids.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tenantIdIn")
  public List<String> getTenantIdIn() {
    return tenantIdIn;
  }

  public void setTenantIdIn(List<String> tenantIdIn) {
    this.tenantIdIn = tenantIdIn;
  }

  public ExternalTaskQueryDto active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Only include active tasks. Value may only be `true`, as `false` matches any external task.
   * @return active
  */
  
  @Schema(name = "active", description = "Only include active tasks. Value may only be `true`, as `false` matches any external task.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public ExternalTaskQueryDto suspended(Boolean suspended) {
    this.suspended = suspended;
    return this;
  }

  /**
   * Only include suspended tasks. Value may only be `true`, as `false` matches any external task.
   * @return suspended
  */
  
  @Schema(name = "suspended", description = "Only include suspended tasks. Value may only be `true`, as `false` matches any external task.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("suspended")
  public Boolean getSuspended() {
    return suspended;
  }

  public void setSuspended(Boolean suspended) {
    this.suspended = suspended;
  }

  public ExternalTaskQueryDto priorityHigherThanOrEquals(Long priorityHigherThanOrEquals) {
    this.priorityHigherThanOrEquals = priorityHigherThanOrEquals;
    return this;
  }

  /**
   * Only include jobs with a priority higher than or equal to the given value. Value must be a valid `long` value.
   * @return priorityHigherThanOrEquals
  */
  
  @Schema(name = "priorityHigherThanOrEquals", description = "Only include jobs with a priority higher than or equal to the given value. Value must be a valid `long` value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("priorityHigherThanOrEquals")
  public Long getPriorityHigherThanOrEquals() {
    return priorityHigherThanOrEquals;
  }

  public void setPriorityHigherThanOrEquals(Long priorityHigherThanOrEquals) {
    this.priorityHigherThanOrEquals = priorityHigherThanOrEquals;
  }

  public ExternalTaskQueryDto priorityLowerThanOrEquals(Long priorityLowerThanOrEquals) {
    this.priorityLowerThanOrEquals = priorityLowerThanOrEquals;
    return this;
  }

  /**
   * Only include jobs with a priority lower than or equal to the given value. Value must be a valid `long` value.
   * @return priorityLowerThanOrEquals
  */
  
  @Schema(name = "priorityLowerThanOrEquals", description = "Only include jobs with a priority lower than or equal to the given value. Value must be a valid `long` value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("priorityLowerThanOrEquals")
  public Long getPriorityLowerThanOrEquals() {
    return priorityLowerThanOrEquals;
  }

  public void setPriorityLowerThanOrEquals(Long priorityLowerThanOrEquals) {
    this.priorityLowerThanOrEquals = priorityLowerThanOrEquals;
  }

  public ExternalTaskQueryDto sorting(List<@Valid ExternalTaskQueryDtoSortingInner> sorting) {
    this.sorting = sorting;
    return this;
  }

  public ExternalTaskQueryDto addSortingItem(ExternalTaskQueryDtoSortingInner sortingItem) {
    if (this.sorting == null) {
      this.sorting = new ArrayList<>();
    }
    this.sorting.add(sortingItem);
    return this;
  }

  /**
   * A JSON array of criteria to sort the result by. Each element of the array is a JSON object that                     specifies one ordering. The position in the array identifies the rank of an ordering, i.e., whether                     it is primary, secondary, etc. The ordering objects have the following properties:                      **Note:** The `sorting` properties will not be applied to the External Task count query.
   * @return sorting
  */
  @Valid 
  @Schema(name = "sorting", description = "A JSON array of criteria to sort the result by. Each element of the array is a JSON object that                     specifies one ordering. The position in the array identifies the rank of an ordering, i.e., whether                     it is primary, secondary, etc. The ordering objects have the following properties:                      **Note:** The `sorting` properties will not be applied to the External Task count query.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sorting")
  public List<@Valid ExternalTaskQueryDtoSortingInner> getSorting() {
    return sorting;
  }

  public void setSorting(List<@Valid ExternalTaskQueryDtoSortingInner> sorting) {
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
    ExternalTaskQueryDto externalTaskQueryDto = (ExternalTaskQueryDto) o;
    return Objects.equals(this.externalTaskId, externalTaskQueryDto.externalTaskId) &&
        Objects.equals(this.externalTaskIdIn, externalTaskQueryDto.externalTaskIdIn) &&
        Objects.equals(this.topicName, externalTaskQueryDto.topicName) &&
        Objects.equals(this.workerId, externalTaskQueryDto.workerId) &&
        Objects.equals(this.locked, externalTaskQueryDto.locked) &&
        Objects.equals(this.notLocked, externalTaskQueryDto.notLocked) &&
        Objects.equals(this.withRetriesLeft, externalTaskQueryDto.withRetriesLeft) &&
        Objects.equals(this.noRetriesLeft, externalTaskQueryDto.noRetriesLeft) &&
        Objects.equals(this.lockExpirationAfter, externalTaskQueryDto.lockExpirationAfter) &&
        Objects.equals(this.lockExpirationBefore, externalTaskQueryDto.lockExpirationBefore) &&
        Objects.equals(this.activityId, externalTaskQueryDto.activityId) &&
        Objects.equals(this.activityIdIn, externalTaskQueryDto.activityIdIn) &&
        Objects.equals(this.executionId, externalTaskQueryDto.executionId) &&
        Objects.equals(this.processInstanceId, externalTaskQueryDto.processInstanceId) &&
        Objects.equals(this.processInstanceIdIn, externalTaskQueryDto.processInstanceIdIn) &&
        Objects.equals(this.processDefinitionId, externalTaskQueryDto.processDefinitionId) &&
        Objects.equals(this.tenantIdIn, externalTaskQueryDto.tenantIdIn) &&
        Objects.equals(this.active, externalTaskQueryDto.active) &&
        Objects.equals(this.suspended, externalTaskQueryDto.suspended) &&
        Objects.equals(this.priorityHigherThanOrEquals, externalTaskQueryDto.priorityHigherThanOrEquals) &&
        Objects.equals(this.priorityLowerThanOrEquals, externalTaskQueryDto.priorityLowerThanOrEquals) &&
        Objects.equals(this.sorting, externalTaskQueryDto.sorting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalTaskId, externalTaskIdIn, topicName, workerId, locked, notLocked, withRetriesLeft, noRetriesLeft, lockExpirationAfter, lockExpirationBefore, activityId, activityIdIn, executionId, processInstanceId, processInstanceIdIn, processDefinitionId, tenantIdIn, active, suspended, priorityHigherThanOrEquals, priorityLowerThanOrEquals, sorting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalTaskQueryDto {\n");
    sb.append("    externalTaskId: ").append(toIndentedString(externalTaskId)).append("\n");
    sb.append("    externalTaskIdIn: ").append(toIndentedString(externalTaskIdIn)).append("\n");
    sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
    sb.append("    workerId: ").append(toIndentedString(workerId)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    notLocked: ").append(toIndentedString(notLocked)).append("\n");
    sb.append("    withRetriesLeft: ").append(toIndentedString(withRetriesLeft)).append("\n");
    sb.append("    noRetriesLeft: ").append(toIndentedString(noRetriesLeft)).append("\n");
    sb.append("    lockExpirationAfter: ").append(toIndentedString(lockExpirationAfter)).append("\n");
    sb.append("    lockExpirationBefore: ").append(toIndentedString(lockExpirationBefore)).append("\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    activityIdIn: ").append(toIndentedString(activityIdIn)).append("\n");
    sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    processInstanceIdIn: ").append(toIndentedString(processInstanceIdIn)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    tenantIdIn: ").append(toIndentedString(tenantIdIn)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
    sb.append("    priorityHigherThanOrEquals: ").append(toIndentedString(priorityHigherThanOrEquals)).append("\n");
    sb.append("    priorityLowerThanOrEquals: ").append(toIndentedString(priorityLowerThanOrEquals)).append("\n");
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

