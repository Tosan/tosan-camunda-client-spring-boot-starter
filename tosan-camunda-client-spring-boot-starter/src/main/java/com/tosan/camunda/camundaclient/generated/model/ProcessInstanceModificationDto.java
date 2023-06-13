package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tosan.camunda.camundaclient.generated.model.ProcessInstanceModificationInstructionDto;
import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ProcessInstanceModificationDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class ProcessInstanceModificationDto {

  private Boolean skipCustomListeners = null;

  private Boolean skipIoMappings = null;

  @Valid
  private List<@Valid ProcessInstanceModificationInstructionDto> instructions;

  private String annotation = null;

  public ProcessInstanceModificationDto skipCustomListeners(Boolean skipCustomListeners) {
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

  public ProcessInstanceModificationDto skipIoMappings(Boolean skipIoMappings) {
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

  public ProcessInstanceModificationDto instructions(List<@Valid ProcessInstanceModificationInstructionDto> instructions) {
    this.instructions = instructions;
    return this;
  }

  public ProcessInstanceModificationDto addInstructionsItem(ProcessInstanceModificationInstructionDto instructionsItem) {
    if (this.instructions == null) {
      this.instructions = new ArrayList<>();
    }
    this.instructions.add(instructionsItem);
    return this;
  }

  /**
   * JSON array of modification instructions. The instructions are executed in the order they are in.
   * @return instructions
  */
  @Valid 
  @Schema(name = "instructions", description = "JSON array of modification instructions. The instructions are executed in the order they are in.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("instructions")
  public List<@Valid ProcessInstanceModificationInstructionDto> getInstructions() {
    return instructions;
  }

  public void setInstructions(List<@Valid ProcessInstanceModificationInstructionDto> instructions) {
    this.instructions = instructions;
  }

  public ProcessInstanceModificationDto annotation(String annotation) {
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
    ProcessInstanceModificationDto processInstanceModificationDto = (ProcessInstanceModificationDto) o;
    return Objects.equals(this.skipCustomListeners, processInstanceModificationDto.skipCustomListeners) &&
        Objects.equals(this.skipIoMappings, processInstanceModificationDto.skipIoMappings) &&
        Objects.equals(this.instructions, processInstanceModificationDto.instructions) &&
        Objects.equals(this.annotation, processInstanceModificationDto.annotation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skipCustomListeners, skipIoMappings, instructions, annotation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessInstanceModificationDto {\n");
    sb.append("    skipCustomListeners: ").append(toIndentedString(skipCustomListeners)).append("\n");
    sb.append("    skipIoMappings: ").append(toIndentedString(skipIoMappings)).append("\n");
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

