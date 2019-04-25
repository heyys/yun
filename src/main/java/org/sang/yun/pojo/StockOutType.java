package org.sang.yun.pojo;

public class StockOutType {
    private Integer id;

    private String outType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOutType() {
        return outType;
    }

    public void setOutType(String outType) {
        this.outType = outType == null ? null : outType.trim();
    }
}