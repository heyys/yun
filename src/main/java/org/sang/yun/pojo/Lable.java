package org.sang.yun.pojo;

public class Lable {
    private Integer id;

    private String laName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLaName() {
        return laName;
    }

    public void setLaName(String laName) {
        this.laName = laName == null ? null : laName.trim();
    }
}