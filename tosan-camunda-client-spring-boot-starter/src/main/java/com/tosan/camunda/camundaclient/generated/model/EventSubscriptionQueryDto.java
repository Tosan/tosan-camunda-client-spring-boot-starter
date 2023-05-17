package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;

/**
 * A event subscription query which retrieves a list of event subscriptions
 */
@Schema(description = "A event subscription query which retrieves a list of event subscriptions")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class EventSubscriptionQueryDto   {
  @JsonProperty("eventSubscriptionId")
  private String eventSubscriptionId = null;

  @JsonProperty("eventName")
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

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EventTypeEnum fromValue(String text) {
      for (EventTypeEnum b : EventTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("eventType")
  private EventTypeEnum eventType = null;

  @JsonProperty("executionId")
  private String executionId = null;

  @JsonProperty("processInstanceId")
  private String processInstanceId = null;

  @JsonProperty("activityId")
  private String activityId = null;

  @JsonProperty("tenantIdIn")
  @Valid
  private List<String> tenantIdIn = null;

  @JsonProperty("withoutTenantId")
  private Boolean withoutTenantId = null;

  @JsonProperty("includeEventSubscriptionsWithoutTenantId")
  private Boolean includeEventSubscriptionsWithoutTenantId = null;

  @JsonProperty("sorting")
  @Valid
  private List<EventSubscriptionQueryDtoSorting> sorting = null;

  public EventSubscriptionQueryDto eventSubscriptionId(String eventSubscriptionId) {
    this.eventSubscriptionId = eventSubscriptionId;
    return this;
  }

  /**
   * The id of the event subscription.
   * @return eventSubscriptionId
   **/
  @Schema(description = "The id of the event subscription.")
  
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
   **/
  @Schema(description = "The name of the event this subscription belongs to as defined in the process model.")
  
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
   **/
  @Schema(description = "The type of the event subscription.")
  
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
   **/
  @Schema(description = "The execution that is subscribed on the referenced event.")
  
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
   **/
  @Schema(description = "The process instance this subscription belongs to.")
  
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
   **/
  @Schema(description = "The identifier of the activity that this event subscription belongs to. This could for example be the id of a receive task.")
  
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
   **/
  @Schema(description = "Filter by a comma-separated list of tenant ids. Only select subscriptions that belong to one of the given tenant ids.")
  
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
   **/
  @Schema(description = "Only select subscriptions which have no tenant id. Value may only be `true`, as `false` is the default behavior.")
  
    public Boolean isWithoutTenantId() {
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
   **/
  @Schema(description = "Select event subscriptions which have no tenant id. Can be used in combination with tenantIdIn parameter. Value may only be `true`, as `false` is the default behavior.")
  
    public Boolean isIncludeEventSubscriptionsWithoutTenantId() {
    return includeEventSubscriptionsWithoutTenantId;
  }

  public void setIncludeEventSubscriptionsWithoutTenantId(Boolean includeEventSubscriptionsWithoutTenantId) {
    this.includeEventSubscriptionsWithoutTenantId = includeEventSubscriptionsWithoutTenantId;
  }

  public EventSubscriptionQueryDto sorting(List<EventSubscriptionQueryDtoSorting> sorting) {
    this.sorting = sorting;
    return this;
  }

  public EventSubscriptionQueryDto addSortingItem(EventSubscriptionQueryDtoSorting sortingItem) {
    if (this.sorting == null) {
      this.sorting = new ArrayList<>();
    }
    this.sorting.add(sortingItem);
    return this;
  }

  /**
   * Apply sorting of the result
   * @return sorting
   **/
  @Schema(description = "Apply sorting of the result")
      @Valid
    public List<EventSubscriptionQueryDtoSorting> getSorting() {
    return sorting;
  }

  public void setSorting(List<EventSubscriptionQueryDtoSorting> sorting) {
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
