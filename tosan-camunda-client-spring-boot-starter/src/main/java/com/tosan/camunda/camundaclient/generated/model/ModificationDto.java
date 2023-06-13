package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tosan.camunda.camundaclient.generated.model.MultipleProcessInstanceModificationInstructionDto;
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
 * ModificationDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class ModificationDto {

  private String processDefinitionId = null;

  private Boolean skipCustomListeners = null;

  private Boolean skipIoMappings = null;

  @Valid
  private List<String> processInstanceIds;

  private ProcessInstanceQueryDto processInstanceQuery;

  @Valid
  private List<@Valid MultipleProcessInstanceModificationInstructionDto> instructions;

  private String annotation = null;

  public ModificationDto processDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
    return this;
  }

  /**
   * The id of the process definition for the modification
   * @return processDefinitionId
  */
  
  @Schema(name = "processDefinitionId", description = "The id of the process definition for the modification", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionId")
  public String getProcessDefinitionId() {
    return processDefinitionId;
  }

  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }

  public ModificationDto skipCustomListeners(Boolean skipCustomListeners) {
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

  public ModificationDto skipIoMappings(Boolean skipIoMappings) {
    this.skipIoMappings = skipIoMappings;
    return this;
  }

  /**
   * Skip execution of [input/output variable mappings](https://docs.camunda.org/manual/7.17/user-guide/process-engine/variables/#input-output-variable-mapping) for activities that are started or ended as part of this request.
   * @return skipIoMappings
  */
  
  @Schema(name = "skipIoMappings", description = "Skip execution of [input/output variable mappings](https://docs.camunda.org/manual/7.17/user-guide/process-engine/variables/#input-output-variable-mapping) for activities that are started or ended as part of this request.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("skipIoMappings")
  public Boolean getSkipIoMappings() {
    return skipIoMappings;
  }

  public void setSkipIoMappings(Boolean skipIoMappings) {
    this.skipIoMappings = skipIoMappings;
  }

  public ModificationDto processInstanceIds(List<String> processInstanceIds) {
    this.processInstanceIds = processInstanceIds;
    return this;
  }

  public ModificationDto addProcessInstanceIdsItem(String processInstanceIdsItem) {
    if (this.processInstanceIds == null) {
      this.processInstanceIds = new ArrayList<>();
    }
    this.processInstanceIds.add(processInstanceIdsItem);
    return this;
  }

  /**
   * A list of process instance ids to modify.
   * @return processInstanceIds
  */
  
  @Schema(name = "processInstanceIds", description = "A list of process instance ids to modify.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processInstanceIds")
  public List<String> getProcessInstanceIds() {
    return processInstanceIds;
  }

  public void setProcessInstanceIds(List<String> processInstanceIds) {
    this.processInstanceIds = processInstanceIds;
  }

  public ModificationDto processInstanceQuery(ProcessInstanceQueryDto processInstanceQuery) {
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

  public ModificationDto instructions(List<@Valid MultipleProcessInstanceModificationInstructionDto> instructions) {
    this.instructions = instructions;
    return this;
  }

  public ModificationDto addInstructionsItem(MultipleProcessInstanceModificationInstructionDto instructionsItem) {
    if (this.instructions == null) {
      this.instructions = new ArrayList<>();
    }
    this.instructions.add(instructionsItem);
    return this;
  }

  /**
   * An array of modification instructions. The instructions are executed in the order they are in. 
   * @return instructions
  */
  @Valid 
  @Schema(name = "instructions", description = "An array of modification instructions. The instructions are executed in the order they are in. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("instructions")
  public List<@Valid MultipleProcessInstanceModificationInstructionDto> getInstructions() {
    return instructions;
  }

  public void setInstructions(List<@Valid MultipleProcessInstanceModificationInstructionDto> instructions) {
    this.instructions = instructions;
  }

  public ModificationDto annotation(String annotation) {
    this.annotation = annotation;
    return this;
  }

  /**
   * An arbitrary text annotation set by a user for auditing reasons.
   * @return annotation
  */
  
  @Schema(name = "annotation", description = "An arbitrary text annotation set by a user for auditing reasons.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("annotation")
  public String getAnnotation() {
    return annotation;
  }

  public void setAnnotation(String annotation) {
    this.annotation = annotation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModificationDto modificationDto = (ModificationDto) o;
    return Objects.equals(this.processDefinitionId, modificationDto.processDefinitionId) &&
        Objects.equals(this.skipCustomListeners, modificationDto.skipCustomListeners) &&
        Objects.equals(this.skipIoMappings, modificationDto.skipIoMappings) &&
        Objects.equals(this.processInstanceIds, modificationDto.processInstanceIds) &&
        Objects.equals(this.processInstanceQuery, modificationDto.processInstanceQuery) &&
        Objects.equals(this.instructions, modificationDto.instructions) &&
        Objects.equals(this.annotation, modificationDto.annotation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processDefinitionId, skipCustomListeners, skipIoMappings, processInstanceIds, processInstanceQuery, instructions, annotation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModificationDto {\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    skipCustomListeners: ").append(toIndentedString(skipCustomListeners)).append("\n");
    sb.append("    skipIoMappings: ").append(toIndentedString(skipIoMappings)).append("\n");
    sb.append("    processInstanceIds: ").append(toIndentedString(processInstanceIds)).append("\n");
    sb.append("    processInstanceQuery: ").append(toIndentedString(processInstanceQuery)).append("\n");
    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
    sb.append("    annotation: ").append(toIndentedString(annotation)).append("\n");
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

