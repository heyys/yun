package org.sang.yun.pojo;

import java.util.Date;

public class Runwater {
    private Integer id;

    private Integer run_number;

    private String reNumber;

    private String incomeType;

    private Double rePrice;

    private String payType;

    private String remark;

    private Date reDate;

    private Date creatDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRun_number() {
        return run_number;
    }

    public void setRun_number(Integer run_number) {
        this.run_number = run_number;
    }

    public String getReNumber() {
        return reNumber;
    }

    public void setReNumber(String reNumber) {
        this.reNumber = reNumber == null ? null : reNumber.trim();
    }

    public String getIncomeType() {
        return incomeType;
    }

    public void setIncomeType(String incomeType) {
        this.incomeType = incomeType == null ? null : incomeType.trim();
    }

    public Double getRePrice() {
        return rePrice;
    }

    public void setRePrice(Double rePrice) {
        this.rePrice = rePrice;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getReDate() {
        return reDate;
    }

    public void setReDate(Date reDate) {
        this.reDate = reDate;
    }

    public Date getCreatDate() {
        return creatDate;
    }

    public void setCreatDate(Date creatDate) {
        this.creatDate = creatDate;
    }
}