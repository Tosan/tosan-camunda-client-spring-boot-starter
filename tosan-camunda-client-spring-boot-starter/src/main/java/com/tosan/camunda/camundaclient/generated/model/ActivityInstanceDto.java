package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tosan.camunda.camundaclient.generated.model.ActivityInstanceIncidentDto;
import com.tosan.camunda.camundaclient.generated.model.TransitionInstanceDto;
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

@Schema(name = "ActivityInstanceDto", description = "A JSON object corresponding to the Activity Instance tree of the given process instance.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class ActivityInstanceDto {

  private String id = null;

  private String parentActivityInstanceId = null;

  private String activityId = null;

  private String activityName = null;

  private String activityType = null;

  private String processInstanceId = null;

  private String processDefinitionId = null;

  @Valid
  private List<@Valid ActivityInstanceDto> childActivityInstances;

  @Valid
  private List<@Valid TransitionInstanceDto> childTransitionInstances;

  @Valid
  private List<String> executionIds;

  @Valid
  private List<String> incidentIds;

  @Valid
  private List<@Valid ActivityInstanceIncidentDto> incidents;

  public ActivityInstanceDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the activity instance.
   * @return id
  */
  
  @Schema(name = "id", description = "The id of the activity instance.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ActivityInstanceDto parentActivityInstanceId(String parentActivityInstanceId) {
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

  public ActivityInstanceDto activityId(String activityId) {
    this.activityId = activityId;
    return this;
  }

  /**
   * The id of the activity.
   * @return activityId
  */
  
  @Schema(name = "activityId", description = "The id of the activity.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activityId")
  public String getActivityId() {
    return activityId;
  }

  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }

  public ActivityInstanceDto activityName(String activityName) {
    this.activityName = activityName;
    return this;
  }

  /**
   * The name of the activity
   * @return activityName
  */
  
  @Schema(name = "activityName", description = "The name of the activity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activityName")
  public String getActivityName() {
    return activityName;
  }

  public void setActivityName(String activityName) {
    this.activityName = activityName;
  }

  public ActivityInstanceDto activityType(String activityType) {
    this.activityType = activityType;
    return this;
  }

  /**
   * The type of activity (corresponds to the XML element name in the BPMN 2.0, e.g., 'userTask')
   * @return activityType
  */
  
  @Schema(name = "activityType", description = "The type of activity (corresponds to the XML element name in the BPMN 2.0, e.g., 'userTask')", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activityType")
  public String getActivityType() {
    return activityType;
  }

  public void setActivityType(String activityType) {
    this.activityType = activityType;
  }

  public ActivityInstanceDto processInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
    return this;
  }

  /**
   * The id of the process instance this activity instance is part of.
   * @return processInstanceId
  */
  
  @Schema(name = "processInstanceId", description = "The id of the process instance this activity instance is part of.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processInstanceId")
  public String getProcessInstanceId() {
    return processInstanceId;
  }

  public void setProcessInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
  }

  public ActivityInstanceDto processDefinitionId(String processDefinitionId) {
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

  public ActivityInstanceDto childActivityInstances(List<@Valid ActivityInstanceDto> childActivityInstances) {
    this.childActivityInstances = childActivityInstances;
    return this;
  }

  public ActivityInstanceDto addChildActivityInstancesItem(ActivityInstanceDto childActivityInstancesItem) {
    if (this.childActivityInstances == null) {
      this.childActivityInstances = new ArrayList<>();
    }
    this.childActivityInstances.add(childActivityInstancesItem);
    return this;
  }

  /**
   * A list of child activity instances.
   * @return childActivityInstances
  */
  @Valid 
  @Schema(name = "childActivityInstances", description = "A list of child activity instances.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("childActivityInstances")
  public List<@Valid ActivityInstanceDto> getChildActivityInstances() {
    return childActivityInstances;
  }

  public void setChildActivityInstances(List<@Valid ActivityInstanceDto> childActivityInstances) {
    this.childActivityInstances = childActivityInstances;
  }

  public ActivityInstanceDto childTransitionInstances(List<@Valid TransitionInstanceDto> childTransitionInstances) {
    this.childTransitionInstances = childTransitionInstances;
    return this;
  }

  public ActivityInstanceDto addChildTransitionInstancesItem(TransitionInstanceDto childTransitionInstancesItem) {
    if (this.childTransitionInstances == null) {
      this.childTransitionInstances = new ArrayList<>();
    }
    this.childTransitionInstances.add(childTransitionInstancesItem);
    return this;
  }

  /**
   * A list of child transition instances. A transition instance represents an execution waiting in an asynchronous continuation.
   * @return childTransitionInstances
  */
  @Valid 
  @Schema(name = "childTransitionInstances", description = "A list of child transition instances. A transition instance represents an execution waiting in an asynchronous continuation.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("childTransitionInstances")
  public List<@Valid TransitionInstanceDto> getChildTransitionInstances() {
    return childTransitionInstances;
  }

  public void setChildTransitionInstances(List<@Valid TransitionInstanceDto> childTransitionInstances) {
    this.childTransitionInstances = childTransitionInstances;
  }

  public ActivityInstanceDto executionIds(List<String> executionIds) {
    this.executionIds = executionIds;
    return this;
  }

  public ActivityInstanceDto addExecutionIdsItem(String executionIdsItem) {
    if (this.executionIds == null) {
      this.executionIds = new ArrayList<>();
    }
    this.executionIds.add(executionIdsItem);
    return this;
  }

  /**
   * A list of execution ids.
   * @return executionIds
  */
  
  @Schema(name = "executionIds", description = "A list of execution ids.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("executionIds")
  public List<String> getExecutionIds() {
    return executionIds;
  }

  public void setExecutionIds(List<String> executionIds) {
    this.executionIds = executionIds;
  }

  public ActivityInstanceDto incidentIds(List<String> incidentIds) {
    this.incidentIds = incidentIds;
    return this;
  }

  public ActivityInstanceDto addIncidentIdsItem(String incidentIdsItem) {
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

  public ActivityInstanceDto incidents(List<@Valid ActivityInstanceIncidentDto> incidents) {
    this.incidents = incidents;
    return this;
  }

  public ActivityInstanceDto addIncidentsItem(ActivityInstanceIncidentDto incidentsItem) {
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
    ActivityInstanceDto activityInstanceDto = (ActivityInstanceDto) o;
    return Objects.equals(this.id, activityInstanceDto.id) &&
        Objects.equals(this.parentActivityInstanceId, activityInstanceDto.parentActivityInstanceId) &&
        Objects.equals(this.activityId, activityInstanceDto.activityId) &&
        Objects.equals(this.activityName, activityInstanceDto.activityName) &&
        Objects.equals(this.activityType, activityInstanceDto.activityType) &&
        Objects.equals(this.processInstanceId, activityInstanceDto.processInstanceId) &&
        Objects.equals(this.processDefinitionId, activityInstanceDto.processDefinitionId) &&
        Objects.equals(this.childActivityInstances, activityInstanceDto.childActivityInstances) &&
        Objects.equals(this.childTransitionInstances, activityInstanceDto.childTransitionInstances) &&
        Objects.equals(this.executionIds, activityInstanceDto.executionIds) &&
        Objects.equals(this.incidentIds, activityInstanceDto.incidentIds) &&
        Objects.equals(this.incidents, activityInstanceDto.incidents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parentActivityInstanceId, activityId, activityName, activityType, processInstanceId, processDefinitionId, childActivityInstances, childTransitionInstances, executionIds, incidentIds, incidents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityInstanceDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentActivityInstanceId: ").append(toIndentedString(parentActivityInstanceId)).append("\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    activityName: ").append(toIndentedString(activityName)).append("\n");
    sb.append("    activityType: ").append(toIndentedString(activityType)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    childActivityInstances: ").append(toIndentedString(childActivityInstances)).append("\n");
    sb.append("    childTransitionInstances: ").append(toIndentedString(childTransitionInstances)).append("\n");
    sb.append("    executionIds: ").append(toIndentedString(executionIds)).append("\n");
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

