package org.sang.yun.pojo;

public class Promotion {
    private Integer id;

    private String prStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrStatus() {
        return prStatus;
    }

    public void setPrStatus(String prStatus) {
        this.prStatus = prStatus == null ? null : prStatus.trim();
    }
}