package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;

/**
 * HistoryCleanupConfigurationDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class HistoryCleanupConfigurationDto   {
  @JsonProperty("batchWindowStartTime")
  private OffsetDateTime batchWindowStartTime = null;

  @JsonProperty("batchWindowEndTime")
  private OffsetDateTime batchWindowEndTime = null;

  @JsonProperty("enabled")
  private Boolean enabled = null;

  public HistoryCleanupConfigurationDto batchWindowStartTime(OffsetDateTime batchWindowStartTime) {
    this.batchWindowStartTime = batchWindowStartTime;
    return this;
  }

  /**
   * Start time of the current or next batch window. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.
   * @return batchWindowStartTime
   **/
  @Schema(description = "Start time of the current or next batch window. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.")
  
    @Valid
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
   **/
  @Schema(description = "End time of the current or next batch window. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.")
  
    @Valid
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
   **/
  @Schema(description = "Indicates whether the engine node participates in history cleanup or not. The default is `true`. Participation can be disabled via [Process Engine Configuration](https://docs.camunda.org/manual/7.17/reference/deployment-descriptors/tags/process-engine/#history-cleanup-enabled).  For more details, see [Cleanup Execution Participation per Node](https://docs.camunda.org/manual/7.17/user-guide/process-engine/history/#cleanup-execution-participation-per-node).")
  
    public Boolean isEnabled() {
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
