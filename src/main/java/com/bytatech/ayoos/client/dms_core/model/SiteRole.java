package com.bytatech.ayoos.client.dms_core.model;

import java.util.Objects;
import com.bytatech.ayoos.client.dms_core.model.Site;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SiteRole
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-10-04T11:46:25.045+05:30[Asia/Kolkata]")

public class SiteRole   {
  @JsonProperty("site")
  private Site site = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("guid")
  private String guid = null;

  /**
   * Gets or Sets role
   */
  public enum RoleEnum {
    SITECONSUMER("SiteConsumer"),
    
    SITECOLLABORATOR("SiteCollaborator"),
    
    SITECONTRIBUTOR("SiteContributor"),
    
    SITEMANAGER("SiteManager");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RoleEnum fromValue(String text) {
      for (RoleEnum b : RoleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("role")
  private RoleEnum role = null;

  public SiteRole site(Site site) {
    this.site = site;
    return this;
  }

  /**
   * Get site
   * @return site
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Site getSite() {
    return site;
  }

  public void setSite(Site site) {
    this.site = site;
  }

  public SiteRole id(String id) {
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

  public SiteRole guid(String guid) {
    this.guid = guid;
    return this;
  }

  /**
   * Get guid
   * @return guid
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getGuid() {
    return guid;
  }

  public void setGuid(String guid) {
    this.guid = guid;
  }

  public SiteRole role(RoleEnum role) {
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SiteRole siteRole = (SiteRole) o;
    return Objects.equals(this.site, siteRole.site) &&
        Objects.equals(this.id, siteRole.id) &&
        Objects.equals(this.guid, siteRole.guid) &&
        Objects.equals(this.role, siteRole.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(site, id, guid, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SiteRole {\n");
    
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

