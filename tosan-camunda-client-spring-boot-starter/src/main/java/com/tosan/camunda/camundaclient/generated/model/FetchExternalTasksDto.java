package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FetchExternalTasksDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class FetchExternalTasksDto   {
  @JsonProperty("workerId")
  private String workerId = null;

  @JsonProperty("maxTasks")
  private Integer maxTasks = null;

  @JsonProperty("usePriority")
  private Boolean usePriority = null;

  @JsonProperty("asyncResponseTimeout")
  private Long asyncResponseTimeout = null;

  @JsonProperty("topics")
  @Valid
  private List<FetchExternalTaskTopicDto> topics = null;

  public FetchExternalTasksDto workerId(String workerId) {
    this.workerId = workerId;
    return this;
  }

  /**
   * **Mandatory.** The id of the worker on which behalf tasks are fetched. The returned tasks are locked for that worker and can only be completed when providing the same worker id.
   * @return workerId
   **/
  @Schema(required = true, description = "**Mandatory.** The id of the worker on which behalf tasks are fetched. The returned tasks are locked for that worker and can only be completed when providing the same worker id.")
      @NotNull

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
   **/
  @Schema(required = true, description = "**Mandatory.** The maximum number of tasks to return.")
      @NotNull

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
   **/
  @Schema(description = "A `boolean` value, which indicates whether the task should be fetched based on its priority or arbitrarily.")
  
    public Boolean isUsePriority() {
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
   **/
  @Schema(description = "The [Long Polling](https://docs.camunda.org/manual/7.17/user-guide/process-engine/external-tasks/#long-polling-to-fetch-and-lock-external-tasks) timeout in milliseconds.  **Note:** The value cannot be set larger than 1.800.000 milliseconds (corresponds to 30 minutes).")
  
    public Long getAsyncResponseTimeout() {
    return asyncResponseTimeout;
  }

  public void setAsyncResponseTimeout(Long asyncResponseTimeout) {
    this.asyncResponseTimeout = asyncResponseTimeout;
  }

  public FetchExternalTasksDto topics(List<FetchExternalTaskTopicDto> topics) {
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
   **/
  @Schema(description = "A JSON array of topic objects for which external tasks should be fetched. The returned tasks may be arbitrarily distributed among these topics. Each topic object has the following properties:")
      @Valid
    public List<FetchExternalTaskTopicDto> getTopics() {
    return topics;
  }

  public void setTopics(List<FetchExternalTaskTopicDto> topics) {
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
