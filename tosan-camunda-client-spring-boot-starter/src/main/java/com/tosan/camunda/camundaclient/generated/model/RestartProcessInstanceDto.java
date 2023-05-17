package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;

/**
 * RestartProcessInstanceDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class RestartProcessInstanceDto   {
  @JsonProperty("processInstanceIds")
  @Valid
  private List<String> processInstanceIds = null;

  @JsonProperty("historicProcessInstanceQuery")
  private HistoricProcessInstanceQueryDto historicProcessInstanceQuery = null;

  @JsonProperty("skipCustomListeners")
  private Boolean skipCustomListeners = null;

  @JsonProperty("skipIoMappings")
  private Boolean skipIoMappings = null;

  @JsonProperty("initialVariables")
  private Boolean initialVariables = null;

  @JsonProperty("withoutBusinessKey")
  private Boolean withoutBusinessKey = null;

  @JsonProperty("instructions")
  @Valid
  private List<RestartProcessInstanceModificationInstructionDto> instructions = null;

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
   **/
  @Schema(description = "A list of process instance ids to restart.")
  
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
   **/
  @Schema(description = "")
  
    @Valid
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
   **/
  @Schema(description = "Skip execution listener invocation for activities that are started as part of this request.")
  
    public Boolean isSkipCustomListeners() {
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
   **/
  @Schema(description = "Skip execution of [input/output variable mappings](https://docs.camunda.org/manual/7.17/user-guide/process-engine/variables/#input-output-variable-mapping) for activities that are started as part of this request.")
  
    public Boolean isSkipIoMappings() {
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
   **/
  @Schema(description = "Set the initial set of variables during restart. By default, the last set of variables is used.")
  
    public Boolean isInitialVariables() {
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
   **/
  @Schema(description = "Do not take over the business key of the historic process instance.")
  
    public Boolean isWithoutBusinessKey() {
    return withoutBusinessKey;
  }

  public void setWithoutBusinessKey(Boolean withoutBusinessKey) {
    this.withoutBusinessKey = withoutBusinessKey;
  }

  public RestartProcessInstanceDto instructions(List<RestartProcessInstanceModificationInstructionDto> instructions) {
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
   **/
  @Schema(description = "**Optional**. A JSON array of instructions that specify which activities to start the process instance at. If this property is omitted, the process instance starts at its default blank start event.")
      @Valid
    public List<RestartProcessInstanceModificationInstructionDto> getInstructions() {
    return instructions;
  }

  public void setInstructions(List<RestartProcessInstanceModificationInstructionDto> instructions) {
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
