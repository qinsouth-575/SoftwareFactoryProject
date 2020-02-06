package com.factory.entity;

public class Stockschedulebill {
    private Integer ssbid;

    private Integer spbid;

    private String stocknumber;

    private Integer amount;

    private String standby;

    public Integer getSsbid() {
        return ssbid;
    }

    public void setSsbid(Integer ssbid) {
        this.ssbid = ssbid;
    }

    public Integer getSpbid() {
        return spbid;
    }

    public void setSpbid(Integer spbid) {
        this.spbid = spbid;
    }

    public String getStocknumber() {
        return stocknumber;
    }

    public void setStocknumber(String stocknumber) {
        this.stocknumber = stocknumber;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getStandby() {
        return standby;
    }

    public void setStandby(String standby) {
        this.standby = standby;
    }
}