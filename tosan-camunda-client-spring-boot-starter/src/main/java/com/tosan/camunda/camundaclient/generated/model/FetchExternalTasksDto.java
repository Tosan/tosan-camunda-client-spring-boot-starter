package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tosan.camunda.camundaclient.generated.model.FetchExternalTaskTopicDto;
import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * FetchExternalTasksDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class FetchExternalTasksDto {

  private String workerId;

  private Integer maxTasks = null;

  private Boolean usePriority = null;

  private Long asyncResponseTimeout = null;

  @Valid
  private List<@Valid FetchExternalTaskTopicDto> topics;

  /**
   * Default constructor
   * @deprecated Use {@link FetchExternalTasksDto#FetchExternalTasksDto(String, Integer)}
   */
  @Deprecated
  public FetchExternalTasksDto() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FetchExternalTasksDto(String workerId, Integer maxTasks) {
    this.workerId = workerId;
    this.maxTasks = maxTasks;
  }

  public FetchExternalTasksDto workerId(String workerId) {
    this.workerId = workerId;
    return this;
  }

  /**
   * **Mandatory.** The id of the worker on which behalf tasks are fetched. The returned tasks are locked for that worker and can only be completed when providing the same worker id.
   * @return workerId
  */
  @NotNull 
  @Schema(name = "workerId", description = "**Mandatory.** The id of the worker on which behalf tasks are fetched. The returned tasks are locked for that worker and can only be completed when providing the same worker id.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("workerId")
  public String getWorkerId() {
    return workerId;
  }

  public void setWorkerId(String workerId) {
    this.workerId = workerId;
  }

  public FetchExternalTasksDto maxTasks(Integer maxTasks) {
    this.maxTasks = maxTasks;
    return this;
  }

  /**
   * **Mandatory.** The maximum number of tasks to return.
   * @return maxTasks
  */
  @NotNull 
  @Schema(name = "maxTasks", description = "**Mandatory.** The maximum number of tasks to return.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("maxTasks")
  public Integer getMaxTasks() {
    return maxTasks;
  }

  public void setMaxTasks(Integer maxTasks) {
    this.maxTasks = maxTasks;
  }

  public FetchExternalTasksDto usePriority(Boolean usePriority) {
    this.usePriority = usePriority;
    return this;
  }

  /**
   * A `boolean` value, which indicates whether the task should be fetched based on its priority or arbitrarily.
   * @return usePriority
  */
  
  @Schema(name = "usePriority", description = "A `boolean` value, which indicates whether the task should be fetched based on its priority or arbitrarily.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("usePriority")
  public Boolean getUsePriority() {
    return usePriority;
  }

  public void setUsePriority(Boolean usePriority) {
    this.usePriority = usePriority;
  }

  public FetchExternalTasksDto asyncResponseTimeout(Long asyncResponseTimeout) {
    this.asyncResponseTimeout = asyncResponseTimeout;
    return this;
  }

  /**
   * The [Long Polling](https://docs.camunda.org/manual/7.17/user-guide/process-engine/external-tasks/#long-polling-to-fetch-and-lock-external-tasks) timeout in milliseconds.  **Note:** The value cannot be set larger than 1.800.000 milliseconds (corresponds to 30 minutes).
   * @return asyncResponseTimeout
  */
  
  @Schema(name = "asyncResponseTimeout", description = "The [Long Polling](https://docs.camunda.org/manual/7.17/user-guide/process-engine/external-tasks/#long-polling-to-fetch-and-lock-external-tasks) timeout in milliseconds.  **Note:** The value cannot be set larger than 1.800.000 milliseconds (corresponds to 30 minutes).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("asyncResponseTimeout")
  public Long getAsyncResponseTimeout() {
    return asyncResponseTimeout;
  }

  public void setAsyncResponseTimeout(Long asyncResponseTimeout) {
    this.asyncResponseTimeout = asyncResponseTimeout;
  }

  public FetchExternalTasksDto topics(List<@Valid FetchExternalTaskTopicDto> topics) {
    this.topics = topics;
    return this;
  }

  public FetchExternalTasksDto addTopicsItem(FetchExternalTaskTopicDto topicsItem) {
    if (this.topics == null) {
      this.topics = new ArrayList<>();
    }
    this.topics.add(topicsItem);
    return this;
  }

  /**
   * A JSON array of topic objects for which external tasks should be fetched. The returned tasks may be arbitrarily distributed among these topics. Each topic object has the following properties:
   * @return topics
  */
  @Valid 
  @Schema(name = "topics", description = "A JSON array of topic objects for which external tasks should be fetched. The returned tasks may be arbitrarily distributed among these topics. Each topic object has the following properties:", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("topics")
  public List<@Valid FetchExternalTaskTopicDto> getTopics() {
    return topics;
  }

  public void setTopics(List<@Valid FetchExternalTaskTopicDto> topics) {
    this.topics = topics;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FetchExternalTasksDto fetchExternalTasksDto = (FetchExternalTasksDto) o;
    return Objects.equals(this.workerId, fetchExternalTasksDto.workerId) &&
        Objects.equals(this.maxTasks, fetchExternalTasksDto.maxTasks) &&
        Objects.equals(this.usePriority, fetchExternalTasksDto.usePriority) &&
        Objects.equals(this.asyncResponseTimeout, fetchExternalTasksDto.asyncResponseTimeout) &&
        Objects.equals(this.topics, fetchExternalTasksDto.topics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workerId, maxTasks, usePriority, asyncResponseTimeout, topics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FetchExternalTasksDto {\n");
    sb.append("    workerId: ").append(toIndentedString(workerId)).append("\n");
    sb.append("    maxTasks: ").append(toIndentedString(maxTasks)).append("\n");
    sb.append("    usePriority: ").append(toIndentedString(usePriority)).append("\n");
    sb.append("    asyncResponseTimeout: ").append(toIndentedString(asyncResponseTimeout)).append("\n");
    sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
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

