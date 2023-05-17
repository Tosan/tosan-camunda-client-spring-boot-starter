package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;

/**
 * DeleteHistoricDecisionInstancesDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class DeleteHistoricDecisionInstancesDto   {
  @JsonProperty("historicDecisionInstanceIds")
  @Valid
  private List<String> historicDecisionInstanceIds = null;

  @JsonProperty("historicDecisionInstanceQuery")
  private HistoricDecisionInstanceQueryDto historicDecisionInstanceQuery = null;

  @JsonProperty("deleteReason")
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
   **/
  @Schema(description = "A list of historic decision instance ids to delete.")
  
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
   **/
  @Schema(description = "")
  
    @Valid
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
   **/
  @Schema(description = "A string with delete reason.")
  
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
