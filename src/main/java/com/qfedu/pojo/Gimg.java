package com.qfedu.pojo;

public class Gimg {
    private Long imgId;

    private Long imgGid;

    private String imgPath;

    private Integer imgFlag;

    public Long getImgId() {
        return imgId;
    }

    public void setImgId(Long imgId) {
        this.imgId = imgId;
    }

    public Long getImgGid() {
        return imgGid;
    }

    public void setImgGid(Long imgGid) {
        this.imgGid = imgGid;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath == null ? null : imgPath.trim();
    }

    public Integer getImgFlag() {
        return imgFlag;
    }

    public void setImgFlag(Integer imgFlag) {
        this.imgFlag = imgFlag;
    }
}