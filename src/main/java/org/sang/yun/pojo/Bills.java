package org.sang.yun.pojo;

public class Bills {
    private Integer id;

    private String biStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBiStatus() {
        return biStatus;
    }

    public void setBiStatus(String biStatus) {
        this.biStatus = biStatus == null ? null : biStatus.trim();
    }
}