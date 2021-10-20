package com.gduf.chb.bean;

import java.io.Serializable;

public class Patient implements Serializable {
    private String idcard;

    private String place;

    private String diagnosisResults;

    private static final long serialVersionUID = 1L;

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }

    public String getDiagnosisResults() {
        return diagnosisResults;
    }

    public void setDiagnosisResults(String diagnosisResults) {
        this.diagnosisResults = diagnosisResults == null ? null : diagnosisResults.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", idcard=").append(idcard);
        sb.append(", place=").append(place);
        sb.append(", diagnosisResults=").append(diagnosisResults);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}