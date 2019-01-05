package com.qfedu.pojo;

public class Order {
    private Long odId;

    private Integer odState;

    private Integer odFlag;

    private Double odPrice;

    private Long odUid;

    private Long odGid;

    private Long odCid;

    public Long getOdId() {
        return odId;
    }

    public void setOdId(Long odId) {
        this.odId = odId;
    }

    public Integer getOdState() {
        return odState;
    }

    public void setOdState(Integer odState) {
        this.odState = odState;
    }

    public Integer getOdFlag() {
        return odFlag;
    }

    public void setOdFlag(Integer odFlag) {
        this.odFlag = odFlag;
    }

    public Double getOdPrice() {
        return odPrice;
    }

    public void setOdPrice(Double odPrice) {
        this.odPrice = odPrice;
    }

    public Long getOdUid() {
        return odUid;
    }

    public void setOdUid(Long odUid) {
        this.odUid = odUid;
    }

    public Long getOdGid() {
        return odGid;
    }

    public void setOdGid(Long odGid) {
        this.odGid = odGid;
    }

    public Long getOdCid() {
        return odCid;
    }

    public void setOdCid(Long odCid) {
        this.odCid = odCid;
    }
}