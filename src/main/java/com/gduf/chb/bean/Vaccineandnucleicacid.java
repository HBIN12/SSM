package com.gduf.chb.bean;

import java.io.Serializable;

public class Vaccineandnucleicacid implements Serializable {
    private Integer hospitalNumber;

    private String reagentType;

    private Integer totalAmount;

    private Integer remainingAmount;

    private static final long serialVersionUID = 1L;

    public Integer getHospitalNumber() {
        return hospitalNumber;
    }

    public void setHospitalNumber(Integer hospitalNumber) {
        this.hospitalNumber = hospitalNumber;
    }

    public String getReagentType() {
        return reagentType;
    }

    public void setReagentType(String reagentType) {
        this.reagentType = reagentType == null ? null : reagentType.trim();
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getRemainingAmount() {
        return remainingAmount;
    }

    public void setRemainingAmount(Integer remainingAmount) {
        this.remainingAmount = remainingAmount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", hospitalNumber=").append(hospitalNumber);
        sb.append(", reagentType=").append(reagentType);
        sb.append(", totalAmount=").append(totalAmount);
        sb.append(", remainingAmount=").append(remainingAmount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}