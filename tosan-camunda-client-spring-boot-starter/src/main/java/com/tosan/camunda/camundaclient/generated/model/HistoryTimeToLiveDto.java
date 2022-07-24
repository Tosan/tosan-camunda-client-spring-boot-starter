package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * HistoryTimeToLiveDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class HistoryTimeToLiveDto   {
  @JsonProperty("historyTimeToLive")
  private Integer historyTimeToLive = null;

  public HistoryTimeToLiveDto historyTimeToLive(Integer historyTimeToLive) {
    this.historyTimeToLive = historyTimeToLive;
    return this;
  }

  /**
   * New value for historyTimeToLive field of the definition. Can be `null`. Can not be negative.
   * minimum: 0
   * @return historyTimeToLive
   **/
  @Schema(description = "New value for historyTimeToLive field of the definition. Can be `null`. Can not be negative.")
  
  @Min(0)  public Integer getHistoryTimeToLive() {
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
