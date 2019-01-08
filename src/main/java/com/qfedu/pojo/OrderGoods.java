package com.qfedu.pojo;

public class OrderGoods {
    private Integer ogId;

    private String ogGid;

    private String ogCount;

    private Integer ogUid;

    private String ogFlag;

    private Integer ogOid;

    public Integer getOgId() {
        return ogId;
    }

    public void setOgId(Integer ogId) {
        this.ogId = ogId;
    }

    public String getOgGid() {
        return ogGid;
    }

    public void setOgGid(String ogGid) {
        this.ogGid = ogGid == null ? null : ogGid.trim();
    }

    public String getOgCount() {
        return ogCount;
    }

    public void setOgCount(String ogCount) {
        this.ogCount = ogCount == null ? null : ogCount.trim();
    }

    public Integer getOgUid() {
        return ogUid;
    }

    public void setOgUid(Integer ogUid) {
        this.ogUid = ogUid;
    }

    public String getOgFlag() {
        return ogFlag;
    }

    public void setOgFlag(String ogFlag) {
        this.ogFlag = ogFlag == null ? null : ogFlag.trim();
    }

    public Integer getOgOid() {
        return ogOid;
    }

    public void setOgOid(Integer ogOid) {
        this.ogOid = ogOid;
    }
}