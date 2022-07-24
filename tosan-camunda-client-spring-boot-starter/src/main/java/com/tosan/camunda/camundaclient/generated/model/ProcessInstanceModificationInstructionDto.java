package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProcessInstanceModificationInstructionDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class ProcessInstanceModificationInstructionDto   {
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

  @JsonProperty("variables")
  private TriggerVariableValueDto variables = null;

  @JsonProperty("activityId")
  private String activityId = null;

  @JsonProperty("transitionId")
  private String transitionId = null;

  @JsonProperty("activityInstanceId")
  private String activityInstanceId = null;

  @JsonProperty("transitionInstanceId")
  private String transitionInstanceId = null;

  @JsonProperty("ancestorActivityInstanceId")
  private String ancestorActivityInstanceId = null;

  @JsonProperty("cancelCurrentActiveActivityInstances")
  private Boolean cancelCurrentActiveActivityInstances = null;

  public ProcessInstanceModificationInstructionDto type(TypeEnum type) {
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

  public ProcessInstanceModificationInstructionDto variables(TriggerVariableValueDto variables) {
    this.variables = variables;
    return this;
  }

  /**
   * Get variables
   * @return variables
   **/
  @Schema(description = "")
  
    @Valid
    public TriggerVariableValueDto getVariables() {
    return variables;
  }

  public void setVariables(TriggerVariableValueDto variables) {
    this.variables = variables;
  }

  public ProcessInstanceModificationInstructionDto activityId(String activityId) {
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

  public ProcessInstanceModificationInstructionDto transitionId(String transitionId) {
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

  public ProcessInstanceModificationInstructionDto activityInstanceId(String activityInstanceId) {
    this.activityInstanceId = activityInstanceId;
    return this;
  }

  /**
   * Can be used with instructions of type `cancel`. Specifies the activity instance to cancel. Valid values are the activity instance IDs supplied by the [Get Activity Instance request](https://docs.camunda.org/manual/7.17/reference/rest/process-instance/get-activity-instances/).
   * @return activityInstanceId
   **/
  @Schema(description = "Can be used with instructions of type `cancel`. Specifies the activity instance to cancel. Valid values are the activity instance IDs supplied by the [Get Activity Instance request](https://docs.camunda.org/manual/7.17/reference/rest/process-instance/get-activity-instances/).")
  
    public String getActivityInstanceId() {
    return activityInstanceId;
  }

  public void setActivityInstanceId(String activityInstanceId) {
    this.activityInstanceId = activityInstanceId;
  }

  public ProcessInstanceModificationInstructionDto transitionInstanceId(String transitionInstanceId) {
    this.transitionInstanceId = transitionInstanceId;
    return this;
  }

  /**
   * Can be used with instructions of type `cancel`. Specifies the transition instance to cancel. Valid values are the transition instance IDs supplied by the [Get Activity Instance request](https://docs.camunda.org/manual/7.17/reference/rest/process-instance/get-activity-instances/).
   * @return transitionInstanceId
   **/
  @Schema(description = "Can be used with instructions of type `cancel`. Specifies the transition instance to cancel. Valid values are the transition instance IDs supplied by the [Get Activity Instance request](https://docs.camunda.org/manual/7.17/reference/rest/process-instance/get-activity-instances/).")
  
    public String getTransitionInstanceId() {
    return transitionInstanceId;
  }

  public void setTransitionInstanceId(String transitionInstanceId) {
    this.transitionInstanceId = transitionInstanceId;
  }

  public ProcessInstanceModificationInstructionDto ancestorActivityInstanceId(String ancestorActivityInstanceId) {
    this.ancestorActivityInstanceId = ancestorActivityInstanceId;
    return this;
  }

  /**
   * Can be used with instructions of type `startBeforeActivity`, `startAfterActivity`, and `startTransition`. Valid values are the activity instance IDs supplied by the Get Activity Instance request. If there are multiple parent activity instances of the targeted activity, this specifies the ancestor scope in which hierarchy the activity/transition is to be instantiated.  Example: When there are two instances of a subprocess and an activity contained in the subprocess is to be started, this parameter allows to specifiy under which subprocess instance the activity should be started.
   * @return ancestorActivityInstanceId
   **/
  @Schema(description = "Can be used with instructions of type `startBeforeActivity`, `startAfterActivity`, and `startTransition`. Valid values are the activity instance IDs supplied by the Get Activity Instance request. If there are multiple parent activity instances of the targeted activity, this specifies the ancestor scope in which hierarchy the activity/transition is to be instantiated.  Example: When there are two instances of a subprocess and an activity contained in the subprocess is to be started, this parameter allows to specifiy under which subprocess instance the activity should be started.")
  
    public String getAncestorActivityInstanceId() {
    return ancestorActivityInstanceId;
  }

  public void setAncestorActivityInstanceId(String ancestorActivityInstanceId) {
    this.ancestorActivityInstanceId = ancestorActivityInstanceId;
  }

  public ProcessInstanceModificationInstructionDto cancelCurrentActiveActivityInstances(Boolean cancelCurrentActiveActivityInstances) {
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
    ProcessInstanceModificationInstructionDto processInstanceModificationInstructionDto = (ProcessInstanceModificationInstructionDto) o;
    return Objects.equals(this.type, processInstanceModificationInstructionDto.type) &&
        Objects.equals(this.variables, processInstanceModificationInstructionDto.variables) &&
        Objects.equals(this.activityId, processInstanceModificationInstructionDto.activityId) &&
        Objects.equals(this.transitionId, processInstanceModificationInstructionDto.transitionId) &&
        Objects.equals(this.activityInstanceId, processInstanceModificationInstructionDto.activityInstanceId) &&
        Objects.equals(this.transitionInstanceId, processInstanceModificationInstructionDto.transitionInstanceId) &&
        Objects.equals(this.ancestorActivityInstanceId, processInstanceModificationInstructionDto.ancestorActivityInstanceId) &&
        Objects.equals(this.cancelCurrentActiveActivityInstances, processInstanceModificationInstructionDto.cancelCurrentActiveActivityInstances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, variables, activityId, transitionId, activityInstanceId, transitionInstanceId, ancestorActivityInstanceId, cancelCurrentActiveActivityInstances);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessInstanceModificationInstructionDto {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    transitionId: ").append(toIndentedString(transitionId)).append("\n");
    sb.append("    activityInstanceId: ").append(toIndentedString(activityInstanceId)).append("\n");
    sb.append("    transitionInstanceId: ").append(toIndentedString(transitionInstanceId)).append("\n");
    sb.append("    ancestorActivityInstanceId: ").append(toIndentedString(ancestorActivityInstanceId)).append("\n");
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
