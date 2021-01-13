/*
 * ChannelEngine Channel API
 * ChannelEngine API for channels
 *
 * The version of the OpenAPI document: 2.9.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.channelengine.channel.apiclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.channelengine.channel.apiclient.model.ChannelReturnLineResponse;
import com.channelengine.channel.apiclient.model.ReturnReason;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * ChannelReturnResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ChannelReturnResponse {
  public static final String SERIALIZED_NAME_CHANNEL_RETURN_NO = "ChannelReturnNo";
  @SerializedName(SERIALIZED_NAME_CHANNEL_RETURN_NO)
  private String channelReturnNo;

  public static final String SERIALIZED_NAME_CHANNEL_ORDER_NO = "ChannelOrderNo";
  @SerializedName(SERIALIZED_NAME_CHANNEL_ORDER_NO)
  private String channelOrderNo;

  public static final String SERIALIZED_NAME_MERCHANT_ORDER_NO = "MerchantOrderNo";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ORDER_NO)
  private String merchantOrderNo;

  public static final String SERIALIZED_NAME_LINES = "Lines";
  @SerializedName(SERIALIZED_NAME_LINES)
  private List<ChannelReturnLineResponse> lines = new ArrayList<ChannelReturnLineResponse>();

  public static final String SERIALIZED_NAME_CREATED_AT = "CreatedAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "UpdatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_REASON = "Reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private ReturnReason reason;

  public static final String SERIALIZED_NAME_CUSTOMER_COMMENT = "CustomerComment";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_COMMENT)
  private String customerComment;

  public static final String SERIALIZED_NAME_MERCHANT_COMMENT = "MerchantComment";
  @SerializedName(SERIALIZED_NAME_MERCHANT_COMMENT)
  private String merchantComment;

  public static final String SERIALIZED_NAME_REFUND_INCL_VAT = "RefundInclVat";
  @SerializedName(SERIALIZED_NAME_REFUND_INCL_VAT)
  private BigDecimal refundInclVat;

  public static final String SERIALIZED_NAME_REFUND_EXCL_VAT = "RefundExclVat";
  @SerializedName(SERIALIZED_NAME_REFUND_EXCL_VAT)
  private BigDecimal refundExclVat;


  public ChannelReturnResponse channelReturnNo(String channelReturnNo) {
    
    this.channelReturnNo = channelReturnNo;
    return this;
  }

   /**
   * The unique return reference used by the Channel.
   * @return channelReturnNo
  **/
  @ApiModelProperty(required = true, value = "The unique return reference used by the Channel.")

  public String getChannelReturnNo() {
    return channelReturnNo;
  }


  public void setChannelReturnNo(String channelReturnNo) {
    this.channelReturnNo = channelReturnNo;
  }


  public ChannelReturnResponse channelOrderNo(String channelOrderNo) {
    
    this.channelOrderNo = channelOrderNo;
    return this;
  }

   /**
   * The unique order reference used by the Channel.
   * @return channelOrderNo
  **/
  @ApiModelProperty(required = true, value = "The unique order reference used by the Channel.")

  public String getChannelOrderNo() {
    return channelOrderNo;
  }


  public void setChannelOrderNo(String channelOrderNo) {
    this.channelOrderNo = channelOrderNo;
  }


  public ChannelReturnResponse merchantOrderNo(String merchantOrderNo) {
    
    this.merchantOrderNo = merchantOrderNo;
    return this;
  }

   /**
   * The unique order reference used by the Merchant (sku).
   * @return merchantOrderNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique order reference used by the Merchant (sku).")

  public String getMerchantOrderNo() {
    return merchantOrderNo;
  }


  public void setMerchantOrderNo(String merchantOrderNo) {
    this.merchantOrderNo = merchantOrderNo;
  }


  public ChannelReturnResponse lines(List<ChannelReturnLineResponse> lines) {
    
    this.lines = lines;
    return this;
  }

  public ChannelReturnResponse addLinesItem(ChannelReturnLineResponse linesItem) {
    this.lines.add(linesItem);
    return this;
  }

   /**
   * Get lines
   * @return lines
  **/
  @ApiModelProperty(required = true, value = "")

  public List<ChannelReturnLineResponse> getLines() {
    return lines;
  }


  public void setLines(List<ChannelReturnLineResponse> lines) {
    this.lines = lines;
  }


  public ChannelReturnResponse createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date at which the return was created in ChannelEngine.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date at which the return was created in ChannelEngine.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public ChannelReturnResponse updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The date at which the return was last modified in ChannelEngine.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date at which the return was last modified in ChannelEngine.")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public ChannelReturnResponse id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique return reference used by ChannelEngine.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique return reference used by ChannelEngine.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public ChannelReturnResponse reason(ReturnReason reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReturnReason getReason() {
    return reason;
  }


  public void setReason(ReturnReason reason) {
    this.reason = reason;
  }


  public ChannelReturnResponse customerComment(String customerComment) {
    
    this.customerComment = customerComment;
    return this;
  }

   /**
   * Optional. Comment of customer on the (reason of) the return.
   * @return customerComment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional. Comment of customer on the (reason of) the return.")

  public String getCustomerComment() {
    return customerComment;
  }


  public void setCustomerComment(String customerComment) {
    this.customerComment = customerComment;
  }


  public ChannelReturnResponse merchantComment(String merchantComment) {
    
    this.merchantComment = merchantComment;
    return this;
  }

   /**
   * Optional. Comment of merchant on the return.
   * @return merchantComment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional. Comment of merchant on the return.")

  public String getMerchantComment() {
    return merchantComment;
  }


  public void setMerchantComment(String merchantComment) {
    this.merchantComment = merchantComment;
  }


  public ChannelReturnResponse refundInclVat(BigDecimal refundInclVat) {
    
    this.refundInclVat = refundInclVat;
    return this;
  }

   /**
   * Refund amount incl. VAT.
   * @return refundInclVat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Refund amount incl. VAT.")

  public BigDecimal getRefundInclVat() {
    return refundInclVat;
  }


  public void setRefundInclVat(BigDecimal refundInclVat) {
    this.refundInclVat = refundInclVat;
  }


  public ChannelReturnResponse refundExclVat(BigDecimal refundExclVat) {
    
    this.refundExclVat = refundExclVat;
    return this;
  }

   /**
   * Refund amount excl. VAT.
   * @return refundExclVat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Refund amount excl. VAT.")

  public BigDecimal getRefundExclVat() {
    return refundExclVat;
  }


  public void setRefundExclVat(BigDecimal refundExclVat) {
    this.refundExclVat = refundExclVat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelReturnResponse channelReturnResponse = (ChannelReturnResponse) o;
    return Objects.equals(this.channelReturnNo, channelReturnResponse.channelReturnNo) &&
        Objects.equals(this.channelOrderNo, channelReturnResponse.channelOrderNo) &&
        Objects.equals(this.merchantOrderNo, channelReturnResponse.merchantOrderNo) &&
        Objects.equals(this.lines, channelReturnResponse.lines) &&
        Objects.equals(this.createdAt, channelReturnResponse.createdAt) &&
        Objects.equals(this.updatedAt, channelReturnResponse.updatedAt) &&
        Objects.equals(this.id, channelReturnResponse.id) &&
        Objects.equals(this.reason, channelReturnResponse.reason) &&
        Objects.equals(this.customerComment, channelReturnResponse.customerComment) &&
        Objects.equals(this.merchantComment, channelReturnResponse.merchantComment) &&
        Objects.equals(this.refundInclVat, channelReturnResponse.refundInclVat) &&
        Objects.equals(this.refundExclVat, channelReturnResponse.refundExclVat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelReturnNo, channelOrderNo, merchantOrderNo, lines, createdAt, updatedAt, id, reason, customerComment, merchantComment, refundInclVat, refundExclVat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelReturnResponse {\n");
    sb.append("    channelReturnNo: ").append(toIndentedString(channelReturnNo)).append("\n");
    sb.append("    channelOrderNo: ").append(toIndentedString(channelOrderNo)).append("\n");
    sb.append("    merchantOrderNo: ").append(toIndentedString(merchantOrderNo)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    customerComment: ").append(toIndentedString(customerComment)).append("\n");
    sb.append("    merchantComment: ").append(toIndentedString(merchantComment)).append("\n");
    sb.append("    refundInclVat: ").append(toIndentedString(refundInclVat)).append("\n");
    sb.append("    refundExclVat: ").append(toIndentedString(refundExclVat)).append("\n");
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

