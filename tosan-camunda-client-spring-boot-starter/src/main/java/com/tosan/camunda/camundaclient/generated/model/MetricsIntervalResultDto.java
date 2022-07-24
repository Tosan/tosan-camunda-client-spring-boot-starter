package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * MetricsIntervalResultDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class MetricsIntervalResultDto   {
  @JsonProperty("timestamp")
  private OffsetDateTime timestamp = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("reporter")
  private String reporter = null;

  @JsonProperty("value")
  private Long value = null;

  public MetricsIntervalResultDto timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * The interval timestamp.
   * @return timestamp
   **/
  @Schema(description = "The interval timestamp.")
  
    @Valid
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
   **/
  @Schema(description = "The name of the metric.")
  
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
   **/
  @Schema(description = "The reporter of the metric. `null` if the metrics are aggregated by reporter.")
  
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
   **/
  @Schema(description = "The value of the metric aggregated by the interval.")
  
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
