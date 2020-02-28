package com.factory.entity;

import java.util.Date;

/**
 * - XX层 - XX类
 * @author south wind
 * @version v1.0 2020年2月05日 上午12:01:52
 * - 表/功能：		只有物料编号、数量、需求日期、分录备注可以修改
 */
public class TPurchaseRequisitionsDetails {
	
    private Integer prdId;					//自增列，详表主键
    private String prdDocumentNumber;		//单据号码（主表单据编号）
    private String prdColumnNo;				//栏号
    private String prdMatterId;				//物料编号（修改可编辑）
    private String prdMatterName;			//物料名称
    private String prdSpecifications;		//规格型号
    private String prdCompanyName;			//单位名称
    private Integer prdAmount;				//数量（修改可编辑）
    private String prdStandardCurrencyName;	//标准进价信息，币别（name）
    private Float prdStandardPrice;			//标准进价信息，标准进价
    private Float prdStandardAmount;		//标准进价信息，标准进价金额（数量*标准进价）
    private String prdFinallyCurrencyName;	//最后一次采购信息，币别（name）
    private Float prdFinallyPrice;			//最后一次采购信息，单价（来源于采购入库单）
    private Float prdFinallyAmount;			//最后一次采购信息，进价金额（数量*标准进价）
    private Date prdRequiredDate;			//需求日期（可大于当前日期）（修改可编辑）
    private Date prdProposedDate;			//建议采购日期（采购提前期）
    private Integer prdNotPurchaseQuantity;	//未采购量
    private String prdRemarks;				//分录备注（修改可编辑）
    private String prdSourceOrder;			//来源单别，来源于销售订单
    private String prdSourceNo;				//来源单号，来源于销售订单
    
    //无参构造
    public TPurchaseRequisitionsDetails() {
		super();
	}

    //
    
	public Integer getPrdId() {
        return prdId;
    }

    public void setPrdId(Integer prdId) {
        this.prdId = prdId;
    }

    public String getPrdDocumentNumber() {
        return prdDocumentNumber;
    }

    public void setPrdDocumentNumber(String prdDocumentNumber) {
        this.prdDocumentNumber = prdDocumentNumber;
    }

    public String getPrdColumnNo() {
        return prdColumnNo;
    }

    public void setPrdColumnNo(String prdColumnNo) {
        this.prdColumnNo = prdColumnNo;
    }

    public String getPrdMatterId() {
        return prdMatterId;
    }

    public void setPrdMatterId(String prdMatterId) {
        this.prdMatterId = prdMatterId;
    }

    public String getPrdMatterName() {
        return prdMatterName;
    }

    public void setPrdMatterName(String prdMatterName) {
        this.prdMatterName = prdMatterName;
    }

    public String getPrdSpecifications() {
        return prdSpecifications;
    }

    public void setPrdSpecifications(String prdSpecifications) {
        this.prdSpecifications = prdSpecifications;
    }

    public String getPrdCompanyName() {
        return prdCompanyName;
    }

    public void setPrdCompanyName(String prdCompanyName) {
        this.prdCompanyName = prdCompanyName;
    }

    public Integer getPrdAmount() {
        return prdAmount;
    }

    public void setPrdAmount(Integer prdAmount) {
        this.prdAmount = prdAmount;
    }

    public String getPrdStandardCurrencyName() {
        return prdStandardCurrencyName;
    }

    public void setPrdStandardCurrencyName(String prdStandardCurrencyName) {
        this.prdStandardCurrencyName = prdStandardCurrencyName;
    }

    public Float getPrdStandardPrice() {
        return prdStandardPrice;
    }

    public void setPrdStandardPrice(Float prdStandardPrice) {
        this.prdStandardPrice = prdStandardPrice;
    }

    public Float getPrdStandardAmount() {
        return prdStandardAmount;
    }

    public void setPrdStandardAmount(Float prdStandardAmount) {
        this.prdStandardAmount = prdStandardAmount;
    }

    public String getPrdFinallyCurrencyName() {
        return prdFinallyCurrencyName;
    }

    public void setPrdFinallyCurrencyName(String prdFinallyCurrencyName) {
        this.prdFinallyCurrencyName = prdFinallyCurrencyName;
    }

    public Float getPrdFinallyPrice() {
        return prdFinallyPrice;
    }

    public void setPrdFinallyPrice(Float prdFinallyPrice) {
        this.prdFinallyPrice = prdFinallyPrice;
    }

    public Float getPrdFinallyAmount() {
        return prdFinallyAmount;
    }

    public void setPrdFinallyAmount(Float prdFinallyAmount) {
        this.prdFinallyAmount = prdFinallyAmount;
    }

    public Date getPrdRequiredDate() {
        return prdRequiredDate;
    }

    public void setPrdRequiredDate(Date prdRequiredDate) {
        this.prdRequiredDate = prdRequiredDate;
    }

    public Date getPrdProposedDate() {
        return prdProposedDate;
    }

    public void setPrdProposedDate(Date prdProposedDate) {
        this.prdProposedDate = prdProposedDate;
    }

    public Integer getPrdNotPurchaseQuantity() {
        return prdNotPurchaseQuantity;
    }

    public void setPrdNotPurchaseQuantity(Integer prdNotPurchaseQuantity) {
        this.prdNotPurchaseQuantity = prdNotPurchaseQuantity;
    }

    public String getPrdRemarks() {
        return prdRemarks;
    }

    public void setPrdRemarks(String prdRemarks) {
        this.prdRemarks = prdRemarks;
    }

    public String getPrdSourceOrder() {
        return prdSourceOrder;
    }

    public void setPrdSourceOrder(String prdSourceOrder) {
        this.prdSourceOrder = prdSourceOrder;
    }

    public String getPrdSourceNo() {
        return prdSourceNo;
    }

    public void setPrdSourceNo(String prdSourceNo) {
        this.prdSourceNo = prdSourceNo;
    }

	@Override
	public String toString() {
		return "\n采购请购详表：TPurchaseRequisitionsDetails [prdId=" + prdId + ", prdDocumentNumber=" + prdDocumentNumber
				+ ", prdColumnNo=" + prdColumnNo + ", prdMatterId=" + prdMatterId + ", prdMatterName=" + prdMatterName
				+ ", prdSpecifications=" + prdSpecifications + ", prdCompanyName=" + prdCompanyName + ", prdAmount="
				+ prdAmount + ", prdStandardCurrencyName=" + prdStandardCurrencyName + ", prdStandardPrice="
				+ prdStandardPrice + ", prdStandardAmount=" + prdStandardAmount + ", prdFinallyCurrencyName="
				+ prdFinallyCurrencyName + ", prdFinallyPrice=" + prdFinallyPrice + ", prdFinallyAmount="
				+ prdFinallyAmount + ", prdRequiredDate=" + prdRequiredDate + ", prdProposedDate=" + prdProposedDate
				+ ", prdNotPurchaseQuantity=" + prdNotPurchaseQuantity + ", prdRemarks=" + prdRemarks
				+ ", prdSourceOrder=" + prdSourceOrder + ", prdSourceNo=" + prdSourceNo + "]";
	}
    
}