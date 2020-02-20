/*
 * ChannelEngine Channel API
 * ChannelEngine API for channels
 *
 * OpenAPI spec version: 2.0.0
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
import java.math.BigDecimal;

/**
 * ChannelOfferResponse
 */

public class ChannelOfferResponse {
  @SerializedName("ChannelProductNo")
  private String channelProductNo = null;

  @SerializedName("MerchantProductNo")
  private String merchantProductNo = null;

  @SerializedName("Price")
  private BigDecimal price = null;

  @SerializedName("Stock")
  private Integer stock = null;

  public ChannelOfferResponse channelProductNo(String channelProductNo) {
    this.channelProductNo = channelProductNo;
    return this;
  }

   /**
   * The unique product reference used by the Channel
   * @return channelProductNo
  **/
  @ApiModelProperty(value = "The unique product reference used by the Channel")
  public String getChannelProductNo() {
    return channelProductNo;
  }

  public void setChannelProductNo(String channelProductNo) {
    this.channelProductNo = channelProductNo;
  }

  public ChannelOfferResponse merchantProductNo(String merchantProductNo) {
    this.merchantProductNo = merchantProductNo;
    return this;
  }

   /**
   * Get merchantProductNo
   * @return merchantProductNo
  **/
  @ApiModelProperty(value = "")
  public String getMerchantProductNo() {
    return merchantProductNo;
  }

  public void setMerchantProductNo(String merchantProductNo) {
    this.merchantProductNo = merchantProductNo;
  }

  public ChannelOfferResponse price(BigDecimal price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public ChannelOfferResponse stock(Integer stock) {
    this.stock = stock;
    return this;
  }

   /**
   * Get stock
   * @return stock
  **/
  @ApiModelProperty(value = "")
  public Integer getStock() {
    return stock;
  }

  public void setStock(Integer stock) {
    this.stock = stock;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelOfferResponse channelOfferResponse = (ChannelOfferResponse) o;
    return Objects.equals(this.channelProductNo, channelOfferResponse.channelProductNo) &&
        Objects.equals(this.merchantProductNo, channelOfferResponse.merchantProductNo) &&
        Objects.equals(this.price, channelOfferResponse.price) &&
        Objects.equals(this.stock, channelOfferResponse.stock);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelProductNo, merchantProductNo, price, stock);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelOfferResponse {\n");
    
    sb.append("    channelProductNo: ").append(toIndentedString(channelProductNo)).append("\n");
    sb.append("    merchantProductNo: ").append(toIndentedString(merchantProductNo)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    stock: ").append(toIndentedString(stock)).append("\n");
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

