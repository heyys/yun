package org.sang.yun.pojo;

import java.util.Date;

public class Ordergood {
    private Integer id;

    private Integer clId;

    private Integer cl_type;

    private Double orderPrice;

    private Double receivedPrice;

    private Integer billId;

    private Integer fiId;

    private Integer saleId;

    private String orRemark;

    private Integer plId;

    private Date commitTime;

    private Date finishTime;

    private Date deliverTime;

    private Date cancelTime;

    private Integer proId;

    private Integer stId;

    private Integer arealId;

    private Integer waId;

    private String prepareName;

    private Integer emId;

    private Integer distId;

    private Date returnTime;

    private Integer printCount;

    private Integer orStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClId() {
        return clId;
    }

    public void setClId(Integer clId) {
        this.clId = clId;
    }

    public Integer getCl_type() {
        return cl_type;
    }

    public void setCl_type(Integer cl_type) {
        this.cl_type = cl_type;
    }

    public Double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Double getReceivedPrice() {
        return receivedPrice;
    }

    public void setReceivedPrice(Double receivedPrice) {
        this.receivedPrice = receivedPrice;
    }

    public Integer getBillId() {
        return billId;
    }

    public void setBillId(Integer billId) {
        this.billId = billId;
    }

    public Integer getFiId() {
        return fiId;
    }

    public void setFiId(Integer fiId) {
        this.fiId = fiId;
    }

    public Integer getSaleId() {
        return saleId;
    }

    public void setSaleId(Integer saleId) {
        this.saleId = saleId;
    }

    public String getOrRemark() {
        return orRemark;
    }

    public void setOrRemark(String orRemark) {
        this.orRemark = orRemark == null ? null : orRemark.trim();
    }

    public Integer getPlId() {
        return plId;
    }

    public void setPlId(Integer plId) {
        this.plId = plId;
    }

    public Date getCommitTime() {
        return commitTime;
    }

    public void setCommitTime(Date commitTime) {
        this.commitTime = commitTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public Date getDeliverTime() {
        return deliverTime;
    }

    public void setDeliverTime(Date deliverTime) {
        this.deliverTime = deliverTime;
    }

    public Date getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public Integer getStId() {
        return stId;
    }

    public void setStId(Integer stId) {
        this.stId = stId;
    }

    public Integer getArealId() {
        return arealId;
    }

    public void setArealId(Integer arealId) {
        this.arealId = arealId;
    }

    public Integer getWaId() {
        return waId;
    }

    public void setWaId(Integer waId) {
        this.waId = waId;
    }

    public String getPrepareName() {
        return prepareName;
    }

    public void setPrepareName(String prepareName) {
        this.prepareName = prepareName == null ? null : prepareName.trim();
    }

    public Integer getEmId() {
        return emId;
    }

    public void setEmId(Integer emId) {
        this.emId = emId;
    }

    public Integer getDistId() {
        return distId;
    }

    public void setDistId(Integer distId) {
        this.distId = distId;
    }

    public Date getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
    }

    public Integer getPrintCount() {
        return printCount;
    }

    public void setPrintCount(Integer printCount) {
        this.printCount = printCount;
    }

    public Integer getOrStatus() {
        return orStatus;
    }

    public void setOrStatus(Integer orStatus) {
        this.orStatus = orStatus;
    }
}