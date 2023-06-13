package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * MetricsIntervalResultDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class MetricsIntervalResultDto {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime timestamp = null;

  private String name = null;

  private String reporter = null;

  private Long value = null;

  public MetricsIntervalResultDto timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * The interval timestamp.
   * @return timestamp
  */
  @Valid 
  @Schema(name = "timestamp", description = "The interval timestamp.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timestamp")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public MetricsIntervalResultDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the metric.
   * @return name
  */
  
  @Schema(name = "name", description = "The name of the metric.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MetricsIntervalResultDto reporter(String reporter) {
    this.reporter = reporter;
    return this;
  }

  /**
   * The reporter of the metric. `null` if the metrics are aggregated by reporter.
   * @return reporter
  */
  
  @Schema(name = "reporter", description = "The reporter of the metric. `null` if the metrics are aggregated by reporter.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reporter")
  public String getReporter() {
    return reporter;
  }

  public void setReporter(String reporter) {
    this.reporter = reporter;
  }

  public MetricsIntervalResultDto value(Long value) {
    this.value = value;
    return this;
  }

  /**
   * The value of the metric aggregated by the interval.
   * @return value
  */
  
  @Schema(name = "value", description = "The value of the metric aggregated by the interval.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public Long getValue() {
    return value;
  }

  public void setValue(Long value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricsIntervalResultDto metricsIntervalResultDto = (MetricsIntervalResultDto) o;
    return Objects.equals(this.timestamp, metricsIntervalResultDto.timestamp) &&
        Objects.equals(this.name, metricsIntervalResultDto.name) &&
        Objects.equals(this.reporter, metricsIntervalResultDto.reporter) &&
        Objects.equals(this.value, metricsIntervalResultDto.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, name, reporter, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricsIntervalResultDto {\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    reporter: ").append(toIndentedString(reporter)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

