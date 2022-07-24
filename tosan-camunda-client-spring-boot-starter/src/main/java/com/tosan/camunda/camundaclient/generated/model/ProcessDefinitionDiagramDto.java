package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

/**
 * ProcessDefinitionDiagramDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class ProcessDefinitionDiagramDto   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("bpmn20Xml")
  private String bpmn20Xml = null;

  public ProcessDefinitionDiagramDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the process definition.
   * @return id
   **/
  @Schema(description = "The id of the process definition.")
  
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
   **/
  @Schema(description = "An escaped XML string containing the XML that this definition was deployed with. Carriage returns, line feeds and quotation marks are escaped.")
  
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
