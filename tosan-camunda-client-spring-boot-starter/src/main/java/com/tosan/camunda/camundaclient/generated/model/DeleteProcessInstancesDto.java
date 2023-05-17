package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;

/**
 * DeleteProcessInstancesDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class DeleteProcessInstancesDto   {
  @JsonProperty("processInstanceIds")
  @Valid
  private List<String> processInstanceIds = null;

  @JsonProperty("deleteReason")
  private String deleteReason = null;

  @JsonProperty("skipCustomListeners")
  private Boolean skipCustomListeners = null;

  @JsonProperty("skipSubprocesses")
  private Boolean skipSubprocesses = null;

  @JsonProperty("processInstanceQuery")
  private ProcessInstanceQueryDto processInstanceQuery = null;

  @JsonProperty("historicProcessInstanceQuery")
  private HistoricProcessInstanceQueryDto historicProcessInstanceQuery = null;

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
   **/
  @Schema(description = "A list process instance ids to delete.")
  
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
   **/
  @Schema(description = "A string with delete reason.")
  
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
   **/
  @Schema(description = "Skip execution listener invocation for activities that are started or ended as part of this request.")
  
    public Boolean isSkipCustomListeners() {
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
   **/
  @Schema(description = "Skip deletion of the subprocesses related to deleted processes as part of this request.")
  
    public Boolean isSkipSubprocesses() {
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
   **/
  @Schema(description = "")
  
    @Valid
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
   **/
  @Schema(description = "")
  
    @Valid
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
