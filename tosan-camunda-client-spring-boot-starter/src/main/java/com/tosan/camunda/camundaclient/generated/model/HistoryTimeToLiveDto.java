package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * HistoryTimeToLiveDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class HistoryTimeToLiveDto {

  private Integer historyTimeToLive = null;

  public HistoryTimeToLiveDto historyTimeToLive(Integer historyTimeToLive) {
    this.historyTimeToLive = historyTimeToLive;
    return this;
  }

  /**
   * New value for historyTimeToLive field of the definition. Can be `null`. Can not be negative.
   * minimum: 0
   * @return historyTimeToLive
  */
  @Min(0) 
  @Schema(name = "historyTimeToLive", description = "New value for historyTimeToLive field of the definition. Can be `null`. Can not be negative.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("historyTimeToLive")
  public Integer getHistoryTimeToLive() {
    return historyTimeToLive;
  }

  public void setHistoryTimeToLive(Integer historyTimeToLive) {
    this.historyTimeToLive = historyTimeToLive;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoryTimeToLiveDto historyTimeToLiveDto = (HistoryTimeToLiveDto) o;
    return Objects.equals(this.historyTimeToLive, historyTimeToLiveDto.historyTimeToLive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(historyTimeToLive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoryTimeToLiveDto {\n");
    sb.append("    historyTimeToLive: ").append(toIndentedString(historyTimeToLive)).append("\n");
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

