package com.gduf.chb.bean;

import java.io.Serializable;

public class Vaccineandnucleicacid implements Serializable {
    private Integer hospitalnumber;

    private String reagenttype;

    private Integer totalamount;

    private Integer remainingamount;

    private static final long serialVersionUID = 1L;

    public Integer getHospitalnumber() {
        return hospitalnumber;
    }

    public void setHospitalnumber(Integer hospitalnumber) {
        this.hospitalnumber = hospitalnumber;
    }

    public String getReagenttype() {
        return reagenttype;
    }

    public void setReagenttype(String reagenttype) {
        this.reagenttype = reagenttype == null ? null : reagenttype.trim();
    }

    public Integer getTotalamount() {
        return totalamount;
    }

    public void setTotalamount(Integer totalamount) {
        this.totalamount = totalamount;
    }

    public Integer getRemainingamount() {
        return remainingamount;
    }

    public void setRemainingamount(Integer remainingamount) {
        this.remainingamount = remainingamount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", hospitalnumber=").append(hospitalnumber);
        sb.append(", reagenttype=").append(reagenttype);
        sb.append(", totalamount=").append(totalamount);
        sb.append(", remainingamount=").append(remainingamount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}