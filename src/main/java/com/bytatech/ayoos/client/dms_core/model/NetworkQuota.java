package com.bytatech.ayoos.client.dms_core.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Limits and usage of each quota. A network will have quotas for File space, the number of sites in the network, the number of people in the network, and the number of network administrators 
 */
@ApiModel(description = "Limits and usage of each quota. A network will have quotas for File space, the number of sites in the network, the number of people in the network, and the number of network administrators ")
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-10-04T11:46:25.045+05:30[Asia/Kolkata]")

public class NetworkQuota   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("limit")
  private Long limit = null;

  @JsonProperty("usage")
  private Long usage = null;

  public NetworkQuota id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public NetworkQuota limit(Long limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Get limit
   * @return limit
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Long getLimit() {
    return limit;
  }

  public void setLimit(Long limit) {
    this.limit = limit;
  }

  public NetworkQuota usage(Long usage) {
    this.usage = usage;
    return this;
  }

  /**
   * Get usage
   * @return usage
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Long getUsage() {
    return usage;
  }

  public void setUsage(Long usage) {
    this.usage = usage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkQuota networkQuota = (NetworkQuota) o;
    return Objects.equals(this.id, networkQuota.id) &&
        Objects.equals(this.limit, networkQuota.limit) &&
        Objects.equals(this.usage, networkQuota.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, limit, usage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkQuota {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

