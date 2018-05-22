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
import com.channelengine.channel.apiclient.model.ExtraDataItem;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ChannelProductResponse
 */

public class ChannelProductResponse {
  @SerializedName("Id")
  private Integer id = null;

  @SerializedName("ParentChannelProductNo")
  private String parentChannelProductNo = null;

  @SerializedName("MappedFields")
  private Map<String, String> mappedFields = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Brand")
  private String brand = null;

  @SerializedName("Size")
  private String size = null;

  @SerializedName("Color")
  private String color = null;

  @SerializedName("Ean")
  private String ean = null;

  @SerializedName("ManufacturerProductNumber")
  private String manufacturerProductNumber = null;

  @SerializedName("Stock")
  private Integer stock = null;

  @SerializedName("Price")
  private Double price = null;

  @SerializedName("MSRP")
  private Double MSRP = null;

  @SerializedName("PurchasePrice")
  private Double purchasePrice = null;

  /**
   * The type of VAT which applies to this product.  See: http://ec.europa.eu/taxation_customs/taxation/vat/topics/rates_en.htm
   */
  @JsonAdapter(VatRateTypeEnum.Adapter.class)
  public enum VatRateTypeEnum {
    STANDARD("STANDARD"),
    
    REDUCED("REDUCED"),
    
    SUPER_REDUCED("SUPER_REDUCED");

    private String value;

    VatRateTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VatRateTypeEnum fromValue(String text) {
      for (VatRateTypeEnum b : VatRateTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<VatRateTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VatRateTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VatRateTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return VatRateTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("VatRateType")
  private VatRateTypeEnum vatRateType = null;

  @SerializedName("ShippingCost")
  private Double shippingCost = null;

  @SerializedName("ShippingTime")
  private String shippingTime = null;

  @SerializedName("Url")
  private String url = null;

  @SerializedName("ImageUrl")
  private String imageUrl = null;

  @SerializedName("ExtraImageUrl1")
  private String extraImageUrl1 = null;

  @SerializedName("ExtraImageUrl2")
  private String extraImageUrl2 = null;

  @SerializedName("ExtraImageUrl3")
  private String extraImageUrl3 = null;

  @SerializedName("ExtraImageUrl4")
  private String extraImageUrl4 = null;

  @SerializedName("ExtraImageUrl5")
  private String extraImageUrl5 = null;

  @SerializedName("ExtraImageUrl6")
  private String extraImageUrl6 = null;

  @SerializedName("ExtraImageUrl7")
  private String extraImageUrl7 = null;

  @SerializedName("ExtraImageUrl8")
  private String extraImageUrl8 = null;

  @SerializedName("ExtraImageUrl9")
  private String extraImageUrl9 = null;

  @SerializedName("CategoryTrail")
  private String categoryTrail = null;

  @SerializedName("ExtraData")
  private List<ExtraDataItem> extraData = null;

  public ChannelProductResponse id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * An unique identifier which ChannelEngine uses to identify the product.  Needed in the call &#39;POST /v2/products/data&#39;
   * @return id
  **/
  @ApiModelProperty(value = "An unique identifier which ChannelEngine uses to identify the product.  Needed in the call 'POST /v2/products/data'")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ChannelProductResponse parentChannelProductNo(String parentChannelProductNo) {
    this.parentChannelProductNo = parentChannelProductNo;
    return this;
  }

   /**
   * Get parentChannelProductNo
   * @return parentChannelProductNo
  **/
  @ApiModelProperty(value = "")
  public String getParentChannelProductNo() {
    return parentChannelProductNo;
  }

  public void setParentChannelProductNo(String parentChannelProductNo) {
    this.parentChannelProductNo = parentChannelProductNo;
  }

  public ChannelProductResponse mappedFields(Map<String, String> mappedFields) {
    this.mappedFields = mappedFields;
    return this;
  }

  public ChannelProductResponse putMappedFieldsItem(String key, String mappedFieldsItem) {
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
  @ApiModelProperty(value = "A channel can require certain fields to be available. The channel  can provide ChannelEngine with this fields after which the merchants  will be able to fill in this field using custom conditions in ChannelEngine.")
  public Map<String, String> getMappedFields() {
    return mappedFields;
  }

  public void setMappedFields(Map<String, String> mappedFields) {
    this.mappedFields = mappedFields;
  }

  public ChannelProductResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ChannelProductResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ChannelProductResponse brand(String brand) {
    this.brand = brand;
    return this;
  }

   /**
   * Get brand
   * @return brand
  **/
  @ApiModelProperty(value = "")
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public ChannelProductResponse size(String size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(value = "")
  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public ChannelProductResponse color(String color) {
    this.color = color;
    return this;
  }

   /**
   * Get color
   * @return color
  **/
  @ApiModelProperty(value = "")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public ChannelProductResponse ean(String ean) {
    this.ean = ean;
    return this;
  }

   /**
   * Get ean
   * @return ean
  **/
  @ApiModelProperty(value = "")
  public String getEan() {
    return ean;
  }

  public void setEan(String ean) {
    this.ean = ean;
  }

  public ChannelProductResponse manufacturerProductNumber(String manufacturerProductNumber) {
    this.manufacturerProductNumber = manufacturerProductNumber;
    return this;
  }

   /**
   * Get manufacturerProductNumber
   * @return manufacturerProductNumber
  **/
  @ApiModelProperty(value = "")
  public String getManufacturerProductNumber() {
    return manufacturerProductNumber;
  }

  public void setManufacturerProductNumber(String manufacturerProductNumber) {
    this.manufacturerProductNumber = manufacturerProductNumber;
  }

  public ChannelProductResponse stock(Integer stock) {
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

  public ChannelProductResponse price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * Price, including VAT.
   * @return price
  **/
  @ApiModelProperty(value = "Price, including VAT.")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public ChannelProductResponse MSRP(Double MSRP) {
    this.MSRP = MSRP;
    return this;
  }

   /**
   * Manufacturer&#39;s suggested retail price
   * @return MSRP
  **/
  @ApiModelProperty(value = "Manufacturer's suggested retail price")
  public Double getMSRP() {
    return MSRP;
  }

  public void setMSRP(Double MSRP) {
    this.MSRP = MSRP;
  }

  public ChannelProductResponse purchasePrice(Double purchasePrice) {
    this.purchasePrice = purchasePrice;
    return this;
  }

   /**
   * Get purchasePrice
   * @return purchasePrice
  **/
  @ApiModelProperty(value = "")
  public Double getPurchasePrice() {
    return purchasePrice;
  }

  public void setPurchasePrice(Double purchasePrice) {
    this.purchasePrice = purchasePrice;
  }

  public ChannelProductResponse vatRateType(VatRateTypeEnum vatRateType) {
    this.vatRateType = vatRateType;
    return this;
  }

   /**
   * The type of VAT which applies to this product.  See: http://ec.europa.eu/taxation_customs/taxation/vat/topics/rates_en.htm
   * @return vatRateType
  **/
  @ApiModelProperty(value = "The type of VAT which applies to this product.  See: http://ec.europa.eu/taxation_customs/taxation/vat/topics/rates_en.htm")
  public VatRateTypeEnum getVatRateType() {
    return vatRateType;
  }

  public void setVatRateType(VatRateTypeEnum vatRateType) {
    this.vatRateType = vatRateType;
  }

  public ChannelProductResponse shippingCost(Double shippingCost) {
    this.shippingCost = shippingCost;
    return this;
  }

   /**
   * Get shippingCost
   * @return shippingCost
  **/
  @ApiModelProperty(value = "")
  public Double getShippingCost() {
    return shippingCost;
  }

  public void setShippingCost(Double shippingCost) {
    this.shippingCost = shippingCost;
  }

  public ChannelProductResponse shippingTime(String shippingTime) {
    this.shippingTime = shippingTime;
    return this;
  }

   /**
   * A textual representation of the shippingtime.  For example, in Dutch: &#39;Op werkdagen voor 22:00 uur besteld, morgen in huis&#39;
   * @return shippingTime
  **/
  @ApiModelProperty(value = "A textual representation of the shippingtime.  For example, in Dutch: 'Op werkdagen voor 22:00 uur besteld, morgen in huis'")
  public String getShippingTime() {
    return shippingTime;
  }

  public void setShippingTime(String shippingTime) {
    this.shippingTime = shippingTime;
  }

  public ChannelProductResponse url(String url) {
    this.url = url;
    return this;
  }

   /**
   * A URL pointing to the merchant&#39;s webpage  which displays this product.
   * @return url
  **/
  @ApiModelProperty(value = "A URL pointing to the merchant's webpage  which displays this product.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public ChannelProductResponse imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * A URL at which an image of this product  can be found.
   * @return imageUrl
  **/
  @ApiModelProperty(value = "A URL at which an image of this product  can be found.")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public ChannelProductResponse extraImageUrl1(String extraImageUrl1) {
    this.extraImageUrl1 = extraImageUrl1;
    return this;
  }

   /**
   * Get extraImageUrl1
   * @return extraImageUrl1
  **/
  @ApiModelProperty(value = "")
  public String getExtraImageUrl1() {
    return extraImageUrl1;
  }

  public void setExtraImageUrl1(String extraImageUrl1) {
    this.extraImageUrl1 = extraImageUrl1;
  }

  public ChannelProductResponse extraImageUrl2(String extraImageUrl2) {
    this.extraImageUrl2 = extraImageUrl2;
    return this;
  }

   /**
   * Get extraImageUrl2
   * @return extraImageUrl2
  **/
  @ApiModelProperty(value = "")
  public String getExtraImageUrl2() {
    return extraImageUrl2;
  }

  public void setExtraImageUrl2(String extraImageUrl2) {
    this.extraImageUrl2 = extraImageUrl2;
  }

  public ChannelProductResponse extraImageUrl3(String extraImageUrl3) {
    this.extraImageUrl3 = extraImageUrl3;
    return this;
  }

   /**
   * Get extraImageUrl3
   * @return extraImageUrl3
  **/
  @ApiModelProperty(value = "")
  public String getExtraImageUrl3() {
    return extraImageUrl3;
  }

  public void setExtraImageUrl3(String extraImageUrl3) {
    this.extraImageUrl3 = extraImageUrl3;
  }

  public ChannelProductResponse extraImageUrl4(String extraImageUrl4) {
    this.extraImageUrl4 = extraImageUrl4;
    return this;
  }

   /**
   * Get extraImageUrl4
   * @return extraImageUrl4
  **/
  @ApiModelProperty(value = "")
  public String getExtraImageUrl4() {
    return extraImageUrl4;
  }

  public void setExtraImageUrl4(String extraImageUrl4) {
    this.extraImageUrl4 = extraImageUrl4;
  }

  public ChannelProductResponse extraImageUrl5(String extraImageUrl5) {
    this.extraImageUrl5 = extraImageUrl5;
    return this;
  }

   /**
   * Get extraImageUrl5
   * @return extraImageUrl5
  **/
  @ApiModelProperty(value = "")
  public String getExtraImageUrl5() {
    return extraImageUrl5;
  }

  public void setExtraImageUrl5(String extraImageUrl5) {
    this.extraImageUrl5 = extraImageUrl5;
  }

  public ChannelProductResponse extraImageUrl6(String extraImageUrl6) {
    this.extraImageUrl6 = extraImageUrl6;
    return this;
  }

   /**
   * Get extraImageUrl6
   * @return extraImageUrl6
  **/
  @ApiModelProperty(value = "")
  public String getExtraImageUrl6() {
    return extraImageUrl6;
  }

  public void setExtraImageUrl6(String extraImageUrl6) {
    this.extraImageUrl6 = extraImageUrl6;
  }

  public ChannelProductResponse extraImageUrl7(String extraImageUrl7) {
    this.extraImageUrl7 = extraImageUrl7;
    return this;
  }

   /**
   * Get extraImageUrl7
   * @return extraImageUrl7
  **/
  @ApiModelProperty(value = "")
  public String getExtraImageUrl7() {
    return extraImageUrl7;
  }

  public void setExtraImageUrl7(String extraImageUrl7) {
    this.extraImageUrl7 = extraImageUrl7;
  }

  public ChannelProductResponse extraImageUrl8(String extraImageUrl8) {
    this.extraImageUrl8 = extraImageUrl8;
    return this;
  }

   /**
   * Get extraImageUrl8
   * @return extraImageUrl8
  **/
  @ApiModelProperty(value = "")
  public String getExtraImageUrl8() {
    return extraImageUrl8;
  }

  public void setExtraImageUrl8(String extraImageUrl8) {
    this.extraImageUrl8 = extraImageUrl8;
  }

  public ChannelProductResponse extraImageUrl9(String extraImageUrl9) {
    this.extraImageUrl9 = extraImageUrl9;
    return this;
  }

   /**
   * Get extraImageUrl9
   * @return extraImageUrl9
  **/
  @ApiModelProperty(value = "")
  public String getExtraImageUrl9() {
    return extraImageUrl9;
  }

  public void setExtraImageUrl9(String extraImageUrl9) {
    this.extraImageUrl9 = extraImageUrl9;
  }

  public ChannelProductResponse categoryTrail(String categoryTrail) {
    this.categoryTrail = categoryTrail;
    return this;
  }

   /**
   * The category to which this product belongs.  Please supply this field in the following format:  &#39;maincategory &amp;gt; category &amp;gt; subcategory&#39;  For example:  &#39;vehicles &amp;gt; bikes &amp;gt; mountainbike&#39;
   * @return categoryTrail
  **/
  @ApiModelProperty(value = "The category to which this product belongs.  Please supply this field in the following format:  'maincategory &gt; category &gt; subcategory'  For example:  'vehicles &gt; bikes &gt; mountainbike'")
  public String getCategoryTrail() {
    return categoryTrail;
  }

  public void setCategoryTrail(String categoryTrail) {
    this.categoryTrail = categoryTrail;
  }

  public ChannelProductResponse extraData(List<ExtraDataItem> extraData) {
    this.extraData = extraData;
    return this;
  }

  public ChannelProductResponse addExtraDataItem(ExtraDataItem extraDataItem) {
    if (this.extraData == null) {
      this.extraData = new ArrayList<ExtraDataItem>();
    }
    this.extraData.add(extraDataItem);
    return this;
  }

   /**
   * An optional list of key-value pairs containing  extra data about this product. This data can be  sent to channels or used for filtering products.
   * @return extraData
  **/
  @ApiModelProperty(value = "An optional list of key-value pairs containing  extra data about this product. This data can be  sent to channels or used for filtering products.")
  public List<ExtraDataItem> getExtraData() {
    return extraData;
  }

  public void setExtraData(List<ExtraDataItem> extraData) {
    this.extraData = extraData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelProductResponse channelProductResponse = (ChannelProductResponse) o;
    return Objects.equals(this.id, channelProductResponse.id) &&
        Objects.equals(this.parentChannelProductNo, channelProductResponse.parentChannelProductNo) &&
        Objects.equals(this.mappedFields, channelProductResponse.mappedFields) &&
        Objects.equals(this.name, channelProductResponse.name) &&
        Objects.equals(this.description, channelProductResponse.description) &&
        Objects.equals(this.brand, channelProductResponse.brand) &&
        Objects.equals(this.size, channelProductResponse.size) &&
        Objects.equals(this.color, channelProductResponse.color) &&
        Objects.equals(this.ean, channelProductResponse.ean) &&
        Objects.equals(this.manufacturerProductNumber, channelProductResponse.manufacturerProductNumber) &&
        Objects.equals(this.stock, channelProductResponse.stock) &&
        Objects.equals(this.price, channelProductResponse.price) &&
        Objects.equals(this.MSRP, channelProductResponse.MSRP) &&
        Objects.equals(this.purchasePrice, channelProductResponse.purchasePrice) &&
        Objects.equals(this.vatRateType, channelProductResponse.vatRateType) &&
        Objects.equals(this.shippingCost, channelProductResponse.shippingCost) &&
        Objects.equals(this.shippingTime, channelProductResponse.shippingTime) &&
        Objects.equals(this.url, channelProductResponse.url) &&
        Objects.equals(this.imageUrl, channelProductResponse.imageUrl) &&
        Objects.equals(this.extraImageUrl1, channelProductResponse.extraImageUrl1) &&
        Objects.equals(this.extraImageUrl2, channelProductResponse.extraImageUrl2) &&
        Objects.equals(this.extraImageUrl3, channelProductResponse.extraImageUrl3) &&
        Objects.equals(this.extraImageUrl4, channelProductResponse.extraImageUrl4) &&
        Objects.equals(this.extraImageUrl5, channelProductResponse.extraImageUrl5) &&
        Objects.equals(this.extraImageUrl6, channelProductResponse.extraImageUrl6) &&
        Objects.equals(this.extraImageUrl7, channelProductResponse.extraImageUrl7) &&
        Objects.equals(this.extraImageUrl8, channelProductResponse.extraImageUrl8) &&
        Objects.equals(this.extraImageUrl9, channelProductResponse.extraImageUrl9) &&
        Objects.equals(this.categoryTrail, channelProductResponse.categoryTrail) &&
        Objects.equals(this.extraData, channelProductResponse.extraData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parentChannelProductNo, mappedFields, name, description, brand, size, color, ean, manufacturerProductNumber, stock, price, MSRP, purchasePrice, vatRateType, shippingCost, shippingTime, url, imageUrl, extraImageUrl1, extraImageUrl2, extraImageUrl3, extraImageUrl4, extraImageUrl5, extraImageUrl6, extraImageUrl7, extraImageUrl8, extraImageUrl9, categoryTrail, extraData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelProductResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentChannelProductNo: ").append(toIndentedString(parentChannelProductNo)).append("\n");
    sb.append("    mappedFields: ").append(toIndentedString(mappedFields)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    ean: ").append(toIndentedString(ean)).append("\n");
    sb.append("    manufacturerProductNumber: ").append(toIndentedString(manufacturerProductNumber)).append("\n");
    sb.append("    stock: ").append(toIndentedString(stock)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    MSRP: ").append(toIndentedString(MSRP)).append("\n");
    sb.append("    purchasePrice: ").append(toIndentedString(purchasePrice)).append("\n");
    sb.append("    vatRateType: ").append(toIndentedString(vatRateType)).append("\n");
    sb.append("    shippingCost: ").append(toIndentedString(shippingCost)).append("\n");
    sb.append("    shippingTime: ").append(toIndentedString(shippingTime)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    extraImageUrl1: ").append(toIndentedString(extraImageUrl1)).append("\n");
    sb.append("    extraImageUrl2: ").append(toIndentedString(extraImageUrl2)).append("\n");
    sb.append("    extraImageUrl3: ").append(toIndentedString(extraImageUrl3)).append("\n");
    sb.append("    extraImageUrl4: ").append(toIndentedString(extraImageUrl4)).append("\n");
    sb.append("    extraImageUrl5: ").append(toIndentedString(extraImageUrl5)).append("\n");
    sb.append("    extraImageUrl6: ").append(toIndentedString(extraImageUrl6)).append("\n");
    sb.append("    extraImageUrl7: ").append(toIndentedString(extraImageUrl7)).append("\n");
    sb.append("    extraImageUrl8: ").append(toIndentedString(extraImageUrl8)).append("\n");
    sb.append("    extraImageUrl9: ").append(toIndentedString(extraImageUrl9)).append("\n");
    sb.append("    categoryTrail: ").append(toIndentedString(categoryTrail)).append("\n");
    sb.append("    extraData: ").append(toIndentedString(extraData)).append("\n");
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

