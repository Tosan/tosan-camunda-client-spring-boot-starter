package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tosan.camunda.camundaclient.generated.model.HistoricProcessInstanceQueryDtoSortingInner;
import com.tosan.camunda.camundaclient.generated.model.VariableQueryParameterDto;
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
 * A historic process instance query which defines a group of historic process instances
 */

@Schema(name = "HistoricProcessInstanceQueryDto", description = "A historic process instance query which defines a group of historic process instances")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class HistoricProcessInstanceQueryDto {

  private String processInstanceId = null;

  @Valid
  private List<String> processInstanceIds;

  private String processDefinitionId = null;

  private String processDefinitionKey = null;

  @Valid
  private List<String> processDefinitionKeyIn;

  private String processDefinitionName = null;

  private String processDefinitionNameLike = null;

  @Valid
  private List<String> processDefinitionKeyNotIn;

  private String processInstanceBusinessKey = null;

  @Valid
  private List<String> processInstanceBusinessKeyIn;

  private String processInstanceBusinessKeyLike = null;

  private Boolean rootProcessInstances = null;

  private Boolean finished = null;

  private Boolean unfinished = null;

  private Boolean withIncidents = null;

  private Boolean withRootIncidents = null;

  private String incidentType = null;

  /**
   * Only include process instances which have an incident in status either open or resolved. To get all process instances, use the query parameter withIncidents.
   */
  public enum IncidentStatusEnum {
    OPEN("open"),
    
    RESOLVED("resolved");

    private String value;

    IncidentStatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static IncidentStatusEnum fromValue(String value) {
      for (IncidentStatusEnum b : IncidentStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  private IncidentStatusEnum incidentStatus = null;

  private String incidentMessage = null;

  private String incidentMessageLike = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startedBefore = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startedAfter = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime finishedBefore = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime finishedAfter = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime executedActivityAfter = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime executedActivityBefore = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime executedJobAfter = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime executedJobBefore = null;

  private String startedBy = null;

  private String superProcessInstanceId = null;

  private String subProcessInstanceId = null;

  private String superCaseInstanceId = null;

  private String subCaseInstanceId = null;

  private String caseInstanceId = null;

  @Valid
  private List<String> tenantIdIn;

  private Boolean withoutTenantId = null;

  @Valid
  private List<String> executedActivityIdIn;

  @Valid
  private List<String> activeActivityIdIn;

  private Boolean active = null;

  private Boolean suspended = null;

  private Boolean completed = null;

  private Boolean externallyTerminated = null;

  private Boolean internallyTerminated = null;

  @Valid
  private List<@Valid VariableQueryParameterDto> variables;

  private Boolean variableNamesIgnoreCase = null;

  private Boolean variableValuesIgnoreCase = null;

  @Valid
  private List<@Valid HistoricProcessInstanceQueryDto> orQueries;

  @Valid
  private List<@Valid HistoricProcessInstanceQueryDtoSortingInner> sorting;

  public HistoricProcessInstanceQueryDto processInstanceId(String processInstanceId) {
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

  public HistoricProcessInstanceQueryDto processInstanceIds(List<String> processInstanceIds) {
    this.processInstanceIds = processInstanceIds;
    return this;
  }

  public HistoricProcessInstanceQueryDto addProcessInstanceIdsItem(String processInstanceIdsItem) {
    if (this.processInstanceIds == null) {
      this.processInstanceIds = new ArrayList<>();
    }
    this.processInstanceIds.add(processInstanceIdsItem);
    return this;
  }

  /**
   * Filter by process instance ids. Must be a JSON array of `Strings`.
   * @return processInstanceIds
  */
  
  @Schema(name = "processInstanceIds", description = "Filter by process instance ids. Must be a JSON array of `Strings`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processInstanceIds")
  public List<String> getProcessInstanceIds() {
    return processInstanceIds;
  }

  public void setProcessInstanceIds(List<String> processInstanceIds) {
    this.processInstanceIds = processInstanceIds;
  }

  public HistoricProcessInstanceQueryDto processDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
    return this;
  }

  /**
   * Filter by the process definition the instances run on.
   * @return processDefinitionId
  */
  
  @Schema(name = "processDefinitionId", description = "Filter by the process definition the instances run on.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionId")
  public String getProcessDefinitionId() {
    return processDefinitionId;
  }

  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }

  public HistoricProcessInstanceQueryDto processDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
    return this;
  }

  /**
   * Filter by the key of the process definition the instances run on.
   * @return processDefinitionKey
  */
  
  @Schema(name = "processDefinitionKey", description = "Filter by the key of the process definition the instances run on.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionKey")
  public String getProcessDefinitionKey() {
    return processDefinitionKey;
  }

  public void setProcessDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
  }

  public HistoricProcessInstanceQueryDto processDefinitionKeyIn(List<String> processDefinitionKeyIn) {
    this.processDefinitionKeyIn = processDefinitionKeyIn;
    return this;
  }

  public HistoricProcessInstanceQueryDto addProcessDefinitionKeyInItem(String processDefinitionKeyInItem) {
    if (this.processDefinitionKeyIn == null) {
      this.processDefinitionKeyIn = new ArrayList<>();
    }
    this.processDefinitionKeyIn.add(processDefinitionKeyInItem);
    return this;
  }

  /**
   * Filter by a list of process definition keys. A process instance must have one of the given process definition keys. Must be a JSON array of `Strings`.
   * @return processDefinitionKeyIn
  */
  
  @Schema(name = "processDefinitionKeyIn", description = "Filter by a list of process definition keys. A process instance must have one of the given process definition keys. Must be a JSON array of `Strings`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionKeyIn")
  public List<String> getProcessDefinitionKeyIn() {
    return processDefinitionKeyIn;
  }

  public void setProcessDefinitionKeyIn(List<String> processDefinitionKeyIn) {
    this.processDefinitionKeyIn = processDefinitionKeyIn;
  }

  public HistoricProcessInstanceQueryDto processDefinitionName(String processDefinitionName) {
    this.processDefinitionName = processDefinitionName;
    return this;
  }

  /**
   * Filter by the name of the process definition the instances run on.
   * @return processDefinitionName
  */
  
  @Schema(name = "processDefinitionName", description = "Filter by the name of the process definition the instances run on.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionName")
  public String getProcessDefinitionName() {
    return processDefinitionName;
  }

  public void setProcessDefinitionName(String processDefinitionName) {
    this.processDefinitionName = processDefinitionName;
  }

  public HistoricProcessInstanceQueryDto processDefinitionNameLike(String processDefinitionNameLike) {
    this.processDefinitionNameLike = processDefinitionNameLike;
    return this;
  }

  /**
   * Filter by process definition names that the parameter is a substring of.
   * @return processDefinitionNameLike
  */
  
  @Schema(name = "processDefinitionNameLike", description = "Filter by process definition names that the parameter is a substring of.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionNameLike")
  public String getProcessDefinitionNameLike() {
    return processDefinitionNameLike;
  }

  public void setProcessDefinitionNameLike(String processDefinitionNameLike) {
    this.processDefinitionNameLike = processDefinitionNameLike;
  }

  public HistoricProcessInstanceQueryDto processDefinitionKeyNotIn(List<String> processDefinitionKeyNotIn) {
    this.processDefinitionKeyNotIn = processDefinitionKeyNotIn;
    return this;
  }

  public HistoricProcessInstanceQueryDto addProcessDefinitionKeyNotInItem(String processDefinitionKeyNotInItem) {
    if (this.processDefinitionKeyNotIn == null) {
      this.processDefinitionKeyNotIn = new ArrayList<>();
    }
    this.processDefinitionKeyNotIn.add(processDefinitionKeyNotInItem);
    return this;
  }

  /**
   * Exclude instances that belong to a set of process definitions. Must be a JSON array of `Strings`.
   * @return processDefinitionKeyNotIn
  */
  
  @Schema(name = "processDefinitionKeyNotIn", description = "Exclude instances that belong to a set of process definitions. Must be a JSON array of `Strings`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionKeyNotIn")
  public List<String> getProcessDefinitionKeyNotIn() {
    return processDefinitionKeyNotIn;
  }

  public void setProcessDefinitionKeyNotIn(List<String> processDefinitionKeyNotIn) {
    this.processDefinitionKeyNotIn = processDefinitionKeyNotIn;
  }

  public HistoricProcessInstanceQueryDto processInstanceBusinessKey(String processInstanceBusinessKey) {
    this.processInstanceBusinessKey = processInstanceBusinessKey;
    return this;
  }

  /**
   * Filter by process instance business key.
   * @return processInstanceBusinessKey
  */
  
  @Schema(name = "processInstanceBusinessKey", description = "Filter by process instance business key.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processInstanceBusinessKey")
  public String getProcessInstanceBusinessKey() {
    return processInstanceBusinessKey;
  }

  public void setProcessInstanceBusinessKey(String processInstanceBusinessKey) {
    this.processInstanceBusinessKey = processInstanceBusinessKey;
  }

  public HistoricProcessInstanceQueryDto processInstanceBusinessKeyIn(List<String> processInstanceBusinessKeyIn) {
    this.processInstanceBusinessKeyIn = processInstanceBusinessKeyIn;
    return this;
  }

  public HistoricProcessInstanceQueryDto addProcessInstanceBusinessKeyInItem(String processInstanceBusinessKeyInItem) {
    if (this.processInstanceBusinessKeyIn == null) {
      this.processInstanceBusinessKeyIn = new ArrayList<>();
    }
    this.processInstanceBusinessKeyIn.add(processInstanceBusinessKeyInItem);
    return this;
  }

  /**
   * Filter by a list of business keys. A process instance must have one of the given business keys. Must be a JSON array of `Strings`
   * @return processInstanceBusinessKeyIn
  */
  
  @Schema(name = "processInstanceBusinessKeyIn", description = "Filter by a list of business keys. A process instance must have one of the given business keys. Must be a JSON array of `Strings`", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processInstanceBusinessKeyIn")
  public List<String> getProcessInstanceBusinessKeyIn() {
    return processInstanceBusinessKeyIn;
  }

  public void setProcessInstanceBusinessKeyIn(List<String> processInstanceBusinessKeyIn) {
    this.processInstanceBusinessKeyIn = processInstanceBusinessKeyIn;
  }

  public HistoricProcessInstanceQueryDto processInstanceBusinessKeyLike(String processInstanceBusinessKeyLike) {
    this.processInstanceBusinessKeyLike = processInstanceBusinessKeyLike;
    return this;
  }

  /**
   * Filter by process instance business key that the parameter is a substring of.
   * @return processInstanceBusinessKeyLike
  */
  
  @Schema(name = "processInstanceBusinessKeyLike", description = "Filter by process instance business key that the parameter is a substring of.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processInstanceBusinessKeyLike")
  public String getProcessInstanceBusinessKeyLike() {
    return processInstanceBusinessKeyLike;
  }

  public void setProcessInstanceBusinessKeyLike(String processInstanceBusinessKeyLike) {
    this.processInstanceBusinessKeyLike = processInstanceBusinessKeyLike;
  }

  public HistoricProcessInstanceQueryDto rootProcessInstances(Boolean rootProcessInstances) {
    this.rootProcessInstances = rootProcessInstances;
    return this;
  }

  /**
   * Restrict the query to all process instances that are top level process instances.
   * @return rootProcessInstances
  */
  
  @Schema(name = "rootProcessInstances", description = "Restrict the query to all process instances that are top level process instances.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rootProcessInstances")
  public Boolean getRootProcessInstances() {
    return rootProcessInstances;
  }

  public void setRootProcessInstances(Boolean rootProcessInstances) {
    this.rootProcessInstances = rootProcessInstances;
  }

  public HistoricProcessInstanceQueryDto finished(Boolean finished) {
    this.finished = finished;
    return this;
  }

  /**
   * Only include finished process instances. This flag includes all process instances that are completed or terminated. Value may only be `true`, as `false` is the default behavior.
   * @return finished
  */
  
  @Schema(name = "finished", description = "Only include finished process instances. This flag includes all process instances that are completed or terminated. Value may only be `true`, as `false` is the default behavior.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("finished")
  public Boolean getFinished() {
    return finished;
  }

  public void setFinished(Boolean finished) {
    this.finished = finished;
  }

  public HistoricProcessInstanceQueryDto unfinished(Boolean unfinished) {
    this.unfinished = unfinished;
    return this;
  }

  /**
   * Only include unfinished process instances. Value may only be `true`, as `false` is the default behavior.
   * @return unfinished
  */
  
  @Schema(name = "unfinished", description = "Only include unfinished process instances. Value may only be `true`, as `false` is the default behavior.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("unfinished")
  public Boolean getUnfinished() {
    return unfinished;
  }

  public void setUnfinished(Boolean unfinished) {
    this.unfinished = unfinished;
  }

  public HistoricProcessInstanceQueryDto withIncidents(Boolean withIncidents) {
    this.withIncidents = withIncidents;
    return this;
  }

  /**
   * Only include process instances which have an incident. Value may only be `true`, as `false` is the default behavior.
   * @return withIncidents
  */
  
  @Schema(name = "withIncidents", description = "Only include process instances which have an incident. Value may only be `true`, as `false` is the default behavior.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("withIncidents")
  public Boolean getWithIncidents() {
    return withIncidents;
  }

  public void setWithIncidents(Boolean withIncidents) {
    this.withIncidents = withIncidents;
  }

  public HistoricProcessInstanceQueryDto withRootIncidents(Boolean withRootIncidents) {
    this.withRootIncidents = withRootIncidents;
    return this;
  }

  /**
   * Only include process instances which have a root incident. Value may only be `true`, as `false` is the default behavior.
   * @return withRootIncidents
  */
  
  @Schema(name = "withRootIncidents", description = "Only include process instances which have a root incident. Value may only be `true`, as `false` is the default behavior.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("withRootIncidents")
  public Boolean getWithRootIncidents() {
    return withRootIncidents;
  }

  public void setWithRootIncidents(Boolean withRootIncidents) {
    this.withRootIncidents = withRootIncidents;
  }

  public HistoricProcessInstanceQueryDto incidentType(String incidentType) {
    this.incidentType = incidentType;
    return this;
  }

  /**
   * Filter by the incident type. See the [User Guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/incidents/#incident-types) for a list of incident types.
   * @return incidentType
  */
  
  @Schema(name = "incidentType", description = "Filter by the incident type. See the [User Guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/incidents/#incident-types) for a list of incident types.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("incidentType")
  public String getIncidentType() {
    return incidentType;
  }

  public void setIncidentType(String incidentType) {
    this.incidentType = incidentType;
  }

  public HistoricProcessInstanceQueryDto incidentStatus(IncidentStatusEnum incidentStatus) {
    this.incidentStatus = incidentStatus;
    return this;
  }

  /**
   * Only include process instances which have an incident in status either open or resolved. To get all process instances, use the query parameter withIncidents.
   * @return incidentStatus
  */
  
  @Schema(name = "incidentStatus", description = "Only include process instances which have an incident in status either open or resolved. To get all process instances, use the query parameter withIncidents.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("incidentStatus")
  public IncidentStatusEnum getIncidentStatus() {
    return incidentStatus;
  }

  public void setIncidentStatus(IncidentStatusEnum incidentStatus) {
    this.incidentStatus = incidentStatus;
  }

  public HistoricProcessInstanceQueryDto incidentMessage(String incidentMessage) {
    this.incidentMessage = incidentMessage;
    return this;
  }

  /**
   * Filter by the incident message. Exact match.
   * @return incidentMessage
  */
  
  @Schema(name = "incidentMessage", description = "Filter by the incident message. Exact match.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("incidentMessage")
  public String getIncidentMessage() {
    return incidentMessage;
  }

  public void setIncidentMessage(String incidentMessage) {
    this.incidentMessage = incidentMessage;
  }

  public HistoricProcessInstanceQueryDto incidentMessageLike(String incidentMessageLike) {
    this.incidentMessageLike = incidentMessageLike;
    return this;
  }

  /**
   * Filter by the incident message that the parameter is a substring of.
   * @return incidentMessageLike
  */
  
  @Schema(name = "incidentMessageLike", description = "Filter by the incident message that the parameter is a substring of.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("incidentMessageLike")
  public String getIncidentMessageLike() {
    return incidentMessageLike;
  }

  public void setIncidentMessageLike(String incidentMessageLike) {
    this.incidentMessageLike = incidentMessageLike;
  }

  public HistoricProcessInstanceQueryDto startedBefore(OffsetDateTime startedBefore) {
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

  public HistoricProcessInstanceQueryDto startedAfter(OffsetDateTime startedAfter) {
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

  public HistoricProcessInstanceQueryDto finishedBefore(OffsetDateTime finishedBefore) {
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

  public HistoricProcessInstanceQueryDto finishedAfter(OffsetDateTime finishedAfter) {
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

  public HistoricProcessInstanceQueryDto executedActivityAfter(OffsetDateTime executedActivityAfter) {
    this.executedActivityAfter = executedActivityAfter;
    return this;
  }

  /**
   * Restrict to instances that executed an activity after the given date (inclusive). By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.
   * @return executedActivityAfter
  */
  @Valid 
  @Schema(name = "executedActivityAfter", description = "Restrict to instances that executed an activity after the given date (inclusive). By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("executedActivityAfter")
  public OffsetDateTime getExecutedActivityAfter() {
    return executedActivityAfter;
  }

  public void setExecutedActivityAfter(OffsetDateTime executedActivityAfter) {
    this.executedActivityAfter = executedActivityAfter;
  }

  public HistoricProcessInstanceQueryDto executedActivityBefore(OffsetDateTime executedActivityBefore) {
    this.executedActivityBefore = executedActivityBefore;
    return this;
  }

  /**
   * Restrict to instances that executed an activity before the given date (inclusive). By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.
   * @return executedActivityBefore
  */
  @Valid 
  @Schema(name = "executedActivityBefore", description = "Restrict to instances that executed an activity before the given date (inclusive). By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("executedActivityBefore")
  public OffsetDateTime getExecutedActivityBefore() {
    return executedActivityBefore;
  }

  public void setExecutedActivityBefore(OffsetDateTime executedActivityBefore) {
    this.executedActivityBefore = executedActivityBefore;
  }

  public HistoricProcessInstanceQueryDto executedJobAfter(OffsetDateTime executedJobAfter) {
    this.executedJobAfter = executedJobAfter;
    return this;
  }

  /**
   * Restrict to instances that executed an job after the given date (inclusive). By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.
   * @return executedJobAfter
  */
  @Valid 
  @Schema(name = "executedJobAfter", description = "Restrict to instances that executed an job after the given date (inclusive). By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("executedJobAfter")
  public OffsetDateTime getExecutedJobAfter() {
    return executedJobAfter;
  }

  public void setExecutedJobAfter(OffsetDateTime executedJobAfter) {
    this.executedJobAfter = executedJobAfter;
  }

  public HistoricProcessInstanceQueryDto executedJobBefore(OffsetDateTime executedJobBefore) {
    this.executedJobBefore = executedJobBefore;
    return this;
  }

  /**
   * Restrict to instances that executed an job before the given date (inclusive). By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.
   * @return executedJobBefore
  */
  @Valid 
  @Schema(name = "executedJobBefore", description = "Restrict to instances that executed an job before the given date (inclusive). By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("executedJobBefore")
  public OffsetDateTime getExecutedJobBefore() {
    return executedJobBefore;
  }

  public void setExecutedJobBefore(OffsetDateTime executedJobBefore) {
    this.executedJobBefore = executedJobBefore;
  }

  public HistoricProcessInstanceQueryDto startedBy(String startedBy) {
    this.startedBy = startedBy;
    return this;
  }

  /**
   * Only include process instances that were started by the given user.
   * @return startedBy
  */
  
  @Schema(name = "startedBy", description = "Only include process instances that were started by the given user.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startedBy")
  public String getStartedBy() {
    return startedBy;
  }

  public void setStartedBy(String startedBy) {
    this.startedBy = startedBy;
  }

  public HistoricProcessInstanceQueryDto superProcessInstanceId(String superProcessInstanceId) {
    this.superProcessInstanceId = superProcessInstanceId;
    return this;
  }

  /**
   * Restrict query to all process instances that are sub process instances of the given process instance. Takes a process instance id.
   * @return superProcessInstanceId
  */
  
  @Schema(name = "superProcessInstanceId", description = "Restrict query to all process instances that are sub process instances of the given process instance. Takes a process instance id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("superProcessInstanceId")
  public String getSuperProcessInstanceId() {
    return superProcessInstanceId;
  }

  public void setSuperProcessInstanceId(String superProcessInstanceId) {
    this.superProcessInstanceId = superProcessInstanceId;
  }

  public HistoricProcessInstanceQueryDto subProcessInstanceId(String subProcessInstanceId) {
    this.subProcessInstanceId = subProcessInstanceId;
    return this;
  }

  /**
   * Restrict query to one process instance that has a sub process instance with the given id.
   * @return subProcessInstanceId
  */
  
  @Schema(name = "subProcessInstanceId", description = "Restrict query to one process instance that has a sub process instance with the given id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subProcessInstanceId")
  public String getSubProcessInstanceId() {
    return subProcessInstanceId;
  }

  public void setSubProcessInstanceId(String subProcessInstanceId) {
    this.subProcessInstanceId = subProcessInstanceId;
  }

  public HistoricProcessInstanceQueryDto superCaseInstanceId(String superCaseInstanceId) {
    this.superCaseInstanceId = superCaseInstanceId;
    return this;
  }

  /**
   * Restrict query to all process instances that are sub process instances of the given case instance. Takes a case instance id.
   * @return superCaseInstanceId
  */
  
  @Schema(name = "superCaseInstanceId", description = "Restrict query to all process instances that are sub process instances of the given case instance. Takes a case instance id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("superCaseInstanceId")
  public String getSuperCaseInstanceId() {
    return superCaseInstanceId;
  }

  public void setSuperCaseInstanceId(String superCaseInstanceId) {
    this.superCaseInstanceId = superCaseInstanceId;
  }

  public HistoricProcessInstanceQueryDto subCaseInstanceId(String subCaseInstanceId) {
    this.subCaseInstanceId = subCaseInstanceId;
    return this;
  }

  /**
   * Restrict query to one process instance that has a sub case instance with the given id.
   * @return subCaseInstanceId
  */
  
  @Schema(name = "subCaseInstanceId", description = "Restrict query to one process instance that has a sub case instance with the given id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subCaseInstanceId")
  public String getSubCaseInstanceId() {
    return subCaseInstanceId;
  }

  public void setSubCaseInstanceId(String subCaseInstanceId) {
    this.subCaseInstanceId = subCaseInstanceId;
  }

  public HistoricProcessInstanceQueryDto caseInstanceId(String caseInstanceId) {
    this.caseInstanceId = caseInstanceId;
    return this;
  }

  /**
   * Restrict query to all process instances that are sub process instances of the given case instance. Takes a case instance id.
   * @return caseInstanceId
  */
  
  @Schema(name = "caseInstanceId", description = "Restrict query to all process instances that are sub process instances of the given case instance. Takes a case instance id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("caseInstanceId")
  public String getCaseInstanceId() {
    return caseInstanceId;
  }

  public void setCaseInstanceId(String caseInstanceId) {
    this.caseInstanceId = caseInstanceId;
  }

  public HistoricProcessInstanceQueryDto tenantIdIn(List<String> tenantIdIn) {
    this.tenantIdIn = tenantIdIn;
    return this;
  }

  public HistoricProcessInstanceQueryDto addTenantIdInItem(String tenantIdInItem) {
    if (this.tenantIdIn == null) {
      this.tenantIdIn = new ArrayList<>();
    }
    this.tenantIdIn.add(tenantIdInItem);
    return this;
  }

  /**
   * Filter by a list of tenant ids. A process instance must have one of the given tenant ids. Must be a JSON array of `Strings`
   * @return tenantIdIn
  */
  
  @Schema(name = "tenantIdIn", description = "Filter by a list of tenant ids. A process instance must have one of the given tenant ids. Must be a JSON array of `Strings`", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tenantIdIn")
  public List<String> getTenantIdIn() {
    return tenantIdIn;
  }

  public void setTenantIdIn(List<String> tenantIdIn) {
    this.tenantIdIn = tenantIdIn;
  }

  public HistoricProcessInstanceQueryDto withoutTenantId(Boolean withoutTenantId) {
    this.withoutTenantId = withoutTenantId;
    return this;
  }

  /**
   * Only include historic process instances which belong to no tenant. Value may only be `true`, as `false` is the default behavior.
   * @return withoutTenantId
  */
  
  @Schema(name = "withoutTenantId", description = "Only include historic process instances which belong to no tenant. Value may only be `true`, as `false` is the default behavior.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("withoutTenantId")
  public Boolean getWithoutTenantId() {
    return withoutTenantId;
  }

  public void setWithoutTenantId(Boolean withoutTenantId) {
    this.withoutTenantId = withoutTenantId;
  }

  public HistoricProcessInstanceQueryDto executedActivityIdIn(List<String> executedActivityIdIn) {
    this.executedActivityIdIn = executedActivityIdIn;
    return this;
  }

  public HistoricProcessInstanceQueryDto addExecutedActivityIdInItem(String executedActivityIdInItem) {
    if (this.executedActivityIdIn == null) {
      this.executedActivityIdIn = new ArrayList<>();
    }
    this.executedActivityIdIn.add(executedActivityIdInItem);
    return this;
  }

  /**
   * Restrict to instances that executed an activity with one of given ids. Must be a JSON array of `Strings`
   * @return executedActivityIdIn
  */
  
  @Schema(name = "executedActivityIdIn", description = "Restrict to instances that executed an activity with one of given ids. Must be a JSON array of `Strings`", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("executedActivityIdIn")
  public List<String> getExecutedActivityIdIn() {
    return executedActivityIdIn;
  }

  public void setExecutedActivityIdIn(List<String> executedActivityIdIn) {
    this.executedActivityIdIn = executedActivityIdIn;
  }

  public HistoricProcessInstanceQueryDto activeActivityIdIn(List<String> activeActivityIdIn) {
    this.activeActivityIdIn = activeActivityIdIn;
    return this;
  }

  public HistoricProcessInstanceQueryDto addActiveActivityIdInItem(String activeActivityIdInItem) {
    if (this.activeActivityIdIn == null) {
      this.activeActivityIdIn = new ArrayList<>();
    }
    this.activeActivityIdIn.add(activeActivityIdInItem);
    return this;
  }

  /**
   * Restrict to instances that have an active activity with one of given ids. Must be a JSON array of `Strings`
   * @return activeActivityIdIn
  */
  
  @Schema(name = "activeActivityIdIn", description = "Restrict to instances that have an active activity with one of given ids. Must be a JSON array of `Strings`", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activeActivityIdIn")
  public List<String> getActiveActivityIdIn() {
    return activeActivityIdIn;
  }

  public void setActiveActivityIdIn(List<String> activeActivityIdIn) {
    this.activeActivityIdIn = activeActivityIdIn;
  }

  public HistoricProcessInstanceQueryDto active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Restrict to instances that are active.
   * @return active
  */
  
  @Schema(name = "active", description = "Restrict to instances that are active.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public HistoricProcessInstanceQueryDto suspended(Boolean suspended) {
    this.suspended = suspended;
    return this;
  }

  /**
   * Restrict to instances that are suspended.
   * @return suspended
  */
  
  @Schema(name = "suspended", description = "Restrict to instances that are suspended.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("suspended")
  public Boolean getSuspended() {
    return suspended;
  }

  public void setSuspended(Boolean suspended) {
    this.suspended = suspended;
  }

  public HistoricProcessInstanceQueryDto completed(Boolean completed) {
    this.completed = completed;
    return this;
  }

  /**
   * Restrict to instances that are completed.
   * @return completed
  */
  
  @Schema(name = "completed", description = "Restrict to instances that are completed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("completed")
  public Boolean getCompleted() {
    return completed;
  }

  public void setCompleted(Boolean completed) {
    this.completed = completed;
  }

  public HistoricProcessInstanceQueryDto externallyTerminated(Boolean externallyTerminated) {
    this.externallyTerminated = externallyTerminated;
    return this;
  }

  /**
   * Restrict to instances that are externallyTerminated.
   * @return externallyTerminated
  */
  
  @Schema(name = "externallyTerminated", description = "Restrict to instances that are externallyTerminated.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("externallyTerminated")
  public Boolean getExternallyTerminated() {
    return externallyTerminated;
  }

  public void setExternallyTerminated(Boolean externallyTerminated) {
    this.externallyTerminated = externallyTerminated;
  }

  public HistoricProcessInstanceQueryDto internallyTerminated(Boolean internallyTerminated) {
    this.internallyTerminated = internallyTerminated;
    return this;
  }

  /**
   * Restrict to instances that are internallyTerminated.
   * @return internallyTerminated
  */
  
  @Schema(name = "internallyTerminated", description = "Restrict to instances that are internallyTerminated.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("internallyTerminated")
  public Boolean getInternallyTerminated() {
    return internallyTerminated;
  }

  public void setInternallyTerminated(Boolean internallyTerminated) {
    this.internallyTerminated = internallyTerminated;
  }

  public HistoricProcessInstanceQueryDto variables(List<@Valid VariableQueryParameterDto> variables) {
    this.variables = variables;
    return this;
  }

  public HistoricProcessInstanceQueryDto addVariablesItem(VariableQueryParameterDto variablesItem) {
    if (this.variables == null) {
      this.variables = new ArrayList<>();
    }
    this.variables.add(variablesItem);
    return this;
  }

  /**
   * A JSON array to only include process instances that have/had variables with certain values. The array consists of objects with the three properties `name`, `operator` and `value`. `name` (`String`) is the variable name, `operator` (`String`) is the comparison operator to be used and `value` the variable value.  Value may be `String`, `Number` or `Boolean`.  Valid operator values are: `eq` - equal to; `neq` - not equal to; `gt` - greater than; `gteq` - greater than or equal to; `lt` - lower than; `lteq` - lower than or equal to; `like`. 
   * @return variables
  */
  @Valid 
  @Schema(name = "variables", description = "A JSON array to only include process instances that have/had variables with certain values. The array consists of objects with the three properties `name`, `operator` and `value`. `name` (`String`) is the variable name, `operator` (`String`) is the comparison operator to be used and `value` the variable value.  Value may be `String`, `Number` or `Boolean`.  Valid operator values are: `eq` - equal to; `neq` - not equal to; `gt` - greater than; `gteq` - greater than or equal to; `lt` - lower than; `lteq` - lower than or equal to; `like`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("variables")
  public List<@Valid VariableQueryParameterDto> getVariables() {
    return variables;
  }

  public void setVariables(List<@Valid VariableQueryParameterDto> variables) {
    this.variables = variables;
  }

  public HistoricProcessInstanceQueryDto variableNamesIgnoreCase(Boolean variableNamesIgnoreCase) {
    this.variableNamesIgnoreCase = variableNamesIgnoreCase;
    return this;
  }

  /**
   * Match all variable names provided in variables case-insensitively. If set to `true` variableName and variablename are treated as equal.
   * @return variableNamesIgnoreCase
  */
  
  @Schema(name = "variableNamesIgnoreCase", description = "Match all variable names provided in variables case-insensitively. If set to `true` variableName and variablename are treated as equal.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("variableNamesIgnoreCase")
  public Boolean getVariableNamesIgnoreCase() {
    return variableNamesIgnoreCase;
  }

  public void setVariableNamesIgnoreCase(Boolean variableNamesIgnoreCase) {
    this.variableNamesIgnoreCase = variableNamesIgnoreCase;
  }

  public HistoricProcessInstanceQueryDto variableValuesIgnoreCase(Boolean variableValuesIgnoreCase) {
    this.variableValuesIgnoreCase = variableValuesIgnoreCase;
    return this;
  }

  /**
   * Match all variable values provided in variables case-insensitively. If set to `true` variableValue and variablevalue are treated as equal.
   * @return variableValuesIgnoreCase
  */
  
  @Schema(name = "variableValuesIgnoreCase", description = "Match all variable values provided in variables case-insensitively. If set to `true` variableValue and variablevalue are treated as equal.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("variableValuesIgnoreCase")
  public Boolean getVariableValuesIgnoreCase() {
    return variableValuesIgnoreCase;
  }

  public void setVariableValuesIgnoreCase(Boolean variableValuesIgnoreCase) {
    this.variableValuesIgnoreCase = variableValuesIgnoreCase;
  }

  public HistoricProcessInstanceQueryDto orQueries(List<@Valid HistoricProcessInstanceQueryDto> orQueries) {
    this.orQueries = orQueries;
    return this;
  }

  public HistoricProcessInstanceQueryDto addOrQueriesItem(HistoricProcessInstanceQueryDto orQueriesItem) {
    if (this.orQueries == null) {
      this.orQueries = new ArrayList<>();
    }
    this.orQueries.add(orQueriesItem);
    return this;
  }

  /**
   * A JSON array of nested historic process instance queries with OR semantics.  A process instance matches a nested query if it fulfills at least one of the query's predicates.  With multiple nested queries, a process instance must fulfill at least one predicate of each query ([Conjunctive Normal Form](https://en.wikipedia.org/wiki/Conjunctive_normal_form)).  All process instance query properties can be used except for: `sorting`  See the [User Guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/process-engine-api/#or-queries) for more information about OR queries.
   * @return orQueries
  */
  @Valid 
  @Schema(name = "orQueries", description = "A JSON array of nested historic process instance queries with OR semantics.  A process instance matches a nested query if it fulfills at least one of the query's predicates.  With multiple nested queries, a process instance must fulfill at least one predicate of each query ([Conjunctive Normal Form](https://en.wikipedia.org/wiki/Conjunctive_normal_form)).  All process instance query properties can be used except for: `sorting`  See the [User Guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/process-engine-api/#or-queries) for more information about OR queries.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orQueries")
  public List<@Valid HistoricProcessInstanceQueryDto> getOrQueries() {
    return orQueries;
  }

  public void setOrQueries(List<@Valid HistoricProcessInstanceQueryDto> orQueries) {
    this.orQueries = orQueries;
  }

  public HistoricProcessInstanceQueryDto sorting(List<@Valid HistoricProcessInstanceQueryDtoSortingInner> sorting) {
    this.sorting = sorting;
    return this;
  }

  public HistoricProcessInstanceQueryDto addSortingItem(HistoricProcessInstanceQueryDtoSortingInner sortingItem) {
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
  public List<@Valid HistoricProcessInstanceQueryDtoSortingInner> getSorting() {
    return sorting;
  }

  public void setSorting(List<@Valid HistoricProcessInstanceQueryDtoSortingInner> sorting) {
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
    HistoricProcessInstanceQueryDto historicProcessInstanceQueryDto = (HistoricProcessInstanceQueryDto) o;
    return Objects.equals(this.processInstanceId, historicProcessInstanceQueryDto.processInstanceId) &&
        Objects.equals(this.processInstanceIds, historicProcessInstanceQueryDto.processInstanceIds) &&
        Objects.equals(this.processDefinitionId, historicProcessInstanceQueryDto.processDefinitionId) &&
        Objects.equals(this.processDefinitionKey, historicProcessInstanceQueryDto.processDefinitionKey) &&
        Objects.equals(this.processDefinitionKeyIn, historicProcessInstanceQueryDto.processDefinitionKeyIn) &&
        Objects.equals(this.processDefinitionName, historicProcessInstanceQueryDto.processDefinitionName) &&
        Objects.equals(this.processDefinitionNameLike, historicProcessInstanceQueryDto.processDefinitionNameLike) &&
        Objects.equals(this.processDefinitionKeyNotIn, historicProcessInstanceQueryDto.processDefinitionKeyNotIn) &&
        Objects.equals(this.processInstanceBusinessKey, historicProcessInstanceQueryDto.processInstanceBusinessKey) &&
        Objects.equals(this.processInstanceBusinessKeyIn, historicProcessInstanceQueryDto.processInstanceBusinessKeyIn) &&
        Objects.equals(this.processInstanceBusinessKeyLike, historicProcessInstanceQueryDto.processInstanceBusinessKeyLike) &&
        Objects.equals(this.rootProcessInstances, historicProcessInstanceQueryDto.rootProcessInstances) &&
        Objects.equals(this.finished, historicProcessInstanceQueryDto.finished) &&
        Objects.equals(this.unfinished, historicProcessInstanceQueryDto.unfinished) &&
        Objects.equals(this.withIncidents, historicProcessInstanceQueryDto.withIncidents) &&
        Objects.equals(this.withRootIncidents, historicProcessInstanceQueryDto.withRootIncidents) &&
        Objects.equals(this.incidentType, historicProcessInstanceQueryDto.incidentType) &&
        Objects.equals(this.incidentStatus, historicProcessInstanceQueryDto.incidentStatus) &&
        Objects.equals(this.incidentMessage, historicProcessInstanceQueryDto.incidentMessage) &&
        Objects.equals(this.incidentMessageLike, historicProcessInstanceQueryDto.incidentMessageLike) &&
        Objects.equals(this.startedBefore, historicProcessInstanceQueryDto.startedBefore) &&
        Objects.equals(this.startedAfter, historicProcessInstanceQueryDto.startedAfter) &&
        Objects.equals(this.finishedBefore, historicProcessInstanceQueryDto.finishedBefore) &&
        Objects.equals(this.finishedAfter, historicProcessInstanceQueryDto.finishedAfter) &&
        Objects.equals(this.executedActivityAfter, historicProcessInstanceQueryDto.executedActivityAfter) &&
        Objects.equals(this.executedActivityBefore, historicProcessInstanceQueryDto.executedActivityBefore) &&
        Objects.equals(this.executedJobAfter, historicProcessInstanceQueryDto.executedJobAfter) &&
        Objects.equals(this.executedJobBefore, historicProcessInstanceQueryDto.executedJobBefore) &&
        Objects.equals(this.startedBy, historicProcessInstanceQueryDto.startedBy) &&
        Objects.equals(this.superProcessInstanceId, historicProcessInstanceQueryDto.superProcessInstanceId) &&
        Objects.equals(this.subProcessInstanceId, historicProcessInstanceQueryDto.subProcessInstanceId) &&
        Objects.equals(this.superCaseInstanceId, historicProcessInstanceQueryDto.superCaseInstanceId) &&
        Objects.equals(this.subCaseInstanceId, historicProcessInstanceQueryDto.subCaseInstanceId) &&
        Objects.equals(this.caseInstanceId, historicProcessInstanceQueryDto.caseInstanceId) &&
        Objects.equals(this.tenantIdIn, historicProcessInstanceQueryDto.tenantIdIn) &&
        Objects.equals(this.withoutTenantId, historicProcessInstanceQueryDto.withoutTenantId) &&
        Objects.equals(this.executedActivityIdIn, historicProcessInstanceQueryDto.executedActivityIdIn) &&
        Objects.equals(this.activeActivityIdIn, historicProcessInstanceQueryDto.activeActivityIdIn) &&
        Objects.equals(this.active, historicProcessInstanceQueryDto.active) &&
        Objects.equals(this.suspended, historicProcessInstanceQueryDto.suspended) &&
        Objects.equals(this.completed, historicProcessInstanceQueryDto.completed) &&
        Objects.equals(this.externallyTerminated, historicProcessInstanceQueryDto.externallyTerminated) &&
        Objects.equals(this.internallyTerminated, historicProcessInstanceQueryDto.internallyTerminated) &&
        Objects.equals(this.variables, historicProcessInstanceQueryDto.variables) &&
        Objects.equals(this.variableNamesIgnoreCase, historicProcessInstanceQueryDto.variableNamesIgnoreCase) &&
        Objects.equals(this.variableValuesIgnoreCase, historicProcessInstanceQueryDto.variableValuesIgnoreCase) &&
        Objects.equals(this.orQueries, historicProcessInstanceQueryDto.orQueries) &&
        Objects.equals(this.sorting, historicProcessInstanceQueryDto.sorting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processInstanceId, processInstanceIds, processDefinitionId, processDefinitionKey, processDefinitionKeyIn, processDefinitionName, processDefinitionNameLike, processDefinitionKeyNotIn, processInstanceBusinessKey, processInstanceBusinessKeyIn, processInstanceBusinessKeyLike, rootProcessInstances, finished, unfinished, withIncidents, withRootIncidents, incidentType, incidentStatus, incidentMessage, incidentMessageLike, startedBefore, startedAfter, finishedBefore, finishedAfter, executedActivityAfter, executedActivityBefore, executedJobAfter, executedJobBefore, startedBy, superProcessInstanceId, subProcessInstanceId, superCaseInstanceId, subCaseInstanceId, caseInstanceId, tenantIdIn, withoutTenantId, executedActivityIdIn, activeActivityIdIn, active, suspended, completed, externallyTerminated, internallyTerminated, variables, variableNamesIgnoreCase, variableValuesIgnoreCase, orQueries, sorting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricProcessInstanceQueryDto {\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    processInstanceIds: ").append(toIndentedString(processInstanceIds)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    processDefinitionKeyIn: ").append(toIndentedString(processDefinitionKeyIn)).append("\n");
    sb.append("    processDefinitionName: ").append(toIndentedString(processDefinitionName)).append("\n");
    sb.append("    processDefinitionNameLike: ").append(toIndentedString(processDefinitionNameLike)).append("\n");
    sb.append("    processDefinitionKeyNotIn: ").append(toIndentedString(processDefinitionKeyNotIn)).append("\n");
    sb.append("    processInstanceBusinessKey: ").append(toIndentedString(processInstanceBusinessKey)).append("\n");
    sb.append("    processInstanceBusinessKeyIn: ").append(toIndentedString(processInstanceBusinessKeyIn)).append("\n");
    sb.append("    processInstanceBusinessKeyLike: ").append(toIndentedString(processInstanceBusinessKeyLike)).append("\n");
    sb.append("    rootProcessInstances: ").append(toIndentedString(rootProcessInstances)).append("\n");
    sb.append("    finished: ").append(toIndentedString(finished)).append("\n");
    sb.append("    unfinished: ").append(toIndentedString(unfinished)).append("\n");
    sb.append("    withIncidents: ").append(toIndentedString(withIncidents)).append("\n");
    sb.append("    withRootIncidents: ").append(toIndentedString(withRootIncidents)).append("\n");
    sb.append("    incidentType: ").append(toIndentedString(incidentType)).append("\n");
    sb.append("    incidentStatus: ").append(toIndentedString(incidentStatus)).append("\n");
    sb.append("    incidentMessage: ").append(toIndentedString(incidentMessage)).append("\n");
    sb.append("    incidentMessageLike: ").append(toIndentedString(incidentMessageLike)).append("\n");
    sb.append("    startedBefore: ").append(toIndentedString(startedBefore)).append("\n");
    sb.append("    startedAfter: ").append(toIndentedString(startedAfter)).append("\n");
    sb.append("    finishedBefore: ").append(toIndentedString(finishedBefore)).append("\n");
    sb.append("    finishedAfter: ").append(toIndentedString(finishedAfter)).append("\n");
    sb.append("    executedActivityAfter: ").append(toIndentedString(executedActivityAfter)).append("\n");
    sb.append("    executedActivityBefore: ").append(toIndentedString(executedActivityBefore)).append("\n");
    sb.append("    executedJobAfter: ").append(toIndentedString(executedJobAfter)).append("\n");
    sb.append("    executedJobBefore: ").append(toIndentedString(executedJobBefore)).append("\n");
    sb.append("    startedBy: ").append(toIndentedString(startedBy)).append("\n");
    sb.append("    superProcessInstanceId: ").append(toIndentedString(superProcessInstanceId)).append("\n");
    sb.append("    subProcessInstanceId: ").append(toIndentedString(subProcessInstanceId)).append("\n");
    sb.append("    superCaseInstanceId: ").append(toIndentedString(superCaseInstanceId)).append("\n");
    sb.append("    subCaseInstanceId: ").append(toIndentedString(subCaseInstanceId)).append("\n");
    sb.append("    caseInstanceId: ").append(toIndentedString(caseInstanceId)).append("\n");
    sb.append("    tenantIdIn: ").append(toIndentedString(tenantIdIn)).append("\n");
    sb.append("    withoutTenantId: ").append(toIndentedString(withoutTenantId)).append("\n");
    sb.append("    executedActivityIdIn: ").append(toIndentedString(executedActivityIdIn)).append("\n");
    sb.append("    activeActivityIdIn: ").append(toIndentedString(activeActivityIdIn)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    externallyTerminated: ").append(toIndentedString(externallyTerminated)).append("\n");
    sb.append("    internallyTerminated: ").append(toIndentedString(internallyTerminated)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    variableNamesIgnoreCase: ").append(toIndentedString(variableNamesIgnoreCase)).append("\n");
    sb.append("    variableValuesIgnoreCase: ").append(toIndentedString(variableValuesIgnoreCase)).append("\n");
    sb.append("    orQueries: ").append(toIndentedString(orQueries)).append("\n");
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

