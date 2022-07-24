package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

/**
 * DecisionRequirementsDefinitionXmlDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class DecisionRequirementsDefinitionXmlDto   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("dmnXml")
  private String dmnXml = null;

  public DecisionRequirementsDefinitionXmlDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the decision requirements definition.
   * @return id
   **/
  @Schema(description = "The id of the decision requirements definition.")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DecisionRequirementsDefinitionXmlDto dmnXml(String dmnXml) {
    this.dmnXml = dmnXml;
    return this;
  }

  /**
   * An escaped XML string containing the XML that this decision requirements definition was deployed with. Carriage returns, line feeds and quotation marks are escaped.
   * @return dmnXml
   **/
  @Schema(description = "An escaped XML string containing the XML that this decision requirements definition was deployed with. Carriage returns, line feeds and quotation marks are escaped.")
  
    public String getDmnXml() {
    return dmnXml;
  }

  public void setDmnXml(String dmnXml) {
    this.dmnXml = dmnXml;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecisionRequirementsDefinitionXmlDto decisionRequirementsDefinitionXmlDto = (DecisionRequirementsDefinitionXmlDto) o;
    return Objects.equals(this.id, decisionRequirementsDefinitionXmlDto.id) &&
        Objects.equals(this.dmnXml, decisionRequirementsDefinitionXmlDto.dmnXml);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dmnXml);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecisionRequirementsDefinitionXmlDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dmnXml: ").append(toIndentedString(dmnXml)).append("\n");
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
