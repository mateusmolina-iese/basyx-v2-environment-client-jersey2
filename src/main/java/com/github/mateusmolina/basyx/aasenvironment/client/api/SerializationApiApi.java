package com.github.mateusmolina.basyx.aasenvironment.client.api;

import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiException;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiClient;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiResponse;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.Configuration;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.Pair;

import javax.ws.rs.core.GenericType;

import com.github.mateusmolina.basyx.aasenvironment.client.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-03T13:20:12.648099800+02:00[Europe/Berlin]")
public class SerializationApiApi {
  private ApiClient apiClient;

  public SerializationApiApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SerializationApiApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Returns an appropriate serialization based on the specified format (see SerializationFormat)
   * 
   * @param aasIds The Asset Administration Shells&#39; unique ids (UTF8-BASE64-URL-encoded) (optional)
   * @param submodelIds The Submodels&#39; unique ids (UTF8-BASE64-URL-encoded) (optional)
   * @param includeConceptDescriptions Include Concept Descriptions? (optional, default to true)
   * @return Result
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Default error handling for unmentioned status codes </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request, e.g. the request parameters of the format of the request body is wrong. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized, e.g. the server refused the authorization attempt. </td><td>  -  </td></tr>
     </table>
   */
  public Result generateSerializationByIds(List<String> aasIds, List<String> submodelIds, String includeConceptDescriptions) throws ApiException {
    return generateSerializationByIdsWithHttpInfo(aasIds, submodelIds, includeConceptDescriptions).getData();
  }

  /**
   * Returns an appropriate serialization based on the specified format (see SerializationFormat)
   * 
   * @param aasIds The Asset Administration Shells&#39; unique ids (UTF8-BASE64-URL-encoded) (optional)
   * @param submodelIds The Submodels&#39; unique ids (UTF8-BASE64-URL-encoded) (optional)
   * @param includeConceptDescriptions Include Concept Descriptions? (optional, default to true)
   * @return ApiResponse&lt;Result&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Default error handling for unmentioned status codes </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request, e.g. the request parameters of the format of the request body is wrong. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized, e.g. the server refused the authorization attempt. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Result> generateSerializationByIdsWithHttpInfo(List<String> aasIds, List<String> submodelIds, String includeConceptDescriptions) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("multi", "aasIds", aasIds)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "submodelIds", submodelIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeConceptDescriptions", includeConceptDescriptions));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Result> localVarReturnType = new GenericType<Result>() {};
    return apiClient.invokeAPI("SerializationApiApi.generateSerializationByIds", "/serialization", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
