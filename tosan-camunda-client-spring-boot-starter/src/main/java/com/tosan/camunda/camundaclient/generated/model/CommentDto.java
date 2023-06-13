package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tosan.camunda.camundaclient.generated.model.AtomLink;
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
 * CommentDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class CommentDto {

  private String id = null;

  private String userId = null;

  private String taskId = null;

  private String processInstanceId = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime time = null;

  private String message = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime removalTime = null;

  private String rootProcessInstanceId = null;

  @Valid
  private List<@Valid AtomLink> links;

  public CommentDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the task comment.
   * @return id
  */
  
  @Schema(name = "id", description = "The id of the task comment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CommentDto userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * The id of the user who created the comment.
   * @return userId
  */
  
  @Schema(name = "userId", description = "The id of the user who created the comment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public CommentDto taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

  /**
   * The id of the task to which the comment belongs.
   * @return taskId
  */
  
  @Schema(name = "taskId", description = "The id of the task to which the comment belongs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taskId")
  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  public CommentDto processInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
    return this;
  }

  /**
   * The id of the process instance the comment is related to.
   * @return processInstanceId
  */
  
  @Schema(name = "processInstanceId", description = "The id of the process instance the comment is related to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processInstanceId")
  public String getProcessInstanceId() {
    return processInstanceId;
  }

  public void setProcessInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
  }

  public CommentDto time(OffsetDateTime time) {
    this.time = time;
    return this;
  }

  /**
   * The time when the comment was created. [Default format]($(docsUrl)/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.
   * @return time
  */
  @Valid 
  @Schema(name = "time", description = "The time when the comment was created. [Default format]($(docsUrl)/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("time")
  public OffsetDateTime getTime() {
    return time;
  }

  public void setTime(OffsetDateTime time) {
    this.time = time;
  }

  public CommentDto message(String message) {
    this.message = message;
    return this;
  }

  /**
   * The content of the comment.
   * @return message
  */
  
  @Schema(name = "message", description = "The content of the comment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public CommentDto removalTime(OffsetDateTime removalTime) {
    this.removalTime = removalTime;
    return this;
  }

  /**
   * The time after which the comment should be removed by the History Cleanup job. [Default format]($(docsUrl)/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.
   * @return removalTime
  */
  @Valid 
  @Schema(name = "removalTime", description = "The time after which the comment should be removed by the History Cleanup job. [Default format]($(docsUrl)/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("removalTime")
  public OffsetDateTime getRemovalTime() {
    return removalTime;
  }

  public void setRemovalTime(OffsetDateTime removalTime) {
    this.removalTime = removalTime;
  }

  public CommentDto rootProcessInstanceId(String rootProcessInstanceId) {
    this.rootProcessInstanceId = rootProcessInstanceId;
    return this;
  }

  /**
   * The process instance id of the root process instance that initiated the process containing the task.
   * @return rootProcessInstanceId
  */
  
  @Schema(name = "rootProcessInstanceId", description = "The process instance id of the root process instance that initiated the process containing the task.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rootProcessInstanceId")
  public String getRootProcessInstanceId() {
    return rootProcessInstanceId;
  }

  public void setRootProcessInstanceId(String rootProcessInstanceId) {
    this.rootProcessInstanceId = rootProcessInstanceId;
  }

  public CommentDto links(List<@Valid AtomLink> links) {
    this.links = links;
    return this;
  }

  public CommentDto addLinksItem(AtomLink linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

  /**
   * The links associated to this resource, with `method`, `href` and `rel`.
   * @return links
  */
  @Valid 
  @Schema(name = "links", description = "The links associated to this resource, with `method`, `href` and `rel`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("links")
  public List<@Valid AtomLink> getLinks() {
    return links;
  }

  public void setLinks(List<@Valid AtomLink> links) {
    this.links = links;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommentDto commentDto = (CommentDto) o;
    return Objects.equals(this.id, commentDto.id) &&
        Objects.equals(this.userId, commentDto.userId) &&
        Objects.equals(this.taskId, commentDto.taskId) &&
        Objects.equals(this.processInstanceId, commentDto.processInstanceId) &&
        Objects.equals(this.time, commentDto.time) &&
        Objects.equals(this.message, commentDto.message) &&
        Objects.equals(this.removalTime, commentDto.removalTime) &&
        Objects.equals(this.rootProcessInstanceId, commentDto.rootProcessInstanceId) &&
        Objects.equals(this.links, commentDto.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, taskId, processInstanceId, time, message, removalTime, rootProcessInstanceId, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommentDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    removalTime: ").append(toIndentedString(removalTime)).append("\n");
    sb.append("    rootProcessInstanceId: ").append(toIndentedString(rootProcessInstanceId)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

