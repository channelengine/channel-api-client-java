/*
 * ChannelEngine Channel API
 * ChannelEngine API for channels
 *
 * The version of the OpenAPI document: 2.11.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.channelengine.channel.apiclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.channelengine.channel.apiclient.model.ChannelReturnLineRequest;
import com.channelengine.channel.apiclient.model.ChannelReturnStatus;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import org.threeten.bp.OffsetDateTime;

/**
 * ChannelReturnRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ChannelReturnRequest {
  public static final String SERIALIZED_NAME_CHANNEL_ORDER_NO = "ChannelOrderNo";
  @SerializedName(SERIALIZED_NAME_CHANNEL_ORDER_NO)
  private String channelOrderNo;

  public static final String SERIALIZED_NAME_MERCHANT_ORDER_NO = "MerchantOrderNo";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ORDER_NO)
  private String merchantOrderNo;

  public static final String SERIALIZED_NAME_CHANNEL_REFERENCE = "ChannelReference";
  @SerializedName(SERIALIZED_NAME_CHANNEL_REFERENCE)
  private String channelReference;

  public static final String SERIALIZED_NAME_KEY_IS_MERCHANT_ORDER_NO = "KeyIsMerchantOrderNo";
  @SerializedName(SERIALIZED_NAME_KEY_IS_MERCHANT_ORDER_NO)
  private Boolean keyIsMerchantOrderNo;

  public static final String SERIALIZED_NAME_KEY_IS_MERCHANT_PRODUCT_NO = "KeyIsMerchantProductNo";
  @SerializedName(SERIALIZED_NAME_KEY_IS_MERCHANT_PRODUCT_NO)
  private Boolean keyIsMerchantProductNo;

  public static final String SERIALIZED_NAME_LINES = "Lines";
  @SerializedName(SERIALIZED_NAME_LINES)
  private List<ChannelReturnLineRequest> lines = new ArrayList<ChannelReturnLineRequest>();

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ChannelReturnStatus status;

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

  public static final String SERIALIZED_NAME_RETURN_DATE = "ReturnDate";
  @SerializedName(SERIALIZED_NAME_RETURN_DATE)
  private OffsetDateTime returnDate;

  public static final String SERIALIZED_NAME_EXTRA_DATA = "ExtraData";
  @SerializedName(SERIALIZED_NAME_EXTRA_DATA)
  private Map<String, String> extraData = null;


  public ChannelReturnRequest channelOrderNo(String channelOrderNo) {
    
    this.channelOrderNo = channelOrderNo;
    return this;
  }

   /**
   * The unique order reference used by the Channel.
   * @return channelOrderNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique order reference used by the Channel.")

  public String getChannelOrderNo() {
    return channelOrderNo;
  }


  public void setChannelOrderNo(String channelOrderNo) {
    this.channelOrderNo = channelOrderNo;
  }


  public ChannelReturnRequest merchantOrderNo(String merchantOrderNo) {
    
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


  public ChannelReturnRequest channelReference(String channelReference) {
    
    this.channelReference = channelReference;
    return this;
  }

   /**
   * The unique return reference used by the Channel.
   * @return channelReference
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The unique return reference used by the Channel.")

  public String getChannelReference() {
    return channelReference;
  }


  public void setChannelReference(String channelReference) {
    this.channelReference = channelReference;
  }


  public ChannelReturnRequest keyIsMerchantOrderNo(Boolean keyIsMerchantOrderNo) {
    
    this.keyIsMerchantOrderNo = keyIsMerchantOrderNo;
    return this;
  }

   /**
   * Optional. Is the MON used as key for the order (default value is false).
   * @return keyIsMerchantOrderNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional. Is the MON used as key for the order (default value is false).")

  public Boolean getKeyIsMerchantOrderNo() {
    return keyIsMerchantOrderNo;
  }


  public void setKeyIsMerchantOrderNo(Boolean keyIsMerchantOrderNo) {
    this.keyIsMerchantOrderNo = keyIsMerchantOrderNo;
  }


  public ChannelReturnRequest keyIsMerchantProductNo(Boolean keyIsMerchantProductNo) {
    
    this.keyIsMerchantProductNo = keyIsMerchantProductNo;
    return this;
  }

   /**
   * Optional. Is the MPN used as key for the product (default value is false).
   * @return keyIsMerchantProductNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional. Is the MPN used as key for the product (default value is false).")

  public Boolean getKeyIsMerchantProductNo() {
    return keyIsMerchantProductNo;
  }


  public void setKeyIsMerchantProductNo(Boolean keyIsMerchantProductNo) {
    this.keyIsMerchantProductNo = keyIsMerchantProductNo;
  }


  public ChannelReturnRequest lines(List<ChannelReturnLineRequest> lines) {
    
    this.lines = lines;
    return this;
  }

  public ChannelReturnRequest addLinesItem(ChannelReturnLineRequest linesItem) {
    this.lines.add(linesItem);
    return this;
  }

   /**
   * Get lines
   * @return lines
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<ChannelReturnLineRequest> getLines() {
    return lines;
  }


  public void setLines(List<ChannelReturnLineRequest> lines) {
    this.lines = lines;
  }


  public ChannelReturnRequest status(ChannelReturnStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ChannelReturnStatus getStatus() {
    return status;
  }


  public void setStatus(ChannelReturnStatus status) {
    this.status = status;
  }


  public ChannelReturnRequest id(Integer id) {
    
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


  public ChannelReturnRequest reason(ReturnReason reason) {
    
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


  public ChannelReturnRequest customerComment(String customerComment) {
    
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


  public ChannelReturnRequest merchantComment(String merchantComment) {
    
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


  public ChannelReturnRequest refundInclVat(BigDecimal refundInclVat) {
    
    this.refundInclVat = refundInclVat;
    return this;
  }

   /**
   * Refund amount incl. VAT.
   * minimum: 0
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


  public ChannelReturnRequest refundExclVat(BigDecimal refundExclVat) {
    
    this.refundExclVat = refundExclVat;
    return this;
  }

   /**
   * Refund amount excl. VAT.
   * minimum: 0
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


  public ChannelReturnRequest returnDate(OffsetDateTime returnDate) {
    
    this.returnDate = returnDate;
    return this;
  }

   /**
   * The date at which the return was originally created in the source system (if available).
   * @return returnDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date at which the return was originally created in the source system (if available).")

  public OffsetDateTime getReturnDate() {
    return returnDate;
  }


  public void setReturnDate(OffsetDateTime returnDate) {
    this.returnDate = returnDate;
  }


  public ChannelReturnRequest extraData(Map<String, String> extraData) {
    
    this.extraData = extraData;
    return this;
  }

  public ChannelReturnRequest putExtraDataItem(String key, String extraDataItem) {
    if (this.extraData == null) {
      this.extraData = new HashMap<String, String>();
    }
    this.extraData.put(key, extraDataItem);
    return this;
  }

   /**
   * Extra data on the return. Each item must have an unqiue key
   * @return extraData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Extra data on the return. Each item must have an unqiue key")

  public Map<String, String> getExtraData() {
    return extraData;
  }


  public void setExtraData(Map<String, String> extraData) {
    this.extraData = extraData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelReturnRequest channelReturnRequest = (ChannelReturnRequest) o;
    return Objects.equals(this.channelOrderNo, channelReturnRequest.channelOrderNo) &&
        Objects.equals(this.merchantOrderNo, channelReturnRequest.merchantOrderNo) &&
        Objects.equals(this.channelReference, channelReturnRequest.channelReference) &&
        Objects.equals(this.keyIsMerchantOrderNo, channelReturnRequest.keyIsMerchantOrderNo) &&
        Objects.equals(this.keyIsMerchantProductNo, channelReturnRequest.keyIsMerchantProductNo) &&
        Objects.equals(this.lines, channelReturnRequest.lines) &&
        Objects.equals(this.status, channelReturnRequest.status) &&
        Objects.equals(this.id, channelReturnRequest.id) &&
        Objects.equals(this.reason, channelReturnRequest.reason) &&
        Objects.equals(this.customerComment, channelReturnRequest.customerComment) &&
        Objects.equals(this.merchantComment, channelReturnRequest.merchantComment) &&
        Objects.equals(this.refundInclVat, channelReturnRequest.refundInclVat) &&
        Objects.equals(this.refundExclVat, channelReturnRequest.refundExclVat) &&
        Objects.equals(this.returnDate, channelReturnRequest.returnDate) &&
        Objects.equals(this.extraData, channelReturnRequest.extraData);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelOrderNo, merchantOrderNo, channelReference, keyIsMerchantOrderNo, keyIsMerchantProductNo, lines, status, id, reason, customerComment, merchantComment, refundInclVat, refundExclVat, returnDate, extraData);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelReturnRequest {\n");
    sb.append("    channelOrderNo: ").append(toIndentedString(channelOrderNo)).append("\n");
    sb.append("    merchantOrderNo: ").append(toIndentedString(merchantOrderNo)).append("\n");
    sb.append("    channelReference: ").append(toIndentedString(channelReference)).append("\n");
    sb.append("    keyIsMerchantOrderNo: ").append(toIndentedString(keyIsMerchantOrderNo)).append("\n");
    sb.append("    keyIsMerchantProductNo: ").append(toIndentedString(keyIsMerchantProductNo)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    customerComment: ").append(toIndentedString(customerComment)).append("\n");
    sb.append("    merchantComment: ").append(toIndentedString(merchantComment)).append("\n");
    sb.append("    refundInclVat: ").append(toIndentedString(refundInclVat)).append("\n");
    sb.append("    refundExclVat: ").append(toIndentedString(refundExclVat)).append("\n");
    sb.append("    returnDate: ").append(toIndentedString(returnDate)).append("\n");
    sb.append("    extraData: ").append(toIndentedString(extraData)).append("\n");
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

