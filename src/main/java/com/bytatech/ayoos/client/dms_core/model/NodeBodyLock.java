package com.bytatech.ayoos.client.dms_core.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NodeBodyLock
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-10-04T11:46:25.045+05:30[Asia/Kolkata]")

public class NodeBodyLock   {
  @JsonProperty("timeToExpire")
  private Integer timeToExpire = null;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    ALLOW_OWNER_CHANGES("ALLOW_OWNER_CHANGES"),
    
    FULL("FULL");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = TypeEnum.ALLOW_OWNER_CHANGES;

  /**
   * Gets or Sets lifetime
   */
  public enum LifetimeEnum {
    PERSISTENT("PERSISTENT"),
    
    EPHEMERAL("EPHEMERAL");

    private String value;

    LifetimeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LifetimeEnum fromValue(String text) {
      for (LifetimeEnum b : LifetimeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("lifetime")
  private LifetimeEnum lifetime = LifetimeEnum.PERSISTENT;

  public NodeBodyLock timeToExpire(Integer timeToExpire) {
    this.timeToExpire = timeToExpire;
    return this;
  }

  /**
   * Get timeToExpire
   * minimum: 0
   * @return timeToExpire
  **/
  @ApiModelProperty(value = "")

@Min(0)
  public Integer getTimeToExpire() {
    return timeToExpire;
  }

  public void setTimeToExpire(Integer timeToExpire) {
    this.timeToExpire = timeToExpire;
  }

  public NodeBodyLock type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")


  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public NodeBodyLock lifetime(LifetimeEnum lifetime) {
    this.lifetime = lifetime;
    return this;
  }

  /**
   * Get lifetime
   * @return lifetime
  **/
  @ApiModelProperty(value = "")


  public LifetimeEnum getLifetime() {
    return lifetime;
  }

  public void setLifetime(LifetimeEnum lifetime) {
    this.lifetime = lifetime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeBodyLock nodeBodyLock = (NodeBodyLock) o;
    return Objects.equals(this.timeToExpire, nodeBodyLock.timeToExpire) &&
        Objects.equals(this.type, nodeBodyLock.type) &&
        Objects.equals(this.lifetime, nodeBodyLock.lifetime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeToExpire, type, lifetime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeBodyLock {\n");
    
    sb.append("    timeToExpire: ").append(toIndentedString(timeToExpire)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    lifetime: ").append(toIndentedString(lifetime)).append("\n");
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

