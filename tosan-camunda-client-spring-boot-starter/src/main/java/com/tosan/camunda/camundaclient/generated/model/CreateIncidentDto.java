package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

/**
 * CreateIncidentDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class CreateIncidentDto   {
  @JsonProperty("incidentType")
  private String incidentType = null;

  @JsonProperty("configuration")
  private String _configuration = null;

  @JsonProperty("message")
  private String message = null;

  public CreateIncidentDto incidentType(String incidentType) {
    this.incidentType = incidentType;
    return this;
  }

  /**
   * A type of the new incident.
   * @return incidentType
   **/
  @Schema(description = "A type of the new incident.")
  
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
   **/
  @Schema(description = "A configuration for the new incident.")
  
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
   **/
  @Schema(description = "A message for the new incident.")
  
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
