package org.sang.yun.pojo;

public class Stand {
    private Integer id;

    private String stImg;

    private String stName;

    private String stNumber;

    private Double stRetail;

    private Double stSell;

    private String stCode;

    private Integer startNumber;

    private Integer endNumber;

    private Double weight;

    private Double volume;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStImg() {
        return stImg;
    }

    public void setStImg(String stImg) {
        this.stImg = stImg == null ? null : stImg.trim();
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName == null ? null : stName.trim();
    }

    public String getStNumber() {
        return stNumber;
    }

    public void setStNumber(String stNumber) {
        this.stNumber = stNumber == null ? null : stNumber.trim();
    }

    public Double getStRetail() {
        return stRetail;
    }

    public void setStRetail(Double stRetail) {
        this.stRetail = stRetail;
    }

    public Double getStSell() {
        return stSell;
    }

    public void setStSell(Double stSell) {
        this.stSell = stSell;
    }

    public String getStCode() {
        return stCode;
    }

    public void setStCode(String stCode) {
        this.stCode = stCode == null ? null : stCode.trim();
    }

    public Integer getStartNumber() {
        return startNumber;
    }

    public void setStartNumber(Integer startNumber) {
        this.startNumber = startNumber;
    }

    public Integer getEndNumber() {
        return endNumber;
    }

    public void setEndNumber(Integer endNumber) {
        this.endNumber = endNumber;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }
}