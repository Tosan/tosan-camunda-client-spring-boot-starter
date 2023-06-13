package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ExternalTaskBpmnErrorAllOf
 */

@JsonTypeName("ExternalTaskBpmnError_allOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class ExternalTaskBpmnErrorAllOf {

  private String workerId = null;

  public ExternalTaskBpmnErrorAllOf workerId(String workerId) {
    this.workerId = workerId;
    return this;
  }

  /**
   * The id of the worker that reports the failure. Must match the id of the worker who has most recently locked the task.
   * @return workerId
  */
  
  @Schema(name = "workerId", description = "The id of the worker that reports the failure. Must match the id of the worker who has most recently locked the task.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("workerId")
  public String getWorkerId() {
    return workerId;
  }

  public void setWorkerId(String workerId) {
    this.workerId = workerId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalTaskBpmnErrorAllOf externalTaskBpmnErrorAllOf = (ExternalTaskBpmnErrorAllOf) o;
    return Objects.equals(this.workerId, externalTaskBpmnErrorAllOf.workerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalTaskBpmnErrorAllOf {\n");
    sb.append("    workerId: ").append(toIndentedString(workerId)).append("\n");
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

