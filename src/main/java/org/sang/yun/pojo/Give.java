package org.sang.yun.pojo;

public class Give {
    private Integer id;

    private String giType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGiType() {
        return giType;
    }

    public void setGiType(String giType) {
        this.giType = giType == null ? null : giType.trim();
    }
}