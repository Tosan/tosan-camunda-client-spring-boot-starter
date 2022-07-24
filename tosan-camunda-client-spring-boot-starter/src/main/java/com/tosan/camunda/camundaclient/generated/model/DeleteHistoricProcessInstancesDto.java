package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * DeleteHistoricProcessInstancesDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class DeleteHistoricProcessInstancesDto   {
  @JsonProperty("historicProcessInstanceIds")
  @Valid
  private List<String> historicProcessInstanceIds = null;

  @JsonProperty("historicProcessInstanceQuery")
  private HistoricProcessInstanceQueryDto historicProcessInstanceQuery = null;

  @JsonProperty("deleteReason")
  private String deleteReason = null;

  @JsonProperty("failIfNotExists")
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
   **/
  @Schema(description = "A list historic process instance ids to delete.")
  
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
   **/
  @Schema(description = "")
  
    @Valid
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
   **/
  @Schema(description = "A string with delete reason.")
  
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
   **/
  @Schema(description = "If set to `false`, the request will still be successful if one ore more of the process ids are not found.")
  
    public Boolean isFailIfNotExists() {
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
