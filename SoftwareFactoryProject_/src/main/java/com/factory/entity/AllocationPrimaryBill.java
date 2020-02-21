package com.factory.entity;

import java.util.Date;

public class AllocationPrimaryBill {
    private String apbid;

    private Date apbdate;

    private String foldwarehouseid;

    private String exportwarehouseid;

    private String documentmaker;

    private String verifier;

    private String custom1;

    private String custom2;

    private String standby;

    private String remark;

    public String getApbid() {
        return apbid;
    }

    public void setApbid(String apbid) {
        this.apbid = apbid;
    }

    public Date getApbdate() {
        return apbdate;
    }

    public void setApbdate(Date apbdate) {
        this.apbdate = apbdate;
    }

    public String getFoldwarehouseid() {
        return foldwarehouseid;
    }

    public void setFoldwarehouseid(String foldwarehouseid) {
        this.foldwarehouseid = foldwarehouseid;
    }

    public String getExportwarehouseid() {
        return exportwarehouseid;
    }

    public void setExportwarehouseid(String exportwarehouseid) {
        this.exportwarehouseid = exportwarehouseid;
    }

    public String getDocumentmaker() {
        return documentmaker;
    }

    public void setDocumentmaker(String documentmaker) {
        this.documentmaker = documentmaker;
    }

    public String getVerifier() {
        return verifier;
    }

    public void setVerifier(String verifier) {
        this.verifier = verifier;
    }

    public String getCustom1() {
        return custom1;
    }

    public void setCustom1(String custom1) {
        this.custom1 = custom1;
    }

    public String getCustom2() {
        return custom2;
    }

    public void setCustom2(String custom2) {
        this.custom2 = custom2;
    }

    public String getStandby() {
        return standby;
    }

    public void setStandby(String standby) {
        this.standby = standby;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}