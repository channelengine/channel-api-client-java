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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets DataChangesProductType
 */
@JsonAdapter(DataChangesProductType.Adapter.class)
public enum DataChangesProductType {
  
  SINGLE("SINGLE"),
  
  PARENT("PARENT"),
  
  CHILD("CHILD"),
  
  GRANDPARENT("GRANDPARENT");

  private String value;

  DataChangesProductType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DataChangesProductType fromValue(String value) {
    for (DataChangesProductType b : DataChangesProductType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DataChangesProductType> {
    @Override
    public void write(final JsonWriter jsonWriter, final DataChangesProductType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DataChangesProductType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DataChangesProductType.fromValue(value);
    }
  }
}

