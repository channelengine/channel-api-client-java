/*
 * ChannelEngine Channel API
 * ChannelEngine API for channels
 *
 * The version of the OpenAPI document: 2.9.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
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
 * ChannelReturnLineResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ChannelReturnLineResponse {
  public static final String SERIALIZED_NAME_CHANNEL_PRODUCT_NO = "ChannelProductNo";
  @SerializedName(SERIALIZED_NAME_CHANNEL_PRODUCT_NO)
  private String channelProductNo;

  public static final String SERIALIZED_NAME_MERCHANT_PRODUCT_NO = "MerchantProductNo";
  @SerializedName(SERIALIZED_NAME_MERCHANT_PRODUCT_NO)
  private String merchantProductNo;

  public static final String SERIALIZED_NAME_ACCEPTED_QUANTITY = "AcceptedQuantity";
  @SerializedName(SERIALIZED_NAME_ACCEPTED_QUANTITY)
  private Integer acceptedQuantity;

  public static final String SERIALIZED_NAME_REJECTED_QUANTITY = "RejectedQuantity";
  @SerializedName(SERIALIZED_NAME_REJECTED_QUANTITY)
  private Integer rejectedQuantity;

  public static final String SERIALIZED_NAME_QUANTITY = "Quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;


  public ChannelReturnLineResponse channelProductNo(String channelProductNo) {
    
    this.channelProductNo = channelProductNo;
    return this;
  }

   /**
   * The unique product reference used by the Channel.
   * @return channelProductNo
  **/
  @ApiModelProperty(required = true, value = "The unique product reference used by the Channel.")

  public String getChannelProductNo() {
    return channelProductNo;
  }


  public void setChannelProductNo(String channelProductNo) {
    this.channelProductNo = channelProductNo;
  }


  public ChannelReturnLineResponse merchantProductNo(String merchantProductNo) {
    
    this.merchantProductNo = merchantProductNo;
    return this;
  }

   /**
   * The unique product reference used by the Merchant.
   * @return merchantProductNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique product reference used by the Merchant.")

  public String getMerchantProductNo() {
    return merchantProductNo;
  }


  public void setMerchantProductNo(String merchantProductNo) {
    this.merchantProductNo = merchantProductNo;
  }


  public ChannelReturnLineResponse acceptedQuantity(Integer acceptedQuantity) {
    
    this.acceptedQuantity = acceptedQuantity;
    return this;
  }

   /**
   * The number of accepted items of the product in this return (should normally be refunded).
   * @return acceptedQuantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of accepted items of the product in this return (should normally be refunded).")

  public Integer getAcceptedQuantity() {
    return acceptedQuantity;
  }


  public void setAcceptedQuantity(Integer acceptedQuantity) {
    this.acceptedQuantity = acceptedQuantity;
  }


  public ChannelReturnLineResponse rejectedQuantity(Integer rejectedQuantity) {
    
    this.rejectedQuantity = rejectedQuantity;
    return this;
  }

   /**
   * The number of rejected items of the product in this return (should normally not be refunded).
   * @return rejectedQuantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of rejected items of the product in this return (should normally not be refunded).")

  public Integer getRejectedQuantity() {
    return rejectedQuantity;
  }


  public void setRejectedQuantity(Integer rejectedQuantity) {
    this.rejectedQuantity = rejectedQuantity;
  }


  public ChannelReturnLineResponse quantity(Integer quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * Number of items of the product in this return.
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "Number of items of the product in this return.")

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
    ChannelReturnLineResponse channelReturnLineResponse = (ChannelReturnLineResponse) o;
    return Objects.equals(this.channelProductNo, channelReturnLineResponse.channelProductNo) &&
        Objects.equals(this.merchantProductNo, channelReturnLineResponse.merchantProductNo) &&
        Objects.equals(this.acceptedQuantity, channelReturnLineResponse.acceptedQuantity) &&
        Objects.equals(this.rejectedQuantity, channelReturnLineResponse.rejectedQuantity) &&
        Objects.equals(this.quantity, channelReturnLineResponse.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelProductNo, merchantProductNo, acceptedQuantity, rejectedQuantity, quantity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelReturnLineResponse {\n");
    sb.append("    channelProductNo: ").append(toIndentedString(channelProductNo)).append("\n");
    sb.append("    merchantProductNo: ").append(toIndentedString(merchantProductNo)).append("\n");
    sb.append("    acceptedQuantity: ").append(toIndentedString(acceptedQuantity)).append("\n");
    sb.append("    rejectedQuantity: ").append(toIndentedString(rejectedQuantity)).append("\n");
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

