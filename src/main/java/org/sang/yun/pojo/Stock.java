package org.sang.yun.pojo;

import java.util.Date;

public class Stock {
    private Integer id;

    private String stockNumber;

    private Integer clId;

    private Integer stockTypeId;

    private Integer waId;

    private Integer billId;

    private Date planDate;

    private String prepareName;

    private Date auditDate;

    private Date commitDate;

    private String remark;

    private Integer outOrIn;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStockNumber() {
        return stockNumber;
    }

    public void setStockNumber(String stockNumber) {
        this.stockNumber = stockNumber == null ? null : stockNumber.trim();
    }

    public Integer getClId() {
        return clId;
    }

    public void setClId(Integer clId) {
        this.clId = clId;
    }

    public Integer getStockTypeId() {
        return stockTypeId;
    }

    public void setStockTypeId(Integer stockTypeId) {
        this.stockTypeId = stockTypeId;
    }

    public Integer getWaId() {
        return waId;
    }

    public void setWaId(Integer waId) {
        this.waId = waId;
    }

    public Integer getBillId() {
        return billId;
    }

    public void setBillId(Integer billId) {
        this.billId = billId;
    }

    public Date getPlanDate() {
        return planDate;
    }

    public void setPlanDate(Date planDate) {
        this.planDate = planDate;
    }

    public String getPrepareName() {
        return prepareName;
    }

    public void setPrepareName(String prepareName) {
        this.prepareName = prepareName == null ? null : prepareName.trim();
    }

    public Date getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(Date auditDate) {
        this.auditDate = auditDate;
    }

    public Date getCommitDate() {
        return commitDate;
    }

    public void setCommitDate(Date commitDate) {
        this.commitDate = commitDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getOutOrIn() {
        return outOrIn;
    }

    public void setOutOrIn(Integer outOrIn) {
        this.outOrIn = outOrIn;
    }
}