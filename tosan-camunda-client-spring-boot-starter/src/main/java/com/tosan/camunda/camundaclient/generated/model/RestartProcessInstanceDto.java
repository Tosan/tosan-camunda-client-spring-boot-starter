package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tosan.camunda.camundaclient.generated.model.HistoricProcessInstanceQueryDto;
import com.tosan.camunda.camundaclient.generated.model.RestartProcessInstanceModificationInstructionDto;
import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * RestartProcessInstanceDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class RestartProcessInstanceDto {

  @Valid
  private List<String> processInstanceIds;

  private HistoricProcessInstanceQueryDto historicProcessInstanceQuery;

  private Boolean skipCustomListeners = null;

  private Boolean skipIoMappings = null;

  private Boolean initialVariables = null;

  private Boolean withoutBusinessKey = null;

  @Valid
  private List<@Valid RestartProcessInstanceModificationInstructionDto> instructions;

  public RestartProcessInstanceDto processInstanceIds(List<String> processInstanceIds) {
    this.processInstanceIds = processInstanceIds;
    return this;
  }

  public RestartProcessInstanceDto addProcessInstanceIdsItem(String processInstanceIdsItem) {
    if (this.processInstanceIds == null) {
      this.processInstanceIds = new ArrayList<>();
    }
    this.processInstanceIds.add(processInstanceIdsItem);
    return this;
  }

  /**
   * A list of process instance ids to restart.
   * @return processInstanceIds
  */
  
  @Schema(name = "processInstanceIds", description = "A list of process instance ids to restart.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processInstanceIds")
  public List<String> getProcessInstanceIds() {
    return processInstanceIds;
  }

  public void setProcessInstanceIds(List<String> processInstanceIds) {
    this.processInstanceIds = processInstanceIds;
  }

  public RestartProcessInstanceDto historicProcessInstanceQuery(HistoricProcessInstanceQueryDto historicProcessInstanceQuery) {
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

  public RestartProcessInstanceDto skipCustomListeners(Boolean skipCustomListeners) {
    this.skipCustomListeners = skipCustomListeners;
    return this;
  }

  /**
   * Skip execution listener invocation for activities that are started as part of this request.
   * @return skipCustomListeners
  */
  
  @Schema(name = "skipCustomListeners", description = "Skip execution listener invocation for activities that are started as part of this request.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("skipCustomListeners")
  public Boolean getSkipCustomListeners() {
    return skipCustomListeners;
  }

  public void setSkipCustomListeners(Boolean skipCustomListeners) {
    this.skipCustomListeners = skipCustomListeners;
  }

  public RestartProcessInstanceDto skipIoMappings(Boolean skipIoMappings) {
    this.skipIoMappings = skipIoMappings;
    return this;
  }

  /**
   * Skip execution of [input/output variable mappings](https://docs.camunda.org/manual/7.17/user-guide/process-engine/variables/#input-output-variable-mapping) for activities that are started as part of this request.
   * @return skipIoMappings
  */
  
  @Schema(name = "skipIoMappings", description = "Skip execution of [input/output variable mappings](https://docs.camunda.org/manual/7.17/user-guide/process-engine/variables/#input-output-variable-mapping) for activities that are started as part of this request.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("skipIoMappings")
  public Boolean getSkipIoMappings() {
    return skipIoMappings;
  }

  public void setSkipIoMappings(Boolean skipIoMappings) {
    this.skipIoMappings = skipIoMappings;
  }

  public RestartProcessInstanceDto initialVariables(Boolean initialVariables) {
    this.initialVariables = initialVariables;
    return this;
  }

  /**
   * Set the initial set of variables during restart. By default, the last set of variables is used.
   * @return initialVariables
  */
  
  @Schema(name = "initialVariables", description = "Set the initial set of variables during restart. By default, the last set of variables is used.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("initialVariables")
  public Boolean getInitialVariables() {
    return initialVariables;
  }

  public void setInitialVariables(Boolean initialVariables) {
    this.initialVariables = initialVariables;
  }

  public RestartProcessInstanceDto withoutBusinessKey(Boolean withoutBusinessKey) {
    this.withoutBusinessKey = withoutBusinessKey;
    return this;
  }

  /**
   * Do not take over the business key of the historic process instance.
   * @return withoutBusinessKey
  */
  
  @Schema(name = "withoutBusinessKey", description = "Do not take over the business key of the historic process instance.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("withoutBusinessKey")
  public Boolean getWithoutBusinessKey() {
    return withoutBusinessKey;
  }

  public void setWithoutBusinessKey(Boolean withoutBusinessKey) {
    this.withoutBusinessKey = withoutBusinessKey;
  }

  public RestartProcessInstanceDto instructions(List<@Valid RestartProcessInstanceModificationInstructionDto> instructions) {
    this.instructions = instructions;
    return this;
  }

  public RestartProcessInstanceDto addInstructionsItem(RestartProcessInstanceModificationInstructionDto instructionsItem) {
    if (this.instructions == null) {
      this.instructions = new ArrayList<>();
    }
    this.instructions.add(instructionsItem);
    return this;
  }

  /**
   * **Optional**. A JSON array of instructions that specify which activities to start the process instance at. If this property is omitted, the process instance starts at its default blank start event.
   * @return instructions
  */
  @Valid 
  @Schema(name = "instructions", description = "**Optional**. A JSON array of instructions that specify which activities to start the process instance at. If this property is omitted, the process instance starts at its default blank start event.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("instructions")
  public List<@Valid RestartProcessInstanceModificationInstructionDto> getInstructions() {
    return instructions;
  }

  public void setInstructions(List<@Valid RestartProcessInstanceModificationInstructionDto> instructions) {
    this.instructions = instructions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestartProcessInstanceDto restartProcessInstanceDto = (RestartProcessInstanceDto) o;
    return Objects.equals(this.processInstanceIds, restartProcessInstanceDto.processInstanceIds) &&
        Objects.equals(this.historicProcessInstanceQuery, restartProcessInstanceDto.historicProcessInstanceQuery) &&
        Objects.equals(this.skipCustomListeners, restartProcessInstanceDto.skipCustomListeners) &&
        Objects.equals(this.skipIoMappings, restartProcessInstanceDto.skipIoMappings) &&
        Objects.equals(this.initialVariables, restartProcessInstanceDto.initialVariables) &&
        Objects.equals(this.withoutBusinessKey, restartProcessInstanceDto.withoutBusinessKey) &&
        Objects.equals(this.instructions, restartProcessInstanceDto.instructions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processInstanceIds, historicProcessInstanceQuery, skipCustomListeners, skipIoMappings, initialVariables, withoutBusinessKey, instructions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestartProcessInstanceDto {\n");
    sb.append("    processInstanceIds: ").append(toIndentedString(processInstanceIds)).append("\n");
    sb.append("    historicProcessInstanceQuery: ").append(toIndentedString(historicProcessInstanceQuery)).append("\n");
    sb.append("    skipCustomListeners: ").append(toIndentedString(skipCustomListeners)).append("\n");
    sb.append("    skipIoMappings: ").append(toIndentedString(skipIoMappings)).append("\n");
    sb.append("    initialVariables: ").append(toIndentedString(initialVariables)).append("\n");
    sb.append("    withoutBusinessKey: ").append(toIndentedString(withoutBusinessKey)).append("\n");
    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
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

