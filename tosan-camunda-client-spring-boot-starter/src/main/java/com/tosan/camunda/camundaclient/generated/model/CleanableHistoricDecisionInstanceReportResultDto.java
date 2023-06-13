package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CleanableHistoricDecisionInstanceReportResultDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class CleanableHistoricDecisionInstanceReportResultDto {

  private String decisionDefinitionId = null;

  private String decisionDefinitionKey = null;

  private String decisionDefinitionName = null;

  private Integer decisionDefinitionVersion = null;

  private Integer historyTimeToLive = null;

  private Long finishedDecisionInstanceCount = null;

  private Long cleanableDecisionInstanceCount = null;

  private String tenantId = null;

  public CleanableHistoricDecisionInstanceReportResultDto decisionDefinitionId(String decisionDefinitionId) {
    this.decisionDefinitionId = decisionDefinitionId;
    return this;
  }

  /**
   * The id of the decision definition.
   * @return decisionDefinitionId
  */
  
  @Schema(name = "decisionDefinitionId", description = "The id of the decision definition.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("decisionDefinitionId")
  public String getDecisionDefinitionId() {
    return decisionDefinitionId;
  }

  public void setDecisionDefinitionId(String decisionDefinitionId) {
    this.decisionDefinitionId = decisionDefinitionId;
  }

  public CleanableHistoricDecisionInstanceReportResultDto decisionDefinitionKey(String decisionDefinitionKey) {
    this.decisionDefinitionKey = decisionDefinitionKey;
    return this;
  }

  /**
   * The key of the decision definition.
   * @return decisionDefinitionKey
  */
  
  @Schema(name = "decisionDefinitionKey", description = "The key of the decision definition.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("decisionDefinitionKey")
  public String getDecisionDefinitionKey() {
    return decisionDefinitionKey;
  }

  public void setDecisionDefinitionKey(String decisionDefinitionKey) {
    this.decisionDefinitionKey = decisionDefinitionKey;
  }

  public CleanableHistoricDecisionInstanceReportResultDto decisionDefinitionName(String decisionDefinitionName) {
    this.decisionDefinitionName = decisionDefinitionName;
    return this;
  }

  /**
   * The name of the decision definition.
   * @return decisionDefinitionName
  */
  
  @Schema(name = "decisionDefinitionName", description = "The name of the decision definition.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("decisionDefinitionName")
  public String getDecisionDefinitionName() {
    return decisionDefinitionName;
  }

  public void setDecisionDefinitionName(String decisionDefinitionName) {
    this.decisionDefinitionName = decisionDefinitionName;
  }

  public CleanableHistoricDecisionInstanceReportResultDto decisionDefinitionVersion(Integer decisionDefinitionVersion) {
    this.decisionDefinitionVersion = decisionDefinitionVersion;
    return this;
  }

  /**
   * The version of the decision definition.
   * @return decisionDefinitionVersion
  */
  
  @Schema(name = "decisionDefinitionVersion", description = "The version of the decision definition.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("decisionDefinitionVersion")
  public Integer getDecisionDefinitionVersion() {
    return decisionDefinitionVersion;
  }

  public void setDecisionDefinitionVersion(Integer decisionDefinitionVersion) {
    this.decisionDefinitionVersion = decisionDefinitionVersion;
  }

  public CleanableHistoricDecisionInstanceReportResultDto historyTimeToLive(Integer historyTimeToLive) {
    this.historyTimeToLive = historyTimeToLive;
    return this;
  }

  /**
   * The history time to live of the decision definition.
   * @return historyTimeToLive
  */
  
  @Schema(name = "historyTimeToLive", description = "The history time to live of the decision definition.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("historyTimeToLive")
  public Integer getHistoryTimeToLive() {
    return historyTimeToLive;
  }

  public void setHistoryTimeToLive(Integer historyTimeToLive) {
    this.historyTimeToLive = historyTimeToLive;
  }

  public CleanableHistoricDecisionInstanceReportResultDto finishedDecisionInstanceCount(Long finishedDecisionInstanceCount) {
    this.finishedDecisionInstanceCount = finishedDecisionInstanceCount;
    return this;
  }

  /**
   * The count of the finished historic decision instances.
   * @return finishedDecisionInstanceCount
  */
  
  @Schema(name = "finishedDecisionInstanceCount", description = "The count of the finished historic decision instances.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("finishedDecisionInstanceCount")
  public Long getFinishedDecisionInstanceCount() {
    return finishedDecisionInstanceCount;
  }

  public void setFinishedDecisionInstanceCount(Long finishedDecisionInstanceCount) {
    this.finishedDecisionInstanceCount = finishedDecisionInstanceCount;
  }

  public CleanableHistoricDecisionInstanceReportResultDto cleanableDecisionInstanceCount(Long cleanableDecisionInstanceCount) {
    this.cleanableDecisionInstanceCount = cleanableDecisionInstanceCount;
    return this;
  }

  /**
   * The count of the cleanable historic decision instances, referring to history time to live.
   * @return cleanableDecisionInstanceCount
  */
  
  @Schema(name = "cleanableDecisionInstanceCount", description = "The count of the cleanable historic decision instances, referring to history time to live.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cleanableDecisionInstanceCount")
  public Long getCleanableDecisionInstanceCount() {
    return cleanableDecisionInstanceCount;
  }

  public void setCleanableDecisionInstanceCount(Long cleanableDecisionInstanceCount) {
    this.cleanableDecisionInstanceCount = cleanableDecisionInstanceCount;
  }

  public CleanableHistoricDecisionInstanceReportResultDto tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * The tenant id of the decision definition.
   * @return tenantId
  */
  
  @Schema(name = "tenantId", description = "The tenant id of the decision definition.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tenantId")
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CleanableHistoricDecisionInstanceReportResultDto cleanableHistoricDecisionInstanceReportResultDto = (CleanableHistoricDecisionInstanceReportResultDto) o;
    return Objects.equals(this.decisionDefinitionId, cleanableHistoricDecisionInstanceReportResultDto.decisionDefinitionId) &&
        Objects.equals(this.decisionDefinitionKey, cleanableHistoricDecisionInstanceReportResultDto.decisionDefinitionKey) &&
        Objects.equals(this.decisionDefinitionName, cleanableHistoricDecisionInstanceReportResultDto.decisionDefinitionName) &&
        Objects.equals(this.decisionDefinitionVersion, cleanableHistoricDecisionInstanceReportResultDto.decisionDefinitionVersion) &&
        Objects.equals(this.historyTimeToLive, cleanableHistoricDecisionInstanceReportResultDto.historyTimeToLive) &&
        Objects.equals(this.finishedDecisionInstanceCount, cleanableHistoricDecisionInstanceReportResultDto.finishedDecisionInstanceCount) &&
        Objects.equals(this.cleanableDecisionInstanceCount, cleanableHistoricDecisionInstanceReportResultDto.cleanableDecisionInstanceCount) &&
        Objects.equals(this.tenantId, cleanableHistoricDecisionInstanceReportResultDto.tenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(decisionDefinitionId, decisionDefinitionKey, decisionDefinitionName, decisionDefinitionVersion, historyTimeToLive, finishedDecisionInstanceCount, cleanableDecisionInstanceCount, tenantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CleanableHistoricDecisionInstanceReportResultDto {\n");
    sb.append("    decisionDefinitionId: ").append(toIndentedString(decisionDefinitionId)).append("\n");
    sb.append("    decisionDefinitionKey: ").append(toIndentedString(decisionDefinitionKey)).append("\n");
    sb.append("    decisionDefinitionName: ").append(toIndentedString(decisionDefinitionName)).append("\n");
    sb.append("    decisionDefinitionVersion: ").append(toIndentedString(decisionDefinitionVersion)).append("\n");
    sb.append("    historyTimeToLive: ").append(toIndentedString(historyTimeToLive)).append("\n");
    sb.append("    finishedDecisionInstanceCount: ").append(toIndentedString(finishedDecisionInstanceCount)).append("\n");
    sb.append("    cleanableDecisionInstanceCount: ").append(toIndentedString(cleanableDecisionInstanceCount)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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

