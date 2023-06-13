package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tosan.camunda.camundaclient.generated.model.HistoricActivityInstanceQueryDtoSortingInner;
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
 * A historic activity instance query which defines a group of historic activity instances
 */

@Schema(name = "HistoricActivityInstanceQueryDto", description = "A historic activity instance query which defines a group of historic activity instances")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class HistoricActivityInstanceQueryDto {

  private String activityInstanceId = null;

  private String processInstanceId = null;

  private String processDefinitionId = null;

  private String executionId = null;

  private String activityId = null;

  private String activityName = null;

  private String activityType = null;

  private String taskAssignee = null;

  private Boolean finished = null;

  private Boolean unfinished = null;

  private Boolean canceled = null;

  private Boolean completeScope = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startedBefore = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startedAfter = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime finishedBefore = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime finishedAfter = null;

  @Valid
  private List<String> tenantIdIn;

  private Boolean withoutTenantId = null;

  @Valid
  private List<@Valid HistoricActivityInstanceQueryDtoSortingInner> sorting;

  public HistoricActivityInstanceQueryDto activityInstanceId(String activityInstanceId) {
    this.activityInstanceId = activityInstanceId;
    return this;
  }

  /**
   * Filter by activity instance id.
   * @return activityInstanceId
  */
  
  @Schema(name = "activityInstanceId", description = "Filter by activity instance id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activityInstanceId")
  public String getActivityInstanceId() {
    return activityInstanceId;
  }

  public void setActivityInstanceId(String activityInstanceId) {
    this.activityInstanceId = activityInstanceId;
  }

  public HistoricActivityInstanceQueryDto processInstanceId(String processInstanceId) {
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

  public HistoricActivityInstanceQueryDto processDefinitionId(String processDefinitionId) {
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

  public HistoricActivityInstanceQueryDto executionId(String executionId) {
    this.executionId = executionId;
    return this;
  }

  /**
   * Filter by the id of the execution that executed the activity instance.
   * @return executionId
  */
  
  @Schema(name = "executionId", description = "Filter by the id of the execution that executed the activity instance.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("executionId")
  public String getExecutionId() {
    return executionId;
  }

  public void setExecutionId(String executionId) {
    this.executionId = executionId;
  }

  public HistoricActivityInstanceQueryDto activityId(String activityId) {
    this.activityId = activityId;
    return this;
  }

  /**
   * Filter by the activity id (according to BPMN 2.0 XML).
   * @return activityId
  */
  
  @Schema(name = "activityId", description = "Filter by the activity id (according to BPMN 2.0 XML).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activityId")
  public String getActivityId() {
    return activityId;
  }

  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }

  public HistoricActivityInstanceQueryDto activityName(String activityName) {
    this.activityName = activityName;
    return this;
  }

  /**
   * Filter by the activity name (according to BPMN 2.0 XML).
   * @return activityName
  */
  
  @Schema(name = "activityName", description = "Filter by the activity name (according to BPMN 2.0 XML).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activityName")
  public String getActivityName() {
    return activityName;
  }

  public void setActivityName(String activityName) {
    this.activityName = activityName;
  }

  public HistoricActivityInstanceQueryDto activityType(String activityType) {
    this.activityType = activityType;
    return this;
  }

  /**
   * Filter by activity type.
   * @return activityType
  */
  
  @Schema(name = "activityType", description = "Filter by activity type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activityType")
  public String getActivityType() {
    return activityType;
  }

  public void setActivityType(String activityType) {
    this.activityType = activityType;
  }

  public HistoricActivityInstanceQueryDto taskAssignee(String taskAssignee) {
    this.taskAssignee = taskAssignee;
    return this;
  }

  /**
   * Only include activity instances that are user tasks and assigned to a given user.
   * @return taskAssignee
  */
  
  @Schema(name = "taskAssignee", description = "Only include activity instances that are user tasks and assigned to a given user.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taskAssignee")
  public String getTaskAssignee() {
    return taskAssignee;
  }

  public void setTaskAssignee(String taskAssignee) {
    this.taskAssignee = taskAssignee;
  }

  public HistoricActivityInstanceQueryDto finished(Boolean finished) {
    this.finished = finished;
    return this;
  }

  /**
   * Only include finished activity instances. Value may only be `true`, as `false` behaves the same as when the property is not set.
   * @return finished
  */
  
  @Schema(name = "finished", description = "Only include finished activity instances. Value may only be `true`, as `false` behaves the same as when the property is not set.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("finished")
  public Boolean getFinished() {
    return finished;
  }

  public void setFinished(Boolean finished) {
    this.finished = finished;
  }

  public HistoricActivityInstanceQueryDto unfinished(Boolean unfinished) {
    this.unfinished = unfinished;
    return this;
  }

  /**
   * Only include unfinished activity instances. Value may only be `true`, as `false` behaves the same as when the property is not set.
   * @return unfinished
  */
  
  @Schema(name = "unfinished", description = "Only include unfinished activity instances. Value may only be `true`, as `false` behaves the same as when the property is not set.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("unfinished")
  public Boolean getUnfinished() {
    return unfinished;
  }

  public void setUnfinished(Boolean unfinished) {
    this.unfinished = unfinished;
  }

  public HistoricActivityInstanceQueryDto canceled(Boolean canceled) {
    this.canceled = canceled;
    return this;
  }

  /**
   * Only include canceled activity instances. Value may only be `true`, as `false` behaves the same as when the property is not set.
   * @return canceled
  */
  
  @Schema(name = "canceled", description = "Only include canceled activity instances. Value may only be `true`, as `false` behaves the same as when the property is not set.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("canceled")
  public Boolean getCanceled() {
    return canceled;
  }

  public void setCanceled(Boolean canceled) {
    this.canceled = canceled;
  }

  public HistoricActivityInstanceQueryDto completeScope(Boolean completeScope) {
    this.completeScope = completeScope;
    return this;
  }

  /**
   * Only include activity instances which completed a scope. Value may only be `true`, as `false` behaves the same as when the property is not set.
   * @return completeScope
  */
  
  @Schema(name = "completeScope", description = "Only include activity instances which completed a scope. Value may only be `true`, as `false` behaves the same as when the property is not set.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("completeScope")
  public Boolean getCompleteScope() {
    return completeScope;
  }

  public void setCompleteScope(Boolean completeScope) {
    this.completeScope = completeScope;
  }

  public HistoricActivityInstanceQueryDto startedBefore(OffsetDateTime startedBefore) {
    this.startedBefore = startedBefore;
    return this;
  }

  /**
   * Restrict to instances that were started before the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.
   * @return startedBefore
  */
  @Valid 
  @Schema(name = "startedBefore", description = "Restrict to instances that were started before the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startedBefore")
  public OffsetDateTime getStartedBefore() {
    return startedBefore;
  }

  public void setStartedBefore(OffsetDateTime startedBefore) {
    this.startedBefore = startedBefore;
  }

  public HistoricActivityInstanceQueryDto startedAfter(OffsetDateTime startedAfter) {
    this.startedAfter = startedAfter;
    return this;
  }

  /**
   * Restrict to instances that were started after the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.
   * @return startedAfter
  */
  @Valid 
  @Schema(name = "startedAfter", description = "Restrict to instances that were started after the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startedAfter")
  public OffsetDateTime getStartedAfter() {
    return startedAfter;
  }

  public void setStartedAfter(OffsetDateTime startedAfter) {
    this.startedAfter = startedAfter;
  }

  public HistoricActivityInstanceQueryDto finishedBefore(OffsetDateTime finishedBefore) {
    this.finishedBefore = finishedBefore;
    return this;
  }

  /**
   * Restrict to instances that were finished before the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.
   * @return finishedBefore
  */
  @Valid 
  @Schema(name = "finishedBefore", description = "Restrict to instances that were finished before the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("finishedBefore")
  public OffsetDateTime getFinishedBefore() {
    return finishedBefore;
  }

  public void setFinishedBefore(OffsetDateTime finishedBefore) {
    this.finishedBefore = finishedBefore;
  }

  public HistoricActivityInstanceQueryDto finishedAfter(OffsetDateTime finishedAfter) {
    this.finishedAfter = finishedAfter;
    return this;
  }

  /**
   * Restrict to instances that were finished after the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.
   * @return finishedAfter
  */
  @Valid 
  @Schema(name = "finishedAfter", description = "Restrict to instances that were finished after the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("finishedAfter")
  public OffsetDateTime getFinishedAfter() {
    return finishedAfter;
  }

  public void setFinishedAfter(OffsetDateTime finishedAfter) {
    this.finishedAfter = finishedAfter;
  }

  public HistoricActivityInstanceQueryDto tenantIdIn(List<String> tenantIdIn) {
    this.tenantIdIn = tenantIdIn;
    return this;
  }

  public HistoricActivityInstanceQueryDto addTenantIdInItem(String tenantIdInItem) {
    if (this.tenantIdIn == null) {
      this.tenantIdIn = new ArrayList<>();
    }
    this.tenantIdIn.add(tenantIdInItem);
    return this;
  }

  /**
   * Must be a JSON array of Strings. An activity instance must have one of the given tenant ids.
   * @return tenantIdIn
  */
  
  @Schema(name = "tenantIdIn", description = "Must be a JSON array of Strings. An activity instance must have one of the given tenant ids.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tenantIdIn")
  public List<String> getTenantIdIn() {
    return tenantIdIn;
  }

  public void setTenantIdIn(List<String> tenantIdIn) {
    this.tenantIdIn = tenantIdIn;
  }

  public HistoricActivityInstanceQueryDto withoutTenantId(Boolean withoutTenantId) {
    this.withoutTenantId = withoutTenantId;
    return this;
  }

  /**
   * Only include historic activity instances that belong to no tenant. Value may only be `true`, as `false` is the default behavior.
   * @return withoutTenantId
  */
  
  @Schema(name = "withoutTenantId", description = "Only include historic activity instances that belong to no tenant. Value may only be `true`, as `false` is the default behavior.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("withoutTenantId")
  public Boolean getWithoutTenantId() {
    return withoutTenantId;
  }

  public void setWithoutTenantId(Boolean withoutTenantId) {
    this.withoutTenantId = withoutTenantId;
  }

  public HistoricActivityInstanceQueryDto sorting(List<@Valid HistoricActivityInstanceQueryDtoSortingInner> sorting) {
    this.sorting = sorting;
    return this;
  }

  public HistoricActivityInstanceQueryDto addSortingItem(HistoricActivityInstanceQueryDtoSortingInner sortingItem) {
    if (this.sorting == null) {
      this.sorting = new ArrayList<>();
    }
    this.sorting.add(sortingItem);
    return this;
  }

  /**
   * Apply sorting of the result
   * @return sorting
  */
  @Valid 
  @Schema(name = "sorting", description = "Apply sorting of the result", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sorting")
  public List<@Valid HistoricActivityInstanceQueryDtoSortingInner> getSorting() {
    return sorting;
  }

  public void setSorting(List<@Valid HistoricActivityInstanceQueryDtoSortingInner> sorting) {
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
    HistoricActivityInstanceQueryDto historicActivityInstanceQueryDto = (HistoricActivityInstanceQueryDto) o;
    return Objects.equals(this.activityInstanceId, historicActivityInstanceQueryDto.activityInstanceId) &&
        Objects.equals(this.processInstanceId, historicActivityInstanceQueryDto.processInstanceId) &&
        Objects.equals(this.processDefinitionId, historicActivityInstanceQueryDto.processDefinitionId) &&
        Objects.equals(this.executionId, historicActivityInstanceQueryDto.executionId) &&
        Objects.equals(this.activityId, historicActivityInstanceQueryDto.activityId) &&
        Objects.equals(this.activityName, historicActivityInstanceQueryDto.activityName) &&
        Objects.equals(this.activityType, historicActivityInstanceQueryDto.activityType) &&
        Objects.equals(this.taskAssignee, historicActivityInstanceQueryDto.taskAssignee) &&
        Objects.equals(this.finished, historicActivityInstanceQueryDto.finished) &&
        Objects.equals(this.unfinished, historicActivityInstanceQueryDto.unfinished) &&
        Objects.equals(this.canceled, historicActivityInstanceQueryDto.canceled) &&
        Objects.equals(this.completeScope, historicActivityInstanceQueryDto.completeScope) &&
        Objects.equals(this.startedBefore, historicActivityInstanceQueryDto.startedBefore) &&
        Objects.equals(this.startedAfter, historicActivityInstanceQueryDto.startedAfter) &&
        Objects.equals(this.finishedBefore, historicActivityInstanceQueryDto.finishedBefore) &&
        Objects.equals(this.finishedAfter, historicActivityInstanceQueryDto.finishedAfter) &&
        Objects.equals(this.tenantIdIn, historicActivityInstanceQueryDto.tenantIdIn) &&
        Objects.equals(this.withoutTenantId, historicActivityInstanceQueryDto.withoutTenantId) &&
        Objects.equals(this.sorting, historicActivityInstanceQueryDto.sorting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityInstanceId, processInstanceId, processDefinitionId, executionId, activityId, activityName, activityType, taskAssignee, finished, unfinished, canceled, completeScope, startedBefore, startedAfter, finishedBefore, finishedAfter, tenantIdIn, withoutTenantId, sorting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricActivityInstanceQueryDto {\n");
    sb.append("    activityInstanceId: ").append(toIndentedString(activityInstanceId)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    activityName: ").append(toIndentedString(activityName)).append("\n");
    sb.append("    activityType: ").append(toIndentedString(activityType)).append("\n");
    sb.append("    taskAssignee: ").append(toIndentedString(taskAssignee)).append("\n");
    sb.append("    finished: ").append(toIndentedString(finished)).append("\n");
    sb.append("    unfinished: ").append(toIndentedString(unfinished)).append("\n");
    sb.append("    canceled: ").append(toIndentedString(canceled)).append("\n");
    sb.append("    completeScope: ").append(toIndentedString(completeScope)).append("\n");
    sb.append("    startedBefore: ").append(toIndentedString(startedBefore)).append("\n");
    sb.append("    startedAfter: ").append(toIndentedString(startedAfter)).append("\n");
    sb.append("    finishedBefore: ").append(toIndentedString(finishedBefore)).append("\n");
    sb.append("    finishedAfter: ").append(toIndentedString(finishedAfter)).append("\n");
    sb.append("    tenantIdIn: ").append(toIndentedString(tenantIdIn)).append("\n");
    sb.append("    withoutTenantId: ").append(toIndentedString(withoutTenantId)).append("\n");
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

