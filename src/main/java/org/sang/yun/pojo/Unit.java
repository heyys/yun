package org.sang.yun.pojo;

public class Unit {
    private Integer id;

    private String unName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUnName() {
        return unName;
    }

    public void setUnName(String unName) {
        this.unName = unName == null ? null : unName.trim();
    }
}