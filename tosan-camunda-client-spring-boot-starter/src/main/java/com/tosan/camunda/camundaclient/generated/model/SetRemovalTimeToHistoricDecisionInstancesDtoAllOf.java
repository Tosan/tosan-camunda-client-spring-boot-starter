package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.tosan.camunda.camundaclient.generated.model.HistoricDecisionInstanceQueryDto;
import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * SetRemovalTimeToHistoricDecisionInstancesDtoAllOf
 */

@JsonTypeName("SetRemovalTimeToHistoricDecisionInstancesDto_allOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class SetRemovalTimeToHistoricDecisionInstancesDtoAllOf {

  private Boolean hierarchical = null;

  private HistoricDecisionInstanceQueryDto historicDecisionInstanceQuery;

  @Valid
  private List<String> historicDecisionInstanceIds;

  public SetRemovalTimeToHistoricDecisionInstancesDtoAllOf hierarchical(Boolean hierarchical) {
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

  public SetRemovalTimeToHistoricDecisionInstancesDtoAllOf historicDecisionInstanceQuery(HistoricDecisionInstanceQueryDto historicDecisionInstanceQuery) {
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

  public SetRemovalTimeToHistoricDecisionInstancesDtoAllOf historicDecisionInstanceIds(List<String> historicDecisionInstanceIds) {
    this.historicDecisionInstanceIds = historicDecisionInstanceIds;
    return this;
  }

  public SetRemovalTimeToHistoricDecisionInstancesDtoAllOf addHistoricDecisionInstanceIdsItem(String historicDecisionInstanceIdsItem) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetRemovalTimeToHistoricDecisionInstancesDtoAllOf setRemovalTimeToHistoricDecisionInstancesDtoAllOf = (SetRemovalTimeToHistoricDecisionInstancesDtoAllOf) o;
    return Objects.equals(this.hierarchical, setRemovalTimeToHistoricDecisionInstancesDtoAllOf.hierarchical) &&
        Objects.equals(this.historicDecisionInstanceQuery, setRemovalTimeToHistoricDecisionInstancesDtoAllOf.historicDecisionInstanceQuery) &&
        Objects.equals(this.historicDecisionInstanceIds, setRemovalTimeToHistoricDecisionInstancesDtoAllOf.historicDecisionInstanceIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hierarchical, historicDecisionInstanceQuery, historicDecisionInstanceIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetRemovalTimeToHistoricDecisionInstancesDtoAllOf {\n");
    sb.append("    hierarchical: ").append(toIndentedString(hierarchical)).append("\n");
    sb.append("    historicDecisionInstanceQuery: ").append(toIndentedString(historicDecisionInstanceQuery)).append("\n");
    sb.append("    historicDecisionInstanceIds: ").append(toIndentedString(historicDecisionInstanceIds)).append("\n");
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

