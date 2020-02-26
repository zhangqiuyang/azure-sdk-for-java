/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.cosmosdb.v2019_12_12.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.cosmosdb.v2019_12_12.Collections;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.cosmosdb.v2019_12_12.CollectionDatabasisDatabaseAccountMetricDefinition;
import com.microsoft.azure.management.cosmosdb.v2019_12_12.CollectionDatabasisDatabaseAccountMetric;
import com.microsoft.azure.management.cosmosdb.v2019_12_12.CollectionDatabasisDatabaseAccountUsage;

class CollectionsImpl extends WrapperImpl<CollectionsInner> implements Collections {
    private final CosmosDBManager manager;

    CollectionsImpl(CosmosDBManager manager) {
        super(manager.inner().collections());
        this.manager = manager;
    }

    public CosmosDBManager manager() {
        return this.manager;
    }

    private CollectionDatabasisDatabaseAccountMetricDefinitionImpl wrapCollectionDatabasisDatabaseAccountMetricDefinitionModel(MetricDefinitionInner inner) {
        return  new CollectionDatabasisDatabaseAccountMetricDefinitionImpl(inner, manager());
    }

    private CollectionDatabasisDatabaseAccountMetricImpl wrapCollectionDatabasisDatabaseAccountMetricModel(MetricInner inner) {
        return  new CollectionDatabasisDatabaseAccountMetricImpl(inner, manager());
    }

    private CollectionDatabasisDatabaseAccountUsageImpl wrapCollectionDatabasisDatabaseAccountUsageModel(UsageInner inner) {
        return  new CollectionDatabasisDatabaseAccountUsageImpl(inner, manager());
    }

    @Override
    public Observable<CollectionDatabasisDatabaseAccountMetricDefinition> listMetricDefinitionsAsync(String resourceGroupName, String accountName, String databaseRid, String collectionRid) {
        CollectionsInner client = this.inner();
        return client.listMetricDefinitionsAsync(resourceGroupName, accountName, databaseRid, collectionRid)
        .flatMap(new Func1<List<MetricDefinitionInner>, Observable<MetricDefinitionInner>>() {
            @Override
            public Observable<MetricDefinitionInner> call(List<MetricDefinitionInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<MetricDefinitionInner, CollectionDatabasisDatabaseAccountMetricDefinition>() {
            @Override
            public CollectionDatabasisDatabaseAccountMetricDefinition call(MetricDefinitionInner inner) {
                return wrapCollectionDatabasisDatabaseAccountMetricDefinitionModel(inner);
            }
        });
    }

    @Override
    public Observable<CollectionDatabasisDatabaseAccountMetric> listMetricsAsync(String resourceGroupName, String accountName, String databaseRid, String collectionRid, String filter) {
        CollectionsInner client = this.inner();
        return client.listMetricsAsync(resourceGroupName, accountName, databaseRid, collectionRid, filter)
        .flatMap(new Func1<List<MetricInner>, Observable<MetricInner>>() {
            @Override
            public Observable<MetricInner> call(List<MetricInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<MetricInner, CollectionDatabasisDatabaseAccountMetric>() {
            @Override
            public CollectionDatabasisDatabaseAccountMetric call(MetricInner inner) {
                return wrapCollectionDatabasisDatabaseAccountMetricModel(inner);
            }
        });
    }

    @Override
    public Observable<CollectionDatabasisDatabaseAccountUsage> listUsagesAsync(String resourceGroupName, String accountName, String databaseRid, String collectionRid) {
        CollectionsInner client = this.inner();
        return client.listUsagesAsync(resourceGroupName, accountName, databaseRid, collectionRid)
        .flatMap(new Func1<List<UsageInner>, Observable<UsageInner>>() {
            @Override
            public Observable<UsageInner> call(List<UsageInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<UsageInner, CollectionDatabasisDatabaseAccountUsage>() {
            @Override
            public CollectionDatabasisDatabaseAccountUsage call(UsageInner inner) {
                return wrapCollectionDatabasisDatabaseAccountUsageModel(inner);
            }
        });
    }

}