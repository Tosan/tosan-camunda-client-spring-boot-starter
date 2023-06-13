package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * An activity instance, incident pair.
 */

@Schema(name = "ActivityInstanceIncidentDto", description = "An activity instance, incident pair.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class ActivityInstanceIncidentDto {

  private String id = null;

  private String activityId = null;

  public ActivityInstanceIncidentDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the incident.
   * @return id
  */
  
  @Schema(name = "id", description = "The id of the incident.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ActivityInstanceIncidentDto activityId(String activityId) {
    this.activityId = activityId;
    return this;
  }

  /**
   * The activity id in which the incident happened.
   * @return activityId
  */
  
  @Schema(name = "activityId", description = "The activity id in which the incident happened.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activityId")
  public String getActivityId() {
    return activityId;
  }

  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityInstanceIncidentDto activityInstanceIncidentDto = (ActivityInstanceIncidentDto) o;
    return Objects.equals(this.id, activityInstanceIncidentDto.id) &&
        Objects.equals(this.activityId, activityInstanceIncidentDto.activityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, activityId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityInstanceIncidentDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
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

