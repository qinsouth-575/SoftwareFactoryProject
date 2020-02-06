package com.factory.entity;

import java.util.Date;

public class Stockprimarybill {
    private Integer spbid;

    private Date spbdate;

    private Integer warehouseid;

    private String stocktype;

    private String standby;

    public Integer getSpbid() {
        return spbid;
    }

    public void setSpbid(Integer spbid) {
        this.spbid = spbid;
    }

    public Date getSpbdate() {
        return spbdate;
    }

    public void setSpbdate(Date spbdate) {
        this.spbdate = spbdate;
    }

    public Integer getWarehouseid() {
        return warehouseid;
    }

    public void setWarehouseid(Integer warehouseid) {
        this.warehouseid = warehouseid;
    }

    public String getStocktype() {
        return stocktype;
    }

    public void setStocktype(String stocktype) {
        this.stocktype = stocktype;
    }

    public String getStandby() {
        return standby;
    }

    public void setStandby(String standby) {
        this.standby = standby;
    }
}