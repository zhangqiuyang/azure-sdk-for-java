// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for UpgradeState.
 */
public enum UpgradeState {
    /**
     * Enum value RollingForward.
     */
    ROLLING_FORWARD("RollingForward"),

    /**
     * Enum value Cancelled.
     */
    CANCELLED("Cancelled"),

    /**
     * Enum value Completed.
     */
    COMPLETED("Completed"),

    /**
     * Enum value Faulted.
     */
    FAULTED("Faulted");

    /**
     * The actual serialized value for a UpgradeState instance.
     */
    private final String value;

    UpgradeState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a UpgradeState instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed UpgradeState object, or null if unable to parse.
     */
    @JsonCreator
    public static UpgradeState fromString(String value) {
        UpgradeState[] items = UpgradeState.values();
        for (UpgradeState item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
