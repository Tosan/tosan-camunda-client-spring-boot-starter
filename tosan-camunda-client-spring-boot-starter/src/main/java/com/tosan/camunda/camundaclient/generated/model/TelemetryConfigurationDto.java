package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

/**
 * TelemetryConfigurationDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class TelemetryConfigurationDto   {
  @JsonProperty("enableTelemetry")
  private Boolean enableTelemetry = null;

  public TelemetryConfigurationDto enableTelemetry(Boolean enableTelemetry) {
    this.enableTelemetry = enableTelemetry;
    return this;
  }

  /**
   * Specifies if the telemetry data should be sent or not.
   * @return enableTelemetry
   **/
  @Schema(description = "Specifies if the telemetry data should be sent or not.")
  
    public Boolean isEnableTelemetry() {
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
