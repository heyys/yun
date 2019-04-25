package org.sang.yun.pojo;

import java.util.Date;

public class Receipt {
    private Integer id;

    private String reNumber;

    private String payName;

    private Double rePrice;

    private Double written_off;

    private Integer incomeTypeId;

    private String payType;

    private Integer billId;

    private String auditName;

    private String prepareName;

    private Date reDate;

    private Date commitDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReNumber() {
        return reNumber;
    }

    public void setReNumber(String reNumber) {
        this.reNumber = reNumber == null ? null : reNumber.trim();
    }

    public String getPayName() {
        return payName;
    }

    public void setPayName(String payName) {
        this.payName = payName == null ? null : payName.trim();
    }

    public Double getRePrice() {
        return rePrice;
    }

    public void setRePrice(Double rePrice) {
        this.rePrice = rePrice;
    }

    public Double getWritten_off() {
        return written_off;
    }

    public void setWritten_off(Double written_off) {
        this.written_off = written_off;
    }

    public Integer getIncomeTypeId() {
        return incomeTypeId;
    }

    public void setIncomeTypeId(Integer incomeTypeId) {
        this.incomeTypeId = incomeTypeId;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    public Integer getBillId() {
        return billId;
    }

    public void setBillId(Integer billId) {
        this.billId = billId;
    }

    public String getAuditName() {
        return auditName;
    }

    public void setAuditName(String auditName) {
        this.auditName = auditName == null ? null : auditName.trim();
    }

    public String getPrepareName() {
        return prepareName;
    }

    public void setPrepareName(String prepareName) {
        this.prepareName = prepareName == null ? null : prepareName.trim();
    }

    public Date getReDate() {
        return reDate;
    }

    public void setReDate(Date reDate) {
        this.reDate = reDate;
    }

    public Date getCommitDate() {
        return commitDate;
    }

    public void setCommitDate(Date commitDate) {
        this.commitDate = commitDate;
    }
}