package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tosan.camunda.camundaclient.generated.model.HistoricProcessInstanceQueryDto;
import com.tosan.camunda.camundaclient.generated.model.ProcessInstanceQueryDto;
import com.tosan.camunda.camundaclient.generated.model.VariableValueDto;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CorrelationMessageAsyncDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class CorrelationMessageAsyncDto {

  private String messageName = null;

  @Valid
  private List<String> processInstanceIds;

  private ProcessInstanceQueryDto processInstanceQuery;

  private HistoricProcessInstanceQueryDto historicProcessInstanceQuery;

  @Valid
  private Map<String, VariableValueDto> variables;

  public CorrelationMessageAsyncDto messageName(String messageName) {
    this.messageName = messageName;
    return this;
  }

  /**
   * The name of the message to correlate. Corresponds to the 'name' element of the message defined in BPMN 2.0 XML. Can be null to correlate by other criteria only.
   * @return messageName
  */
  
  @Schema(name = "messageName", description = "The name of the message to correlate. Corresponds to the 'name' element of the message defined in BPMN 2.0 XML. Can be null to correlate by other criteria only.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("messageName")
  public String getMessageName() {
    return messageName;
  }

  public void setMessageName(String messageName) {
    this.messageName = messageName;
  }

  public CorrelationMessageAsyncDto processInstanceIds(List<String> processInstanceIds) {
    this.processInstanceIds = processInstanceIds;
    return this;
  }

  public CorrelationMessageAsyncDto addProcessInstanceIdsItem(String processInstanceIdsItem) {
    if (this.processInstanceIds == null) {
      this.processInstanceIds = new ArrayList<>();
    }
    this.processInstanceIds.add(processInstanceIdsItem);
    return this;
  }

  /**
   * A list of process instance ids that define a group of process instances to which the operation will correlate a message.  Please note that if `processInstanceIds`, `processInstanceQuery` and `historicProcessInstanceQuery` are defined, the resulting operation will be performed on the union of these sets.
   * @return processInstanceIds
  */
  
  @Schema(name = "processInstanceIds", description = "A list of process instance ids that define a group of process instances to which the operation will correlate a message.  Please note that if `processInstanceIds`, `processInstanceQuery` and `historicProcessInstanceQuery` are defined, the resulting operation will be performed on the union of these sets.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processInstanceIds")
  public List<String> getProcessInstanceIds() {
    return processInstanceIds;
  }

  public void setProcessInstanceIds(List<String> processInstanceIds) {
    this.processInstanceIds = processInstanceIds;
  }

  public CorrelationMessageAsyncDto processInstanceQuery(ProcessInstanceQueryDto processInstanceQuery) {
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

  public CorrelationMessageAsyncDto historicProcessInstanceQuery(HistoricProcessInstanceQueryDto historicProcessInstanceQuery) {
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

  public CorrelationMessageAsyncDto variables(Map<String, VariableValueDto> variables) {
    this.variables = variables;
    return this;
  }

  public CorrelationMessageAsyncDto putVariablesItem(String key, VariableValueDto variablesItem) {
    if (this.variables == null) {
      this.variables = new HashMap<>();
    }
    this.variables.put(key, variablesItem);
    return this;
  }

  /**
   * All variables the operation will set in the root scope of the process instances the message is correlated to.
   * @return variables
  */
  @Valid 
  @Schema(name = "variables", description = "All variables the operation will set in the root scope of the process instances the message is correlated to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("variables")
  public Map<String, VariableValueDto> getVariables() {
    return variables;
  }

  public void setVariables(Map<String, VariableValueDto> variables) {
    this.variables = variables;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CorrelationMessageAsyncDto correlationMessageAsyncDto = (CorrelationMessageAsyncDto) o;
    return Objects.equals(this.messageName, correlationMessageAsyncDto.messageName) &&
        Objects.equals(this.processInstanceIds, correlationMessageAsyncDto.processInstanceIds) &&
        Objects.equals(this.processInstanceQuery, correlationMessageAsyncDto.processInstanceQuery) &&
        Objects.equals(this.historicProcessInstanceQuery, correlationMessageAsyncDto.historicProcessInstanceQuery) &&
        Objects.equals(this.variables, correlationMessageAsyncDto.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageName, processInstanceIds, processInstanceQuery, historicProcessInstanceQuery, variables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorrelationMessageAsyncDto {\n");
    sb.append("    messageName: ").append(toIndentedString(messageName)).append("\n");
    sb.append("    processInstanceIds: ").append(toIndentedString(processInstanceIds)).append("\n");
    sb.append("    processInstanceQuery: ").append(toIndentedString(processInstanceQuery)).append("\n");
    sb.append("    historicProcessInstanceQuery: ").append(toIndentedString(historicProcessInstanceQuery)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
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

