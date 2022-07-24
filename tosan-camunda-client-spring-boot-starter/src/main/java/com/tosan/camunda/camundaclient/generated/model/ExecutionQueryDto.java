package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * A Execution instance query which defines a list of Execution instances
 */
@Schema(description = "A Execution instance query which defines a list of Execution instances")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class ExecutionQueryDto   {
  @JsonProperty("businessKey")
  private String businessKey = null;

  @JsonProperty("processDefinitionId")
  private String processDefinitionId = null;

  @JsonProperty("processDefinitionKey")
  private String processDefinitionKey = null;

  @JsonProperty("processInstanceId")
  private String processInstanceId = null;

  @JsonProperty("activityId")
  private String activityId = null;

  @JsonProperty("signalEventSubscriptionName")
  private String signalEventSubscriptionName = null;

  @JsonProperty("messageEventSubscriptionName")
  private String messageEventSubscriptionName = null;

  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("suspended")
  private Boolean suspended = null;

  @JsonProperty("incidentId")
  private String incidentId = null;

  @JsonProperty("incidentType")
  private String incidentType = null;

  @JsonProperty("incidentMessage")
  private String incidentMessage = null;

  @JsonProperty("incidentMessageLike")
  private String incidentMessageLike = null;

  @JsonProperty("tenantIdIn")
  @Valid
  private List<String> tenantIdIn = null;

  @JsonProperty("variables")
  @Valid
  private List<VariableQueryParameterDto> variables = null;

  @JsonProperty("processVariables")
  @Valid
  private List<VariableQueryParameterDto> processVariables = null;

  @JsonProperty("variableNamesIgnoreCase")
  private Boolean variableNamesIgnoreCase = null;

  @JsonProperty("variableValuesIgnoreCase")
  private Boolean variableValuesIgnoreCase = null;

  @JsonProperty("sorting")
  @Valid
  private List<ExecutionQueryDtoSorting> sorting = null;

  public ExecutionQueryDto businessKey(String businessKey) {
    this.businessKey = businessKey;
    return this;
  }

  /**
   * Filter by the business key of the process instances the executions belong to.
   * @return businessKey
   **/
  @Schema(description = "Filter by the business key of the process instances the executions belong to.")
  
    public String getBusinessKey() {
    return businessKey;
  }

  public void setBusinessKey(String businessKey) {
    this.businessKey = businessKey;
  }

  public ExecutionQueryDto processDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
    return this;
  }

  /**
   * Filter by the process definition the executions run on.
   * @return processDefinitionId
   **/
  @Schema(description = "Filter by the process definition the executions run on.")
  
    public String getProcessDefinitionId() {
    return processDefinitionId;
  }

  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }

  public ExecutionQueryDto processDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
    return this;
  }

  /**
   * Filter by the key of the process definition the executions run on.
   * @return processDefinitionKey
   **/
  @Schema(description = "Filter by the key of the process definition the executions run on.")
  
    public String getProcessDefinitionKey() {
    return processDefinitionKey;
  }

  public void setProcessDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
  }

  public ExecutionQueryDto processInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
    return this;
  }

  /**
   * Filter by the id of the process instance the execution belongs to.
   * @return processInstanceId
   **/
  @Schema(description = "Filter by the id of the process instance the execution belongs to.")
  
    public String getProcessInstanceId() {
    return processInstanceId;
  }

  public void setProcessInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
  }

  public ExecutionQueryDto activityId(String activityId) {
    this.activityId = activityId;
    return this;
  }

  /**
   * Filter by the id of the activity the execution currently executes.
   * @return activityId
   **/
  @Schema(description = "Filter by the id of the activity the execution currently executes.")
  
    public String getActivityId() {
    return activityId;
  }

  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }

  public ExecutionQueryDto signalEventSubscriptionName(String signalEventSubscriptionName) {
    this.signalEventSubscriptionName = signalEventSubscriptionName;
    return this;
  }

  /**
   * Select only those executions that expect a signal of the given name.
   * @return signalEventSubscriptionName
   **/
  @Schema(description = "Select only those executions that expect a signal of the given name.")
  
    public String getSignalEventSubscriptionName() {
    return signalEventSubscriptionName;
  }

  public void setSignalEventSubscriptionName(String signalEventSubscriptionName) {
    this.signalEventSubscriptionName = signalEventSubscriptionName;
  }

  public ExecutionQueryDto messageEventSubscriptionName(String messageEventSubscriptionName) {
    this.messageEventSubscriptionName = messageEventSubscriptionName;
    return this;
  }

  /**
   * Select only those executions that expect a message of the given name.
   * @return messageEventSubscriptionName
   **/
  @Schema(description = "Select only those executions that expect a message of the given name.")
  
    public String getMessageEventSubscriptionName() {
    return messageEventSubscriptionName;
  }

  public void setMessageEventSubscriptionName(String messageEventSubscriptionName) {
    this.messageEventSubscriptionName = messageEventSubscriptionName;
  }

  public ExecutionQueryDto active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Only include active executions. Value may only be `true`, as `false` is the default behavior.
   * @return active
   **/
  @Schema(description = "Only include active executions. Value may only be `true`, as `false` is the default behavior.")
  
    public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public ExecutionQueryDto suspended(Boolean suspended) {
    this.suspended = suspended;
    return this;
  }

  /**
   * Only include suspended executions. Value may only be `true`, as `false` is the default behavior.
   * @return suspended
   **/
  @Schema(description = "Only include suspended executions. Value may only be `true`, as `false` is the default behavior.")
  
    public Boolean isSuspended() {
    return suspended;
  }

  public void setSuspended(Boolean suspended) {
    this.suspended = suspended;
  }

  public ExecutionQueryDto incidentId(String incidentId) {
    this.incidentId = incidentId;
    return this;
  }

  /**
   * Filter by the incident id.
   * @return incidentId
   **/
  @Schema(description = "Filter by the incident id.")
  
    public String getIncidentId() {
    return incidentId;
  }

  public void setIncidentId(String incidentId) {
    this.incidentId = incidentId;
  }

  public ExecutionQueryDto incidentType(String incidentType) {
    this.incidentType = incidentType;
    return this;
  }

  /**
   * Filter by the incident type. See the [User Guide](/manual/develop/user-guide/process-engine/incidents/#incident-types) for a list of incident types.
   * @return incidentType
   **/
  @Schema(description = "Filter by the incident type. See the [User Guide](/manual/develop/user-guide/process-engine/incidents/#incident-types) for a list of incident types.")
  
    public String getIncidentType() {
    return incidentType;
  }

  public void setIncidentType(String incidentType) {
    this.incidentType = incidentType;
  }

  public ExecutionQueryDto incidentMessage(String incidentMessage) {
    this.incidentMessage = incidentMessage;
    return this;
  }

  /**
   * Filter by the incident message. Exact match.
   * @return incidentMessage
   **/
  @Schema(description = "Filter by the incident message. Exact match.")
  
    public String getIncidentMessage() {
    return incidentMessage;
  }

  public void setIncidentMessage(String incidentMessage) {
    this.incidentMessage = incidentMessage;
  }

  public ExecutionQueryDto incidentMessageLike(String incidentMessageLike) {
    this.incidentMessageLike = incidentMessageLike;
    return this;
  }

  /**
   * Filter by the incident message that the parameter is a substring of.
   * @return incidentMessageLike
   **/
  @Schema(description = "Filter by the incident message that the parameter is a substring of.")
  
    public String getIncidentMessageLike() {
    return incidentMessageLike;
  }

  public void setIncidentMessageLike(String incidentMessageLike) {
    this.incidentMessageLike = incidentMessageLike;
  }

  public ExecutionQueryDto tenantIdIn(List<String> tenantIdIn) {
    this.tenantIdIn = tenantIdIn;
    return this;
  }

  public ExecutionQueryDto addTenantIdInItem(String tenantIdInItem) {
    if (this.tenantIdIn == null) {
      this.tenantIdIn = new ArrayList<>();
    }
    this.tenantIdIn.add(tenantIdInItem);
    return this;
  }

  /**
   * Filter by a  list of tenant ids. An execution must have one of the given tenant ids.
   * @return tenantIdIn
   **/
  @Schema(description = "Filter by a  list of tenant ids. An execution must have one of the given tenant ids.")
  
    public List<String> getTenantIdIn() {
    return tenantIdIn;
  }

  public void setTenantIdIn(List<String> tenantIdIn) {
    this.tenantIdIn = tenantIdIn;
  }

  public ExecutionQueryDto variables(List<VariableQueryParameterDto> variables) {
    this.variables = variables;
    return this;
  }

  public ExecutionQueryDto addVariablesItem(VariableQueryParameterDto variablesItem) {
    if (this.variables == null) {
      this.variables = new ArrayList<>();
    }
    this.variables.add(variablesItem);
    return this;
  }

  /**
   * An array to only include executions that have variables with certain values.  The array consists of objects with the three properties `name`, `operator` and `value`. `name (String)` is the variable name, `operator (String)` is the comparison operator to be used and `value` the variable value. `value` may be `String`, `Number` or `Boolean`.  Valid operator values are: `eq` - equal to; `neq` - not equal to; `gt` - greater than; `gteq` - greater than or equal to; `lt` - lower than; `lteq` - lower than or equal to; `like`.
   * @return variables
   **/
  @Schema(description = "An array to only include executions that have variables with certain values.  The array consists of objects with the three properties `name`, `operator` and `value`. `name (String)` is the variable name, `operator (String)` is the comparison operator to be used and `value` the variable value. `value` may be `String`, `Number` or `Boolean`.  Valid operator values are: `eq` - equal to; `neq` - not equal to; `gt` - greater than; `gteq` - greater than or equal to; `lt` - lower than; `lteq` - lower than or equal to; `like`.")
      @Valid
    public List<VariableQueryParameterDto> getVariables() {
    return variables;
  }

  public void setVariables(List<VariableQueryParameterDto> variables) {
    this.variables = variables;
  }

  public ExecutionQueryDto processVariables(List<VariableQueryParameterDto> processVariables) {
    this.processVariables = processVariables;
    return this;
  }

  public ExecutionQueryDto addProcessVariablesItem(VariableQueryParameterDto processVariablesItem) {
    if (this.processVariables == null) {
      this.processVariables = new ArrayList<>();
    }
    this.processVariables.add(processVariablesItem);
    return this;
  }

  /**
   * An array to only include executions that belong to a process instance with variables with certain values.  The array consists of objects with the three properties `name`, `operator` and `value`. `name (String)` is the variable name, `operator (String)` is the comparison operator to be used and `value` the variable value. `value` may be `String`, `Number` or `Boolean`.  Valid operator values are: `eq` - equal to; `neq` - not equal to.
   * @return processVariables
   **/
  @Schema(description = "An array to only include executions that belong to a process instance with variables with certain values.  The array consists of objects with the three properties `name`, `operator` and `value`. `name (String)` is the variable name, `operator (String)` is the comparison operator to be used and `value` the variable value. `value` may be `String`, `Number` or `Boolean`.  Valid operator values are: `eq` - equal to; `neq` - not equal to.")
      @Valid
    public List<VariableQueryParameterDto> getProcessVariables() {
    return processVariables;
  }

  public void setProcessVariables(List<VariableQueryParameterDto> processVariables) {
    this.processVariables = processVariables;
  }

  public ExecutionQueryDto variableNamesIgnoreCase(Boolean variableNamesIgnoreCase) {
    this.variableNamesIgnoreCase = variableNamesIgnoreCase;
    return this;
  }

  /**
   * Match all variable names provided in `variables` and `processVariables` case- insensitively. If set to `true` **variableName** and **variablename** are treated as equal.
   * @return variableNamesIgnoreCase
   **/
  @Schema(description = "Match all variable names provided in `variables` and `processVariables` case- insensitively. If set to `true` **variableName** and **variablename** are treated as equal.")
  
    public Boolean isVariableNamesIgnoreCase() {
    return variableNamesIgnoreCase;
  }

  public void setVariableNamesIgnoreCase(Boolean variableNamesIgnoreCase) {
    this.variableNamesIgnoreCase = variableNamesIgnoreCase;
  }

  public ExecutionQueryDto variableValuesIgnoreCase(Boolean variableValuesIgnoreCase) {
    this.variableValuesIgnoreCase = variableValuesIgnoreCase;
    return this;
  }

  /**
   * Match all variable values provided in `variables` and `processVariables` case- insensitively. If set to `true` **variableValue** and **variablevalue** are treated as equal.
   * @return variableValuesIgnoreCase
   **/
  @Schema(description = "Match all variable values provided in `variables` and `processVariables` case- insensitively. If set to `true` **variableValue** and **variablevalue** are treated as equal.")
  
    public Boolean isVariableValuesIgnoreCase() {
    return variableValuesIgnoreCase;
  }

  public void setVariableValuesIgnoreCase(Boolean variableValuesIgnoreCase) {
    this.variableValuesIgnoreCase = variableValuesIgnoreCase;
  }

  public ExecutionQueryDto sorting(List<ExecutionQueryDtoSorting> sorting) {
    this.sorting = sorting;
    return this;
  }

  public ExecutionQueryDto addSortingItem(ExecutionQueryDtoSorting sortingItem) {
    if (this.sorting == null) {
      this.sorting = new ArrayList<>();
    }
    this.sorting.add(sortingItem);
    return this;
  }

  /**
   * An array of criteria to sort the result by. Each element of the array is                        an object that specifies one ordering. The position in the array                        identifies the rank of an ordering, i.e., whether it is primary, secondary,                        etc. Has no effect for the `/count` endpoint
   * @return sorting
   **/
  @Schema(description = "An array of criteria to sort the result by. Each element of the array is                        an object that specifies one ordering. The position in the array                        identifies the rank of an ordering, i.e., whether it is primary, secondary,                        etc. Has no effect for the `/count` endpoint")
      @Valid
    public List<ExecutionQueryDtoSorting> getSorting() {
    return sorting;
  }

  public void setSorting(List<ExecutionQueryDtoSorting> sorting) {
    this.sorting = sorting;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecutionQueryDto executionQueryDto = (ExecutionQueryDto) o;
    return Objects.equals(this.businessKey, executionQueryDto.businessKey) &&
        Objects.equals(this.processDefinitionId, executionQueryDto.processDefinitionId) &&
        Objects.equals(this.processDefinitionKey, executionQueryDto.processDefinitionKey) &&
        Objects.equals(this.processInstanceId, executionQueryDto.processInstanceId) &&
        Objects.equals(this.activityId, executionQueryDto.activityId) &&
        Objects.equals(this.signalEventSubscriptionName, executionQueryDto.signalEventSubscriptionName) &&
        Objects.equals(this.messageEventSubscriptionName, executionQueryDto.messageEventSubscriptionName) &&
        Objects.equals(this.active, executionQueryDto.active) &&
        Objects.equals(this.suspended, executionQueryDto.suspended) &&
        Objects.equals(this.incidentId, executionQueryDto.incidentId) &&
        Objects.equals(this.incidentType, executionQueryDto.incidentType) &&
        Objects.equals(this.incidentMessage, executionQueryDto.incidentMessage) &&
        Objects.equals(this.incidentMessageLike, executionQueryDto.incidentMessageLike) &&
        Objects.equals(this.tenantIdIn, executionQueryDto.tenantIdIn) &&
        Objects.equals(this.variables, executionQueryDto.variables) &&
        Objects.equals(this.processVariables, executionQueryDto.processVariables) &&
        Objects.equals(this.variableNamesIgnoreCase, executionQueryDto.variableNamesIgnoreCase) &&
        Objects.equals(this.variableValuesIgnoreCase, executionQueryDto.variableValuesIgnoreCase) &&
        Objects.equals(this.sorting, executionQueryDto.sorting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessKey, processDefinitionId, processDefinitionKey, processInstanceId, activityId, signalEventSubscriptionName, messageEventSubscriptionName, active, suspended, incidentId, incidentType, incidentMessage, incidentMessageLike, tenantIdIn, variables, processVariables, variableNamesIgnoreCase, variableValuesIgnoreCase, sorting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecutionQueryDto {\n");
    
    sb.append("    businessKey: ").append(toIndentedString(businessKey)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    signalEventSubscriptionName: ").append(toIndentedString(signalEventSubscriptionName)).append("\n");
    sb.append("    messageEventSubscriptionName: ").append(toIndentedString(messageEventSubscriptionName)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
    sb.append("    incidentId: ").append(toIndentedString(incidentId)).append("\n");
    sb.append("    incidentType: ").append(toIndentedString(incidentType)).append("\n");
    sb.append("    incidentMessage: ").append(toIndentedString(incidentMessage)).append("\n");
    sb.append("    incidentMessageLike: ").append(toIndentedString(incidentMessageLike)).append("\n");
    sb.append("    tenantIdIn: ").append(toIndentedString(tenantIdIn)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    processVariables: ").append(toIndentedString(processVariables)).append("\n");
    sb.append("    variableNamesIgnoreCase: ").append(toIndentedString(variableNamesIgnoreCase)).append("\n");
    sb.append("    variableValuesIgnoreCase: ").append(toIndentedString(variableValuesIgnoreCase)).append("\n");
    sb.append("    sorting: ").append(toIndentedString(sorting)).append("\n");
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
