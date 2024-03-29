package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tosan.camunda.camundaclient.generated.model.HistoricVariableInstanceQueryDtoSortingInner;
import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * A Historic Variable Instance instance query which defines a list of Historic Variable Instance instances
 */

@Schema(name = "HistoricVariableInstanceQueryDto", description = "A Historic Variable Instance instance query which defines a list of Historic Variable Instance instances")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class HistoricVariableInstanceQueryDto {

  private String variableName = null;

  private String variableNameLike = null;

  private Object variableValue;

  private Boolean variableNamesIgnoreCase = null;

  private Boolean variableValuesIgnoreCase = null;

  @Valid
  private List<String> variableTypeIn;

  private Boolean includeDeleted = null;

  private String processInstanceId = null;

  @Valid
  private List<String> processInstanceIdIn;

  private String processDefinitionId = null;

  private String processDefinitionKey = null;

  @Valid
  private List<String> executionIdIn;

  private String caseInstanceId = null;

  @Valid
  private List<String> caseExecutionIdIn;

  @Valid
  private List<String> caseActivityIdIn;

  @Valid
  private List<String> taskIdIn;

  @Valid
  private List<String> activityInstanceIdIn;

  @Valid
  private List<String> tenantIdIn;

  private Boolean withoutTenantId = null;

  @Valid
  private List<String> variableNameIn;

  @Valid
  private List<@Valid HistoricVariableInstanceQueryDtoSortingInner> sorting;

  public HistoricVariableInstanceQueryDto variableName(String variableName) {
    this.variableName = variableName;
    return this;
  }

  /**
   * Filter by variable name.
   * @return variableName
  */
  
  @Schema(name = "variableName", description = "Filter by variable name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("variableName")
  public String getVariableName() {
    return variableName;
  }

  public void setVariableName(String variableName) {
    this.variableName = variableName;
  }

  public HistoricVariableInstanceQueryDto variableNameLike(String variableNameLike) {
    this.variableNameLike = variableNameLike;
    return this;
  }

  /**
   * Restrict to variables with a name like the parameter.
   * @return variableNameLike
  */
  
  @Schema(name = "variableNameLike", description = "Restrict to variables with a name like the parameter.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("variableNameLike")
  public String getVariableNameLike() {
    return variableNameLike;
  }

  public void setVariableNameLike(String variableNameLike) {
    this.variableNameLike = variableNameLike;
  }

  public HistoricVariableInstanceQueryDto variableValue(Object variableValue) {
    this.variableValue = variableValue;
    return this;
  }

  /**
   * Filter by variable value. May be `String`, `Number` or `Boolean`.
   * @return variableValue
  */
  
  @Schema(name = "variableValue", description = "Filter by variable value. May be `String`, `Number` or `Boolean`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("variableValue")
  public Object getVariableValue() {
    return variableValue;
  }

  public void setVariableValue(Object variableValue) {
    this.variableValue = variableValue;
  }

  public HistoricVariableInstanceQueryDto variableNamesIgnoreCase(Boolean variableNamesIgnoreCase) {
    this.variableNamesIgnoreCase = variableNamesIgnoreCase;
    return this;
  }

  /**
   * Match the variable name provided in `variableName` and `variableNameLike` case- insensitively. If set to `true` **variableName** and **variablename** are treated as equal.
   * @return variableNamesIgnoreCase
  */
  
  @Schema(name = "variableNamesIgnoreCase", description = "Match the variable name provided in `variableName` and `variableNameLike` case- insensitively. If set to `true` **variableName** and **variablename** are treated as equal.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("variableNamesIgnoreCase")
  public Boolean getVariableNamesIgnoreCase() {
    return variableNamesIgnoreCase;
  }

  public void setVariableNamesIgnoreCase(Boolean variableNamesIgnoreCase) {
    this.variableNamesIgnoreCase = variableNamesIgnoreCase;
  }

  public HistoricVariableInstanceQueryDto variableValuesIgnoreCase(Boolean variableValuesIgnoreCase) {
    this.variableValuesIgnoreCase = variableValuesIgnoreCase;
    return this;
  }

  /**
   * Match the variable value provided in `variableValue` case-insensitively. If set to `true` **variableValue** and **variablevalue** are treated as equal.
   * @return variableValuesIgnoreCase
  */
  
  @Schema(name = "variableValuesIgnoreCase", description = "Match the variable value provided in `variableValue` case-insensitively. If set to `true` **variableValue** and **variablevalue** are treated as equal.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("variableValuesIgnoreCase")
  public Boolean getVariableValuesIgnoreCase() {
    return variableValuesIgnoreCase;
  }

  public void setVariableValuesIgnoreCase(Boolean variableValuesIgnoreCase) {
    this.variableValuesIgnoreCase = variableValuesIgnoreCase;
  }

  public HistoricVariableInstanceQueryDto variableTypeIn(List<String> variableTypeIn) {
    this.variableTypeIn = variableTypeIn;
    return this;
  }

  public HistoricVariableInstanceQueryDto addVariableTypeInItem(String variableTypeInItem) {
    if (this.variableTypeIn == null) {
      this.variableTypeIn = new ArrayList<>();
    }
    this.variableTypeIn.add(variableTypeInItem);
    return this;
  }

  /**
   * Only include historic variable instances which belong to one of the passed and comma- separated variable types. A list of all supported variable types can be found [here](https://docs.camunda.org/manual/7.17/user-guide/process-engine/variables/#supported-variable-values). **Note:** All non-primitive variables are associated with the type 'serializable'.
   * @return variableTypeIn
  */
  
  @Schema(name = "variableTypeIn", description = "Only include historic variable instances which belong to one of the passed and comma- separated variable types. A list of all supported variable types can be found [here](https://docs.camunda.org/manual/7.17/user-guide/process-engine/variables/#supported-variable-values). **Note:** All non-primitive variables are associated with the type 'serializable'.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("variableTypeIn")
  public List<String> getVariableTypeIn() {
    return variableTypeIn;
  }

  public void setVariableTypeIn(List<String> variableTypeIn) {
    this.variableTypeIn = variableTypeIn;
  }

  public HistoricVariableInstanceQueryDto includeDeleted(Boolean includeDeleted) {
    this.includeDeleted = includeDeleted;
    return this;
  }

  /**
   * Include variables that has already been deleted during the execution.
   * @return includeDeleted
  */
  
  @Schema(name = "includeDeleted", description = "Include variables that has already been deleted during the execution.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("includeDeleted")
  public Boolean getIncludeDeleted() {
    return includeDeleted;
  }

  public void setIncludeDeleted(Boolean includeDeleted) {
    this.includeDeleted = includeDeleted;
  }

  public HistoricVariableInstanceQueryDto processInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
    return this;
  }

  /**
   * Filter by the process instance the variable belongs to.
   * @return processInstanceId
  */
  
  @Schema(name = "processInstanceId", description = "Filter by the process instance the variable belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processInstanceId")
  public String getProcessInstanceId() {
    return processInstanceId;
  }

  public void setProcessInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
  }

  public HistoricVariableInstanceQueryDto processInstanceIdIn(List<String> processInstanceIdIn) {
    this.processInstanceIdIn = processInstanceIdIn;
    return this;
  }

  public HistoricVariableInstanceQueryDto addProcessInstanceIdInItem(String processInstanceIdInItem) {
    if (this.processInstanceIdIn == null) {
      this.processInstanceIdIn = new ArrayList<>();
    }
    this.processInstanceIdIn.add(processInstanceIdInItem);
    return this;
  }

  /**
   * Only include historic variable instances which belong to one of the passed  process instance ids.
   * @return processInstanceIdIn
  */
  
  @Schema(name = "processInstanceIdIn", description = "Only include historic variable instances which belong to one of the passed  process instance ids.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processInstanceIdIn")
  public List<String> getProcessInstanceIdIn() {
    return processInstanceIdIn;
  }

  public void setProcessInstanceIdIn(List<String> processInstanceIdIn) {
    this.processInstanceIdIn = processInstanceIdIn;
  }

  public HistoricVariableInstanceQueryDto processDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
    return this;
  }

  /**
   * Filter by the process definition the variable belongs to.
   * @return processDefinitionId
  */
  
  @Schema(name = "processDefinitionId", description = "Filter by the process definition the variable belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionId")
  public String getProcessDefinitionId() {
    return processDefinitionId;
  }

  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }

  public HistoricVariableInstanceQueryDto processDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
    return this;
  }

  /**
   * Filter by a key of the process definition the variable belongs to.
   * @return processDefinitionKey
  */
  
  @Schema(name = "processDefinitionKey", description = "Filter by a key of the process definition the variable belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionKey")
  public String getProcessDefinitionKey() {
    return processDefinitionKey;
  }

  public void setProcessDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
  }

  public HistoricVariableInstanceQueryDto executionIdIn(List<String> executionIdIn) {
    this.executionIdIn = executionIdIn;
    return this;
  }

  public HistoricVariableInstanceQueryDto addExecutionIdInItem(String executionIdInItem) {
    if (this.executionIdIn == null) {
      this.executionIdIn = new ArrayList<>();
    }
    this.executionIdIn.add(executionIdInItem);
    return this;
  }

  /**
   * Only include historic variable instances which belong to one of the passed and  execution ids.
   * @return executionIdIn
  */
  
  @Schema(name = "executionIdIn", description = "Only include historic variable instances which belong to one of the passed and  execution ids.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("executionIdIn")
  public List<String> getExecutionIdIn() {
    return executionIdIn;
  }

  public void setExecutionIdIn(List<String> executionIdIn) {
    this.executionIdIn = executionIdIn;
  }

  public HistoricVariableInstanceQueryDto caseInstanceId(String caseInstanceId) {
    this.caseInstanceId = caseInstanceId;
    return this;
  }

  /**
   * Filter by the case instance the variable belongs to.
   * @return caseInstanceId
  */
  
  @Schema(name = "caseInstanceId", description = "Filter by the case instance the variable belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("caseInstanceId")
  public String getCaseInstanceId() {
    return caseInstanceId;
  }

  public void setCaseInstanceId(String caseInstanceId) {
    this.caseInstanceId = caseInstanceId;
  }

  public HistoricVariableInstanceQueryDto caseExecutionIdIn(List<String> caseExecutionIdIn) {
    this.caseExecutionIdIn = caseExecutionIdIn;
    return this;
  }

  public HistoricVariableInstanceQueryDto addCaseExecutionIdInItem(String caseExecutionIdInItem) {
    if (this.caseExecutionIdIn == null) {
      this.caseExecutionIdIn = new ArrayList<>();
    }
    this.caseExecutionIdIn.add(caseExecutionIdInItem);
    return this;
  }

  /**
   * Only include historic variable instances which belong to one of the passed and  case execution ids.
   * @return caseExecutionIdIn
  */
  
  @Schema(name = "caseExecutionIdIn", description = "Only include historic variable instances which belong to one of the passed and  case execution ids.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("caseExecutionIdIn")
  public List<String> getCaseExecutionIdIn() {
    return caseExecutionIdIn;
  }

  public void setCaseExecutionIdIn(List<String> caseExecutionIdIn) {
    this.caseExecutionIdIn = caseExecutionIdIn;
  }

  public HistoricVariableInstanceQueryDto caseActivityIdIn(List<String> caseActivityIdIn) {
    this.caseActivityIdIn = caseActivityIdIn;
    return this;
  }

  public HistoricVariableInstanceQueryDto addCaseActivityIdInItem(String caseActivityIdInItem) {
    if (this.caseActivityIdIn == null) {
      this.caseActivityIdIn = new ArrayList<>();
    }
    this.caseActivityIdIn.add(caseActivityIdInItem);
    return this;
  }

  /**
   * Only include historic variable instances which belong to one of the passed and  case activity ids.
   * @return caseActivityIdIn
  */
  
  @Schema(name = "caseActivityIdIn", description = "Only include historic variable instances which belong to one of the passed and  case activity ids.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("caseActivityIdIn")
  public List<String> getCaseActivityIdIn() {
    return caseActivityIdIn;
  }

  public void setCaseActivityIdIn(List<String> caseActivityIdIn) {
    this.caseActivityIdIn = caseActivityIdIn;
  }

  public HistoricVariableInstanceQueryDto taskIdIn(List<String> taskIdIn) {
    this.taskIdIn = taskIdIn;
    return this;
  }

  public HistoricVariableInstanceQueryDto addTaskIdInItem(String taskIdInItem) {
    if (this.taskIdIn == null) {
      this.taskIdIn = new ArrayList<>();
    }
    this.taskIdIn.add(taskIdInItem);
    return this;
  }

  /**
   * Only include historic variable instances which belong to one of the passed and  task ids.
   * @return taskIdIn
  */
  
  @Schema(name = "taskIdIn", description = "Only include historic variable instances which belong to one of the passed and  task ids.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taskIdIn")
  public List<String> getTaskIdIn() {
    return taskIdIn;
  }

  public void setTaskIdIn(List<String> taskIdIn) {
    this.taskIdIn = taskIdIn;
  }

  public HistoricVariableInstanceQueryDto activityInstanceIdIn(List<String> activityInstanceIdIn) {
    this.activityInstanceIdIn = activityInstanceIdIn;
    return this;
  }

  public HistoricVariableInstanceQueryDto addActivityInstanceIdInItem(String activityInstanceIdInItem) {
    if (this.activityInstanceIdIn == null) {
      this.activityInstanceIdIn = new ArrayList<>();
    }
    this.activityInstanceIdIn.add(activityInstanceIdInItem);
    return this;
  }

  /**
   * Only include historic variable instances which belong to one of the passed and  activity instance ids.
   * @return activityInstanceIdIn
  */
  
  @Schema(name = "activityInstanceIdIn", description = "Only include historic variable instances which belong to one of the passed and  activity instance ids.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activityInstanceIdIn")
  public List<String> getActivityInstanceIdIn() {
    return activityInstanceIdIn;
  }

  public void setActivityInstanceIdIn(List<String> activityInstanceIdIn) {
    this.activityInstanceIdIn = activityInstanceIdIn;
  }

  public HistoricVariableInstanceQueryDto tenantIdIn(List<String> tenantIdIn) {
    this.tenantIdIn = tenantIdIn;
    return this;
  }

  public HistoricVariableInstanceQueryDto addTenantIdInItem(String tenantIdInItem) {
    if (this.tenantIdIn == null) {
      this.tenantIdIn = new ArrayList<>();
    }
    this.tenantIdIn.add(tenantIdInItem);
    return this;
  }

  /**
   * Only include historic variable instances which belong to one of the passed and comma- separated tenant ids.
   * @return tenantIdIn
  */
  
  @Schema(name = "tenantIdIn", description = "Only include historic variable instances which belong to one of the passed and comma- separated tenant ids.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tenantIdIn")
  public List<String> getTenantIdIn() {
    return tenantIdIn;
  }

  public void setTenantIdIn(List<String> tenantIdIn) {
    this.tenantIdIn = tenantIdIn;
  }

  public HistoricVariableInstanceQueryDto withoutTenantId(Boolean withoutTenantId) {
    this.withoutTenantId = withoutTenantId;
    return this;
  }

  /**
   * Only include historic variable instances that belong to no tenant. Value may only be `true`, as `false` is the default behavior.
   * @return withoutTenantId
  */
  
  @Schema(name = "withoutTenantId", description = "Only include historic variable instances that belong to no tenant. Value may only be `true`, as `false` is the default behavior.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("withoutTenantId")
  public Boolean getWithoutTenantId() {
    return withoutTenantId;
  }

  public void setWithoutTenantId(Boolean withoutTenantId) {
    this.withoutTenantId = withoutTenantId;
  }

  public HistoricVariableInstanceQueryDto variableNameIn(List<String> variableNameIn) {
    this.variableNameIn = variableNameIn;
    return this;
  }

  public HistoricVariableInstanceQueryDto addVariableNameInItem(String variableNameInItem) {
    if (this.variableNameIn == null) {
      this.variableNameIn = new ArrayList<>();
    }
    this.variableNameIn.add(variableNameInItem);
    return this;
  }

  /**
   * Only include historic variable instances which belong to one of the passed  variable names.
   * @return variableNameIn
  */
  
  @Schema(name = "variableNameIn", description = "Only include historic variable instances which belong to one of the passed  variable names.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("variableNameIn")
  public List<String> getVariableNameIn() {
    return variableNameIn;
  }

  public void setVariableNameIn(List<String> variableNameIn) {
    this.variableNameIn = variableNameIn;
  }

  public HistoricVariableInstanceQueryDto sorting(List<@Valid HistoricVariableInstanceQueryDtoSortingInner> sorting) {
    this.sorting = sorting;
    return this;
  }

  public HistoricVariableInstanceQueryDto addSortingItem(HistoricVariableInstanceQueryDtoSortingInner sortingItem) {
    if (this.sorting == null) {
      this.sorting = new ArrayList<>();
    }
    this.sorting.add(sortingItem);
    return this;
  }

  /**
   * An array of criteria to sort the result by. Each element of the array is                      an object that specifies one ordering. The position in the array                      identifies the rank of an ordering, i.e., whether it is primary, secondary,                      etc. Sorting has no effect for `count` endpoints
   * @return sorting
  */
  @Valid 
  @Schema(name = "sorting", description = "An array of criteria to sort the result by. Each element of the array is                      an object that specifies one ordering. The position in the array                      identifies the rank of an ordering, i.e., whether it is primary, secondary,                      etc. Sorting has no effect for `count` endpoints", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sorting")
  public List<@Valid HistoricVariableInstanceQueryDtoSortingInner> getSorting() {
    return sorting;
  }

  public void setSorting(List<@Valid HistoricVariableInstanceQueryDtoSortingInner> sorting) {
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
    HistoricVariableInstanceQueryDto historicVariableInstanceQueryDto = (HistoricVariableInstanceQueryDto) o;
    return Objects.equals(this.variableName, historicVariableInstanceQueryDto.variableName) &&
        Objects.equals(this.variableNameLike, historicVariableInstanceQueryDto.variableNameLike) &&
        Objects.equals(this.variableValue, historicVariableInstanceQueryDto.variableValue) &&
        Objects.equals(this.variableNamesIgnoreCase, historicVariableInstanceQueryDto.variableNamesIgnoreCase) &&
        Objects.equals(this.variableValuesIgnoreCase, historicVariableInstanceQueryDto.variableValuesIgnoreCase) &&
        Objects.equals(this.variableTypeIn, historicVariableInstanceQueryDto.variableTypeIn) &&
        Objects.equals(this.includeDeleted, historicVariableInstanceQueryDto.includeDeleted) &&
        Objects.equals(this.processInstanceId, historicVariableInstanceQueryDto.processInstanceId) &&
        Objects.equals(this.processInstanceIdIn, historicVariableInstanceQueryDto.processInstanceIdIn) &&
        Objects.equals(this.processDefinitionId, historicVariableInstanceQueryDto.processDefinitionId) &&
        Objects.equals(this.processDefinitionKey, historicVariableInstanceQueryDto.processDefinitionKey) &&
        Objects.equals(this.executionIdIn, historicVariableInstanceQueryDto.executionIdIn) &&
        Objects.equals(this.caseInstanceId, historicVariableInstanceQueryDto.caseInstanceId) &&
        Objects.equals(this.caseExecutionIdIn, historicVariableInstanceQueryDto.caseExecutionIdIn) &&
        Objects.equals(this.caseActivityIdIn, historicVariableInstanceQueryDto.caseActivityIdIn) &&
        Objects.equals(this.taskIdIn, historicVariableInstanceQueryDto.taskIdIn) &&
        Objects.equals(this.activityInstanceIdIn, historicVariableInstanceQueryDto.activityInstanceIdIn) &&
        Objects.equals(this.tenantIdIn, historicVariableInstanceQueryDto.tenantIdIn) &&
        Objects.equals(this.withoutTenantId, historicVariableInstanceQueryDto.withoutTenantId) &&
        Objects.equals(this.variableNameIn, historicVariableInstanceQueryDto.variableNameIn) &&
        Objects.equals(this.sorting, historicVariableInstanceQueryDto.sorting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variableName, variableNameLike, variableValue, variableNamesIgnoreCase, variableValuesIgnoreCase, variableTypeIn, includeDeleted, processInstanceId, processInstanceIdIn, processDefinitionId, processDefinitionKey, executionIdIn, caseInstanceId, caseExecutionIdIn, caseActivityIdIn, taskIdIn, activityInstanceIdIn, tenantIdIn, withoutTenantId, variableNameIn, sorting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricVariableInstanceQueryDto {\n");
    sb.append("    variableName: ").append(toIndentedString(variableName)).append("\n");
    sb.append("    variableNameLike: ").append(toIndentedString(variableNameLike)).append("\n");
    sb.append("    variableValue: ").append(toIndentedString(variableValue)).append("\n");
    sb.append("    variableNamesIgnoreCase: ").append(toIndentedString(variableNamesIgnoreCase)).append("\n");
    sb.append("    variableValuesIgnoreCase: ").append(toIndentedString(variableValuesIgnoreCase)).append("\n");
    sb.append("    variableTypeIn: ").append(toIndentedString(variableTypeIn)).append("\n");
    sb.append("    includeDeleted: ").append(toIndentedString(includeDeleted)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    processInstanceIdIn: ").append(toIndentedString(processInstanceIdIn)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    executionIdIn: ").append(toIndentedString(executionIdIn)).append("\n");
    sb.append("    caseInstanceId: ").append(toIndentedString(caseInstanceId)).append("\n");
    sb.append("    caseExecutionIdIn: ").append(toIndentedString(caseExecutionIdIn)).append("\n");
    sb.append("    caseActivityIdIn: ").append(toIndentedString(caseActivityIdIn)).append("\n");
    sb.append("    taskIdIn: ").append(toIndentedString(taskIdIn)).append("\n");
    sb.append("    activityInstanceIdIn: ").append(toIndentedString(activityInstanceIdIn)).append("\n");
    sb.append("    tenantIdIn: ").append(toIndentedString(tenantIdIn)).append("\n");
    sb.append("    withoutTenantId: ").append(toIndentedString(withoutTenantId)).append("\n");
    sb.append("    variableNameIn: ").append(toIndentedString(variableNameIn)).append("\n");
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

