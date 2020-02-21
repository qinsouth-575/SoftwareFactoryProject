package com.factory.entity;

import java.util.Date;

public class Inventoryledger {
    private Integer ilid;

    private String warehouseid;

    private String matterId;

    private String sourcebillname;

    private String sourceno;

    private String whoroos;

    private String fristwarehousing;

    private Integer amount;

    private Date recorddate;

    private String standby1;

    private String standby2;

    public Integer getIlid() {
        return ilid;
    }

    public void setIlid(Integer ilid) {
        this.ilid = ilid;
    }

    public String getWarehouseid() {
        return warehouseid;
    }

    public void setWarehouseid(String warehouseid) {
        this.warehouseid = warehouseid;
    }

    public String getMatterId() {
        return matterId;
    }

    public void setMatterId(String matterId) {
        this.matterId = matterId;
    }

    public String getSourcebillname() {
        return sourcebillname;
    }

    public void setSourcebillname(String sourcebillname) {
        this.sourcebillname = sourcebillname;
    }

    public String getSourceno() {
        return sourceno;
    }

    public void setSourceno(String sourceno) {
        this.sourceno = sourceno;
    }

    public String getWhoroos() {
        return whoroos;
    }

    public void setWhoroos(String whoroos) {
        this.whoroos = whoroos;
    }

    public String getFristwarehousing() {
        return fristwarehousing;
    }

    public void setFristwarehousing(String fristwarehousing) {
        this.fristwarehousing = fristwarehousing;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Date getRecorddate() {
        return recorddate;
    }

    public void setRecorddate(Date recorddate) {
        this.recorddate = recorddate;
    }

    public String getStandby1() {
        return standby1;
    }

    public void setStandby1(String standby1) {
        this.standby1 = standby1;
    }

    public String getStandby2() {
        return standby2;
    }

    public void setStandby2(String standby2) {
        this.standby2 = standby2;
    }
}