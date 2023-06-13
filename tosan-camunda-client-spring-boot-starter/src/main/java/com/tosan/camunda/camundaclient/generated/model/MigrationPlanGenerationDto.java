package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tosan.camunda.camundaclient.generated.model.VariableValueDto;
import java.util.HashMap;
import java.util.Map;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * MigrationPlanGenerationDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class MigrationPlanGenerationDto {

  private String sourceProcessDefinitionId = null;

  private String targetProcessDefinitionId = null;

  private Boolean updateEventTriggers = null;

  @Valid
  private Map<String, VariableValueDto> variables;

  public MigrationPlanGenerationDto sourceProcessDefinitionId(String sourceProcessDefinitionId) {
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

  public MigrationPlanGenerationDto targetProcessDefinitionId(String targetProcessDefinitionId) {
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

  public MigrationPlanGenerationDto updateEventTriggers(Boolean updateEventTriggers) {
    this.updateEventTriggers = updateEventTriggers;
    return this;
  }

  /**
   * A boolean flag indicating whether instructions between events should be configured to update the event triggers.
   * @return updateEventTriggers
  */
  
  @Schema(name = "updateEventTriggers", description = "A boolean flag indicating whether instructions between events should be configured to update the event triggers.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updateEventTriggers")
  public Boolean getUpdateEventTriggers() {
    return updateEventTriggers;
  }

  public void setUpdateEventTriggers(Boolean updateEventTriggers) {
    this.updateEventTriggers = updateEventTriggers;
  }

  public MigrationPlanGenerationDto variables(Map<String, VariableValueDto> variables) {
    this.variables = variables;
    return this;
  }

  public MigrationPlanGenerationDto putVariablesItem(String key, VariableValueDto variablesItem) {
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
    MigrationPlanGenerationDto migrationPlanGenerationDto = (MigrationPlanGenerationDto) o;
    return Objects.equals(this.sourceProcessDefinitionId, migrationPlanGenerationDto.sourceProcessDefinitionId) &&
        Objects.equals(this.targetProcessDefinitionId, migrationPlanGenerationDto.targetProcessDefinitionId) &&
        Objects.equals(this.updateEventTriggers, migrationPlanGenerationDto.updateEventTriggers) &&
        Objects.equals(this.variables, migrationPlanGenerationDto.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceProcessDefinitionId, targetProcessDefinitionId, updateEventTriggers, variables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MigrationPlanGenerationDto {\n");
    sb.append("    sourceProcessDefinitionId: ").append(toIndentedString(sourceProcessDefinitionId)).append("\n");
    sb.append("    targetProcessDefinitionId: ").append(toIndentedString(targetProcessDefinitionId)).append("\n");
    sb.append("    updateEventTriggers: ").append(toIndentedString(updateEventTriggers)).append("\n");
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

