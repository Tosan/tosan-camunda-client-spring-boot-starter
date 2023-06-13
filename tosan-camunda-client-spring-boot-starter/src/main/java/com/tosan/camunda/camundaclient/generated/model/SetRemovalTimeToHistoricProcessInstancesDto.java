package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tosan.camunda.camundaclient.generated.model.HistoricProcessInstanceQueryDto;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * SetRemovalTimeToHistoricProcessInstancesDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class SetRemovalTimeToHistoricProcessInstancesDto {

  @Valid
  private List<String> historicProcessInstanceIds;

  private HistoricProcessInstanceQueryDto historicProcessInstanceQuery;

  private Boolean hierarchical = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime absoluteRemovalTime = null;

  private Boolean clearedRemovalTime = null;

  private Boolean calculatedRemovalTime = null;

  public SetRemovalTimeToHistoricProcessInstancesDto historicProcessInstanceIds(List<String> historicProcessInstanceIds) {
    this.historicProcessInstanceIds = historicProcessInstanceIds;
    return this;
  }

  public SetRemovalTimeToHistoricProcessInstancesDto addHistoricProcessInstanceIdsItem(String historicProcessInstanceIdsItem) {
    if (this.historicProcessInstanceIds == null) {
      this.historicProcessInstanceIds = new ArrayList<>();
    }
    this.historicProcessInstanceIds.add(historicProcessInstanceIdsItem);
    return this;
  }

  /**
   * The id of the process instance.
   * @return historicProcessInstanceIds
  */
  
  @Schema(name = "historicProcessInstanceIds", description = "The id of the process instance.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("historicProcessInstanceIds")
  public List<String> getHistoricProcessInstanceIds() {
    return historicProcessInstanceIds;
  }

  public void setHistoricProcessInstanceIds(List<String> historicProcessInstanceIds) {
    this.historicProcessInstanceIds = historicProcessInstanceIds;
  }

  public SetRemovalTimeToHistoricProcessInstancesDto historicProcessInstanceQuery(HistoricProcessInstanceQueryDto historicProcessInstanceQuery) {
    this.historicProcessInstanceQuery = historicProcessInstanceQuery;
    return this;
  }

  /**
   * Get historicProcessInstanceQuery
   * @return historicProcessInstanceQuery
  */
  @Valid 
  @Schema(name = "historicProcessInstanceQuery", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("historicProcessInstanceQuery")
  public HistoricProcessInstanceQueryDto getHistoricProcessInstanceQuery() {
    return historicProcessInstanceQuery;
  }

  public void setHistoricProcessInstanceQuery(HistoricProcessInstanceQueryDto historicProcessInstanceQuery) {
    this.historicProcessInstanceQuery = historicProcessInstanceQuery;
  }

  public SetRemovalTimeToHistoricProcessInstancesDto hierarchical(Boolean hierarchical) {
    this.hierarchical = hierarchical;
    return this;
  }

  /**
   * Sets the removal time to all historic process instances in the hierarchy. Value may only be `true`, as `false` is the default behavior.
   * @return hierarchical
  */
  
  @Schema(name = "hierarchical", description = "Sets the removal time to all historic process instances in the hierarchy. Value may only be `true`, as `false` is the default behavior.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hierarchical")
  public Boolean getHierarchical() {
    return hierarchical;
  }

  public void setHierarchical(Boolean hierarchical) {
    this.hierarchical = hierarchical;
  }

  public SetRemovalTimeToHistoricProcessInstancesDto absoluteRemovalTime(OffsetDateTime absoluteRemovalTime) {
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

  public SetRemovalTimeToHistoricProcessInstancesDto clearedRemovalTime(Boolean clearedRemovalTime) {
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

  public SetRemovalTimeToHistoricProcessInstancesDto calculatedRemovalTime(Boolean calculatedRemovalTime) {
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
    SetRemovalTimeToHistoricProcessInstancesDto setRemovalTimeToHistoricProcessInstancesDto = (SetRemovalTimeToHistoricProcessInstancesDto) o;
    return Objects.equals(this.historicProcessInstanceIds, setRemovalTimeToHistoricProcessInstancesDto.historicProcessInstanceIds) &&
        Objects.equals(this.historicProcessInstanceQuery, setRemovalTimeToHistoricProcessInstancesDto.historicProcessInstanceQuery) &&
        Objects.equals(this.hierarchical, setRemovalTimeToHistoricProcessInstancesDto.hierarchical) &&
        Objects.equals(this.absoluteRemovalTime, setRemovalTimeToHistoricProcessInstancesDto.absoluteRemovalTime) &&
        Objects.equals(this.clearedRemovalTime, setRemovalTimeToHistoricProcessInstancesDto.clearedRemovalTime) &&
        Objects.equals(this.calculatedRemovalTime, setRemovalTimeToHistoricProcessInstancesDto.calculatedRemovalTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(historicProcessInstanceIds, historicProcessInstanceQuery, hierarchical, absoluteRemovalTime, clearedRemovalTime, calculatedRemovalTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetRemovalTimeToHistoricProcessInstancesDto {\n");
    sb.append("    historicProcessInstanceIds: ").append(toIndentedString(historicProcessInstanceIds)).append("\n");
    sb.append("    historicProcessInstanceQuery: ").append(toIndentedString(historicProcessInstanceQuery)).append("\n");
    sb.append("    hierarchical: ").append(toIndentedString(hierarchical)).append("\n");
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

