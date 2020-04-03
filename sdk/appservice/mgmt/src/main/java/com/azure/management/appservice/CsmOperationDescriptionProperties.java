// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The CsmOperationDescriptionProperties model.
 */
@Fluent
public final class CsmOperationDescriptionProperties {
    /*
     * Resource metrics service provided by Microsoft.Insights resource
     * provider.
     */
    @JsonProperty(value = "serviceSpecification")
    private ServiceSpecification serviceSpecification;

    /**
     * Get the serviceSpecification property: Resource metrics service provided
     * by Microsoft.Insights resource provider.
     * 
     * @return the serviceSpecification value.
     */
    public ServiceSpecification serviceSpecification() {
        return this.serviceSpecification;
    }

    /**
     * Set the serviceSpecification property: Resource metrics service provided
     * by Microsoft.Insights resource provider.
     * 
     * @param serviceSpecification the serviceSpecification value to set.
     * @return the CsmOperationDescriptionProperties object itself.
     */
    public CsmOperationDescriptionProperties withServiceSpecification(ServiceSpecification serviceSpecification) {
        this.serviceSpecification = serviceSpecification;
        return this;
    }
}