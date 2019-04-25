package org.sang.yun.pojo;

public class Supplier {
    private Integer id;

    private String suName;

    private Integer waId;

    private String suContact;

    private String suMobile;

    private String suPhone;

    private String suAddress;

    private String suRemark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSuName() {
        return suName;
    }

    public void setSuName(String suName) {
        this.suName = suName == null ? null : suName.trim();
    }

    public Integer getWaId() {
        return waId;
    }

    public void setWaId(Integer waId) {
        this.waId = waId;
    }

    public String getSuContact() {
        return suContact;
    }

    public void setSuContact(String suContact) {
        this.suContact = suContact == null ? null : suContact.trim();
    }

    public String getSuMobile() {
        return suMobile;
    }

    public void setSuMobile(String suMobile) {
        this.suMobile = suMobile == null ? null : suMobile.trim();
    }

    public String getSuPhone() {
        return suPhone;
    }

    public void setSuPhone(String suPhone) {
        this.suPhone = suPhone == null ? null : suPhone.trim();
    }

    public String getSuAddress() {
        return suAddress;
    }

    public void setSuAddress(String suAddress) {
        this.suAddress = suAddress == null ? null : suAddress.trim();
    }

    public String getSuRemark() {
        return suRemark;
    }

    public void setSuRemark(String suRemark) {
        this.suRemark = suRemark == null ? null : suRemark.trim();
    }
}