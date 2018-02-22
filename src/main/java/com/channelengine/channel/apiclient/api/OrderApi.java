/*
 * ChannelEngine Channel API
 * ChannelEngine API for channels
 *
 * OpenAPI spec version: channel
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
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
    private ApiClient apiClient;

    public OrderApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OrderApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for orderCreate
     * @param model  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call orderCreateCall(ChannelOrderRequest model, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = model;

        // create path and map variables
        String localVarPath = "/v2/orders";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "text/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "text/json", "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apikey" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call orderCreateValidateBeforeCall(ChannelOrderRequest model, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new ApiException("Missing the required parameter 'model' when calling orderCreate(Async)");
        }
        

        com.squareup.okhttp.Call call = orderCreateCall(model, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create Order
     * Create a new order in ChannelEngine.
     * @param model  (required)
     * @return ModelApiResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ModelApiResponse orderCreate(ChannelOrderRequest model) throws ApiException {
        ApiResponse<ModelApiResponse> resp = orderCreateWithHttpInfo(model);
        return resp.getData();
    }

    /**
     * Create Order
     * Create a new order in ChannelEngine.
     * @param model  (required)
     * @return ApiResponse&lt;ModelApiResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ModelApiResponse> orderCreateWithHttpInfo(ChannelOrderRequest model) throws ApiException {
        com.squareup.okhttp.Call call = orderCreateValidateBeforeCall(model, null, null);
        Type localVarReturnType = new TypeToken<ModelApiResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Order (asynchronously)
     * Create a new order in ChannelEngine.
     * @param model  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call orderCreateAsync(ChannelOrderRequest model, final ApiCallback<ModelApiResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = orderCreateValidateBeforeCall(model, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ModelApiResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for orderInvoice
     * @param merchantOrderNo The unique order reference as used by the merchant (required)
     * @param useCustomerCulture Generate the invoice in the billing address&#39; country&#39;s language (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call orderInvoiceCall(String merchantOrderNo, Boolean useCustomerCulture, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v2/orders/{merchantOrderNo}/invoice"
            .replaceAll("\\{" + "merchantOrderNo" + "\\}", apiClient.escapeString(merchantOrderNo.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (useCustomerCulture != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("useCustomerCulture", useCustomerCulture));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/pdf"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apikey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call orderInvoiceValidateBeforeCall(String merchantOrderNo, Boolean useCustomerCulture, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'merchantOrderNo' is set
        if (merchantOrderNo == null) {
            throw new ApiException("Missing the required parameter 'merchantOrderNo' when calling orderInvoice(Async)");
        }
        

        com.squareup.okhttp.Call call = orderInvoiceCall(merchantOrderNo, useCustomerCulture, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Download Invoice
     * Generates the ChannelEngine VAT invoice for this order in PDF
     * @param merchantOrderNo The unique order reference as used by the merchant (required)
     * @param useCustomerCulture Generate the invoice in the billing address&#39; country&#39;s language (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File orderInvoice(String merchantOrderNo, Boolean useCustomerCulture) throws ApiException {
        ApiResponse<File> resp = orderInvoiceWithHttpInfo(merchantOrderNo, useCustomerCulture);
        return resp.getData();
    }

    /**
     * Download Invoice
     * Generates the ChannelEngine VAT invoice for this order in PDF
     * @param merchantOrderNo The unique order reference as used by the merchant (required)
     * @param useCustomerCulture Generate the invoice in the billing address&#39; country&#39;s language (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> orderInvoiceWithHttpInfo(String merchantOrderNo, Boolean useCustomerCulture) throws ApiException {
        com.squareup.okhttp.Call call = orderInvoiceValidateBeforeCall(merchantOrderNo, useCustomerCulture, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Download Invoice (asynchronously)
     * Generates the ChannelEngine VAT invoice for this order in PDF
     * @param merchantOrderNo The unique order reference as used by the merchant (required)
     * @param useCustomerCulture Generate the invoice in the billing address&#39; country&#39;s language (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call orderInvoiceAsync(String merchantOrderNo, Boolean useCustomerCulture, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = orderInvoiceValidateBeforeCall(merchantOrderNo, useCustomerCulture, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for orderPackingSlip
     * @param merchantOrderNo The unique order reference as used by the merchant (required)
     * @param useCustomerCulture Generate the invoice in the billing address&#39; country&#39;s language (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call orderPackingSlipCall(String merchantOrderNo, Boolean useCustomerCulture, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v2/orders/{merchantOrderNo}/packingslip"
            .replaceAll("\\{" + "merchantOrderNo" + "\\}", apiClient.escapeString(merchantOrderNo.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (useCustomerCulture != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("useCustomerCulture", useCustomerCulture));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/pdf"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apikey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call orderPackingSlipValidateBeforeCall(String merchantOrderNo, Boolean useCustomerCulture, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'merchantOrderNo' is set
        if (merchantOrderNo == null) {
            throw new ApiException("Missing the required parameter 'merchantOrderNo' when calling orderPackingSlip(Async)");
        }
        

        com.squareup.okhttp.Call call = orderPackingSlipCall(merchantOrderNo, useCustomerCulture, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Download Packing Slip
     * Generates the ChannelEngine packing slip for this order in PDF
     * @param merchantOrderNo The unique order reference as used by the merchant (required)
     * @param useCustomerCulture Generate the invoice in the billing address&#39; country&#39;s language (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File orderPackingSlip(String merchantOrderNo, Boolean useCustomerCulture) throws ApiException {
        ApiResponse<File> resp = orderPackingSlipWithHttpInfo(merchantOrderNo, useCustomerCulture);
        return resp.getData();
    }

    /**
     * Download Packing Slip
     * Generates the ChannelEngine packing slip for this order in PDF
     * @param merchantOrderNo The unique order reference as used by the merchant (required)
     * @param useCustomerCulture Generate the invoice in the billing address&#39; country&#39;s language (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> orderPackingSlipWithHttpInfo(String merchantOrderNo, Boolean useCustomerCulture) throws ApiException {
        com.squareup.okhttp.Call call = orderPackingSlipValidateBeforeCall(merchantOrderNo, useCustomerCulture, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Download Packing Slip (asynchronously)
     * Generates the ChannelEngine packing slip for this order in PDF
     * @param merchantOrderNo The unique order reference as used by the merchant (required)
     * @param useCustomerCulture Generate the invoice in the billing address&#39; country&#39;s language (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call orderPackingSlipAsync(String merchantOrderNo, Boolean useCustomerCulture, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = orderPackingSlipValidateBeforeCall(merchantOrderNo, useCustomerCulture, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
