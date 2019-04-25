package org.sang.yun.pojo;

public class Dist {
    private Integer id;

    private String disType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDisType() {
        return disType;
    }

    public void setDisType(String disType) {
        this.disType = disType == null ? null : disType.trim();
    }
}