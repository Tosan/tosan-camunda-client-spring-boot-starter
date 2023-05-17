package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;

/**
 * HistoricDecisionOutputInstanceDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class HistoricDecisionOutputInstanceDto   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("decisionInstanceId")
  private String decisionInstanceId = null;

  @JsonProperty("clauseId")
  private String clauseId = null;

  @JsonProperty("clauseName")
  private String clauseName = null;

  @JsonProperty("ruleId")
  private String ruleId = null;

  @JsonProperty("ruleOrder")
  private Integer ruleOrder = null;

  @JsonProperty("errorMessage")
  private String errorMessage = null;

  @JsonProperty("variableName")
  private String variableName = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("createTime")
  private OffsetDateTime createTime = null;

  @JsonProperty("removalTime")
  private OffsetDateTime removalTime = null;

  @JsonProperty("rootProcessInstanceId")
  private String rootProcessInstanceId = null;

  @JsonProperty("value")
  private Object value = null;

  @JsonProperty("valueInfo")
  @Valid
  private Map<String, Object> valueInfo = null;

  public HistoricDecisionOutputInstanceDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the decision output value.
   * @return id
   **/
  @Schema(description = "The id of the decision output value.")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public HistoricDecisionOutputInstanceDto decisionInstanceId(String decisionInstanceId) {
    this.decisionInstanceId = decisionInstanceId;
    return this;
  }

  /**
   * The id of the decision instance the output value belongs to.
   * @return decisionInstanceId
   **/
  @Schema(description = "The id of the decision instance the output value belongs to.")
  
    public String getDecisionInstanceId() {
    return decisionInstanceId;
  }

  public void setDecisionInstanceId(String decisionInstanceId) {
    this.decisionInstanceId = decisionInstanceId;
  }

  public HistoricDecisionOutputInstanceDto clauseId(String clauseId) {
    this.clauseId = clauseId;
    return this;
  }

  /**
   * The id of the clause the output value belongs to.
   * @return clauseId
   **/
  @Schema(description = "The id of the clause the output value belongs to.")
  
    public String getClauseId() {
    return clauseId;
  }

  public void setClauseId(String clauseId) {
    this.clauseId = clauseId;
  }

  public HistoricDecisionOutputInstanceDto clauseName(String clauseName) {
    this.clauseName = clauseName;
    return this;
  }

  /**
   * The name of the clause the output value belongs to.
   * @return clauseName
   **/
  @Schema(description = "The name of the clause the output value belongs to.")
  
    public String getClauseName() {
    return clauseName;
  }

  public void setClauseName(String clauseName) {
    this.clauseName = clauseName;
  }

  public HistoricDecisionOutputInstanceDto ruleId(String ruleId) {
    this.ruleId = ruleId;
    return this;
  }

  /**
   * The id of the rule the output value belongs to.
   * @return ruleId
   **/
  @Schema(description = "The id of the rule the output value belongs to.")
  
    public String getRuleId() {
    return ruleId;
  }

  public void setRuleId(String ruleId) {
    this.ruleId = ruleId;
  }

  public HistoricDecisionOutputInstanceDto ruleOrder(Integer ruleOrder) {
    this.ruleOrder = ruleOrder;
    return this;
  }

  /**
   * The order of the rule the output value belongs to.
   * @return ruleOrder
   **/
  @Schema(description = "The order of the rule the output value belongs to.")
  
    public Integer getRuleOrder() {
    return ruleOrder;
  }

  public void setRuleOrder(Integer ruleOrder) {
    this.ruleOrder = ruleOrder;
  }

  public HistoricDecisionOutputInstanceDto errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * An error message in case a Java Serialized Object could not be de-serialized.
   * @return errorMessage
   **/
  @Schema(description = "An error message in case a Java Serialized Object could not be de-serialized.")
  
    public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public HistoricDecisionOutputInstanceDto variableName(String variableName) {
    this.variableName = variableName;
    return this;
  }

  /**
   * The name of the output variable.
   * @return variableName
   **/
  @Schema(description = "The name of the output variable.")
  
    public String getVariableName() {
    return variableName;
  }

  public void setVariableName(String variableName) {
    this.variableName = variableName;
  }

  public HistoricDecisionOutputInstanceDto type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The value type of the variable.
   * @return type
   **/
  @Schema(description = "The value type of the variable.")
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public HistoricDecisionOutputInstanceDto createTime(OffsetDateTime createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * The time the variable was inserted.  [Default format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.
   * @return createTime
   **/
  @Schema(description = "The time the variable was inserted.  [Default format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.")
  
    @Valid
    public OffsetDateTime getCreateTime() {
    return createTime;
  }

  public void setCreateTime(OffsetDateTime createTime) {
    this.createTime = createTime;
  }

  public HistoricDecisionOutputInstanceDto removalTime(OffsetDateTime removalTime) {
    this.removalTime = removalTime;
    return this;
  }

  /**
   * The time after which the entry should be removed by the History Cleanup job. [Default format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.
   * @return removalTime
   **/
  @Schema(description = "The time after which the entry should be removed by the History Cleanup job. [Default format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.")
  
    @Valid
    public OffsetDateTime getRemovalTime() {
    return removalTime;
  }

  public void setRemovalTime(OffsetDateTime removalTime) {
    this.removalTime = removalTime;
  }

  public HistoricDecisionOutputInstanceDto rootProcessInstanceId(String rootProcessInstanceId) {
    this.rootProcessInstanceId = rootProcessInstanceId;
    return this;
  }

  /**
   * The process instance id of the root process instance that initiated the process containing this entry.
   * @return rootProcessInstanceId
   **/
  @Schema(description = "The process instance id of the root process instance that initiated the process containing this entry.")
  
    public String getRootProcessInstanceId() {
    return rootProcessInstanceId;
  }

  public void setRootProcessInstanceId(String rootProcessInstanceId) {
    this.rootProcessInstanceId = rootProcessInstanceId;
  }

  public HistoricDecisionOutputInstanceDto value(Object value) {
    this.value = value;
    return this;
  }

  /**
   * The variable's value. Value differs depending on the variable's type and on the `disableCustomObjectDeserialization` parameter.
   * @return value
   **/
  @Schema(description = "The variable's value. Value differs depending on the variable's type and on the `disableCustomObjectDeserialization` parameter.")
  
    public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }

  public HistoricDecisionOutputInstanceDto valueInfo(Map<String, Object> valueInfo) {
    this.valueInfo = valueInfo;
    return this;
  }

  public HistoricDecisionOutputInstanceDto putValueInfoItem(String key, Object valueInfoItem) {
    if (this.valueInfo == null) {
      this.valueInfo = new HashMap<>();
    }
    this.valueInfo.put(key, valueInfoItem);
    return this;
  }

  /**
   * A JSON object containing additional, value-type-dependent properties.  For variables of type `Object`, the following properties are returned:  * `objectTypeName`: A string representation of the object's type name.  * `serializationDataFormat`: The serialization format used to store the variable.
   * @return valueInfo
   **/
  @Schema(description = "A JSON object containing additional, value-type-dependent properties.  For variables of type `Object`, the following properties are returned:  * `objectTypeName`: A string representation of the object's type name.  * `serializationDataFormat`: The serialization format used to store the variable.")
  
    public Map<String, Object> getValueInfo() {
    return valueInfo;
  }

  public void setValueInfo(Map<String, Object> valueInfo) {
    this.valueInfo = valueInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricDecisionOutputInstanceDto historicDecisionOutputInstanceDto = (HistoricDecisionOutputInstanceDto) o;
    return Objects.equals(this.id, historicDecisionOutputInstanceDto.id) &&
        Objects.equals(this.decisionInstanceId, historicDecisionOutputInstanceDto.decisionInstanceId) &&
        Objects.equals(this.clauseId, historicDecisionOutputInstanceDto.clauseId) &&
        Objects.equals(this.clauseName, historicDecisionOutputInstanceDto.clauseName) &&
        Objects.equals(this.ruleId, historicDecisionOutputInstanceDto.ruleId) &&
        Objects.equals(this.ruleOrder, historicDecisionOutputInstanceDto.ruleOrder) &&
        Objects.equals(this.errorMessage, historicDecisionOutputInstanceDto.errorMessage) &&
        Objects.equals(this.variableName, historicDecisionOutputInstanceDto.variableName) &&
        Objects.equals(this.type, historicDecisionOutputInstanceDto.type) &&
        Objects.equals(this.createTime, historicDecisionOutputInstanceDto.createTime) &&
        Objects.equals(this.removalTime, historicDecisionOutputInstanceDto.removalTime) &&
        Objects.equals(this.rootProcessInstanceId, historicDecisionOutputInstanceDto.rootProcessInstanceId) &&
        Objects.equals(this.value, historicDecisionOutputInstanceDto.value) &&
        Objects.equals(this.valueInfo, historicDecisionOutputInstanceDto.valueInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, decisionInstanceId, clauseId, clauseName, ruleId, ruleOrder, errorMessage, variableName, type, createTime, removalTime, rootProcessInstanceId, value, valueInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricDecisionOutputInstanceDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    decisionInstanceId: ").append(toIndentedString(decisionInstanceId)).append("\n");
    sb.append("    clauseId: ").append(toIndentedString(clauseId)).append("\n");
    sb.append("    clauseName: ").append(toIndentedString(clauseName)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    ruleOrder: ").append(toIndentedString(ruleOrder)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    variableName: ").append(toIndentedString(variableName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    removalTime: ").append(toIndentedString(removalTime)).append("\n");
    sb.append("    rootProcessInstanceId: ").append(toIndentedString(rootProcessInstanceId)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueInfo: ").append(toIndentedString(valueInfo)).append("\n");
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
