package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SetJobRetriesByProcessDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class SetJobRetriesByProcessDto   {
  @JsonProperty("processInstances")
  @Valid
  private List<String> processInstances = null;

  @JsonProperty("retries")
  private Integer retries = null;

  @JsonProperty("processInstanceQuery")
  private ProcessInstanceQueryDto processInstanceQuery = null;

  @JsonProperty("historicProcessInstanceQuery")
  private HistoricProcessInstanceQueryDto historicProcessInstanceQuery = null;

  public SetJobRetriesByProcessDto processInstances(List<String> processInstances) {
    this.processInstances = processInstances;
    return this;
  }

  public SetJobRetriesByProcessDto addProcessInstancesItem(String processInstancesItem) {
    if (this.processInstances == null) {
      this.processInstances = new ArrayList<>();
    }
    this.processInstances.add(processInstancesItem);
    return this;
  }

  /**
   * A list of process instance ids to fetch jobs, for which retries will be set.
   * @return processInstances
   **/
  @Schema(description = "A list of process instance ids to fetch jobs, for which retries will be set.")
  
    public List<String> getProcessInstances() {
    return processInstances;
  }

  public void setProcessInstances(List<String> processInstances) {
    this.processInstances = processInstances;
  }

  public SetJobRetriesByProcessDto retries(Integer retries) {
    this.retries = retries;
    return this;
  }

  /**
   * An integer representing the number of retries. Please note that the value cannot be negative or null.
   * minimum: 0
   * @return retries
   **/
  @Schema(description = "An integer representing the number of retries. Please note that the value cannot be negative or null.")
  
  @Min(0)  public Integer getRetries() {
    return retries;
  }

  public void setRetries(Integer retries) {
    this.retries = retries;
  }

  public SetJobRetriesByProcessDto processInstanceQuery(ProcessInstanceQueryDto processInstanceQuery) {
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

  public SetJobRetriesByProcessDto historicProcessInstanceQuery(HistoricProcessInstanceQueryDto historicProcessInstanceQuery) {
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
    SetJobRetriesByProcessDto setJobRetriesByProcessDto = (SetJobRetriesByProcessDto) o;
    return Objects.equals(this.processInstances, setJobRetriesByProcessDto.processInstances) &&
        Objects.equals(this.retries, setJobRetriesByProcessDto.retries) &&
        Objects.equals(this.processInstanceQuery, setJobRetriesByProcessDto.processInstanceQuery) &&
        Objects.equals(this.historicProcessInstanceQuery, setJobRetriesByProcessDto.historicProcessInstanceQuery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processInstances, retries, processInstanceQuery, historicProcessInstanceQuery);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetJobRetriesByProcessDto {\n");
    
    sb.append("    processInstances: ").append(toIndentedString(processInstances)).append("\n");
    sb.append("    retries: ").append(toIndentedString(retries)).append("\n");
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
