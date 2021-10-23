package com.gduf.chb.bean;

import java.io.Serializable;

public class Hospital implements Serializable {
    private String hospitalnumber;

    private String code;

    private String hospitalname;

    private static final long serialVersionUID = 1L;

    public String getHospitalnumber() {
        return hospitalnumber;
    }

    public void setHospitalnumber(String hospitalnumber) {
        this.hospitalnumber = hospitalnumber == null ? null : hospitalnumber.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getHospitalname() {
        return hospitalname;
    }

    public void setHospitalname(String hospitalname) {
        this.hospitalname = hospitalname == null ? null : hospitalname.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", hospitalnumber=").append(hospitalnumber);
        sb.append(", code=").append(code);
        sb.append(", hospitalname=").append(hospitalname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}