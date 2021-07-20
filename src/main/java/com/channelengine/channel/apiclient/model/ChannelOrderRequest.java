/*
 * ChannelEngine Channel API
 * ChannelEngine API for channels
 *
 * The version of the OpenAPI document: 2.9.8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.channelengine.channel.apiclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.channelengine.channel.apiclient.model.ChannelAddressRequest;
import com.channelengine.channel.apiclient.model.ChannelOrderLineRequest;
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
import org.threeten.bp.OffsetDateTime;

/**
 * ChannelOrderRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ChannelOrderRequest {
  public static final String SERIALIZED_NAME_BILLING_ADDRESS = "BillingAddress";
  @SerializedName(SERIALIZED_NAME_BILLING_ADDRESS)
  private ChannelAddressRequest billingAddress;

  public static final String SERIALIZED_NAME_SHIPPING_ADDRESS = "ShippingAddress";
  @SerializedName(SERIALIZED_NAME_SHIPPING_ADDRESS)
  private ChannelAddressRequest shippingAddress;

  public static final String SERIALIZED_NAME_CHANNEL_ORDER_NO = "ChannelOrderNo";
  @SerializedName(SERIALIZED_NAME_CHANNEL_ORDER_NO)
  private String channelOrderNo;

  public static final String SERIALIZED_NAME_IS_BUSINESS_ORDER = "IsBusinessOrder";
  @SerializedName(SERIALIZED_NAME_IS_BUSINESS_ORDER)
  private Boolean isBusinessOrder;

  public static final String SERIALIZED_NAME_KEY_IS_MERCHANT_PRODUCT_NO = "KeyIsMerchantProductNo";
  @SerializedName(SERIALIZED_NAME_KEY_IS_MERCHANT_PRODUCT_NO)
  private Boolean keyIsMerchantProductNo;

  public static final String SERIALIZED_NAME_LINES = "Lines";
  @SerializedName(SERIALIZED_NAME_LINES)
  private List<ChannelOrderLineRequest> lines = new ArrayList<ChannelOrderLineRequest>();

  public static final String SERIALIZED_NAME_PHONE = "Phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_EMAIL = "Email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_COMPANY_REGISTRATION_NO = "CompanyRegistrationNo";
  @SerializedName(SERIALIZED_NAME_COMPANY_REGISTRATION_NO)
  private String companyRegistrationNo;

  public static final String SERIALIZED_NAME_VAT_NO = "VatNo";
  @SerializedName(SERIALIZED_NAME_VAT_NO)
  private String vatNo;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "PaymentMethod";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private String paymentMethod;

  public static final String SERIALIZED_NAME_PAYMENT_REFERENCE_NO = "PaymentReferenceNo";
  @SerializedName(SERIALIZED_NAME_PAYMENT_REFERENCE_NO)
  private String paymentReferenceNo;

  public static final String SERIALIZED_NAME_SHIPPING_COSTS_INCL_VAT = "ShippingCostsInclVat";
  @SerializedName(SERIALIZED_NAME_SHIPPING_COSTS_INCL_VAT)
  private BigDecimal shippingCostsInclVat;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "CurrencyCode";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_ORDER_DATE = "OrderDate";
  @SerializedName(SERIALIZED_NAME_ORDER_DATE)
  private OffsetDateTime orderDate;

  public static final String SERIALIZED_NAME_CHANNEL_CUSTOMER_NO = "ChannelCustomerNo";
  @SerializedName(SERIALIZED_NAME_CHANNEL_CUSTOMER_NO)
  private String channelCustomerNo;

  public static final String SERIALIZED_NAME_EXTRA_DATA = "ExtraData";
  @SerializedName(SERIALIZED_NAME_EXTRA_DATA)
  private Map<String, String> extraData = null;


  public ChannelOrderRequest billingAddress(ChannelAddressRequest billingAddress) {
    
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * Get billingAddress
   * @return billingAddress
  **/
  @ApiModelProperty(required = true, value = "")

  public ChannelAddressRequest getBillingAddress() {
    return billingAddress;
  }


  public void setBillingAddress(ChannelAddressRequest billingAddress) {
    this.billingAddress = billingAddress;
  }


  public ChannelOrderRequest shippingAddress(ChannelAddressRequest shippingAddress) {
    
    this.shippingAddress = shippingAddress;
    return this;
  }

   /**
   * Get shippingAddress
   * @return shippingAddress
  **/
  @ApiModelProperty(required = true, value = "")

  public ChannelAddressRequest getShippingAddress() {
    return shippingAddress;
  }


  public void setShippingAddress(ChannelAddressRequest shippingAddress) {
    this.shippingAddress = shippingAddress;
  }


  public ChannelOrderRequest channelOrderNo(String channelOrderNo) {
    
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


  public ChannelOrderRequest isBusinessOrder(Boolean isBusinessOrder) {
    
    this.isBusinessOrder = isBusinessOrder;
    return this;
  }

   /**
   * Optional. Is a business order (default value is false).  If not provided the VAT Number will be checked. If a VAT Number is found, IsBusinessOrder will be set to true.  No VAT will be calculated when set to true.
   * @return isBusinessOrder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional. Is a business order (default value is false).  If not provided the VAT Number will be checked. If a VAT Number is found, IsBusinessOrder will be set to true.  No VAT will be calculated when set to true.")

  public Boolean getIsBusinessOrder() {
    return isBusinessOrder;
  }


  public void setIsBusinessOrder(Boolean isBusinessOrder) {
    this.isBusinessOrder = isBusinessOrder;
  }


  public ChannelOrderRequest keyIsMerchantProductNo(Boolean keyIsMerchantProductNo) {
    
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


  public ChannelOrderRequest lines(List<ChannelOrderLineRequest> lines) {
    
    this.lines = lines;
    return this;
  }

  public ChannelOrderRequest addLinesItem(ChannelOrderLineRequest linesItem) {
    this.lines.add(linesItem);
    return this;
  }

   /**
   * The order lines.
   * @return lines
  **/
  @ApiModelProperty(required = true, value = "The order lines.")

  public List<ChannelOrderLineRequest> getLines() {
    return lines;
  }


  public void setLines(List<ChannelOrderLineRequest> lines) {
    this.lines = lines;
  }


  public ChannelOrderRequest phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * The customer&#39;s telephone number.
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The customer's telephone number.")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  public ChannelOrderRequest email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * The customer&#39;s email.
   * @return email
  **/
  @ApiModelProperty(required = true, value = "The customer's email.")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public ChannelOrderRequest companyRegistrationNo(String companyRegistrationNo) {
    
    this.companyRegistrationNo = companyRegistrationNo;
    return this;
  }

   /**
   * Optional. A company&#39;s chamber of commerce number.
   * @return companyRegistrationNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional. A company's chamber of commerce number.")

  public String getCompanyRegistrationNo() {
    return companyRegistrationNo;
  }


  public void setCompanyRegistrationNo(String companyRegistrationNo) {
    this.companyRegistrationNo = companyRegistrationNo;
  }


  public ChannelOrderRequest vatNo(String vatNo) {
    
    this.vatNo = vatNo;
    return this;
  }

   /**
   * Optional. A company&#39;s VAT number.
   * @return vatNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional. A company's VAT number.")

  public String getVatNo() {
    return vatNo;
  }


  public void setVatNo(String vatNo) {
    this.vatNo = vatNo;
  }


  public ChannelOrderRequest paymentMethod(String paymentMethod) {
    
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * The payment method used on the order.
   * @return paymentMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The payment method used on the order.")

  public String getPaymentMethod() {
    return paymentMethod;
  }


  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  public ChannelOrderRequest paymentReferenceNo(String paymentReferenceNo) {
    
    this.paymentReferenceNo = paymentReferenceNo;
    return this;
  }

   /**
   * Reference or transaction id for the payment
   * @return paymentReferenceNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reference or transaction id for the payment")

  public String getPaymentReferenceNo() {
    return paymentReferenceNo;
  }


  public void setPaymentReferenceNo(String paymentReferenceNo) {
    this.paymentReferenceNo = paymentReferenceNo;
  }


  public ChannelOrderRequest shippingCostsInclVat(BigDecimal shippingCostsInclVat) {
    
    this.shippingCostsInclVat = shippingCostsInclVat;
    return this;
  }

   /**
   * The shipping fee including VAT  (in the shop&#39;s base currency calculated using the exchange rate at the time of ordering).
   * @return shippingCostsInclVat
  **/
  @ApiModelProperty(required = true, value = "The shipping fee including VAT  (in the shop's base currency calculated using the exchange rate at the time of ordering).")

  public BigDecimal getShippingCostsInclVat() {
    return shippingCostsInclVat;
  }


  public void setShippingCostsInclVat(BigDecimal shippingCostsInclVat) {
    this.shippingCostsInclVat = shippingCostsInclVat;
  }


  public ChannelOrderRequest currencyCode(String currencyCode) {
    
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * The currency code for the amounts of the order.
   * @return currencyCode
  **/
  @ApiModelProperty(required = true, value = "The currency code for the amounts of the order.")

  public String getCurrencyCode() {
    return currencyCode;
  }


  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public ChannelOrderRequest orderDate(OffsetDateTime orderDate) {
    
    this.orderDate = orderDate;
    return this;
  }

   /**
   * The date the order was created at the channel.
   * @return orderDate
  **/
  @ApiModelProperty(required = true, value = "The date the order was created at the channel.")

  public OffsetDateTime getOrderDate() {
    return orderDate;
  }


  public void setOrderDate(OffsetDateTime orderDate) {
    this.orderDate = orderDate;
  }


  public ChannelOrderRequest channelCustomerNo(String channelCustomerNo) {
    
    this.channelCustomerNo = channelCustomerNo;
    return this;
  }

   /**
   * The unique customer reference used by the channel.
   * @return channelCustomerNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique customer reference used by the channel.")

  public String getChannelCustomerNo() {
    return channelCustomerNo;
  }


  public void setChannelCustomerNo(String channelCustomerNo) {
    this.channelCustomerNo = channelCustomerNo;
  }


  public ChannelOrderRequest extraData(Map<String, String> extraData) {
    
    this.extraData = extraData;
    return this;
  }

  public ChannelOrderRequest putExtraDataItem(String key, String extraDataItem) {
    if (this.extraData == null) {
      this.extraData = new HashMap<String, String>();
    }
    this.extraData.put(key, extraDataItem);
    return this;
  }

   /**
   * Extra data on the order.
   * @return extraData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Extra data on the order.")

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
    ChannelOrderRequest channelOrderRequest = (ChannelOrderRequest) o;
    return Objects.equals(this.billingAddress, channelOrderRequest.billingAddress) &&
        Objects.equals(this.shippingAddress, channelOrderRequest.shippingAddress) &&
        Objects.equals(this.channelOrderNo, channelOrderRequest.channelOrderNo) &&
        Objects.equals(this.isBusinessOrder, channelOrderRequest.isBusinessOrder) &&
        Objects.equals(this.keyIsMerchantProductNo, channelOrderRequest.keyIsMerchantProductNo) &&
        Objects.equals(this.lines, channelOrderRequest.lines) &&
        Objects.equals(this.phone, channelOrderRequest.phone) &&
        Objects.equals(this.email, channelOrderRequest.email) &&
        Objects.equals(this.companyRegistrationNo, channelOrderRequest.companyRegistrationNo) &&
        Objects.equals(this.vatNo, channelOrderRequest.vatNo) &&
        Objects.equals(this.paymentMethod, channelOrderRequest.paymentMethod) &&
        Objects.equals(this.paymentReferenceNo, channelOrderRequest.paymentReferenceNo) &&
        Objects.equals(this.shippingCostsInclVat, channelOrderRequest.shippingCostsInclVat) &&
        Objects.equals(this.currencyCode, channelOrderRequest.currencyCode) &&
        Objects.equals(this.orderDate, channelOrderRequest.orderDate) &&
        Objects.equals(this.channelCustomerNo, channelOrderRequest.channelCustomerNo) &&
        Objects.equals(this.extraData, channelOrderRequest.extraData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingAddress, shippingAddress, channelOrderNo, isBusinessOrder, keyIsMerchantProductNo, lines, phone, email, companyRegistrationNo, vatNo, paymentMethod, paymentReferenceNo, shippingCostsInclVat, currencyCode, orderDate, channelCustomerNo, extraData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelOrderRequest {\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    channelOrderNo: ").append(toIndentedString(channelOrderNo)).append("\n");
    sb.append("    isBusinessOrder: ").append(toIndentedString(isBusinessOrder)).append("\n");
    sb.append("    keyIsMerchantProductNo: ").append(toIndentedString(keyIsMerchantProductNo)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    companyRegistrationNo: ").append(toIndentedString(companyRegistrationNo)).append("\n");
    sb.append("    vatNo: ").append(toIndentedString(vatNo)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    paymentReferenceNo: ").append(toIndentedString(paymentReferenceNo)).append("\n");
    sb.append("    shippingCostsInclVat: ").append(toIndentedString(shippingCostsInclVat)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    orderDate: ").append(toIndentedString(orderDate)).append("\n");
    sb.append("    channelCustomerNo: ").append(toIndentedString(channelCustomerNo)).append("\n");
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

