package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;

/**
 * SchemaLogEntryDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class SchemaLogEntryDto   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("timestamp")
  private OffsetDateTime timestamp = null;

  @JsonProperty("version")
  private String version = null;

  public SchemaLogEntryDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the schema log entry.
   * @return id
   **/
  @Schema(description = "The id of the schema log entry.")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SchemaLogEntryDto timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * The date and time of the schema update.
   * @return timestamp
   **/
  @Schema(description = "The date and time of the schema update.")
  
    @Valid
    public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public SchemaLogEntryDto version(String version) {
    this.version = version;
    return this;
  }

  /**
   * The version of the schema.
   * @return version
   **/
  @Schema(description = "The version of the schema.")
  
    public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchemaLogEntryDto schemaLogEntryDto = (SchemaLogEntryDto) o;
    return Objects.equals(this.id, schemaLogEntryDto.id) &&
        Objects.equals(this.timestamp, schemaLogEntryDto.timestamp) &&
        Objects.equals(this.version, schemaLogEntryDto.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, timestamp, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchemaLogEntryDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
