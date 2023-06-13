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
 * CleanableHistoricProcessInstanceReportResultDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class CleanableHistoricProcessInstanceReportResultDto {

  private String processDefinitionId = null;

  private String processDefinitionKey = null;

  private String processDefinitionName = null;

  private Integer processDefinitionVersion = null;

  private Integer historyTimeToLive = null;

  private Long finishedProcessInstanceCount = null;

  private Long cleanableProcessInstanceCount = null;

  private String tenantId = null;

  public CleanableHistoricProcessInstanceReportResultDto processDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
    return this;
  }

  /**
   * The id of the process definition.
   * @return processDefinitionId
  */
  
  @Schema(name = "processDefinitionId", description = "The id of the process definition.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionId")
  public String getProcessDefinitionId() {
    return processDefinitionId;
  }

  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }

  public CleanableHistoricProcessInstanceReportResultDto processDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
    return this;
  }

  /**
   * The key of the process definition.
   * @return processDefinitionKey
  */
  
  @Schema(name = "processDefinitionKey", description = "The key of the process definition.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionKey")
  public String getProcessDefinitionKey() {
    return processDefinitionKey;
  }

  public void setProcessDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
  }

  public CleanableHistoricProcessInstanceReportResultDto processDefinitionName(String processDefinitionName) {
    this.processDefinitionName = processDefinitionName;
    return this;
  }

  /**
   * The name of the process definition.
   * @return processDefinitionName
  */
  
  @Schema(name = "processDefinitionName", description = "The name of the process definition.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionName")
  public String getProcessDefinitionName() {
    return processDefinitionName;
  }

  public void setProcessDefinitionName(String processDefinitionName) {
    this.processDefinitionName = processDefinitionName;
  }

  public CleanableHistoricProcessInstanceReportResultDto processDefinitionVersion(Integer processDefinitionVersion) {
    this.processDefinitionVersion = processDefinitionVersion;
    return this;
  }

  /**
   * The version of the process definition.
   * @return processDefinitionVersion
  */
  
  @Schema(name = "processDefinitionVersion", description = "The version of the process definition.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionVersion")
  public Integer getProcessDefinitionVersion() {
    return processDefinitionVersion;
  }

  public void setProcessDefinitionVersion(Integer processDefinitionVersion) {
    this.processDefinitionVersion = processDefinitionVersion;
  }

  public CleanableHistoricProcessInstanceReportResultDto historyTimeToLive(Integer historyTimeToLive) {
    this.historyTimeToLive = historyTimeToLive;
    return this;
  }

  /**
   * The history time to live of the process definition.
   * @return historyTimeToLive
  */
  
  @Schema(name = "historyTimeToLive", description = "The history time to live of the process definition.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("historyTimeToLive")
  public Integer getHistoryTimeToLive() {
    return historyTimeToLive;
  }

  public void setHistoryTimeToLive(Integer historyTimeToLive) {
    this.historyTimeToLive = historyTimeToLive;
  }

  public CleanableHistoricProcessInstanceReportResultDto finishedProcessInstanceCount(Long finishedProcessInstanceCount) {
    this.finishedProcessInstanceCount = finishedProcessInstanceCount;
    return this;
  }

  /**
   * The count of the finished historic process instances.
   * @return finishedProcessInstanceCount
  */
  
  @Schema(name = "finishedProcessInstanceCount", description = "The count of the finished historic process instances.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("finishedProcessInstanceCount")
  public Long getFinishedProcessInstanceCount() {
    return finishedProcessInstanceCount;
  }

  public void setFinishedProcessInstanceCount(Long finishedProcessInstanceCount) {
    this.finishedProcessInstanceCount = finishedProcessInstanceCount;
  }

  public CleanableHistoricProcessInstanceReportResultDto cleanableProcessInstanceCount(Long cleanableProcessInstanceCount) {
    this.cleanableProcessInstanceCount = cleanableProcessInstanceCount;
    return this;
  }

  /**
   * The count of the cleanable historic process instances, referring to history time to live.
   * @return cleanableProcessInstanceCount
  */
  
  @Schema(name = "cleanableProcessInstanceCount", description = "The count of the cleanable historic process instances, referring to history time to live.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cleanableProcessInstanceCount")
  public Long getCleanableProcessInstanceCount() {
    return cleanableProcessInstanceCount;
  }

  public void setCleanableProcessInstanceCount(Long cleanableProcessInstanceCount) {
    this.cleanableProcessInstanceCount = cleanableProcessInstanceCount;
  }

  public CleanableHistoricProcessInstanceReportResultDto tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * The tenant id of the process definition.
   * @return tenantId
  */
  
  @Schema(name = "tenantId", description = "The tenant id of the process definition.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    CleanableHistoricProcessInstanceReportResultDto cleanableHistoricProcessInstanceReportResultDto = (CleanableHistoricProcessInstanceReportResultDto) o;
    return Objects.equals(this.processDefinitionId, cleanableHistoricProcessInstanceReportResultDto.processDefinitionId) &&
        Objects.equals(this.processDefinitionKey, cleanableHistoricProcessInstanceReportResultDto.processDefinitionKey) &&
        Objects.equals(this.processDefinitionName, cleanableHistoricProcessInstanceReportResultDto.processDefinitionName) &&
        Objects.equals(this.processDefinitionVersion, cleanableHistoricProcessInstanceReportResultDto.processDefinitionVersion) &&
        Objects.equals(this.historyTimeToLive, cleanableHistoricProcessInstanceReportResultDto.historyTimeToLive) &&
        Objects.equals(this.finishedProcessInstanceCount, cleanableHistoricProcessInstanceReportResultDto.finishedProcessInstanceCount) &&
        Objects.equals(this.cleanableProcessInstanceCount, cleanableHistoricProcessInstanceReportResultDto.cleanableProcessInstanceCount) &&
        Objects.equals(this.tenantId, cleanableHistoricProcessInstanceReportResultDto.tenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processDefinitionId, processDefinitionKey, processDefinitionName, processDefinitionVersion, historyTimeToLive, finishedProcessInstanceCount, cleanableProcessInstanceCount, tenantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CleanableHistoricProcessInstanceReportResultDto {\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    processDefinitionName: ").append(toIndentedString(processDefinitionName)).append("\n");
    sb.append("    processDefinitionVersion: ").append(toIndentedString(processDefinitionVersion)).append("\n");
    sb.append("    historyTimeToLive: ").append(toIndentedString(historyTimeToLive)).append("\n");
    sb.append("    finishedProcessInstanceCount: ").append(toIndentedString(finishedProcessInstanceCount)).append("\n");
    sb.append("    cleanableProcessInstanceCount: ").append(toIndentedString(cleanableProcessInstanceCount)).append("\n");
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

