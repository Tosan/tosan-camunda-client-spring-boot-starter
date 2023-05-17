package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;

/**
 * HistoricDecisionInstanceDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class HistoricDecisionInstanceDto   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("decisionDefinitionId")
  private String decisionDefinitionId = null;

  @JsonProperty("decisionDefinitionKey")
  private String decisionDefinitionKey = null;

  @JsonProperty("decisionDefinitionName")
  private String decisionDefinitionName = null;

  @JsonProperty("evaluationTime")
  private OffsetDateTime evaluationTime = null;

  @JsonProperty("removalTime")
  private OffsetDateTime removalTime = null;

  @JsonProperty("processDefinitionId")
  private String processDefinitionId = null;

  @JsonProperty("processDefinitionKey")
  private String processDefinitionKey = null;

  @JsonProperty("processInstanceId")
  private String processInstanceId = null;

  @JsonProperty("caseDefinitionId")
  private String caseDefinitionId = null;

  @JsonProperty("caseDefinitionKey")
  private String caseDefinitionKey = null;

  @JsonProperty("caseInstanceId")
  private String caseInstanceId = null;

  @JsonProperty("activityId")
  private String activityId = null;

  @JsonProperty("activityInstanceId")
  private String activityInstanceId = null;

  @JsonProperty("tenantId")
  private String tenantId = null;

  @JsonProperty("userId")
  private String userId = null;

  @JsonProperty("inputs")
  @Valid
  private List<HistoricDecisionInputInstanceDto> inputs = null;

  @JsonProperty("ouputs")
  @Valid
  private List<HistoricDecisionOutputInstanceDto> ouputs = null;

  @JsonProperty("collectResultValue")
  private Double collectResultValue = null;

  @JsonProperty("rootDecisionInstanceId")
  private String rootDecisionInstanceId = null;

  @JsonProperty("rootProcessInstanceId")
  private String rootProcessInstanceId = null;

  @JsonProperty("decisionRequirementsDefinitionId")
  private String decisionRequirementsDefinitionId = null;

  @JsonProperty("decisionRequirementsDefinitionKey")
  private String decisionRequirementsDefinitionKey = null;

  public HistoricDecisionInstanceDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the decision instance.
   * @return id
   **/
  @Schema(description = "The id of the decision instance.")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public HistoricDecisionInstanceDto decisionDefinitionId(String decisionDefinitionId) {
    this.decisionDefinitionId = decisionDefinitionId;
    return this;
  }

  /**
   * The id of the decision definition that this decision instance belongs to.
   * @return decisionDefinitionId
   **/
  @Schema(description = "The id of the decision definition that this decision instance belongs to.")
  
    public String getDecisionDefinitionId() {
    return decisionDefinitionId;
  }

  public void setDecisionDefinitionId(String decisionDefinitionId) {
    this.decisionDefinitionId = decisionDefinitionId;
  }

  public HistoricDecisionInstanceDto decisionDefinitionKey(String decisionDefinitionKey) {
    this.decisionDefinitionKey = decisionDefinitionKey;
    return this;
  }

  /**
   * The key of the decision definition that this decision instance belongs to.
   * @return decisionDefinitionKey
   **/
  @Schema(description = "The key of the decision definition that this decision instance belongs to.")
  
    public String getDecisionDefinitionKey() {
    return decisionDefinitionKey;
  }

  public void setDecisionDefinitionKey(String decisionDefinitionKey) {
    this.decisionDefinitionKey = decisionDefinitionKey;
  }

  public HistoricDecisionInstanceDto decisionDefinitionName(String decisionDefinitionName) {
    this.decisionDefinitionName = decisionDefinitionName;
    return this;
  }

  /**
   * The name of the decision definition that this decision instance belongs to.
   * @return decisionDefinitionName
   **/
  @Schema(description = "The name of the decision definition that this decision instance belongs to.")
  
    public String getDecisionDefinitionName() {
    return decisionDefinitionName;
  }

  public void setDecisionDefinitionName(String decisionDefinitionName) {
    this.decisionDefinitionName = decisionDefinitionName;
  }

  public HistoricDecisionInstanceDto evaluationTime(OffsetDateTime evaluationTime) {
    this.evaluationTime = evaluationTime;
    return this;
  }

  /**
   * The time the instance was evaluated.  [Default format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.
   * @return evaluationTime
   **/
  @Schema(description = "The time the instance was evaluated.  [Default format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.")
  
    @Valid
    public OffsetDateTime getEvaluationTime() {
    return evaluationTime;
  }

  public void setEvaluationTime(OffsetDateTime evaluationTime) {
    this.evaluationTime = evaluationTime;
  }

  public HistoricDecisionInstanceDto removalTime(OffsetDateTime removalTime) {
    this.removalTime = removalTime;
    return this;
  }

  /**
   * The time after which the instance should be removed by the History Cleanup job. [Default format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.
   * @return removalTime
   **/
  @Schema(description = "The time after which the instance should be removed by the History Cleanup job. [Default format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.")
  
    @Valid
    public OffsetDateTime getRemovalTime() {
    return removalTime;
  }

  public void setRemovalTime(OffsetDateTime removalTime) {
    this.removalTime = removalTime;
  }

  public HistoricDecisionInstanceDto processDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
    return this;
  }

  /**
   * The id of the process definition that this decision instance belongs to.
   * @return processDefinitionId
   **/
  @Schema(description = "The id of the process definition that this decision instance belongs to.")
  
    public String getProcessDefinitionId() {
    return processDefinitionId;
  }

  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }

  public HistoricDecisionInstanceDto processDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
    return this;
  }

  /**
   * The key of the process definition that this decision instance belongs to.
   * @return processDefinitionKey
   **/
  @Schema(description = "The key of the process definition that this decision instance belongs to.")
  
    public String getProcessDefinitionKey() {
    return processDefinitionKey;
  }

  public void setProcessDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
  }

  public HistoricDecisionInstanceDto processInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
    return this;
  }

  /**
   * The id of the process instance that this decision instance belongs to.
   * @return processInstanceId
   **/
  @Schema(description = "The id of the process instance that this decision instance belongs to.")
  
    public String getProcessInstanceId() {
    return processInstanceId;
  }

  public void setProcessInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
  }

  public HistoricDecisionInstanceDto caseDefinitionId(String caseDefinitionId) {
    this.caseDefinitionId = caseDefinitionId;
    return this;
  }

  /**
   * The id of the case definition that this decision instance belongs to.
   * @return caseDefinitionId
   **/
  @Schema(description = "The id of the case definition that this decision instance belongs to.")
  
    public String getCaseDefinitionId() {
    return caseDefinitionId;
  }

  public void setCaseDefinitionId(String caseDefinitionId) {
    this.caseDefinitionId = caseDefinitionId;
  }

  public HistoricDecisionInstanceDto caseDefinitionKey(String caseDefinitionKey) {
    this.caseDefinitionKey = caseDefinitionKey;
    return this;
  }

  /**
   * The key of the case definition that this decision instance belongs to.
   * @return caseDefinitionKey
   **/
  @Schema(description = "The key of the case definition that this decision instance belongs to.")
  
    public String getCaseDefinitionKey() {
    return caseDefinitionKey;
  }

  public void setCaseDefinitionKey(String caseDefinitionKey) {
    this.caseDefinitionKey = caseDefinitionKey;
  }

  public HistoricDecisionInstanceDto caseInstanceId(String caseInstanceId) {
    this.caseInstanceId = caseInstanceId;
    return this;
  }

  /**
   * The id of the case instance that this decision instance belongs to.
   * @return caseInstanceId
   **/
  @Schema(description = "The id of the case instance that this decision instance belongs to.")
  
    public String getCaseInstanceId() {
    return caseInstanceId;
  }

  public void setCaseInstanceId(String caseInstanceId) {
    this.caseInstanceId = caseInstanceId;
  }

  public HistoricDecisionInstanceDto activityId(String activityId) {
    this.activityId = activityId;
    return this;
  }

  /**
   * The id of the activity that this decision instance belongs to.
   * @return activityId
   **/
  @Schema(description = "The id of the activity that this decision instance belongs to.")
  
    public String getActivityId() {
    return activityId;
  }

  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }

  public HistoricDecisionInstanceDto activityInstanceId(String activityInstanceId) {
    this.activityInstanceId = activityInstanceId;
    return this;
  }

  /**
   * The id of the activity instance that this decision instance belongs to.
   * @return activityInstanceId
   **/
  @Schema(description = "The id of the activity instance that this decision instance belongs to.")
  
    public String getActivityInstanceId() {
    return activityInstanceId;
  }

  public void setActivityInstanceId(String activityInstanceId) {
    this.activityInstanceId = activityInstanceId;
  }

  public HistoricDecisionInstanceDto tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * The tenant id of the historic decision instance.
   * @return tenantId
   **/
  @Schema(description = "The tenant id of the historic decision instance.")
  
    public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public HistoricDecisionInstanceDto userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * The id of the authenticated user that has evaluated this decision instance without a process or case instance.
   * @return userId
   **/
  @Schema(description = "The id of the authenticated user that has evaluated this decision instance without a process or case instance.")
  
    public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public HistoricDecisionInstanceDto inputs(List<HistoricDecisionInputInstanceDto> inputs) {
    this.inputs = inputs;
    return this;
  }

  public HistoricDecisionInstanceDto addInputsItem(HistoricDecisionInputInstanceDto inputsItem) {
    if (this.inputs == null) {
      this.inputs = new ArrayList<>();
    }
    this.inputs.add(inputsItem);
    return this;
  }

  /**
   * The list of decision input values. **Only exists** if `includeInputs` was set to `true` in the query.
   * @return inputs
   **/
  @Schema(description = "The list of decision input values. **Only exists** if `includeInputs` was set to `true` in the query.")
      @Valid
    public List<HistoricDecisionInputInstanceDto> getInputs() {
    return inputs;
  }

  public void setInputs(List<HistoricDecisionInputInstanceDto> inputs) {
    this.inputs = inputs;
  }

  public HistoricDecisionInstanceDto ouputs(List<HistoricDecisionOutputInstanceDto> ouputs) {
    this.ouputs = ouputs;
    return this;
  }

  public HistoricDecisionInstanceDto addOuputsItem(HistoricDecisionOutputInstanceDto ouputsItem) {
    if (this.ouputs == null) {
      this.ouputs = new ArrayList<>();
    }
    this.ouputs.add(ouputsItem);
    return this;
  }

  /**
   * The list of decision output values. **Only exists** if `includeOutputs` was set to `true` in the query.
   * @return ouputs
   **/
  @Schema(description = "The list of decision output values. **Only exists** if `includeOutputs` was set to `true` in the query.")
      @Valid
    public List<HistoricDecisionOutputInstanceDto> getOuputs() {
    return ouputs;
  }

  public void setOuputs(List<HistoricDecisionOutputInstanceDto> ouputs) {
    this.ouputs = ouputs;
  }

  public HistoricDecisionInstanceDto collectResultValue(Double collectResultValue) {
    this.collectResultValue = collectResultValue;
    return this;
  }

  /**
   * The result of the collect aggregation of the decision result if used. `null` if no aggregation was used.
   * @return collectResultValue
   **/
  @Schema(description = "The result of the collect aggregation of the decision result if used. `null` if no aggregation was used.")
  
    public Double getCollectResultValue() {
    return collectResultValue;
  }

  public void setCollectResultValue(Double collectResultValue) {
    this.collectResultValue = collectResultValue;
  }

  public HistoricDecisionInstanceDto rootDecisionInstanceId(String rootDecisionInstanceId) {
    this.rootDecisionInstanceId = rootDecisionInstanceId;
    return this;
  }

  /**
   * The decision instance id of the evaluated root decision. Can be `null` if this instance is the root decision instance of the evaluation.
   * @return rootDecisionInstanceId
   **/
  @Schema(description = "The decision instance id of the evaluated root decision. Can be `null` if this instance is the root decision instance of the evaluation.")
  
    public String getRootDecisionInstanceId() {
    return rootDecisionInstanceId;
  }

  public void setRootDecisionInstanceId(String rootDecisionInstanceId) {
    this.rootDecisionInstanceId = rootDecisionInstanceId;
  }

  public HistoricDecisionInstanceDto rootProcessInstanceId(String rootProcessInstanceId) {
    this.rootProcessInstanceId = rootProcessInstanceId;
    return this;
  }

  /**
   * The process instance id of the root process instance that initiated the evaluation of this decision. Can be `null` if this decision instance is not evaluated as part of a BPMN process.
   * @return rootProcessInstanceId
   **/
  @Schema(description = "The process instance id of the root process instance that initiated the evaluation of this decision. Can be `null` if this decision instance is not evaluated as part of a BPMN process.")
  
    public String getRootProcessInstanceId() {
    return rootProcessInstanceId;
  }

  public void setRootProcessInstanceId(String rootProcessInstanceId) {
    this.rootProcessInstanceId = rootProcessInstanceId;
  }

  public HistoricDecisionInstanceDto decisionRequirementsDefinitionId(String decisionRequirementsDefinitionId) {
    this.decisionRequirementsDefinitionId = decisionRequirementsDefinitionId;
    return this;
  }

  /**
   * The id of the decision requirements definition that this decision instance belongs to.
   * @return decisionRequirementsDefinitionId
   **/
  @Schema(description = "The id of the decision requirements definition that this decision instance belongs to.")
  
    public String getDecisionRequirementsDefinitionId() {
    return decisionRequirementsDefinitionId;
  }

  public void setDecisionRequirementsDefinitionId(String decisionRequirementsDefinitionId) {
    this.decisionRequirementsDefinitionId = decisionRequirementsDefinitionId;
  }

  public HistoricDecisionInstanceDto decisionRequirementsDefinitionKey(String decisionRequirementsDefinitionKey) {
    this.decisionRequirementsDefinitionKey = decisionRequirementsDefinitionKey;
    return this;
  }

  /**
   * The key of the decision requirements definition that this decision instance belongs to.
   * @return decisionRequirementsDefinitionKey
   **/
  @Schema(description = "The key of the decision requirements definition that this decision instance belongs to.")
  
    public String getDecisionRequirementsDefinitionKey() {
    return decisionRequirementsDefinitionKey;
  }

  public void setDecisionRequirementsDefinitionKey(String decisionRequirementsDefinitionKey) {
    this.decisionRequirementsDefinitionKey = decisionRequirementsDefinitionKey;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricDecisionInstanceDto historicDecisionInstanceDto = (HistoricDecisionInstanceDto) o;
    return Objects.equals(this.id, historicDecisionInstanceDto.id) &&
        Objects.equals(this.decisionDefinitionId, historicDecisionInstanceDto.decisionDefinitionId) &&
        Objects.equals(this.decisionDefinitionKey, historicDecisionInstanceDto.decisionDefinitionKey) &&
        Objects.equals(this.decisionDefinitionName, historicDecisionInstanceDto.decisionDefinitionName) &&
        Objects.equals(this.evaluationTime, historicDecisionInstanceDto.evaluationTime) &&
        Objects.equals(this.removalTime, historicDecisionInstanceDto.removalTime) &&
        Objects.equals(this.processDefinitionId, historicDecisionInstanceDto.processDefinitionId) &&
        Objects.equals(this.processDefinitionKey, historicDecisionInstanceDto.processDefinitionKey) &&
        Objects.equals(this.processInstanceId, historicDecisionInstanceDto.processInstanceId) &&
        Objects.equals(this.caseDefinitionId, historicDecisionInstanceDto.caseDefinitionId) &&
        Objects.equals(this.caseDefinitionKey, historicDecisionInstanceDto.caseDefinitionKey) &&
        Objects.equals(this.caseInstanceId, historicDecisionInstanceDto.caseInstanceId) &&
        Objects.equals(this.activityId, historicDecisionInstanceDto.activityId) &&
        Objects.equals(this.activityInstanceId, historicDecisionInstanceDto.activityInstanceId) &&
        Objects.equals(this.tenantId, historicDecisionInstanceDto.tenantId) &&
        Objects.equals(this.userId, historicDecisionInstanceDto.userId) &&
        Objects.equals(this.inputs, historicDecisionInstanceDto.inputs) &&
        Objects.equals(this.ouputs, historicDecisionInstanceDto.ouputs) &&
        Objects.equals(this.collectResultValue, historicDecisionInstanceDto.collectResultValue) &&
        Objects.equals(this.rootDecisionInstanceId, historicDecisionInstanceDto.rootDecisionInstanceId) &&
        Objects.equals(this.rootProcessInstanceId, historicDecisionInstanceDto.rootProcessInstanceId) &&
        Objects.equals(this.decisionRequirementsDefinitionId, historicDecisionInstanceDto.decisionRequirementsDefinitionId) &&
        Objects.equals(this.decisionRequirementsDefinitionKey, historicDecisionInstanceDto.decisionRequirementsDefinitionKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, decisionDefinitionId, decisionDefinitionKey, decisionDefinitionName, evaluationTime, removalTime, processDefinitionId, processDefinitionKey, processInstanceId, caseDefinitionId, caseDefinitionKey, caseInstanceId, activityId, activityInstanceId, tenantId, userId, inputs, ouputs, collectResultValue, rootDecisionInstanceId, rootProcessInstanceId, decisionRequirementsDefinitionId, decisionRequirementsDefinitionKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricDecisionInstanceDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    decisionDefinitionId: ").append(toIndentedString(decisionDefinitionId)).append("\n");
    sb.append("    decisionDefinitionKey: ").append(toIndentedString(decisionDefinitionKey)).append("\n");
    sb.append("    decisionDefinitionName: ").append(toIndentedString(decisionDefinitionName)).append("\n");
    sb.append("    evaluationTime: ").append(toIndentedString(evaluationTime)).append("\n");
    sb.append("    removalTime: ").append(toIndentedString(removalTime)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    caseDefinitionId: ").append(toIndentedString(caseDefinitionId)).append("\n");
    sb.append("    caseDefinitionKey: ").append(toIndentedString(caseDefinitionKey)).append("\n");
    sb.append("    caseInstanceId: ").append(toIndentedString(caseInstanceId)).append("\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    activityInstanceId: ").append(toIndentedString(activityInstanceId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    ouputs: ").append(toIndentedString(ouputs)).append("\n");
    sb.append("    collectResultValue: ").append(toIndentedString(collectResultValue)).append("\n");
    sb.append("    rootDecisionInstanceId: ").append(toIndentedString(rootDecisionInstanceId)).append("\n");
    sb.append("    rootProcessInstanceId: ").append(toIndentedString(rootProcessInstanceId)).append("\n");
    sb.append("    decisionRequirementsDefinitionId: ").append(toIndentedString(decisionRequirementsDefinitionId)).append("\n");
    sb.append("    decisionRequirementsDefinitionKey: ").append(toIndentedString(decisionRequirementsDefinitionKey)).append("\n");
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
