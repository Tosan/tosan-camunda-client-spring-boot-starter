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
 * AbstractSetRemovalTimeDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class AbstractSetRemovalTimeDto {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime absoluteRemovalTime = null;

  private Boolean clearedRemovalTime = null;

  private Boolean calculatedRemovalTime = null;

  public AbstractSetRemovalTimeDto absoluteRemovalTime(OffsetDateTime absoluteRemovalTime) {
    this.absoluteRemovalTime = absoluteRemovalTime;
    return this;
  }

  /**
   * The date for which the instances shall be removed. Value may not be `null`.  **Note:** Cannot be set in conjunction with `clearedRemovalTime` or `calculatedRemovalTime`.
   * @return absoluteRemovalTime
  */
  @Valid 
  @Schema(name = "absoluteRemovalTime", description = "The date for which the instances shall be removed. Value may not be `null`.  **Note:** Cannot be set in conjunction with `clearedRemovalTime` or `calculatedRemovalTime`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("absoluteRemovalTime")
  public OffsetDateTime getAbsoluteRemovalTime() {
    return absoluteRemovalTime;
  }

  public void setAbsoluteRemovalTime(OffsetDateTime absoluteRemovalTime) {
    this.absoluteRemovalTime = absoluteRemovalTime;
  }

  public AbstractSetRemovalTimeDto clearedRemovalTime(Boolean clearedRemovalTime) {
    this.clearedRemovalTime = clearedRemovalTime;
    return this;
  }

  /**
   * Sets the removal time to `null`. Value may only be `true`, as `false` is the default behavior.  **Note:** Cannot be set in conjunction with `absoluteRemovalTime` or `calculatedRemovalTime`.
   * @return clearedRemovalTime
  */
  
  @Schema(name = "clearedRemovalTime", description = "Sets the removal time to `null`. Value may only be `true`, as `false` is the default behavior.  **Note:** Cannot be set in conjunction with `absoluteRemovalTime` or `calculatedRemovalTime`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clearedRemovalTime")
  public Boolean getClearedRemovalTime() {
    return clearedRemovalTime;
  }

  public void setClearedRemovalTime(Boolean clearedRemovalTime) {
    this.clearedRemovalTime = clearedRemovalTime;
  }

  public AbstractSetRemovalTimeDto calculatedRemovalTime(Boolean calculatedRemovalTime) {
    this.calculatedRemovalTime = calculatedRemovalTime;
    return this;
  }

  /**
   * The removal time is calculated based on the engine's configuration settings. Value may only be `true`, as `false` is the default behavior.  **Note:** Cannot be set in conjunction with `absoluteRemovalTime` or `clearedRemovalTime`.
   * @return calculatedRemovalTime
  */
  
  @Schema(name = "calculatedRemovalTime", description = "The removal time is calculated based on the engine's configuration settings. Value may only be `true`, as `false` is the default behavior.  **Note:** Cannot be set in conjunction with `absoluteRemovalTime` or `clearedRemovalTime`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("calculatedRemovalTime")
  public Boolean getCalculatedRemovalTime() {
    return calculatedRemovalTime;
  }

  public void setCalculatedRemovalTime(Boolean calculatedRemovalTime) {
    this.calculatedRemovalTime = calculatedRemovalTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbstractSetRemovalTimeDto abstractSetRemovalTimeDto = (AbstractSetRemovalTimeDto) o;
    return Objects.equals(this.absoluteRemovalTime, abstractSetRemovalTimeDto.absoluteRemovalTime) &&
        Objects.equals(this.clearedRemovalTime, abstractSetRemovalTimeDto.clearedRemovalTime) &&
        Objects.equals(this.calculatedRemovalTime, abstractSetRemovalTimeDto.calculatedRemovalTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(absoluteRemovalTime, clearedRemovalTime, calculatedRemovalTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbstractSetRemovalTimeDto {\n");
    sb.append("    absoluteRemovalTime: ").append(toIndentedString(absoluteRemovalTime)).append("\n");
    sb.append("    clearedRemovalTime: ").append(toIndentedString(clearedRemovalTime)).append("\n");
    sb.append("    calculatedRemovalTime: ").append(toIndentedString(calculatedRemovalTime)).append("\n");
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

