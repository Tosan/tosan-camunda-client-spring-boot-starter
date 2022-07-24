package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

/**
 * FormDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class FormDto   {
  @JsonProperty("key")
  private String key = null;

  @JsonProperty("contextPath")
  private String contextPath = null;

  public FormDto key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The form key.
   * @return key
   **/
  @Schema(description = "The form key.")
  
    public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public FormDto contextPath(String contextPath) {
    this.contextPath = contextPath;
    return this;
  }

  /**
   * The context path of the process application. If the task (or the process definition) does not belong to a process application deployment or a process definition at all, this property is not set.
   * @return contextPath
   **/
  @Schema(description = "The context path of the process application. If the task (or the process definition) does not belong to a process application deployment or a process definition at all, this property is not set.")
  
    public String getContextPath() {
    return contextPath;
  }

  public void setContextPath(String contextPath) {
    this.contextPath = contextPath;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormDto formDto = (FormDto) o;
    return Objects.equals(this.key, formDto.key) &&
        Objects.equals(this.contextPath, formDto.contextPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, contextPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormDto {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    contextPath: ").append(toIndentedString(contextPath)).append("\n");
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
