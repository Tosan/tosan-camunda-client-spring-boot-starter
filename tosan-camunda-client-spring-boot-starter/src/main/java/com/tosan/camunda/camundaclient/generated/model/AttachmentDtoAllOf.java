package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AttachmentDtoAllOf
 */

@JsonTypeName("AttachmentDto_allOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class AttachmentDtoAllOf {

  private String id = null;

  private String name = null;

  private String description = null;

  private String taskId = null;

  private String type = null;

  private String url = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createTime = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime removalTime = null;

  private String rootProcessInstanceId = null;

  public AttachmentDtoAllOf id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the task attachment.
   * @return id
  */
  
  @Schema(name = "id", description = "The id of the task attachment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AttachmentDtoAllOf name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the task attachment.
   * @return name
  */
  
  @Schema(name = "name", description = "The name of the task attachment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AttachmentDtoAllOf description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the task attachment.
   * @return description
  */
  
  @Schema(name = "description", description = "The description of the task attachment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AttachmentDtoAllOf taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

  /**
   * The id of the task to which the attachment belongs.
   * @return taskId
  */
  
  @Schema(name = "taskId", description = "The id of the task to which the attachment belongs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taskId")
  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  public AttachmentDtoAllOf type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Indication of the type of content that this attachment refers to. Can be MIME type or any other indication.
   * @return type
  */
  
  @Schema(name = "type", description = "Indication of the type of content that this attachment refers to. Can be MIME type or any other indication.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public AttachmentDtoAllOf url(String url) {
    this.url = url;
    return this;
  }

  /**
   * The url to the remote content of the task attachment.
   * @return url
  */
  
  @Schema(name = "url", description = "The url to the remote content of the task attachment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public AttachmentDtoAllOf createTime(OffsetDateTime createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * The time the variable was inserted. [Default format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.
   * @return createTime
  */
  @Valid 
  @Schema(name = "createTime", description = "The time the variable was inserted. [Default format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createTime")
  public OffsetDateTime getCreateTime() {
    return createTime;
  }

  public void setCreateTime(OffsetDateTime createTime) {
    this.createTime = createTime;
  }

  public AttachmentDtoAllOf removalTime(OffsetDateTime removalTime) {
    this.removalTime = removalTime;
    return this;
  }

  /**
   * The time after which the attachment should be removed by the History Cleanup job. [Default format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.
   * @return removalTime
  */
  @Valid 
  @Schema(name = "removalTime", description = "The time after which the attachment should be removed by the History Cleanup job. [Default format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("removalTime")
  public OffsetDateTime getRemovalTime() {
    return removalTime;
  }

  public void setRemovalTime(OffsetDateTime removalTime) {
    this.removalTime = removalTime;
  }

  public AttachmentDtoAllOf rootProcessInstanceId(String rootProcessInstanceId) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentDtoAllOf attachmentDtoAllOf = (AttachmentDtoAllOf) o;
    return Objects.equals(this.id, attachmentDtoAllOf.id) &&
        Objects.equals(this.name, attachmentDtoAllOf.name) &&
        Objects.equals(this.description, attachmentDtoAllOf.description) &&
        Objects.equals(this.taskId, attachmentDtoAllOf.taskId) &&
        Objects.equals(this.type, attachmentDtoAllOf.type) &&
        Objects.equals(this.url, attachmentDtoAllOf.url) &&
        Objects.equals(this.createTime, attachmentDtoAllOf.createTime) &&
        Objects.equals(this.removalTime, attachmentDtoAllOf.removalTime) &&
        Objects.equals(this.rootProcessInstanceId, attachmentDtoAllOf.rootProcessInstanceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, taskId, type, url, createTime, removalTime, rootProcessInstanceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentDtoAllOf {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    removalTime: ").append(toIndentedString(removalTime)).append("\n");
    sb.append("    rootProcessInstanceId: ").append(toIndentedString(rootProcessInstanceId)).append("\n");
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

