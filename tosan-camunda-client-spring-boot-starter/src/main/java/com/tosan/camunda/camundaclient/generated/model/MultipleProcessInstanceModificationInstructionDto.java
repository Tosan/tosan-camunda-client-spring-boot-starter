package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * MultipleProcessInstanceModificationInstructionDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class MultipleProcessInstanceModificationInstructionDto   {
  /**
   * **Mandatory**. One of the following values: `cancel`, `startBeforeActivity`, `startAfterActivity`, `startTransition`.  * A cancel instruction requests cancellation of a single activity instance or all instances of one activity. * A startBeforeActivity instruction requests to enter a given activity. * A startAfterActivity instruction requests to execute the single outgoing sequence flow of a given activity. * A startTransition instruction requests to execute a specific sequence flow.
   */
  public enum TypeEnum {
    CANCEL("cancel"),
    
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

  @JsonProperty("cancelCurrentActiveActivityInstances")
  private Boolean cancelCurrentActiveActivityInstances = null;

  public MultipleProcessInstanceModificationInstructionDto type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * **Mandatory**. One of the following values: `cancel`, `startBeforeActivity`, `startAfterActivity`, `startTransition`.  * A cancel instruction requests cancellation of a single activity instance or all instances of one activity. * A startBeforeActivity instruction requests to enter a given activity. * A startAfterActivity instruction requests to execute the single outgoing sequence flow of a given activity. * A startTransition instruction requests to execute a specific sequence flow.
   * @return type
   **/
  @Schema(required = true, description = "**Mandatory**. One of the following values: `cancel`, `startBeforeActivity`, `startAfterActivity`, `startTransition`.  * A cancel instruction requests cancellation of a single activity instance or all instances of one activity. * A startBeforeActivity instruction requests to enter a given activity. * A startAfterActivity instruction requests to execute the single outgoing sequence flow of a given activity. * A startTransition instruction requests to execute a specific sequence flow.")
      @NotNull

    public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public MultipleProcessInstanceModificationInstructionDto activityId(String activityId) {
    this.activityId = activityId;
    return this;
  }

  /**
   * Can be used with instructions of types `startTransition`. Specifies the sequence flow to start.
   * @return activityId
   **/
  @Schema(description = "Can be used with instructions of types `startTransition`. Specifies the sequence flow to start.")
  
    public String getActivityId() {
    return activityId;
  }

  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }

  public MultipleProcessInstanceModificationInstructionDto transitionId(String transitionId) {
    this.transitionId = transitionId;
    return this;
  }

  /**
   * Can be used with instructions of types `startTransition`. Specifies the sequence flow to start.
   * @return transitionId
   **/
  @Schema(description = "Can be used with instructions of types `startTransition`. Specifies the sequence flow to start.")
  
    public String getTransitionId() {
    return transitionId;
  }

  public void setTransitionId(String transitionId) {
    this.transitionId = transitionId;
  }

  public MultipleProcessInstanceModificationInstructionDto cancelCurrentActiveActivityInstances(Boolean cancelCurrentActiveActivityInstances) {
    this.cancelCurrentActiveActivityInstances = cancelCurrentActiveActivityInstances;
    return this;
  }

  /**
   * Can be used with instructions of type cancel. Prevents the deletion of new created activity instances.
   * @return cancelCurrentActiveActivityInstances
   **/
  @Schema(description = "Can be used with instructions of type cancel. Prevents the deletion of new created activity instances.")
  
    public Boolean isCancelCurrentActiveActivityInstances() {
    return cancelCurrentActiveActivityInstances;
  }

  public void setCancelCurrentActiveActivityInstances(Boolean cancelCurrentActiveActivityInstances) {
    this.cancelCurrentActiveActivityInstances = cancelCurrentActiveActivityInstances;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultipleProcessInstanceModificationInstructionDto multipleProcessInstanceModificationInstructionDto = (MultipleProcessInstanceModificationInstructionDto) o;
    return Objects.equals(this.type, multipleProcessInstanceModificationInstructionDto.type) &&
        Objects.equals(this.activityId, multipleProcessInstanceModificationInstructionDto.activityId) &&
        Objects.equals(this.transitionId, multipleProcessInstanceModificationInstructionDto.transitionId) &&
        Objects.equals(this.cancelCurrentActiveActivityInstances, multipleProcessInstanceModificationInstructionDto.cancelCurrentActiveActivityInstances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, activityId, transitionId, cancelCurrentActiveActivityInstances);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultipleProcessInstanceModificationInstructionDto {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    transitionId: ").append(toIndentedString(transitionId)).append("\n");
    sb.append("    cancelCurrentActiveActivityInstances: ").append(toIndentedString(cancelCurrentActiveActivityInstances)).append("\n");
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
