package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * RestartProcessInstanceModificationInstructionDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class RestartProcessInstanceModificationInstructionDto {

  /**
   * **Mandatory**. One of the following values: `startBeforeActivity`, `startAfterActivity`, `startTransition`.  * A `startBeforeActivity` instruction requests to enter a given activity. * A `startAfterActivity` instruction requests to execute the single outgoing sequence flow of a given activity. * A `startTransition` instruction requests to execute a specific sequence flow.
   */
  public enum TypeEnum {
    STARTBEFOREACTIVITY("startBeforeActivity"),
    
    STARTAFTERACTIVITY("startAfterActivity"),
    
    STARTTRANSITION("startTransition");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type;

  private String activityId = null;

  private String transitionId = null;

  /**
   * Default constructor
   * @deprecated Use {@link RestartProcessInstanceModificationInstructionDto#RestartProcessInstanceModificationInstructionDto(TypeEnum)}
   */
  @Deprecated
  public RestartProcessInstanceModificationInstructionDto() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RestartProcessInstanceModificationInstructionDto(TypeEnum type) {
    this.type = type;
  }

  public RestartProcessInstanceModificationInstructionDto type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * **Mandatory**. One of the following values: `startBeforeActivity`, `startAfterActivity`, `startTransition`.  * A `startBeforeActivity` instruction requests to enter a given activity. * A `startAfterActivity` instruction requests to execute the single outgoing sequence flow of a given activity. * A `startTransition` instruction requests to execute a specific sequence flow.
   * @return type
  */
  @NotNull 
  @Schema(name = "type", description = "**Mandatory**. One of the following values: `startBeforeActivity`, `startAfterActivity`, `startTransition`.  * A `startBeforeActivity` instruction requests to enter a given activity. * A `startAfterActivity` instruction requests to execute the single outgoing sequence flow of a given activity. * A `startTransition` instruction requests to execute a specific sequence flow.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RestartProcessInstanceModificationInstructionDto activityId(String activityId) {
    this.activityId = activityId;
    return this;
  }

  /**
   * **Can be used with instructions of types** `startBeforeActivity` and `startAfterActivity`. Specifies the sequence flow to start.
   * @return activityId
  */
  
  @Schema(name = "activityId", description = "**Can be used with instructions of types** `startBeforeActivity` and `startAfterActivity`. Specifies the sequence flow to start.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activityId")
  public String getActivityId() {
    return activityId;
  }

  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }

  public RestartProcessInstanceModificationInstructionDto transitionId(String transitionId) {
    this.transitionId = transitionId;
    return this;
  }

  /**
   * **Can be used with instructions of types** `startTransition`. Specifies the sequence flow to start.
   * @return transitionId
  */
  
  @Schema(name = "transitionId", description = "**Can be used with instructions of types** `startTransition`. Specifies the sequence flow to start.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("transitionId")
  public String getTransitionId() {
    return transitionId;
  }

  public void setTransitionId(String transitionId) {
    this.transitionId = transitionId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestartProcessInstanceModificationInstructionDto restartProcessInstanceModificationInstructionDto = (RestartProcessInstanceModificationInstructionDto) o;
    return Objects.equals(this.type, restartProcessInstanceModificationInstructionDto.type) &&
        Objects.equals(this.activityId, restartProcessInstanceModificationInstructionDto.activityId) &&
        Objects.equals(this.transitionId, restartProcessInstanceModificationInstructionDto.transitionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, activityId, transitionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestartProcessInstanceModificationInstructionDto {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    transitionId: ").append(toIndentedString(transitionId)).append("\n");
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

