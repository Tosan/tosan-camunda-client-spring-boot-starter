package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;

/**
 * ModificationDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class ModificationDto   {
  @JsonProperty("processDefinitionId")
  private String processDefinitionId = null;

  @JsonProperty("skipCustomListeners")
  private Boolean skipCustomListeners = null;

  @JsonProperty("skipIoMappings")
  private Boolean skipIoMappings = null;

  @JsonProperty("processInstanceIds")
  @Valid
  private List<String> processInstanceIds = null;

  @JsonProperty("processInstanceQuery")
  private ProcessInstanceQueryDto processInstanceQuery = null;

  @JsonProperty("instructions")
  @Valid
  private List<MultipleProcessInstanceModificationInstructionDto> instructions = null;

  @JsonProperty("annotation")
  private String annotation = null;

  public ModificationDto processDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
    return this;
  }

  /**
   * The id of the process definition for the modification
   * @return processDefinitionId
   **/
  @Schema(description = "The id of the process definition for the modification")
  
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
   **/
  @Schema(description = "Skip execution listener invocation for activities that are started or ended as part of this request.")
  
    public Boolean isSkipCustomListeners() {
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
   **/
  @Schema(description = "Skip execution of [input/output variable mappings](https://docs.camunda.org/manual/7.17/user-guide/process-engine/variables/#input-output-variable-mapping) for activities that are started or ended as part of this request.")
  
    public Boolean isSkipIoMappings() {
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
   **/
  @Schema(description = "A list of process instance ids to modify.")
  
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
   **/
  @Schema(description = "")
  
    @Valid
    public ProcessInstanceQueryDto getProcessInstanceQuery() {
    return processInstanceQuery;
  }

  public void setProcessInstanceQuery(ProcessInstanceQueryDto processInstanceQuery) {
    this.processInstanceQuery = processInstanceQuery;
  }

  public ModificationDto instructions(List<MultipleProcessInstanceModificationInstructionDto> instructions) {
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
   **/
  @Schema(description = "An array of modification instructions. The instructions are executed in the order they are in. ")
      @Valid
    public List<MultipleProcessInstanceModificationInstructionDto> getInstructions() {
    return instructions;
  }

  public void setInstructions(List<MultipleProcessInstanceModificationInstructionDto> instructions) {
    this.instructions = instructions;
  }

  public ModificationDto annotation(String annotation) {
    this.annotation = annotation;
    return this;
  }

  /**
   * An arbitrary text annotation set by a user for auditing reasons.
   * @return annotation
   **/
  @Schema(description = "An arbitrary text annotation set by a user for auditing reasons.")
  
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
