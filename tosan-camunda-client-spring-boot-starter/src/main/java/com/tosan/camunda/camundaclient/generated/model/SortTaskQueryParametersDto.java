package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

/**
 * Mandatory when &#x60;sortBy&#x60; is one of the following values: &#x60;processVariable&#x60;, &#x60;executionVariable&#x60;, &#x60;taskVariable&#x60;, &#x60;caseExecutionVariable&#x60; or &#x60;caseInstanceVariable&#x60;. Must be a JSON object with the properties &#x60;variable&#x60; and &#x60;type&#x60; where &#x60;variable&#x60; is a variable name and &#x60;type&#x60; is the name of a variable value type.
 */
@Schema(description = "Mandatory when `sortBy` is one of the following values: `processVariable`, `executionVariable`, `taskVariable`, `caseExecutionVariable` or `caseInstanceVariable`. Must be a JSON object with the properties `variable` and `type` where `variable` is a variable name and `type` is the name of a variable value type.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class SortTaskQueryParametersDto   {
  @JsonProperty("variable")
  private String variable = null;

  @JsonProperty("type")
  private String type = null;

  public SortTaskQueryParametersDto variable(String variable) {
    this.variable = variable;
    return this;
  }

  /**
   * The name of the variable to sort by.
   * @return variable
   **/
  @Schema(description = "The name of the variable to sort by.")
  
    public String getVariable() {
    return variable;
  }

  public void setVariable(String variable) {
    this.variable = variable;
  }

  public SortTaskQueryParametersDto type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The name of the type of the variable value.
   * @return type
   **/
  @Schema(description = "The name of the type of the variable value.")
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SortTaskQueryParametersDto sortTaskQueryParametersDto = (SortTaskQueryParametersDto) o;
    return Objects.equals(this.variable, sortTaskQueryParametersDto.variable) &&
        Objects.equals(this.type, sortTaskQueryParametersDto.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variable, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SortTaskQueryParametersDto {\n");
    
    sb.append("    variable: ").append(toIndentedString(variable)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
