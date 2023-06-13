package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tosan.camunda.camundaclient.generated.model.ProcessInstanceQueryDtoSortingInner;
import com.tosan.camunda.camundaclient.generated.model.VariableQueryParameterDto;
import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * A process instance query which defines a group of process instances
 */

@Schema(name = "ProcessInstanceQueryDto", description = "A process instance query which defines a group of process instances")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class ProcessInstanceQueryDto {

  private String deploymentId = null;

  private String processDefinitionId = null;

  private String processDefinitionKey = null;

  @Valid
  private List<String> processDefinitionKeyIn;

  @Valid
  private List<String> processDefinitionKeyNotIn;

  private String businessKey = null;

  private String businessKeyLike = null;

  private String caseInstanceId = null;

  private String superProcessInstance = null;

  private String subProcessInstance = null;

  private String superCaseInstance = null;

  private String subCaseInstance = null;

  private Boolean active = null;

  private Boolean suspended = null;

  @Valid
  private List<String> processInstanceIds;

  private Boolean withIncident = null;

  private String incidentId = null;

  private String incidentType = null;

  private String incidentMessage = null;

  private String incidentMessageLike = null;

  @Valid
  private List<String> tenantIdIn;

  private Boolean withoutTenantId = null;

  private Boolean processDefinitionWithoutTenantId = null;

  @Valid
  private List<String> activityIdIn;

  private Boolean rootProcessInstances = null;

  private Boolean leafProcessInstances = null;

  @Valid
  private List<@Valid VariableQueryParameterDto> variables;

  private Boolean variableNamesIgnoreCase = null;

  private Boolean variableValuesIgnoreCase = null;

  @Valid
  private List<@Valid ProcessInstanceQueryDto> orQueries;

  @Valid
  private List<@Valid ProcessInstanceQueryDtoSortingInner> sorting;

  public ProcessInstanceQueryDto deploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
    return this;
  }

  /**
   * Filter by the deployment the id belongs to.
   * @return deploymentId
  */
  
  @Schema(name = "deploymentId", description = "Filter by the deployment the id belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deploymentId")
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
  */
  
  @Schema(name = "processDefinitionId", description = "Filter by the process definition the instances run on.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionId")
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
  */
  
  @Schema(name = "processDefinitionKey", description = "Filter by the key of the process definition the instances run on.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionKey")
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
  */
  
  @Schema(name = "processDefinitionKeyIn", description = "Filter by a list of process definition keys. A process instance must have one of the given process definition keys. Must be a JSON array of Strings.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionKeyIn")
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
  */
  
  @Schema(name = "processDefinitionKeyNotIn", description = "Exclude instances by a list of process definition keys. A process instance must not have one of the given process definition keys. Must be a JSON array of Strings.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionKeyNotIn")
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
  */
  
  @Schema(name = "businessKey", description = "Filter by process instance business key.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("businessKey")
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
  */
  
  @Schema(name = "businessKeyLike", description = "Filter by process instance business key that the parameter is a substring of.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("businessKeyLike")
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
  */
  
  @Schema(name = "caseInstanceId", description = "Filter by case instance id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("caseInstanceId")
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
  */
  
  @Schema(name = "superProcessInstance", description = "Restrict query to all process instances that are sub process instances of the given process instance. Takes a process instance id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("superProcessInstance")
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
  */
  
  @Schema(name = "subProcessInstance", description = "Restrict query to all process instances that have the given process instance as a sub process instance. Takes a process instance id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subProcessInstance")
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
  */
  
  @Schema(name = "superCaseInstance", description = "Restrict query to all process instances that are sub process instances of the given case instance. Takes a case instance id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("superCaseInstance")
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
  */
  
  @Schema(name = "subCaseInstance", description = "Restrict query to all process instances that have the given case instance as a sub case instance. Takes a case instance id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subCaseInstance")
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
  */
  
  @Schema(name = "active", description = "Only include active process instances. Value may only be true, as false is the default behavior.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("active")
  public Boolean getActive() {
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
  */
  
  @Schema(name = "suspended", description = "Only include suspended process instances. Value may only be true, as false is the default behavior.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("suspended")
  public Boolean getSuspended() {
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
  */
  
  @Schema(name = "processInstanceIds", description = "Filter by a list of process instance ids. Must be a JSON array of Strings.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processInstanceIds")
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
  */
  
  @Schema(name = "withIncident", description = "Filter by presence of incidents. Selects only process instances that have an incident.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("withIncident")
  public Boolean getWithIncident() {
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
  */
  
  @Schema(name = "incidentId", description = "Filter by the incident id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("incidentId")
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
  */
  
  @Schema(name = "incidentType", description = "Filter by the incident type. See the User Guide for a list of incident types.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("incidentType")
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
  */
  
  @Schema(name = "incidentMessage", description = "Filter by the incident message. Exact match.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("incidentMessage")
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
  */
  
  @Schema(name = "incidentMessageLike", description = "Filter by the incident message that the parameter is a substring of.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("incidentMessageLike")
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
  */
  
  @Schema(name = "tenantIdIn", description = "Filter by a list of tenant ids. A process instance must have one of the given tenant ids. Must be a JSON array of Strings.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tenantIdIn")
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
  */
  
  @Schema(name = "withoutTenantId", description = "Only include process instances which belong to no tenant. Value may only be true, as false is the default behavior.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("withoutTenantId")
  public Boolean getWithoutTenantId() {
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
  */
  
  @Schema(name = "processDefinitionWithoutTenantId", description = "Only include process instances which process definition has no tenant id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionWithoutTenantId")
  public Boolean getProcessDefinitionWithoutTenantId() {
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
  */
  
  @Schema(name = "activityIdIn", description = "Filter by a list of activity ids. A process instance must currently wait in a leaf activity with one of the given activity ids.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activityIdIn")
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
  */
  
  @Schema(name = "rootProcessInstances", description = "Restrict the query to all process instances that are top level process instances.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rootProcessInstances")
  public Boolean getRootProcessInstances() {
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
  */
  
  @Schema(name = "leafProcessInstances", description = "Restrict the query to all process instances that are leaf instances. (i.e. don't have any sub instances)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("leafProcessInstances")
  public Boolean getLeafProcessInstances() {
    return leafProcessInstances;
  }

  public void setLeafProcessInstances(Boolean leafProcessInstances) {
    this.leafProcessInstances = leafProcessInstances;
  }

  public ProcessInstanceQueryDto variables(List<@Valid VariableQueryParameterDto> variables) {
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
  */
  @Valid 
  @Schema(name = "variables", description = "A JSON array to only include process instances that have variables with certain values. The array consists of objects with the three properties `name`, `operator` and `value`. `name` (String) is the variable name, `operator` (String) is the comparison operator to be used and `value` the variable value. The `value` may be String, Number or Boolean.  Valid operator values are: `eq` - equal to; `neq` - not equal to; `gt` - greater than; `gteq` - greater than or equal to; `lt` - lower than; `lteq` - lower than or equal to; `like`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("variables")
  public List<@Valid VariableQueryParameterDto> getVariables() {
    return variables;
  }

  public void setVariables(List<@Valid VariableQueryParameterDto> variables) {
    this.variables = variables;
  }

  public ProcessInstanceQueryDto variableNamesIgnoreCase(Boolean variableNamesIgnoreCase) {
    this.variableNamesIgnoreCase = variableNamesIgnoreCase;
    return this;
  }

  /**
   * Match all variable names in this query case-insensitively. If set to true variableName and variablename are treated as equal.
   * @return variableNamesIgnoreCase
  */
  
  @Schema(name = "variableNamesIgnoreCase", description = "Match all variable names in this query case-insensitively. If set to true variableName and variablename are treated as equal.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("variableNamesIgnoreCase")
  public Boolean getVariableNamesIgnoreCase() {
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
  */
  
  @Schema(name = "variableValuesIgnoreCase", description = "Match all variable values in this query case-insensitively. If set to true variableValue and variablevalue are treated as equal.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("variableValuesIgnoreCase")
  public Boolean getVariableValuesIgnoreCase() {
    return variableValuesIgnoreCase;
  }

  public void setVariableValuesIgnoreCase(Boolean variableValuesIgnoreCase) {
    this.variableValuesIgnoreCase = variableValuesIgnoreCase;
  }

  public ProcessInstanceQueryDto orQueries(List<@Valid ProcessInstanceQueryDto> orQueries) {
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
  */
  @Valid 
  @Schema(name = "orQueries", description = "A JSON array of nested process instance queries with OR semantics. A process instance matches a nested query if it fulfills at least one of the query's predicates. With multiple nested queries, a process instance must fulfill at least one predicate of each query (Conjunctive Normal Form). All process instance query properties can be used except for: `sorting` See the [User guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/process-engine-api/#or-queries) for more information about OR queries.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orQueries")
  public List<@Valid ProcessInstanceQueryDto> getOrQueries() {
    return orQueries;
  }

  public void setOrQueries(List<@Valid ProcessInstanceQueryDto> orQueries) {
    this.orQueries = orQueries;
  }

  public ProcessInstanceQueryDto sorting(List<@Valid ProcessInstanceQueryDtoSortingInner> sorting) {
    this.sorting = sorting;
    return this;
  }

  public ProcessInstanceQueryDto addSortingItem(ProcessInstanceQueryDtoSortingInner sortingItem) {
    if (this.sorting == null) {
      this.sorting = new ArrayList<>();
    }
    this.sorting.add(sortingItem);
    return this;
  }

  /**
   * Apply sorting of the result
   * @return sorting
  */
  @Valid 
  @Schema(name = "sorting", description = "Apply sorting of the result", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sorting")
  public List<@Valid ProcessInstanceQueryDtoSortingInner> getSorting() {
    return sorting;
  }

  public void setSorting(List<@Valid ProcessInstanceQueryDtoSortingInner> sorting) {
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

