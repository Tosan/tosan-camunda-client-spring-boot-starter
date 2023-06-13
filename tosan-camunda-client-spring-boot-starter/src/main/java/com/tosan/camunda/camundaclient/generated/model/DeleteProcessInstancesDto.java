package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tosan.camunda.camundaclient.generated.model.HistoricProcessInstanceQueryDto;
import com.tosan.camunda.camundaclient.generated.model.ProcessInstanceQueryDto;
import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DeleteProcessInstancesDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class DeleteProcessInstancesDto {

  @Valid
  private List<String> processInstanceIds;

  private String deleteReason = null;

  private Boolean skipCustomListeners = null;

  private Boolean skipSubprocesses = null;

  private ProcessInstanceQueryDto processInstanceQuery;

  private HistoricProcessInstanceQueryDto historicProcessInstanceQuery;

  public DeleteProcessInstancesDto processInstanceIds(List<String> processInstanceIds) {
    this.processInstanceIds = processInstanceIds;
    return this;
  }

  public DeleteProcessInstancesDto addProcessInstanceIdsItem(String processInstanceIdsItem) {
    if (this.processInstanceIds == null) {
      this.processInstanceIds = new ArrayList<>();
    }
    this.processInstanceIds.add(processInstanceIdsItem);
    return this;
  }

  /**
   * A list process instance ids to delete.
   * @return processInstanceIds
  */
  
  @Schema(name = "processInstanceIds", description = "A list process instance ids to delete.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processInstanceIds")
  public List<String> getProcessInstanceIds() {
    return processInstanceIds;
  }

  public void setProcessInstanceIds(List<String> processInstanceIds) {
    this.processInstanceIds = processInstanceIds;
  }

  public DeleteProcessInstancesDto deleteReason(String deleteReason) {
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

  public DeleteProcessInstancesDto skipCustomListeners(Boolean skipCustomListeners) {
    this.skipCustomListeners = skipCustomListeners;
    return this;
  }

  /**
   * Skip execution listener invocation for activities that are started or ended as part of this request.
   * @return skipCustomListeners
  */
  
  @Schema(name = "skipCustomListeners", description = "Skip execution listener invocation for activities that are started or ended as part of this request.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("skipCustomListeners")
  public Boolean getSkipCustomListeners() {
    return skipCustomListeners;
  }

  public void setSkipCustomListeners(Boolean skipCustomListeners) {
    this.skipCustomListeners = skipCustomListeners;
  }

  public DeleteProcessInstancesDto skipSubprocesses(Boolean skipSubprocesses) {
    this.skipSubprocesses = skipSubprocesses;
    return this;
  }

  /**
   * Skip deletion of the subprocesses related to deleted processes as part of this request.
   * @return skipSubprocesses
  */
  
  @Schema(name = "skipSubprocesses", description = "Skip deletion of the subprocesses related to deleted processes as part of this request.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("skipSubprocesses")
  public Boolean getSkipSubprocesses() {
    return skipSubprocesses;
  }

  public void setSkipSubprocesses(Boolean skipSubprocesses) {
    this.skipSubprocesses = skipSubprocesses;
  }

  public DeleteProcessInstancesDto processInstanceQuery(ProcessInstanceQueryDto processInstanceQuery) {
    this.processInstanceQuery = processInstanceQuery;
    return this;
  }

  /**
   * Get processInstanceQuery
   * @return processInstanceQuery
  */
  @Valid 
  @Schema(name = "processInstanceQuery", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processInstanceQuery")
  public ProcessInstanceQueryDto getProcessInstanceQuery() {
    return processInstanceQuery;
  }

  public void setProcessInstanceQuery(ProcessInstanceQueryDto processInstanceQuery) {
    this.processInstanceQuery = processInstanceQuery;
  }

  public DeleteProcessInstancesDto historicProcessInstanceQuery(HistoricProcessInstanceQueryDto historicProcessInstanceQuery) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteProcessInstancesDto deleteProcessInstancesDto = (DeleteProcessInstancesDto) o;
    return Objects.equals(this.processInstanceIds, deleteProcessInstancesDto.processInstanceIds) &&
        Objects.equals(this.deleteReason, deleteProcessInstancesDto.deleteReason) &&
        Objects.equals(this.skipCustomListeners, deleteProcessInstancesDto.skipCustomListeners) &&
        Objects.equals(this.skipSubprocesses, deleteProcessInstancesDto.skipSubprocesses) &&
        Objects.equals(this.processInstanceQuery, deleteProcessInstancesDto.processInstanceQuery) &&
        Objects.equals(this.historicProcessInstanceQuery, deleteProcessInstancesDto.historicProcessInstanceQuery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processInstanceIds, deleteReason, skipCustomListeners, skipSubprocesses, processInstanceQuery, historicProcessInstanceQuery);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteProcessInstancesDto {\n");
    sb.append("    processInstanceIds: ").append(toIndentedString(processInstanceIds)).append("\n");
    sb.append("    deleteReason: ").append(toIndentedString(deleteReason)).append("\n");
    sb.append("    skipCustomListeners: ").append(toIndentedString(skipCustomListeners)).append("\n");
    sb.append("    skipSubprocesses: ").append(toIndentedString(skipSubprocesses)).append("\n");
    sb.append("    processInstanceQuery: ").append(toIndentedString(processInstanceQuery)).append("\n");
    sb.append("    historicProcessInstanceQuery: ").append(toIndentedString(historicProcessInstanceQuery)).append("\n");
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

