package com.factory.entity;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class SaleQuotation {
    private String sqId;//单据号码

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date sqDocumentTime;//单据日期

    private String currencyId;//币别id
    private String currencyName;

    private Float sqExchangeRate;//汇率

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date sqEffectiveTime;//有效时间

    private Integer sqTax;//是否含税

    private String customerId;//客户id
    private String customerName;

    private String sqDeliveryAddress;//送货地址

    private Integer staffId;//业务人员id

    private String teamId;//所属部门（部门id）

    private String sqMonograph;

    private String sqReviewer;//复核人员

    private String sqWatchword;

    private String sqTailclause;//尾款

    private String sqRemark;//备注

    private String sqAuditing;

    private String sqYn;

    private String sqCustom1;//自定栏1

    private String sqCustom2;

    private String sqCustom3;
    
    private List<SaleQuotationDetails>list;
    
    public String getCurrencyName() {
		return currencyName;
	}

	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public List<SaleQuotationDetails> getList() {
		return list;
	}

	public void setList(List<SaleQuotationDetails> list) {
		this.list = list;
	}

	public String getSqId() {
        return sqId;
    }

    public void setSqId(String sqId) {
        this.sqId = sqId;
    }

    public Date getSqDocumentTime() {
        return sqDocumentTime;
    }

    public void setSqDocumentTime(Date sqDocumentTime) {
        this.sqDocumentTime = sqDocumentTime;
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public Float getSqExchangeRate() {
        return sqExchangeRate;
    }

    public void setSqExchangeRate(Float sqExchangeRate) {
        this.sqExchangeRate = sqExchangeRate;
    }

    public Date getSqEffectiveTime() {
        return sqEffectiveTime;
    }

    public void setSqEffectiveTime(Date sqEffectiveTime) {
        this.sqEffectiveTime = sqEffectiveTime;
    }

    public Integer getSqTax() {
        return sqTax;
    }

    public void setSqTax(Integer sqTax) {
        this.sqTax = sqTax;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getSqDeliveryAddress() {
        return sqDeliveryAddress;
    }

    public void setSqDeliveryAddress(String sqDeliveryAddress) {
        this.sqDeliveryAddress = sqDeliveryAddress;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getSqMonograph() {
        return sqMonograph;
    }

    public void setSqMonograph(String sqMonograph) {
        this.sqMonograph = sqMonograph;
    }

    public String getSqReviewer() {
        return sqReviewer;
    }

    public void setSqReviewer(String sqReviewer) {
        this.sqReviewer = sqReviewer;
    }

    public String getSqWatchword() {
        return sqWatchword;
    }

    public void setSqWatchword(String sqWatchword) {
        this.sqWatchword = sqWatchword;
    }

    public String getSqTailclause() {
        return sqTailclause;
    }

    public void setSqTailclause(String sqTailclause) {
        this.sqTailclause = sqTailclause;
    }

    public String getSqRemark() {
        return sqRemark;
    }

    public void setSqRemark(String sqRemark) {
        this.sqRemark = sqRemark;
    }

    public String getSqAuditing() {
        return sqAuditing;
    }

    public void setSqAuditing(String sqAuditing) {
        this.sqAuditing = sqAuditing;
    }

    public String getSqYn() {
        return sqYn;
    }

    public void setSqYn(String sqYn) {
        this.sqYn = sqYn;
    }

    public String getSqCustom1() {
        return sqCustom1;
    }

    public void setSqCustom1(String sqCustom1) {
        this.sqCustom1 = sqCustom1;
    }

    public String getSqCustom2() {
        return sqCustom2;
    }

    public void setSqCustom2(String sqCustom2) {
        this.sqCustom2 = sqCustom2;
    }

    public String getSqCustom3() {
        return sqCustom3;
    }

    public void setSqCustom3(String sqCustom3) {
        this.sqCustom3 = sqCustom3;
    }
}
