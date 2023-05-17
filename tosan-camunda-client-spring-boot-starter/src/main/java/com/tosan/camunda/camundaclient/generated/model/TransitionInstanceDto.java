package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;

/**
 * A JSON object corresponding to the Activity Instance tree of the given process instance.
 */
@Schema(description = "A JSON object corresponding to the Activity Instance tree of the given process instance.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class TransitionInstanceDto   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("parentActivityInstanceId")
  private String parentActivityInstanceId = null;

  @JsonProperty("activityId")
  private String activityId = null;

  @JsonProperty("activityName")
  private String activityName = null;

  @JsonProperty("activityType")
  private String activityType = null;

  @JsonProperty("processInstanceId")
  private String processInstanceId = null;

  @JsonProperty("processDefinitionId")
  private String processDefinitionId = null;

  @JsonProperty("executionId")
  private String executionId = null;

  @JsonProperty("incidentIds")
  @Valid
  private List<String> incidentIds = null;

  @JsonProperty("incidents")
  @Valid
  private List<ActivityInstanceIncidentDto> incidents = null;

  public TransitionInstanceDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the transition instance.
   * @return id
   **/
  @Schema(description = "The id of the transition instance.")
  
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
   **/
  @Schema(description = "The id of the parent activity instance, for example a sub process instance.")
  
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
   **/
  @Schema(description = "The id of the activity that this instance enters (asyncBefore job) or leaves (asyncAfter job)")
  
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
   **/
  @Schema(description = "The name of the activity that this instance enters (asyncBefore job) or leaves (asyncAfter job)")
  
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
   **/
  @Schema(description = "The type of the activity that this instance enters (asyncBefore job) or leaves (asyncAfter job)")
  
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
   **/
  @Schema(description = "The id of the process instance this instance is part of.")
  
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
   **/
  @Schema(description = "The id of the process definition.")
  
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
   **/
  @Schema(description = "The execution id.")
  
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
   **/
  @Schema(description = "A list of incident ids.")
  
    public List<String> getIncidentIds() {
    return incidentIds;
  }

  public void setIncidentIds(List<String> incidentIds) {
    this.incidentIds = incidentIds;
  }

  public TransitionInstanceDto incidents(List<ActivityInstanceIncidentDto> incidents) {
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
   **/
  @Schema(description = "A list of JSON objects containing incident specific properties: * `id`: the id of the incident * `activityId`: the activity id in which the incident occurred")
      @Valid
    public List<ActivityInstanceIncidentDto> getIncidents() {
    return incidents;
  }

  public void setIncidents(List<ActivityInstanceIncidentDto> incidents) {
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
