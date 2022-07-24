package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

/**
 * DurationReportResultDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class DurationReportResultDto   {
  @JsonProperty("period")
  private Integer period = null;

  /**
   * The unit of the given period. Possible values are `MONTH` and `QUARTER`.
   */
  public enum PeriodUnitEnum {
    MONTH("MONTH"),
    
    QUARTER("QUARTER");

    private String value;

    PeriodUnitEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PeriodUnitEnum fromValue(String text) {
      for (PeriodUnitEnum b : PeriodUnitEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("periodUnit")
  private PeriodUnitEnum periodUnit = null;

  @JsonProperty("minimum")
  private Long minimum = null;

  @JsonProperty("maximum")
  private Long maximum = null;

  @JsonProperty("average")
  private Long average = null;

  public DurationReportResultDto period(Integer period) {
    this.period = period;
    return this;
  }

  /**
   * Specifies a timespan within a year. **Note:** The period must be interpreted in conjunction with the returned `periodUnit`.
   * @return period
   **/
  @Schema(description = "Specifies a timespan within a year. **Note:** The period must be interpreted in conjunction with the returned `periodUnit`.")
  
    public Integer getPeriod() {
    return period;
  }

  public void setPeriod(Integer period) {
    this.period = period;
  }

  public DurationReportResultDto periodUnit(PeriodUnitEnum periodUnit) {
    this.periodUnit = periodUnit;
    return this;
  }

  /**
   * The unit of the given period. Possible values are `MONTH` and `QUARTER`.
   * @return periodUnit
   **/
  @Schema(description = "The unit of the given period. Possible values are `MONTH` and `QUARTER`.")
  
    public PeriodUnitEnum getPeriodUnit() {
    return periodUnit;
  }

  public void setPeriodUnit(PeriodUnitEnum periodUnit) {
    this.periodUnit = periodUnit;
  }

  public DurationReportResultDto minimum(Long minimum) {
    this.minimum = minimum;
    return this;
  }

  /**
   * The smallest duration in milliseconds of all completed process instances which were started in the given period.
   * @return minimum
   **/
  @Schema(description = "The smallest duration in milliseconds of all completed process instances which were started in the given period.")
  
    public Long getMinimum() {
    return minimum;
  }

  public void setMinimum(Long minimum) {
    this.minimum = minimum;
  }

  public DurationReportResultDto maximum(Long maximum) {
    this.maximum = maximum;
    return this;
  }

  /**
   * The greatest duration in milliseconds of all completed process instances which were started in the given period.
   * @return maximum
   **/
  @Schema(description = "The greatest duration in milliseconds of all completed process instances which were started in the given period.")
  
    public Long getMaximum() {
    return maximum;
  }

  public void setMaximum(Long maximum) {
    this.maximum = maximum;
  }

  public DurationReportResultDto average(Long average) {
    this.average = average;
    return this;
  }

  /**
   * The average duration in milliseconds of all completed process instances which were started in the given period.
   * @return average
   **/
  @Schema(description = "The average duration in milliseconds of all completed process instances which were started in the given period.")
  
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
    DurationReportResultDto durationReportResultDto = (DurationReportResultDto) o;
    return Objects.equals(this.period, durationReportResultDto.period) &&
        Objects.equals(this.periodUnit, durationReportResultDto.periodUnit) &&
        Objects.equals(this.minimum, durationReportResultDto.minimum) &&
        Objects.equals(this.maximum, durationReportResultDto.maximum) &&
        Objects.equals(this.average, durationReportResultDto.average);
  }

  @Override
  public int hashCode() {
    return Objects.hash(period, periodUnit, minimum, maximum, average);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DurationReportResultDto {\n");
    
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
