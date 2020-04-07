// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * The TimeSeriesBaseline model.
 */
@Fluent
public final class TimeSeriesBaseline {
    /*
     * The aggregation type of the metric.
     */
    @JsonProperty(value = "aggregation", required = true)
    private String aggregation;

    /*
     * The dimensions of this time series.
     */
    @JsonProperty(value = "dimensions")
    private List<MetricSingleDimension> dimensions;

    /*
     * The list of timestamps of the baselines.
     */
    @JsonProperty(value = "timestamps", required = true)
    private List<OffsetDateTime> timestamps;

    /*
     * The baseline values for each sensitivity.
     */
    @JsonProperty(value = "data", required = true)
    private List<SingleBaseline> data;

    /*
     * The baseline metadata values.
     */
    @JsonProperty(value = "metadata")
    private List<BaselineMetadata> metadata;

    /**
     * Get the aggregation property: The aggregation type of the metric.
     * 
     * @return the aggregation value.
     */
    public String aggregation() {
        return this.aggregation;
    }

    /**
     * Set the aggregation property: The aggregation type of the metric.
     * 
     * @param aggregation the aggregation value to set.
     * @return the TimeSeriesBaseline object itself.
     */
    public TimeSeriesBaseline withAggregation(String aggregation) {
        this.aggregation = aggregation;
        return this;
    }

    /**
     * Get the dimensions property: The dimensions of this time series.
     * 
     * @return the dimensions value.
     */
    public List<MetricSingleDimension> dimensions() {
        return this.dimensions;
    }

    /**
     * Set the dimensions property: The dimensions of this time series.
     * 
     * @param dimensions the dimensions value to set.
     * @return the TimeSeriesBaseline object itself.
     */
    public TimeSeriesBaseline withDimensions(List<MetricSingleDimension> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * Get the timestamps property: The list of timestamps of the baselines.
     * 
     * @return the timestamps value.
     */
    public List<OffsetDateTime> timestamps() {
        return this.timestamps;
    }

    /**
     * Set the timestamps property: The list of timestamps of the baselines.
     * 
     * @param timestamps the timestamps value to set.
     * @return the TimeSeriesBaseline object itself.
     */
    public TimeSeriesBaseline withTimestamps(List<OffsetDateTime> timestamps) {
        this.timestamps = timestamps;
        return this;
    }

    /**
     * Get the data property: The baseline values for each sensitivity.
     * 
     * @return the data value.
     */
    public List<SingleBaseline> data() {
        return this.data;
    }

    /**
     * Set the data property: The baseline values for each sensitivity.
     * 
     * @param data the data value to set.
     * @return the TimeSeriesBaseline object itself.
     */
    public TimeSeriesBaseline withData(List<SingleBaseline> data) {
        this.data = data;
        return this;
    }

    /**
     * Get the metadata property: The baseline metadata values.
     * 
     * @return the metadata value.
     */
    public List<BaselineMetadata> metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: The baseline metadata values.
     * 
     * @param metadata the metadata value to set.
     * @return the TimeSeriesBaseline object itself.
     */
    public TimeSeriesBaseline withMetadata(List<BaselineMetadata> metadata) {
        this.metadata = metadata;
        return this;
    }
}
