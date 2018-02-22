/*
 * ChannelEngine Channel API
 * ChannelEngine API for channels
 *
 * OpenAPI spec version: 2.5.1
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
 * Address
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-22T11:12:21.819+01:00")
public class Address {
  /**
   * Gets or Sets gender
   */
  @JsonAdapter(GenderEnum.Adapter.class)
  public enum GenderEnum {
    MALE("MALE"),
    
    FEMALE("FEMALE"),
    
    NOT_APPLICABLE("NOT_APPLICABLE");

    private String value;

    GenderEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static GenderEnum fromValue(String text) {
      for (GenderEnum b : GenderEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<GenderEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final GenderEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public GenderEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return GenderEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Gender")
  private GenderEnum gender = null;

  @SerializedName("CompanyName")
  private String companyName = null;

  @SerializedName("FirstName")
  private String firstName = null;

  @SerializedName("LastName")
  private String lastName = null;

  @SerializedName("StreetName")
  private String streetName = null;

  @SerializedName("HouseNr")
  private String houseNr = null;

  @SerializedName("HouseNrAddition")
  private String houseNrAddition = null;

  @SerializedName("ZipCode")
  private String zipCode = null;

  @SerializedName("City")
  private String city = null;

  @SerializedName("Region")
  private String region = null;

  @SerializedName("CountryIso")
  private String countryIso = null;

  @SerializedName("Original")
  private String original = null;

  public Address gender(GenderEnum gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @ApiModelProperty(value = "")
  public GenderEnum getGender() {
    return gender;
  }

  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }

  public Address companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * Get companyName
   * @return companyName
  **/
  @ApiModelProperty(value = "")
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public Address firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(value = "")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Address lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(value = "")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Address streetName(String streetName) {
    this.streetName = streetName;
    return this;
  }

   /**
   * Get streetName
   * @return streetName
  **/
  @ApiModelProperty(value = "")
  public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  public Address houseNr(String houseNr) {
    this.houseNr = houseNr;
    return this;
  }

   /**
   * Get houseNr
   * @return houseNr
  **/
  @ApiModelProperty(value = "")
  public String getHouseNr() {
    return houseNr;
  }

  public void setHouseNr(String houseNr) {
    this.houseNr = houseNr;
  }

  public Address houseNrAddition(String houseNrAddition) {
    this.houseNrAddition = houseNrAddition;
    return this;
  }

   /**
   * Get houseNrAddition
   * @return houseNrAddition
  **/
  @ApiModelProperty(value = "")
  public String getHouseNrAddition() {
    return houseNrAddition;
  }

  public void setHouseNrAddition(String houseNrAddition) {
    this.houseNrAddition = houseNrAddition;
  }

  public Address zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

   /**
   * Get zipCode
   * @return zipCode
  **/
  @ApiModelProperty(value = "")
  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public Address city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(value = "")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Address region(String region) {
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @ApiModelProperty(value = "")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public Address countryIso(String countryIso) {
    this.countryIso = countryIso;
    return this;
  }

   /**
   * For example: NL, BE, FR
   * @return countryIso
  **/
  @ApiModelProperty(value = "For example: NL, BE, FR")
  public String getCountryIso() {
    return countryIso;
  }

  public void setCountryIso(String countryIso) {
    this.countryIso = countryIso;
  }

  public Address original(String original) {
    this.original = original;
    return this;
  }

   /**
   * Get original
   * @return original
  **/
  @ApiModelProperty(value = "")
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
    Address address = (Address) o;
    return Objects.equals(this.gender, address.gender) &&
        Objects.equals(this.companyName, address.companyName) &&
        Objects.equals(this.firstName, address.firstName) &&
        Objects.equals(this.lastName, address.lastName) &&
        Objects.equals(this.streetName, address.streetName) &&
        Objects.equals(this.houseNr, address.houseNr) &&
        Objects.equals(this.houseNrAddition, address.houseNrAddition) &&
        Objects.equals(this.zipCode, address.zipCode) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.region, address.region) &&
        Objects.equals(this.countryIso, address.countryIso) &&
        Objects.equals(this.original, address.original);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gender, companyName, firstName, lastName, streetName, houseNr, houseNrAddition, zipCode, city, region, countryIso, original);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
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

