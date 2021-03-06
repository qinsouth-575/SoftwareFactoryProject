package com.factory.entity;

public class SaleQuotationDetails {
    private String sqdProdid;//栏号

    private String sqdSerno;//物料编号

    private String sqdProdname;//物料名称

    private String sqdProdsize;//规格型号

    private String sqdUnitname;//单位名称

    private Integer sqdSquantity;//数量

    private Float sqdZkqprice;//折扣前单价

    private Float sqdDiscount;//折数

    private Float sqdUnitprice;//单价

    private Float sqdPrice;//金额

    private Float sqdTaxrate;//税率

    private Float sqdTaxlimit;//税额

    private Float sqdTaxinclusiveprice;//含税金额

    private Integer sqdComplimentart;//赠品（0，1）

    private String sqdItemremark;//分录备注

    private String sqId;//详表主键 关联主表

    private String sqdAuditing;//制单人员（当前登录者）

    private String sqdYn;//复核人员（当前登录者）

    private String sqdCustom1;

    private String sqdCustom2;

    private String sqdCustom3;

    public String getSqdProdid() {
        return sqdProdid;
    }

    public void setSqdProdid(String sqdProdid) {
        this.sqdProdid = sqdProdid;
    }

    public String getSqdSerno() {
        return sqdSerno;
    }

    public void setSqdSerno(String sqdSerno) {
        this.sqdSerno = sqdSerno;
    }

    public String getSqdProdname() {
        return sqdProdname;
    }

    public void setSqdProdname(String sqdProdname) {
        this.sqdProdname = sqdProdname;
    }

    public String getSqdProdsize() {
        return sqdProdsize;
    }

    public void setSqdProdsize(String sqdProdsize) {
        this.sqdProdsize = sqdProdsize;
    }

    public String getSqdUnitname() {
        return sqdUnitname;
    }

    public void setSqdUnitname(String sqdUnitname) {
        this.sqdUnitname = sqdUnitname;
    }

    public Integer getSqdSquantity() {
        return sqdSquantity;
    }

    public void setSqdSquantity(Integer sqdSquantity) {
        this.sqdSquantity = sqdSquantity;
    }

    public Float getSqdZkqprice() {
        return sqdZkqprice;
    }

    public void setSqdZkqprice(Float sqdZkqprice) {
        this.sqdZkqprice = sqdZkqprice;
    }

    public Float getSqdDiscount() {
        return sqdDiscount;
    }

    public void setSqdDiscount(Float sqdDiscount) {
        this.sqdDiscount = sqdDiscount;
    }

    public Float getSqdUnitprice() {
        return sqdUnitprice;
    }

    public void setSqdUnitprice(Float sqdUnitprice) {
        this.sqdUnitprice = sqdUnitprice;
    }

    public Float getSqdPrice() {
        return sqdPrice;
    }

    public void setSqdPrice(Float sqdPrice) {
        this.sqdPrice = sqdPrice;
    }

    public Float getSqdTaxrate() {
        return sqdTaxrate;
    }

    public void setSqdTaxrate(Float sqdTaxrate) {
        this.sqdTaxrate = sqdTaxrate;
    }

    public Float getSqdTaxlimit() {
        return sqdTaxlimit;
    }

    public void setSqdTaxlimit(Float sqdTaxlimit) {
        this.sqdTaxlimit = sqdTaxlimit;
    }

    public Float getSqdTaxinclusiveprice() {
        return sqdTaxinclusiveprice;
    }

    public void setSqdTaxinclusiveprice(Float sqdTaxinclusiveprice) {
        this.sqdTaxinclusiveprice = sqdTaxinclusiveprice;
    }

    public Integer getSqdComplimentart() {
        return sqdComplimentart;
    }

    public void setSqdComplimentart(Integer sqdComplimentart) {
        this.sqdComplimentart = sqdComplimentart;
    }

    public String getSqdItemremark() {
        return sqdItemremark;
    }

    public void setSqdItemremark(String sqdItemremark) {
        this.sqdItemremark = sqdItemremark;
    }

    public String getSqId() {
        return sqId;
    }

    public void setSqId(String sqId) {
        this.sqId = sqId;
    }

    public String getSqdAuditing() {
        return sqdAuditing;
    }

    public void setSqdAuditing(String sqdAuditing) {
        this.sqdAuditing = sqdAuditing;
    }

    public String getSqdYn() {
        return sqdYn;
    }

    public void setSqdYn(String sqdYn) {
        this.sqdYn = sqdYn;
    }

    public String getSqdCustom1() {
        return sqdCustom1;
    }

    public void setSqdCustom1(String sqdCustom1) {
        this.sqdCustom1 = sqdCustom1;
    }

    public String getSqdCustom2() {
        return sqdCustom2;
    }

    public void setSqdCustom2(String sqdCustom2) {
        this.sqdCustom2 = sqdCustom2;
    }

    public String getSqdCustom3() {
        return sqdCustom3;
    }

    public void setSqdCustom3(String sqdCustom3) {
        this.sqdCustom3 = sqdCustom3;
    }
}