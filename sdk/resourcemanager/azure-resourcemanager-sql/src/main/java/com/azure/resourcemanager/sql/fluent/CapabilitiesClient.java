// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.fluent.models.LocationCapabilitiesInner;
import com.azure.resourcemanager.sql.models.CapabilityGroup;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in CapabilitiesClient. */
public interface CapabilitiesClient {
    /**
     * Gets the subscription capabilities available for the specified location.
     *
     * @param locationName The location name whose capabilities are retrieved.
     * @param include If specified, restricts the response to only include the selected item.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the subscription capabilities available for the specified location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<LocationCapabilitiesInner>> listByLocationWithResponseAsync(
        String locationName, CapabilityGroup include);

    /**
     * Gets the subscription capabilities available for the specified location.
     *
     * @param locationName The location name whose capabilities are retrieved.
     * @param include If specified, restricts the response to only include the selected item.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the subscription capabilities available for the specified location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<LocationCapabilitiesInner> listByLocationAsync(String locationName, CapabilityGroup include);

    /**
     * Gets the subscription capabilities available for the specified location.
     *
     * @param locationName The location name whose capabilities are retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the subscription capabilities available for the specified location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<LocationCapabilitiesInner> listByLocationAsync(String locationName);

    /**
     * Gets the subscription capabilities available for the specified location.
     *
     * @param locationName The location name whose capabilities are retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the subscription capabilities available for the specified location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LocationCapabilitiesInner listByLocation(String locationName);

    /**
     * Gets the subscription capabilities available for the specified location.
     *
     * @param locationName The location name whose capabilities are retrieved.
     * @param include If specified, restricts the response to only include the selected item.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the subscription capabilities available for the specified location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<LocationCapabilitiesInner> listByLocationWithResponse(
        String locationName, CapabilityGroup include, Context context);
}
