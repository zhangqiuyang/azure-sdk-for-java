// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.monitor.fluent.models.DiagnosticSettingsResourceCollectionInner;
import com.azure.resourcemanager.monitor.fluent.models.DiagnosticSettingsResourceInner;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsDelete;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in DiagnosticSettingsClient. */
public interface DiagnosticSettingsClient extends InnerSupportsDelete<Void> {
    /**
     * Gets the active diagnostic settings for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param name The name of the diagnostic setting.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the active diagnostic settings for the specified resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<DiagnosticSettingsResourceInner>> getWithResponseAsync(String resourceUri, String name);

    /**
     * Gets the active diagnostic settings for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param name The name of the diagnostic setting.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the active diagnostic settings for the specified resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<DiagnosticSettingsResourceInner> getAsync(String resourceUri, String name);

    /**
     * Gets the active diagnostic settings for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param name The name of the diagnostic setting.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the active diagnostic settings for the specified resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DiagnosticSettingsResourceInner get(String resourceUri, String name);

    /**
     * Gets the active diagnostic settings for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param name The name of the diagnostic setting.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the active diagnostic settings for the specified resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DiagnosticSettingsResourceInner> getWithResponse(String resourceUri, String name, Context context);

    /**
     * Creates or updates diagnostic settings for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param name The name of the diagnostic setting.
     * @param parameters The diagnostic setting resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the diagnostic setting resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<DiagnosticSettingsResourceInner>> createOrUpdateWithResponseAsync(
        String resourceUri, String name, DiagnosticSettingsResourceInner parameters);

    /**
     * Creates or updates diagnostic settings for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param name The name of the diagnostic setting.
     * @param parameters The diagnostic setting resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the diagnostic setting resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<DiagnosticSettingsResourceInner> createOrUpdateAsync(
        String resourceUri, String name, DiagnosticSettingsResourceInner parameters);

    /**
     * Creates or updates diagnostic settings for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param name The name of the diagnostic setting.
     * @param parameters The diagnostic setting resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the diagnostic setting resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DiagnosticSettingsResourceInner createOrUpdate(
        String resourceUri, String name, DiagnosticSettingsResourceInner parameters);

    /**
     * Creates or updates diagnostic settings for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param name The name of the diagnostic setting.
     * @param parameters The diagnostic setting resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the diagnostic setting resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DiagnosticSettingsResourceInner> createOrUpdateWithResponse(
        String resourceUri, String name, DiagnosticSettingsResourceInner parameters, Context context);

    /**
     * Deletes existing diagnostic settings for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param name The name of the diagnostic setting.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> deleteWithResponseAsync(String resourceUri, String name);

    /**
     * Deletes existing diagnostic settings for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param name The name of the diagnostic setting.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceUri, String name);

    /**
     * Deletes existing diagnostic settings for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param name The name of the diagnostic setting.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceUri, String name);

    /**
     * Deletes existing diagnostic settings for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param name The name of the diagnostic setting.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceUri, String name, Context context);

    /**
     * Gets the active diagnostic settings list for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the active diagnostic settings list for the specified resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<DiagnosticSettingsResourceCollectionInner>> listWithResponseAsync(String resourceUri);

    /**
     * Gets the active diagnostic settings list for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the active diagnostic settings list for the specified resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<DiagnosticSettingsResourceCollectionInner> listAsync(String resourceUri);

    /**
     * Gets the active diagnostic settings list for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the active diagnostic settings list for the specified resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DiagnosticSettingsResourceCollectionInner list(String resourceUri);

    /**
     * Gets the active diagnostic settings list for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the active diagnostic settings list for the specified resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DiagnosticSettingsResourceCollectionInner> listWithResponse(String resourceUri, Context context);
}
