package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tosan.camunda.camundaclient.generated.model.MigrationInstructionDto;
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
 * MigrationPlanDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class MigrationPlanDto {

  private String sourceProcessDefinitionId = null;

  private String targetProcessDefinitionId = null;

  @Valid
  private List<@Valid MigrationInstructionDto> instructions;

  @Valid
  private Map<String, VariableValueDto> variables;

  public MigrationPlanDto sourceProcessDefinitionId(String sourceProcessDefinitionId) {
    this.sourceProcessDefinitionId = sourceProcessDefinitionId;
    return this;
  }

  /**
   * The id of the source process definition for the migration.
   * @return sourceProcessDefinitionId
  */
  
  @Schema(name = "sourceProcessDefinitionId", description = "The id of the source process definition for the migration.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sourceProcessDefinitionId")
  public String getSourceProcessDefinitionId() {
    return sourceProcessDefinitionId;
  }

  public void setSourceProcessDefinitionId(String sourceProcessDefinitionId) {
    this.sourceProcessDefinitionId = sourceProcessDefinitionId;
  }

  public MigrationPlanDto targetProcessDefinitionId(String targetProcessDefinitionId) {
    this.targetProcessDefinitionId = targetProcessDefinitionId;
    return this;
  }

  /**
   * The id of the target process definition for the migration.
   * @return targetProcessDefinitionId
  */
  
  @Schema(name = "targetProcessDefinitionId", description = "The id of the target process definition for the migration.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("targetProcessDefinitionId")
  public String getTargetProcessDefinitionId() {
    return targetProcessDefinitionId;
  }

  public void setTargetProcessDefinitionId(String targetProcessDefinitionId) {
    this.targetProcessDefinitionId = targetProcessDefinitionId;
  }

  public MigrationPlanDto instructions(List<@Valid MigrationInstructionDto> instructions) {
    this.instructions = instructions;
    return this;
  }

  public MigrationPlanDto addInstructionsItem(MigrationInstructionDto instructionsItem) {
    if (this.instructions == null) {
      this.instructions = new ArrayList<>();
    }
    this.instructions.add(instructionsItem);
    return this;
  }

  /**
   * A list of migration instructions which map equal activities. Each migration instruction is a JSON object with the following properties:
   * @return instructions
  */
  @Valid 
  @Schema(name = "instructions", description = "A list of migration instructions which map equal activities. Each migration instruction is a JSON object with the following properties:", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("instructions")
  public List<@Valid MigrationInstructionDto> getInstructions() {
    return instructions;
  }

  public void setInstructions(List<@Valid MigrationInstructionDto> instructions) {
    this.instructions = instructions;
  }

  public MigrationPlanDto variables(Map<String, VariableValueDto> variables) {
    this.variables = variables;
    return this;
  }

  public MigrationPlanDto putVariablesItem(String key, VariableValueDto variablesItem) {
    if (this.variables == null) {
      this.variables = new HashMap<>();
    }
    this.variables.put(key, variablesItem);
    return this;
  }

  /**
   * A map of variables which will be set into the process instances' scope. Each key is a variable name and each value a JSON variable value object.
   * @return variables
  */
  @Valid 
  @Schema(name = "variables", description = "A map of variables which will be set into the process instances' scope. Each key is a variable name and each value a JSON variable value object.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    MigrationPlanDto migrationPlanDto = (MigrationPlanDto) o;
    return Objects.equals(this.sourceProcessDefinitionId, migrationPlanDto.sourceProcessDefinitionId) &&
        Objects.equals(this.targetProcessDefinitionId, migrationPlanDto.targetProcessDefinitionId) &&
        Objects.equals(this.instructions, migrationPlanDto.instructions) &&
        Objects.equals(this.variables, migrationPlanDto.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceProcessDefinitionId, targetProcessDefinitionId, instructions, variables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MigrationPlanDto {\n");
    sb.append("    sourceProcessDefinitionId: ").append(toIndentedString(sourceProcessDefinitionId)).append("\n");
    sb.append("    targetProcessDefinitionId: ").append(toIndentedString(targetProcessDefinitionId)).append("\n");
    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
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

