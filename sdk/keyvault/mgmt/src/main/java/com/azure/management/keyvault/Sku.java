// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.keyvault;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Sku model.
 */
@Fluent
public final class Sku {
    /*
     * SKU family name
     */
    @JsonProperty(value = "family", required = true)
    private String family;

    /*
     * SKU name to specify whether the key vault is a standard vault or a
     * premium vault.
     */
    @JsonProperty(value = "name", required = true)
    private SkuName name;

    /**
     * Creates an instance of Sku class.
     */
    public Sku() {
        family = "A";
    }

    /**
     * Get the family property: SKU family name.
     * 
     * @return the family value.
     */
    public String family() {
        return this.family;
    }

    /**
     * Set the family property: SKU family name.
     * 
     * @param family the family value to set.
     * @return the Sku object itself.
     */
    public Sku withFamily(String family) {
        this.family = family;
        return this;
    }

    /**
     * Get the name property: SKU name to specify whether the key vault is a
     * standard vault or a premium vault.
     * 
     * @return the name value.
     */
    public SkuName name() {
        return this.name;
    }

    /**
     * Set the name property: SKU name to specify whether the key vault is a
     * standard vault or a premium vault.
     * 
     * @param name the name value to set.
     * @return the Sku object itself.
     */
    public Sku withName(SkuName name) {
        this.name = name;
        return this;
    }
}
