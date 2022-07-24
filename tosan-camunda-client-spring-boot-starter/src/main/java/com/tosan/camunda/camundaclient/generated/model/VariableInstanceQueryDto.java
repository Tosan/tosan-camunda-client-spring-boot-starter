package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * A variable instance query which defines a list of variable instances
 */
@Schema(description = "A variable instance query which defines a list of variable instances")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class VariableInstanceQueryDto   {
  @JsonProperty("variableName")
  private String variableName = null;

  @JsonProperty("variableNameLike")
  private String variableNameLike = null;

  @JsonProperty("processInstanceIdIn")
  @Valid
  private List<String> processInstanceIdIn = null;

  @JsonProperty("executionIdIn")
  @Valid
  private List<String> executionIdIn = null;

  @JsonProperty("caseInstanceIdIn")
  @Valid
  private List<String> caseInstanceIdIn = null;

  @JsonProperty("caseExecutionIdIn")
  @Valid
  private List<String> caseExecutionIdIn = null;

  @JsonProperty("taskIdIn")
  @Valid
  private List<String> taskIdIn = null;

  @JsonProperty("batchIdIn")
  @Valid
  private List<String> batchIdIn = null;

  @JsonProperty("activityInstanceIdIn")
  @Valid
  private List<String> activityInstanceIdIn = null;

  @JsonProperty("tenantIdIn")
  @Valid
  private List<String> tenantIdIn = null;

  @JsonProperty("variableValues")
  @Valid
  private List<VariableQueryParameterDto> variableValues = null;

  @JsonProperty("variableNamesIgnoreCase")
  private Boolean variableNamesIgnoreCase = null;

  @JsonProperty("variableValuesIgnoreCase")
  private Boolean variableValuesIgnoreCase = null;

  @JsonProperty("variableScopeIdIn")
  @Valid
  private List<String> variableScopeIdIn = null;

  @JsonProperty("sorting")
  @Valid
  private List<VariableInstanceQueryDtoSorting> sorting = null;

  public VariableInstanceQueryDto variableName(String variableName) {
    this.variableName = variableName;
    return this;
  }

  /**
   * Filter by variable instance name.
   * @return variableName
   **/
  @Schema(description = "Filter by variable instance name.")
  
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
   **/
  @Schema(description = "Filter by the variable instance name. The parameter can include the wildcard `%` to express like-strategy such as: starts with (`%`name), ends with (name`%`) or contains (`%`name`%`).")
  
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
   **/
  @Schema(description = "Only include variable instances which belong to one of the passed  process instance ids.")
  
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
   **/
  @Schema(description = "Only include variable instances which belong to one of the passed  execution ids.")
  
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
   **/
  @Schema(description = "Only include variable instances which belong to one of the passed  case instance ids.")
  
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
   **/
  @Schema(description = "Only include variable instances which belong to one of the passed  case execution ids.")
  
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
   **/
  @Schema(description = "Only include variable instances which belong to one of the passed  task ids.")
  
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
   **/
  @Schema(description = "Only include variable instances which belong to one of the passed  batch ids.")
  
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
   **/
  @Schema(description = "Only include variable instances which belong to one of the passed  activity instance ids.")
  
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
   **/
  @Schema(description = "Only include variable instances which belong to one of the passed  tenant ids.")
  
    public List<String> getTenantIdIn() {
    return tenantIdIn;
  }

  public void setTenantIdIn(List<String> tenantIdIn) {
    this.tenantIdIn = tenantIdIn;
  }

  public VariableInstanceQueryDto variableValues(List<VariableQueryParameterDto> variableValues) {
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
   **/
  @Schema(description = "An array to only include variable instances that have the certain values. The array consists of objects with the three properties `name`, `operator` and `value`. `name (String)` is the variable name, `operator (String)` is the comparison operator to be used and `value` the variable value. `value` may be `String`, `Number` or `Boolean`.  Valid operator values are: `eq` - equal to; `neq` - not equal to; `gt` - greater than; `gteq` - greater than or equal to; `lt` - lower than; `lteq` - lower than or equal to; `like`")
      @Valid
    public List<VariableQueryParameterDto> getVariableValues() {
    return variableValues;
  }

  public void setVariableValues(List<VariableQueryParameterDto> variableValues) {
    this.variableValues = variableValues;
  }

  public VariableInstanceQueryDto variableNamesIgnoreCase(Boolean variableNamesIgnoreCase) {
    this.variableNamesIgnoreCase = variableNamesIgnoreCase;
    return this;
  }

  /**
   * Match all variable names provided in `variableValues` case-insensitively. If set to `true` **variableName** and **variablename** are treated as equal.
   * @return variableNamesIgnoreCase
   **/
  @Schema(description = "Match all variable names provided in `variableValues` case-insensitively. If set to `true` **variableName** and **variablename** are treated as equal.")
  
    public Boolean isVariableNamesIgnoreCase() {
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
   **/
  @Schema(description = "Match all variable values provided in `variableValues` case-insensitively. If set to `true` **variableValue** and **variablevalue** are treated as equal.")
  
    public Boolean isVariableValuesIgnoreCase() {
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
   **/
  @Schema(description = "Only include variable instances which belong to one of passed scope ids.")
  
    public List<String> getVariableScopeIdIn() {
    return variableScopeIdIn;
  }

  public void setVariableScopeIdIn(List<String> variableScopeIdIn) {
    this.variableScopeIdIn = variableScopeIdIn;
  }

  public VariableInstanceQueryDto sorting(List<VariableInstanceQueryDtoSorting> sorting) {
    this.sorting = sorting;
    return this;
  }

  public VariableInstanceQueryDto addSortingItem(VariableInstanceQueryDtoSorting sortingItem) {
    if (this.sorting == null) {
      this.sorting = new ArrayList<>();
    }
    this.sorting.add(sortingItem);
    return this;
  }

  /**
   * An array of criteria to sort the result by. Each element of the array is an object that specifies one ordering.                       The position in the array identifies the rank of an ordering, i.e., whether it is primary, secondary, etc.                       Sorting has no effect for `count` endpoints
   * @return sorting
   **/
  @Schema(description = "An array of criteria to sort the result by. Each element of the array is an object that specifies one ordering.                       The position in the array identifies the rank of an ordering, i.e., whether it is primary, secondary, etc.                       Sorting has no effect for `count` endpoints")
      @Valid
    public List<VariableInstanceQueryDtoSorting> getSorting() {
    return sorting;
  }

  public void setSorting(List<VariableInstanceQueryDtoSorting> sorting) {
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
