package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

/**
 * CamundaFormRef
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class CamundaFormRef   {
  @JsonProperty("key")
  private String key = null;

  @JsonProperty("binding")
  private String binding = null;

  @JsonProperty("version")
  private Integer version = null;

  public CamundaFormRef key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The key of the Camunda Form.
   * @return key
   **/
  @Schema(description = "The key of the Camunda Form.")
  
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
   **/
  @Schema(description = "The binding of the Camunda Form. Can be `latest`, `deployment` or `version`.")
  
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
   **/
  @Schema(description = "The specific version of a Camunda Form. This property is only set if `binding` is `version`.")
  
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
