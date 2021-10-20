package com.gduf.chb.bean;

import java.io.Serializable;
import java.util.Date;

public class Nucleicacidreservation implements Serializable {
    private String idcard;

    private Date time;

    private String hospitalName;

    private String detectionType;

    private Boolean ispay;

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

    public String getDetectionType() {
        return detectionType;
    }

    public void setDetectionType(String detectionType) {
        this.detectionType = detectionType == null ? null : detectionType.trim();
    }

    public Boolean getIspay() {
        return ispay;
    }

    public void setIspay(Boolean ispay) {
        this.ispay = ispay;
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
        sb.append(", detectionType=").append(detectionType);
        sb.append(", ispay=").append(ispay);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}