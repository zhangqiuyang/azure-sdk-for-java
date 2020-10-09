// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;
import java.util.UUID;

/** The AnomalyResult model. */
@Fluent
public final class AnomalyResult {
    /*
     * metric unique id
     *
     * only return for alerting anomaly result
     */
    @JsonProperty(value = "metricId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID metricId;

    /*
     * anomaly detection configuration unique id
     *
     * only return for alerting anomaly result
     */
    @JsonProperty(value = "anomalyDetectionConfigurationId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID anomalyDetectionConfigurationId;

    /*
     * anomaly time
     */
    @JsonProperty(value = "timestamp", required = true)
    private OffsetDateTime timestamp;

    /*
     * created time
     *
     * only return for alerting result
     */
    @JsonProperty(value = "createdTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdTime;

    /*
     * modified time
     *
     * only return for alerting result
     */
    @JsonProperty(value = "modifiedTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime modifiedTime;

    /*
     * dimension specified for series
     */
    @JsonProperty(value = "dimension", required = true)
    private Map<String, String> dimension;

    /*
     * The property property.
     */
    @JsonProperty(value = "property", required = true)
    private AnomalyProperty property;

    /**
     * Get the metricId property: metric unique id
     *
     * <p>only return for alerting anomaly result.
     *
     * @return the metricId value.
     */
    public UUID getMetricId() {
        return this.metricId;
    }

    /**
     * Get the anomalyDetectionConfigurationId property: anomaly detection configuration unique id
     *
     * <p>only return for alerting anomaly result.
     *
     * @return the anomalyDetectionConfigurationId value.
     */
    public UUID getAnomalyDetectionConfigurationId() {
        return this.anomalyDetectionConfigurationId;
    }

    /**
     * Get the timestamp property: anomaly time.
     *
     * @return the timestamp value.
     */
    public OffsetDateTime getTimestamp() {
        return this.timestamp;
    }

    /**
     * Set the timestamp property: anomaly time.
     *
     * @param timestamp the timestamp value to set.
     * @return the AnomalyResult object itself.
     */
    public AnomalyResult setTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get the createdTime property: created time
     *
     * <p>only return for alerting result.
     *
     * @return the createdTime value.
     */
    public OffsetDateTime getCreatedTime() {
        return this.createdTime;
    }

    /**
     * Get the modifiedTime property: modified time
     *
     * <p>only return for alerting result.
     *
     * @return the modifiedTime value.
     */
    public OffsetDateTime getModifiedTime() {
        return this.modifiedTime;
    }

    /**
     * Get the dimension property: dimension specified for series.
     *
     * @return the dimension value.
     */
    public Map<String, String> getDimension() {
        return this.dimension;
    }

    /**
     * Set the dimension property: dimension specified for series.
     *
     * @param dimension the dimension value to set.
     * @return the AnomalyResult object itself.
     */
    public AnomalyResult setDimension(Map<String, String> dimension) {
        this.dimension = dimension;
        return this;
    }

    /**
     * Get the property property: The property property.
     *
     * @return the property value.
     */
    public AnomalyProperty getProperty() {
        return this.property;
    }

    /**
     * Set the property property: The property property.
     *
     * @param property the property value to set.
     * @return the AnomalyResult object itself.
     */
    public AnomalyResult setProperty(AnomalyProperty property) {
        this.property = property;
        return this;
    }
}
