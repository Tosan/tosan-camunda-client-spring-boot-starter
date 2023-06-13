package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tosan.camunda.camundaclient.generated.model.HistoricDecisionInstanceQueryDto;
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
 * SetRemovalTimeToHistoricDecisionInstancesDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class SetRemovalTimeToHistoricDecisionInstancesDto {

  private Boolean hierarchical = null;

  private HistoricDecisionInstanceQueryDto historicDecisionInstanceQuery;

  @Valid
  private List<String> historicDecisionInstanceIds;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime absoluteRemovalTime = null;

  private Boolean clearedRemovalTime = null;

  private Boolean calculatedRemovalTime = null;

  public SetRemovalTimeToHistoricDecisionInstancesDto hierarchical(Boolean hierarchical) {
    this.hierarchical = hierarchical;
    return this;
  }

  /**
   * Sets the removal time to all historic decision instances in the hierarchy. Value may only be `true`, as `false` is the default behavior.
   * @return hierarchical
  */
  
  @Schema(name = "hierarchical", description = "Sets the removal time to all historic decision instances in the hierarchy. Value may only be `true`, as `false` is the default behavior.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hierarchical")
  public Boolean getHierarchical() {
    return hierarchical;
  }

  public void setHierarchical(Boolean hierarchical) {
    this.hierarchical = hierarchical;
  }

  public SetRemovalTimeToHistoricDecisionInstancesDto historicDecisionInstanceQuery(HistoricDecisionInstanceQueryDto historicDecisionInstanceQuery) {
    this.historicDecisionInstanceQuery = historicDecisionInstanceQuery;
    return this;
  }

  /**
   * Get historicDecisionInstanceQuery
   * @return historicDecisionInstanceQuery
  */
  @Valid 
  @Schema(name = "historicDecisionInstanceQuery", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("historicDecisionInstanceQuery")
  public HistoricDecisionInstanceQueryDto getHistoricDecisionInstanceQuery() {
    return historicDecisionInstanceQuery;
  }

  public void setHistoricDecisionInstanceQuery(HistoricDecisionInstanceQueryDto historicDecisionInstanceQuery) {
    this.historicDecisionInstanceQuery = historicDecisionInstanceQuery;
  }

  public SetRemovalTimeToHistoricDecisionInstancesDto historicDecisionInstanceIds(List<String> historicDecisionInstanceIds) {
    this.historicDecisionInstanceIds = historicDecisionInstanceIds;
    return this;
  }

  public SetRemovalTimeToHistoricDecisionInstancesDto addHistoricDecisionInstanceIdsItem(String historicDecisionInstanceIdsItem) {
    if (this.historicDecisionInstanceIds == null) {
      this.historicDecisionInstanceIds = new ArrayList<>();
    }
    this.historicDecisionInstanceIds.add(historicDecisionInstanceIdsItem);
    return this;
  }

  /**
   * The ids of the historic decision instances to set the removal time for.
   * @return historicDecisionInstanceIds
  */
  
  @Schema(name = "historicDecisionInstanceIds", description = "The ids of the historic decision instances to set the removal time for.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("historicDecisionInstanceIds")
  public List<String> getHistoricDecisionInstanceIds() {
    return historicDecisionInstanceIds;
  }

  public void setHistoricDecisionInstanceIds(List<String> historicDecisionInstanceIds) {
    this.historicDecisionInstanceIds = historicDecisionInstanceIds;
  }

  public SetRemovalTimeToHistoricDecisionInstancesDto absoluteRemovalTime(OffsetDateTime absoluteRemovalTime) {
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

  public SetRemovalTimeToHistoricDecisionInstancesDto clearedRemovalTime(Boolean clearedRemovalTime) {
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

  public SetRemovalTimeToHistoricDecisionInstancesDto calculatedRemovalTime(Boolean calculatedRemovalTime) {
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
    SetRemovalTimeToHistoricDecisionInstancesDto setRemovalTimeToHistoricDecisionInstancesDto = (SetRemovalTimeToHistoricDecisionInstancesDto) o;
    return Objects.equals(this.hierarchical, setRemovalTimeToHistoricDecisionInstancesDto.hierarchical) &&
        Objects.equals(this.historicDecisionInstanceQuery, setRemovalTimeToHistoricDecisionInstancesDto.historicDecisionInstanceQuery) &&
        Objects.equals(this.historicDecisionInstanceIds, setRemovalTimeToHistoricDecisionInstancesDto.historicDecisionInstanceIds) &&
        Objects.equals(this.absoluteRemovalTime, setRemovalTimeToHistoricDecisionInstancesDto.absoluteRemovalTime) &&
        Objects.equals(this.clearedRemovalTime, setRemovalTimeToHistoricDecisionInstancesDto.clearedRemovalTime) &&
        Objects.equals(this.calculatedRemovalTime, setRemovalTimeToHistoricDecisionInstancesDto.calculatedRemovalTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hierarchical, historicDecisionInstanceQuery, historicDecisionInstanceIds, absoluteRemovalTime, clearedRemovalTime, calculatedRemovalTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetRemovalTimeToHistoricDecisionInstancesDto {\n");
    sb.append("    hierarchical: ").append(toIndentedString(hierarchical)).append("\n");
    sb.append("    historicDecisionInstanceQuery: ").append(toIndentedString(historicDecisionInstanceQuery)).append("\n");
    sb.append("    historicDecisionInstanceIds: ").append(toIndentedString(historicDecisionInstanceIds)).append("\n");
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

