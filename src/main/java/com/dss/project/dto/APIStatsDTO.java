package com.dss.project.dto;

public class APIStatsDTO {
    private String URL;
    private String operation;
    private Integer mean;
    private Integer max;

    public APIStatsDTO(String URL, String operation, Integer mean, Integer max) {
        this.URL = URL;
        this.operation = operation;
        this.mean = mean;
        this.max = max;
    }

    public APIStatsDTO() {
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

}
