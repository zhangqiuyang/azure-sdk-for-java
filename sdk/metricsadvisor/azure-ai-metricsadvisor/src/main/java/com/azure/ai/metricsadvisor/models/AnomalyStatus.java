// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AnomalyStatus. */
public final class AnomalyStatus extends ExpandableStringEnum<AnomalyStatus> {
    /** Static value Active for AnomalyStatus. */
    public static final AnomalyStatus ACTIVE = fromString("Active");

    /** Static value Resolved for AnomalyStatus. */
    public static final AnomalyStatus RESOLVED = fromString("Resolved");

    /**
     * Creates or finds a AnomalyStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AnomalyStatus.
     */
    @JsonCreator
    public static AnomalyStatus fromString(String name) {
        return fromString(name, AnomalyStatus.class);
    }

    /** @return known AnomalyStatus values. */
    public static Collection<AnomalyStatus> values() {
        return values(AnomalyStatus.class);
    }
}
