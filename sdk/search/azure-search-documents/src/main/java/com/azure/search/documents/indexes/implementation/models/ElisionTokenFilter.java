// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Removes elisions. For example, "l'avion" (the plane) will be converted to "avion" (plane). This token filter is
 * implemented using Apache Lucene.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type")
@JsonTypeName("#Microsoft.Azure.Search.ElisionTokenFilter")
@JsonFlatten
@Fluent
public class ElisionTokenFilter extends TokenFilter {
    /*
     * The set of articles to remove.
     */
    @JsonProperty(value = "articles")
    private List<String> articles;

    /**
     * Creates an instance of ElisionTokenFilter class.
     *
     * @param name the name value to set.
     */
    @JsonCreator
    public ElisionTokenFilter(@JsonProperty(value = "name", required = true) String name) {
        super(name);
    }

    /**
     * Get the articles property: The set of articles to remove.
     *
     * @return the articles value.
     */
    public List<String> getArticles() {
        return this.articles;
    }

    /**
     * Set the articles property: The set of articles to remove.
     *
     * @param articles the articles value to set.
     * @return the ElisionTokenFilter object itself.
     */
    public ElisionTokenFilter setArticles(List<String> articles) {
        this.articles = articles;
        return this;
    }
}
