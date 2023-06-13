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
 * LockExternalTaskDtoAllOf
 */

@JsonTypeName("LockExternalTaskDto_allOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class LockExternalTaskDtoAllOf {

  private Long lockDuration;

  public LockExternalTaskDtoAllOf lockDuration(Long lockDuration) {
    this.lockDuration = lockDuration;
    return this;
  }

  /**
   * The duration to lock the external task for in milliseconds. **Note:** Attempting to lock an already locked external task with the same `workerId` will succeed and a new lock duration will be set, starting from the current moment.
   * @return lockDuration
  */
  
  @Schema(name = "lockDuration", description = "The duration to lock the external task for in milliseconds. **Note:** Attempting to lock an already locked external task with the same `workerId` will succeed and a new lock duration will be set, starting from the current moment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lockDuration")
  public Long getLockDuration() {
    return lockDuration;
  }

  public void setLockDuration(Long lockDuration) {
    this.lockDuration = lockDuration;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LockExternalTaskDtoAllOf lockExternalTaskDtoAllOf = (LockExternalTaskDtoAllOf) o;
    return Objects.equals(this.lockDuration, lockExternalTaskDtoAllOf.lockDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lockDuration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LockExternalTaskDtoAllOf {\n");
    sb.append("    lockDuration: ").append(toIndentedString(lockDuration)).append("\n");
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

