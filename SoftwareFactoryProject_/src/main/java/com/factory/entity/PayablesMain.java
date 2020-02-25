package com.factory.entity;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class PayablesMain {
    private String payablesId;

    private String supplierId;

    private String payablesSupplierName;

    private Integer scsId;
    
    //在主表中定义降表的集合  ---应付冲款单想秒的集合
    private List<PayablesDetail> listPayablesDateil;

    

	public List<PayablesDetail> getListPayablesDateil() {
		return listPayablesDateil;
	}

	public void setListPayablesDateil(List<PayablesDetail> listPayablesDateil) {
		this.listPayablesDateil = listPayablesDateil;
	}

	private Integer payablesSatName1;

    private Float payablesPrice1;

    private Integer payablesSatName2;

    private Float payablesPrice2;

    private Integer payablesSatName3;

    private Float payablesPrice3;

    private Integer payablesZhekou;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date payablesEndtime;
    
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date payablesPayablestime;

    private String payablesCurrencyName;

    private String currencyId;

    private String payablesCurrencyInexchange;

    private Float payablesExchangeRate;

    private String payablesType;

    private String payablesVoucherno;

    private String payablesRemarks;

    private String staffId;

    private String payablesTeamName;

    private String projectId;

    private String payablesProjectName;

    private String payablesBillpersonnel;

    private String payablesReviewers;

    private Integer payablesAuditstatus;

    private String payablesAuditing;

    private String payablesYn;

    private String payablesCustom1;

    private String payablesCustom2;

    private String payablesCustom3;

    public String getPayablesId() {
        return payablesId;
    }

    public void setPayablesId(String payablesId) {
        this.payablesId = payablesId;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getPayablesSupplierName() {
        return payablesSupplierName;
    }

    public void setPayablesSupplierName(String payablesSupplierName) {
        this.payablesSupplierName = payablesSupplierName;
    }

    public Integer getScsId() {
        return scsId;
    }

    public void setScsId(Integer scsId) {
        this.scsId = scsId;
    }

    public Integer getPayablesSatName1() {
        return payablesSatName1;
    }

    public void setPayablesSatName1(Integer payablesSatName1) {
        this.payablesSatName1 = payablesSatName1;
    }

    public Float getPayablesPrice1() {
        return payablesPrice1;
    }

    public void setPayablesPrice1(Float payablesPrice1) {
        this.payablesPrice1 = payablesPrice1;
    }

    public Integer getPayablesSatName2() {
        return payablesSatName2;
    }

    public void setPayablesSatName2(Integer payablesSatName2) {
        this.payablesSatName2 = payablesSatName2;
    }

    public Float getPayablesPrice2() {
        return payablesPrice2;
    }

    public void setPayablesPrice2(Float payablesPrice2) {
        this.payablesPrice2 = payablesPrice2;
    }

    public Integer getPayablesSatName3() {
        return payablesSatName3;
    }

    public void setPayablesSatName3(Integer payablesSatName3) {
        this.payablesSatName3 = payablesSatName3;
    }

    public Float getPayablesPrice3() {
        return payablesPrice3;
    }

    public void setPayablesPrice3(Float payablesPrice3) {
        this.payablesPrice3 = payablesPrice3;
    }

    public Integer getPayablesZhekou() {
        return payablesZhekou;
    }

    public void setPayablesZhekou(Integer payablesZhekou) {
        this.payablesZhekou = payablesZhekou;
    }

    public Date getPayablesEndtime() {
        return payablesEndtime;
    }

    public void setPayablesEndtime(Date payablesEndtime) {
        this.payablesEndtime = payablesEndtime;
    }

    public Date getPayablesPayablestime() {
        return payablesPayablestime;
    }

    public void setPayablesPayablestime(Date payablesPayablestime) {
        this.payablesPayablestime = payablesPayablestime;
    }

    public String getPayablesCurrencyName() {
        return payablesCurrencyName;
    }

    public void setPayablesCurrencyName(String payablesCurrencyName) {
        this.payablesCurrencyName = payablesCurrencyName;
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public String getPayablesCurrencyInexchange() {
        return payablesCurrencyInexchange;
    }

    public void setPayablesCurrencyInexchange(String payablesCurrencyInexchange) {
        this.payablesCurrencyInexchange = payablesCurrencyInexchange;
    }

    public Float getPayablesExchangeRate() {
        return payablesExchangeRate;
    }

    public void setPayablesExchangeRate(Float payablesExchangeRate) {
        this.payablesExchangeRate = payablesExchangeRate;
    }

    public String getPayablesType() {
        return payablesType;
    }

    public void setPayablesType(String payablesType) {
        this.payablesType = payablesType;
    }

    public String getPayablesVoucherno() {
        return payablesVoucherno;
    }

    public void setPayablesVoucherno(String payablesVoucherno) {
        this.payablesVoucherno = payablesVoucherno;
    }

    public String getPayablesRemarks() {
        return payablesRemarks;
    }

    public void setPayablesRemarks(String payablesRemarks) {
        this.payablesRemarks = payablesRemarks;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getPayablesTeamName() {
        return payablesTeamName;
    }

    public void setPayablesTeamName(String payablesTeamName) {
        this.payablesTeamName = payablesTeamName;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getPayablesProjectName() {
        return payablesProjectName;
    }

    public void setPayablesProjectName(String payablesProjectName) {
        this.payablesProjectName = payablesProjectName;
    }

    public String getPayablesBillpersonnel() {
        return payablesBillpersonnel;
    }

    public void setPayablesBillpersonnel(String payablesBillpersonnel) {
        this.payablesBillpersonnel = payablesBillpersonnel;
    }

    public String getPayablesReviewers() {
        return payablesReviewers;
    }

    public void setPayablesReviewers(String payablesReviewers) {
        this.payablesReviewers = payablesReviewers;
    }

    public Integer getPayablesAuditstatus() {
        return payablesAuditstatus;
    }

    public void setPayablesAuditstatus(Integer payablesAuditstatus) {
        this.payablesAuditstatus = payablesAuditstatus;
    }

    public String getPayablesAuditing() {
        return payablesAuditing;
    }

    public void setPayablesAuditing(String payablesAuditing) {
        this.payablesAuditing = payablesAuditing;
    }

    public String getPayablesYn() {
        return payablesYn;
    }

    public void setPayablesYn(String payablesYn) {
        this.payablesYn = payablesYn;
    }

    public String getPayablesCustom1() {
        return payablesCustom1;
    }

    public void setPayablesCustom1(String payablesCustom1) {
        this.payablesCustom1 = payablesCustom1;
    }

    public String getPayablesCustom2() {
        return payablesCustom2;
    }

    public void setPayablesCustom2(String payablesCustom2) {
        this.payablesCustom2 = payablesCustom2;
    }

    public String getPayablesCustom3() {
        return payablesCustom3;
    }

    public void setPayablesCustom3(String payablesCustom3) {
        this.payablesCustom3 = payablesCustom3;
    }
}