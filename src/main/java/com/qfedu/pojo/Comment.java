package com.qfedu.pojo;

import java.util.Date;

public class Comment {
    private Long comId;

    private Integer comScore;

    private Long comGid;

    private Long comUid;

    private String comContent;

    private Date comTime;

    private Integer comFlag;

    public Long getComId() {
        return comId;
    }

    public void setComId(Long comId) {
        this.comId = comId;
    }

    public Integer getComScore() {
        return comScore;
    }

    public void setComScore(Integer comScore) {
        this.comScore = comScore;
    }

    public Long getComGid() {
        return comGid;
    }

    public void setComGid(Long comGid) {
        this.comGid = comGid;
    }

    public Long getComUid() {
        return comUid;
    }

    public void setComUid(Long comUid) {
        this.comUid = comUid;
    }

    public String getComContent() {
        return comContent;
    }

    public void setComContent(String comContent) {
        this.comContent = comContent == null ? null : comContent.trim();
    }

    public Date getComTime() {
        return comTime;
    }

    public void setComTime(Date comTime) {
        this.comTime = comTime;
    }

    public Integer getComFlag() {
        return comFlag;
    }

    public void setComFlag(Integer comFlag) {
        this.comFlag = comFlag;
    }
}