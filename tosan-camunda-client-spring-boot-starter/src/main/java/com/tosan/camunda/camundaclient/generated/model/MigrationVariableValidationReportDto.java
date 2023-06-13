package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * MigrationVariableValidationReportDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class MigrationVariableValidationReportDto {

  @Valid
  private List<String> failures;

  private Object value;

  private String type = null;

  @Valid
  private Map<String, Object> valueInfo = new HashMap<>();

  public MigrationVariableValidationReportDto failures(List<String> failures) {
    this.failures = failures;
    return this;
  }

  public MigrationVariableValidationReportDto addFailuresItem(String failuresItem) {
    if (this.failures == null) {
      this.failures = new ArrayList<>();
    }
    this.failures.add(failuresItem);
    return this;
  }

  /**
   * A list of variable validation report messages.
   * @return failures
  */
  
  @Schema(name = "failures", description = "A list of variable validation report messages.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("failures")
  public List<String> getFailures() {
    return failures;
  }

  public void setFailures(List<String> failures) {
    this.failures = failures;
  }

  public MigrationVariableValidationReportDto value(Object value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  */
  
  @Schema(name = "value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }

  public MigrationVariableValidationReportDto type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The value type of the variable.
   * @return type
  */
  
  @Schema(name = "type", description = "The value type of the variable.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public MigrationVariableValidationReportDto valueInfo(Map<String, Object> valueInfo) {
    this.valueInfo = valueInfo;
    return this;
  }

  public MigrationVariableValidationReportDto putValueInfoItem(String key, Object valueInfoItem) {
    if (this.valueInfo == null) {
      this.valueInfo = new HashMap<>();
    }
    this.valueInfo.put(key, valueInfoItem);
    return this;
  }

  /**
   * A JSON object containing additional, value-type-dependent properties. For serialized variables of type Object, the following properties can be provided:  * `objectTypeName`: A string representation of the object's type name. * `serializationDataFormat`: The serialization format used to store the variable.  For serialized variables of type File, the following properties can be provided:  * `filename`: The name of the file. This is not the variable name but the name that will be used when downloading the file again. * `mimetype`: The MIME type of the file that is being uploaded. * `encoding`: The encoding of the file that is being uploaded.  The following property can be provided for all value types:  * `transient`: Indicates whether the variable should be transient or not. See [documentation](https://docs.camunda.org/manual/7.17/user-guide/process-engine/variables#transient-variables) for more informations. (Not applicable for `decision-definition`, ` /process-instance/variables-async`, and `/migration/executeAsync` endpoints)
   * @return valueInfo
  */
  
  @Schema(name = "valueInfo", description = "A JSON object containing additional, value-type-dependent properties. For serialized variables of type Object, the following properties can be provided:  * `objectTypeName`: A string representation of the object's type name. * `serializationDataFormat`: The serialization format used to store the variable.  For serialized variables of type File, the following properties can be provided:  * `filename`: The name of the file. This is not the variable name but the name that will be used when downloading the file again. * `mimetype`: The MIME type of the file that is being uploaded. * `encoding`: The encoding of the file that is being uploaded.  The following property can be provided for all value types:  * `transient`: Indicates whether the variable should be transient or not. See [documentation](https://docs.camunda.org/manual/7.17/user-guide/process-engine/variables#transient-variables) for more informations. (Not applicable for `decision-definition`, ` /process-instance/variables-async`, and `/migration/executeAsync` endpoints)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valueInfo")
  public Map<String, Object> getValueInfo() {
    return valueInfo;
  }

  public void setValueInfo(Map<String, Object> valueInfo) {
    this.valueInfo = valueInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MigrationVariableValidationReportDto migrationVariableValidationReportDto = (MigrationVariableValidationReportDto) o;
    return Objects.equals(this.failures, migrationVariableValidationReportDto.failures) &&
        Objects.equals(this.value, migrationVariableValidationReportDto.value) &&
        Objects.equals(this.type, migrationVariableValidationReportDto.type) &&
        Objects.equals(this.valueInfo, migrationVariableValidationReportDto.valueInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failures, value, type, valueInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MigrationVariableValidationReportDto {\n");
    sb.append("    failures: ").append(toIndentedString(failures)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    valueInfo: ").append(toIndentedString(valueInfo)).append("\n");
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

