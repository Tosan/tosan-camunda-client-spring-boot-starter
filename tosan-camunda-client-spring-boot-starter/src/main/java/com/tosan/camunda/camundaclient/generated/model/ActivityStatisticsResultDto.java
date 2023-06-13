package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tosan.camunda.camundaclient.generated.model.IncidentStatisticsResultDto;
import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ActivityStatisticsResultDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class ActivityStatisticsResultDto {

  private String id = null;

  private Integer instances;

  private Integer failedJobs;

  @Valid
  private List<@Valid IncidentStatisticsResultDto> incidents;

  public ActivityStatisticsResultDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the activity the results are aggregated for.
   * @return id
  */
  
  @Schema(name = "id", description = "The id of the activity the results are aggregated for.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ActivityStatisticsResultDto instances(Integer instances) {
    this.instances = instances;
    return this;
  }

  /**
   * The total number of running process instances of this activity.
   * @return instances
  */
  
  @Schema(name = "instances", description = "The total number of running process instances of this activity.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("instances")
  public Integer getInstances() {
    return instances;
  }

  public void setInstances(Integer instances) {
    this.instances = instances;
  }

  public ActivityStatisticsResultDto failedJobs(Integer failedJobs) {
    this.failedJobs = failedJobs;
    return this;
  }

  /**
   * The total number of failed jobs for the running instances. **Note**: Will be `0` (not `null`), if failed jobs were excluded.
   * @return failedJobs
  */
  
  @Schema(name = "failedJobs", description = "The total number of failed jobs for the running instances. **Note**: Will be `0` (not `null`), if failed jobs were excluded.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("failedJobs")
  public Integer getFailedJobs() {
    return failedJobs;
  }

  public void setFailedJobs(Integer failedJobs) {
    this.failedJobs = failedJobs;
  }

  public ActivityStatisticsResultDto incidents(List<@Valid IncidentStatisticsResultDto> incidents) {
    this.incidents = incidents;
    return this;
  }

  public ActivityStatisticsResultDto addIncidentsItem(IncidentStatisticsResultDto incidentsItem) {
    if (this.incidents == null) {
      this.incidents = new ArrayList<>();
    }
    this.incidents.add(incidentsItem);
    return this;
  }

  /**
   * Each item in the resulting array is an object which contains `incidentType` and `incidentCount`. **Note**: Will be an empty array, if `incidents` or `incidentsForType` were excluded. Furthermore, the array will be also empty if no incidents were found.
   * @return incidents
  */
  @Valid 
  @Schema(name = "incidents", description = "Each item in the resulting array is an object which contains `incidentType` and `incidentCount`. **Note**: Will be an empty array, if `incidents` or `incidentsForType` were excluded. Furthermore, the array will be also empty if no incidents were found.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("incidents")
  public List<@Valid IncidentStatisticsResultDto> getIncidents() {
    return incidents;
  }

  public void setIncidents(List<@Valid IncidentStatisticsResultDto> incidents) {
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
    ActivityStatisticsResultDto activityStatisticsResultDto = (ActivityStatisticsResultDto) o;
    return Objects.equals(this.id, activityStatisticsResultDto.id) &&
        Objects.equals(this.instances, activityStatisticsResultDto.instances) &&
        Objects.equals(this.failedJobs, activityStatisticsResultDto.failedJobs) &&
        Objects.equals(this.incidents, activityStatisticsResultDto.incidents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, instances, failedJobs, incidents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityStatisticsResultDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
    sb.append("    failedJobs: ").append(toIndentedString(failedJobs)).append("\n");
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

