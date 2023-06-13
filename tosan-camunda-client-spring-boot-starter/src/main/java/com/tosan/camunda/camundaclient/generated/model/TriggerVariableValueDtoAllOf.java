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
 * TriggerVariableValueDtoAllOf
 */

@JsonTypeName("TriggerVariableValueDto_allOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class TriggerVariableValueDtoAllOf {

  private Boolean local = null;

  public TriggerVariableValueDtoAllOf local(Boolean local) {
    this.local = local;
    return this;
  }

  /**
   * Indicates whether the variable should be a local variable or not. If set to true, the variable becomes a local variable of the execution entering the target activity.
   * @return local
  */
  
  @Schema(name = "local", description = "Indicates whether the variable should be a local variable or not. If set to true, the variable becomes a local variable of the execution entering the target activity.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("local")
  public Boolean getLocal() {
    return local;
  }

  public void setLocal(Boolean local) {
    this.local = local;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TriggerVariableValueDtoAllOf triggerVariableValueDtoAllOf = (TriggerVariableValueDtoAllOf) o;
    return Objects.equals(this.local, triggerVariableValueDtoAllOf.local);
  }

  @Override
  public int hashCode() {
    return Objects.hash(local);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TriggerVariableValueDtoAllOf {\n");
    sb.append("    local: ").append(toIndentedString(local)).append("\n");
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

