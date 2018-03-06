/*
 * ChannelEngine Channel API
 * ChannelEngine API for channels
 *
 * OpenAPI spec version: 2.6.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.channelengine.channel.apiclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ChannelShipmentLineResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-06T11:26:35.801+01:00")
public class ChannelShipmentLineResponse {
  @SerializedName("ChannelProductNo")
  private String channelProductNo = null;

  @SerializedName("Quantity")
  private Integer quantity = null;

  public ChannelShipmentLineResponse channelProductNo(String channelProductNo) {
    this.channelProductNo = channelProductNo;
    return this;
  }

   /**
   * Get channelProductNo
   * @return channelProductNo
  **/
  @ApiModelProperty(required = true, value = "")
  public String getChannelProductNo() {
    return channelProductNo;
  }

  public void setChannelProductNo(String channelProductNo) {
    this.channelProductNo = channelProductNo;
  }

  public ChannelShipmentLineResponse quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelShipmentLineResponse channelShipmentLineResponse = (ChannelShipmentLineResponse) o;
    return Objects.equals(this.channelProductNo, channelShipmentLineResponse.channelProductNo) &&
        Objects.equals(this.quantity, channelShipmentLineResponse.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelProductNo, quantity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelShipmentLineResponse {\n");
    
    sb.append("    channelProductNo: ").append(toIndentedString(channelProductNo)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

