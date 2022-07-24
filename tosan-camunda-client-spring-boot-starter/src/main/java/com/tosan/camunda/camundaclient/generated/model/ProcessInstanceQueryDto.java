package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * A process instance query which defines a group of process instances
 */
@Schema(description = "A process instance query which defines a group of process instances")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class ProcessInstanceQueryDto   {
  @JsonProperty("deploymentId")
  private String deploymentId = null;

  @JsonProperty("processDefinitionId")
  private String processDefinitionId = null;

  @JsonProperty("processDefinitionKey")
  private String processDefinitionKey = null;

  @JsonProperty("processDefinitionKeyIn")
  @Valid
  private List<String> processDefinitionKeyIn = null;

  @JsonProperty("processDefinitionKeyNotIn")
  @Valid
  private List<String> processDefinitionKeyNotIn = null;

  @JsonProperty("businessKey")
  private String businessKey = null;

  @JsonProperty("businessKeyLike")
  private String businessKeyLike = null;

  @JsonProperty("caseInstanceId")
  private String caseInstanceId = null;

  @JsonProperty("superProcessInstance")
  private String superProcessInstance = null;

  @JsonProperty("subProcessInstance")
  private String subProcessInstance = null;

  @JsonProperty("superCaseInstance")
  private String superCaseInstance = null;

  @JsonProperty("subCaseInstance")
  private String subCaseInstance = null;

  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("suspended")
  private Boolean suspended = null;

  @JsonProperty("processInstanceIds")
  @Valid
  private List<String> processInstanceIds = null;

  @JsonProperty("withIncident")
  private Boolean withIncident = null;

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

  @JsonProperty("withoutTenantId")
  private Boolean withoutTenantId = null;

  @JsonProperty("processDefinitionWithoutTenantId")
  private Boolean processDefinitionWithoutTenantId = null;

  @JsonProperty("activityIdIn")
  @Valid
  private List<String> activityIdIn = null;

  @JsonProperty("rootProcessInstances")
  private Boolean rootProcessInstances = null;

  @JsonProperty("leafProcessInstances")
  private Boolean leafProcessInstances = null;

  @JsonProperty("variables")
  @Valid
  private List<VariableQueryParameterDto> variables = null;

  @JsonProperty("variableNamesIgnoreCase")
  private Boolean variableNamesIgnoreCase = null;

  @JsonProperty("variableValuesIgnoreCase")
  private Boolean variableValuesIgnoreCase = null;

  @JsonProperty("orQueries")
  @Valid
  private List<ProcessInstanceQueryDto> orQueries = null;

  @JsonProperty("sorting")
  @Valid
  private List<ProcessInstanceQueryDtoSorting> sorting = null;

  public ProcessInstanceQueryDto deploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
    return this;
  }

  /**
   * Filter by the deployment the id belongs to.
   * @return deploymentId
   **/
  @Schema(description = "Filter by the deployment the id belongs to.")
  
    public String getDeploymentId() {
    return deploymentId;
  }

  public void setDeploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
  }

  public ProcessInstanceQueryDto processDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
    return this;
  }

  /**
   * Filter by the process definition the instances run on.
   * @return processDefinitionId
   **/
  @Schema(description = "Filter by the process definition the instances run on.")
  
    public String getProcessDefinitionId() {
    return processDefinitionId;
  }

  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }

  public ProcessInstanceQueryDto processDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
    return this;
  }

  /**
   * Filter by the key of the process definition the instances run on.
   * @return processDefinitionKey
   **/
  @Schema(description = "Filter by the key of the process definition the instances run on.")
  
    public String getProcessDefinitionKey() {
    return processDefinitionKey;
  }

  public void setProcessDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
  }

  public ProcessInstanceQueryDto processDefinitionKeyIn(List<String> processDefinitionKeyIn) {
    this.processDefinitionKeyIn = processDefinitionKeyIn;
    return this;
  }

  public ProcessInstanceQueryDto addProcessDefinitionKeyInItem(String processDefinitionKeyInItem) {
    if (this.processDefinitionKeyIn == null) {
      this.processDefinitionKeyIn = new ArrayList<>();
    }
    this.processDefinitionKeyIn.add(processDefinitionKeyInItem);
    return this;
  }

  /**
   * Filter by a list of process definition keys. A process instance must have one of the given process definition keys. Must be a JSON array of Strings.
   * @return processDefinitionKeyIn
   **/
  @Schema(description = "Filter by a list of process definition keys. A process instance must have one of the given process definition keys. Must be a JSON array of Strings.")
  
    public List<String> getProcessDefinitionKeyIn() {
    return processDefinitionKeyIn;
  }

  public void setProcessDefinitionKeyIn(List<String> processDefinitionKeyIn) {
    this.processDefinitionKeyIn = processDefinitionKeyIn;
  }

  public ProcessInstanceQueryDto processDefinitionKeyNotIn(List<String> processDefinitionKeyNotIn) {
    this.processDefinitionKeyNotIn = processDefinitionKeyNotIn;
    return this;
  }

  public ProcessInstanceQueryDto addProcessDefinitionKeyNotInItem(String processDefinitionKeyNotInItem) {
    if (this.processDefinitionKeyNotIn == null) {
      this.processDefinitionKeyNotIn = new ArrayList<>();
    }
    this.processDefinitionKeyNotIn.add(processDefinitionKeyNotInItem);
    return this;
  }

  /**
   * Exclude instances by a list of process definition keys. A process instance must not have one of the given process definition keys. Must be a JSON array of Strings.
   * @return processDefinitionKeyNotIn
   **/
  @Schema(description = "Exclude instances by a list of process definition keys. A process instance must not have one of the given process definition keys. Must be a JSON array of Strings.")
  
    public List<String> getProcessDefinitionKeyNotIn() {
    return processDefinitionKeyNotIn;
  }

  public void setProcessDefinitionKeyNotIn(List<String> processDefinitionKeyNotIn) {
    this.processDefinitionKeyNotIn = processDefinitionKeyNotIn;
  }

  public ProcessInstanceQueryDto businessKey(String businessKey) {
    this.businessKey = businessKey;
    return this;
  }

  /**
   * Filter by process instance business key.
   * @return businessKey
   **/
  @Schema(description = "Filter by process instance business key.")
  
    public String getBusinessKey() {
    return businessKey;
  }

  public void setBusinessKey(String businessKey) {
    this.businessKey = businessKey;
  }

  public ProcessInstanceQueryDto businessKeyLike(String businessKeyLike) {
    this.businessKeyLike = businessKeyLike;
    return this;
  }

  /**
   * Filter by process instance business key that the parameter is a substring of.
   * @return businessKeyLike
   **/
  @Schema(description = "Filter by process instance business key that the parameter is a substring of.")
  
    public String getBusinessKeyLike() {
    return businessKeyLike;
  }

  public void setBusinessKeyLike(String businessKeyLike) {
    this.businessKeyLike = businessKeyLike;
  }

  public ProcessInstanceQueryDto caseInstanceId(String caseInstanceId) {
    this.caseInstanceId = caseInstanceId;
    return this;
  }

  /**
   * Filter by case instance id.
   * @return caseInstanceId
   **/
  @Schema(description = "Filter by case instance id.")
  
    public String getCaseInstanceId() {
    return caseInstanceId;
  }

  public void setCaseInstanceId(String caseInstanceId) {
    this.caseInstanceId = caseInstanceId;
  }

  public ProcessInstanceQueryDto superProcessInstance(String superProcessInstance) {
    this.superProcessInstance = superProcessInstance;
    return this;
  }

  /**
   * Restrict query to all process instances that are sub process instances of the given process instance. Takes a process instance id.
   * @return superProcessInstance
   **/
  @Schema(description = "Restrict query to all process instances that are sub process instances of the given process instance. Takes a process instance id.")
  
    public String getSuperProcessInstance() {
    return superProcessInstance;
  }

  public void setSuperProcessInstance(String superProcessInstance) {
    this.superProcessInstance = superProcessInstance;
  }

  public ProcessInstanceQueryDto subProcessInstance(String subProcessInstance) {
    this.subProcessInstance = subProcessInstance;
    return this;
  }

  /**
   * Restrict query to all process instances that have the given process instance as a sub process instance. Takes a process instance id.
   * @return subProcessInstance
   **/
  @Schema(description = "Restrict query to all process instances that have the given process instance as a sub process instance. Takes a process instance id.")
  
    public String getSubProcessInstance() {
    return subProcessInstance;
  }

  public void setSubProcessInstance(String subProcessInstance) {
    this.subProcessInstance = subProcessInstance;
  }

  public ProcessInstanceQueryDto superCaseInstance(String superCaseInstance) {
    this.superCaseInstance = superCaseInstance;
    return this;
  }

  /**
   * Restrict query to all process instances that are sub process instances of the given case instance. Takes a case instance id.
   * @return superCaseInstance
   **/
  @Schema(description = "Restrict query to all process instances that are sub process instances of the given case instance. Takes a case instance id.")
  
    public String getSuperCaseInstance() {
    return superCaseInstance;
  }

  public void setSuperCaseInstance(String superCaseInstance) {
    this.superCaseInstance = superCaseInstance;
  }

  public ProcessInstanceQueryDto subCaseInstance(String subCaseInstance) {
    this.subCaseInstance = subCaseInstance;
    return this;
  }

  /**
   * Restrict query to all process instances that have the given case instance as a sub case instance. Takes a case instance id.
   * @return subCaseInstance
   **/
  @Schema(description = "Restrict query to all process instances that have the given case instance as a sub case instance. Takes a case instance id.")
  
    public String getSubCaseInstance() {
    return subCaseInstance;
  }

  public void setSubCaseInstance(String subCaseInstance) {
    this.subCaseInstance = subCaseInstance;
  }

  public ProcessInstanceQueryDto active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Only include active process instances. Value may only be true, as false is the default behavior.
   * @return active
   **/
  @Schema(description = "Only include active process instances. Value may only be true, as false is the default behavior.")
  
    public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public ProcessInstanceQueryDto suspended(Boolean suspended) {
    this.suspended = suspended;
    return this;
  }

  /**
   * Only include suspended process instances. Value may only be true, as false is the default behavior.
   * @return suspended
   **/
  @Schema(description = "Only include suspended process instances. Value may only be true, as false is the default behavior.")
  
    public Boolean isSuspended() {
    return suspended;
  }

  public void setSuspended(Boolean suspended) {
    this.suspended = suspended;
  }

  public ProcessInstanceQueryDto processInstanceIds(List<String> processInstanceIds) {
    this.processInstanceIds = processInstanceIds;
    return this;
  }

  public ProcessInstanceQueryDto addProcessInstanceIdsItem(String processInstanceIdsItem) {
    if (this.processInstanceIds == null) {
      this.processInstanceIds = new ArrayList<>();
    }
    this.processInstanceIds.add(processInstanceIdsItem);
    return this;
  }

  /**
   * Filter by a list of process instance ids. Must be a JSON array of Strings.
   * @return processInstanceIds
   **/
  @Schema(description = "Filter by a list of process instance ids. Must be a JSON array of Strings.")
  
    public List<String> getProcessInstanceIds() {
    return processInstanceIds;
  }

  public void setProcessInstanceIds(List<String> processInstanceIds) {
    this.processInstanceIds = processInstanceIds;
  }

  public ProcessInstanceQueryDto withIncident(Boolean withIncident) {
    this.withIncident = withIncident;
    return this;
  }

  /**
   * Filter by presence of incidents. Selects only process instances that have an incident.
   * @return withIncident
   **/
  @Schema(description = "Filter by presence of incidents. Selects only process instances that have an incident.")
  
    public Boolean isWithIncident() {
    return withIncident;
  }

  public void setWithIncident(Boolean withIncident) {
    this.withIncident = withIncident;
  }

  public ProcessInstanceQueryDto incidentId(String incidentId) {
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

  public ProcessInstanceQueryDto incidentType(String incidentType) {
    this.incidentType = incidentType;
    return this;
  }

  /**
   * Filter by the incident type. See the User Guide for a list of incident types.
   * @return incidentType
   **/
  @Schema(description = "Filter by the incident type. See the User Guide for a list of incident types.")
  
    public String getIncidentType() {
    return incidentType;
  }

  public void setIncidentType(String incidentType) {
    this.incidentType = incidentType;
  }

  public ProcessInstanceQueryDto incidentMessage(String incidentMessage) {
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

  public ProcessInstanceQueryDto incidentMessageLike(String incidentMessageLike) {
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

  public ProcessInstanceQueryDto tenantIdIn(List<String> tenantIdIn) {
    this.tenantIdIn = tenantIdIn;
    return this;
  }

  public ProcessInstanceQueryDto addTenantIdInItem(String tenantIdInItem) {
    if (this.tenantIdIn == null) {
      this.tenantIdIn = new ArrayList<>();
    }
    this.tenantIdIn.add(tenantIdInItem);
    return this;
  }

  /**
   * Filter by a list of tenant ids. A process instance must have one of the given tenant ids. Must be a JSON array of Strings.
   * @return tenantIdIn
   **/
  @Schema(description = "Filter by a list of tenant ids. A process instance must have one of the given tenant ids. Must be a JSON array of Strings.")
  
    public List<String> getTenantIdIn() {
    return tenantIdIn;
  }

  public void setTenantIdIn(List<String> tenantIdIn) {
    this.tenantIdIn = tenantIdIn;
  }

  public ProcessInstanceQueryDto withoutTenantId(Boolean withoutTenantId) {
    this.withoutTenantId = withoutTenantId;
    return this;
  }

  /**
   * Only include process instances which belong to no tenant. Value may only be true, as false is the default behavior.
   * @return withoutTenantId
   **/
  @Schema(description = "Only include process instances which belong to no tenant. Value may only be true, as false is the default behavior.")
  
    public Boolean isWithoutTenantId() {
    return withoutTenantId;
  }

  public void setWithoutTenantId(Boolean withoutTenantId) {
    this.withoutTenantId = withoutTenantId;
  }

  public ProcessInstanceQueryDto processDefinitionWithoutTenantId(Boolean processDefinitionWithoutTenantId) {
    this.processDefinitionWithoutTenantId = processDefinitionWithoutTenantId;
    return this;
  }

  /**
   * Only include process instances which process definition has no tenant id.
   * @return processDefinitionWithoutTenantId
   **/
  @Schema(description = "Only include process instances which process definition has no tenant id.")
  
    public Boolean isProcessDefinitionWithoutTenantId() {
    return processDefinitionWithoutTenantId;
  }

  public void setProcessDefinitionWithoutTenantId(Boolean processDefinitionWithoutTenantId) {
    this.processDefinitionWithoutTenantId = processDefinitionWithoutTenantId;
  }

  public ProcessInstanceQueryDto activityIdIn(List<String> activityIdIn) {
    this.activityIdIn = activityIdIn;
    return this;
  }

  public ProcessInstanceQueryDto addActivityIdInItem(String activityIdInItem) {
    if (this.activityIdIn == null) {
      this.activityIdIn = new ArrayList<>();
    }
    this.activityIdIn.add(activityIdInItem);
    return this;
  }

  /**
   * Filter by a list of activity ids. A process instance must currently wait in a leaf activity with one of the given activity ids.
   * @return activityIdIn
   **/
  @Schema(description = "Filter by a list of activity ids. A process instance must currently wait in a leaf activity with one of the given activity ids.")
  
    public List<String> getActivityIdIn() {
    return activityIdIn;
  }

  public void setActivityIdIn(List<String> activityIdIn) {
    this.activityIdIn = activityIdIn;
  }

  public ProcessInstanceQueryDto rootProcessInstances(Boolean rootProcessInstances) {
    this.rootProcessInstances = rootProcessInstances;
    return this;
  }

  /**
   * Restrict the query to all process instances that are top level process instances.
   * @return rootProcessInstances
   **/
  @Schema(description = "Restrict the query to all process instances that are top level process instances.")
  
    public Boolean isRootProcessInstances() {
    return rootProcessInstances;
  }

  public void setRootProcessInstances(Boolean rootProcessInstances) {
    this.rootProcessInstances = rootProcessInstances;
  }

  public ProcessInstanceQueryDto leafProcessInstances(Boolean leafProcessInstances) {
    this.leafProcessInstances = leafProcessInstances;
    return this;
  }

  /**
   * Restrict the query to all process instances that are leaf instances. (i.e. don't have any sub instances)
   * @return leafProcessInstances
   **/
  @Schema(description = "Restrict the query to all process instances that are leaf instances. (i.e. don't have any sub instances)")
  
    public Boolean isLeafProcessInstances() {
    return leafProcessInstances;
  }

  public void setLeafProcessInstances(Boolean leafProcessInstances) {
    this.leafProcessInstances = leafProcessInstances;
  }

  public ProcessInstanceQueryDto variables(List<VariableQueryParameterDto> variables) {
    this.variables = variables;
    return this;
  }

  public ProcessInstanceQueryDto addVariablesItem(VariableQueryParameterDto variablesItem) {
    if (this.variables == null) {
      this.variables = new ArrayList<>();
    }
    this.variables.add(variablesItem);
    return this;
  }

  /**
   * A JSON array to only include process instances that have variables with certain values. The array consists of objects with the three properties `name`, `operator` and `value`. `name` (String) is the variable name, `operator` (String) is the comparison operator to be used and `value` the variable value. The `value` may be String, Number or Boolean.  Valid operator values are: `eq` - equal to; `neq` - not equal to; `gt` - greater than; `gteq` - greater than or equal to; `lt` - lower than; `lteq` - lower than or equal to; `like`.
   * @return variables
   **/
  @Schema(description = "A JSON array to only include process instances that have variables with certain values. The array consists of objects with the three properties `name`, `operator` and `value`. `name` (String) is the variable name, `operator` (String) is the comparison operator to be used and `value` the variable value. The `value` may be String, Number or Boolean.  Valid operator values are: `eq` - equal to; `neq` - not equal to; `gt` - greater than; `gteq` - greater than or equal to; `lt` - lower than; `lteq` - lower than or equal to; `like`.")
      @Valid
    public List<VariableQueryParameterDto> getVariables() {
    return variables;
  }

  public void setVariables(List<VariableQueryParameterDto> variables) {
    this.variables = variables;
  }

  public ProcessInstanceQueryDto variableNamesIgnoreCase(Boolean variableNamesIgnoreCase) {
    this.variableNamesIgnoreCase = variableNamesIgnoreCase;
    return this;
  }

  /**
   * Match all variable names in this query case-insensitively. If set to true variableName and variablename are treated as equal.
   * @return variableNamesIgnoreCase
   **/
  @Schema(description = "Match all variable names in this query case-insensitively. If set to true variableName and variablename are treated as equal.")
  
    public Boolean isVariableNamesIgnoreCase() {
    return variableNamesIgnoreCase;
  }

  public void setVariableNamesIgnoreCase(Boolean variableNamesIgnoreCase) {
    this.variableNamesIgnoreCase = variableNamesIgnoreCase;
  }

  public ProcessInstanceQueryDto variableValuesIgnoreCase(Boolean variableValuesIgnoreCase) {
    this.variableValuesIgnoreCase = variableValuesIgnoreCase;
    return this;
  }

  /**
   * Match all variable values in this query case-insensitively. If set to true variableValue and variablevalue are treated as equal.
   * @return variableValuesIgnoreCase
   **/
  @Schema(description = "Match all variable values in this query case-insensitively. If set to true variableValue and variablevalue are treated as equal.")
  
    public Boolean isVariableValuesIgnoreCase() {
    return variableValuesIgnoreCase;
  }

  public void setVariableValuesIgnoreCase(Boolean variableValuesIgnoreCase) {
    this.variableValuesIgnoreCase = variableValuesIgnoreCase;
  }

  public ProcessInstanceQueryDto orQueries(List<ProcessInstanceQueryDto> orQueries) {
    this.orQueries = orQueries;
    return this;
  }

  public ProcessInstanceQueryDto addOrQueriesItem(ProcessInstanceQueryDto orQueriesItem) {
    if (this.orQueries == null) {
      this.orQueries = new ArrayList<>();
    }
    this.orQueries.add(orQueriesItem);
    return this;
  }

  /**
   * A JSON array of nested process instance queries with OR semantics. A process instance matches a nested query if it fulfills at least one of the query's predicates. With multiple nested queries, a process instance must fulfill at least one predicate of each query (Conjunctive Normal Form). All process instance query properties can be used except for: `sorting` See the [User guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/process-engine-api/#or-queries) for more information about OR queries.
   * @return orQueries
   **/
  @Schema(description = "A JSON array of nested process instance queries with OR semantics. A process instance matches a nested query if it fulfills at least one of the query's predicates. With multiple nested queries, a process instance must fulfill at least one predicate of each query (Conjunctive Normal Form). All process instance query properties can be used except for: `sorting` See the [User guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/process-engine-api/#or-queries) for more information about OR queries.")
      @Valid
    public List<ProcessInstanceQueryDto> getOrQueries() {
    return orQueries;
  }

  public void setOrQueries(List<ProcessInstanceQueryDto> orQueries) {
    this.orQueries = orQueries;
  }

  public ProcessInstanceQueryDto sorting(List<ProcessInstanceQueryDtoSorting> sorting) {
    this.sorting = sorting;
    return this;
  }

  public ProcessInstanceQueryDto addSortingItem(ProcessInstanceQueryDtoSorting sortingItem) {
    if (this.sorting == null) {
      this.sorting = new ArrayList<>();
    }
    this.sorting.add(sortingItem);
    return this;
  }

  /**
   * Apply sorting of the result
   * @return sorting
   **/
  @Schema(description = "Apply sorting of the result")
      @Valid
    public List<ProcessInstanceQueryDtoSorting> getSorting() {
    return sorting;
  }

  public void setSorting(List<ProcessInstanceQueryDtoSorting> sorting) {
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
    ProcessInstanceQueryDto processInstanceQueryDto = (ProcessInstanceQueryDto) o;
    return Objects.equals(this.deploymentId, processInstanceQueryDto.deploymentId) &&
        Objects.equals(this.processDefinitionId, processInstanceQueryDto.processDefinitionId) &&
        Objects.equals(this.processDefinitionKey, processInstanceQueryDto.processDefinitionKey) &&
        Objects.equals(this.processDefinitionKeyIn, processInstanceQueryDto.processDefinitionKeyIn) &&
        Objects.equals(this.processDefinitionKeyNotIn, processInstanceQueryDto.processDefinitionKeyNotIn) &&
        Objects.equals(this.businessKey, processInstanceQueryDto.businessKey) &&
        Objects.equals(this.businessKeyLike, processInstanceQueryDto.businessKeyLike) &&
        Objects.equals(this.caseInstanceId, processInstanceQueryDto.caseInstanceId) &&
        Objects.equals(this.superProcessInstance, processInstanceQueryDto.superProcessInstance) &&
        Objects.equals(this.subProcessInstance, processInstanceQueryDto.subProcessInstance) &&
        Objects.equals(this.superCaseInstance, processInstanceQueryDto.superCaseInstance) &&
        Objects.equals(this.subCaseInstance, processInstanceQueryDto.subCaseInstance) &&
        Objects.equals(this.active, processInstanceQueryDto.active) &&
        Objects.equals(this.suspended, processInstanceQueryDto.suspended) &&
        Objects.equals(this.processInstanceIds, processInstanceQueryDto.processInstanceIds) &&
        Objects.equals(this.withIncident, processInstanceQueryDto.withIncident) &&
        Objects.equals(this.incidentId, processInstanceQueryDto.incidentId) &&
        Objects.equals(this.incidentType, processInstanceQueryDto.incidentType) &&
        Objects.equals(this.incidentMessage, processInstanceQueryDto.incidentMessage) &&
        Objects.equals(this.incidentMessageLike, processInstanceQueryDto.incidentMessageLike) &&
        Objects.equals(this.tenantIdIn, processInstanceQueryDto.tenantIdIn) &&
        Objects.equals(this.withoutTenantId, processInstanceQueryDto.withoutTenantId) &&
        Objects.equals(this.processDefinitionWithoutTenantId, processInstanceQueryDto.processDefinitionWithoutTenantId) &&
        Objects.equals(this.activityIdIn, processInstanceQueryDto.activityIdIn) &&
        Objects.equals(this.rootProcessInstances, processInstanceQueryDto.rootProcessInstances) &&
        Objects.equals(this.leafProcessInstances, processInstanceQueryDto.leafProcessInstances) &&
        Objects.equals(this.variables, processInstanceQueryDto.variables) &&
        Objects.equals(this.variableNamesIgnoreCase, processInstanceQueryDto.variableNamesIgnoreCase) &&
        Objects.equals(this.variableValuesIgnoreCase, processInstanceQueryDto.variableValuesIgnoreCase) &&
        Objects.equals(this.orQueries, processInstanceQueryDto.orQueries) &&
        Objects.equals(this.sorting, processInstanceQueryDto.sorting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deploymentId, processDefinitionId, processDefinitionKey, processDefinitionKeyIn, processDefinitionKeyNotIn, businessKey, businessKeyLike, caseInstanceId, superProcessInstance, subProcessInstance, superCaseInstance, subCaseInstance, active, suspended, processInstanceIds, withIncident, incidentId, incidentType, incidentMessage, incidentMessageLike, tenantIdIn, withoutTenantId, processDefinitionWithoutTenantId, activityIdIn, rootProcessInstances, leafProcessInstances, variables, variableNamesIgnoreCase, variableValuesIgnoreCase, orQueries, sorting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessInstanceQueryDto {\n");
    
    sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    processDefinitionKeyIn: ").append(toIndentedString(processDefinitionKeyIn)).append("\n");
    sb.append("    processDefinitionKeyNotIn: ").append(toIndentedString(processDefinitionKeyNotIn)).append("\n");
    sb.append("    businessKey: ").append(toIndentedString(businessKey)).append("\n");
    sb.append("    businessKeyLike: ").append(toIndentedString(businessKeyLike)).append("\n");
    sb.append("    caseInstanceId: ").append(toIndentedString(caseInstanceId)).append("\n");
    sb.append("    superProcessInstance: ").append(toIndentedString(superProcessInstance)).append("\n");
    sb.append("    subProcessInstance: ").append(toIndentedString(subProcessInstance)).append("\n");
    sb.append("    superCaseInstance: ").append(toIndentedString(superCaseInstance)).append("\n");
    sb.append("    subCaseInstance: ").append(toIndentedString(subCaseInstance)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
    sb.append("    processInstanceIds: ").append(toIndentedString(processInstanceIds)).append("\n");
    sb.append("    withIncident: ").append(toIndentedString(withIncident)).append("\n");
    sb.append("    incidentId: ").append(toIndentedString(incidentId)).append("\n");
    sb.append("    incidentType: ").append(toIndentedString(incidentType)).append("\n");
    sb.append("    incidentMessage: ").append(toIndentedString(incidentMessage)).append("\n");
    sb.append("    incidentMessageLike: ").append(toIndentedString(incidentMessageLike)).append("\n");
    sb.append("    tenantIdIn: ").append(toIndentedString(tenantIdIn)).append("\n");
    sb.append("    withoutTenantId: ").append(toIndentedString(withoutTenantId)).append("\n");
    sb.append("    processDefinitionWithoutTenantId: ").append(toIndentedString(processDefinitionWithoutTenantId)).append("\n");
    sb.append("    activityIdIn: ").append(toIndentedString(activityIdIn)).append("\n");
    sb.append("    rootProcessInstances: ").append(toIndentedString(rootProcessInstances)).append("\n");
    sb.append("    leafProcessInstances: ").append(toIndentedString(leafProcessInstances)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    variableNamesIgnoreCase: ").append(toIndentedString(variableNamesIgnoreCase)).append("\n");
    sb.append("    variableValuesIgnoreCase: ").append(toIndentedString(variableValuesIgnoreCase)).append("\n");
    sb.append("    orQueries: ").append(toIndentedString(orQueries)).append("\n");
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
