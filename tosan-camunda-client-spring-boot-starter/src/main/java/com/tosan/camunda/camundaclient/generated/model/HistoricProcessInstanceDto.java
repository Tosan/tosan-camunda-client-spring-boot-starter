package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * HistoricProcessInstanceDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class HistoricProcessInstanceDto {

  private String id = null;

  private String rootProcessInstanceId = null;

  private String superProcessInstanceId = null;

  private String superCaseInstanceId = null;

  private String caseInstanceId = null;

  private String processDefinitionName = null;

  private String processDefinitionKey = null;

  private Integer processDefinitionVersion = null;

  private String processDefinitionId = null;

  private String businessKey = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startTime = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime endTime = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime removalTime = null;

  private Long durationInMillis = null;

  private String startUserId = null;

  private String startActivityId = null;

  private String deleteReason = null;

  private String tenantId = null;

  /**
   * Last state of the process instance, possible values are:  `ACTIVE` - running process instance  `SUSPENDED` - suspended process instances  `COMPLETED` - completed through normal end event  `EXTERNALLY_TERMINATED` - terminated externally, for instance through REST API  `INTERNALLY_TERMINATED` - terminated internally, for instance by terminating boundary event
   */
  public enum StateEnum {
    ACTIVE("ACTIVE"),
    
    SUSPENDED("SUSPENDED"),
    
    COMPLETED("COMPLETED"),
    
    EXTERNALLY_TERMINATED("EXTERNALLY_TERMINATED"),
    
    INTERNALLY_TERMINATED("INTERNALLY_TERMINATED");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  private StateEnum state = null;

  public HistoricProcessInstanceDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the process instance.
   * @return id
  */
  
  @Schema(name = "id", description = "The id of the process instance.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public HistoricProcessInstanceDto rootProcessInstanceId(String rootProcessInstanceId) {
    this.rootProcessInstanceId = rootProcessInstanceId;
    return this;
  }

  /**
   * The process instance id of the root process instance that initiated the process.
   * @return rootProcessInstanceId
  */
  
  @Schema(name = "rootProcessInstanceId", description = "The process instance id of the root process instance that initiated the process.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rootProcessInstanceId")
  public String getRootProcessInstanceId() {
    return rootProcessInstanceId;
  }

  public void setRootProcessInstanceId(String rootProcessInstanceId) {
    this.rootProcessInstanceId = rootProcessInstanceId;
  }

  public HistoricProcessInstanceDto superProcessInstanceId(String superProcessInstanceId) {
    this.superProcessInstanceId = superProcessInstanceId;
    return this;
  }

  /**
   * The id of the parent process instance, if it exists.
   * @return superProcessInstanceId
  */
  
  @Schema(name = "superProcessInstanceId", description = "The id of the parent process instance, if it exists.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("superProcessInstanceId")
  public String getSuperProcessInstanceId() {
    return superProcessInstanceId;
  }

  public void setSuperProcessInstanceId(String superProcessInstanceId) {
    this.superProcessInstanceId = superProcessInstanceId;
  }

  public HistoricProcessInstanceDto superCaseInstanceId(String superCaseInstanceId) {
    this.superCaseInstanceId = superCaseInstanceId;
    return this;
  }

  /**
   * The id of the parent case instance, if it exists.
   * @return superCaseInstanceId
  */
  
  @Schema(name = "superCaseInstanceId", description = "The id of the parent case instance, if it exists.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("superCaseInstanceId")
  public String getSuperCaseInstanceId() {
    return superCaseInstanceId;
  }

  public void setSuperCaseInstanceId(String superCaseInstanceId) {
    this.superCaseInstanceId = superCaseInstanceId;
  }

  public HistoricProcessInstanceDto caseInstanceId(String caseInstanceId) {
    this.caseInstanceId = caseInstanceId;
    return this;
  }

  /**
   * The id of the parent case instance, if it exists.
   * @return caseInstanceId
  */
  
  @Schema(name = "caseInstanceId", description = "The id of the parent case instance, if it exists.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("caseInstanceId")
  public String getCaseInstanceId() {
    return caseInstanceId;
  }

  public void setCaseInstanceId(String caseInstanceId) {
    this.caseInstanceId = caseInstanceId;
  }

  public HistoricProcessInstanceDto processDefinitionName(String processDefinitionName) {
    this.processDefinitionName = processDefinitionName;
    return this;
  }

  /**
   * The name of the process definition that this process instance belongs to.
   * @return processDefinitionName
  */
  
  @Schema(name = "processDefinitionName", description = "The name of the process definition that this process instance belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionName")
  public String getProcessDefinitionName() {
    return processDefinitionName;
  }

  public void setProcessDefinitionName(String processDefinitionName) {
    this.processDefinitionName = processDefinitionName;
  }

  public HistoricProcessInstanceDto processDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
    return this;
  }

  /**
   * The key of the process definition that this process instance belongs to.
   * @return processDefinitionKey
  */
  
  @Schema(name = "processDefinitionKey", description = "The key of the process definition that this process instance belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionKey")
  public String getProcessDefinitionKey() {
    return processDefinitionKey;
  }

  public void setProcessDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
  }

  public HistoricProcessInstanceDto processDefinitionVersion(Integer processDefinitionVersion) {
    this.processDefinitionVersion = processDefinitionVersion;
    return this;
  }

  /**
   * The version of the process definition that this process instance belongs to.
   * @return processDefinitionVersion
  */
  
  @Schema(name = "processDefinitionVersion", description = "The version of the process definition that this process instance belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionVersion")
  public Integer getProcessDefinitionVersion() {
    return processDefinitionVersion;
  }

  public void setProcessDefinitionVersion(Integer processDefinitionVersion) {
    this.processDefinitionVersion = processDefinitionVersion;
  }

  public HistoricProcessInstanceDto processDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
    return this;
  }

  /**
   * The id of the process definition that this process instance belongs to.
   * @return processDefinitionId
  */
  
  @Schema(name = "processDefinitionId", description = "The id of the process definition that this process instance belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionId")
  public String getProcessDefinitionId() {
    return processDefinitionId;
  }

  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }

  public HistoricProcessInstanceDto businessKey(String businessKey) {
    this.businessKey = businessKey;
    return this;
  }

  /**
   * The business key of the process instance.
   * @return businessKey
  */
  
  @Schema(name = "businessKey", description = "The business key of the process instance.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("businessKey")
  public String getBusinessKey() {
    return businessKey;
  }

  public void setBusinessKey(String businessKey) {
    this.businessKey = businessKey;
  }

  public HistoricProcessInstanceDto startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * The time the instance was started. Default [format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.
   * @return startTime
  */
  @Valid 
  @Schema(name = "startTime", description = "The time the instance was started. Default [format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startTime")
  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  public HistoricProcessInstanceDto endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * The time the instance ended. Default [format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.
   * @return endTime
  */
  @Valid 
  @Schema(name = "endTime", description = "The time the instance ended. Default [format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endTime")
  public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }

  public HistoricProcessInstanceDto removalTime(OffsetDateTime removalTime) {
    this.removalTime = removalTime;
    return this;
  }

  /**
   * The time after which the instance should be removed by the History Cleanup job. Default [format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.
   * @return removalTime
  */
  @Valid 
  @Schema(name = "removalTime", description = "The time after which the instance should be removed by the History Cleanup job. Default [format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("removalTime")
  public OffsetDateTime getRemovalTime() {
    return removalTime;
  }

  public void setRemovalTime(OffsetDateTime removalTime) {
    this.removalTime = removalTime;
  }

  public HistoricProcessInstanceDto durationInMillis(Long durationInMillis) {
    this.durationInMillis = durationInMillis;
    return this;
  }

  /**
   * The time the instance took to finish (in milliseconds).
   * @return durationInMillis
  */
  
  @Schema(name = "durationInMillis", description = "The time the instance took to finish (in milliseconds).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("durationInMillis")
  public Long getDurationInMillis() {
    return durationInMillis;
  }

  public void setDurationInMillis(Long durationInMillis) {
    this.durationInMillis = durationInMillis;
  }

  public HistoricProcessInstanceDto startUserId(String startUserId) {
    this.startUserId = startUserId;
    return this;
  }

  /**
   * The id of the user who started the process instance.
   * @return startUserId
  */
  
  @Schema(name = "startUserId", description = "The id of the user who started the process instance.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startUserId")
  public String getStartUserId() {
    return startUserId;
  }

  public void setStartUserId(String startUserId) {
    this.startUserId = startUserId;
  }

  public HistoricProcessInstanceDto startActivityId(String startActivityId) {
    this.startActivityId = startActivityId;
    return this;
  }

  /**
   * The id of the initial activity that was executed (e.g., a start event).
   * @return startActivityId
  */
  
  @Schema(name = "startActivityId", description = "The id of the initial activity that was executed (e.g., a start event).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startActivityId")
  public String getStartActivityId() {
    return startActivityId;
  }

  public void setStartActivityId(String startActivityId) {
    this.startActivityId = startActivityId;
  }

  public HistoricProcessInstanceDto deleteReason(String deleteReason) {
    this.deleteReason = deleteReason;
    return this;
  }

  /**
   * The provided delete reason in case the process instance was canceled during execution.
   * @return deleteReason
  */
  
  @Schema(name = "deleteReason", description = "The provided delete reason in case the process instance was canceled during execution.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deleteReason")
  public String getDeleteReason() {
    return deleteReason;
  }

  public void setDeleteReason(String deleteReason) {
    this.deleteReason = deleteReason;
  }

  public HistoricProcessInstanceDto tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * The tenant id of the process instance.
   * @return tenantId
  */
  
  @Schema(name = "tenantId", description = "The tenant id of the process instance.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tenantId")
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public HistoricProcessInstanceDto state(StateEnum state) {
    this.state = state;
    return this;
  }

  /**
   * Last state of the process instance, possible values are:  `ACTIVE` - running process instance  `SUSPENDED` - suspended process instances  `COMPLETED` - completed through normal end event  `EXTERNALLY_TERMINATED` - terminated externally, for instance through REST API  `INTERNALLY_TERMINATED` - terminated internally, for instance by terminating boundary event
   * @return state
  */
  
  @Schema(name = "state", description = "Last state of the process instance, possible values are:  `ACTIVE` - running process instance  `SUSPENDED` - suspended process instances  `COMPLETED` - completed through normal end event  `EXTERNALLY_TERMINATED` - terminated externally, for instance through REST API  `INTERNALLY_TERMINATED` - terminated internally, for instance by terminating boundary event", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricProcessInstanceDto historicProcessInstanceDto = (HistoricProcessInstanceDto) o;
    return Objects.equals(this.id, historicProcessInstanceDto.id) &&
        Objects.equals(this.rootProcessInstanceId, historicProcessInstanceDto.rootProcessInstanceId) &&
        Objects.equals(this.superProcessInstanceId, historicProcessInstanceDto.superProcessInstanceId) &&
        Objects.equals(this.superCaseInstanceId, historicProcessInstanceDto.superCaseInstanceId) &&
        Objects.equals(this.caseInstanceId, historicProcessInstanceDto.caseInstanceId) &&
        Objects.equals(this.processDefinitionName, historicProcessInstanceDto.processDefinitionName) &&
        Objects.equals(this.processDefinitionKey, historicProcessInstanceDto.processDefinitionKey) &&
        Objects.equals(this.processDefinitionVersion, historicProcessInstanceDto.processDefinitionVersion) &&
        Objects.equals(this.processDefinitionId, historicProcessInstanceDto.processDefinitionId) &&
        Objects.equals(this.businessKey, historicProcessInstanceDto.businessKey) &&
        Objects.equals(this.startTime, historicProcessInstanceDto.startTime) &&
        Objects.equals(this.endTime, historicProcessInstanceDto.endTime) &&
        Objects.equals(this.removalTime, historicProcessInstanceDto.removalTime) &&
        Objects.equals(this.durationInMillis, historicProcessInstanceDto.durationInMillis) &&
        Objects.equals(this.startUserId, historicProcessInstanceDto.startUserId) &&
        Objects.equals(this.startActivityId, historicProcessInstanceDto.startActivityId) &&
        Objects.equals(this.deleteReason, historicProcessInstanceDto.deleteReason) &&
        Objects.equals(this.tenantId, historicProcessInstanceDto.tenantId) &&
        Objects.equals(this.state, historicProcessInstanceDto.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, rootProcessInstanceId, superProcessInstanceId, superCaseInstanceId, caseInstanceId, processDefinitionName, processDefinitionKey, processDefinitionVersion, processDefinitionId, businessKey, startTime, endTime, removalTime, durationInMillis, startUserId, startActivityId, deleteReason, tenantId, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricProcessInstanceDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    rootProcessInstanceId: ").append(toIndentedString(rootProcessInstanceId)).append("\n");
    sb.append("    superProcessInstanceId: ").append(toIndentedString(superProcessInstanceId)).append("\n");
    sb.append("    superCaseInstanceId: ").append(toIndentedString(superCaseInstanceId)).append("\n");
    sb.append("    caseInstanceId: ").append(toIndentedString(caseInstanceId)).append("\n");
    sb.append("    processDefinitionName: ").append(toIndentedString(processDefinitionName)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    processDefinitionVersion: ").append(toIndentedString(processDefinitionVersion)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    businessKey: ").append(toIndentedString(businessKey)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    removalTime: ").append(toIndentedString(removalTime)).append("\n");
    sb.append("    durationInMillis: ").append(toIndentedString(durationInMillis)).append("\n");
    sb.append("    startUserId: ").append(toIndentedString(startUserId)).append("\n");
    sb.append("    startActivityId: ").append(toIndentedString(startActivityId)).append("\n");
    sb.append("    deleteReason: ").append(toIndentedString(deleteReason)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

