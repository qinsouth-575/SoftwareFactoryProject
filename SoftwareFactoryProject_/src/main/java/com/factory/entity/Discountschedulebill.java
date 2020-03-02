package com.factory.entity;

public class Discountschedulebill {
    private Integer dsbid;

    private String dpbid;

    private String stocknumber;

    private String mattername;

    private String mattersize;

    private String unitid;

    private String unitname;

    private Integer matterNowcount;

    private Float matterNowavgcost;

    private Float unitprice;

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

    public String getMattername() {
        return mattername;
    }

    public void setMattername(String mattername) {
        this.mattername = mattername;
    }

    public String getMattersize() {
        return mattersize;
    }

    public void setMattersize(String mattersize) {
        this.mattersize = mattersize;
    }

    public String getUnitid() {
        return unitid;
    }

    public void setUnitid(String unitid) {
        this.unitid = unitid;
    }

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname;
    }

    public Integer getMatterNowcount() {
        return matterNowcount;
    }

    public void setMatterNowcount(Integer matterNowcount) {
        this.matterNowcount = matterNowcount;
    }

    public Float getMatterNowavgcost() {
        return matterNowavgcost;
    }

    public void setMatterNowavgcost(Float matterNowavgcost) {
        this.matterNowavgcost = matterNowavgcost;
    }

    public Float getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(Float unitprice) {
        this.unitprice = unitprice;
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