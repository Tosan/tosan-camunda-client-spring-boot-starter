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
 * CamundaFormRef
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class CamundaFormRef {

  private String key = null;

  private String binding = null;

  private Integer version = null;

  public CamundaFormRef key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The key of the Camunda Form.
   * @return key
  */
  
  @Schema(name = "key", description = "The key of the Camunda Form.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public CamundaFormRef binding(String binding) {
    this.binding = binding;
    return this;
  }

  /**
   * The binding of the Camunda Form. Can be `latest`, `deployment` or `version`.
   * @return binding
  */
  
  @Schema(name = "binding", description = "The binding of the Camunda Form. Can be `latest`, `deployment` or `version`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("binding")
  public String getBinding() {
    return binding;
  }

  public void setBinding(String binding) {
    this.binding = binding;
  }

  public CamundaFormRef version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * The specific version of a Camunda Form. This property is only set if `binding` is `version`.
   * @return version
  */
  
  @Schema(name = "version", description = "The specific version of a Camunda Form. This property is only set if `binding` is `version`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CamundaFormRef camundaFormRef = (CamundaFormRef) o;
    return Objects.equals(this.key, camundaFormRef.key) &&
        Objects.equals(this.binding, camundaFormRef.binding) &&
        Objects.equals(this.version, camundaFormRef.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, binding, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CamundaFormRef {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    binding: ").append(toIndentedString(binding)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

