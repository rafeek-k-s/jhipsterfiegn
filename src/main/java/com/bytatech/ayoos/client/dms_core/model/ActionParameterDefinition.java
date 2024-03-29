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
 * ActionParameterDefinition
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-10-04T11:46:25.045+05:30[Asia/Kolkata]")

public class ActionParameterDefinition   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("multiValued")
  private Boolean multiValued = null;

  @JsonProperty("mandatory")
  private Boolean mandatory = null;

  @JsonProperty("displayLabel")
  private String displayLabel = null;

  public ActionParameterDefinition name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ActionParameterDefinition type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ActionParameterDefinition multiValued(Boolean multiValued) {
    this.multiValued = multiValued;
    return this;
  }

  /**
   * Get multiValued
   * @return multiValued
  **/
  @ApiModelProperty(value = "")


  public Boolean isMultiValued() {
    return multiValued;
  }

  public void setMultiValued(Boolean multiValued) {
    this.multiValued = multiValued;
  }

  public ActionParameterDefinition mandatory(Boolean mandatory) {
    this.mandatory = mandatory;
    return this;
  }

  /**
   * Get mandatory
   * @return mandatory
  **/
  @ApiModelProperty(value = "")


  public Boolean isMandatory() {
    return mandatory;
  }

  public void setMandatory(Boolean mandatory) {
    this.mandatory = mandatory;
  }

  public ActionParameterDefinition displayLabel(String displayLabel) {
    this.displayLabel = displayLabel;
    return this;
  }

  /**
   * Get displayLabel
   * @return displayLabel
  **/
  @ApiModelProperty(value = "")


  public String getDisplayLabel() {
    return displayLabel;
  }

  public void setDisplayLabel(String displayLabel) {
    this.displayLabel = displayLabel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionParameterDefinition actionParameterDefinition = (ActionParameterDefinition) o;
    return Objects.equals(this.name, actionParameterDefinition.name) &&
        Objects.equals(this.type, actionParameterDefinition.type) &&
        Objects.equals(this.multiValued, actionParameterDefinition.multiValued) &&
        Objects.equals(this.mandatory, actionParameterDefinition.mandatory) &&
        Objects.equals(this.displayLabel, actionParameterDefinition.displayLabel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, multiValued, mandatory, displayLabel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionParameterDefinition {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    multiValued: ").append(toIndentedString(multiValued)).append("\n");
    sb.append("    mandatory: ").append(toIndentedString(mandatory)).append("\n");
    sb.append("    displayLabel: ").append(toIndentedString(displayLabel)).append("\n");
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

