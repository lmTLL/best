package com.qfedu.pojo;

public class Gimpression {
    private Integer preId;

    private Long preGid;

    private String preImpression;

    private Integer preFlag;

    public Integer getPreId() {
        return preId;
    }

    public void setPreId(Integer preId) {
        this.preId = preId;
    }

    public Long getPreGid() {
        return preGid;
    }

    public void setPreGid(Long preGid) {
        this.preGid = preGid;
    }

    public String getPreImpression() {
        return preImpression;
    }

    public void setPreImpression(String preImpression) {
        this.preImpression = preImpression == null ? null : preImpression.trim();
    }

    public Integer getPreFlag() {
        return preFlag;
    }

    public void setPreFlag(Integer preFlag) {
        this.preFlag = preFlag;
    }
}