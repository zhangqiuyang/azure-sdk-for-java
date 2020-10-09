// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.fluent.models.GeoBackupPolicyInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The response to a list geo backup policies request. */
@Fluent
public final class GeoBackupPolicyListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GeoBackupPolicyListResult.class);

    /*
     * The list of geo backup policies.
     */
    @JsonProperty(value = "value")
    private List<GeoBackupPolicyInner> value;

    /**
     * Get the value property: The list of geo backup policies.
     *
     * @return the value value.
     */
    public List<GeoBackupPolicyInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of geo backup policies.
     *
     * @param value the value value to set.
     * @return the GeoBackupPolicyListResult object itself.
     */
    public GeoBackupPolicyListResult withValue(List<GeoBackupPolicyInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
