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
 * HistoryCleanupConfigurationDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class HistoryCleanupConfigurationDto {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime batchWindowStartTime = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime batchWindowEndTime = null;

  private Boolean enabled = null;

  public HistoryCleanupConfigurationDto batchWindowStartTime(OffsetDateTime batchWindowStartTime) {
    this.batchWindowStartTime = batchWindowStartTime;
    return this;
  }

  /**
   * Start time of the current or next batch window. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.
   * @return batchWindowStartTime
  */
  @Valid 
  @Schema(name = "batchWindowStartTime", description = "Start time of the current or next batch window. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("batchWindowStartTime")
  public OffsetDateTime getBatchWindowStartTime() {
    return batchWindowStartTime;
  }

  public void setBatchWindowStartTime(OffsetDateTime batchWindowStartTime) {
    this.batchWindowStartTime = batchWindowStartTime;
  }

  public HistoryCleanupConfigurationDto batchWindowEndTime(OffsetDateTime batchWindowEndTime) {
    this.batchWindowEndTime = batchWindowEndTime;
    return this;
  }

  /**
   * End time of the current or next batch window. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.
   * @return batchWindowEndTime
  */
  @Valid 
  @Schema(name = "batchWindowEndTime", description = "End time of the current or next batch window. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("batchWindowEndTime")
  public OffsetDateTime getBatchWindowEndTime() {
    return batchWindowEndTime;
  }

  public void setBatchWindowEndTime(OffsetDateTime batchWindowEndTime) {
    this.batchWindowEndTime = batchWindowEndTime;
  }

  public HistoryCleanupConfigurationDto enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Indicates whether the engine node participates in history cleanup or not. The default is `true`. Participation can be disabled via [Process Engine Configuration](https://docs.camunda.org/manual/7.17/reference/deployment-descriptors/tags/process-engine/#history-cleanup-enabled).  For more details, see [Cleanup Execution Participation per Node](https://docs.camunda.org/manual/7.17/user-guide/process-engine/history/#cleanup-execution-participation-per-node).
   * @return enabled
  */
  
  @Schema(name = "enabled", description = "Indicates whether the engine node participates in history cleanup or not. The default is `true`. Participation can be disabled via [Process Engine Configuration](https://docs.camunda.org/manual/7.17/reference/deployment-descriptors/tags/process-engine/#history-cleanup-enabled).  For more details, see [Cleanup Execution Participation per Node](https://docs.camunda.org/manual/7.17/user-guide/process-engine/history/#cleanup-execution-participation-per-node).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoryCleanupConfigurationDto historyCleanupConfigurationDto = (HistoryCleanupConfigurationDto) o;
    return Objects.equals(this.batchWindowStartTime, historyCleanupConfigurationDto.batchWindowStartTime) &&
        Objects.equals(this.batchWindowEndTime, historyCleanupConfigurationDto.batchWindowEndTime) &&
        Objects.equals(this.enabled, historyCleanupConfigurationDto.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchWindowStartTime, batchWindowEndTime, enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoryCleanupConfigurationDto {\n");
    sb.append("    batchWindowStartTime: ").append(toIndentedString(batchWindowStartTime)).append("\n");
    sb.append("    batchWindowEndTime: ").append(toIndentedString(batchWindowEndTime)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

