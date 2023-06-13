package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * SetRemovalTimeToHistoricBatchesDtoAllOf
 */

@JsonTypeName("SetRemovalTimeToHistoricBatchesDto_allOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class SetRemovalTimeToHistoricBatchesDtoAllOf {

  private Object historicBatchQuery = null;

  @Valid
  private List<String> historicBatchIds;

  public SetRemovalTimeToHistoricBatchesDtoAllOf historicBatchQuery(Object historicBatchQuery) {
    this.historicBatchQuery = historicBatchQuery;
    return this;
  }

  /**
   * Query for the historic batches to set the removal time for.
   * @return historicBatchQuery
  */
  
  @Schema(name = "historicBatchQuery", description = "Query for the historic batches to set the removal time for.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("historicBatchQuery")
  public Object getHistoricBatchQuery() {
    return historicBatchQuery;
  }

  public void setHistoricBatchQuery(Object historicBatchQuery) {
    this.historicBatchQuery = historicBatchQuery;
  }

  public SetRemovalTimeToHistoricBatchesDtoAllOf historicBatchIds(List<String> historicBatchIds) {
    this.historicBatchIds = historicBatchIds;
    return this;
  }

  public SetRemovalTimeToHistoricBatchesDtoAllOf addHistoricBatchIdsItem(String historicBatchIdsItem) {
    if (this.historicBatchIds == null) {
      this.historicBatchIds = new ArrayList<>();
    }
    this.historicBatchIds.add(historicBatchIdsItem);
    return this;
  }

  /**
   * The ids of the historic batches to set the removal time for.
   * @return historicBatchIds
  */
  
  @Schema(name = "historicBatchIds", description = "The ids of the historic batches to set the removal time for.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("historicBatchIds")
  public List<String> getHistoricBatchIds() {
    return historicBatchIds;
  }

  public void setHistoricBatchIds(List<String> historicBatchIds) {
    this.historicBatchIds = historicBatchIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetRemovalTimeToHistoricBatchesDtoAllOf setRemovalTimeToHistoricBatchesDtoAllOf = (SetRemovalTimeToHistoricBatchesDtoAllOf) o;
    return Objects.equals(this.historicBatchQuery, setRemovalTimeToHistoricBatchesDtoAllOf.historicBatchQuery) &&
        Objects.equals(this.historicBatchIds, setRemovalTimeToHistoricBatchesDtoAllOf.historicBatchIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(historicBatchQuery, historicBatchIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetRemovalTimeToHistoricBatchesDtoAllOf {\n");
    sb.append("    historicBatchQuery: ").append(toIndentedString(historicBatchQuery)).append("\n");
    sb.append("    historicBatchIds: ").append(toIndentedString(historicBatchIds)).append("\n");
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

