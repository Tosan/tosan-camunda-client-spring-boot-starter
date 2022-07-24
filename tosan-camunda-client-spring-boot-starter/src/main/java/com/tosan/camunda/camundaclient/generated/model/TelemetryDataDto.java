package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.HashMap;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * TelemetryDataDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class TelemetryDataDto   {
  @JsonProperty("installation")
  private String installation = null;

  @JsonProperty("product")
  @Valid
  private Map<String, TelemetryProductDto> product = null;

  public TelemetryDataDto installation(String installation) {
    this.installation = installation;
    return this;
  }

  /**
   * An id which is unique for each installation of Camunda. It is stored once per database so all engines connected to the same database will have the same installation ID. The ID is used to identify a single installation of Camunda Platform.
   * @return installation
   **/
  @Schema(description = "An id which is unique for each installation of Camunda. It is stored once per database so all engines connected to the same database will have the same installation ID. The ID is used to identify a single installation of Camunda Platform.")
  
    public String getInstallation() {
    return installation;
  }

  public void setInstallation(String installation) {
    this.installation = installation;
  }

  public TelemetryDataDto product(Map<String, TelemetryProductDto> product) {
    this.product = product;
    return this;
  }

  public TelemetryDataDto putProductItem(String key, TelemetryProductDto productItem) {
    if (this.product == null) {
      this.product = new HashMap<>();
    }
    this.product.put(key, productItem);
    return this;
  }

  /**
   * Information about the product collection telemetry data.
   * @return product
   **/
  @Schema(description = "Information about the product collection telemetry data.")
      @Valid
    public Map<String, TelemetryProductDto> getProduct() {
    return product;
  }

  public void setProduct(Map<String, TelemetryProductDto> product) {
    this.product = product;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TelemetryDataDto telemetryDataDto = (TelemetryDataDto) o;
    return Objects.equals(this.installation, telemetryDataDto.installation) &&
        Objects.equals(this.product, telemetryDataDto.product);
  }

  @Override
  public int hashCode() {
    return Objects.hash(installation, product);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelemetryDataDto {\n");
    
    sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
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
