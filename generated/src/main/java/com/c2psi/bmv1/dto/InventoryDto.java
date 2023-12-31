package com.c2psi.bmv1.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An Inventory used in the system
 */
@ApiModel(description = "An Inventory used in the system")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-09-30T16:03:01.698280900+01:00[Africa/Casablanca]")
public class InventoryDto   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("invComment")
  private String invComment;

  @JsonProperty("invDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime invDate;

  @JsonProperty("invCode")
  private String invCode;

  @JsonProperty("invPosId")
  private Long invPosId;

  public InventoryDto id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public InventoryDto invComment(String invComment) {
    this.invComment = invComment;
    return this;
  }

  /**
   * Get invComment
   * @return invComment
  */
  @ApiModelProperty(value = "")


  public String getInvComment() {
    return invComment;
  }

  public void setInvComment(String invComment) {
    this.invComment = invComment;
  }

  public InventoryDto invDate(OffsetDateTime invDate) {
    this.invDate = invDate;
    return this;
  }

  /**
   * Get invDate
   * @return invDate
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getInvDate() {
    return invDate;
  }

  public void setInvDate(OffsetDateTime invDate) {
    this.invDate = invDate;
  }

  public InventoryDto invCode(String invCode) {
    this.invCode = invCode;
    return this;
  }

  /**
   * Get invCode
   * @return invCode
  */
  @ApiModelProperty(example = "I0000", value = "")


  public String getInvCode() {
    return invCode;
  }

  public void setInvCode(String invCode) {
    this.invCode = invCode;
  }

  public InventoryDto invPosId(Long invPosId) {
    this.invPosId = invPosId;
    return this;
  }

  /**
   * Get invPosId
   * @return invPosId
  */
  @ApiModelProperty(value = "")


  public Long getInvPosId() {
    return invPosId;
  }

  public void setInvPosId(Long invPosId) {
    this.invPosId = invPosId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InventoryDto inventoryDto = (InventoryDto) o;
    return Objects.equals(this.id, inventoryDto.id) &&
        Objects.equals(this.invComment, inventoryDto.invComment) &&
        Objects.equals(this.invDate, inventoryDto.invDate) &&
        Objects.equals(this.invCode, inventoryDto.invCode) &&
        Objects.equals(this.invPosId, inventoryDto.invPosId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, invComment, invDate, invCode, invPosId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    invComment: ").append(toIndentedString(invComment)).append("\n");
    sb.append("    invDate: ").append(toIndentedString(invDate)).append("\n");
    sb.append("    invCode: ").append(toIndentedString(invCode)).append("\n");
    sb.append("    invPosId: ").append(toIndentedString(invPosId)).append("\n");
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

