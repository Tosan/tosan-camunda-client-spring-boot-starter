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
 * DecisionDefinitionDiagramDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class DecisionDefinitionDiagramDto {

  private String id = null;

  private String dmnXml = null;

  public DecisionDefinitionDiagramDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the decision definition.
   * @return id
  */
  
  @Schema(name = "id", description = "The id of the decision definition.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DecisionDefinitionDiagramDto dmnXml(String dmnXml) {
    this.dmnXml = dmnXml;
    return this;
  }

  /**
   * An escaped XML string containing the XML that this decision definition was deployed with. Carriage returns, line feeds and quotation marks are escaped.
   * @return dmnXml
  */
  
  @Schema(name = "dmnXml", description = "An escaped XML string containing the XML that this decision definition was deployed with. Carriage returns, line feeds and quotation marks are escaped.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    DecisionDefinitionDiagramDto decisionDefinitionDiagramDto = (DecisionDefinitionDiagramDto) o;
    return Objects.equals(this.id, decisionDefinitionDiagramDto.id) &&
        Objects.equals(this.dmnXml, decisionDefinitionDiagramDto.dmnXml);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dmnXml);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecisionDefinitionDiagramDto {\n");
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

