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
 * IncidentStatisticsResultDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class IncidentStatisticsResultDto {

  private String incidentType = null;

  private Integer incidentCount = null;

  public IncidentStatisticsResultDto incidentType(String incidentType) {
    this.incidentType = incidentType;
    return this;
  }

  /**
   * The type of the incident the number of incidents is aggregated for. See the [User Guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/incidents/#incident-types) for a list of incident types.
   * @return incidentType
  */
  
  @Schema(name = "incidentType", description = "The type of the incident the number of incidents is aggregated for. See the [User Guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/incidents/#incident-types) for a list of incident types.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("incidentType")
  public String getIncidentType() {
    return incidentType;
  }

  public void setIncidentType(String incidentType) {
    this.incidentType = incidentType;
  }

  public IncidentStatisticsResultDto incidentCount(Integer incidentCount) {
    this.incidentCount = incidentCount;
    return this;
  }

  /**
   * The total number of incidents for the corresponding incident type.
   * @return incidentCount
  */
  
  @Schema(name = "incidentCount", description = "The total number of incidents for the corresponding incident type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("incidentCount")
  public Integer getIncidentCount() {
    return incidentCount;
  }

  public void setIncidentCount(Integer incidentCount) {
    this.incidentCount = incidentCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentStatisticsResultDto incidentStatisticsResultDto = (IncidentStatisticsResultDto) o;
    return Objects.equals(this.incidentType, incidentStatisticsResultDto.incidentType) &&
        Objects.equals(this.incidentCount, incidentStatisticsResultDto.incidentCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(incidentType, incidentCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentStatisticsResultDto {\n");
    sb.append("    incidentType: ").append(toIndentedString(incidentType)).append("\n");
    sb.append("    incidentCount: ").append(toIndentedString(incidentCount)).append("\n");
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

