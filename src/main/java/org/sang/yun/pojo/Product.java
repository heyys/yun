package org.sang.yun.pojo;

public class Product {
    private Integer id;

    private String proNumber;

    private String proName;

    private Integer cateId;

    private Integer proStatus;

    private Integer stId;

    private Integer unId;

    private Integer usableStock;

    private Integer sysStock;

    private String keyWord;

    private Double solePrice;

    private Double totalPrice;

    private Integer imgId;

    private Integer suId;

    private Integer brandId;

    private Integer laId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProNumber() {
        return proNumber;
    }

    public void setProNumber(String proNumber) {
        this.proNumber = proNumber == null ? null : proNumber.trim();
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName == null ? null : proName.trim();
    }

    public Integer getCateId() {
        return cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    public Integer getProStatus() {
        return proStatus;
    }

    public void setProStatus(Integer proStatus) {
        this.proStatus = proStatus;
    }

    public Integer getStId() {
        return stId;
    }

    public void setStId(Integer stId) {
        this.stId = stId;
    }

    public Integer getUnId() {
        return unId;
    }

    public void setUnId(Integer unId) {
        this.unId = unId;
    }

    public Integer getUsableStock() {
        return usableStock;
    }

    public void setUsableStock(Integer usableStock) {
        this.usableStock = usableStock;
    }

    public Integer getSysStock() {
        return sysStock;
    }

    public void setSysStock(Integer sysStock) {
        this.sysStock = sysStock;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord == null ? null : keyWord.trim();
    }

    public Double getSolePrice() {
        return solePrice;
    }

    public void setSolePrice(Double solePrice) {
        this.solePrice = solePrice;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getImgId() {
        return imgId;
    }

    public void setImgId(Integer imgId) {
        this.imgId = imgId;
    }

    public Integer getSuId() {
        return suId;
    }

    public void setSuId(Integer suId) {
        this.suId = suId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getLaId() {
        return laId;
    }

    public void setLaId(Integer laId) {
        this.laId = laId;
    }
}