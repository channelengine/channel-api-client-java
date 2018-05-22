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
import com.channelengine.channel.apiclient.model.ChannelReturnLineRequest;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ChannelReturnRequest
 */

public class ChannelReturnRequest {
  @SerializedName("ChannelOrderNo")
  private String channelOrderNo = null;

  @SerializedName("ChannelReference")
  private String channelReference = null;

  @SerializedName("Lines")
  private List<ChannelReturnLineRequest> lines = new ArrayList<ChannelReturnLineRequest>();

  @SerializedName("Id")
  private Integer id = null;

  /**
   * Gets or Sets reason
   */
  @JsonAdapter(ReasonEnum.Adapter.class)
  public enum ReasonEnum {
    PRODUCT_DEFECT("PRODUCT_DEFECT"),
    
    PRODUCT_UNSATISFACTORY("PRODUCT_UNSATISFACTORY"),
    
    WRONG_PRODUCT("WRONG_PRODUCT"),
    
    TOO_MANY_PRODUCTS("TOO_MANY_PRODUCTS"),
    
    REFUSED("REFUSED"),
    
    REFUSED_DAMAGED("REFUSED_DAMAGED"),
    
    WRONG_ADDRESS("WRONG_ADDRESS"),
    
    NOT_COLLECTED("NOT_COLLECTED"),
    
    OTHER("OTHER");

    private String value;

    ReasonEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReasonEnum fromValue(String text) {
      for (ReasonEnum b : ReasonEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ReasonEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReasonEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReasonEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ReasonEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Reason")
  private ReasonEnum reason = null;

  @SerializedName("CustomerComment")
  private String customerComment = null;

  @SerializedName("MerchantComment")
  private String merchantComment = null;

  @SerializedName("RefundInclVat")
  private Double refundInclVat = null;

  @SerializedName("RefundExclVat")
  private Double refundExclVat = null;

  public ChannelReturnRequest channelOrderNo(String channelOrderNo) {
    this.channelOrderNo = channelOrderNo;
    return this;
  }

   /**
   * Get channelOrderNo
   * @return channelOrderNo
  **/
  @ApiModelProperty(required = true, value = "")
  public String getChannelOrderNo() {
    return channelOrderNo;
  }

  public void setChannelOrderNo(String channelOrderNo) {
    this.channelOrderNo = channelOrderNo;
  }

  public ChannelReturnRequest channelReference(String channelReference) {
    this.channelReference = channelReference;
    return this;
  }

   /**
   * Get channelReference
   * @return channelReference
  **/
  @ApiModelProperty(required = true, value = "")
  public String getChannelReference() {
    return channelReference;
  }

  public void setChannelReference(String channelReference) {
    this.channelReference = channelReference;
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
  @ApiModelProperty(required = true, value = "")
  public List<ChannelReturnLineRequest> getLines() {
    return lines;
  }

  public void setLines(List<ChannelReturnLineRequest> lines) {
    this.lines = lines;
  }

  public ChannelReturnRequest id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ChannelReturnRequest reason(ReasonEnum reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @ApiModelProperty(value = "")
  public ReasonEnum getReason() {
    return reason;
  }

  public void setReason(ReasonEnum reason) {
    this.reason = reason;
  }

  public ChannelReturnRequest customerComment(String customerComment) {
    this.customerComment = customerComment;
    return this;
  }

   /**
   * Get customerComment
   * @return customerComment
  **/
  @ApiModelProperty(value = "")
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
   * Get merchantComment
   * @return merchantComment
  **/
  @ApiModelProperty(value = "")
  public String getMerchantComment() {
    return merchantComment;
  }

  public void setMerchantComment(String merchantComment) {
    this.merchantComment = merchantComment;
  }

  public ChannelReturnRequest refundInclVat(Double refundInclVat) {
    this.refundInclVat = refundInclVat;
    return this;
  }

   /**
   * Get refundInclVat
   * @return refundInclVat
  **/
  @ApiModelProperty(value = "")
  public Double getRefundInclVat() {
    return refundInclVat;
  }

  public void setRefundInclVat(Double refundInclVat) {
    this.refundInclVat = refundInclVat;
  }

  public ChannelReturnRequest refundExclVat(Double refundExclVat) {
    this.refundExclVat = refundExclVat;
    return this;
  }

   /**
   * Get refundExclVat
   * @return refundExclVat
  **/
  @ApiModelProperty(value = "")
  public Double getRefundExclVat() {
    return refundExclVat;
  }

  public void setRefundExclVat(Double refundExclVat) {
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
    ChannelReturnRequest channelReturnRequest = (ChannelReturnRequest) o;
    return Objects.equals(this.channelOrderNo, channelReturnRequest.channelOrderNo) &&
        Objects.equals(this.channelReference, channelReturnRequest.channelReference) &&
        Objects.equals(this.lines, channelReturnRequest.lines) &&
        Objects.equals(this.id, channelReturnRequest.id) &&
        Objects.equals(this.reason, channelReturnRequest.reason) &&
        Objects.equals(this.customerComment, channelReturnRequest.customerComment) &&
        Objects.equals(this.merchantComment, channelReturnRequest.merchantComment) &&
        Objects.equals(this.refundInclVat, channelReturnRequest.refundInclVat) &&
        Objects.equals(this.refundExclVat, channelReturnRequest.refundExclVat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelOrderNo, channelReference, lines, id, reason, customerComment, merchantComment, refundInclVat, refundExclVat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelReturnRequest {\n");
    
    sb.append("    channelOrderNo: ").append(toIndentedString(channelOrderNo)).append("\n");
    sb.append("    channelReference: ").append(toIndentedString(channelReference)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
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

