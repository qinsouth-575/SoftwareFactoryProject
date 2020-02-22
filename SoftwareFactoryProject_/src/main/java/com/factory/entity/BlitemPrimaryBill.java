package com.factory.entity;

import java.util.Date;

public class BlitemPrimaryBill {
    private String bpbid;

    private Date bpbdate;

    private String warehouseid;

    private String inventorychecker;

    private String documentmaker;

    private String verifier;

    private String custom1;

    private String custom2;

    private String standby;

    private String remark;

    public String getBpbid() {
        return bpbid;
    }

    public void setBpbid(String bpbid) {
        this.bpbid = bpbid;
    }

    public Date getBpbdate() {
        return bpbdate;
    }

    public void setBpbdate(Date bpbdate) {
        this.bpbdate = bpbdate;
    }

    public String getWarehouseid() {
        return warehouseid;
    }

    public void setWarehouseid(String warehouseid) {
        this.warehouseid = warehouseid;
    }

    public String getInventorychecker() {
        return inventorychecker;
    }

    public void setInventorychecker(String inventorychecker) {
        this.inventorychecker = inventorychecker;
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