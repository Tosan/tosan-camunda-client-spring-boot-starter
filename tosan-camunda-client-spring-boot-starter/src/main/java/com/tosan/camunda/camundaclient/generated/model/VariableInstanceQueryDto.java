package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tosan.camunda.camundaclient.generated.model.VariableInstanceQueryDtoSortingInner;
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
 * A variable instance query which defines a list of variable instances
 */

@Schema(name = "VariableInstanceQueryDto", description = "A variable instance query which defines a list of variable instances")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class VariableInstanceQueryDto {

  private String variableName = null;

  private String variableNameLike = null;

  @Valid
  private List<String> processInstanceIdIn;

  @Valid
  private List<String> executionIdIn;

  @Valid
  private List<String> caseInstanceIdIn;

  @Valid
  private List<String> caseExecutionIdIn;

  @Valid
  private List<String> taskIdIn;

  @Valid
  private List<String> batchIdIn;

  @Valid
  private List<String> activityInstanceIdIn;

  @Valid
  private List<String> tenantIdIn;

  @Valid
  private List<@Valid VariableQueryParameterDto> variableValues;

  private Boolean variableNamesIgnoreCase = null;

  private Boolean variableValuesIgnoreCase = null;

  @Valid
  private List<String> variableScopeIdIn;

  @Valid
  private List<@Valid VariableInstanceQueryDtoSortingInner> sorting;

  public VariableInstanceQueryDto variableName(String variableName) {
    this.variableName = variableName;
    return this;
  }

  /**
   * Filter by variable instance name.
   * @return variableName
  */
  
  @Schema(name = "variableName", description = "Filter by variable instance name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("variableName")
  public String getVariableName() {
    return variableName;
  }

  public void setVariableName(String variableName) {
    this.variableName = variableName;
  }

  public VariableInstanceQueryDto variableNameLike(String variableNameLike) {
    this.variableNameLike = variableNameLike;
    return this;
  }

  /**
   * Filter by the variable instance name. The parameter can include the wildcard `%` to express like-strategy such as: starts with (`%`name), ends with (name`%`) or contains (`%`name`%`).
   * @return variableNameLike
  */
  
  @Schema(name = "variableNameLike", description = "Filter by the variable instance name. The parameter can include the wildcard `%` to express like-strategy such as: starts with (`%`name), ends with (name`%`) or contains (`%`name`%`).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("variableNameLike")
  public String getVariableNameLike() {
    return variableNameLike;
  }

  public void setVariableNameLike(String variableNameLike) {
    this.variableNameLike = variableNameLike;
  }

  public VariableInstanceQueryDto processInstanceIdIn(List<String> processInstanceIdIn) {
    this.processInstanceIdIn = processInstanceIdIn;
    return this;
  }

  public VariableInstanceQueryDto addProcessInstanceIdInItem(String processInstanceIdInItem) {
    if (this.processInstanceIdIn == null) {
      this.processInstanceIdIn = new ArrayList<>();
    }
    this.processInstanceIdIn.add(processInstanceIdInItem);
    return this;
  }

  /**
   * Only include variable instances which belong to one of the passed  process instance ids.
   * @return processInstanceIdIn
  */
  
  @Schema(name = "processInstanceIdIn", description = "Only include variable instances which belong to one of the passed  process instance ids.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processInstanceIdIn")
  public List<String> getProcessInstanceIdIn() {
    return processInstanceIdIn;
  }

  public void setProcessInstanceIdIn(List<String> processInstanceIdIn) {
    this.processInstanceIdIn = processInstanceIdIn;
  }

  public VariableInstanceQueryDto executionIdIn(List<String> executionIdIn) {
    this.executionIdIn = executionIdIn;
    return this;
  }

  public VariableInstanceQueryDto addExecutionIdInItem(String executionIdInItem) {
    if (this.executionIdIn == null) {
      this.executionIdIn = new ArrayList<>();
    }
    this.executionIdIn.add(executionIdInItem);
    return this;
  }

  /**
   * Only include variable instances which belong to one of the passed  execution ids.
   * @return executionIdIn
  */
  
  @Schema(name = "executionIdIn", description = "Only include variable instances which belong to one of the passed  execution ids.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("executionIdIn")
  public List<String> getExecutionIdIn() {
    return executionIdIn;
  }

  public void setExecutionIdIn(List<String> executionIdIn) {
    this.executionIdIn = executionIdIn;
  }

  public VariableInstanceQueryDto caseInstanceIdIn(List<String> caseInstanceIdIn) {
    this.caseInstanceIdIn = caseInstanceIdIn;
    return this;
  }

  public VariableInstanceQueryDto addCaseInstanceIdInItem(String caseInstanceIdInItem) {
    if (this.caseInstanceIdIn == null) {
      this.caseInstanceIdIn = new ArrayList<>();
    }
    this.caseInstanceIdIn.add(caseInstanceIdInItem);
    return this;
  }

  /**
   * Only include variable instances which belong to one of the passed  case instance ids.
   * @return caseInstanceIdIn
  */
  
  @Schema(name = "caseInstanceIdIn", description = "Only include variable instances which belong to one of the passed  case instance ids.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("caseInstanceIdIn")
  public List<String> getCaseInstanceIdIn() {
    return caseInstanceIdIn;
  }

  public void setCaseInstanceIdIn(List<String> caseInstanceIdIn) {
    this.caseInstanceIdIn = caseInstanceIdIn;
  }

  public VariableInstanceQueryDto caseExecutionIdIn(List<String> caseExecutionIdIn) {
    this.caseExecutionIdIn = caseExecutionIdIn;
    return this;
  }

  public VariableInstanceQueryDto addCaseExecutionIdInItem(String caseExecutionIdInItem) {
    if (this.caseExecutionIdIn == null) {
      this.caseExecutionIdIn = new ArrayList<>();
    }
    this.caseExecutionIdIn.add(caseExecutionIdInItem);
    return this;
  }

  /**
   * Only include variable instances which belong to one of the passed  case execution ids.
   * @return caseExecutionIdIn
  */
  
  @Schema(name = "caseExecutionIdIn", description = "Only include variable instances which belong to one of the passed  case execution ids.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("caseExecutionIdIn")
  public List<String> getCaseExecutionIdIn() {
    return caseExecutionIdIn;
  }

  public void setCaseExecutionIdIn(List<String> caseExecutionIdIn) {
    this.caseExecutionIdIn = caseExecutionIdIn;
  }

  public VariableInstanceQueryDto taskIdIn(List<String> taskIdIn) {
    this.taskIdIn = taskIdIn;
    return this;
  }

  public VariableInstanceQueryDto addTaskIdInItem(String taskIdInItem) {
    if (this.taskIdIn == null) {
      this.taskIdIn = new ArrayList<>();
    }
    this.taskIdIn.add(taskIdInItem);
    return this;
  }

  /**
   * Only include variable instances which belong to one of the passed  task ids.
   * @return taskIdIn
  */
  
  @Schema(name = "taskIdIn", description = "Only include variable instances which belong to one of the passed  task ids.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taskIdIn")
  public List<String> getTaskIdIn() {
    return taskIdIn;
  }

  public void setTaskIdIn(List<String> taskIdIn) {
    this.taskIdIn = taskIdIn;
  }

  public VariableInstanceQueryDto batchIdIn(List<String> batchIdIn) {
    this.batchIdIn = batchIdIn;
    return this;
  }

  public VariableInstanceQueryDto addBatchIdInItem(String batchIdInItem) {
    if (this.batchIdIn == null) {
      this.batchIdIn = new ArrayList<>();
    }
    this.batchIdIn.add(batchIdInItem);
    return this;
  }

  /**
   * Only include variable instances which belong to one of the passed  batch ids.
   * @return batchIdIn
  */
  
  @Schema(name = "batchIdIn", description = "Only include variable instances which belong to one of the passed  batch ids.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("batchIdIn")
  public List<String> getBatchIdIn() {
    return batchIdIn;
  }

  public void setBatchIdIn(List<String> batchIdIn) {
    this.batchIdIn = batchIdIn;
  }

  public VariableInstanceQueryDto activityInstanceIdIn(List<String> activityInstanceIdIn) {
    this.activityInstanceIdIn = activityInstanceIdIn;
    return this;
  }

  public VariableInstanceQueryDto addActivityInstanceIdInItem(String activityInstanceIdInItem) {
    if (this.activityInstanceIdIn == null) {
      this.activityInstanceIdIn = new ArrayList<>();
    }
    this.activityInstanceIdIn.add(activityInstanceIdInItem);
    return this;
  }

  /**
   * Only include variable instances which belong to one of the passed  activity instance ids.
   * @return activityInstanceIdIn
  */
  
  @Schema(name = "activityInstanceIdIn", description = "Only include variable instances which belong to one of the passed  activity instance ids.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activityInstanceIdIn")
  public List<String> getActivityInstanceIdIn() {
    return activityInstanceIdIn;
  }

  public void setActivityInstanceIdIn(List<String> activityInstanceIdIn) {
    this.activityInstanceIdIn = activityInstanceIdIn;
  }

  public VariableInstanceQueryDto tenantIdIn(List<String> tenantIdIn) {
    this.tenantIdIn = tenantIdIn;
    return this;
  }

  public VariableInstanceQueryDto addTenantIdInItem(String tenantIdInItem) {
    if (this.tenantIdIn == null) {
      this.tenantIdIn = new ArrayList<>();
    }
    this.tenantIdIn.add(tenantIdInItem);
    return this;
  }

  /**
   * Only include variable instances which belong to one of the passed  tenant ids.
   * @return tenantIdIn
  */
  
  @Schema(name = "tenantIdIn", description = "Only include variable instances which belong to one of the passed  tenant ids.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tenantIdIn")
  public List<String> getTenantIdIn() {
    return tenantIdIn;
  }

  public void setTenantIdIn(List<String> tenantIdIn) {
    this.tenantIdIn = tenantIdIn;
  }

  public VariableInstanceQueryDto variableValues(List<@Valid VariableQueryParameterDto> variableValues) {
    this.variableValues = variableValues;
    return this;
  }

  public VariableInstanceQueryDto addVariableValuesItem(VariableQueryParameterDto variableValuesItem) {
    if (this.variableValues == null) {
      this.variableValues = new ArrayList<>();
    }
    this.variableValues.add(variableValuesItem);
    return this;
  }

  /**
   * An array to only include variable instances that have the certain values. The array consists of objects with the three properties `name`, `operator` and `value`. `name (String)` is the variable name, `operator (String)` is the comparison operator to be used and `value` the variable value. `value` may be `String`, `Number` or `Boolean`.  Valid operator values are: `eq` - equal to; `neq` - not equal to; `gt` - greater than; `gteq` - greater than or equal to; `lt` - lower than; `lteq` - lower than or equal to; `like`
   * @return variableValues
  */
  @Valid 
  @Schema(name = "variableValues", description = "An array to only include variable instances that have the certain values. The array consists of objects with the three properties `name`, `operator` and `value`. `name (String)` is the variable name, `operator (String)` is the comparison operator to be used and `value` the variable value. `value` may be `String`, `Number` or `Boolean`.  Valid operator values are: `eq` - equal to; `neq` - not equal to; `gt` - greater than; `gteq` - greater than or equal to; `lt` - lower than; `lteq` - lower than or equal to; `like`", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("variableValues")
  public List<@Valid VariableQueryParameterDto> getVariableValues() {
    return variableValues;
  }

  public void setVariableValues(List<@Valid VariableQueryParameterDto> variableValues) {
    this.variableValues = variableValues;
  }

  public VariableInstanceQueryDto variableNamesIgnoreCase(Boolean variableNamesIgnoreCase) {
    this.variableNamesIgnoreCase = variableNamesIgnoreCase;
    return this;
  }

  /**
   * Match all variable names provided in `variableValues` case-insensitively. If set to `true` **variableName** and **variablename** are treated as equal.
   * @return variableNamesIgnoreCase
  */
  
  @Schema(name = "variableNamesIgnoreCase", description = "Match all variable names provided in `variableValues` case-insensitively. If set to `true` **variableName** and **variablename** are treated as equal.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("variableNamesIgnoreCase")
  public Boolean getVariableNamesIgnoreCase() {
    return variableNamesIgnoreCase;
  }

  public void setVariableNamesIgnoreCase(Boolean variableNamesIgnoreCase) {
    this.variableNamesIgnoreCase = variableNamesIgnoreCase;
  }

  public VariableInstanceQueryDto variableValuesIgnoreCase(Boolean variableValuesIgnoreCase) {
    this.variableValuesIgnoreCase = variableValuesIgnoreCase;
    return this;
  }

  /**
   * Match all variable values provided in `variableValues` case-insensitively. If set to `true` **variableValue** and **variablevalue** are treated as equal.
   * @return variableValuesIgnoreCase
  */
  
  @Schema(name = "variableValuesIgnoreCase", description = "Match all variable values provided in `variableValues` case-insensitively. If set to `true` **variableValue** and **variablevalue** are treated as equal.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("variableValuesIgnoreCase")
  public Boolean getVariableValuesIgnoreCase() {
    return variableValuesIgnoreCase;
  }

  public void setVariableValuesIgnoreCase(Boolean variableValuesIgnoreCase) {
    this.variableValuesIgnoreCase = variableValuesIgnoreCase;
  }

  public VariableInstanceQueryDto variableScopeIdIn(List<String> variableScopeIdIn) {
    this.variableScopeIdIn = variableScopeIdIn;
    return this;
  }

  public VariableInstanceQueryDto addVariableScopeIdInItem(String variableScopeIdInItem) {
    if (this.variableScopeIdIn == null) {
      this.variableScopeIdIn = new ArrayList<>();
    }
    this.variableScopeIdIn.add(variableScopeIdInItem);
    return this;
  }

  /**
   * Only include variable instances which belong to one of passed scope ids.
   * @return variableScopeIdIn
  */
  
  @Schema(name = "variableScopeIdIn", description = "Only include variable instances which belong to one of passed scope ids.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("variableScopeIdIn")
  public List<String> getVariableScopeIdIn() {
    return variableScopeIdIn;
  }

  public void setVariableScopeIdIn(List<String> variableScopeIdIn) {
    this.variableScopeIdIn = variableScopeIdIn;
  }

  public VariableInstanceQueryDto sorting(List<@Valid VariableInstanceQueryDtoSortingInner> sorting) {
    this.sorting = sorting;
    return this;
  }

  public VariableInstanceQueryDto addSortingItem(VariableInstanceQueryDtoSortingInner sortingItem) {
    if (this.sorting == null) {
      this.sorting = new ArrayList<>();
    }
    this.sorting.add(sortingItem);
    return this;
  }

  /**
   * An array of criteria to sort the result by. Each element of the array is an object that specifies one ordering.                       The position in the array identifies the rank of an ordering, i.e., whether it is primary, secondary, etc.                       Sorting has no effect for `count` endpoints
   * @return sorting
  */
  @Valid 
  @Schema(name = "sorting", description = "An array of criteria to sort the result by. Each element of the array is an object that specifies one ordering.                       The position in the array identifies the rank of an ordering, i.e., whether it is primary, secondary, etc.                       Sorting has no effect for `count` endpoints", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sorting")
  public List<@Valid VariableInstanceQueryDtoSortingInner> getSorting() {
    return sorting;
  }

  public void setSorting(List<@Valid VariableInstanceQueryDtoSortingInner> sorting) {
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
    VariableInstanceQueryDto variableInstanceQueryDto = (VariableInstanceQueryDto) o;
    return Objects.equals(this.variableName, variableInstanceQueryDto.variableName) &&
        Objects.equals(this.variableNameLike, variableInstanceQueryDto.variableNameLike) &&
        Objects.equals(this.processInstanceIdIn, variableInstanceQueryDto.processInstanceIdIn) &&
        Objects.equals(this.executionIdIn, variableInstanceQueryDto.executionIdIn) &&
        Objects.equals(this.caseInstanceIdIn, variableInstanceQueryDto.caseInstanceIdIn) &&
        Objects.equals(this.caseExecutionIdIn, variableInstanceQueryDto.caseExecutionIdIn) &&
        Objects.equals(this.taskIdIn, variableInstanceQueryDto.taskIdIn) &&
        Objects.equals(this.batchIdIn, variableInstanceQueryDto.batchIdIn) &&
        Objects.equals(this.activityInstanceIdIn, variableInstanceQueryDto.activityInstanceIdIn) &&
        Objects.equals(this.tenantIdIn, variableInstanceQueryDto.tenantIdIn) &&
        Objects.equals(this.variableValues, variableInstanceQueryDto.variableValues) &&
        Objects.equals(this.variableNamesIgnoreCase, variableInstanceQueryDto.variableNamesIgnoreCase) &&
        Objects.equals(this.variableValuesIgnoreCase, variableInstanceQueryDto.variableValuesIgnoreCase) &&
        Objects.equals(this.variableScopeIdIn, variableInstanceQueryDto.variableScopeIdIn) &&
        Objects.equals(this.sorting, variableInstanceQueryDto.sorting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variableName, variableNameLike, processInstanceIdIn, executionIdIn, caseInstanceIdIn, caseExecutionIdIn, taskIdIn, batchIdIn, activityInstanceIdIn, tenantIdIn, variableValues, variableNamesIgnoreCase, variableValuesIgnoreCase, variableScopeIdIn, sorting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableInstanceQueryDto {\n");
    sb.append("    variableName: ").append(toIndentedString(variableName)).append("\n");
    sb.append("    variableNameLike: ").append(toIndentedString(variableNameLike)).append("\n");
    sb.append("    processInstanceIdIn: ").append(toIndentedString(processInstanceIdIn)).append("\n");
    sb.append("    executionIdIn: ").append(toIndentedString(executionIdIn)).append("\n");
    sb.append("    caseInstanceIdIn: ").append(toIndentedString(caseInstanceIdIn)).append("\n");
    sb.append("    caseExecutionIdIn: ").append(toIndentedString(caseExecutionIdIn)).append("\n");
    sb.append("    taskIdIn: ").append(toIndentedString(taskIdIn)).append("\n");
    sb.append("    batchIdIn: ").append(toIndentedString(batchIdIn)).append("\n");
    sb.append("    activityInstanceIdIn: ").append(toIndentedString(activityInstanceIdIn)).append("\n");
    sb.append("    tenantIdIn: ").append(toIndentedString(tenantIdIn)).append("\n");
    sb.append("    variableValues: ").append(toIndentedString(variableValues)).append("\n");
    sb.append("    variableNamesIgnoreCase: ").append(toIndentedString(variableNamesIgnoreCase)).append("\n");
    sb.append("    variableValuesIgnoreCase: ").append(toIndentedString(variableValuesIgnoreCase)).append("\n");
    sb.append("    variableScopeIdIn: ").append(toIndentedString(variableScopeIdIn)).append("\n");
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

