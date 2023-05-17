package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.HashMap;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;

/**
 * TelemetryProductDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class TelemetryProductDto   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("version")
  private String version = null;

  @JsonProperty("edition")
  private String edition = null;

  @JsonProperty("internals")
  @Valid
  private Map<String, TelemetryInternalsDto> internals = null;

  public TelemetryProductDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the product (i.e., Camunda BPM Runtime).
   * @return name
   **/
  @Schema(description = "The name of the product (i.e., Camunda BPM Runtime).")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TelemetryProductDto version(String version) {
    this.version = version;
    return this;
  }

  /**
   * The version of the process engine (i.e., 7.X.Y).
   * @return version
   **/
  @Schema(description = "The version of the process engine (i.e., 7.X.Y).")
  
    public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public TelemetryProductDto edition(String edition) {
    this.edition = edition;
    return this;
  }

  /**
   * The edition of the product (i.e., either community or enterprise).
   * @return edition
   **/
  @Schema(description = "The edition of the product (i.e., either community or enterprise).")
  
    public String getEdition() {
    return edition;
  }

  public void setEdition(String edition) {
    this.edition = edition;
  }

  public TelemetryProductDto internals(Map<String, TelemetryInternalsDto> internals) {
    this.internals = internals;
    return this;
  }

  public TelemetryProductDto putInternalsItem(String key, TelemetryInternalsDto internalsItem) {
    if (this.internals == null) {
      this.internals = new HashMap<>();
    }
    this.internals.put(key, internalsItem);
    return this;
  }

  /**
   * Internal data and metrics collected by the product.
   * @return internals
   **/
  @Schema(description = "Internal data and metrics collected by the product.")
      @Valid
    public Map<String, TelemetryInternalsDto> getInternals() {
    return internals;
  }

  public void setInternals(Map<String, TelemetryInternalsDto> internals) {
    this.internals = internals;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TelemetryProductDto telemetryProductDto = (TelemetryProductDto) o;
    return Objects.equals(this.name, telemetryProductDto.name) &&
        Objects.equals(this.version, telemetryProductDto.version) &&
        Objects.equals(this.edition, telemetryProductDto.edition) &&
        Objects.equals(this.internals, telemetryProductDto.internals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, version, edition, internals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelemetryProductDto {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    edition: ").append(toIndentedString(edition)).append("\n");
    sb.append("    internals: ").append(toIndentedString(internals)).append("\n");
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
