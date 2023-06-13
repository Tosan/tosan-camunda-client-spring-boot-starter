package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DecisionRequirementsDefinitionXmlDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class DecisionRequirementsDefinitionXmlDto {

  private String id = null;

  private String dmnXml = null;

  public DecisionRequirementsDefinitionXmlDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the decision requirements definition.
   * @return id
  */
  
  @Schema(name = "id", description = "The id of the decision requirements definition.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
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
  */
  
  @Schema(name = "dmnXml", description = "An escaped XML string containing the XML that this decision requirements definition was deployed with. Carriage returns, line feeds and quotation marks are escaped.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dmnXml")
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

