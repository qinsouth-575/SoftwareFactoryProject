package com.factory.entity;

import java.util.Date;

public class TPurchaseInquiryDetails {
    private Date prodid;

    private String serno;

    private String prodname;

    private String prodsize;

    private Integer sunitid;

    private Integer squantity;

    private Float oldprice;

    private Float discount;

    private Float sprice;

    private Float amount;

    private Float taxrate;

    private Float taxamt;

    private Float vftotal;

    private Integer isgift;

    private String trantype;

    private String fromno;

    private String itemremark;

    private String remark;

    public Date getProdid() {
        return prodid;
    }

    public void setProdid(Date prodid) {
        this.prodid = prodid;
    }

    public String getSerno() {
        return serno;
    }

    public void setSerno(String serno) {
        this.serno = serno;
    }

    public String getProdname() {
        return prodname;
    }

    public void setProdname(String prodname) {
        this.prodname = prodname;
    }

    public String getProdsize() {
        return prodsize;
    }

    public void setProdsize(String prodsize) {
        this.prodsize = prodsize;
    }

    public Integer getSunitid() {
        return sunitid;
    }

    public void setSunitid(Integer sunitid) {
        this.sunitid = sunitid;
    }

    public Integer getSquantity() {
        return squantity;
    }

    public void setSquantity(Integer squantity) {
        this.squantity = squantity;
    }

    public Float getOldprice() {
        return oldprice;
    }

    public void setOldprice(Float oldprice) {
        this.oldprice = oldprice;
    }

    public Float getDiscount() {
        return discount;
    }

    public void setDiscount(Float discount) {
        this.discount = discount;
    }

    public Float getSprice() {
        return sprice;
    }

    public void setSprice(Float sprice) {
        this.sprice = sprice;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public Float getTaxrate() {
        return taxrate;
    }

    public void setTaxrate(Float taxrate) {
        this.taxrate = taxrate;
    }

    public Float getTaxamt() {
        return taxamt;
    }

    public void setTaxamt(Float taxamt) {
        this.taxamt = taxamt;
    }

    public Float getVftotal() {
        return vftotal;
    }

    public void setVftotal(Float vftotal) {
        this.vftotal = vftotal;
    }

    public Integer getIsgift() {
        return isgift;
    }

    public void setIsgift(Integer isgift) {
        this.isgift = isgift;
    }

    public String getTrantype() {
        return trantype;
    }

    public void setTrantype(String trantype) {
        this.trantype = trantype;
    }

    public String getFromno() {
        return fromno;
    }

    public void setFromno(String fromno) {
        this.fromno = fromno;
    }

    public String getItemremark() {
        return itemremark;
    }

    public void setItemremark(String itemremark) {
        this.itemremark = itemremark;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}