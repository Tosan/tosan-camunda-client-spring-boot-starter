package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

/**
 * An activity instance, incident pair.
 */
@Schema(description = "An activity instance, incident pair.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class ActivityInstanceIncidentDto   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("activityId")
  private String activityId = null;

  public ActivityInstanceIncidentDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the incident.
   * @return id
   **/
  @Schema(description = "The id of the incident.")
  
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
   **/
  @Schema(description = "The activity id in which the incident happened.")
  
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
