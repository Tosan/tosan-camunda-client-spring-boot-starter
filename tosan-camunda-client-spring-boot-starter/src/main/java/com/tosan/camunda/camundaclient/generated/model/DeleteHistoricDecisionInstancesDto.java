package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * DeleteHistoricDecisionInstancesDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class DeleteHistoricDecisionInstancesDto {

  @Valid
  private List<String> historicDecisionInstanceIds;

  private HistoricDecisionInstanceQueryDto historicDecisionInstanceQuery;

  private String deleteReason = null;

  public DeleteHistoricDecisionInstancesDto historicDecisionInstanceIds(List<String> historicDecisionInstanceIds) {
    this.historicDecisionInstanceIds = historicDecisionInstanceIds;
    return this;
  }

  public DeleteHistoricDecisionInstancesDto addHistoricDecisionInstanceIdsItem(String historicDecisionInstanceIdsItem) {
    if (this.historicDecisionInstanceIds == null) {
      this.historicDecisionInstanceIds = new ArrayList<>();
    }
    this.historicDecisionInstanceIds.add(historicDecisionInstanceIdsItem);
    return this;
  }

  /**
   * A list of historic decision instance ids to delete.
   * @return historicDecisionInstanceIds
  */
  
  @Schema(name = "historicDecisionInstanceIds", description = "A list of historic decision instance ids to delete.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("historicDecisionInstanceIds")
  public List<String> getHistoricDecisionInstanceIds() {
    return historicDecisionInstanceIds;
  }

  public void setHistoricDecisionInstanceIds(List<String> historicDecisionInstanceIds) {
    this.historicDecisionInstanceIds = historicDecisionInstanceIds;
  }

  public DeleteHistoricDecisionInstancesDto historicDecisionInstanceQuery(HistoricDecisionInstanceQueryDto historicDecisionInstanceQuery) {
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

  public DeleteHistoricDecisionInstancesDto deleteReason(String deleteReason) {
    this.deleteReason = deleteReason;
    return this;
  }

  /**
   * A string with delete reason.
   * @return deleteReason
  */
  
  @Schema(name = "deleteReason", description = "A string with delete reason.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deleteReason")
  public String getDeleteReason() {
    return deleteReason;
  }

  public void setDeleteReason(String deleteReason) {
    this.deleteReason = deleteReason;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteHistoricDecisionInstancesDto deleteHistoricDecisionInstancesDto = (DeleteHistoricDecisionInstancesDto) o;
    return Objects.equals(this.historicDecisionInstanceIds, deleteHistoricDecisionInstancesDto.historicDecisionInstanceIds) &&
        Objects.equals(this.historicDecisionInstanceQuery, deleteHistoricDecisionInstancesDto.historicDecisionInstanceQuery) &&
        Objects.equals(this.deleteReason, deleteHistoricDecisionInstancesDto.deleteReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(historicDecisionInstanceIds, historicDecisionInstanceQuery, deleteReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteHistoricDecisionInstancesDto {\n");
    sb.append("    historicDecisionInstanceIds: ").append(toIndentedString(historicDecisionInstanceIds)).append("\n");
    sb.append("    historicDecisionInstanceQuery: ").append(toIndentedString(historicDecisionInstanceQuery)).append("\n");
    sb.append("    deleteReason: ").append(toIndentedString(deleteReason)).append("\n");
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

