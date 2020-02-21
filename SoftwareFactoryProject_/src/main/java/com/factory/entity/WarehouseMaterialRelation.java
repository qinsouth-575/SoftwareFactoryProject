package com.factory.entity;

public class WarehouseMaterialRelation {
    private Integer wmrId;

    private String matterId;

    private String warehouseid;

    private String warehousename;

    private Integer wmrBeginningStock;

    private Integer wmrExistingNumber;

    public Integer getWmrId() {
        return wmrId;
    }

    public void setWmrId(Integer wmrId) {
        this.wmrId = wmrId;
    }

    public String getMatterId() {
        return matterId;
    }

    public void setMatterId(String matterId) {
        this.matterId = matterId;
    }

    public String getWarehouseid() {
        return warehouseid;
    }

    public void setWarehouseid(String warehouseid) {
        this.warehouseid = warehouseid;
    }

    public String getWarehousename() {
        return warehousename;
    }

    public void setWarehousename(String warehousename) {
        this.warehousename = warehousename;
    }

    public Integer getWmrBeginningStock() {
        return wmrBeginningStock;
    }

    public void setWmrBeginningStock(Integer wmrBeginningStock) {
        this.wmrBeginningStock = wmrBeginningStock;
    }

    public Integer getWmrExistingNumber() {
        return wmrExistingNumber;
    }

    public void setWmrExistingNumber(Integer wmrExistingNumber) {
        this.wmrExistingNumber = wmrExistingNumber;
    }
}