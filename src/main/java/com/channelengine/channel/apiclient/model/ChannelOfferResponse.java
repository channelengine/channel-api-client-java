/*
 * ChannelEngine Channel API
 * ChannelEngine API for channels
 *
 * The version of the OpenAPI document: 2.10.0
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
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ChannelOfferResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ChannelOfferResponse {
  public static final String SERIALIZED_NAME_CHANNEL_PRODUCT_NO = "ChannelProductNo";
  @SerializedName(SERIALIZED_NAME_CHANNEL_PRODUCT_NO)
  private String channelProductNo;

  public static final String SERIALIZED_NAME_MERCHANT_PRODUCT_NO = "MerchantProductNo";
  @SerializedName(SERIALIZED_NAME_MERCHANT_PRODUCT_NO)
  private String merchantProductNo;

  public static final String SERIALIZED_NAME_PRICE = "Price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private BigDecimal price;

  public static final String SERIALIZED_NAME_STOCK = "Stock";
  @SerializedName(SERIALIZED_NAME_STOCK)
  private Integer stock;

  public static final String SERIALIZED_NAME_MAPPED_FIELDS = "MappedFields";
  @SerializedName(SERIALIZED_NAME_MAPPED_FIELDS)
  private Map<String, String> mappedFields = null;


  public ChannelOfferResponse channelProductNo(String channelProductNo) {
    
    this.channelProductNo = channelProductNo;
    return this;
  }

   /**
   * The unique product reference used by the Channel.
   * @return channelProductNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique product reference used by the Channel.")

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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getStock() {
    return stock;
  }


  public void setStock(Integer stock) {
    this.stock = stock;
  }


  public ChannelOfferResponse mappedFields(Map<String, String> mappedFields) {
    
    this.mappedFields = mappedFields;
    return this;
  }

  public ChannelOfferResponse putMappedFieldsItem(String key, String mappedFieldsItem) {
    if (this.mappedFields == null) {
      this.mappedFields = new HashMap<String, String>();
    }
    this.mappedFields.put(key, mappedFieldsItem);
    return this;
  }

   /**
   * A channel can require certain fields to be available. The channel  can provide ChannelEngine with this fields after which the merchants  will be able to fill in this field using custom conditions in ChannelEngine.
   * @return mappedFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A channel can require certain fields to be available. The channel  can provide ChannelEngine with this fields after which the merchants  will be able to fill in this field using custom conditions in ChannelEngine.")

  public Map<String, String> getMappedFields() {
    return mappedFields;
  }


  public void setMappedFields(Map<String, String> mappedFields) {
    this.mappedFields = mappedFields;
  }


  @Override
  public boolean equals(Object o) {
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
        Objects.equals(this.stock, channelOfferResponse.stock) &&
        Objects.equals(this.mappedFields, channelOfferResponse.mappedFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelProductNo, merchantProductNo, price, stock, mappedFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelOfferResponse {\n");
    sb.append("    channelProductNo: ").append(toIndentedString(channelProductNo)).append("\n");
    sb.append("    merchantProductNo: ").append(toIndentedString(merchantProductNo)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    stock: ").append(toIndentedString(stock)).append("\n");
    sb.append("    mappedFields: ").append(toIndentedString(mappedFields)).append("\n");
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

