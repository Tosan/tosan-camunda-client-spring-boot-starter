package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.tosan.camunda.camundaclient.generated.model.HistoricProcessInstanceQueryDto;
import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * SetRemovalTimeToHistoricProcessInstancesDtoAllOf
 */

@JsonTypeName("SetRemovalTimeToHistoricProcessInstancesDto_allOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class SetRemovalTimeToHistoricProcessInstancesDtoAllOf {

  @Valid
  private List<String> historicProcessInstanceIds;

  private HistoricProcessInstanceQueryDto historicProcessInstanceQuery;

  private Boolean hierarchical = null;

  public SetRemovalTimeToHistoricProcessInstancesDtoAllOf historicProcessInstanceIds(List<String> historicProcessInstanceIds) {
    this.historicProcessInstanceIds = historicProcessInstanceIds;
    return this;
  }

  public SetRemovalTimeToHistoricProcessInstancesDtoAllOf addHistoricProcessInstanceIdsItem(String historicProcessInstanceIdsItem) {
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

  public SetRemovalTimeToHistoricProcessInstancesDtoAllOf historicProcessInstanceQuery(HistoricProcessInstanceQueryDto historicProcessInstanceQuery) {
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

  public SetRemovalTimeToHistoricProcessInstancesDtoAllOf hierarchical(Boolean hierarchical) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetRemovalTimeToHistoricProcessInstancesDtoAllOf setRemovalTimeToHistoricProcessInstancesDtoAllOf = (SetRemovalTimeToHistoricProcessInstancesDtoAllOf) o;
    return Objects.equals(this.historicProcessInstanceIds, setRemovalTimeToHistoricProcessInstancesDtoAllOf.historicProcessInstanceIds) &&
        Objects.equals(this.historicProcessInstanceQuery, setRemovalTimeToHistoricProcessInstancesDtoAllOf.historicProcessInstanceQuery) &&
        Objects.equals(this.hierarchical, setRemovalTimeToHistoricProcessInstancesDtoAllOf.hierarchical);
  }

  @Override
  public int hashCode() {
    return Objects.hash(historicProcessInstanceIds, historicProcessInstanceQuery, hierarchical);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetRemovalTimeToHistoricProcessInstancesDtoAllOf {\n");
    sb.append("    historicProcessInstanceIds: ").append(toIndentedString(historicProcessInstanceIds)).append("\n");
    sb.append("    historicProcessInstanceQuery: ").append(toIndentedString(historicProcessInstanceQuery)).append("\n");
    sb.append("    hierarchical: ").append(toIndentedString(hierarchical)).append("\n");
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

