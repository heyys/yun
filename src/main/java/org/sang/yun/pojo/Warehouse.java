package org.sang.yun.pojo;

public class Warehouse {
    private Integer id;

    private String waName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWaName() {
        return waName;
    }

    public void setWaName(String waName) {
        this.waName = waName == null ? null : waName.trim();
    }
}