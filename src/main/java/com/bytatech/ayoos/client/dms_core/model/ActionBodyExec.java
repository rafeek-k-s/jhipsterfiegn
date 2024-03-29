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
 * ActionBodyExec
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-10-04T11:46:25.045+05:30[Asia/Kolkata]")

public class ActionBodyExec   {
  @JsonProperty("actionDefinitionId")
  private String actionDefinitionId = null;

  @JsonProperty("targetId")
  private String targetId = null;

  @JsonProperty("params")
  private Object params = null;

  public ActionBodyExec actionDefinitionId(String actionDefinitionId) {
    this.actionDefinitionId = actionDefinitionId;
    return this;
  }

  /**
   * Get actionDefinitionId
   * @return actionDefinitionId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getActionDefinitionId() {
    return actionDefinitionId;
  }

  public void setActionDefinitionId(String actionDefinitionId) {
    this.actionDefinitionId = actionDefinitionId;
  }

  public ActionBodyExec targetId(String targetId) {
    this.targetId = targetId;
    return this;
  }

  /**
   * The entity upon which to execute the action, typically a node ID or similar.
   * @return targetId
  **/
  @ApiModelProperty(value = "The entity upon which to execute the action, typically a node ID or similar.")


  public String getTargetId() {
    return targetId;
  }

  public void setTargetId(String targetId) {
    this.targetId = targetId;
  }

  public ActionBodyExec params(Object params) {
    this.params = params;
    return this;
  }

  /**
   * Get params
   * @return params
  **/
  @ApiModelProperty(value = "")


  public Object getParams() {
    return params;
  }

  public void setParams(Object params) {
    this.params = params;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionBodyExec actionBodyExec = (ActionBodyExec) o;
    return Objects.equals(this.actionDefinitionId, actionBodyExec.actionDefinitionId) &&
        Objects.equals(this.targetId, actionBodyExec.targetId) &&
        Objects.equals(this.params, actionBodyExec.params);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionDefinitionId, targetId, params);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionBodyExec {\n");
    
    sb.append("    actionDefinitionId: ").append(toIndentedString(actionDefinitionId)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
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

