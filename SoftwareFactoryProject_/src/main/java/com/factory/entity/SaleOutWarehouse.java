package com.factory.entity;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class SaleOutWarehouse {
    private String sowId;//单据编号

    private String customerId;//用户名称

    private String sowAddress;//送货地址

    private String sowtId;//销售出库类型

    private String sowPriceIncludeTax;//单价是否含税

    private String warehouseId;//仓库名称

    private String sowCertificateNumber;//凭证编码

    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date sowDocumentDate;//单据日期

    private String sowDocumentNumber;//【不使用】

    private String currencyId;//币别名称

    private Float sowExchangeRate;//汇率默认值：1.0000

    private String sowForeignTrade;//国外贸易：默认否

    private Integer sowSunnum;//总数量

    private Float sowSunmoney;//总金额

    private Float sowTax;//总税额

    private Float sowIncludingTaxAmount;//总含税金额

    private String sowSaleszkgs;//账款归属

    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date sowSalesdate;//收款日期

    private String sowSalessktj;//收款条件

    private Integer sowSalesday;//收款天数

    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date sowSalesyue;//账款月份

    private String sowBuyer;//采购入员

    private String sowBelongsSection;//所属部门

    private String sowBelongsProject;//【不使用】所属项目

    private String sowForm;//【不使用】制单人员

    private String sowCheckagainStaff;//【不使用】复核人员

    private String sowProject;//所属项目

    private String sowHeaderProvision;//表头条文

    private String sowEndClause;//表尾条文

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