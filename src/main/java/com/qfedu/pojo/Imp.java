package com.qfedu.pojo;

public class Imp {
    private Integer iId;

    private Integer iGid;

    private String iImg;

    private Integer iFlag;

    public Integer getiId() {
        return iId;
    }

    public void setiId(Integer iId) {
        this.iId = iId;
    }

    public Integer getiGid() {
        return iGid;
    }

    public void setiGid(Integer iGid) {
        this.iGid = iGid;
    }

    public String getiImg() {
        return iImg;
    }

    public void setiImg(String iImg) {
        this.iImg = iImg == null ? null : iImg.trim();
    }

    public Integer getiFlag() {
        return iFlag;
    }

    public void setiFlag(Integer iFlag) {
        this.iFlag = iFlag;
    }
}