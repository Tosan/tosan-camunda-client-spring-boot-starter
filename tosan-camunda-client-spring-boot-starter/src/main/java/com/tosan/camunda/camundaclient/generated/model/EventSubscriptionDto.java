package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * EventSubscriptionDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class EventSubscriptionDto {

  private String id = null;

  private String eventType = null;

  private String eventName = null;

  private String executionId = null;

  private String processInstanceId = null;

  private String activityId = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdDate = null;

  private String tenantId = null;

  public EventSubscriptionDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the event subscription.
   * @return id
  */
  
  @Schema(name = "id", description = "The id of the event subscription.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public EventSubscriptionDto eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * The type of the event subscription.
   * @return eventType
  */
  
  @Schema(name = "eventType", description = "The type of the event subscription.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eventType")
  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public EventSubscriptionDto eventName(String eventName) {
    this.eventName = eventName;
    return this;
  }

  /**
   * The name of the event this subscription belongs to as defined in the process model.
   * @return eventName
  */
  
  @Schema(name = "eventName", description = "The name of the event this subscription belongs to as defined in the process model.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eventName")
  public String getEventName() {
    return eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  public EventSubscriptionDto executionId(String executionId) {
    this.executionId = executionId;
    return this;
  }

  /**
   * The execution that is subscribed on the referenced event.
   * @return executionId
  */
  
  @Schema(name = "executionId", description = "The execution that is subscribed on the referenced event.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("executionId")
  public String getExecutionId() {
    return executionId;
  }

  public void setExecutionId(String executionId) {
    this.executionId = executionId;
  }

  public EventSubscriptionDto processInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
    return this;
  }

  /**
   * The process instance this subscription belongs to.
   * @return processInstanceId
  */
  
  @Schema(name = "processInstanceId", description = "The process instance this subscription belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processInstanceId")
  public String getProcessInstanceId() {
    return processInstanceId;
  }

  public void setProcessInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
  }

  public EventSubscriptionDto activityId(String activityId) {
    this.activityId = activityId;
    return this;
  }

  /**
   * The identifier of the activity that this event subscription belongs to. This could for example be the id of a receive task.
   * @return activityId
  */
  
  @Schema(name = "activityId", description = "The identifier of the activity that this event subscription belongs to. This could for example be the id of a receive task.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activityId")
  public String getActivityId() {
    return activityId;
  }

  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }

  public EventSubscriptionDto createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * The time this event subscription was created.
   * @return createdDate
  */
  @Valid 
  @Schema(name = "createdDate", description = "The time this event subscription was created.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdDate")
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public EventSubscriptionDto tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * The id of the tenant this event subscription belongs to. Can be `null` if the subscription belongs to no single tenant.
   * @return tenantId
  */
  
  @Schema(name = "tenantId", description = "The id of the tenant this event subscription belongs to. Can be `null` if the subscription belongs to no single tenant.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    EventSubscriptionDto eventSubscriptionDto = (EventSubscriptionDto) o;
    return Objects.equals(this.id, eventSubscriptionDto.id) &&
        Objects.equals(this.eventType, eventSubscriptionDto.eventType) &&
        Objects.equals(this.eventName, eventSubscriptionDto.eventName) &&
        Objects.equals(this.executionId, eventSubscriptionDto.executionId) &&
        Objects.equals(this.processInstanceId, eventSubscriptionDto.processInstanceId) &&
        Objects.equals(this.activityId, eventSubscriptionDto.activityId) &&
        Objects.equals(this.createdDate, eventSubscriptionDto.createdDate) &&
        Objects.equals(this.tenantId, eventSubscriptionDto.tenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, eventType, eventName, executionId, processInstanceId, activityId, createdDate, tenantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventSubscriptionDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
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

