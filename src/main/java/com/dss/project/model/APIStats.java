package com.dss.project.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "APIStats")
public class APIStats {

    @Id
    private ObjectId objectId;
    @Field
    private String URL;
    @Field
    private String operation;
    @Field
    private Integer mean;
    @Field
    private Integer max;

    public APIStats() {
    }

    public APIStats(String URL, String operation, Integer mean, Integer max) {
        this.URL = URL;
        this.operation = operation;
        this.mean = mean;
        this.max = max;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Integer getMean() {
        return mean;
    }

    public void setMean(Integer mean) {
        this.mean = mean;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    @Override
    public String toString() {
        return "APIStats{" +
                "URL='" + URL + '\'' +
                ", operation='" + operation + '\'' +
                ", mean=" + mean +
                ", max=" + max +
                '}';
    }
}
