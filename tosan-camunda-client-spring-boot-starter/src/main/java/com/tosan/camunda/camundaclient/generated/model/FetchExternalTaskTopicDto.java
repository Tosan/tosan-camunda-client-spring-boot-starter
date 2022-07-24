package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FetchExternalTaskTopicDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class FetchExternalTaskTopicDto   {
  @JsonProperty("topicName")
  private String topicName = null;

  @JsonProperty("lockDuration")
  private Long lockDuration = null;

  @JsonProperty("variables")
  @Valid
  private List<String> variables = null;

  @JsonProperty("localVariables")
  private Boolean localVariables = false;

  @JsonProperty("businessKey")
  private String businessKey = null;

  @JsonProperty("processDefinitionId")
  private String processDefinitionId = null;

  @JsonProperty("processDefinitionIdIn")
  @Valid
  private List<String> processDefinitionIdIn = null;

  @JsonProperty("processDefinitionKey")
  private String processDefinitionKey = null;

  @JsonProperty("processDefinitionKeyIn")
  @Valid
  private List<String> processDefinitionKeyIn = null;

  @JsonProperty("processDefinitionVersionTag")
  private String processDefinitionVersionTag = null;

  @JsonProperty("withoutTenantId")
  private Boolean withoutTenantId = false;

  @JsonProperty("tenantIdIn")
  @Valid
  private List<String> tenantIdIn = null;

  @JsonProperty("processVariables")
  @Valid
  private Map<String, Object> processVariables = null;

  @JsonProperty("deserializeValues")
  private Boolean deserializeValues = false;

  @JsonProperty("includeExtensionProperties")
  private Boolean includeExtensionProperties = false;

  public FetchExternalTaskTopicDto topicName(String topicName) {
    this.topicName = topicName;
    return this;
  }

  /**
   * **Mandatory.** The topic's name.
   * @return topicName
   **/
  @Schema(required = true, description = "**Mandatory.** The topic's name.")
      @NotNull

    public String getTopicName() {
    return topicName;
  }

  public void setTopicName(String topicName) {
    this.topicName = topicName;
  }

  public FetchExternalTaskTopicDto lockDuration(Long lockDuration) {
    this.lockDuration = lockDuration;
    return this;
  }

  /**
   * **Mandatory.** The duration to lock the external tasks for in milliseconds.
   * @return lockDuration
   **/
  @Schema(required = true, description = "**Mandatory.** The duration to lock the external tasks for in milliseconds.")
      @NotNull

    public Long getLockDuration() {
    return lockDuration;
  }

  public void setLockDuration(Long lockDuration) {
    this.lockDuration = lockDuration;
  }

  public FetchExternalTaskTopicDto variables(List<String> variables) {
    this.variables = variables;
    return this;
  }

  public FetchExternalTaskTopicDto addVariablesItem(String variablesItem) {
    if (this.variables == null) {
      this.variables = new ArrayList<>();
    }
    this.variables.add(variablesItem);
    return this;
  }

  /**
   * A JSON array of `String` values that represent variable names. For each result task belonging to this topic, the given variables are returned as well if they are accessible from the external task's execution. If not provided - all variables will be fetched.
   * @return variables
   **/
  @Schema(description = "A JSON array of `String` values that represent variable names. For each result task belonging to this topic, the given variables are returned as well if they are accessible from the external task's execution. If not provided - all variables will be fetched.")
  
    public List<String> getVariables() {
    return variables;
  }

  public void setVariables(List<String> variables) {
    this.variables = variables;
  }

  public FetchExternalTaskTopicDto localVariables(Boolean localVariables) {
    this.localVariables = localVariables;
    return this;
  }

  /**
   * If `true` only local variables will be fetched.
   * @return localVariables
   **/
  @Schema(description = "If `true` only local variables will be fetched.")
  
    public Boolean isLocalVariables() {
    return localVariables;
  }

  public void setLocalVariables(Boolean localVariables) {
    this.localVariables = localVariables;
  }

  public FetchExternalTaskTopicDto businessKey(String businessKey) {
    this.businessKey = businessKey;
    return this;
  }

  /**
   * A `String` value which enables the filtering of tasks based on process instance business key.
   * @return businessKey
   **/
  @Schema(description = "A `String` value which enables the filtering of tasks based on process instance business key.")
  
    public String getBusinessKey() {
    return businessKey;
  }

  public void setBusinessKey(String businessKey) {
    this.businessKey = businessKey;
  }

  public FetchExternalTaskTopicDto processDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
    return this;
  }

  /**
   * Filter tasks based on process definition id.
   * @return processDefinitionId
   **/
  @Schema(description = "Filter tasks based on process definition id.")
  
    public String getProcessDefinitionId() {
    return processDefinitionId;
  }

  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }

  public FetchExternalTaskTopicDto processDefinitionIdIn(List<String> processDefinitionIdIn) {
    this.processDefinitionIdIn = processDefinitionIdIn;
    return this;
  }

  public FetchExternalTaskTopicDto addProcessDefinitionIdInItem(String processDefinitionIdInItem) {
    if (this.processDefinitionIdIn == null) {
      this.processDefinitionIdIn = new ArrayList<>();
    }
    this.processDefinitionIdIn.add(processDefinitionIdInItem);
    return this;
  }

  /**
   * Filter tasks based on process definition ids.
   * @return processDefinitionIdIn
   **/
  @Schema(description = "Filter tasks based on process definition ids.")
  
    public List<String> getProcessDefinitionIdIn() {
    return processDefinitionIdIn;
  }

  public void setProcessDefinitionIdIn(List<String> processDefinitionIdIn) {
    this.processDefinitionIdIn = processDefinitionIdIn;
  }

  public FetchExternalTaskTopicDto processDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
    return this;
  }

  /**
   * Filter tasks based on process definition key.
   * @return processDefinitionKey
   **/
  @Schema(description = "Filter tasks based on process definition key.")
  
    public String getProcessDefinitionKey() {
    return processDefinitionKey;
  }

  public void setProcessDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
  }

  public FetchExternalTaskTopicDto processDefinitionKeyIn(List<String> processDefinitionKeyIn) {
    this.processDefinitionKeyIn = processDefinitionKeyIn;
    return this;
  }

  public FetchExternalTaskTopicDto addProcessDefinitionKeyInItem(String processDefinitionKeyInItem) {
    if (this.processDefinitionKeyIn == null) {
      this.processDefinitionKeyIn = new ArrayList<>();
    }
    this.processDefinitionKeyIn.add(processDefinitionKeyInItem);
    return this;
  }

  /**
   * Filter tasks based on process definition keys.
   * @return processDefinitionKeyIn
   **/
  @Schema(description = "Filter tasks based on process definition keys.")
  
    public List<String> getProcessDefinitionKeyIn() {
    return processDefinitionKeyIn;
  }

  public void setProcessDefinitionKeyIn(List<String> processDefinitionKeyIn) {
    this.processDefinitionKeyIn = processDefinitionKeyIn;
  }

  public FetchExternalTaskTopicDto processDefinitionVersionTag(String processDefinitionVersionTag) {
    this.processDefinitionVersionTag = processDefinitionVersionTag;
    return this;
  }

  /**
   * Filter tasks based on process definition version tag.
   * @return processDefinitionVersionTag
   **/
  @Schema(description = "Filter tasks based on process definition version tag.")
  
    public String getProcessDefinitionVersionTag() {
    return processDefinitionVersionTag;
  }

  public void setProcessDefinitionVersionTag(String processDefinitionVersionTag) {
    this.processDefinitionVersionTag = processDefinitionVersionTag;
  }

  public FetchExternalTaskTopicDto withoutTenantId(Boolean withoutTenantId) {
    this.withoutTenantId = withoutTenantId;
    return this;
  }

  /**
   * Filter tasks without tenant id.
   * @return withoutTenantId
   **/
  @Schema(description = "Filter tasks without tenant id.")
  
    public Boolean isWithoutTenantId() {
    return withoutTenantId;
  }

  public void setWithoutTenantId(Boolean withoutTenantId) {
    this.withoutTenantId = withoutTenantId;
  }

  public FetchExternalTaskTopicDto tenantIdIn(List<String> tenantIdIn) {
    this.tenantIdIn = tenantIdIn;
    return this;
  }

  public FetchExternalTaskTopicDto addTenantIdInItem(String tenantIdInItem) {
    if (this.tenantIdIn == null) {
      this.tenantIdIn = new ArrayList<>();
    }
    this.tenantIdIn.add(tenantIdInItem);
    return this;
  }

  /**
   * Filter tasks based on tenant ids.
   * @return tenantIdIn
   **/
  @Schema(description = "Filter tasks based on tenant ids.")
  
    public List<String> getTenantIdIn() {
    return tenantIdIn;
  }

  public void setTenantIdIn(List<String> tenantIdIn) {
    this.tenantIdIn = tenantIdIn;
  }

  public FetchExternalTaskTopicDto processVariables(Map<String, Object> processVariables) {
    this.processVariables = processVariables;
    return this;
  }

  public FetchExternalTaskTopicDto putProcessVariablesItem(String key, Object processVariablesItem) {
    if (this.processVariables == null) {
      this.processVariables = new HashMap<>();
    }
    this.processVariables.put(key, processVariablesItem);
    return this;
  }

  /**
   * A `JSON` object used for filtering tasks based on process instance variable values. A property name of the object represents a process variable name, while the property value represents the process variable value to filter tasks by.
   * @return processVariables
   **/
  @Schema(description = "A `JSON` object used for filtering tasks based on process instance variable values. A property name of the object represents a process variable name, while the property value represents the process variable value to filter tasks by.")
  
    public Map<String, Object> getProcessVariables() {
    return processVariables;
  }

  public void setProcessVariables(Map<String, Object> processVariables) {
    this.processVariables = processVariables;
  }

  public FetchExternalTaskTopicDto deserializeValues(Boolean deserializeValues) {
    this.deserializeValues = deserializeValues;
    return this;
  }

  /**
   * Determines whether serializable variable values (typically variables that store custom Java objects) should be deserialized on server side (default `false`).  If set to `true`, a serializable variable will be deserialized on server side and transformed to JSON using [Jackson's](https://github.com/FasterXML/jackson) POJO/bean property introspection feature. Note that this requires the Java classes of the variable value to be on the REST API's classpath.  If set to `false`, a serializable variable will be returned in its serialized format. For example, a variable that is serialized as XML will be returned as a JSON string containing XML.
   * @return deserializeValues
   **/
  @Schema(description = "Determines whether serializable variable values (typically variables that store custom Java objects) should be deserialized on server side (default `false`).  If set to `true`, a serializable variable will be deserialized on server side and transformed to JSON using [Jackson's](https://github.com/FasterXML/jackson) POJO/bean property introspection feature. Note that this requires the Java classes of the variable value to be on the REST API's classpath.  If set to `false`, a serializable variable will be returned in its serialized format. For example, a variable that is serialized as XML will be returned as a JSON string containing XML.")
  
    public Boolean isDeserializeValues() {
    return deserializeValues;
  }

  public void setDeserializeValues(Boolean deserializeValues) {
    this.deserializeValues = deserializeValues;
  }

  public FetchExternalTaskTopicDto includeExtensionProperties(Boolean includeExtensionProperties) {
    this.includeExtensionProperties = includeExtensionProperties;
    return this;
  }

  /**
   * Determines whether custom extension properties defined in the BPMN activity of the external task (e.g. via the Extensions tab in the Camunda modeler) should be included in the response. Default: false
   * @return includeExtensionProperties
   **/
  @Schema(description = "Determines whether custom extension properties defined in the BPMN activity of the external task (e.g. via the Extensions tab in the Camunda modeler) should be included in the response. Default: false")
  
    public Boolean isIncludeExtensionProperties() {
    return includeExtensionProperties;
  }

  public void setIncludeExtensionProperties(Boolean includeExtensionProperties) {
    this.includeExtensionProperties = includeExtensionProperties;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FetchExternalTaskTopicDto fetchExternalTaskTopicDto = (FetchExternalTaskTopicDto) o;
    return Objects.equals(this.topicName, fetchExternalTaskTopicDto.topicName) &&
        Objects.equals(this.lockDuration, fetchExternalTaskTopicDto.lockDuration) &&
        Objects.equals(this.variables, fetchExternalTaskTopicDto.variables) &&
        Objects.equals(this.localVariables, fetchExternalTaskTopicDto.localVariables) &&
        Objects.equals(this.businessKey, fetchExternalTaskTopicDto.businessKey) &&
        Objects.equals(this.processDefinitionId, fetchExternalTaskTopicDto.processDefinitionId) &&
        Objects.equals(this.processDefinitionIdIn, fetchExternalTaskTopicDto.processDefinitionIdIn) &&
        Objects.equals(this.processDefinitionKey, fetchExternalTaskTopicDto.processDefinitionKey) &&
        Objects.equals(this.processDefinitionKeyIn, fetchExternalTaskTopicDto.processDefinitionKeyIn) &&
        Objects.equals(this.processDefinitionVersionTag, fetchExternalTaskTopicDto.processDefinitionVersionTag) &&
        Objects.equals(this.withoutTenantId, fetchExternalTaskTopicDto.withoutTenantId) &&
        Objects.equals(this.tenantIdIn, fetchExternalTaskTopicDto.tenantIdIn) &&
        Objects.equals(this.processVariables, fetchExternalTaskTopicDto.processVariables) &&
        Objects.equals(this.deserializeValues, fetchExternalTaskTopicDto.deserializeValues) &&
        Objects.equals(this.includeExtensionProperties, fetchExternalTaskTopicDto.includeExtensionProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topicName, lockDuration, variables, localVariables, businessKey, processDefinitionId, processDefinitionIdIn, processDefinitionKey, processDefinitionKeyIn, processDefinitionVersionTag, withoutTenantId, tenantIdIn, processVariables, deserializeValues, includeExtensionProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FetchExternalTaskTopicDto {\n");
    
    sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
    sb.append("    lockDuration: ").append(toIndentedString(lockDuration)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    localVariables: ").append(toIndentedString(localVariables)).append("\n");
    sb.append("    businessKey: ").append(toIndentedString(businessKey)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionIdIn: ").append(toIndentedString(processDefinitionIdIn)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    processDefinitionKeyIn: ").append(toIndentedString(processDefinitionKeyIn)).append("\n");
    sb.append("    processDefinitionVersionTag: ").append(toIndentedString(processDefinitionVersionTag)).append("\n");
    sb.append("    withoutTenantId: ").append(toIndentedString(withoutTenantId)).append("\n");
    sb.append("    tenantIdIn: ").append(toIndentedString(tenantIdIn)).append("\n");
    sb.append("    processVariables: ").append(toIndentedString(processVariables)).append("\n");
    sb.append("    deserializeValues: ").append(toIndentedString(deserializeValues)).append("\n");
    sb.append("    includeExtensionProperties: ").append(toIndentedString(includeExtensionProperties)).append("\n");
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
