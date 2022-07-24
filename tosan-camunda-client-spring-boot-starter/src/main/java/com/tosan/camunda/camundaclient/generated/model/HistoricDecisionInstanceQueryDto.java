package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * A historic decision instance query which defines a list of historic decision instances
 */
@Schema(description = "A historic decision instance query which defines a list of historic decision instances")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class HistoricDecisionInstanceQueryDto   {
  @JsonProperty("decisionInstanceId")
  private String decisionInstanceId = null;

  @JsonProperty("decisionInstanceIdIn")
  @Valid
  private List<String> decisionInstanceIdIn = null;

  @JsonProperty("decisionDefinitionId")
  private String decisionDefinitionId = null;

  @JsonProperty("decisionDefinitionIdIn")
  @Valid
  private List<String> decisionDefinitionIdIn = null;

  @JsonProperty("decisionDefinitionKey")
  private String decisionDefinitionKey = null;

  @JsonProperty("decisionDefinitionKeyIn")
  @Valid
  private List<String> decisionDefinitionKeyIn = null;

  @JsonProperty("decisionDefinitionName")
  private String decisionDefinitionName = null;

  @JsonProperty("decisionDefinitionNameLike")
  private String decisionDefinitionNameLike = null;

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

  @JsonProperty("activityIdIn")
  @Valid
  private List<String> activityIdIn = null;

  @JsonProperty("activityInstanceIdIn")
  @Valid
  private List<String> activityInstanceIdIn = null;

  @JsonProperty("tenantIdIn")
  @Valid
  private List<String> tenantIdIn = null;

  @JsonProperty("withoutTenantId")
  private Boolean withoutTenantId = null;

  @JsonProperty("evaluatedBefore")
  private OffsetDateTime evaluatedBefore = null;

  @JsonProperty("evaluatedAfter")
  private OffsetDateTime evaluatedAfter = null;

  @JsonProperty("userId")
  private String userId = null;

  @JsonProperty("rootDecisionInstanceId")
  private String rootDecisionInstanceId = null;

  @JsonProperty("rootDecisionInstancesOnly")
  private Boolean rootDecisionInstancesOnly = null;

  @JsonProperty("decisionRequirementsDefinitionId")
  private String decisionRequirementsDefinitionId = null;

  @JsonProperty("decisionRequirementsDefinitionKey")
  private String decisionRequirementsDefinitionKey = null;

  @JsonProperty("includeInputs")
  private Boolean includeInputs = null;

  @JsonProperty("includeOutputs")
  private Boolean includeOutputs = null;

  @JsonProperty("disableBinaryFetching")
  private Boolean disableBinaryFetching = null;

  @JsonProperty("disableCustomObjectDeserialization")
  private Boolean disableCustomObjectDeserialization = null;

  public HistoricDecisionInstanceQueryDto decisionInstanceId(String decisionInstanceId) {
    this.decisionInstanceId = decisionInstanceId;
    return this;
  }

  /**
   * Filter by decision instance id.
   * @return decisionInstanceId
   **/
  @Schema(description = "Filter by decision instance id.")
  
    public String getDecisionInstanceId() {
    return decisionInstanceId;
  }

  public void setDecisionInstanceId(String decisionInstanceId) {
    this.decisionInstanceId = decisionInstanceId;
  }

  public HistoricDecisionInstanceQueryDto decisionInstanceIdIn(List<String> decisionInstanceIdIn) {
    this.decisionInstanceIdIn = decisionInstanceIdIn;
    return this;
  }

  public HistoricDecisionInstanceQueryDto addDecisionInstanceIdInItem(String decisionInstanceIdInItem) {
    if (this.decisionInstanceIdIn == null) {
      this.decisionInstanceIdIn = new ArrayList<>();
    }
    this.decisionInstanceIdIn.add(decisionInstanceIdInItem);
    return this;
  }

  /**
   * Filter by decision instance ids. Must be a comma-separated list of decision instance ids.
   * @return decisionInstanceIdIn
   **/
  @Schema(description = "Filter by decision instance ids. Must be a comma-separated list of decision instance ids.")
  
    public List<String> getDecisionInstanceIdIn() {
    return decisionInstanceIdIn;
  }

  public void setDecisionInstanceIdIn(List<String> decisionInstanceIdIn) {
    this.decisionInstanceIdIn = decisionInstanceIdIn;
  }

  public HistoricDecisionInstanceQueryDto decisionDefinitionId(String decisionDefinitionId) {
    this.decisionDefinitionId = decisionDefinitionId;
    return this;
  }

  /**
   * Filter by the decision definition the instances belongs to.
   * @return decisionDefinitionId
   **/
  @Schema(description = "Filter by the decision definition the instances belongs to.")
  
    public String getDecisionDefinitionId() {
    return decisionDefinitionId;
  }

  public void setDecisionDefinitionId(String decisionDefinitionId) {
    this.decisionDefinitionId = decisionDefinitionId;
  }

  public HistoricDecisionInstanceQueryDto decisionDefinitionIdIn(List<String> decisionDefinitionIdIn) {
    this.decisionDefinitionIdIn = decisionDefinitionIdIn;
    return this;
  }

  public HistoricDecisionInstanceQueryDto addDecisionDefinitionIdInItem(String decisionDefinitionIdInItem) {
    if (this.decisionDefinitionIdIn == null) {
      this.decisionDefinitionIdIn = new ArrayList<>();
    }
    this.decisionDefinitionIdIn.add(decisionDefinitionIdInItem);
    return this;
  }

  /**
   * Filter by the decision definitions the instances belongs to. Must be a comma-separated list of decision definition ids.
   * @return decisionDefinitionIdIn
   **/
  @Schema(description = "Filter by the decision definitions the instances belongs to. Must be a comma-separated list of decision definition ids.")
  
    public List<String> getDecisionDefinitionIdIn() {
    return decisionDefinitionIdIn;
  }

  public void setDecisionDefinitionIdIn(List<String> decisionDefinitionIdIn) {
    this.decisionDefinitionIdIn = decisionDefinitionIdIn;
  }

  public HistoricDecisionInstanceQueryDto decisionDefinitionKey(String decisionDefinitionKey) {
    this.decisionDefinitionKey = decisionDefinitionKey;
    return this;
  }

  /**
   * Filter by the key of the decision definition the instances belongs to.
   * @return decisionDefinitionKey
   **/
  @Schema(description = "Filter by the key of the decision definition the instances belongs to.")
  
    public String getDecisionDefinitionKey() {
    return decisionDefinitionKey;
  }

  public void setDecisionDefinitionKey(String decisionDefinitionKey) {
    this.decisionDefinitionKey = decisionDefinitionKey;
  }

  public HistoricDecisionInstanceQueryDto decisionDefinitionKeyIn(List<String> decisionDefinitionKeyIn) {
    this.decisionDefinitionKeyIn = decisionDefinitionKeyIn;
    return this;
  }

  public HistoricDecisionInstanceQueryDto addDecisionDefinitionKeyInItem(String decisionDefinitionKeyInItem) {
    if (this.decisionDefinitionKeyIn == null) {
      this.decisionDefinitionKeyIn = new ArrayList<>();
    }
    this.decisionDefinitionKeyIn.add(decisionDefinitionKeyInItem);
    return this;
  }

  /**
   * Filter by the keys of the decision definition the instances belongs to. Must be a comma- separated list of decision definition keys.
   * @return decisionDefinitionKeyIn
   **/
  @Schema(description = "Filter by the keys of the decision definition the instances belongs to. Must be a comma- separated list of decision definition keys.")
  
    public List<String> getDecisionDefinitionKeyIn() {
    return decisionDefinitionKeyIn;
  }

  public void setDecisionDefinitionKeyIn(List<String> decisionDefinitionKeyIn) {
    this.decisionDefinitionKeyIn = decisionDefinitionKeyIn;
  }

  public HistoricDecisionInstanceQueryDto decisionDefinitionName(String decisionDefinitionName) {
    this.decisionDefinitionName = decisionDefinitionName;
    return this;
  }

  /**
   * Filter by the name of the decision definition the instances belongs to.
   * @return decisionDefinitionName
   **/
  @Schema(description = "Filter by the name of the decision definition the instances belongs to.")
  
    public String getDecisionDefinitionName() {
    return decisionDefinitionName;
  }

  public void setDecisionDefinitionName(String decisionDefinitionName) {
    this.decisionDefinitionName = decisionDefinitionName;
  }

  public HistoricDecisionInstanceQueryDto decisionDefinitionNameLike(String decisionDefinitionNameLike) {
    this.decisionDefinitionNameLike = decisionDefinitionNameLike;
    return this;
  }

  /**
   * Filter by the name of the decision definition the instances belongs to, that the parameter is a substring of.
   * @return decisionDefinitionNameLike
   **/
  @Schema(description = "Filter by the name of the decision definition the instances belongs to, that the parameter is a substring of.")
  
    public String getDecisionDefinitionNameLike() {
    return decisionDefinitionNameLike;
  }

  public void setDecisionDefinitionNameLike(String decisionDefinitionNameLike) {
    this.decisionDefinitionNameLike = decisionDefinitionNameLike;
  }

  public HistoricDecisionInstanceQueryDto processDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
    return this;
  }

  /**
   * Filter by the process definition the instances belongs to.
   * @return processDefinitionId
   **/
  @Schema(description = "Filter by the process definition the instances belongs to.")
  
    public String getProcessDefinitionId() {
    return processDefinitionId;
  }

  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }

  public HistoricDecisionInstanceQueryDto processDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
    return this;
  }

  /**
   * Filter by the key of the process definition the instances belongs to.
   * @return processDefinitionKey
   **/
  @Schema(description = "Filter by the key of the process definition the instances belongs to.")
  
    public String getProcessDefinitionKey() {
    return processDefinitionKey;
  }

  public void setProcessDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
  }

  public HistoricDecisionInstanceQueryDto processInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
    return this;
  }

  /**
   * Filter by the process instance the instances belongs to.
   * @return processInstanceId
   **/
  @Schema(description = "Filter by the process instance the instances belongs to.")
  
    public String getProcessInstanceId() {
    return processInstanceId;
  }

  public void setProcessInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
  }

  public HistoricDecisionInstanceQueryDto caseDefinitionId(String caseDefinitionId) {
    this.caseDefinitionId = caseDefinitionId;
    return this;
  }

  /**
   * Filter by the case definition the instances belongs to.
   * @return caseDefinitionId
   **/
  @Schema(description = "Filter by the case definition the instances belongs to.")
  
    public String getCaseDefinitionId() {
    return caseDefinitionId;
  }

  public void setCaseDefinitionId(String caseDefinitionId) {
    this.caseDefinitionId = caseDefinitionId;
  }

  public HistoricDecisionInstanceQueryDto caseDefinitionKey(String caseDefinitionKey) {
    this.caseDefinitionKey = caseDefinitionKey;
    return this;
  }

  /**
   * Filter by the key of the case definition the instances belongs to.
   * @return caseDefinitionKey
   **/
  @Schema(description = "Filter by the key of the case definition the instances belongs to.")
  
    public String getCaseDefinitionKey() {
    return caseDefinitionKey;
  }

  public void setCaseDefinitionKey(String caseDefinitionKey) {
    this.caseDefinitionKey = caseDefinitionKey;
  }

  public HistoricDecisionInstanceQueryDto caseInstanceId(String caseInstanceId) {
    this.caseInstanceId = caseInstanceId;
    return this;
  }

  /**
   * Filter by the case instance the instances belongs to.
   * @return caseInstanceId
   **/
  @Schema(description = "Filter by the case instance the instances belongs to.")
  
    public String getCaseInstanceId() {
    return caseInstanceId;
  }

  public void setCaseInstanceId(String caseInstanceId) {
    this.caseInstanceId = caseInstanceId;
  }

  public HistoricDecisionInstanceQueryDto activityIdIn(List<String> activityIdIn) {
    this.activityIdIn = activityIdIn;
    return this;
  }

  public HistoricDecisionInstanceQueryDto addActivityIdInItem(String activityIdInItem) {
    if (this.activityIdIn == null) {
      this.activityIdIn = new ArrayList<>();
    }
    this.activityIdIn.add(activityIdInItem);
    return this;
  }

  /**
   * Filter by the activity ids the instances belongs to. Must be a comma-separated list of acitvity ids.
   * @return activityIdIn
   **/
  @Schema(description = "Filter by the activity ids the instances belongs to. Must be a comma-separated list of acitvity ids.")
  
    public List<String> getActivityIdIn() {
    return activityIdIn;
  }

  public void setActivityIdIn(List<String> activityIdIn) {
    this.activityIdIn = activityIdIn;
  }

  public HistoricDecisionInstanceQueryDto activityInstanceIdIn(List<String> activityInstanceIdIn) {
    this.activityInstanceIdIn = activityInstanceIdIn;
    return this;
  }

  public HistoricDecisionInstanceQueryDto addActivityInstanceIdInItem(String activityInstanceIdInItem) {
    if (this.activityInstanceIdIn == null) {
      this.activityInstanceIdIn = new ArrayList<>();
    }
    this.activityInstanceIdIn.add(activityInstanceIdInItem);
    return this;
  }

  /**
   * Filter by the activity instance ids the instances belongs to. Must be a comma-separated list of acitvity instance ids.
   * @return activityInstanceIdIn
   **/
  @Schema(description = "Filter by the activity instance ids the instances belongs to. Must be a comma-separated list of acitvity instance ids.")
  
    public List<String> getActivityInstanceIdIn() {
    return activityInstanceIdIn;
  }

  public void setActivityInstanceIdIn(List<String> activityInstanceIdIn) {
    this.activityInstanceIdIn = activityInstanceIdIn;
  }

  public HistoricDecisionInstanceQueryDto tenantIdIn(List<String> tenantIdIn) {
    this.tenantIdIn = tenantIdIn;
    return this;
  }

  public HistoricDecisionInstanceQueryDto addTenantIdInItem(String tenantIdInItem) {
    if (this.tenantIdIn == null) {
      this.tenantIdIn = new ArrayList<>();
    }
    this.tenantIdIn.add(tenantIdInItem);
    return this;
  }

  /**
   * Filter by a comma-separated list of tenant ids. A historic decision instance must have one of the given tenant ids.
   * @return tenantIdIn
   **/
  @Schema(description = "Filter by a comma-separated list of tenant ids. A historic decision instance must have one of the given tenant ids.")
  
    public List<String> getTenantIdIn() {
    return tenantIdIn;
  }

  public void setTenantIdIn(List<String> tenantIdIn) {
    this.tenantIdIn = tenantIdIn;
  }

  public HistoricDecisionInstanceQueryDto withoutTenantId(Boolean withoutTenantId) {
    this.withoutTenantId = withoutTenantId;
    return this;
  }

  /**
   * Only include historic decision instances that belong to no tenant. Value may only be `true`, as `false` is the default behavior.
   * @return withoutTenantId
   **/
  @Schema(description = "Only include historic decision instances that belong to no tenant. Value may only be `true`, as `false` is the default behavior.")
  
    public Boolean isWithoutTenantId() {
    return withoutTenantId;
  }

  public void setWithoutTenantId(Boolean withoutTenantId) {
    this.withoutTenantId = withoutTenantId;
  }

  public HistoricDecisionInstanceQueryDto evaluatedBefore(OffsetDateTime evaluatedBefore) {
    this.evaluatedBefore = evaluatedBefore;
    return this;
  }

  /**
   * Restrict to instances that were evaluated before the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM- dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.
   * @return evaluatedBefore
   **/
  @Schema(description = "Restrict to instances that were evaluated before the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM- dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.")
  
    @Valid
    public OffsetDateTime getEvaluatedBefore() {
    return evaluatedBefore;
  }

  public void setEvaluatedBefore(OffsetDateTime evaluatedBefore) {
    this.evaluatedBefore = evaluatedBefore;
  }

  public HistoricDecisionInstanceQueryDto evaluatedAfter(OffsetDateTime evaluatedAfter) {
    this.evaluatedAfter = evaluatedAfter;
    return this;
  }

  /**
   * Restrict to instances that were evaluated after the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM- dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.
   * @return evaluatedAfter
   **/
  @Schema(description = "Restrict to instances that were evaluated after the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM- dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.")
  
    @Valid
    public OffsetDateTime getEvaluatedAfter() {
    return evaluatedAfter;
  }

  public void setEvaluatedAfter(OffsetDateTime evaluatedAfter) {
    this.evaluatedAfter = evaluatedAfter;
  }

  public HistoricDecisionInstanceQueryDto userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Restrict to instances that were evaluated by the given user.
   * @return userId
   **/
  @Schema(description = "Restrict to instances that were evaluated by the given user.")
  
    public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public HistoricDecisionInstanceQueryDto rootDecisionInstanceId(String rootDecisionInstanceId) {
    this.rootDecisionInstanceId = rootDecisionInstanceId;
    return this;
  }

  /**
   * Restrict to instances that have a given root decision instance id. This also includes the decision instance with the given id.
   * @return rootDecisionInstanceId
   **/
  @Schema(description = "Restrict to instances that have a given root decision instance id. This also includes the decision instance with the given id.")
  
    public String getRootDecisionInstanceId() {
    return rootDecisionInstanceId;
  }

  public void setRootDecisionInstanceId(String rootDecisionInstanceId) {
    this.rootDecisionInstanceId = rootDecisionInstanceId;
  }

  public HistoricDecisionInstanceQueryDto rootDecisionInstancesOnly(Boolean rootDecisionInstancesOnly) {
    this.rootDecisionInstancesOnly = rootDecisionInstancesOnly;
    return this;
  }

  /**
   * Restrict to instances those are the root decision instance of an evaluation. Value may only be `true`, as `false` is the default behavior.
   * @return rootDecisionInstancesOnly
   **/
  @Schema(description = "Restrict to instances those are the root decision instance of an evaluation. Value may only be `true`, as `false` is the default behavior.")
  
    public Boolean isRootDecisionInstancesOnly() {
    return rootDecisionInstancesOnly;
  }

  public void setRootDecisionInstancesOnly(Boolean rootDecisionInstancesOnly) {
    this.rootDecisionInstancesOnly = rootDecisionInstancesOnly;
  }

  public HistoricDecisionInstanceQueryDto decisionRequirementsDefinitionId(String decisionRequirementsDefinitionId) {
    this.decisionRequirementsDefinitionId = decisionRequirementsDefinitionId;
    return this;
  }

  /**
   * Filter by the decision requirements definition the instances belongs to.
   * @return decisionRequirementsDefinitionId
   **/
  @Schema(description = "Filter by the decision requirements definition the instances belongs to.")
  
    public String getDecisionRequirementsDefinitionId() {
    return decisionRequirementsDefinitionId;
  }

  public void setDecisionRequirementsDefinitionId(String decisionRequirementsDefinitionId) {
    this.decisionRequirementsDefinitionId = decisionRequirementsDefinitionId;
  }

  public HistoricDecisionInstanceQueryDto decisionRequirementsDefinitionKey(String decisionRequirementsDefinitionKey) {
    this.decisionRequirementsDefinitionKey = decisionRequirementsDefinitionKey;
    return this;
  }

  /**
   * Filter by the key of the decision requirements definition the instances belongs to.
   * @return decisionRequirementsDefinitionKey
   **/
  @Schema(description = "Filter by the key of the decision requirements definition the instances belongs to.")
  
    public String getDecisionRequirementsDefinitionKey() {
    return decisionRequirementsDefinitionKey;
  }

  public void setDecisionRequirementsDefinitionKey(String decisionRequirementsDefinitionKey) {
    this.decisionRequirementsDefinitionKey = decisionRequirementsDefinitionKey;
  }

  public HistoricDecisionInstanceQueryDto includeInputs(Boolean includeInputs) {
    this.includeInputs = includeInputs;
    return this;
  }

  /**
   * Include input values in the result. Value may only be `true`, as `false` is the default behavior.
   * @return includeInputs
   **/
  @Schema(description = "Include input values in the result. Value may only be `true`, as `false` is the default behavior.")
  
    public Boolean isIncludeInputs() {
    return includeInputs;
  }

  public void setIncludeInputs(Boolean includeInputs) {
    this.includeInputs = includeInputs;
  }

  public HistoricDecisionInstanceQueryDto includeOutputs(Boolean includeOutputs) {
    this.includeOutputs = includeOutputs;
    return this;
  }

  /**
   * Include output values in the result. Value may only be `true`, as `false` is the default behavior.
   * @return includeOutputs
   **/
  @Schema(description = "Include output values in the result. Value may only be `true`, as `false` is the default behavior.")
  
    public Boolean isIncludeOutputs() {
    return includeOutputs;
  }

  public void setIncludeOutputs(Boolean includeOutputs) {
    this.includeOutputs = includeOutputs;
  }

  public HistoricDecisionInstanceQueryDto disableBinaryFetching(Boolean disableBinaryFetching) {
    this.disableBinaryFetching = disableBinaryFetching;
    return this;
  }

  /**
   * Disables fetching of byte array input and output values. Value may only be `true`, as `false` is the default behavior.
   * @return disableBinaryFetching
   **/
  @Schema(description = "Disables fetching of byte array input and output values. Value may only be `true`, as `false` is the default behavior.")
  
    public Boolean isDisableBinaryFetching() {
    return disableBinaryFetching;
  }

  public void setDisableBinaryFetching(Boolean disableBinaryFetching) {
    this.disableBinaryFetching = disableBinaryFetching;
  }

  public HistoricDecisionInstanceQueryDto disableCustomObjectDeserialization(Boolean disableCustomObjectDeserialization) {
    this.disableCustomObjectDeserialization = disableCustomObjectDeserialization;
    return this;
  }

  /**
   * Disables deserialization of input and output values that are custom objects. Value may only be `true`, as `false` is the default behavior.
   * @return disableCustomObjectDeserialization
   **/
  @Schema(description = "Disables deserialization of input and output values that are custom objects. Value may only be `true`, as `false` is the default behavior.")
  
    public Boolean isDisableCustomObjectDeserialization() {
    return disableCustomObjectDeserialization;
  }

  public void setDisableCustomObjectDeserialization(Boolean disableCustomObjectDeserialization) {
    this.disableCustomObjectDeserialization = disableCustomObjectDeserialization;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricDecisionInstanceQueryDto historicDecisionInstanceQueryDto = (HistoricDecisionInstanceQueryDto) o;
    return Objects.equals(this.decisionInstanceId, historicDecisionInstanceQueryDto.decisionInstanceId) &&
        Objects.equals(this.decisionInstanceIdIn, historicDecisionInstanceQueryDto.decisionInstanceIdIn) &&
        Objects.equals(this.decisionDefinitionId, historicDecisionInstanceQueryDto.decisionDefinitionId) &&
        Objects.equals(this.decisionDefinitionIdIn, historicDecisionInstanceQueryDto.decisionDefinitionIdIn) &&
        Objects.equals(this.decisionDefinitionKey, historicDecisionInstanceQueryDto.decisionDefinitionKey) &&
        Objects.equals(this.decisionDefinitionKeyIn, historicDecisionInstanceQueryDto.decisionDefinitionKeyIn) &&
        Objects.equals(this.decisionDefinitionName, historicDecisionInstanceQueryDto.decisionDefinitionName) &&
        Objects.equals(this.decisionDefinitionNameLike, historicDecisionInstanceQueryDto.decisionDefinitionNameLike) &&
        Objects.equals(this.processDefinitionId, historicDecisionInstanceQueryDto.processDefinitionId) &&
        Objects.equals(this.processDefinitionKey, historicDecisionInstanceQueryDto.processDefinitionKey) &&
        Objects.equals(this.processInstanceId, historicDecisionInstanceQueryDto.processInstanceId) &&
        Objects.equals(this.caseDefinitionId, historicDecisionInstanceQueryDto.caseDefinitionId) &&
        Objects.equals(this.caseDefinitionKey, historicDecisionInstanceQueryDto.caseDefinitionKey) &&
        Objects.equals(this.caseInstanceId, historicDecisionInstanceQueryDto.caseInstanceId) &&
        Objects.equals(this.activityIdIn, historicDecisionInstanceQueryDto.activityIdIn) &&
        Objects.equals(this.activityInstanceIdIn, historicDecisionInstanceQueryDto.activityInstanceIdIn) &&
        Objects.equals(this.tenantIdIn, historicDecisionInstanceQueryDto.tenantIdIn) &&
        Objects.equals(this.withoutTenantId, historicDecisionInstanceQueryDto.withoutTenantId) &&
        Objects.equals(this.evaluatedBefore, historicDecisionInstanceQueryDto.evaluatedBefore) &&
        Objects.equals(this.evaluatedAfter, historicDecisionInstanceQueryDto.evaluatedAfter) &&
        Objects.equals(this.userId, historicDecisionInstanceQueryDto.userId) &&
        Objects.equals(this.rootDecisionInstanceId, historicDecisionInstanceQueryDto.rootDecisionInstanceId) &&
        Objects.equals(this.rootDecisionInstancesOnly, historicDecisionInstanceQueryDto.rootDecisionInstancesOnly) &&
        Objects.equals(this.decisionRequirementsDefinitionId, historicDecisionInstanceQueryDto.decisionRequirementsDefinitionId) &&
        Objects.equals(this.decisionRequirementsDefinitionKey, historicDecisionInstanceQueryDto.decisionRequirementsDefinitionKey) &&
        Objects.equals(this.includeInputs, historicDecisionInstanceQueryDto.includeInputs) &&
        Objects.equals(this.includeOutputs, historicDecisionInstanceQueryDto.includeOutputs) &&
        Objects.equals(this.disableBinaryFetching, historicDecisionInstanceQueryDto.disableBinaryFetching) &&
        Objects.equals(this.disableCustomObjectDeserialization, historicDecisionInstanceQueryDto.disableCustomObjectDeserialization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(decisionInstanceId, decisionInstanceIdIn, decisionDefinitionId, decisionDefinitionIdIn, decisionDefinitionKey, decisionDefinitionKeyIn, decisionDefinitionName, decisionDefinitionNameLike, processDefinitionId, processDefinitionKey, processInstanceId, caseDefinitionId, caseDefinitionKey, caseInstanceId, activityIdIn, activityInstanceIdIn, tenantIdIn, withoutTenantId, evaluatedBefore, evaluatedAfter, userId, rootDecisionInstanceId, rootDecisionInstancesOnly, decisionRequirementsDefinitionId, decisionRequirementsDefinitionKey, includeInputs, includeOutputs, disableBinaryFetching, disableCustomObjectDeserialization);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricDecisionInstanceQueryDto {\n");
    
    sb.append("    decisionInstanceId: ").append(toIndentedString(decisionInstanceId)).append("\n");
    sb.append("    decisionInstanceIdIn: ").append(toIndentedString(decisionInstanceIdIn)).append("\n");
    sb.append("    decisionDefinitionId: ").append(toIndentedString(decisionDefinitionId)).append("\n");
    sb.append("    decisionDefinitionIdIn: ").append(toIndentedString(decisionDefinitionIdIn)).append("\n");
    sb.append("    decisionDefinitionKey: ").append(toIndentedString(decisionDefinitionKey)).append("\n");
    sb.append("    decisionDefinitionKeyIn: ").append(toIndentedString(decisionDefinitionKeyIn)).append("\n");
    sb.append("    decisionDefinitionName: ").append(toIndentedString(decisionDefinitionName)).append("\n");
    sb.append("    decisionDefinitionNameLike: ").append(toIndentedString(decisionDefinitionNameLike)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    caseDefinitionId: ").append(toIndentedString(caseDefinitionId)).append("\n");
    sb.append("    caseDefinitionKey: ").append(toIndentedString(caseDefinitionKey)).append("\n");
    sb.append("    caseInstanceId: ").append(toIndentedString(caseInstanceId)).append("\n");
    sb.append("    activityIdIn: ").append(toIndentedString(activityIdIn)).append("\n");
    sb.append("    activityInstanceIdIn: ").append(toIndentedString(activityInstanceIdIn)).append("\n");
    sb.append("    tenantIdIn: ").append(toIndentedString(tenantIdIn)).append("\n");
    sb.append("    withoutTenantId: ").append(toIndentedString(withoutTenantId)).append("\n");
    sb.append("    evaluatedBefore: ").append(toIndentedString(evaluatedBefore)).append("\n");
    sb.append("    evaluatedAfter: ").append(toIndentedString(evaluatedAfter)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    rootDecisionInstanceId: ").append(toIndentedString(rootDecisionInstanceId)).append("\n");
    sb.append("    rootDecisionInstancesOnly: ").append(toIndentedString(rootDecisionInstancesOnly)).append("\n");
    sb.append("    decisionRequirementsDefinitionId: ").append(toIndentedString(decisionRequirementsDefinitionId)).append("\n");
    sb.append("    decisionRequirementsDefinitionKey: ").append(toIndentedString(decisionRequirementsDefinitionKey)).append("\n");
    sb.append("    includeInputs: ").append(toIndentedString(includeInputs)).append("\n");
    sb.append("    includeOutputs: ").append(toIndentedString(includeOutputs)).append("\n");
    sb.append("    disableBinaryFetching: ").append(toIndentedString(disableBinaryFetching)).append("\n");
    sb.append("    disableCustomObjectDeserialization: ").append(toIndentedString(disableCustomObjectDeserialization)).append("\n");
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
