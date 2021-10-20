package com.gduf.chb.bean;

import java.io.Serializable;

public class Riskregion implements Serializable {
    private Integer id;

    private String reportingPerson;

    private String region;

    private String riskSituation;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReportingPerson() {
        return reportingPerson;
    }

    public void setReportingPerson(String reportingPerson) {
        this.reportingPerson = reportingPerson == null ? null : reportingPerson.trim();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public String getRiskSituation() {
        return riskSituation;
    }

    public void setRiskSituation(String riskSituation) {
        this.riskSituation = riskSituation == null ? null : riskSituation.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", reportingPerson=").append(reportingPerson);
        sb.append(", region=").append(region);
        sb.append(", riskSituation=").append(riskSituation);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}