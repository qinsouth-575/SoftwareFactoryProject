package com.factory.entity;

import java.util.Date;
import java.util.List;

public class SaleOrder {
    private Integer soId;

    private String customerorderId;

    private Date soDocumentTime;

    private String soDocumentnumber;

    private String soDeliveryAddress;

    private String sotId;

    private String soCustomerorder;

    private Integer soTax;

    private String currencyId;

    private Integer soOderStatic;

    private String staffId;

    private String teamId;

    private String soMonograph;

    private String soReviewer;

    private String soSubordinate;

    private String soWatchword;

    private String soTailclause;

    private String soRemark;

    private String soAccountOwnership;

    private String soCollectionTime;

    private String soCollectionMonth;

    private String soCollectionTerms;

    private String soCollectionTermsDay;

    private String soAuditing;

    private String soYn;

    private String soCustom1;

    private String soCustom2;

    private String soCustom3;
    
    private List<SaleOrderDetail> sodList; 
    
    private Integer pageNum;
    private Integer pageSize;
    
    private String flag;					//goInsert：新增	goUpdate：修改
    

    public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public List<SaleOrderDetail> getSodList() {
		return sodList;
	}

	public void setSodList(List<SaleOrderDetail> sodList) {
		this.sodList = sodList;
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getSoId() {
        return soId;
    }

    public void setSoId(Integer soId) {
        this.soId = soId;
    }

    public String getCustomerorderId() {
        return customerorderId;
    }

    public void setCustomerorderId(String customerorderId) {
        this.customerorderId = customerorderId;
    }

    public Date getSoDocumentTime() {
        return soDocumentTime;
    }

    public void setSoDocumentTime(Date soDocumentTime) {
        this.soDocumentTime = soDocumentTime;
    }

    public String getSoDocumentnumber() {
        return soDocumentnumber;
    }

    public void setSoDocumentnumber(String soDocumentnumber) {
        this.soDocumentnumber = soDocumentnumber;
    }

    public String getSoDeliveryAddress() {
        return soDeliveryAddress;
    }

    public void setSoDeliveryAddress(String soDeliveryAddress) {
        this.soDeliveryAddress = soDeliveryAddress;
    }

    public String getSotId() {
        return sotId;
    }

    public void setSotId(String sotId) {
        this.sotId = sotId;
    }

    public String getSoCustomerorder() {
        return soCustomerorder;
    }

    public void setSoCustomerorder(String soCustomerorder) {
        this.soCustomerorder = soCustomerorder;
    }

    public Integer getSoTax() {
        return soTax;
    }

    public void setSoTax(Integer soTax) {
        this.soTax = soTax;
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public Integer getSoOderStatic() {
        return soOderStatic;
    }

    public void setSoOderStatic(Integer soOderStatic) {
        this.soOderStatic = soOderStatic;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getSoMonograph() {
        return soMonograph;
    }

    public void setSoMonograph(String soMonograph) {
        this.soMonograph = soMonograph;
    }

    public String getSoReviewer() {
        return soReviewer;
    }

    public void setSoReviewer(String soReviewer) {
        this.soReviewer = soReviewer;
    }

    public String getSoSubordinate() {
        return soSubordinate;
    }

    public void setSoSubordinate(String soSubordinate) {
        this.soSubordinate = soSubordinate;
    }

    public String getSoWatchword() {
        return soWatchword;
    }

    public void setSoWatchword(String soWatchword) {
        this.soWatchword = soWatchword;
    }

    public String getSoTailclause() {
        return soTailclause;
    }

    public void setSoTailclause(String soTailclause) {
        this.soTailclause = soTailclause;
    }

    public String getSoRemark() {
        return soRemark;
    }

    public void setSoRemark(String soRemark) {
        this.soRemark = soRemark;
    }

    public String getSoAccountOwnership() {
        return soAccountOwnership;
    }

    public void setSoAccountOwnership(String soAccountOwnership) {
        this.soAccountOwnership = soAccountOwnership;
    }

    public String getSoCollectionTime() {
        return soCollectionTime;
    }

    public void setSoCollectionTime(String soCollectionTime) {
        this.soCollectionTime = soCollectionTime;
    }

    public String getSoCollectionMonth() {
        return soCollectionMonth;
    }

    public void setSoCollectionMonth(String soCollectionMonth) {
        this.soCollectionMonth = soCollectionMonth;
    }

    public String getSoCollectionTerms() {
        return soCollectionTerms;
    }

    public void setSoCollectionTerms(String soCollectionTerms) {
        this.soCollectionTerms = soCollectionTerms;
    }

    public String getSoCollectionTermsDay() {
        return soCollectionTermsDay;
    }

    public void setSoCollectionTermsDay(String soCollectionTermsDay) {
        this.soCollectionTermsDay = soCollectionTermsDay;
    }

    public String getSoAuditing() {
        return soAuditing;
    }

    public void setSoAuditing(String soAuditing) {
        this.soAuditing = soAuditing;
    }

    public String getSoYn() {
        return soYn;
    }

    public void setSoYn(String soYn) {
        this.soYn = soYn;
    }

    public String getSoCustom1() {
        return soCustom1;
    }

    public void setSoCustom1(String soCustom1) {
        this.soCustom1 = soCustom1;
    }

    public String getSoCustom2() {
        return soCustom2;
    }

    public void setSoCustom2(String soCustom2) {
        this.soCustom2 = soCustom2;
    }

    public String getSoCustom3() {
        return soCustom3;
    }

    public void setSoCustom3(String soCustom3) {
        this.soCustom3 = soCustom3;
    }

	@Override
	public String toString() {
		return "SaleOrder [soId=" + soId + ", customerorderId=" + customerorderId + ", soDocumentTime=" + soDocumentTime
				+ ", soDocumentnumber=" + soDocumentnumber + ", soDeliveryAddress=" + soDeliveryAddress + ", sotId="
				+ sotId + ", soCustomerorder=" + soCustomerorder + ", soTax=" + soTax + ", currencyId=" + currencyId
				+ ", soOderStatic=" + soOderStatic + ", staffId=" + staffId + ", teamId=" + teamId + ", soMonograph="
				+ soMonograph + ", soReviewer=" + soReviewer + ", soSubordinate=" + soSubordinate + ", soWatchword="
				+ soWatchword + ", soTailclause=" + soTailclause + ", soRemark=" + soRemark + ", soAccountOwnership="
				+ soAccountOwnership + ", soCollectionTime=" + soCollectionTime + ", soCollectionMonth="
				+ soCollectionMonth + ", soCollectionTerms=" + soCollectionTerms + ", soCollectionTermsDay="
				+ soCollectionTermsDay + ", soAuditing=" + soAuditing + ", soYn=" + soYn + ", soCustom1=" + soCustom1
				+ ", soCustom2=" + soCustom2 + ", soCustom3=" + soCustom3 + ", sodList=" + sodList + ", pageNum="
				+ pageNum + ", pageSize=" + pageSize + "]";
	}
    
}