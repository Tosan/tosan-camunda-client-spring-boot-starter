package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tosan.camunda.camundaclient.generated.model.ProcessInstanceModificationInstructionDto;
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
 * StartProcessInstanceDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class StartProcessInstanceDto {

  private String businessKey = null;

  @Valid
  private Map<String, VariableValueDto> variables;

  private String caseInstanceId = null;

  @Valid
  private List<@Valid ProcessInstanceModificationInstructionDto> startInstructions;

  private Boolean skipCustomListeners = null;

  private Boolean skipIoMappings = null;

  private Boolean withVariablesInReturn = null;

  public StartProcessInstanceDto businessKey(String businessKey) {
    this.businessKey = businessKey;
    return this;
  }

  /**
   * The business key of the process instance.
   * @return businessKey
  */
  
  @Schema(name = "businessKey", description = "The business key of the process instance.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("businessKey")
  public String getBusinessKey() {
    return businessKey;
  }

  public void setBusinessKey(String businessKey) {
    this.businessKey = businessKey;
  }

  public StartProcessInstanceDto variables(Map<String, VariableValueDto> variables) {
    this.variables = variables;
    return this;
  }

  public StartProcessInstanceDto putVariablesItem(String key, VariableValueDto variablesItem) {
    if (this.variables == null) {
      this.variables = new HashMap<>();
    }
    this.variables.put(key, variablesItem);
    return this;
  }

  /**
   * 
   * @return variables
  */
  @Valid 
  @Schema(name = "variables", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("variables")
  public Map<String, VariableValueDto> getVariables() {
    return variables;
  }

  public void setVariables(Map<String, VariableValueDto> variables) {
    this.variables = variables;
  }

  public StartProcessInstanceDto caseInstanceId(String caseInstanceId) {
    this.caseInstanceId = caseInstanceId;
    return this;
  }

  /**
   * The case instance id the process instance is to be initialized with.
   * @return caseInstanceId
  */
  
  @Schema(name = "caseInstanceId", description = "The case instance id the process instance is to be initialized with.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("caseInstanceId")
  public String getCaseInstanceId() {
    return caseInstanceId;
  }

  public void setCaseInstanceId(String caseInstanceId) {
    this.caseInstanceId = caseInstanceId;
  }

  public StartProcessInstanceDto startInstructions(List<@Valid ProcessInstanceModificationInstructionDto> startInstructions) {
    this.startInstructions = startInstructions;
    return this;
  }

  public StartProcessInstanceDto addStartInstructionsItem(ProcessInstanceModificationInstructionDto startInstructionsItem) {
    if (this.startInstructions == null) {
      this.startInstructions = new ArrayList<>();
    }
    this.startInstructions.add(startInstructionsItem);
    return this;
  }

  /**
   * **Optional**. A JSON array of instructions that specify which activities to start the process instance at. If this property is omitted, the process instance starts at its default blank start event.
   * @return startInstructions
  */
  @Valid 
  @Schema(name = "startInstructions", description = "**Optional**. A JSON array of instructions that specify which activities to start the process instance at. If this property is omitted, the process instance starts at its default blank start event.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startInstructions")
  public List<@Valid ProcessInstanceModificationInstructionDto> getStartInstructions() {
    return startInstructions;
  }

  public void setStartInstructions(List<@Valid ProcessInstanceModificationInstructionDto> startInstructions) {
    this.startInstructions = startInstructions;
  }

  public StartProcessInstanceDto skipCustomListeners(Boolean skipCustomListeners) {
    this.skipCustomListeners = skipCustomListeners;
    return this;
  }

  /**
   * Skip execution listener invocation for activities that are started or ended as part of this request. **Note**: This option is currently only respected when start instructions are submitted via the `startInstructions` property.
   * @return skipCustomListeners
  */
  
  @Schema(name = "skipCustomListeners", description = "Skip execution listener invocation for activities that are started or ended as part of this request. **Note**: This option is currently only respected when start instructions are submitted via the `startInstructions` property.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("skipCustomListeners")
  public Boolean getSkipCustomListeners() {
    return skipCustomListeners;
  }

  public void setSkipCustomListeners(Boolean skipCustomListeners) {
    this.skipCustomListeners = skipCustomListeners;
  }

  public StartProcessInstanceDto skipIoMappings(Boolean skipIoMappings) {
    this.skipIoMappings = skipIoMappings;
    return this;
  }

  /**
   * Skip execution of [input/output variable mappings](https://docs.camunda.org/manual/7.17/user-guide/process-engine/variables/#input-output-variable-mapping) for activities that are started or ended as part of this request. **Note**: This option is currently only respected when start instructions are submitted via the `startInstructions` property.
   * @return skipIoMappings
  */
  
  @Schema(name = "skipIoMappings", description = "Skip execution of [input/output variable mappings](https://docs.camunda.org/manual/7.17/user-guide/process-engine/variables/#input-output-variable-mapping) for activities that are started or ended as part of this request. **Note**: This option is currently only respected when start instructions are submitted via the `startInstructions` property.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("skipIoMappings")
  public Boolean getSkipIoMappings() {
    return skipIoMappings;
  }

  public void setSkipIoMappings(Boolean skipIoMappings) {
    this.skipIoMappings = skipIoMappings;
  }

  public StartProcessInstanceDto withVariablesInReturn(Boolean withVariablesInReturn) {
    this.withVariablesInReturn = withVariablesInReturn;
    return this;
  }

  /**
   * Indicates if the variables, which was used by the process instance during execution, should be returned. Default value: `false`
   * @return withVariablesInReturn
  */
  
  @Schema(name = "withVariablesInReturn", description = "Indicates if the variables, which was used by the process instance during execution, should be returned. Default value: `false`", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("withVariablesInReturn")
  public Boolean getWithVariablesInReturn() {
    return withVariablesInReturn;
  }

  public void setWithVariablesInReturn(Boolean withVariablesInReturn) {
    this.withVariablesInReturn = withVariablesInReturn;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartProcessInstanceDto startProcessInstanceDto = (StartProcessInstanceDto) o;
    return Objects.equals(this.businessKey, startProcessInstanceDto.businessKey) &&
        Objects.equals(this.variables, startProcessInstanceDto.variables) &&
        Objects.equals(this.caseInstanceId, startProcessInstanceDto.caseInstanceId) &&
        Objects.equals(this.startInstructions, startProcessInstanceDto.startInstructions) &&
        Objects.equals(this.skipCustomListeners, startProcessInstanceDto.skipCustomListeners) &&
        Objects.equals(this.skipIoMappings, startProcessInstanceDto.skipIoMappings) &&
        Objects.equals(this.withVariablesInReturn, startProcessInstanceDto.withVariablesInReturn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessKey, variables, caseInstanceId, startInstructions, skipCustomListeners, skipIoMappings, withVariablesInReturn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartProcessInstanceDto {\n");
    sb.append("    businessKey: ").append(toIndentedString(businessKey)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    caseInstanceId: ").append(toIndentedString(caseInstanceId)).append("\n");
    sb.append("    startInstructions: ").append(toIndentedString(startInstructions)).append("\n");
    sb.append("    skipCustomListeners: ").append(toIndentedString(skipCustomListeners)).append("\n");
    sb.append("    skipIoMappings: ").append(toIndentedString(skipIoMappings)).append("\n");
    sb.append("    withVariablesInReturn: ").append(toIndentedString(withVariablesInReturn)).append("\n");
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

