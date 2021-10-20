package com.gduf.chb.bean;

import java.io.Serializable;
import java.util.Date;

public class Vaccinationreservation implements Serializable {
    private String idcard;

    private Date time;

    private String hospitalName;

    private String vaccineType;

    private static final long serialVersionUID = 1L;

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName == null ? null : hospitalName.trim();
    }

    public String getVaccineType() {
        return vaccineType;
    }

    public void setVaccineType(String vaccineType) {
        this.vaccineType = vaccineType == null ? null : vaccineType.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", idcard=").append(idcard);
        sb.append(", time=").append(time);
        sb.append(", hospitalName=").append(hospitalName);
        sb.append(", vaccineType=").append(vaccineType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}