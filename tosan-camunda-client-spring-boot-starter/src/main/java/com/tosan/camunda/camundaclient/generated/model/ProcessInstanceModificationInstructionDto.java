package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tosan.camunda.camundaclient.generated.model.TriggerVariableValueDto;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ProcessInstanceModificationInstructionDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class ProcessInstanceModificationInstructionDto {

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

  private TriggerVariableValueDto variables;

  private String activityId = null;

  private String transitionId = null;

  private String activityInstanceId = null;

  private String transitionInstanceId = null;

  private String ancestorActivityInstanceId = null;

  private Boolean cancelCurrentActiveActivityInstances = null;

  /**
   * Default constructor
   * @deprecated Use {@link ProcessInstanceModificationInstructionDto#ProcessInstanceModificationInstructionDto(TypeEnum)}
   */
  @Deprecated
  public ProcessInstanceModificationInstructionDto() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProcessInstanceModificationInstructionDto(TypeEnum type) {
    this.type = type;
  }

  public ProcessInstanceModificationInstructionDto type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * **Mandatory**. One of the following values: `cancel`, `startBeforeActivity`, `startAfterActivity`, `startTransition`.  * A cancel instruction requests cancellation of a single activity instance or all instances of one activity. * A startBeforeActivity instruction requests to enter a given activity. * A startAfterActivity instruction requests to execute the single outgoing sequence flow of a given activity. * A startTransition instruction requests to execute a specific sequence flow.
   * @return type
  */
  @NotNull 
  @Schema(name = "type", description = "**Mandatory**. One of the following values: `cancel`, `startBeforeActivity`, `startAfterActivity`, `startTransition`.  * A cancel instruction requests cancellation of a single activity instance or all instances of one activity. * A startBeforeActivity instruction requests to enter a given activity. * A startAfterActivity instruction requests to execute the single outgoing sequence flow of a given activity. * A startTransition instruction requests to execute a specific sequence flow.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
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
  */
  @Valid 
  @Schema(name = "variables", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("variables")
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
  */
  
  @Schema(name = "activityId", description = "Can be used with instructions of types `startTransition`. Specifies the sequence flow to start.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activityId")
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
  */
  
  @Schema(name = "transitionId", description = "Can be used with instructions of types `startTransition`. Specifies the sequence flow to start.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("transitionId")
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
  */
  
  @Schema(name = "activityInstanceId", description = "Can be used with instructions of type `cancel`. Specifies the activity instance to cancel. Valid values are the activity instance IDs supplied by the [Get Activity Instance request](https://docs.camunda.org/manual/7.17/reference/rest/process-instance/get-activity-instances/).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activityInstanceId")
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
  */
  
  @Schema(name = "transitionInstanceId", description = "Can be used with instructions of type `cancel`. Specifies the transition instance to cancel. Valid values are the transition instance IDs supplied by the [Get Activity Instance request](https://docs.camunda.org/manual/7.17/reference/rest/process-instance/get-activity-instances/).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("transitionInstanceId")
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
  */
  
  @Schema(name = "ancestorActivityInstanceId", description = "Can be used with instructions of type `startBeforeActivity`, `startAfterActivity`, and `startTransition`. Valid values are the activity instance IDs supplied by the Get Activity Instance request. If there are multiple parent activity instances of the targeted activity, this specifies the ancestor scope in which hierarchy the activity/transition is to be instantiated.  Example: When there are two instances of a subprocess and an activity contained in the subprocess is to be started, this parameter allows to specifiy under which subprocess instance the activity should be started.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ancestorActivityInstanceId")
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
  */
  
  @Schema(name = "cancelCurrentActiveActivityInstances", description = "Can be used with instructions of type cancel. Prevents the deletion of new created activity instances.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cancelCurrentActiveActivityInstances")
  public Boolean getCancelCurrentActiveActivityInstances() {
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

