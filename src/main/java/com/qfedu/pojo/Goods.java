package com.qfedu.pojo;

public class Goods {
    private Long goodsId;

    private String goodsName;

    private String goodsStyle;

    private Integer goodsCount;

    private Integer goodsCommentnum;

    private Integer goodsGtid;

    private String goodsImg;

    private Double goodsPrice;

    private Integer goodsFlag;

    private String goodsModel;

    private Long goodsSales;

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getGoodsStyle() {
        return goodsStyle;
    }

    public void setGoodsStyle(String goodsStyle) {
        this.goodsStyle = goodsStyle == null ? null : goodsStyle.trim();
    }

    public Integer getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(Integer goodsCount) {
        this.goodsCount = goodsCount;
    }

    public Integer getGoodsCommentnum() {
        return goodsCommentnum;
    }

    public void setGoodsCommentnum(Integer goodsCommentnum) {
        this.goodsCommentnum = goodsCommentnum;
    }

    public Integer getGoodsGtid() {
        return goodsGtid;
    }

    public void setGoodsGtid(Integer goodsGtid) {
        this.goodsGtid = goodsGtid;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg == null ? null : goodsImg.trim();
    }

    public Double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Integer getGoodsFlag() {
        return goodsFlag;
    }

    public void setGoodsFlag(Integer goodsFlag) {
        this.goodsFlag = goodsFlag;
    }

    public String getGoodsModel() {
        return goodsModel;
    }

    public void setGoodsModel(String goodsModel) {
        this.goodsModel = goodsModel == null ? null : goodsModel.trim();
    }

    public Long getGoodsSales() {
        return goodsSales;
    }

    public void setGoodsSales(Long goodsSales) {
        this.goodsSales = goodsSales;
    }
}