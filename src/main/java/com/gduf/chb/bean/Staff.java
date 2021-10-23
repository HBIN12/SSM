package com.gduf.chb.bean;

import java.io.Serializable;

public class Staff implements Serializable {
    private String id;

    private String hospitalnumber;

    private String number;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getHospitalnumber() {
        return hospitalnumber;
    }

    public void setHospitalnumber(String hospitalnumber) {
        this.hospitalnumber = hospitalnumber == null ? null : hospitalnumber.trim();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", hospitalnumber=").append(hospitalnumber);
        sb.append(", number=").append(number);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}