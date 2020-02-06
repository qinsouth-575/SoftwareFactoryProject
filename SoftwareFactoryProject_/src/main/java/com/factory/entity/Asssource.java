package com.factory.entity;

public class Asssource {
    private String sourceid;

    private String sourcename;

    private String remark;

    private Short mergeoutstate;

    private Boolean changetype;

    private Integer flag;

    public String getSourceid() {
        return sourceid;
    }

    public void setSourceid(String sourceid) {
        this.sourceid = sourceid;
    }

    public String getSourcename() {
        return sourcename;
    }

    public void setSourcename(String sourcename) {
        this.sourcename = sourcename;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Short getMergeoutstate() {
        return mergeoutstate;
    }

    public void setMergeoutstate(Short mergeoutstate) {
        this.mergeoutstate = mergeoutstate;
    }

    public Boolean getChangetype() {
        return changetype;
    }

    public void setChangetype(Boolean changetype) {
        this.changetype = changetype;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}