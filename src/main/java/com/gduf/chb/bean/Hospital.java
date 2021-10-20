package com.gduf.chb.bean;

import java.io.Serializable;

public class Hospital implements Serializable {
    private String hospitalNumber;

    private String code;

    private String hospitalName;

    private static final long serialVersionUID = 1L;

    public String getHospitalNumber() {
        return hospitalNumber;
    }

    public void setHospitalNumber(String hospitalNumber) {
        this.hospitalNumber = hospitalNumber == null ? null : hospitalNumber.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName == null ? null : hospitalName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", hospitalNumber=").append(hospitalNumber);
        sb.append(", code=").append(code);
        sb.append(", hospitalName=").append(hospitalName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}