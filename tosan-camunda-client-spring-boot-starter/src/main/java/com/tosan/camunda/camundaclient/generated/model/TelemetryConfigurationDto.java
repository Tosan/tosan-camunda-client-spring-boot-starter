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
 * TelemetryConfigurationDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class TelemetryConfigurationDto {

  private Boolean enableTelemetry = null;

  public TelemetryConfigurationDto enableTelemetry(Boolean enableTelemetry) {
    this.enableTelemetry = enableTelemetry;
    return this;
  }

  /**
   * Specifies if the telemetry data should be sent or not.
   * @return enableTelemetry
  */
  
  @Schema(name = "enableTelemetry", description = "Specifies if the telemetry data should be sent or not.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enableTelemetry")
  public Boolean getEnableTelemetry() {
    return enableTelemetry;
  }

  public void setEnableTelemetry(Boolean enableTelemetry) {
    this.enableTelemetry = enableTelemetry;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TelemetryConfigurationDto telemetryConfigurationDto = (TelemetryConfigurationDto) o;
    return Objects.equals(this.enableTelemetry, telemetryConfigurationDto.enableTelemetry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableTelemetry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelemetryConfigurationDto {\n");
    sb.append("    enableTelemetry: ").append(toIndentedString(enableTelemetry)).append("\n");
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

