package com.qfedu.pojo;

import java.util.List;

public class GoodsType {
    private Integer gtId;

    private String gtName;

    private String gtImg;

    private Integer gtFlag;

    private Integer gtKind;

    private List<GoodsType> TwoGoodsType;

    public void setTwoGoodsType(List<GoodsType> twoGoodsType) {
        TwoGoodsType = twoGoodsType;
    }

    public List<GoodsType> getTwoGoodsType() {
        return TwoGoodsType;
    }

    public Integer getGtId() {
        return gtId;
    }

    public void setGtId(Integer gtId) {
        this.gtId = gtId;
    }

    public String getGtName() {
        return gtName;
    }

    public void setGtName(String gtName) {
        this.gtName = gtName == null ? null : gtName.trim();
    }

    public String getGtImg() {
        return gtImg;
    }

    public void setGtImg(String gtImg) {
        this.gtImg = gtImg == null ? null : gtImg.trim();
    }

    public Integer getGtFlag() {
        return gtFlag;
    }

    public void setGtFlag(Integer gtFlag) {
        this.gtFlag = gtFlag;
    }

    public Integer getGtKind() {
        return gtKind;
    }

    public void setGtKind(Integer gtKind) {
        this.gtKind = gtKind;
    }
}