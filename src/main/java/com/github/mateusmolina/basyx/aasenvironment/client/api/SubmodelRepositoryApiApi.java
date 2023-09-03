package com.github.mateusmolina.basyx.aasenvironment.client.api;

import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiException;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiClient;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiResponse;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.Configuration;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.Pair;

import javax.ws.rs.core.GenericType;

import com.github.mateusmolina.basyx.aasenvironment.client.model.OperationRequest;
import com.github.mateusmolina.basyx.aasenvironment.client.model.Result;
import com.github.mateusmolina.basyx.aasenvironment.client.model.Submodel;
import com.github.mateusmolina.basyx.aasenvironment.client.model.SubmodelElement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-03T13:20:12.648099800+02:00[Europe/Berlin]")
public class SubmodelRepositoryApiApi {
  private ApiClient apiClient;

  public SubmodelRepositoryApiApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SubmodelRepositoryApiApi(ApiClient apiClient) {
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
   * Deletes a Submodel
   * 
   * @param submodelIdentifier The Submodel’s unique id (UTF8-BASE64-URL-encoded) (required)
   * @return Result
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Submodel deleted successfully </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Default error handling for unmentioned status codes </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request, e.g. the request parameters of the format of the request body is wrong. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized, e.g. the server refused the authorization attempt. </td><td>  -  </td></tr>
     </table>
   */
  public Result deleteSubmodelById(String submodelIdentifier) throws ApiException {
    return deleteSubmodelByIdWithHttpInfo(submodelIdentifier).getData();
  }

  /**
   * Deletes a Submodel
   * 
   * @param submodelIdentifier The Submodel’s unique id (UTF8-BASE64-URL-encoded) (required)
   * @return ApiResponse&lt;Result&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Submodel deleted successfully </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Default error handling for unmentioned status codes </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request, e.g. the request parameters of the format of the request body is wrong. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized, e.g. the server refused the authorization attempt. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Result> deleteSubmodelByIdWithHttpInfo(String submodelIdentifier) throws ApiException {
    // Check required parameters
    if (submodelIdentifier == null) {
      throw new ApiException(400, "Missing the required parameter 'submodelIdentifier' when calling deleteSubmodelById");
    }

    // Path parameters
    String localVarPath = "/submodels/{submodelIdentifier}"
            .replaceAll("\\{submodelIdentifier}", apiClient.escapeString(submodelIdentifier));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Result> localVarReturnType = new GenericType<Result>() {};
    return apiClient.invokeAPI("SubmodelRepositoryApiApi.deleteSubmodelById", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Deletes a submodel element at a specified path within the submodel elements hierarchy
   * 
   * @param submodelIdentifier The Submodel’s unique id (UTF8-BASE64-URL-encoded) (required)
   * @param idShortPath IdShort path to the submodel element (dot-separated) (required)
   * @return Result
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Submodel element deleted successfully </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Default error handling for unmentioned status codes </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request, e.g. the request parameters of the format of the request body is wrong. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized, e.g. the server refused the authorization attempt. </td><td>  -  </td></tr>
     </table>
   */
  public Result deleteSubmodelElementByPathSubmodelRepo(String submodelIdentifier, String idShortPath) throws ApiException {
    return deleteSubmodelElementByPathSubmodelRepoWithHttpInfo(submodelIdentifier, idShortPath).getData();
  }

  /**
   * Deletes a submodel element at a specified path within the submodel elements hierarchy
   * 
   * @param submodelIdentifier The Submodel’s unique id (UTF8-BASE64-URL-encoded) (required)
   * @param idShortPath IdShort path to the submodel element (dot-separated) (required)
   * @return ApiResponse&lt;Result&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Submodel element deleted successfully </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Default error handling for unmentioned status codes </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request, e.g. the request parameters of the format of the request body is wrong. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized, e.g. the server refused the authorization attempt. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Result> deleteSubmodelElementByPathSubmodelRepoWithHttpInfo(String submodelIdentifier, String idShortPath) throws ApiException {
    // Check required parameters
    if (submodelIdentifier == null) {
      throw new ApiException(400, "Missing the required parameter 'submodelIdentifier' when calling deleteSubmodelElementByPathSubmodelRepo");
    }
    if (idShortPath == null) {
      throw new ApiException(400, "Missing the required parameter 'idShortPath' when calling deleteSubmodelElementByPathSubmodelRepo");
    }

    // Path parameters
    String localVarPath = "/submodels/{submodelIdentifier}/submodel-elements/{idShortPath}"
            .replaceAll("\\{submodelIdentifier}", apiClient.escapeString(submodelIdentifier))
            .replaceAll("\\{idShortPath}", apiClient.escapeString(idShortPath));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Result> localVarReturnType = new GenericType<Result>() {};
    return apiClient.invokeAPI("SubmodelRepositoryApiApi.deleteSubmodelElementByPathSubmodelRepo", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Returns all submodel elements including their hierarchy
   * 
   * @param submodelIdentifier The Submodel’s unique id (UTF8-BASE64-URL-encoded) (required)
   * @param limit The maximum number of elements in the response array (optional)
   * @param cursor A server-generated identifier retrieved from pagingMetadata that specifies from which position the result listing should continue (optional)
   * @param level Determines the structural depth of the respective resource content (optional, default to deep)
   * @param extent Determines to which extent the resource is being serialized (optional, default to withoutBlobValue)
   * @return String
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of found submodel elements </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request, e.g. the request parameters of the format of the request body is wrong. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized, e.g. the server refused the authorization attempt. </td><td>  -  </td></tr>
     </table>
   */
  public String getAllSubmodelElements(String submodelIdentifier, String limit, String cursor, String level, String extent) throws ApiException {
    return getAllSubmodelElementsWithHttpInfo(submodelIdentifier, limit, cursor, level, extent).getData();
  }

  /**
   * Returns all submodel elements including their hierarchy
   * 
   * @param submodelIdentifier The Submodel’s unique id (UTF8-BASE64-URL-encoded) (required)
   * @param limit The maximum number of elements in the response array (optional)
   * @param cursor A server-generated identifier retrieved from pagingMetadata that specifies from which position the result listing should continue (optional)
   * @param level Determines the structural depth of the respective resource content (optional, default to deep)
   * @param extent Determines to which extent the resource is being serialized (optional, default to withoutBlobValue)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of found submodel elements </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request, e.g. the request parameters of the format of the request body is wrong. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized, e.g. the server refused the authorization attempt. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<String> getAllSubmodelElementsWithHttpInfo(String submodelIdentifier, String limit, String cursor, String level, String extent) throws ApiException {
    // Check required parameters
    if (submodelIdentifier == null) {
      throw new ApiException(400, "Missing the required parameter 'submodelIdentifier' when calling getAllSubmodelElements");
    }

    // Path parameters
    String localVarPath = "/submodels/{submodelIdentifier}/submodel-elements"
            .replaceAll("\\{submodelIdentifier}", apiClient.escapeString(submodelIdentifier));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "limit", limit)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cursor", cursor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "level", level));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "extent", extent));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI("SubmodelRepositoryApiApi.getAllSubmodelElements", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Returns all Submodels
   * 
   * @param semanticId The value of the semantic id reference (UTF8-BASE64-URL-encoded) (optional)
   * @param idShort The Asset Administration Shell’s IdShort (optional)
   * @param limit The maximum number of elements in the response array (optional)
   * @param cursor A server-generated identifier retrieved from pagingMetadata that specifies from which position the result listing should continue (optional)
   * @param level Determines the structural depth of the respective resource content (optional, default to deep)
   * @param extent Determines to which extent the resource is being serialized (optional, default to withoutBlobValue)
   * @return Result
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Default error handling for unmentioned status codes </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request, e.g. the request parameters of the format of the request body is wrong. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized, e.g. the server refused the authorization attempt. </td><td>  -  </td></tr>
     </table>
   */
  public Result getAllSubmodels(String semanticId, String idShort, String limit, String cursor, String level, String extent) throws ApiException {
    return getAllSubmodelsWithHttpInfo(semanticId, idShort, limit, cursor, level, extent).getData();
  }

  /**
   * Returns all Submodels
   * 
   * @param semanticId The value of the semantic id reference (UTF8-BASE64-URL-encoded) (optional)
   * @param idShort The Asset Administration Shell’s IdShort (optional)
   * @param limit The maximum number of elements in the response array (optional)
   * @param cursor A server-generated identifier retrieved from pagingMetadata that specifies from which position the result listing should continue (optional)
   * @param level Determines the structural depth of the respective resource content (optional, default to deep)
   * @param extent Determines to which extent the resource is being serialized (optional, default to withoutBlobValue)
   * @return ApiResponse&lt;Result&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Default error handling for unmentioned status codes </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request, e.g. the request parameters of the format of the request body is wrong. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized, e.g. the server refused the authorization attempt. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Result> getAllSubmodelsWithHttpInfo(String semanticId, String idShort, String limit, String cursor, String level, String extent) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "semanticId", semanticId)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "idShort", idShort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cursor", cursor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "level", level));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "extent", extent));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Result> localVarReturnType = new GenericType<Result>() {};
    return apiClient.invokeAPI("SubmodelRepositoryApiApi.getAllSubmodels", "/submodels", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Returns a specific Submodel
   * 
   * @param submodelIdentifier The Submodel’s unique id (UTF8-BASE64-URL-encoded) (required)
   * @param level Determines the structural depth of the respective resource content (optional, default to deep)
   * @param extent Determines to which extent the resource is being serialized (optional, default to withoutBlobValue)
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
  public Result getSubmodelById(String submodelIdentifier, String level, String extent) throws ApiException {
    return getSubmodelByIdWithHttpInfo(submodelIdentifier, level, extent).getData();
  }

  /**
   * Returns a specific Submodel
   * 
   * @param submodelIdentifier The Submodel’s unique id (UTF8-BASE64-URL-encoded) (required)
   * @param level Determines the structural depth of the respective resource content (optional, default to deep)
   * @param extent Determines to which extent the resource is being serialized (optional, default to withoutBlobValue)
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
  public ApiResponse<Result> getSubmodelByIdWithHttpInfo(String submodelIdentifier, String level, String extent) throws ApiException {
    // Check required parameters
    if (submodelIdentifier == null) {
      throw new ApiException(400, "Missing the required parameter 'submodelIdentifier' when calling getSubmodelById");
    }

    // Path parameters
    String localVarPath = "/submodels/{submodelIdentifier}"
            .replaceAll("\\{submodelIdentifier}", apiClient.escapeString(submodelIdentifier));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "level", level)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "extent", extent));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Result> localVarReturnType = new GenericType<Result>() {};
    return apiClient.invokeAPI("SubmodelRepositoryApiApi.getSubmodelById", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Returns the metadata attributes of a specific Submodel
   * 
   * @param submodelIdentifier The Submodel’s unique id (UTF8-BASE64-URL-encoded) (required)
   * @param level Determines the structural depth of the respective resource content (optional, default to deep)
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
  public Result getSubmodelByIdMetadata(String submodelIdentifier, String level) throws ApiException {
    return getSubmodelByIdMetadataWithHttpInfo(submodelIdentifier, level).getData();
  }

  /**
   * Returns the metadata attributes of a specific Submodel
   * 
   * @param submodelIdentifier The Submodel’s unique id (UTF8-BASE64-URL-encoded) (required)
   * @param level Determines the structural depth of the respective resource content (optional, default to deep)
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
  public ApiResponse<Result> getSubmodelByIdMetadataWithHttpInfo(String submodelIdentifier, String level) throws ApiException {
    // Check required parameters
    if (submodelIdentifier == null) {
      throw new ApiException(400, "Missing the required parameter 'submodelIdentifier' when calling getSubmodelByIdMetadata");
    }

    // Path parameters
    String localVarPath = "/submodels/{submodelIdentifier}/$metadata"
            .replaceAll("\\{submodelIdentifier}", apiClient.escapeString(submodelIdentifier));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "level", level)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Result> localVarReturnType = new GenericType<Result>() {};
    return apiClient.invokeAPI("SubmodelRepositoryApiApi.getSubmodelByIdMetadata", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Returns a specific Submodel in the ValueOnly representation
   * 
   * @param submodelIdentifier The Submodel’s unique id (UTF8-BASE64-URL-encoded) (required)
   * @param level Determines the structural depth of the respective resource content (optional, default to deep)
   * @param extent Determines to which extent the resource is being serialized (optional, default to withoutBlobValue)
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
  public Result getSubmodelByIdValueOnly(String submodelIdentifier, String level, String extent) throws ApiException {
    return getSubmodelByIdValueOnlyWithHttpInfo(submodelIdentifier, level, extent).getData();
  }

  /**
   * Returns a specific Submodel in the ValueOnly representation
   * 
   * @param submodelIdentifier The Submodel’s unique id (UTF8-BASE64-URL-encoded) (required)
   * @param level Determines the structural depth of the respective resource content (optional, default to deep)
   * @param extent Determines to which extent the resource is being serialized (optional, default to withoutBlobValue)
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
  public ApiResponse<Result> getSubmodelByIdValueOnlyWithHttpInfo(String submodelIdentifier, String level, String extent) throws ApiException {
    // Check required parameters
    if (submodelIdentifier == null) {
      throw new ApiException(400, "Missing the required parameter 'submodelIdentifier' when calling getSubmodelByIdValueOnly");
    }

    // Path parameters
    String localVarPath = "/submodels/{submodelIdentifier}/$value"
            .replaceAll("\\{submodelIdentifier}", apiClient.escapeString(submodelIdentifier));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "level", level)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "extent", extent));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Result> localVarReturnType = new GenericType<Result>() {};
    return apiClient.invokeAPI("SubmodelRepositoryApiApi.getSubmodelByIdValueOnly", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Returns a specific submodel element from the Submodel at a specified path
   * 
   * @param submodelIdentifier The Submodel’s unique id (UTF8-BASE64-URL-encoded) (required)
   * @param idShortPath IdShort path to the submodel element (dot-separated) (required)
   * @param level Determines the structural depth of the respective resource content (optional, default to deep)
   * @param extent Determines to which extent the resource is being serialized (optional, default to withoutBlobValue)
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
  public Result getSubmodelElementByPathSubmodelRepo(String submodelIdentifier, String idShortPath, String level, String extent) throws ApiException {
    return getSubmodelElementByPathSubmodelRepoWithHttpInfo(submodelIdentifier, idShortPath, level, extent).getData();
  }

  /**
   * Returns a specific submodel element from the Submodel at a specified path
   * 
   * @param submodelIdentifier The Submodel’s unique id (UTF8-BASE64-URL-encoded) (required)
   * @param idShortPath IdShort path to the submodel element (dot-separated) (required)
   * @param level Determines the structural depth of the respective resource content (optional, default to deep)
   * @param extent Determines to which extent the resource is being serialized (optional, default to withoutBlobValue)
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
  public ApiResponse<Result> getSubmodelElementByPathSubmodelRepoWithHttpInfo(String submodelIdentifier, String idShortPath, String level, String extent) throws ApiException {
    // Check required parameters
    if (submodelIdentifier == null) {
      throw new ApiException(400, "Missing the required parameter 'submodelIdentifier' when calling getSubmodelElementByPathSubmodelRepo");
    }
    if (idShortPath == null) {
      throw new ApiException(400, "Missing the required parameter 'idShortPath' when calling getSubmodelElementByPathSubmodelRepo");
    }

    // Path parameters
    String localVarPath = "/submodels/{submodelIdentifier}/submodel-elements/{idShortPath}"
            .replaceAll("\\{submodelIdentifier}", apiClient.escapeString(submodelIdentifier))
            .replaceAll("\\{idShortPath}", apiClient.escapeString(idShortPath));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "level", level)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "extent", extent));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Result> localVarReturnType = new GenericType<Result>() {};
    return apiClient.invokeAPI("SubmodelRepositoryApiApi.getSubmodelElementByPathSubmodelRepo", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Returns a specific submodel element from the Submodel at a specified path in the ValueOnly representation
   * 
   * @param submodelIdentifier The Submodel’s unique id (UTF8-BASE64-URL-encoded) (required)
   * @param idShortPath IdShort path to the submodel element (dot-separated) (required)
   * @param level Determines the structural depth of the respective resource content (optional, default to deep)
   * @param extent Determines to which extent the resource is being serialized (optional, default to withoutBlobValue)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Requested submodel element </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request, e.g. the request parameters of the format of the request body is wrong. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized, e.g. the server refused the authorization attempt. </td><td>  -  </td></tr>
     </table>
   */
  public Object getSubmodelElementByPathValueOnlySubmodelRepo(String submodelIdentifier, String idShortPath, String level, String extent) throws ApiException {
    return getSubmodelElementByPathValueOnlySubmodelRepoWithHttpInfo(submodelIdentifier, idShortPath, level, extent).getData();
  }

  /**
   * Returns a specific submodel element from the Submodel at a specified path in the ValueOnly representation
   * 
   * @param submodelIdentifier The Submodel’s unique id (UTF8-BASE64-URL-encoded) (required)
   * @param idShortPath IdShort path to the submodel element (dot-separated) (required)
   * @param level Determines the structural depth of the respective resource content (optional, default to deep)
   * @param extent Determines to which extent the resource is being serialized (optional, default to withoutBlobValue)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Requested submodel element </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request, e.g. the request parameters of the format of the request body is wrong. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized, e.g. the server refused the authorization attempt. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> getSubmodelElementByPathValueOnlySubmodelRepoWithHttpInfo(String submodelIdentifier, String idShortPath, String level, String extent) throws ApiException {
    // Check required parameters
    if (submodelIdentifier == null) {
      throw new ApiException(400, "Missing the required parameter 'submodelIdentifier' when calling getSubmodelElementByPathValueOnlySubmodelRepo");
    }
    if (idShortPath == null) {
      throw new ApiException(400, "Missing the required parameter 'idShortPath' when calling getSubmodelElementByPathValueOnlySubmodelRepo");
    }

    // Path parameters
    String localVarPath = "/submodels/{submodelIdentifier}/submodel-elements/{idShortPath}/$value"
            .replaceAll("\\{submodelIdentifier}", apiClient.escapeString(submodelIdentifier))
            .replaceAll("\\{idShortPath}", apiClient.escapeString(idShortPath));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "level", level)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "extent", extent));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI("SubmodelRepositoryApiApi.getSubmodelElementByPathValueOnlySubmodelRepo", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Synchronously or asynchronously invokes an Operation at a specified path
   * 
   * @param submodelIdentifier The Submodel’s unique id (UTF8-BASE64-URL-encoded) (required)
   * @param idShortPath IdShort path to the submodel element (dot-separated) (required)
   * @param operationRequest  (required)
   * @param async Determines whether an operation invocation is performed asynchronously or synchronously (optional, default to false)
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
       <tr><td> 405 </td><td> Method not allowed - Invoke only valid for Operation submodel element </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized, e.g. the server refused the authorization attempt. </td><td>  -  </td></tr>
     </table>
   */
  public Result invokeOperationSubmodelRepo(String submodelIdentifier, String idShortPath, OperationRequest operationRequest, String async) throws ApiException {
    return invokeOperationSubmodelRepoWithHttpInfo(submodelIdentifier, idShortPath, operationRequest, async).getData();
  }

  /**
   * Synchronously or asynchronously invokes an Operation at a specified path
   * 
   * @param submodelIdentifier The Submodel’s unique id (UTF8-BASE64-URL-encoded) (required)
   * @param idShortPath IdShort path to the submodel element (dot-separated) (required)
   * @param operationRequest  (required)
   * @param async Determines whether an operation invocation is performed asynchronously or synchronously (optional, default to false)
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
       <tr><td> 405 </td><td> Method not allowed - Invoke only valid for Operation submodel element </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized, e.g. the server refused the authorization attempt. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Result> invokeOperationSubmodelRepoWithHttpInfo(String submodelIdentifier, String idShortPath, OperationRequest operationRequest, String async) throws ApiException {
    // Check required parameters
    if (submodelIdentifier == null) {
      throw new ApiException(400, "Missing the required parameter 'submodelIdentifier' when calling invokeOperationSubmodelRepo");
    }
    if (idShortPath == null) {
      throw new ApiException(400, "Missing the required parameter 'idShortPath' when calling invokeOperationSubmodelRepo");
    }
    if (operationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'operationRequest' when calling invokeOperationSubmodelRepo");
    }

    // Path parameters
    String localVarPath = "/submodels/{submodelIdentifier}/submodel-elements/{idShortPath}/invoke"
            .replaceAll("\\{submodelIdentifier}", apiClient.escapeString(submodelIdentifier))
            .replaceAll("\\{idShortPath}", apiClient.escapeString(idShortPath));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "async", async)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Result> localVarReturnType = new GenericType<Result>() {};
    return apiClient.invokeAPI("SubmodelRepositoryApiApi.invokeOperationSubmodelRepo", localVarPath, "POST", localVarQueryParams, operationRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Updates the value of an existing SubmodelElement
   * 
   * @param submodelIdentifier The Submodel’s unique id (UTF8-BASE64-URL-encoded) (required)
   * @param idShortPath IdShort path to the submodel element (dot-separated) (required)
   * @param body  (required)
   * @param level Determines the structural depth of the respective resource content (optional, default to core)
   * @return Result
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Submodel updated successfully </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Default error handling for unmentioned status codes </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request, e.g. the request parameters of the format of the request body is wrong. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized, e.g. the server refused the authorization attempt. </td><td>  -  </td></tr>
     </table>
   */
  public Result patchSubmodelElementByPathValueOnlySubmodelRepo(String submodelIdentifier, String idShortPath, Object body, String level) throws ApiException {
    return patchSubmodelElementByPathValueOnlySubmodelRepoWithHttpInfo(submodelIdentifier, idShortPath, body, level).getData();
  }

  /**
   * Updates the value of an existing SubmodelElement
   * 
   * @param submodelIdentifier The Submodel’s unique id (UTF8-BASE64-URL-encoded) (required)
   * @param idShortPath IdShort path to the submodel element (dot-separated) (required)
   * @param body  (required)
   * @param level Determines the structural depth of the respective resource content (optional, default to core)
   * @return ApiResponse&lt;Result&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Submodel updated successfully </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Default error handling for unmentioned status codes </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request, e.g. the request parameters of the format of the request body is wrong. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized, e.g. the server refused the authorization attempt. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Result> patchSubmodelElementByPathValueOnlySubmodelRepoWithHttpInfo(String submodelIdentifier, String idShortPath, Object body, String level) throws ApiException {
    // Check required parameters
    if (submodelIdentifier == null) {
      throw new ApiException(400, "Missing the required parameter 'submodelIdentifier' when calling patchSubmodelElementByPathValueOnlySubmodelRepo");
    }
    if (idShortPath == null) {
      throw new ApiException(400, "Missing the required parameter 'idShortPath' when calling patchSubmodelElementByPathValueOnlySubmodelRepo");
    }
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling patchSubmodelElementByPathValueOnlySubmodelRepo");
    }

    // Path parameters
    String localVarPath = "/submodels/{submodelIdentifier}/submodel-elements/{idShortPath}/$value"
            .replaceAll("\\{submodelIdentifier}", apiClient.escapeString(submodelIdentifier))
            .replaceAll("\\{idShortPath}", apiClient.escapeString(idShortPath));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "level", level)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Result> localVarReturnType = new GenericType<Result>() {};
    return apiClient.invokeAPI("SubmodelRepositoryApiApi.patchSubmodelElementByPathValueOnlySubmodelRepo", localVarPath, "PATCH", localVarQueryParams, body,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Creates a new Submodel
   * 
   * @param submodel  (required)
   * @return Result
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Submodel created successfully </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict, a resource which shall be created exists already. Might be thrown if a Submodel or SubmodelElement with the same ShortId is contained in a POST request. </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Default error handling for unmentioned status codes </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request, e.g. the request parameters of the format of the request body is wrong. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized, e.g. the server refused the authorization attempt. </td><td>  -  </td></tr>
     </table>
   */
  public Result postSubmodel(Submodel submodel) throws ApiException {
    return postSubmodelWithHttpInfo(submodel).getData();
  }

  /**
   * Creates a new Submodel
   * 
   * @param submodel  (required)
   * @return ApiResponse&lt;Result&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Submodel created successfully </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict, a resource which shall be created exists already. Might be thrown if a Submodel or SubmodelElement with the same ShortId is contained in a POST request. </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Default error handling for unmentioned status codes </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request, e.g. the request parameters of the format of the request body is wrong. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized, e.g. the server refused the authorization attempt. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Result> postSubmodelWithHttpInfo(Submodel submodel) throws ApiException {
    // Check required parameters
    if (submodel == null) {
      throw new ApiException(400, "Missing the required parameter 'submodel' when calling postSubmodel");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Result> localVarReturnType = new GenericType<Result>() {};
    return apiClient.invokeAPI("SubmodelRepositoryApiApi.postSubmodel", "/submodels", "POST", new ArrayList<>(), submodel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Creates a new submodel element at a specified path within submodel elements hierarchy
   * 
   * @param submodelIdentifier The Submodel’s unique id (UTF8-BASE64-URL-encoded) (required)
   * @param idShortPath IdShort path to the submodel element (dot-separated) (required)
   * @param submodelElement  (required)
   * @param level Determines the structural depth of the respective resource content (optional, default to deep)
   * @param extent Determines to which extent the resource is being serialized (optional, default to withoutBlobValue)
   * @return Result
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict, a resource which shall be created exists already. Might be thrown if a Submodel or SubmodelElement with the same ShortId is contained in a POST request. </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Submodel element created successfully </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Default error handling for unmentioned status codes </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request, e.g. the request parameters of the format of the request body is wrong. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized, e.g. the server refused the authorization attempt. </td><td>  -  </td></tr>
     </table>
   */
  public Result postSubmodelElementByPathSubmodelRepo(String submodelIdentifier, String idShortPath, SubmodelElement submodelElement, String level, String extent) throws ApiException {
    return postSubmodelElementByPathSubmodelRepoWithHttpInfo(submodelIdentifier, idShortPath, submodelElement, level, extent).getData();
  }

  /**
   * Creates a new submodel element at a specified path within submodel elements hierarchy
   * 
   * @param submodelIdentifier The Submodel’s unique id (UTF8-BASE64-URL-encoded) (required)
   * @param idShortPath IdShort path to the submodel element (dot-separated) (required)
   * @param submodelElement  (required)
   * @param level Determines the structural depth of the respective resource content (optional, default to deep)
   * @param extent Determines to which extent the resource is being serialized (optional, default to withoutBlobValue)
   * @return ApiResponse&lt;Result&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict, a resource which shall be created exists already. Might be thrown if a Submodel or SubmodelElement with the same ShortId is contained in a POST request. </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Submodel element created successfully </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Default error handling for unmentioned status codes </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request, e.g. the request parameters of the format of the request body is wrong. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized, e.g. the server refused the authorization attempt. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Result> postSubmodelElementByPathSubmodelRepoWithHttpInfo(String submodelIdentifier, String idShortPath, SubmodelElement submodelElement, String level, String extent) throws ApiException {
    // Check required parameters
    if (submodelIdentifier == null) {
      throw new ApiException(400, "Missing the required parameter 'submodelIdentifier' when calling postSubmodelElementByPathSubmodelRepo");
    }
    if (idShortPath == null) {
      throw new ApiException(400, "Missing the required parameter 'idShortPath' when calling postSubmodelElementByPathSubmodelRepo");
    }
    if (submodelElement == null) {
      throw new ApiException(400, "Missing the required parameter 'submodelElement' when calling postSubmodelElementByPathSubmodelRepo");
    }

    // Path parameters
    String localVarPath = "/submodels/{submodelIdentifier}/submodel-elements/{idShortPath}"
            .replaceAll("\\{submodelIdentifier}", apiClient.escapeString(submodelIdentifier))
            .replaceAll("\\{idShortPath}", apiClient.escapeString(idShortPath));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "level", level)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "extent", extent));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Result> localVarReturnType = new GenericType<Result>() {};
    return apiClient.invokeAPI("SubmodelRepositoryApiApi.postSubmodelElementByPathSubmodelRepo", localVarPath, "POST", localVarQueryParams, submodelElement,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Creates a new submodel element
   * 
   * @param submodelIdentifier The Submodel’s unique id (UTF8-BASE64-URL-encoded) (required)
   * @param submodelElement  (required)
   * @return Result
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict, a resource which shall be created exists already. Might be thrown if a Submodel or SubmodelElement with the same ShortId is contained in a POST request. </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Submodel element created successfully </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Default error handling for unmentioned status codes </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request, e.g. the request parameters of the format of the request body is wrong. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized, e.g. the server refused the authorization attempt. </td><td>  -  </td></tr>
     </table>
   */
  public Result postSubmodelElementSubmodelRepo(String submodelIdentifier, SubmodelElement submodelElement) throws ApiException {
    return postSubmodelElementSubmodelRepoWithHttpInfo(submodelIdentifier, submodelElement).getData();
  }

  /**
   * Creates a new submodel element
   * 
   * @param submodelIdentifier The Submodel’s unique id (UTF8-BASE64-URL-encoded) (required)
   * @param submodelElement  (required)
   * @return ApiResponse&lt;Result&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict, a resource which shall be created exists already. Might be thrown if a Submodel or SubmodelElement with the same ShortId is contained in a POST request. </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Submodel element created successfully </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Default error handling for unmentioned status codes </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request, e.g. the request parameters of the format of the request body is wrong. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized, e.g. the server refused the authorization attempt. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Result> postSubmodelElementSubmodelRepoWithHttpInfo(String submodelIdentifier, SubmodelElement submodelElement) throws ApiException {
    // Check required parameters
    if (submodelIdentifier == null) {
      throw new ApiException(400, "Missing the required parameter 'submodelIdentifier' when calling postSubmodelElementSubmodelRepo");
    }
    if (submodelElement == null) {
      throw new ApiException(400, "Missing the required parameter 'submodelElement' when calling postSubmodelElementSubmodelRepo");
    }

    // Path parameters
    String localVarPath = "/submodels/{submodelIdentifier}/submodel-elements"
            .replaceAll("\\{submodelIdentifier}", apiClient.escapeString(submodelIdentifier));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Result> localVarReturnType = new GenericType<Result>() {};
    return apiClient.invokeAPI("SubmodelRepositoryApiApi.postSubmodelElementSubmodelRepo", localVarPath, "POST", new ArrayList<>(), submodelElement,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Updates an existing Submodel
   * 
   * @param submodelIdentifier The Submodel’s unique id (UTF8-BASE64-URL-encoded) (required)
   * @param submodel  (required)
   * @param level Determines the structural depth of the respective resource content (optional, default to deep)
   * @return Result
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Submodel updated successfully </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Default error handling for unmentioned status codes </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request, e.g. the request parameters of the format of the request body is wrong. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized, e.g. the server refused the authorization attempt. </td><td>  -  </td></tr>
     </table>
   */
  public Result putSubmodelById(String submodelIdentifier, Submodel submodel, String level) throws ApiException {
    return putSubmodelByIdWithHttpInfo(submodelIdentifier, submodel, level).getData();
  }

  /**
   * Updates an existing Submodel
   * 
   * @param submodelIdentifier The Submodel’s unique id (UTF8-BASE64-URL-encoded) (required)
   * @param submodel  (required)
   * @param level Determines the structural depth of the respective resource content (optional, default to deep)
   * @return ApiResponse&lt;Result&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Submodel updated successfully </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Default error handling for unmentioned status codes </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request, e.g. the request parameters of the format of the request body is wrong. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized, e.g. the server refused the authorization attempt. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Result> putSubmodelByIdWithHttpInfo(String submodelIdentifier, Submodel submodel, String level) throws ApiException {
    // Check required parameters
    if (submodelIdentifier == null) {
      throw new ApiException(400, "Missing the required parameter 'submodelIdentifier' when calling putSubmodelById");
    }
    if (submodel == null) {
      throw new ApiException(400, "Missing the required parameter 'submodel' when calling putSubmodelById");
    }

    // Path parameters
    String localVarPath = "/submodels/{submodelIdentifier}"
            .replaceAll("\\{submodelIdentifier}", apiClient.escapeString(submodelIdentifier));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "level", level)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Result> localVarReturnType = new GenericType<Result>() {};
    return apiClient.invokeAPI("SubmodelRepositoryApiApi.putSubmodelById", localVarPath, "PUT", localVarQueryParams, submodel,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
