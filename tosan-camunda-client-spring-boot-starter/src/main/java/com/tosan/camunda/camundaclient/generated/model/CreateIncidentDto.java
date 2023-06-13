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
 * CreateIncidentDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class CreateIncidentDto {

  private String incidentType = null;

  private String _configuration = null;

  private String message = null;

  public CreateIncidentDto incidentType(String incidentType) {
    this.incidentType = incidentType;
    return this;
  }

  /**
   * A type of the new incident.
   * @return incidentType
  */
  
  @Schema(name = "incidentType", description = "A type of the new incident.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("incidentType")
  public String getIncidentType() {
    return incidentType;
  }

  public void setIncidentType(String incidentType) {
    this.incidentType = incidentType;
  }

  public CreateIncidentDto _configuration(String _configuration) {
    this._configuration = _configuration;
    return this;
  }

  /**
   * A configuration for the new incident.
   * @return _configuration
  */
  
  @Schema(name = "configuration", description = "A configuration for the new incident.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("configuration")
  public String getConfiguration() {
    return _configuration;
  }

  public void setConfiguration(String _configuration) {
    this._configuration = _configuration;
  }

  public CreateIncidentDto message(String message) {
    this.message = message;
    return this;
  }

  /**
   * A message for the new incident.
   * @return message
  */
  
  @Schema(name = "message", description = "A message for the new incident.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateIncidentDto createIncidentDto = (CreateIncidentDto) o;
    return Objects.equals(this.incidentType, createIncidentDto.incidentType) &&
        Objects.equals(this._configuration, createIncidentDto._configuration) &&
        Objects.equals(this.message, createIncidentDto.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(incidentType, _configuration, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateIncidentDto {\n");
    sb.append("    incidentType: ").append(toIndentedString(incidentType)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

