package org.sang.yun.pojo;

public class Areal {
    private Integer id;

    private String arealName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArealName() {
        return arealName;
    }

    public void setArealName(String arealName) {
        this.arealName = arealName == null ? null : arealName.trim();
    }
}