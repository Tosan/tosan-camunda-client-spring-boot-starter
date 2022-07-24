package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.HashMap;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * MigrationPlanGenerationDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class MigrationPlanGenerationDto   {
  @JsonProperty("sourceProcessDefinitionId")
  private String sourceProcessDefinitionId = null;

  @JsonProperty("targetProcessDefinitionId")
  private String targetProcessDefinitionId = null;

  @JsonProperty("updateEventTriggers")
  private Boolean updateEventTriggers = null;

  @JsonProperty("variables")
  @Valid
  private Map<String, VariableValueDto> variables = null;

  public MigrationPlanGenerationDto sourceProcessDefinitionId(String sourceProcessDefinitionId) {
    this.sourceProcessDefinitionId = sourceProcessDefinitionId;
    return this;
  }

  /**
   * The id of the source process definition for the migration.
   * @return sourceProcessDefinitionId
   **/
  @Schema(description = "The id of the source process definition for the migration.")
  
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
   **/
  @Schema(description = "The id of the target process definition for the migration.")
  
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
   **/
  @Schema(description = "A boolean flag indicating whether instructions between events should be configured to update the event triggers.")
  
    public Boolean isUpdateEventTriggers() {
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
   **/
  @Schema(description = "A map of variables which will be set into the process instances' scope. Each key is a variable name and each value a JSON variable value object.")
      @Valid
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
