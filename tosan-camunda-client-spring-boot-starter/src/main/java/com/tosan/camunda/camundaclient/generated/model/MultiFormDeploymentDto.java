package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import org.springframework.core.io.Resource;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * MultiFormDeploymentDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class MultiFormDeploymentDto   {
  @JsonProperty("tenant-id")
  private String tenantId = null;

  @JsonProperty("deployment-source")
  private String deploymentSource = null;

  @JsonProperty("deploy-changed-only")
  private Boolean deployChangedOnly = false;

  @JsonProperty("enable-duplicate-filtering")
  private Boolean enableDuplicateFiltering = false;

  @JsonProperty("deployment-name")
  private String deploymentName = null;

  @JsonProperty("deployment-activation-time")
  private OffsetDateTime deploymentActivationTime = null;

  @JsonProperty("data")
  private Resource data = null;

  public MultiFormDeploymentDto tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * The tenant id for the deployment to be created.
   * @return tenantId
   **/
  @Schema(description = "The tenant id for the deployment to be created.")
  
    public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public MultiFormDeploymentDto deploymentSource(String deploymentSource) {
    this.deploymentSource = deploymentSource;
    return this;
  }

  /**
   * The source for the deployment to be created.
   * @return deploymentSource
   **/
  @Schema(description = "The source for the deployment to be created.")
  
    public String getDeploymentSource() {
    return deploymentSource;
  }

  public void setDeploymentSource(String deploymentSource) {
    this.deploymentSource = deploymentSource;
  }

  public MultiFormDeploymentDto deployChangedOnly(Boolean deployChangedOnly) {
    this.deployChangedOnly = deployChangedOnly;
    return this;
  }

  /**
   * A flag indicating whether the process engine should perform duplicate checking on a per-resource basis. If set to true, only those resources that have actually changed are deployed. Checks are made against resources included previous deployments of the same name and only against the latest versions of those resources. If set to true, the option enable-duplicate-filtering is overridden and set to true.
   * @return deployChangedOnly
   **/
  @Schema(description = "A flag indicating whether the process engine should perform duplicate checking on a per-resource basis. If set to true, only those resources that have actually changed are deployed. Checks are made against resources included previous deployments of the same name and only against the latest versions of those resources. If set to true, the option enable-duplicate-filtering is overridden and set to true.")
  
    public Boolean isDeployChangedOnly() {
    return deployChangedOnly;
  }

  public void setDeployChangedOnly(Boolean deployChangedOnly) {
    this.deployChangedOnly = deployChangedOnly;
  }

  public MultiFormDeploymentDto enableDuplicateFiltering(Boolean enableDuplicateFiltering) {
    this.enableDuplicateFiltering = enableDuplicateFiltering;
    return this;
  }

  /**
   * A flag indicating whether the process engine should perform duplicate checking for the deployment or not. This allows you to check if a deployment with the same name and the same resouces already exists and if true, not create a new deployment but instead return the existing deployment. The default value is false.
   * @return enableDuplicateFiltering
   **/
  @Schema(description = "A flag indicating whether the process engine should perform duplicate checking for the deployment or not. This allows you to check if a deployment with the same name and the same resouces already exists and if true, not create a new deployment but instead return the existing deployment. The default value is false.")
  
    public Boolean isEnableDuplicateFiltering() {
    return enableDuplicateFiltering;
  }

  public void setEnableDuplicateFiltering(Boolean enableDuplicateFiltering) {
    this.enableDuplicateFiltering = enableDuplicateFiltering;
  }

  public MultiFormDeploymentDto deploymentName(String deploymentName) {
    this.deploymentName = deploymentName;
    return this;
  }

  /**
   * The name for the deployment to be created.
   * @return deploymentName
   **/
  @Schema(description = "The name for the deployment to be created.")
  
    public String getDeploymentName() {
    return deploymentName;
  }

  public void setDeploymentName(String deploymentName) {
    this.deploymentName = deploymentName;
  }

  public MultiFormDeploymentDto deploymentActivationTime(OffsetDateTime deploymentActivationTime) {
    this.deploymentActivationTime = deploymentActivationTime;
    return this;
  }

  /**
   * Sets the date on which the process definitions contained in this deployment will be activated. This means that all process definitions will be deployed as usual, but they will be suspended from the start until the given activation date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.
   * @return deploymentActivationTime
   **/
  @Schema(description = "Sets the date on which the process definitions contained in this deployment will be activated. This means that all process definitions will be deployed as usual, but they will be suspended from the start until the given activation date. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.")
  
    @Valid
    public OffsetDateTime getDeploymentActivationTime() {
    return deploymentActivationTime;
  }

  public void setDeploymentActivationTime(OffsetDateTime deploymentActivationTime) {
    this.deploymentActivationTime = deploymentActivationTime;
  }

  public MultiFormDeploymentDto data(Resource data) {
    this.data = data;
    return this;
  }

  /**
   * The binary data to create the deployment resource. It is possible to have more than one form part with different form part names for the binary data to create a deployment.
   * @return data
   **/
  @Schema(description = "The binary data to create the deployment resource. It is possible to have more than one form part with different form part names for the binary data to create a deployment.")
  
    @Valid
    public Resource getData() {
    return data;
  }

  public void setData(Resource data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiFormDeploymentDto multiFormDeploymentDto = (MultiFormDeploymentDto) o;
    return Objects.equals(this.tenantId, multiFormDeploymentDto.tenantId) &&
        Objects.equals(this.deploymentSource, multiFormDeploymentDto.deploymentSource) &&
        Objects.equals(this.deployChangedOnly, multiFormDeploymentDto.deployChangedOnly) &&
        Objects.equals(this.enableDuplicateFiltering, multiFormDeploymentDto.enableDuplicateFiltering) &&
        Objects.equals(this.deploymentName, multiFormDeploymentDto.deploymentName) &&
        Objects.equals(this.deploymentActivationTime, multiFormDeploymentDto.deploymentActivationTime) &&
        Objects.equals(this.data, multiFormDeploymentDto.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, deploymentSource, deployChangedOnly, enableDuplicateFiltering, deploymentName, deploymentActivationTime, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiFormDeploymentDto {\n");
    
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    deploymentSource: ").append(toIndentedString(deploymentSource)).append("\n");
    sb.append("    deployChangedOnly: ").append(toIndentedString(deployChangedOnly)).append("\n");
    sb.append("    enableDuplicateFiltering: ").append(toIndentedString(enableDuplicateFiltering)).append("\n");
    sb.append("    deploymentName: ").append(toIndentedString(deploymentName)).append("\n");
    sb.append("    deploymentActivationTime: ").append(toIndentedString(deploymentActivationTime)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
