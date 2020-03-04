package com.factory.entity;

import java.util.Date;
import java.util.List;

public class PurchasingOrder {
    private String poId;

    private String supplierId;

    private String poEngname;

    private String potId;

    private String poPriceIncludeTax;

    private String poSingleStatus;

    private Date poDocumentDate;

    private String poDocumentNumber;

    private String currencyId;

    private Float poExchangeRate;

    private String poDeliveryAddress;

    private String poBuyer;

    private String poBelongsSection;

    private String poBelongsProject;

    private String poHeaderProvision;

    private String poEndClause;

    private String poRemark;

    private String poAudition;

    private String poYn;

    private String poCustom1;

    private String poCustom2;

    private String poCustom3;
    
    private List<PurchasingOrderDetails> jb;
public List<PurchasingOrderDetails> getJb() {
		return jb;
	}

	public void setJb(List<PurchasingOrderDetails> jb) {
		this.jb = jb;
	}

private String pureExecutor;
private String pureCheckagainStaff;
	public String getPureExecutor() {
	return pureExecutor;
}

public void setPureExecutor(String pureExecutor) {
	this.pureExecutor = pureExecutor;
}

public String getPureCheckagainStaff() {
	return pureCheckagainStaff;
}

public void setPureCheckagainStaff(String pureCheckagainStaff) {
	this.pureCheckagainStaff = pureCheckagainStaff;
}

	public PurchasingOrder() {
		super();
	}

	@Override
	public String toString() {
		return "PurchasingOrder [poId=" + poId + ", supplierId=" + supplierId + ", poEngname=" + poEngname + ", potId="
				+ potId + ", poPriceIncludeTax=" + poPriceIncludeTax + ", poSingleStatus=" + poSingleStatus
				+ ", poDocumentDate=" + poDocumentDate + ", poDocumentNumber=" + poDocumentNumber + ", currencyId="
				+ currencyId + ", poExchangeRate=" + poExchangeRate + ", poDeliveryAddress=" + poDeliveryAddress
				+ ", poBuyer=" + poBuyer + ", poBelongsSection=" + poBelongsSection + ", poBelongsProject="
				+ poBelongsProject + ", poHeaderProvision=" + poHeaderProvision + ", poEndClause=" + poEndClause
				+ ", poRemark=" + poRemark + ", poAudition=" + poAudition + ", poYn=" + poYn + ", poCustom1="
				+ poCustom1 + ", poCustom2=" + poCustom2 + ", poCustom3=" + poCustom3 + ", pureExecutor=" + pureExecutor
				+ ", pureCheckagainStaff=" + pureCheckagainStaff + "]";
	}

	public String getPoId() {
        return poId;
    }

    public void setPoId(String poId) {
        this.poId = poId;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getPoEngname() {
        return poEngname;
    }

    public void setPoEngname(String poEngname) {
        this.poEngname = poEngname;
    }

    public String getPotId() {
        return potId;
    }

    public void setPotId(String potId) {
        this.potId = potId;
    }

    public String getPoPriceIncludeTax() {
        return poPriceIncludeTax;
    }

    public void setPoPriceIncludeTax(String poPriceIncludeTax) {
        this.poPriceIncludeTax = poPriceIncludeTax;
    }

    public String getPoSingleStatus() {
        return poSingleStatus;
    }

    public void setPoSingleStatus(String poSingleStatus) {
        this.poSingleStatus = poSingleStatus;
    }

    public Date getPoDocumentDate() {
        return poDocumentDate;
    }

    public void setPoDocumentDate(Date poDocumentDate) {
        this.poDocumentDate = poDocumentDate;
    }

    public String getPoDocumentNumber() {
        return poDocumentNumber;
    }

    public void setPoDocumentNumber(String poDocumentNumber) {
        this.poDocumentNumber = poDocumentNumber;
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public Float getPoExchangeRate() {
        return poExchangeRate;
    }

    public void setPoExchangeRate(Float poExchangeRate) {
        this.poExchangeRate = poExchangeRate;
    }

    public String getPoDeliveryAddress() {
        return poDeliveryAddress;
    }

    public void setPoDeliveryAddress(String poDeliveryAddress) {
        this.poDeliveryAddress = poDeliveryAddress;
    }

    public String getPoBuyer() {
        return poBuyer;
    }

    public void setPoBuyer(String poBuyer) {
        this.poBuyer = poBuyer;
    }

    public String getPoBelongsSection() {
        return poBelongsSection;
    }

    public void setPoBelongsSection(String poBelongsSection) {
        this.poBelongsSection = poBelongsSection;
    }

    public String getPoBelongsProject() {
        return poBelongsProject;
    }

    public void setPoBelongsProject(String poBelongsProject) {
        this.poBelongsProject = poBelongsProject;
    }

    public String getPoHeaderProvision() {
        return poHeaderProvision;
    }

    public void setPoHeaderProvision(String poHeaderProvision) {
        this.poHeaderProvision = poHeaderProvision;
    }

    public String getPoEndClause() {
        return poEndClause;
    }

    public void setPoEndClause(String poEndClause) {
        this.poEndClause = poEndClause;
    }

    public String getPoRemark() {
        return poRemark;
    }

    public void setPoRemark(String poRemark) {
        this.poRemark = poRemark;
    }

    public String getPoAudition() {
        return poAudition;
    }

    public void setPoAudition(String poAudition) {
        this.poAudition = poAudition;
    }

    public String getPoYn() {
        return poYn;
    }

    public void setPoYn(String poYn) {
        this.poYn = poYn;
    }

    public String getPoCustom1() {
        return poCustom1;
    }

    public void setPoCustom1(String poCustom1) {
        this.poCustom1 = poCustom1;
    }

    public String getPoCustom2() {
        return poCustom2;
    }

    public void setPoCustom2(String poCustom2) {
        this.poCustom2 = poCustom2;
    }

    public String getPoCustom3() {
        return poCustom3;
    }

    public void setPoCustom3(String poCustom3) {
        this.poCustom3 = poCustom3;
    }
    
}