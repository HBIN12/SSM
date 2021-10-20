package com.gduf.chb.bean;

import java.io.Serializable;

public class Userhealth implements Serializable {
    private String idcard;

    private String nucleicAcid;

    private String vaccination;

    private String temperature;

    private String current;

    private static final long serialVersionUID = 1L;

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getNucleicAcid() {
        return nucleicAcid;
    }

    public void setNucleicAcid(String nucleicAcid) {
        this.nucleicAcid = nucleicAcid == null ? null : nucleicAcid.trim();
    }

    public String getVaccination() {
        return vaccination;
    }

    public void setVaccination(String vaccination) {
        this.vaccination = vaccination == null ? null : vaccination.trim();
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature == null ? null : temperature.trim();
    }

    public String getCurrent() {
        return current;
    }

    public void setCurrent(String current) {
        this.current = current == null ? null : current.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", idcard=").append(idcard);
        sb.append(", nucleicAcid=").append(nucleicAcid);
        sb.append(", vaccination=").append(vaccination);
        sb.append(", temperature=").append(temperature);
        sb.append(", current=").append(current);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}