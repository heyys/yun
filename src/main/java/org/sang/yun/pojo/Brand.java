package org.sang.yun.pojo;

public class Brand {
    private Integer id;

    private String brName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrName() {
        return brName;
    }

    public void setBrName(String brName) {
        this.brName = brName == null ? null : brName.trim();
    }
}