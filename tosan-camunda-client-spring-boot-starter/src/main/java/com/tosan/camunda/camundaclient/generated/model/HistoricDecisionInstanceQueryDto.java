package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * A historic decision instance query which defines a list of historic decision instances
 */

@Schema(name = "HistoricDecisionInstanceQueryDto", description = "A historic decision instance query which defines a list of historic decision instances")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class HistoricDecisionInstanceQueryDto {

  private String decisionInstanceId = null;

  @Valid
  private List<String> decisionInstanceIdIn;

  private String decisionDefinitionId = null;

  @Valid
  private List<String> decisionDefinitionIdIn;

  private String decisionDefinitionKey = null;

  @Valid
  private List<String> decisionDefinitionKeyIn;

  private String decisionDefinitionName = null;

  private String decisionDefinitionNameLike = null;

  private String processDefinitionId = null;

  private String processDefinitionKey = null;

  private String processInstanceId = null;

  private String caseDefinitionId = null;

  private String caseDefinitionKey = null;

  private String caseInstanceId = null;

  @Valid
  private List<String> activityIdIn;

  @Valid
  private List<String> activityInstanceIdIn;

  @Valid
  private List<String> tenantIdIn;

  private Boolean withoutTenantId = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime evaluatedBefore = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime evaluatedAfter = null;

  private String userId = null;

  private String rootDecisionInstanceId = null;

  private Boolean rootDecisionInstancesOnly = null;

  private String decisionRequirementsDefinitionId = null;

  private String decisionRequirementsDefinitionKey = null;

  private Boolean includeInputs = null;

  private Boolean includeOutputs = null;

  private Boolean disableBinaryFetching = null;

  private Boolean disableCustomObjectDeserialization = null;

  public HistoricDecisionInstanceQueryDto decisionInstanceId(String decisionInstanceId) {
    this.decisionInstanceId = decisionInstanceId;
    return this;
  }

  /**
   * Filter by decision instance id.
   * @return decisionInstanceId
  */
  
  @Schema(name = "decisionInstanceId", description = "Filter by decision instance id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("decisionInstanceId")
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
  */
  
  @Schema(name = "decisionInstanceIdIn", description = "Filter by decision instance ids. Must be a comma-separated list of decision instance ids.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("decisionInstanceIdIn")
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
  */
  
  @Schema(name = "decisionDefinitionId", description = "Filter by the decision definition the instances belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("decisionDefinitionId")
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
  */
  
  @Schema(name = "decisionDefinitionIdIn", description = "Filter by the decision definitions the instances belongs to. Must be a comma-separated list of decision definition ids.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("decisionDefinitionIdIn")
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
  */
  
  @Schema(name = "decisionDefinitionKey", description = "Filter by the key of the decision definition the instances belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("decisionDefinitionKey")
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
  */
  
  @Schema(name = "decisionDefinitionKeyIn", description = "Filter by the keys of the decision definition the instances belongs to. Must be a comma- separated list of decision definition keys.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("decisionDefinitionKeyIn")
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
  */
  
  @Schema(name = "decisionDefinitionName", description = "Filter by the name of the decision definition the instances belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("decisionDefinitionName")
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
  */
  
  @Schema(name = "decisionDefinitionNameLike", description = "Filter by the name of the decision definition the instances belongs to, that the parameter is a substring of.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("decisionDefinitionNameLike")
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
  */
  
  @Schema(name = "processDefinitionId", description = "Filter by the process definition the instances belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionId")
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
  */
  
  @Schema(name = "processDefinitionKey", description = "Filter by the key of the process definition the instances belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionKey")
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
  */
  
  @Schema(name = "processInstanceId", description = "Filter by the process instance the instances belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processInstanceId")
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
  */
  
  @Schema(name = "caseDefinitionId", description = "Filter by the case definition the instances belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("caseDefinitionId")
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
  */
  
  @Schema(name = "caseDefinitionKey", description = "Filter by the key of the case definition the instances belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("caseDefinitionKey")
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
  */
  
  @Schema(name = "caseInstanceId", description = "Filter by the case instance the instances belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("caseInstanceId")
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
  */
  
  @Schema(name = "activityIdIn", description = "Filter by the activity ids the instances belongs to. Must be a comma-separated list of acitvity ids.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activityIdIn")
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
  */
  
  @Schema(name = "activityInstanceIdIn", description = "Filter by the activity instance ids the instances belongs to. Must be a comma-separated list of acitvity instance ids.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activityInstanceIdIn")
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
  */
  
  @Schema(name = "tenantIdIn", description = "Filter by a comma-separated list of tenant ids. A historic decision instance must have one of the given tenant ids.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tenantIdIn")
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
  */
  
  @Schema(name = "withoutTenantId", description = "Only include historic decision instances that belong to no tenant. Value may only be `true`, as `false` is the default behavior.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("withoutTenantId")
  public Boolean getWithoutTenantId() {
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
  */
  @Valid 
  @Schema(name = "evaluatedBefore", description = "Restrict to instances that were evaluated before the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM- dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("evaluatedBefore")
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
  */
  @Valid 
  @Schema(name = "evaluatedAfter", description = "Restrict to instances that were evaluated after the given date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM- dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("evaluatedAfter")
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
  */
  
  @Schema(name = "userId", description = "Restrict to instances that were evaluated by the given user.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userId")
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
  */
  
  @Schema(name = "rootDecisionInstanceId", description = "Restrict to instances that have a given root decision instance id. This also includes the decision instance with the given id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rootDecisionInstanceId")
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
  */
  
  @Schema(name = "rootDecisionInstancesOnly", description = "Restrict to instances those are the root decision instance of an evaluation. Value may only be `true`, as `false` is the default behavior.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rootDecisionInstancesOnly")
  public Boolean getRootDecisionInstancesOnly() {
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
  */
  
  @Schema(name = "decisionRequirementsDefinitionId", description = "Filter by the decision requirements definition the instances belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("decisionRequirementsDefinitionId")
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
  */
  
  @Schema(name = "decisionRequirementsDefinitionKey", description = "Filter by the key of the decision requirements definition the instances belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("decisionRequirementsDefinitionKey")
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
  */
  
  @Schema(name = "includeInputs", description = "Include input values in the result. Value may only be `true`, as `false` is the default behavior.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("includeInputs")
  public Boolean getIncludeInputs() {
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
  */
  
  @Schema(name = "includeOutputs", description = "Include output values in the result. Value may only be `true`, as `false` is the default behavior.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("includeOutputs")
  public Boolean getIncludeOutputs() {
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
  */
  
  @Schema(name = "disableBinaryFetching", description = "Disables fetching of byte array input and output values. Value may only be `true`, as `false` is the default behavior.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("disableBinaryFetching")
  public Boolean getDisableBinaryFetching() {
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
  */
  
  @Schema(name = "disableCustomObjectDeserialization", description = "Disables deserialization of input and output values that are custom objects. Value may only be `true`, as `false` is the default behavior.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("disableCustomObjectDeserialization")
  public Boolean getDisableCustomObjectDeserialization() {
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

