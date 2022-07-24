package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * StartProcessInstanceDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class StartProcessInstanceDto   {
  @JsonProperty("businessKey")
  private String businessKey = null;

  @JsonProperty("variables")
  @Valid
  private Map<String, VariableValueDto> variables = null;

  @JsonProperty("caseInstanceId")
  private String caseInstanceId = null;

  @JsonProperty("startInstructions")
  @Valid
  private List<ProcessInstanceModificationInstructionDto> startInstructions = null;

  @JsonProperty("skipCustomListeners")
  private Boolean skipCustomListeners = null;

  @JsonProperty("skipIoMappings")
  private Boolean skipIoMappings = null;

  @JsonProperty("withVariablesInReturn")
  private Boolean withVariablesInReturn = null;

  public StartProcessInstanceDto businessKey(String businessKey) {
    this.businessKey = businessKey;
    return this;
  }

  /**
   * The business key of the process instance.
   * @return businessKey
   **/
  @Schema(description = "The business key of the process instance.")
  
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
   * Get variables
   * @return variables
   **/
  @Schema(description = "")
      @Valid
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
   **/
  @Schema(description = "The case instance id the process instance is to be initialized with.")
  
    public String getCaseInstanceId() {
    return caseInstanceId;
  }

  public void setCaseInstanceId(String caseInstanceId) {
    this.caseInstanceId = caseInstanceId;
  }

  public StartProcessInstanceDto startInstructions(List<ProcessInstanceModificationInstructionDto> startInstructions) {
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
   **/
  @Schema(description = "**Optional**. A JSON array of instructions that specify which activities to start the process instance at. If this property is omitted, the process instance starts at its default blank start event.")
      @Valid
    public List<ProcessInstanceModificationInstructionDto> getStartInstructions() {
    return startInstructions;
  }

  public void setStartInstructions(List<ProcessInstanceModificationInstructionDto> startInstructions) {
    this.startInstructions = startInstructions;
  }

  public StartProcessInstanceDto skipCustomListeners(Boolean skipCustomListeners) {
    this.skipCustomListeners = skipCustomListeners;
    return this;
  }

  /**
   * Skip execution listener invocation for activities that are started or ended as part of this request. **Note**: This option is currently only respected when start instructions are submitted via the `startInstructions` property.
   * @return skipCustomListeners
   **/
  @Schema(description = "Skip execution listener invocation for activities that are started or ended as part of this request. **Note**: This option is currently only respected when start instructions are submitted via the `startInstructions` property.")
  
    public Boolean isSkipCustomListeners() {
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
   **/
  @Schema(description = "Skip execution of [input/output variable mappings](https://docs.camunda.org/manual/7.17/user-guide/process-engine/variables/#input-output-variable-mapping) for activities that are started or ended as part of this request. **Note**: This option is currently only respected when start instructions are submitted via the `startInstructions` property.")
  
    public Boolean isSkipIoMappings() {
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
   **/
  @Schema(description = "Indicates if the variables, which was used by the process instance during execution, should be returned. Default value: `false`")
  
    public Boolean isWithVariablesInReturn() {
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
