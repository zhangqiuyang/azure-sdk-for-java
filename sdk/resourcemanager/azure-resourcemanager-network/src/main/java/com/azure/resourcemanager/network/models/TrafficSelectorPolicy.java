// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** An traffic selector policy for a virtual network gateway connection. */
@Fluent
public final class TrafficSelectorPolicy {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TrafficSelectorPolicy.class);

    /*
     * A collection of local address spaces in CIDR format.
     */
    @JsonProperty(value = "localAddressRanges", required = true)
    private List<String> localAddressRanges;

    /*
     * A collection of remote address spaces in CIDR format.
     */
    @JsonProperty(value = "remoteAddressRanges", required = true)
    private List<String> remoteAddressRanges;

    /**
     * Get the localAddressRanges property: A collection of local address spaces in CIDR format.
     *
     * @return the localAddressRanges value.
     */
    public List<String> localAddressRanges() {
        return this.localAddressRanges;
    }

    /**
     * Set the localAddressRanges property: A collection of local address spaces in CIDR format.
     *
     * @param localAddressRanges the localAddressRanges value to set.
     * @return the TrafficSelectorPolicy object itself.
     */
    public TrafficSelectorPolicy withLocalAddressRanges(List<String> localAddressRanges) {
        this.localAddressRanges = localAddressRanges;
        return this;
    }

    /**
     * Get the remoteAddressRanges property: A collection of remote address spaces in CIDR format.
     *
     * @return the remoteAddressRanges value.
     */
    public List<String> remoteAddressRanges() {
        return this.remoteAddressRanges;
    }

    /**
     * Set the remoteAddressRanges property: A collection of remote address spaces in CIDR format.
     *
     * @param remoteAddressRanges the remoteAddressRanges value to set.
     * @return the TrafficSelectorPolicy object itself.
     */
    public TrafficSelectorPolicy withRemoteAddressRanges(List<String> remoteAddressRanges) {
        this.remoteAddressRanges = remoteAddressRanges;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (localAddressRanges() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property localAddressRanges in model TrafficSelectorPolicy"));
        }
        if (remoteAddressRanges() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property remoteAddressRanges in model TrafficSelectorPolicy"));
        }
    }
}
