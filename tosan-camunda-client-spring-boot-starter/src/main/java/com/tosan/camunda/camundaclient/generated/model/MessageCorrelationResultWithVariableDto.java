package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tosan.camunda.camundaclient.generated.model.ExecutionDto;
import com.tosan.camunda.camundaclient.generated.model.ProcessInstanceDto;
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
 * The &#x60;processInstance&#x60; property only has a value if the resultType is set to &#x60;ProcessDefinition&#x60;. The processInstance with the properties as described in the [get single instance](https://docs.camunda.org/manual/7.17/reference/rest/process-instance/get/) method.  The &#x60;execution&#x60; property only has a value if the resultType is set to &#x60;Execution&#x60;. The execution with the properties as described in the [get single execution](https://docs.camunda.org/manual/7.17/reference/rest/execution/get/) method.
 */

@Schema(name = "MessageCorrelationResultWithVariableDto", description = "The `processInstance` property only has a value if the resultType is set to `ProcessDefinition`. The processInstance with the properties as described in the [get single instance](https://docs.camunda.org/manual/7.17/reference/rest/process-instance/get/) method.  The `execution` property only has a value if the resultType is set to `Execution`. The execution with the properties as described in the [get single execution](https://docs.camunda.org/manual/7.17/reference/rest/execution/get/) method.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class MessageCorrelationResultWithVariableDto {

  /**
   * Indicates if the message was correlated to a message start event or an  intermediate message catching event. In the first case, the resultType is  `ProcessDefinition` and otherwise `Execution`.
   */
  public enum ResultTypeEnum {
    EXECUTION("Execution"),
    
    PROCESSDEFINITION("ProcessDefinition");

    private String value;

    ResultTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ResultTypeEnum fromValue(String value) {
      for (ResultTypeEnum b : ResultTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  private ResultTypeEnum resultType = null;

  private ProcessInstanceDto processInstance;

  private ExecutionDto execution;

  @Valid
  private Map<String, VariableValueDto> variables;

  public MessageCorrelationResultWithVariableDto resultType(ResultTypeEnum resultType) {
    this.resultType = resultType;
    return this;
  }

  /**
   * Indicates if the message was correlated to a message start event or an  intermediate message catching event. In the first case, the resultType is  `ProcessDefinition` and otherwise `Execution`.
   * @return resultType
  */
  
  @Schema(name = "resultType", description = "Indicates if the message was correlated to a message start event or an  intermediate message catching event. In the first case, the resultType is  `ProcessDefinition` and otherwise `Execution`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resultType")
  public ResultTypeEnum getResultType() {
    return resultType;
  }

  public void setResultType(ResultTypeEnum resultType) {
    this.resultType = resultType;
  }

  public MessageCorrelationResultWithVariableDto processInstance(ProcessInstanceDto processInstance) {
    this.processInstance = processInstance;
    return this;
  }

  /**
   * Get processInstance
   * @return processInstance
  */
  @Valid 
  @Schema(name = "processInstance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processInstance")
  public ProcessInstanceDto getProcessInstance() {
    return processInstance;
  }

  public void setProcessInstance(ProcessInstanceDto processInstance) {
    this.processInstance = processInstance;
  }

  public MessageCorrelationResultWithVariableDto execution(ExecutionDto execution) {
    this.execution = execution;
    return this;
  }

  /**
   * Get execution
   * @return execution
  */
  @Valid 
  @Schema(name = "execution", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("execution")
  public ExecutionDto getExecution() {
    return execution;
  }

  public void setExecution(ExecutionDto execution) {
    this.execution = execution;
  }

  public MessageCorrelationResultWithVariableDto variables(Map<String, VariableValueDto> variables) {
    this.variables = variables;
    return this;
  }

  public MessageCorrelationResultWithVariableDto putVariablesItem(String key, VariableValueDto variablesItem) {
    if (this.variables == null) {
      this.variables = new HashMap<>();
    }
    this.variables.put(key, variablesItem);
    return this;
  }

  /**
   * This property is returned if the `variablesInResultEnabled` is set to `true`. Contains a list of the process variables. 
   * @return variables
  */
  @Valid 
  @Schema(name = "variables", description = "This property is returned if the `variablesInResultEnabled` is set to `true`. Contains a list of the process variables. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    MessageCorrelationResultWithVariableDto messageCorrelationResultWithVariableDto = (MessageCorrelationResultWithVariableDto) o;
    return Objects.equals(this.resultType, messageCorrelationResultWithVariableDto.resultType) &&
        Objects.equals(this.processInstance, messageCorrelationResultWithVariableDto.processInstance) &&
        Objects.equals(this.execution, messageCorrelationResultWithVariableDto.execution) &&
        Objects.equals(this.variables, messageCorrelationResultWithVariableDto.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultType, processInstance, execution, variables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageCorrelationResultWithVariableDto {\n");
    sb.append("    resultType: ").append(toIndentedString(resultType)).append("\n");
    sb.append("    processInstance: ").append(toIndentedString(processInstance)).append("\n");
    sb.append("    execution: ").append(toIndentedString(execution)).append("\n");
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

