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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets VatRateType
 */
@JsonAdapter(VatRateType.Adapter.class)
public enum VatRateType {
  
  STANDARD("STANDARD"),
  
  REDUCED("REDUCED"),
  
  SUPER_REDUCED("SUPER_REDUCED"),
  
  EXEMPT("EXEMPT");

  private String value;

  VatRateType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static VatRateType fromValue(String value) {
    for (VatRateType b : VatRateType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<VatRateType> {
    @Override
    public void write(final JsonWriter jsonWriter, final VatRateType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public VatRateType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return VatRateType.fromValue(value);
    }
  }
}

