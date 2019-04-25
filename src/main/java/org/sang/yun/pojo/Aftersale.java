package org.sang.yun.pojo;

public class Aftersale {
    private Integer id;

    private String saleStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSaleStatus() {
        return saleStatus;
    }

    public void setSaleStatus(String saleStatus) {
        this.saleStatus = saleStatus == null ? null : saleStatus.trim();
    }
}