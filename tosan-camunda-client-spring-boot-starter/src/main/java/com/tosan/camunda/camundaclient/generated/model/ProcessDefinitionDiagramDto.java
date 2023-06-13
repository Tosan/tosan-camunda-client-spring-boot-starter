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
 * ProcessDefinitionDiagramDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class ProcessDefinitionDiagramDto {

  private String id = null;

  private String bpmn20Xml = null;

  public ProcessDefinitionDiagramDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the process definition.
   * @return id
  */
  
  @Schema(name = "id", description = "The id of the process definition.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProcessDefinitionDiagramDto bpmn20Xml(String bpmn20Xml) {
    this.bpmn20Xml = bpmn20Xml;
    return this;
  }

  /**
   * An escaped XML string containing the XML that this definition was deployed with. Carriage returns, line feeds and quotation marks are escaped.
   * @return bpmn20Xml
  */
  
  @Schema(name = "bpmn20Xml", description = "An escaped XML string containing the XML that this definition was deployed with. Carriage returns, line feeds and quotation marks are escaped.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bpmn20Xml")
  public String getBpmn20Xml() {
    return bpmn20Xml;
  }

  public void setBpmn20Xml(String bpmn20Xml) {
    this.bpmn20Xml = bpmn20Xml;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessDefinitionDiagramDto processDefinitionDiagramDto = (ProcessDefinitionDiagramDto) o;
    return Objects.equals(this.id, processDefinitionDiagramDto.id) &&
        Objects.equals(this.bpmn20Xml, processDefinitionDiagramDto.bpmn20Xml);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, bpmn20Xml);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessDefinitionDiagramDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    bpmn20Xml: ").append(toIndentedString(bpmn20Xml)).append("\n");
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

