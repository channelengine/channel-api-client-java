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
import com.channelengine.channel.apiclient.model.Gender;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ChannelAddressRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ChannelAddressRequest {
  public static final String SERIALIZED_NAME_GENDER = "Gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private Gender gender;

  public static final String SERIALIZED_NAME_COMPANY_NAME = "CompanyName";
  @SerializedName(SERIALIZED_NAME_COMPANY_NAME)
  private String companyName;

  public static final String SERIALIZED_NAME_FIRST_NAME = "FirstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "LastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_STREET_NAME = "StreetName";
  @SerializedName(SERIALIZED_NAME_STREET_NAME)
  private String streetName;

  public static final String SERIALIZED_NAME_HOUSE_NR = "HouseNr";
  @SerializedName(SERIALIZED_NAME_HOUSE_NR)
  private String houseNr;

  public static final String SERIALIZED_NAME_HOUSE_NR_ADDITION = "HouseNrAddition";
  @SerializedName(SERIALIZED_NAME_HOUSE_NR_ADDITION)
  private String houseNrAddition;

  public static final String SERIALIZED_NAME_ZIP_CODE = "ZipCode";
  @SerializedName(SERIALIZED_NAME_ZIP_CODE)
  private String zipCode;

  public static final String SERIALIZED_NAME_CITY = "City";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_REGION = "Region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_COUNTRY_ISO = "CountryIso";
  @SerializedName(SERIALIZED_NAME_COUNTRY_ISO)
  private String countryIso;

  public static final String SERIALIZED_NAME_ORIGINAL = "Original";
  @SerializedName(SERIALIZED_NAME_ORIGINAL)
  private String original;


  public ChannelAddressRequest gender(Gender gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Gender getGender() {
    return gender;
  }


  public void setGender(Gender gender) {
    this.gender = gender;
  }


  public ChannelAddressRequest companyName(String companyName) {
    
    this.companyName = companyName;
    return this;
  }

   /**
   * Optional. Company addressed too.
   * @return companyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional. Company addressed too.")

  public String getCompanyName() {
    return companyName;
  }


  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  public ChannelAddressRequest firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * The first name of the customer.
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The first name of the customer.")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public ChannelAddressRequest lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * The last name of the customer (includes the surname prefix [tussenvoegsel] like &#39;de&#39;, &#39;van&#39;, &#39;du&#39;).
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The last name of the customer (includes the surname prefix [tussenvoegsel] like 'de', 'van', 'du').")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public ChannelAddressRequest streetName(String streetName) {
    
    this.streetName = streetName;
    return this;
  }

   /**
   * The name of the street (without house number information)  This field might be empty if address validation is disabled in ChannelEngine.
   * @return streetName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the street (without house number information)  This field might be empty if address validation is disabled in ChannelEngine.")

  public String getStreetName() {
    return streetName;
  }


  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }


  public ChannelAddressRequest houseNr(String houseNr) {
    
    this.houseNr = houseNr;
    return this;
  }

   /**
   * The house number  This field might be empty if address validation is disabled in ChannelEngine.
   * @return houseNr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The house number  This field might be empty if address validation is disabled in ChannelEngine.")

  public String getHouseNr() {
    return houseNr;
  }


  public void setHouseNr(String houseNr) {
    this.houseNr = houseNr;
  }


  public ChannelAddressRequest houseNrAddition(String houseNrAddition) {
    
    this.houseNrAddition = houseNrAddition;
    return this;
  }

   /**
   * Optional. Addition to the house number  If the address is: Groenhazengracht 2c, the address will be:  StreetName: Groenhazengracht  HouseNo: 2  HouseNrAddition: c  This field might be empty if address validation is disabled in ChannelEngine.
   * @return houseNrAddition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional. Addition to the house number  If the address is: Groenhazengracht 2c, the address will be:  StreetName: Groenhazengracht  HouseNo: 2  HouseNrAddition: c  This field might be empty if address validation is disabled in ChannelEngine.")

  public String getHouseNrAddition() {
    return houseNrAddition;
  }


  public void setHouseNrAddition(String houseNrAddition) {
    this.houseNrAddition = houseNrAddition;
  }


  public ChannelAddressRequest zipCode(String zipCode) {
    
    this.zipCode = zipCode;
    return this;
  }

   /**
   * The zip or postal code.
   * @return zipCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The zip or postal code.")

  public String getZipCode() {
    return zipCode;
  }


  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }


  public ChannelAddressRequest city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * The name of the city.
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the city.")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public ChannelAddressRequest region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * Optional. State/province/region.
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional. State/province/region.")

  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }


  public ChannelAddressRequest countryIso(String countryIso) {
    
    this.countryIso = countryIso;
    return this;
  }

   /**
   * For example: NL, BE, FR.
   * @return countryIso
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "For example: NL, BE, FR.")

  public String getCountryIso() {
    return countryIso;
  }


  public void setCountryIso(String countryIso) {
    this.countryIso = countryIso;
  }


  public ChannelAddressRequest original(String original) {
    
    this.original = original;
    return this;
  }

   /**
   * Optional. The address as a single string: use in case the address lines are entered  as single lines and later parsed into street, house number and house number addition.
   * @return original
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional. The address as a single string: use in case the address lines are entered  as single lines and later parsed into street, house number and house number addition.")

  public String getOriginal() {
    return original;
  }


  public void setOriginal(String original) {
    this.original = original;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelAddressRequest channelAddressRequest = (ChannelAddressRequest) o;
    return Objects.equals(this.gender, channelAddressRequest.gender) &&
        Objects.equals(this.companyName, channelAddressRequest.companyName) &&
        Objects.equals(this.firstName, channelAddressRequest.firstName) &&
        Objects.equals(this.lastName, channelAddressRequest.lastName) &&
        Objects.equals(this.streetName, channelAddressRequest.streetName) &&
        Objects.equals(this.houseNr, channelAddressRequest.houseNr) &&
        Objects.equals(this.houseNrAddition, channelAddressRequest.houseNrAddition) &&
        Objects.equals(this.zipCode, channelAddressRequest.zipCode) &&
        Objects.equals(this.city, channelAddressRequest.city) &&
        Objects.equals(this.region, channelAddressRequest.region) &&
        Objects.equals(this.countryIso, channelAddressRequest.countryIso) &&
        Objects.equals(this.original, channelAddressRequest.original);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gender, companyName, firstName, lastName, streetName, houseNr, houseNrAddition, zipCode, city, region, countryIso, original);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelAddressRequest {\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    houseNr: ").append(toIndentedString(houseNr)).append("\n");
    sb.append("    houseNrAddition: ").append(toIndentedString(houseNrAddition)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    countryIso: ").append(toIndentedString(countryIso)).append("\n");
    sb.append("    original: ").append(toIndentedString(original)).append("\n");
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

