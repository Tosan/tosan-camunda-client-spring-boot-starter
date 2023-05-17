package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;

/**
 * SetRetriesForExternalTasksDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class SetRetriesForExternalTasksDto   {
  @JsonProperty("retries")
  private Integer retries = null;

  @JsonProperty("externalTaskIds")
  @Valid
  private List<String> externalTaskIds = null;

  @JsonProperty("processInstanceIds")
  @Valid
  private List<String> processInstanceIds = null;

  @JsonProperty("externalTaskQuery")
  private ExternalTaskQueryDto externalTaskQuery = null;

  @JsonProperty("processInstanceQuery")
  private ProcessInstanceQueryDto processInstanceQuery = null;

  @JsonProperty("historicProcessInstanceQuery")
  private HistoricProcessInstanceQueryDto historicProcessInstanceQuery = null;

  public SetRetriesForExternalTasksDto retries(Integer retries) {
    this.retries = retries;
    return this;
  }

  /**
   * The number of retries to set for the external task.  Must be >= 0. If this is 0, an incident is created and the task cannot be fetched anymore unless the retries are increased again. Can not be null.
   * @return retries
   **/
  @Schema(description = "The number of retries to set for the external task.  Must be >= 0. If this is 0, an incident is created and the task cannot be fetched anymore unless the retries are increased again. Can not be null.")
  
    public Integer getRetries() {
    return retries;
  }

  public void setRetries(Integer retries) {
    this.retries = retries;
  }

  public SetRetriesForExternalTasksDto externalTaskIds(List<String> externalTaskIds) {
    this.externalTaskIds = externalTaskIds;
    return this;
  }

  public SetRetriesForExternalTasksDto addExternalTaskIdsItem(String externalTaskIdsItem) {
    if (this.externalTaskIds == null) {
      this.externalTaskIds = new ArrayList<>();
    }
    this.externalTaskIds.add(externalTaskIdsItem);
    return this;
  }

  /**
   * The ids of the external tasks to set the number of retries for.
   * @return externalTaskIds
   **/
  @Schema(description = "The ids of the external tasks to set the number of retries for.")
  
    public List<String> getExternalTaskIds() {
    return externalTaskIds;
  }

  public void setExternalTaskIds(List<String> externalTaskIds) {
    this.externalTaskIds = externalTaskIds;
  }

  public SetRetriesForExternalTasksDto processInstanceIds(List<String> processInstanceIds) {
    this.processInstanceIds = processInstanceIds;
    return this;
  }

  public SetRetriesForExternalTasksDto addProcessInstanceIdsItem(String processInstanceIdsItem) {
    if (this.processInstanceIds == null) {
      this.processInstanceIds = new ArrayList<>();
    }
    this.processInstanceIds.add(processInstanceIdsItem);
    return this;
  }

  /**
   * The ids of process instances containing the tasks to set the number of retries for.
   * @return processInstanceIds
   **/
  @Schema(description = "The ids of process instances containing the tasks to set the number of retries for.")
  
    public List<String> getProcessInstanceIds() {
    return processInstanceIds;
  }

  public void setProcessInstanceIds(List<String> processInstanceIds) {
    this.processInstanceIds = processInstanceIds;
  }

  public SetRetriesForExternalTasksDto externalTaskQuery(ExternalTaskQueryDto externalTaskQuery) {
    this.externalTaskQuery = externalTaskQuery;
    return this;
  }

  /**
   * Get externalTaskQuery
   * @return externalTaskQuery
   **/
  @Schema(description = "")
  
    @Valid
    public ExternalTaskQueryDto getExternalTaskQuery() {
    return externalTaskQuery;
  }

  public void setExternalTaskQuery(ExternalTaskQueryDto externalTaskQuery) {
    this.externalTaskQuery = externalTaskQuery;
  }

  public SetRetriesForExternalTasksDto processInstanceQuery(ProcessInstanceQueryDto processInstanceQuery) {
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

  public SetRetriesForExternalTasksDto historicProcessInstanceQuery(HistoricProcessInstanceQueryDto historicProcessInstanceQuery) {
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
    SetRetriesForExternalTasksDto setRetriesForExternalTasksDto = (SetRetriesForExternalTasksDto) o;
    return Objects.equals(this.retries, setRetriesForExternalTasksDto.retries) &&
        Objects.equals(this.externalTaskIds, setRetriesForExternalTasksDto.externalTaskIds) &&
        Objects.equals(this.processInstanceIds, setRetriesForExternalTasksDto.processInstanceIds) &&
        Objects.equals(this.externalTaskQuery, setRetriesForExternalTasksDto.externalTaskQuery) &&
        Objects.equals(this.processInstanceQuery, setRetriesForExternalTasksDto.processInstanceQuery) &&
        Objects.equals(this.historicProcessInstanceQuery, setRetriesForExternalTasksDto.historicProcessInstanceQuery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(retries, externalTaskIds, processInstanceIds, externalTaskQuery, processInstanceQuery, historicProcessInstanceQuery);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetRetriesForExternalTasksDto {\n");
    
    sb.append("    retries: ").append(toIndentedString(retries)).append("\n");
    sb.append("    externalTaskIds: ").append(toIndentedString(externalTaskIds)).append("\n");
    sb.append("    processInstanceIds: ").append(toIndentedString(processInstanceIds)).append("\n");
    sb.append("    externalTaskQuery: ").append(toIndentedString(externalTaskQuery)).append("\n");
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
