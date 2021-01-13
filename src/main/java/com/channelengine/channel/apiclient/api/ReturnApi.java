/*
 * ChannelEngine Channel API
 * ChannelEngine API for channels
 *
 * The version of the OpenAPI document: 2.9.4
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


import com.channelengine.channel.apiclient.model.ChannelReturnRequest;
import com.channelengine.channel.apiclient.model.CollectionOfChannelReturnResponse;
import com.channelengine.channel.apiclient.model.ModelApiResponse;
import org.threeten.bp.OffsetDateTime;
import com.channelengine.channel.apiclient.model.ReturnReason;
import com.channelengine.channel.apiclient.model.ReturnStatus;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReturnApi {
    private ApiClient localVarApiClient;

    public ReturnApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ReturnApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for returnDeclareForChannel
     * @param channelReturnRequest  (optional)
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
    public okhttp3.Call returnDeclareForChannelCall(ChannelReturnRequest channelReturnRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = channelReturnRequest;

        // create path and map variables
        String localVarPath = "/v2/returns/channel";

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
    private okhttp3.Call returnDeclareForChannelValidateBeforeCall(ChannelReturnRequest channelReturnRequest, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = returnDeclareForChannelCall(channelReturnRequest, _callback);
        return localVarCall;

    }

    /**
     * Create Return.
     * Mark (part of) an order as returned by the customer.
     * @param channelReturnRequest  (optional)
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
    public ModelApiResponse returnDeclareForChannel(ChannelReturnRequest channelReturnRequest) throws ApiException {
        ApiResponse<ModelApiResponse> localVarResp = returnDeclareForChannelWithHttpInfo(channelReturnRequest);
        return localVarResp.getData();
    }

    /**
     * Create Return.
     * Mark (part of) an order as returned by the customer.
     * @param channelReturnRequest  (optional)
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
    public ApiResponse<ModelApiResponse> returnDeclareForChannelWithHttpInfo(ChannelReturnRequest channelReturnRequest) throws ApiException {
        okhttp3.Call localVarCall = returnDeclareForChannelValidateBeforeCall(channelReturnRequest, null);
        Type localVarReturnType = new TypeToken<ModelApiResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create Return. (asynchronously)
     * Mark (part of) an order as returned by the customer.
     * @param channelReturnRequest  (optional)
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
    public okhttp3.Call returnDeclareForChannelAsync(ChannelReturnRequest channelReturnRequest, final ApiCallback<ModelApiResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = returnDeclareForChannelValidateBeforeCall(channelReturnRequest, _callback);
        Type localVarReturnType = new TypeToken<ModelApiResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for returnGetDeclaredByMerchant
     * @param createdSince Deprecated, please use FromDate instead. (optional)
     * @param statuses Return status(es) to filter on. (optional)
     * @param reasons Return reason(s) to filter on. (optional)
     * @param fromDate Filter on the creation date, starting from this date. This date is inclusive. (optional)
     * @param toDate Filter on the creation date, until this date. This date is exclusive. (optional)
     * @param page The page to filter on. Starts at 1. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call returnGetDeclaredByMerchantCall(OffsetDateTime createdSince, List<ReturnStatus> statuses, List<ReturnReason> reasons, OffsetDateTime fromDate, OffsetDateTime toDate, Integer page, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v2/returns/channel";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (createdSince != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("createdSince", createdSince));
        }

        if (statuses != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "statuses", statuses));
        }

        if (reasons != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "reasons", reasons));
        }

        if (fromDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fromDate", fromDate));
        }

        if (toDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("toDate", toDate));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

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
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "apiKey" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call returnGetDeclaredByMerchantValidateBeforeCall(OffsetDateTime createdSince, List<ReturnStatus> statuses, List<ReturnReason> reasons, OffsetDateTime fromDate, OffsetDateTime toDate, Integer page, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = returnGetDeclaredByMerchantCall(createdSince, statuses, reasons, fromDate, toDate, page, _callback);
        return localVarCall;

    }

    /**
     * Get Returns.
     * Get all returns created by the merchant. This call is supposed&lt;br /&gt;to be used by channels. Merchants should use the &#39;GET /v2/returns/merchant&#39;&lt;br /&gt;call.
     * @param createdSince Deprecated, please use FromDate instead. (optional)
     * @param statuses Return status(es) to filter on. (optional)
     * @param reasons Return reason(s) to filter on. (optional)
     * @param fromDate Filter on the creation date, starting from this date. This date is inclusive. (optional)
     * @param toDate Filter on the creation date, until this date. This date is exclusive. (optional)
     * @param page The page to filter on. Starts at 1. (optional)
     * @return CollectionOfChannelReturnResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public CollectionOfChannelReturnResponse returnGetDeclaredByMerchant(OffsetDateTime createdSince, List<ReturnStatus> statuses, List<ReturnReason> reasons, OffsetDateTime fromDate, OffsetDateTime toDate, Integer page) throws ApiException {
        ApiResponse<CollectionOfChannelReturnResponse> localVarResp = returnGetDeclaredByMerchantWithHttpInfo(createdSince, statuses, reasons, fromDate, toDate, page);
        return localVarResp.getData();
    }

    /**
     * Get Returns.
     * Get all returns created by the merchant. This call is supposed&lt;br /&gt;to be used by channels. Merchants should use the &#39;GET /v2/returns/merchant&#39;&lt;br /&gt;call.
     * @param createdSince Deprecated, please use FromDate instead. (optional)
     * @param statuses Return status(es) to filter on. (optional)
     * @param reasons Return reason(s) to filter on. (optional)
     * @param fromDate Filter on the creation date, starting from this date. This date is inclusive. (optional)
     * @param toDate Filter on the creation date, until this date. This date is exclusive. (optional)
     * @param page The page to filter on. Starts at 1. (optional)
     * @return ApiResponse&lt;CollectionOfChannelReturnResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CollectionOfChannelReturnResponse> returnGetDeclaredByMerchantWithHttpInfo(OffsetDateTime createdSince, List<ReturnStatus> statuses, List<ReturnReason> reasons, OffsetDateTime fromDate, OffsetDateTime toDate, Integer page) throws ApiException {
        okhttp3.Call localVarCall = returnGetDeclaredByMerchantValidateBeforeCall(createdSince, statuses, reasons, fromDate, toDate, page, null);
        Type localVarReturnType = new TypeToken<CollectionOfChannelReturnResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Returns. (asynchronously)
     * Get all returns created by the merchant. This call is supposed&lt;br /&gt;to be used by channels. Merchants should use the &#39;GET /v2/returns/merchant&#39;&lt;br /&gt;call.
     * @param createdSince Deprecated, please use FromDate instead. (optional)
     * @param statuses Return status(es) to filter on. (optional)
     * @param reasons Return reason(s) to filter on. (optional)
     * @param fromDate Filter on the creation date, starting from this date. This date is inclusive. (optional)
     * @param toDate Filter on the creation date, until this date. This date is exclusive. (optional)
     * @param page The page to filter on. Starts at 1. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call returnGetDeclaredByMerchantAsync(OffsetDateTime createdSince, List<ReturnStatus> statuses, List<ReturnReason> reasons, OffsetDateTime fromDate, OffsetDateTime toDate, Integer page, final ApiCallback<CollectionOfChannelReturnResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = returnGetDeclaredByMerchantValidateBeforeCall(createdSince, statuses, reasons, fromDate, toDate, page, _callback);
        Type localVarReturnType = new TypeToken<CollectionOfChannelReturnResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
