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
 * ExtendLockOnExternalTaskDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class ExtendLockOnExternalTaskDto {

  private Long newDuration = null;

  private String workerId;

  public ExtendLockOnExternalTaskDto newDuration(Long newDuration) {
    this.newDuration = newDuration;
    return this;
  }

  /**
   * An amount of time (in milliseconds). This is the new lock duration starting from the current moment.
   * @return newDuration
  */
  
  @Schema(name = "newDuration", description = "An amount of time (in milliseconds). This is the new lock duration starting from the current moment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("newDuration")
  public Long getNewDuration() {
    return newDuration;
  }

  public void setNewDuration(Long newDuration) {
    this.newDuration = newDuration;
  }

  public ExtendLockOnExternalTaskDto workerId(String workerId) {
    this.workerId = workerId;
    return this;
  }

  /**
   * **Mandatory.** The ID of the worker who is performing the operation on the external task. If the task is already locked, must match the id of the worker who has most recently locked the task.
   * @return workerId
  */
  
  @Schema(name = "workerId", description = "**Mandatory.** The ID of the worker who is performing the operation on the external task. If the task is already locked, must match the id of the worker who has most recently locked the task.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    ExtendLockOnExternalTaskDto extendLockOnExternalTaskDto = (ExtendLockOnExternalTaskDto) o;
    return Objects.equals(this.newDuration, extendLockOnExternalTaskDto.newDuration) &&
        Objects.equals(this.workerId, extendLockOnExternalTaskDto.workerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newDuration, workerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtendLockOnExternalTaskDto {\n");
    sb.append("    newDuration: ").append(toIndentedString(newDuration)).append("\n");
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

