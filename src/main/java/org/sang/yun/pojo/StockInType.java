package org.sang.yun.pojo;

public class StockInType {
    private Integer id;

    private String inType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInType() {
        return inType;
    }

    public void setInType(String inType) {
        this.inType = inType == null ? null : inType.trim();
    }
}