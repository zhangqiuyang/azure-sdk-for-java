// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.graphrbac.models;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.management.graphrbac.GraphErrorException;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * SignedInUsers.
 */
public final class SignedInUsersInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private SignedInUsersService service;

    /**
     * The service client containing this operation class.
     */
    private GraphRbacManagementClientImpl client;

    /**
     * Initializes an instance of SignedInUsersInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    SignedInUsersInner(GraphRbacManagementClientImpl client) {
        this.service = RestProxy.create(SignedInUsersService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * GraphRbacManagementClientSignedInUsers to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "GraphRbacManagementClientSignedInUsers")
    private interface SignedInUsersService {
        @Headers({ "Accept: application/json,text/json", "Content-Type: application/json" })
        @Get("/{tenantID}/me")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(GraphErrorException.class)
        Mono<SimpleResponse<UserInner>> get(@HostParam("$host") String host, @QueryParam("api-version") String apiVersion, @PathParam("tenantID") String tenantID, Context context);

        @Headers({ "Accept: application/json,text/json", "Content-Type: application/json" })
        @Get("/{tenantID}/me/ownedObjects")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(GraphErrorException.class)
        Mono<SimpleResponse<DirectoryObjectListResultInner>> listOwnedObjects(@HostParam("$host") String host, @QueryParam("api-version") String apiVersion, @PathParam("tenantID") String tenantID, Context context);

        @Headers({ "Accept: application/json,text/json", "Content-Type: application/json" })
        @Get("/{tenantID}/{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(GraphErrorException.class)
        Mono<SimpleResponse<DirectoryObjectListResultInner>> listOwnedObjectsNext(@HostParam("$host") String host, @PathParam(value = "nextLink", encoded = true) String nextLink, @QueryParam("api-version") String apiVersion, @PathParam("tenantID") String tenantID, Context context);
    }

    /**
     * Gets the details for the currently logged-in user.
     * 
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<UserInner>> getWithResponseAsync() {
        return FluxUtil.withContext(context -> service.get(this.client.getHost(), this.client.getApiVersion(), this.client.getTenantID(), context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets the details for the currently logged-in user.
     * 
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<UserInner> getAsync() {
        return getWithResponseAsync()
            .flatMap((SimpleResponse<UserInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets the details for the currently logged-in user.
     * 
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public UserInner get() {
        return getAsync().block();
    }

    /**
     * Get the list of directory objects that are owned by the user.
     * 
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<DirectoryObjectInner>> listOwnedObjectsSinglePageAsync() {
        return FluxUtil.withContext(context -> service.listOwnedObjects(this.client.getHost(), this.client.getApiVersion(), this.client.getTenantID(), context))
            .<PagedResponse<DirectoryObjectInner>>map(res -> new PagedResponseBase<>(
                res.getRequest(),
                res.getStatusCode(),
                res.getHeaders(),
                res.getValue().value(),
                res.getValue().odataNextLink(),
                null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Get the list of directory objects that are owned by the user.
     * 
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<DirectoryObjectInner> listOwnedObjectsAsync() {
        return new PagedFlux<>(
            () -> listOwnedObjectsSinglePageAsync(),
            nextLink -> listOwnedObjectsNextSinglePageAsync(nextLink));
    }

    /**
     * Get the list of directory objects that are owned by the user.
     * 
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DirectoryObjectInner> listOwnedObjects() {
        return new PagedIterable<>(listOwnedObjectsAsync());
    }

    /**
     * Get the list of directory objects that are owned by the user.
     * 
     * @param nextLink Next link for the list operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<DirectoryObjectInner>> listOwnedObjectsNextSinglePageAsync(String nextLink) {
        return FluxUtil.withContext(context -> service.listOwnedObjectsNext(this.client.getHost(), nextLink, this.client.getApiVersion(), this.client.getTenantID(), context))
            .<PagedResponse<DirectoryObjectInner>>map(res -> new PagedResponseBase<>(
                res.getRequest(),
                res.getStatusCode(),
                res.getHeaders(),
                res.getValue().value(),
                res.getValue().odataNextLink(),
                null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }
}