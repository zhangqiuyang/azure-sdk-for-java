// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.cosmosdb;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * The TrackedResource model.
 */
@Fluent
public final class TrackedResource extends ProxyResource {
    /*
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * The geo-location where the resource lives
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /**
     * Get the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     * 
     * @param tags the tags value to set.
     * @return the TrackedResource object itself.
     */
    public TrackedResource withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the location property: The geo-location where the resource lives.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The geo-location where the resource lives.
     * 
     * @param location the location value to set.
     * @return the TrackedResource object itself.
     */
    public TrackedResource withLocation(String location) {
        this.location = location;
        return this;
    }
}
