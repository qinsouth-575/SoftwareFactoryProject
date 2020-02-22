package com.factory.entity;

import java.util.Date;
import java.util.List;

public class SaleOutWarehouse {
    private String sowId;//单据号码

    private String customerId;//用户id

    private String sowAddress;//送货地址

    private String sowtId;

    private String sowPriceIncludeTax;

    private String warehouseId;

    private String sowCertificateNumber;

    private Date sowDocumentDate;

    private String sowDocumentNumber;

    private String currencyId;

    private Float sowExchangeRate;//汇率默认值：1.0000

    private String sowForeignTrade;

    private Integer sowSunnum;

    private Float sowSunmoney;

    private Float sowTax;

    private Float sowIncludingTaxAmount;

    private String sowSaleszkgs;

    private Date sowSalesdate;

    private String sowSalessktj;

    private Integer sowSalesday;

    private Date sowSalesyue;

    private String sowBuyer;

    private String sowBelongsSection;

    private String sowBelongsProject;

    private String sowForm;

    private String sowCheckagainStaff;

    private String sowProject;

    private String sowHeaderProvision;

    private String sowEndClause;

    private String sowRemark;//备注

    private String sowAuditing;//制单人员（当前登录者）

    private String sowYn;//复核人员（当前登录者）

    private String sowCustom1;

    private String sowCustom2;

    private String sowCustom3;
    
    private List<SaleOutWarehouseDetailed> list;
    
	public List<SaleOutWarehouseDetailed> getList() {
		return list;
	}

	public void setList(List<SaleOutWarehouseDetailed> list) {
		this.list = list;
	}

	public String getSowId() {
        return sowId;
    }

    public void setSowId(String sowId) {
        this.sowId = sowId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getSowAddress() {
        return sowAddress;
    }

    public void setSowAddress(String sowAddress) {
        this.sowAddress = sowAddress;
    }

    public String getSowtId() {
        return sowtId;
    }

    public void setSowtId(String sowtId) {
        this.sowtId = sowtId;
    }

    public String getSowPriceIncludeTax() {
        return sowPriceIncludeTax;
    }

    public void setSowPriceIncludeTax(String sowPriceIncludeTax) {
        this.sowPriceIncludeTax = sowPriceIncludeTax;
    }

    public String getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getSowCertificateNumber() {
        return sowCertificateNumber;
    }

    public void setSowCertificateNumber(String sowCertificateNumber) {
        this.sowCertificateNumber = sowCertificateNumber;
    }

    public Date getSowDocumentDate() {
        return sowDocumentDate;
    }

    public void setSowDocumentDate(Date sowDocumentDate) {
        this.sowDocumentDate = sowDocumentDate;
    }

    public String getSowDocumentNumber() {
        return sowDocumentNumber;
    }

    public void setSowDocumentNumber(String sowDocumentNumber) {
        this.sowDocumentNumber = sowDocumentNumber;
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public Float getSowExchangeRate() {
        return sowExchangeRate;
    }

    public void setSowExchangeRate(Float sowExchangeRate) {
        this.sowExchangeRate = sowExchangeRate;
    }

    public String getSowForeignTrade() {
        return sowForeignTrade;
    }

    public void setSowForeignTrade(String sowForeignTrade) {
        this.sowForeignTrade = sowForeignTrade;
    }

    public Integer getSowSunnum() {
        return sowSunnum;
    }

    public void setSowSunnum(Integer sowSunnum) {
        this.sowSunnum = sowSunnum;
    }

    public Float getSowSunmoney() {
        return sowSunmoney;
    }

    public void setSowSunmoney(Float sowSunmoney) {
        this.sowSunmoney = sowSunmoney;
    }

    public Float getSowTax() {
        return sowTax;
    }

    public void setSowTax(Float sowTax) {
        this.sowTax = sowTax;
    }

    public Float getSowIncludingTaxAmount() {
        return sowIncludingTaxAmount;
    }

    public void setSowIncludingTaxAmount(Float sowIncludingTaxAmount) {
        this.sowIncludingTaxAmount = sowIncludingTaxAmount;
    }

    public String getSowSaleszkgs() {
        return sowSaleszkgs;
    }

    public void setSowSaleszkgs(String sowSaleszkgs) {
        this.sowSaleszkgs = sowSaleszkgs;
    }

    public Date getSowSalesdate() {
        return sowSalesdate;
    }

    public void setSowSalesdate(Date sowSalesdate) {
        this.sowSalesdate = sowSalesdate;
    }

    public String getSowSalessktj() {
        return sowSalessktj;
    }

    public void setSowSalessktj(String sowSalessktj) {
        this.sowSalessktj = sowSalessktj;
    }

    public Integer getSowSalesday() {
        return sowSalesday;
    }

    public void setSowSalesday(Integer sowSalesday) {
        this.sowSalesday = sowSalesday;
    }

    public Date getSowSalesyue() {
        return sowSalesyue;
    }

    public void setSowSalesyue(Date sowSalesyue) {
        this.sowSalesyue = sowSalesyue;
    }

    public String getSowBuyer() {
        return sowBuyer;
    }

    public void setSowBuyer(String sowBuyer) {
        this.sowBuyer = sowBuyer;
    }

    public String getSowBelongsSection() {
        return sowBelongsSection;
    }

    public void setSowBelongsSection(String sowBelongsSection) {
        this.sowBelongsSection = sowBelongsSection;
    }

    public String getSowBelongsProject() {
        return sowBelongsProject;
    }

    public void setSowBelongsProject(String sowBelongsProject) {
        this.sowBelongsProject = sowBelongsProject;
    }

    public String getSowForm() {
        return sowForm;
    }

    public void setSowForm(String sowForm) {
        this.sowForm = sowForm;
    }

    public String getSowCheckagainStaff() {
        return sowCheckagainStaff;
    }

    public void setSowCheckagainStaff(String sowCheckagainStaff) {
        this.sowCheckagainStaff = sowCheckagainStaff;
    }

    public String getSowProject() {
        return sowProject;
    }

    public void setSowProject(String sowProject) {
        this.sowProject = sowProject;
    }

    public String getSowHeaderProvision() {
        return sowHeaderProvision;
    }

    public void setSowHeaderProvision(String sowHeaderProvision) {
        this.sowHeaderProvision = sowHeaderProvision;
    }

    public String getSowEndClause() {
        return sowEndClause;
    }

    public void setSowEndClause(String sowEndClause) {
        this.sowEndClause = sowEndClause;
    }

    public String getSowRemark() {
        return sowRemark;
    }

    public void setSowRemark(String sowRemark) {
        this.sowRemark = sowRemark;
    }

    public String getSowAuditing() {
        return sowAuditing;
    }

    public void setSowAuditing(String sowAuditing) {
        this.sowAuditing = sowAuditing;
    }

    public String getSowYn() {
        return sowYn;
    }

    public void setSowYn(String sowYn) {
        this.sowYn = sowYn;
    }

    public String getSowCustom1() {
        return sowCustom1;
    }

    public void setSowCustom1(String sowCustom1) {
        this.sowCustom1 = sowCustom1;
    }

    public String getSowCustom2() {
        return sowCustom2;
    }

    public void setSowCustom2(String sowCustom2) {
        this.sowCustom2 = sowCustom2;
    }

    public String getSowCustom3() {
        return sowCustom3;
    }

    public void setSowCustom3(String sowCustom3) {
        this.sowCustom3 = sowCustom3;
    }
}