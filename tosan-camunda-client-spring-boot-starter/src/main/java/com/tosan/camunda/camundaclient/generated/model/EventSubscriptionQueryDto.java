package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tosan.camunda.camundaclient.generated.model.EventSubscriptionQueryDtoSortingInner;
import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * A event subscription query which retrieves a list of event subscriptions
 */

@Schema(name = "EventSubscriptionQueryDto", description = "A event subscription query which retrieves a list of event subscriptions")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class EventSubscriptionQueryDto {

  private String eventSubscriptionId = null;

  private String eventName = null;

  /**
   * The type of the event subscription.
   */
  public enum EventTypeEnum {
    MESSAGE("message"),
    
    SIGNAL("signal"),
    
    COMPENSATE("compensate"),
    
    CONDITIONAL("conditional");

    private String value;

    EventTypeEnum(String value) {
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
    public static EventTypeEnum fromValue(String value) {
      for (EventTypeEnum b : EventTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  private EventTypeEnum eventType = null;

  private String executionId = null;

  private String processInstanceId = null;

  private String activityId = null;

  @Valid
  private List<String> tenantIdIn;

  private Boolean withoutTenantId = null;

  private Boolean includeEventSubscriptionsWithoutTenantId = null;

  @Valid
  private List<@Valid EventSubscriptionQueryDtoSortingInner> sorting;

  public EventSubscriptionQueryDto eventSubscriptionId(String eventSubscriptionId) {
    this.eventSubscriptionId = eventSubscriptionId;
    return this;
  }

  /**
   * The id of the event subscription.
   * @return eventSubscriptionId
  */
  
  @Schema(name = "eventSubscriptionId", description = "The id of the event subscription.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eventSubscriptionId")
  public String getEventSubscriptionId() {
    return eventSubscriptionId;
  }

  public void setEventSubscriptionId(String eventSubscriptionId) {
    this.eventSubscriptionId = eventSubscriptionId;
  }

  public EventSubscriptionQueryDto eventName(String eventName) {
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

  public EventSubscriptionQueryDto eventType(EventTypeEnum eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * The type of the event subscription.
   * @return eventType
  */
  
  @Schema(name = "eventType", description = "The type of the event subscription.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eventType")
  public EventTypeEnum getEventType() {
    return eventType;
  }

  public void setEventType(EventTypeEnum eventType) {
    this.eventType = eventType;
  }

  public EventSubscriptionQueryDto executionId(String executionId) {
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

  public EventSubscriptionQueryDto processInstanceId(String processInstanceId) {
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

  public EventSubscriptionQueryDto activityId(String activityId) {
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

  public EventSubscriptionQueryDto tenantIdIn(List<String> tenantIdIn) {
    this.tenantIdIn = tenantIdIn;
    return this;
  }

  public EventSubscriptionQueryDto addTenantIdInItem(String tenantIdInItem) {
    if (this.tenantIdIn == null) {
      this.tenantIdIn = new ArrayList<>();
    }
    this.tenantIdIn.add(tenantIdInItem);
    return this;
  }

  /**
   * Filter by a comma-separated list of tenant ids. Only select subscriptions that belong to one of the given tenant ids.
   * @return tenantIdIn
  */
  
  @Schema(name = "tenantIdIn", description = "Filter by a comma-separated list of tenant ids. Only select subscriptions that belong to one of the given tenant ids.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tenantIdIn")
  public List<String> getTenantIdIn() {
    return tenantIdIn;
  }

  public void setTenantIdIn(List<String> tenantIdIn) {
    this.tenantIdIn = tenantIdIn;
  }

  public EventSubscriptionQueryDto withoutTenantId(Boolean withoutTenantId) {
    this.withoutTenantId = withoutTenantId;
    return this;
  }

  /**
   * Only select subscriptions which have no tenant id. Value may only be `true`, as `false` is the default behavior.
   * @return withoutTenantId
  */
  
  @Schema(name = "withoutTenantId", description = "Only select subscriptions which have no tenant id. Value may only be `true`, as `false` is the default behavior.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("withoutTenantId")
  public Boolean getWithoutTenantId() {
    return withoutTenantId;
  }

  public void setWithoutTenantId(Boolean withoutTenantId) {
    this.withoutTenantId = withoutTenantId;
  }

  public EventSubscriptionQueryDto includeEventSubscriptionsWithoutTenantId(Boolean includeEventSubscriptionsWithoutTenantId) {
    this.includeEventSubscriptionsWithoutTenantId = includeEventSubscriptionsWithoutTenantId;
    return this;
  }

  /**
   * Select event subscriptions which have no tenant id. Can be used in combination with tenantIdIn parameter. Value may only be `true`, as `false` is the default behavior.
   * @return includeEventSubscriptionsWithoutTenantId
  */
  
  @Schema(name = "includeEventSubscriptionsWithoutTenantId", description = "Select event subscriptions which have no tenant id. Can be used in combination with tenantIdIn parameter. Value may only be `true`, as `false` is the default behavior.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("includeEventSubscriptionsWithoutTenantId")
  public Boolean getIncludeEventSubscriptionsWithoutTenantId() {
    return includeEventSubscriptionsWithoutTenantId;
  }

  public void setIncludeEventSubscriptionsWithoutTenantId(Boolean includeEventSubscriptionsWithoutTenantId) {
    this.includeEventSubscriptionsWithoutTenantId = includeEventSubscriptionsWithoutTenantId;
  }

  public EventSubscriptionQueryDto sorting(List<@Valid EventSubscriptionQueryDtoSortingInner> sorting) {
    this.sorting = sorting;
    return this;
  }

  public EventSubscriptionQueryDto addSortingItem(EventSubscriptionQueryDtoSortingInner sortingItem) {
    if (this.sorting == null) {
      this.sorting = new ArrayList<>();
    }
    this.sorting.add(sortingItem);
    return this;
  }

  /**
   * Apply sorting of the result
   * @return sorting
  */
  @Valid 
  @Schema(name = "sorting", description = "Apply sorting of the result", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sorting")
  public List<@Valid EventSubscriptionQueryDtoSortingInner> getSorting() {
    return sorting;
  }

  public void setSorting(List<@Valid EventSubscriptionQueryDtoSortingInner> sorting) {
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
    EventSubscriptionQueryDto eventSubscriptionQueryDto = (EventSubscriptionQueryDto) o;
    return Objects.equals(this.eventSubscriptionId, eventSubscriptionQueryDto.eventSubscriptionId) &&
        Objects.equals(this.eventName, eventSubscriptionQueryDto.eventName) &&
        Objects.equals(this.eventType, eventSubscriptionQueryDto.eventType) &&
        Objects.equals(this.executionId, eventSubscriptionQueryDto.executionId) &&
        Objects.equals(this.processInstanceId, eventSubscriptionQueryDto.processInstanceId) &&
        Objects.equals(this.activityId, eventSubscriptionQueryDto.activityId) &&
        Objects.equals(this.tenantIdIn, eventSubscriptionQueryDto.tenantIdIn) &&
        Objects.equals(this.withoutTenantId, eventSubscriptionQueryDto.withoutTenantId) &&
        Objects.equals(this.includeEventSubscriptionsWithoutTenantId, eventSubscriptionQueryDto.includeEventSubscriptionsWithoutTenantId) &&
        Objects.equals(this.sorting, eventSubscriptionQueryDto.sorting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventSubscriptionId, eventName, eventType, executionId, processInstanceId, activityId, tenantIdIn, withoutTenantId, includeEventSubscriptionsWithoutTenantId, sorting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventSubscriptionQueryDto {\n");
    sb.append("    eventSubscriptionId: ").append(toIndentedString(eventSubscriptionId)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    tenantIdIn: ").append(toIndentedString(tenantIdIn)).append("\n");
    sb.append("    withoutTenantId: ").append(toIndentedString(withoutTenantId)).append("\n");
    sb.append("    includeEventSubscriptionsWithoutTenantId: ").append(toIndentedString(includeEventSubscriptionsWithoutTenantId)).append("\n");
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

