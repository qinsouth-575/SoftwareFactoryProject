package com.factory.entity;

public class Discountschedulebill {
    private Integer dsbid;

    private String dpbid;

    private String stocknumber;

    private Float discountprice;

    private String standby;

    private String remark;

    public Integer getDsbid() {
        return dsbid;
    }

    public void setDsbid(Integer dsbid) {
        this.dsbid = dsbid;
    }

    public String getDpbid() {
        return dpbid;
    }

    public void setDpbid(String dpbid) {
        this.dpbid = dpbid;
    }

    public String getStocknumber() {
        return stocknumber;
    }

    public void setStocknumber(String stocknumber) {
        this.stocknumber = stocknumber;
    }

    public Float getDiscountprice() {
        return discountprice;
    }

    public void setDiscountprice(Float discountprice) {
        this.discountprice = discountprice;
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