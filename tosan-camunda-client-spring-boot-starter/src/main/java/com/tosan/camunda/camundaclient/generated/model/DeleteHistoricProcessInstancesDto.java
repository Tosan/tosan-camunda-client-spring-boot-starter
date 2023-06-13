package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * DeleteHistoricProcessInstancesDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class DeleteHistoricProcessInstancesDto {

  @Valid
  private List<String> historicProcessInstanceIds;

  private HistoricProcessInstanceQueryDto historicProcessInstanceQuery;

  private String deleteReason = null;

  private Boolean failIfNotExists = null;

  public DeleteHistoricProcessInstancesDto historicProcessInstanceIds(List<String> historicProcessInstanceIds) {
    this.historicProcessInstanceIds = historicProcessInstanceIds;
    return this;
  }

  public DeleteHistoricProcessInstancesDto addHistoricProcessInstanceIdsItem(String historicProcessInstanceIdsItem) {
    if (this.historicProcessInstanceIds == null) {
      this.historicProcessInstanceIds = new ArrayList<>();
    }
    this.historicProcessInstanceIds.add(historicProcessInstanceIdsItem);
    return this;
  }

  /**
   * A list historic process instance ids to delete.
   * @return historicProcessInstanceIds
  */
  
  @Schema(name = "historicProcessInstanceIds", description = "A list historic process instance ids to delete.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("historicProcessInstanceIds")
  public List<String> getHistoricProcessInstanceIds() {
    return historicProcessInstanceIds;
  }

  public void setHistoricProcessInstanceIds(List<String> historicProcessInstanceIds) {
    this.historicProcessInstanceIds = historicProcessInstanceIds;
  }

  public DeleteHistoricProcessInstancesDto historicProcessInstanceQuery(HistoricProcessInstanceQueryDto historicProcessInstanceQuery) {
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

  public DeleteHistoricProcessInstancesDto deleteReason(String deleteReason) {
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

  public DeleteHistoricProcessInstancesDto failIfNotExists(Boolean failIfNotExists) {
    this.failIfNotExists = failIfNotExists;
    return this;
  }

  /**
   * If set to `false`, the request will still be successful if one ore more of the process ids are not found.
   * @return failIfNotExists
  */
  
  @Schema(name = "failIfNotExists", description = "If set to `false`, the request will still be successful if one ore more of the process ids are not found.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("failIfNotExists")
  public Boolean getFailIfNotExists() {
    return failIfNotExists;
  }

  public void setFailIfNotExists(Boolean failIfNotExists) {
    this.failIfNotExists = failIfNotExists;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteHistoricProcessInstancesDto deleteHistoricProcessInstancesDto = (DeleteHistoricProcessInstancesDto) o;
    return Objects.equals(this.historicProcessInstanceIds, deleteHistoricProcessInstancesDto.historicProcessInstanceIds) &&
        Objects.equals(this.historicProcessInstanceQuery, deleteHistoricProcessInstancesDto.historicProcessInstanceQuery) &&
        Objects.equals(this.deleteReason, deleteHistoricProcessInstancesDto.deleteReason) &&
        Objects.equals(this.failIfNotExists, deleteHistoricProcessInstancesDto.failIfNotExists);
  }

  @Override
  public int hashCode() {
    return Objects.hash(historicProcessInstanceIds, historicProcessInstanceQuery, deleteReason, failIfNotExists);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteHistoricProcessInstancesDto {\n");
    sb.append("    historicProcessInstanceIds: ").append(toIndentedString(historicProcessInstanceIds)).append("\n");
    sb.append("    historicProcessInstanceQuery: ").append(toIndentedString(historicProcessInstanceQuery)).append("\n");
    sb.append("    deleteReason: ").append(toIndentedString(deleteReason)).append("\n");
    sb.append("    failIfNotExists: ").append(toIndentedString(failIfNotExists)).append("\n");
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

