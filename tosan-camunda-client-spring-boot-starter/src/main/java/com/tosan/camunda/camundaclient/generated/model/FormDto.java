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
 * FormDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class FormDto {

  private String key = null;

  private String contextPath = null;

  public FormDto key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The form key.
   * @return key
  */
  
  @Schema(name = "key", description = "The form key.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("key")
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
  */
  
  @Schema(name = "contextPath", description = "The context path of the process application. If the task (or the process definition) does not belong to a process application deployment or a process definition at all, this property is not set.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contextPath")
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

