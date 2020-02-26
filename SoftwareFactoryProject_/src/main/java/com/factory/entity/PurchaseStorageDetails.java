package com.factory.entity;

public class PurchaseStorageDetails {
	
    private Integer psdId;					//单据编号
    private String psdColumnNo;				//栏号
    private String psdDocumentNumber;		//单据号码（主表单据编号）
    private String matterId;				//物料编号
    private String matterName;				//物料名称
    private String psdSpecifications;		//规格型号-总是没值
    private String psdCompanyName;			//单位名称
    private Integer psdAmount;				//数量
    private Float psdMoneyDiscountBefore;	//折扣前单价
    private String psdFoldNumber;			//折数（%）
    private Float psdPrice;					//单价
    private Float psdMoney;					//金额
    private Float psdTaxRate;				//税率（%）
    private Float psdTaxAmount;				//税额
    private Float psdIncludingTaxAmount;	//（含税金额）
    private String psdLotNumber;
    private String psdGift;					//（赠品）（0：非，1：赠品）
    private String psdInvoiceDetails;		//（发票明细）（0：未勾选，1：勾选）
    private String psdUninvoicedQuantity;	//（未开票数量）
    private String psdRemarks;
    private String psdSourceOrder;
    private String psdSourceNo;
    private String psdWentDutch;

    public Integer getPsdId() {
        return psdId;
    }
    public void setPsdId(Integer psdId) {
        this.psdId = psdId;
    }

    public String getPsdColumnNo() {
        return psdColumnNo;
    }
    public void setPsdColumnNo(String psdColumnNo) {
        this.psdColumnNo = psdColumnNo;
    }

    public String getPsdDocumentNumber() {
        return psdDocumentNumber;
    }
    public void setPsdDocumentNumber(String psdDocumentNumber) {
        this.psdDocumentNumber = psdDocumentNumber;
    }

    public String getMatterId() {
        return matterId;
    }

    public void setMatterId(String matterId) {
        this.matterId = matterId;
    }

    public String getMatterName() {
        return matterName;
    }

    public void setMatterName(String matterName) {
        this.matterName = matterName;
    }

    public String getPsdSpecifications() {
        return psdSpecifications;
    }

    public void setPsdSpecifications(String psdSpecifications) {
        this.psdSpecifications = psdSpecifications;
    }

    public String getPsdCompanyName() {
        return psdCompanyName;
    }

    public void setPsdCompanyName(String psdCompanyName) {
        this.psdCompanyName = psdCompanyName;
    }

    public Integer getPsdAmount() {
        return psdAmount;
    }

    public void setPsdAmount(Integer psdAmount) {
        this.psdAmount = psdAmount;
    }

    public Float getPsdMoneyDiscountBefore() {
        return psdMoneyDiscountBefore;
    }

    public void setPsdMoneyDiscountBefore(Float psdMoneyDiscountBefore) {
        this.psdMoneyDiscountBefore = psdMoneyDiscountBefore;
    }

    public String getPsdFoldNumber() {
        return psdFoldNumber;
    }

    public void setPsdFoldNumber(String psdFoldNumber) {
        this.psdFoldNumber = psdFoldNumber;
    }

    public Float getPsdPrice() {
        return psdPrice;
    }

    public void setPsdPrice(Float psdPrice) {
        this.psdPrice = psdPrice;
    }

    public Float getPsdMoney() {
        return psdMoney;
    }

    public void setPsdMoney(Float psdMoney) {
        this.psdMoney = psdMoney;
    }

    public Float getPsdTaxRate() {
        return psdTaxRate;
    }

    public void setPsdTaxRate(Float psdTaxRate) {
        this.psdTaxRate = psdTaxRate;
    }

    public Float getPsdTaxAmount() {
        return psdTaxAmount;
    }

    public void setPsdTaxAmount(Float psdTaxAmount) {
        this.psdTaxAmount = psdTaxAmount;
    }

    public Float getPsdIncludingTaxAmount() {
        return psdIncludingTaxAmount;
    }

    public void setPsdIncludingTaxAmount(Float psdIncludingTaxAmount) {
        this.psdIncludingTaxAmount = psdIncludingTaxAmount;
    }

    public String getPsdLotNumber() {
        return psdLotNumber;
    }

    public void setPsdLotNumber(String psdLotNumber) {
        this.psdLotNumber = psdLotNumber;
    }

    public String getPsdGift() {
        return psdGift;
    }

    public void setPsdGift(String psdGift) {
        this.psdGift = psdGift;
    }

    public String getPsdInvoiceDetails() {
        return psdInvoiceDetails;
    }

    public void setPsdInvoiceDetails(String psdInvoiceDetails) {
        this.psdInvoiceDetails = psdInvoiceDetails;
    }

    public String getPsdUninvoicedQuantity() {
        return psdUninvoicedQuantity;
    }

    public void setPsdUninvoicedQuantity(String psdUninvoicedQuantity) {
        this.psdUninvoicedQuantity = psdUninvoicedQuantity;
    }

    public String getPsdRemarks() {
        return psdRemarks;
    }

    public void setPsdRemarks(String psdRemarks) {
        this.psdRemarks = psdRemarks;
    }

    public String getPsdSourceOrder() {
        return psdSourceOrder;
    }

    public void setPsdSourceOrder(String psdSourceOrder) {
        this.psdSourceOrder = psdSourceOrder;
    }

    public String getPsdSourceNo() {
        return psdSourceNo;
    }

    public void setPsdSourceNo(String psdSourceNo) {
        this.psdSourceNo = psdSourceNo;
    }

    public String getPsdWentDutch() {
        return psdWentDutch;
    }

    public void setPsdWentDutch(String psdWentDutch) {
        this.psdWentDutch = psdWentDutch;
    }

	@Override
	public String toString() {
		return "/n采购入库详类 - PurchaseStorageDetails [psdId=" + psdId + ", psdColumnNo=" + psdColumnNo + ", psdDocumentNumber="
				+ psdDocumentNumber + ", matterId=" + matterId + ", matterName=" + matterName + ", psdSpecifications="
				+ psdSpecifications + ", psdCompanyName=" + psdCompanyName + ", psdAmount=" + psdAmount
				+ ", psdMoneyDiscountBefore=" + psdMoneyDiscountBefore + ", psdFoldNumber=" + psdFoldNumber
				+ ", psdPrice=" + psdPrice + ", psdMoney=" + psdMoney + ", psdTaxRate=" + psdTaxRate + ", psdTaxAmount="
				+ psdTaxAmount + ", psdIncludingTaxAmount=" + psdIncludingTaxAmount + ", psdLotNumber=" + psdLotNumber
				+ ", psdGift=" + psdGift + ", psdInvoiceDetails=" + psdInvoiceDetails + ", psdUninvoicedQuantity="
				+ psdUninvoicedQuantity + ", psdRemarks=" + psdRemarks + ", psdSourceOrder=" + psdSourceOrder
				+ ", psdSourceNo=" + psdSourceNo + ", psdWentDutch=" + psdWentDutch + "]";
	}
    
}