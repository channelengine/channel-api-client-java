/*
 * ChannelEngine Channel API
 * ChannelEngine API for channels
 *
 * The version of the OpenAPI document: 2.13.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.channelengine.channel.apiclient.api;

import com.channelengine.channel.apiclient.ApiCallback;
import com.channelengine.channel.apiclient.ApiClient;
import com.channelengine.channel.apiclient.ApiException;
import com.channelengine.channel.apiclient.ApiResponse;
import com.channelengine.channel.apiclient.Configuration;
import com.channelengine.channel.apiclient.Pair;
import com.channelengine.channel.apiclient.ProgressRequestBody;
import com.channelengine.channel.apiclient.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.channelengine.channel.apiclient.model.ChannelOrderRequest;
import java.io.File;
import com.channelengine.channel.apiclient.model.ModelApiResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderApi {
    private ApiClient localVarApiClient;

    public OrderApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OrderApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for orderCreate
     * @param channelOrderRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call orderCreateCall(ChannelOrderRequest channelOrderRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = channelOrderRequest;

        // create path and map variables
        String localVarPath = "/v2/orders";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json-patch+json", "application/json", "application/_*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "apiKey" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call orderCreateValidateBeforeCall(ChannelOrderRequest channelOrderRequest, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = orderCreateCall(channelOrderRequest, _callback);
        return localVarCall;

    }

    /**
     * Create Order.
     * Create a new order in ChannelEngine.
     * @param channelOrderRequest  (optional)
     * @return ModelApiResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
     </table>
     */
    public ModelApiResponse orderCreate(ChannelOrderRequest channelOrderRequest) throws ApiException {
        ApiResponse<ModelApiResponse> localVarResp = orderCreateWithHttpInfo(channelOrderRequest);
        return localVarResp.getData();
    }

    /**
     * Create Order.
     * Create a new order in ChannelEngine.
     * @param channelOrderRequest  (optional)
     * @return ApiResponse&lt;ModelApiResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ModelApiResponse> orderCreateWithHttpInfo(ChannelOrderRequest channelOrderRequest) throws ApiException {
        okhttp3.Call localVarCall = orderCreateValidateBeforeCall(channelOrderRequest, null);
        Type localVarReturnType = new TypeToken<ModelApiResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create Order. (asynchronously)
     * Create a new order in ChannelEngine.
     * @param channelOrderRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call orderCreateAsync(ChannelOrderRequest channelOrderRequest, final ApiCallback<ModelApiResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = orderCreateValidateBeforeCall(channelOrderRequest, _callback);
        Type localVarReturnType = new TypeToken<ModelApiResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for orderInvoice
     * @param merchantOrderNo The unique order reference as used by the merchant. (required)
     * @param useCustomerCulture Generate the invoice in the billing address&#39; country&#39;s language. (optional, default to false)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Invoice PDF </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call orderInvoiceCall(String merchantOrderNo, Boolean useCustomerCulture, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v2/orders/{merchantOrderNo}/invoice"
            .replaceAll("\\{" + "merchantOrderNo" + "\\}", localVarApiClient.escapeString(merchantOrderNo.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (useCustomerCulture != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("useCustomerCulture", useCustomerCulture));
        }

        final String[] localVarAccepts = {
            "application/pdf", "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "apiKey" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call orderInvoiceValidateBeforeCall(String merchantOrderNo, Boolean useCustomerCulture, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'merchantOrderNo' is set
        if (merchantOrderNo == null) {
            throw new ApiException("Missing the required parameter 'merchantOrderNo' when calling orderInvoice(Async)");
        }
        

        okhttp3.Call localVarCall = orderInvoiceCall(merchantOrderNo, useCustomerCulture, _callback);
        return localVarCall;

    }

    /**
     * Download Invoice.
     * Generates the ChannelEngine VAT invoice for this order in PDF.
     * @param merchantOrderNo The unique order reference as used by the merchant. (required)
     * @param useCustomerCulture Generate the invoice in the billing address&#39; country&#39;s language. (optional, default to false)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Invoice PDF </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public File orderInvoice(String merchantOrderNo, Boolean useCustomerCulture) throws ApiException {
        ApiResponse<File> localVarResp = orderInvoiceWithHttpInfo(merchantOrderNo, useCustomerCulture);
        return localVarResp.getData();
    }

    /**
     * Download Invoice.
     * Generates the ChannelEngine VAT invoice for this order in PDF.
     * @param merchantOrderNo The unique order reference as used by the merchant. (required)
     * @param useCustomerCulture Generate the invoice in the billing address&#39; country&#39;s language. (optional, default to false)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Invoice PDF </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<File> orderInvoiceWithHttpInfo(String merchantOrderNo, Boolean useCustomerCulture) throws ApiException {
        okhttp3.Call localVarCall = orderInvoiceValidateBeforeCall(merchantOrderNo, useCustomerCulture, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Download Invoice. (asynchronously)
     * Generates the ChannelEngine VAT invoice for this order in PDF.
     * @param merchantOrderNo The unique order reference as used by the merchant. (required)
     * @param useCustomerCulture Generate the invoice in the billing address&#39; country&#39;s language. (optional, default to false)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Invoice PDF </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call orderInvoiceAsync(String merchantOrderNo, Boolean useCustomerCulture, final ApiCallback<File> _callback) throws ApiException {

        okhttp3.Call localVarCall = orderInvoiceValidateBeforeCall(merchantOrderNo, useCustomerCulture, _callback);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for orderPackingSlip
     * @param merchantOrderNo The unique order reference as used by the merchant. (required)
     * @param useCustomerCulture Generate the invoice in the billing address&#39; country&#39;s language. (optional, default to false)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Packing Slip PDF </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call orderPackingSlipCall(String merchantOrderNo, Boolean useCustomerCulture, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v2/orders/{merchantOrderNo}/packingslip"
            .replaceAll("\\{" + "merchantOrderNo" + "\\}", localVarApiClient.escapeString(merchantOrderNo.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (useCustomerCulture != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("useCustomerCulture", useCustomerCulture));
        }

        final String[] localVarAccepts = {
            "application/pdf", "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "apiKey" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call orderPackingSlipValidateBeforeCall(String merchantOrderNo, Boolean useCustomerCulture, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'merchantOrderNo' is set
        if (merchantOrderNo == null) {
            throw new ApiException("Missing the required parameter 'merchantOrderNo' when calling orderPackingSlip(Async)");
        }
        

        okhttp3.Call localVarCall = orderPackingSlipCall(merchantOrderNo, useCustomerCulture, _callback);
        return localVarCall;

    }

    /**
     * Download Packing Slip.
     * Generates the ChannelEngine packing slip for this order in PDF.
     * @param merchantOrderNo The unique order reference as used by the merchant. (required)
     * @param useCustomerCulture Generate the invoice in the billing address&#39; country&#39;s language. (optional, default to false)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Packing Slip PDF </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public File orderPackingSlip(String merchantOrderNo, Boolean useCustomerCulture) throws ApiException {
        ApiResponse<File> localVarResp = orderPackingSlipWithHttpInfo(merchantOrderNo, useCustomerCulture);
        return localVarResp.getData();
    }

    /**
     * Download Packing Slip.
     * Generates the ChannelEngine packing slip for this order in PDF.
     * @param merchantOrderNo The unique order reference as used by the merchant. (required)
     * @param useCustomerCulture Generate the invoice in the billing address&#39; country&#39;s language. (optional, default to false)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Packing Slip PDF </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<File> orderPackingSlipWithHttpInfo(String merchantOrderNo, Boolean useCustomerCulture) throws ApiException {
        okhttp3.Call localVarCall = orderPackingSlipValidateBeforeCall(merchantOrderNo, useCustomerCulture, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Download Packing Slip. (asynchronously)
     * Generates the ChannelEngine packing slip for this order in PDF.
     * @param merchantOrderNo The unique order reference as used by the merchant. (required)
     * @param useCustomerCulture Generate the invoice in the billing address&#39; country&#39;s language. (optional, default to false)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Packing Slip PDF </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call orderPackingSlipAsync(String merchantOrderNo, Boolean useCustomerCulture, final ApiCallback<File> _callback) throws ApiException {

        okhttp3.Call localVarCall = orderPackingSlipValidateBeforeCall(merchantOrderNo, useCustomerCulture, _callback);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
