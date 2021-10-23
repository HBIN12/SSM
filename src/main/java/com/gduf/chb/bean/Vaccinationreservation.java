package com.gduf.chb.bean;

import java.io.Serializable;
import java.util.Date;

public class Vaccinationreservation implements Serializable {
    private String idcard;

    private Date time;

    private String hospitalname;

    private String vaccinetype;

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

    public String getHospitalname() {
        return hospitalname;
    }

    public void setHospitalname(String hospitalname) {
        this.hospitalname = hospitalname == null ? null : hospitalname.trim();
    }

    public String getVaccinetype() {
        return vaccinetype;
    }

    public void setVaccinetype(String vaccinetype) {
        this.vaccinetype = vaccinetype == null ? null : vaccinetype.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", idcard=").append(idcard);
        sb.append(", time=").append(time);
        sb.append(", hospitalname=").append(hospitalname);
        sb.append(", vaccinetype=").append(vaccinetype);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}