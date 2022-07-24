package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

/**
 * CleanableHistoricDecisionInstanceReportResultDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class CleanableHistoricDecisionInstanceReportResultDto   {
  @JsonProperty("decisionDefinitionId")
  private String decisionDefinitionId = null;

  @JsonProperty("decisionDefinitionKey")
  private String decisionDefinitionKey = null;

  @JsonProperty("decisionDefinitionName")
  private String decisionDefinitionName = null;

  @JsonProperty("decisionDefinitionVersion")
  private Integer decisionDefinitionVersion = null;

  @JsonProperty("historyTimeToLive")
  private Integer historyTimeToLive = null;

  @JsonProperty("finishedDecisionInstanceCount")
  private Long finishedDecisionInstanceCount = null;

  @JsonProperty("cleanableDecisionInstanceCount")
  private Long cleanableDecisionInstanceCount = null;

  @JsonProperty("tenantId")
  private String tenantId = null;

  public CleanableHistoricDecisionInstanceReportResultDto decisionDefinitionId(String decisionDefinitionId) {
    this.decisionDefinitionId = decisionDefinitionId;
    return this;
  }

  /**
   * The id of the decision definition.
   * @return decisionDefinitionId
   **/
  @Schema(description = "The id of the decision definition.")
  
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
   **/
  @Schema(description = "The key of the decision definition.")
  
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
   **/
  @Schema(description = "The name of the decision definition.")
  
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
   **/
  @Schema(description = "The version of the decision definition.")
  
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
   **/
  @Schema(description = "The history time to live of the decision definition.")
  
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
   **/
  @Schema(description = "The count of the finished historic decision instances.")
  
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
   **/
  @Schema(description = "The count of the cleanable historic decision instances, referring to history time to live.")
  
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
   **/
  @Schema(description = "The tenant id of the decision definition.")
  
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
