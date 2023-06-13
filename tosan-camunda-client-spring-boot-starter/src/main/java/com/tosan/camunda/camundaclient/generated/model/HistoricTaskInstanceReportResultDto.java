package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * HistoricTaskInstanceReportResultDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class HistoricTaskInstanceReportResultDto {

  private String taskName = null;

  private Long count = null;

  private String processDefinitionKey = null;

  private String processDefinitionId = null;

  private String processDefinitionName = null;

  private Integer period = null;

  /**
   * The unit of the given period. Possible values are `MONTH` and `QUARTER`.  **Note:** This property is only set for a duration report object. In these cases, the value of the `reportType` query parameter is `duration`.
   */
  public enum PeriodUnitEnum {
    MONTH("MONTH"),
    
    QUARTER("QUARTER");

    private String value;

    PeriodUnitEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PeriodUnitEnum fromValue(String value) {
      for (PeriodUnitEnum b : PeriodUnitEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  private PeriodUnitEnum periodUnit = null;

  private Long minimum = null;

  private Long maximum = null;

  private Long average = null;

  public HistoricTaskInstanceReportResultDto taskName(String taskName) {
    this.taskName = taskName;
    return this;
  }

  /**
   * The name of the task. It is only available when the `groupBy` parameter is set to `taskName`. Else the value is `null`.  **Note:** This property is only set for a historic task report object. In these cases, the value of the `reportType` query parameter is `count`.
   * @return taskName
  */
  
  @Schema(name = "taskName", description = "The name of the task. It is only available when the `groupBy` parameter is set to `taskName`. Else the value is `null`.  **Note:** This property is only set for a historic task report object. In these cases, the value of the `reportType` query parameter is `count`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taskName")
  public String getTaskName() {
    return taskName;
  }

  public void setTaskName(String taskName) {
    this.taskName = taskName;
  }

  public HistoricTaskInstanceReportResultDto count(Long count) {
    this.count = count;
    return this;
  }

  /**
   * The number of tasks which have the given definition.  **Note:** This property is only set for a historic task report object. In these cases, the value of the `reportType` query parameter is `count`.
   * @return count
  */
  
  @Schema(name = "count", description = "The number of tasks which have the given definition.  **Note:** This property is only set for a historic task report object. In these cases, the value of the `reportType` query parameter is `count`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("count")
  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }

  public HistoricTaskInstanceReportResultDto processDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
    return this;
  }

  /**
   * The key of the process definition.  **Note:** This property is only set for a historic task report object. In these cases, the value of the `reportType` query parameter is `count`.
   * @return processDefinitionKey
  */
  
  @Schema(name = "processDefinitionKey", description = "The key of the process definition.  **Note:** This property is only set for a historic task report object. In these cases, the value of the `reportType` query parameter is `count`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionKey")
  public String getProcessDefinitionKey() {
    return processDefinitionKey;
  }

  public void setProcessDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
  }

  public HistoricTaskInstanceReportResultDto processDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
    return this;
  }

  /**
   * The id of the process definition.  **Note:** This property is only set for a historic task report object. In these cases, the value of the `reportType` query parameter is `count`.
   * @return processDefinitionId
  */
  
  @Schema(name = "processDefinitionId", description = "The id of the process definition.  **Note:** This property is only set for a historic task report object. In these cases, the value of the `reportType` query parameter is `count`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionId")
  public String getProcessDefinitionId() {
    return processDefinitionId;
  }

  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }

  public HistoricTaskInstanceReportResultDto processDefinitionName(String processDefinitionName) {
    this.processDefinitionName = processDefinitionName;
    return this;
  }

  /**
   * The name of the process definition.  **Note:** This property is only set for a historic task report object. In these cases, the value of the `reportType` query parameter is `count`.
   * @return processDefinitionName
  */
  
  @Schema(name = "processDefinitionName", description = "The name of the process definition.  **Note:** This property is only set for a historic task report object. In these cases, the value of the `reportType` query parameter is `count`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionName")
  public String getProcessDefinitionName() {
    return processDefinitionName;
  }

  public void setProcessDefinitionName(String processDefinitionName) {
    this.processDefinitionName = processDefinitionName;
  }

  public HistoricTaskInstanceReportResultDto period(Integer period) {
    this.period = period;
    return this;
  }

  /**
   * Specifies a span of time within a year. **Note:** The period must be interpreted in conjunction with the returned `periodUnit`.  **Note:** This property is only set for a duration report object. In these cases, the value of the `reportType` query parameter is `duration`.
   * @return period
  */
  
  @Schema(name = "period", description = "Specifies a span of time within a year. **Note:** The period must be interpreted in conjunction with the returned `periodUnit`.  **Note:** This property is only set for a duration report object. In these cases, the value of the `reportType` query parameter is `duration`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("period")
  public Integer getPeriod() {
    return period;
  }

  public void setPeriod(Integer period) {
    this.period = period;
  }

  public HistoricTaskInstanceReportResultDto periodUnit(PeriodUnitEnum periodUnit) {
    this.periodUnit = periodUnit;
    return this;
  }

  /**
   * The unit of the given period. Possible values are `MONTH` and `QUARTER`.  **Note:** This property is only set for a duration report object. In these cases, the value of the `reportType` query parameter is `duration`.
   * @return periodUnit
  */
  
  @Schema(name = "periodUnit", description = "The unit of the given period. Possible values are `MONTH` and `QUARTER`.  **Note:** This property is only set for a duration report object. In these cases, the value of the `reportType` query parameter is `duration`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("periodUnit")
  public PeriodUnitEnum getPeriodUnit() {
    return periodUnit;
  }

  public void setPeriodUnit(PeriodUnitEnum periodUnit) {
    this.periodUnit = periodUnit;
  }

  public HistoricTaskInstanceReportResultDto minimum(Long minimum) {
    this.minimum = minimum;
    return this;
  }

  /**
   * The smallest duration in milliseconds of all completed process instances which were started in the given period.  **Note:** This property is only set for a duration report object. In these cases, the value of the `reportType` query parameter is `duration`.
   * @return minimum
  */
  
  @Schema(name = "minimum", description = "The smallest duration in milliseconds of all completed process instances which were started in the given period.  **Note:** This property is only set for a duration report object. In these cases, the value of the `reportType` query parameter is `duration`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minimum")
  public Long getMinimum() {
    return minimum;
  }

  public void setMinimum(Long minimum) {
    this.minimum = minimum;
  }

  public HistoricTaskInstanceReportResultDto maximum(Long maximum) {
    this.maximum = maximum;
    return this;
  }

  /**
   * The greatest duration in milliseconds of all completed process instances which were started in the given period.  **Note:** This property is only set for a duration report object. In these cases, the value of the `reportType` query parameter is `duration`.
   * @return maximum
  */
  
  @Schema(name = "maximum", description = "The greatest duration in milliseconds of all completed process instances which were started in the given period.  **Note:** This property is only set for a duration report object. In these cases, the value of the `reportType` query parameter is `duration`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maximum")
  public Long getMaximum() {
    return maximum;
  }

  public void setMaximum(Long maximum) {
    this.maximum = maximum;
  }

  public HistoricTaskInstanceReportResultDto average(Long average) {
    this.average = average;
    return this;
  }

  /**
   * The average duration in milliseconds of all completed process instances which were started in the given period.  **Note:** This property is only set for a duration report object. In these cases, the value of the `reportType` query parameter is `duration`.
   * @return average
  */
  
  @Schema(name = "average", description = "The average duration in milliseconds of all completed process instances which were started in the given period.  **Note:** This property is only set for a duration report object. In these cases, the value of the `reportType` query parameter is `duration`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("average")
  public Long getAverage() {
    return average;
  }

  public void setAverage(Long average) {
    this.average = average;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricTaskInstanceReportResultDto historicTaskInstanceReportResultDto = (HistoricTaskInstanceReportResultDto) o;
    return Objects.equals(this.taskName, historicTaskInstanceReportResultDto.taskName) &&
        Objects.equals(this.count, historicTaskInstanceReportResultDto.count) &&
        Objects.equals(this.processDefinitionKey, historicTaskInstanceReportResultDto.processDefinitionKey) &&
        Objects.equals(this.processDefinitionId, historicTaskInstanceReportResultDto.processDefinitionId) &&
        Objects.equals(this.processDefinitionName, historicTaskInstanceReportResultDto.processDefinitionName) &&
        Objects.equals(this.period, historicTaskInstanceReportResultDto.period) &&
        Objects.equals(this.periodUnit, historicTaskInstanceReportResultDto.periodUnit) &&
        Objects.equals(this.minimum, historicTaskInstanceReportResultDto.minimum) &&
        Objects.equals(this.maximum, historicTaskInstanceReportResultDto.maximum) &&
        Objects.equals(this.average, historicTaskInstanceReportResultDto.average);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskName, count, processDefinitionKey, processDefinitionId, processDefinitionName, period, periodUnit, minimum, maximum, average);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricTaskInstanceReportResultDto {\n");
    sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionName: ").append(toIndentedString(processDefinitionName)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    periodUnit: ").append(toIndentedString(periodUnit)).append("\n");
    sb.append("    minimum: ").append(toIndentedString(minimum)).append("\n");
    sb.append("    maximum: ").append(toIndentedString(maximum)).append("\n");
    sb.append("    average: ").append(toIndentedString(average)).append("\n");
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

