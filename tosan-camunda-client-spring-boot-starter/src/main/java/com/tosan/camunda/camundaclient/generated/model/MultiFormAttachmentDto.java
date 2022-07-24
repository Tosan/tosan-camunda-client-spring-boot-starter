package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.core.io.Resource;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * MultiFormAttachmentDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class MultiFormAttachmentDto   {
  @JsonProperty("attachment-name")
  private String attachmentName = null;

  @JsonProperty("attachment-description")
  private String attachmentDescription = null;

  @JsonProperty("attachment-type")
  private String attachmentType = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("content")
  private Resource content = null;

  public MultiFormAttachmentDto attachmentName(String attachmentName) {
    this.attachmentName = attachmentName;
    return this;
  }

  /**
   * The name of the attachment.
   * @return attachmentName
   **/
  @Schema(description = "The name of the attachment.")
  
    public String getAttachmentName() {
    return attachmentName;
  }

  public void setAttachmentName(String attachmentName) {
    this.attachmentName = attachmentName;
  }

  public MultiFormAttachmentDto attachmentDescription(String attachmentDescription) {
    this.attachmentDescription = attachmentDescription;
    return this;
  }

  /**
   * The description of the attachment.
   * @return attachmentDescription
   **/
  @Schema(description = "The description of the attachment.")
  
    public String getAttachmentDescription() {
    return attachmentDescription;
  }

  public void setAttachmentDescription(String attachmentDescription) {
    this.attachmentDescription = attachmentDescription;
  }

  public MultiFormAttachmentDto attachmentType(String attachmentType) {
    this.attachmentType = attachmentType;
    return this;
  }

  /**
   * The type of the attachment.
   * @return attachmentType
   **/
  @Schema(description = "The type of the attachment.")
  
    public String getAttachmentType() {
    return attachmentType;
  }

  public void setAttachmentType(String attachmentType) {
    this.attachmentType = attachmentType;
  }

  public MultiFormAttachmentDto url(String url) {
    this.url = url;
    return this;
  }

  /**
   * The url to the remote content of the attachment.
   * @return url
   **/
  @Schema(description = "The url to the remote content of the attachment.")
  
    public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public MultiFormAttachmentDto content(Resource content) {
    this.content = content;
    return this;
  }

  /**
   * The content of the attachment.
   * @return content
   **/
  @Schema(description = "The content of the attachment.")
  
    @Valid
    public Resource getContent() {
    return content;
  }

  public void setContent(Resource content) {
    this.content = content;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiFormAttachmentDto multiFormAttachmentDto = (MultiFormAttachmentDto) o;
    return Objects.equals(this.attachmentName, multiFormAttachmentDto.attachmentName) &&
        Objects.equals(this.attachmentDescription, multiFormAttachmentDto.attachmentDescription) &&
        Objects.equals(this.attachmentType, multiFormAttachmentDto.attachmentType) &&
        Objects.equals(this.url, multiFormAttachmentDto.url) &&
        Objects.equals(this.content, multiFormAttachmentDto.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachmentName, attachmentDescription, attachmentType, url, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiFormAttachmentDto {\n");
    
    sb.append("    attachmentName: ").append(toIndentedString(attachmentName)).append("\n");
    sb.append("    attachmentDescription: ").append(toIndentedString(attachmentDescription)).append("\n");
    sb.append("    attachmentType: ").append(toIndentedString(attachmentType)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
