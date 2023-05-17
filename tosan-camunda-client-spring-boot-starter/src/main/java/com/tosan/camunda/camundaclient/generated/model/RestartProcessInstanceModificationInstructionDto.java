package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import jakarta.validation.constraints.*;

/**
 * RestartProcessInstanceModificationInstructionDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class RestartProcessInstanceModificationInstructionDto   {
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

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("activityId")
  private String activityId = null;

  @JsonProperty("transitionId")
  private String transitionId = null;

  public RestartProcessInstanceModificationInstructionDto type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * **Mandatory**. One of the following values: `startBeforeActivity`, `startAfterActivity`, `startTransition`.  * A `startBeforeActivity` instruction requests to enter a given activity. * A `startAfterActivity` instruction requests to execute the single outgoing sequence flow of a given activity. * A `startTransition` instruction requests to execute a specific sequence flow.
   * @return type
   **/
  @Schema(required = true, description = "**Mandatory**. One of the following values: `startBeforeActivity`, `startAfterActivity`, `startTransition`.  * A `startBeforeActivity` instruction requests to enter a given activity. * A `startAfterActivity` instruction requests to execute the single outgoing sequence flow of a given activity. * A `startTransition` instruction requests to execute a specific sequence flow.")
      @NotNull

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
   **/
  @Schema(description = "**Can be used with instructions of types** `startBeforeActivity` and `startAfterActivity`. Specifies the sequence flow to start.")
  
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
   **/
  @Schema(description = "**Can be used with instructions of types** `startTransition`. Specifies the sequence flow to start.")
  
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
