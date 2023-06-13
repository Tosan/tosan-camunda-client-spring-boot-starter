package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tosan.camunda.camundaclient.generated.model.ActivityInstanceIncidentDto;
import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * A JSON object corresponding to the Activity Instance tree of the given process instance.
 */

@Schema(name = "TransitionInstanceDto", description = "A JSON object corresponding to the Activity Instance tree of the given process instance.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class TransitionInstanceDto {

  private String id = null;

  private String parentActivityInstanceId = null;

  private String activityId = null;

  private String activityName = null;

  private String activityType = null;

  private String processInstanceId = null;

  private String processDefinitionId = null;

  private String executionId = null;

  @Valid
  private List<String> incidentIds;

  @Valid
  private List<@Valid ActivityInstanceIncidentDto> incidents;

  public TransitionInstanceDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the transition instance.
   * @return id
  */
  
  @Schema(name = "id", description = "The id of the transition instance.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TransitionInstanceDto parentActivityInstanceId(String parentActivityInstanceId) {
    this.parentActivityInstanceId = parentActivityInstanceId;
    return this;
  }

  /**
   * The id of the parent activity instance, for example a sub process instance.
   * @return parentActivityInstanceId
  */
  
  @Schema(name = "parentActivityInstanceId", description = "The id of the parent activity instance, for example a sub process instance.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parentActivityInstanceId")
  public String getParentActivityInstanceId() {
    return parentActivityInstanceId;
  }

  public void setParentActivityInstanceId(String parentActivityInstanceId) {
    this.parentActivityInstanceId = parentActivityInstanceId;
  }

  public TransitionInstanceDto activityId(String activityId) {
    this.activityId = activityId;
    return this;
  }

  /**
   * The id of the activity that this instance enters (asyncBefore job) or leaves (asyncAfter job)
   * @return activityId
  */
  
  @Schema(name = "activityId", description = "The id of the activity that this instance enters (asyncBefore job) or leaves (asyncAfter job)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activityId")
  public String getActivityId() {
    return activityId;
  }

  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }

  public TransitionInstanceDto activityName(String activityName) {
    this.activityName = activityName;
    return this;
  }

  /**
   * The name of the activity that this instance enters (asyncBefore job) or leaves (asyncAfter job)
   * @return activityName
  */
  
  @Schema(name = "activityName", description = "The name of the activity that this instance enters (asyncBefore job) or leaves (asyncAfter job)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activityName")
  public String getActivityName() {
    return activityName;
  }

  public void setActivityName(String activityName) {
    this.activityName = activityName;
  }

  public TransitionInstanceDto activityType(String activityType) {
    this.activityType = activityType;
    return this;
  }

  /**
   * The type of the activity that this instance enters (asyncBefore job) or leaves (asyncAfter job)
   * @return activityType
  */
  
  @Schema(name = "activityType", description = "The type of the activity that this instance enters (asyncBefore job) or leaves (asyncAfter job)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activityType")
  public String getActivityType() {
    return activityType;
  }

  public void setActivityType(String activityType) {
    this.activityType = activityType;
  }

  public TransitionInstanceDto processInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
    return this;
  }

  /**
   * The id of the process instance this instance is part of.
   * @return processInstanceId
  */
  
  @Schema(name = "processInstanceId", description = "The id of the process instance this instance is part of.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processInstanceId")
  public String getProcessInstanceId() {
    return processInstanceId;
  }

  public void setProcessInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
  }

  public TransitionInstanceDto processDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
    return this;
  }

  /**
   * The id of the process definition.
   * @return processDefinitionId
  */
  
  @Schema(name = "processDefinitionId", description = "The id of the process definition.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionId")
  public String getProcessDefinitionId() {
    return processDefinitionId;
  }

  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }

  public TransitionInstanceDto executionId(String executionId) {
    this.executionId = executionId;
    return this;
  }

  /**
   * The execution id.
   * @return executionId
  */
  
  @Schema(name = "executionId", description = "The execution id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("executionId")
  public String getExecutionId() {
    return executionId;
  }

  public void setExecutionId(String executionId) {
    this.executionId = executionId;
  }

  public TransitionInstanceDto incidentIds(List<String> incidentIds) {
    this.incidentIds = incidentIds;
    return this;
  }

  public TransitionInstanceDto addIncidentIdsItem(String incidentIdsItem) {
    if (this.incidentIds == null) {
      this.incidentIds = new ArrayList<>();
    }
    this.incidentIds.add(incidentIdsItem);
    return this;
  }

  /**
   * A list of incident ids.
   * @return incidentIds
  */
  
  @Schema(name = "incidentIds", description = "A list of incident ids.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("incidentIds")
  public List<String> getIncidentIds() {
    return incidentIds;
  }

  public void setIncidentIds(List<String> incidentIds) {
    this.incidentIds = incidentIds;
  }

  public TransitionInstanceDto incidents(List<@Valid ActivityInstanceIncidentDto> incidents) {
    this.incidents = incidents;
    return this;
  }

  public TransitionInstanceDto addIncidentsItem(ActivityInstanceIncidentDto incidentsItem) {
    if (this.incidents == null) {
      this.incidents = new ArrayList<>();
    }
    this.incidents.add(incidentsItem);
    return this;
  }

  /**
   * A list of JSON objects containing incident specific properties: * `id`: the id of the incident * `activityId`: the activity id in which the incident occurred
   * @return incidents
  */
  @Valid 
  @Schema(name = "incidents", description = "A list of JSON objects containing incident specific properties: * `id`: the id of the incident * `activityId`: the activity id in which the incident occurred", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("incidents")
  public List<@Valid ActivityInstanceIncidentDto> getIncidents() {
    return incidents;
  }

  public void setIncidents(List<@Valid ActivityInstanceIncidentDto> incidents) {
    this.incidents = incidents;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransitionInstanceDto transitionInstanceDto = (TransitionInstanceDto) o;
    return Objects.equals(this.id, transitionInstanceDto.id) &&
        Objects.equals(this.parentActivityInstanceId, transitionInstanceDto.parentActivityInstanceId) &&
        Objects.equals(this.activityId, transitionInstanceDto.activityId) &&
        Objects.equals(this.activityName, transitionInstanceDto.activityName) &&
        Objects.equals(this.activityType, transitionInstanceDto.activityType) &&
        Objects.equals(this.processInstanceId, transitionInstanceDto.processInstanceId) &&
        Objects.equals(this.processDefinitionId, transitionInstanceDto.processDefinitionId) &&
        Objects.equals(this.executionId, transitionInstanceDto.executionId) &&
        Objects.equals(this.incidentIds, transitionInstanceDto.incidentIds) &&
        Objects.equals(this.incidents, transitionInstanceDto.incidents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parentActivityInstanceId, activityId, activityName, activityType, processInstanceId, processDefinitionId, executionId, incidentIds, incidents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransitionInstanceDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentActivityInstanceId: ").append(toIndentedString(parentActivityInstanceId)).append("\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    activityName: ").append(toIndentedString(activityName)).append("\n");
    sb.append("    activityType: ").append(toIndentedString(activityType)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
    sb.append("    incidentIds: ").append(toIndentedString(incidentIds)).append("\n");
    sb.append("    incidents: ").append(toIndentedString(incidents)).append("\n");
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

