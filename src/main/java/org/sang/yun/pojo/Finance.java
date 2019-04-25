package org.sang.yun.pojo;

public class Finance {
    private Integer id;

    private String fiStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFiStatus() {
        return fiStatus;
    }

    public void setFiStatus(String fiStatus) {
        this.fiStatus = fiStatus == null ? null : fiStatus.trim();
    }
}