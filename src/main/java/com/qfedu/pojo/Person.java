package com.qfedu.pojo;

public class Person {
    private Long perId;

    private Long perUid;

    private Integer perSex;

    private String perName;

    private String perAddr;

    private Integer perFlag;

    public Long getPerId() {
        return perId;
    }

    public void setPerId(Long perId) {
        this.perId = perId;
    }

    public Long getPerUid() {
        return perUid;
    }

    public void setPerUid(Long perUid) {
        this.perUid = perUid;
    }

    public Integer getPerSex() {
        return perSex;
    }

    public void setPerSex(Integer perSex) {
        this.perSex = perSex;
    }

    public String getPerName() {
        return perName;
    }

    public void setPerName(String perName) {
        this.perName = perName == null ? null : perName.trim();
    }

    public String getPerAddr() {
        return perAddr;
    }

    public void setPerAddr(String perAddr) {
        this.perAddr = perAddr == null ? null : perAddr.trim();
    }

    public Integer getPerFlag() {
        return perFlag;
    }

    public void setPerFlag(Integer perFlag) {
        this.perFlag = perFlag;
    }
}