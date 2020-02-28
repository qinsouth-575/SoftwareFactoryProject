package com.factory.entity;

import java.util.Date;
import java.util.List;

public class PurchaseStorage {
	
    private String psDocumentNumber;		//单据号码（主键 编号）
    private Date psDocumentDate;			//单据日期
    private String currencyName;			//币别(不录id,直接录name)
    private Float psExchangeRate;			//汇率
    private String psForeignTrade;			//国外贸易 默认否
    
    private String supplierId;				//供应商id
    private String supplierName;			//供应商全称
    private String supplierEngname;			//供应商地址
    private String pstId;					//采购入库类型（不录id）
    private String psPriceIncludeTax;		//单价是否含税
    private String warehouseid;				//仓库id
    private String warehousename;			//仓库名称
    private String psSingleStatus;			//凭证编号
    
    private Integer psSunnum;				//总数量
    private Float psSunmoney;				//总金额
    private Float psTax;					//总税额
    private Float psIncludeTaxAmount;		//总含税金额
    private Float psWentDutch;				//总分摊费用
    
    private String psAccountOwnershipId;	//帐款归属id（供应商表id）
    private String psAccountOwnershipName;	//帐款归属方全称（供应商表）
    private String psPaymentClause;			//付款条件 - 条件
    private Short psPaymentClauseNum;		//付款条件 - 天数
    private Date psPaymentDate;				//付款日期
    private String psAccountReceivable;		//账款月份
    private String psCustom1;				//自定栏一
    private String psCustom2;				//自定栏二
    private String psRemark;				//备注
    
    private Integer staffId;				//采购人员id(员工id)
    private String staffName;				//采购人员(员工名称)
    private String teamId;					//部门id
    private String departName;				//部门名称
    private String psBelongsProject;		//所属项目
    private String psExecutor;				//制单人员（当前登录者）
    private String psCheckagainStaff;		//复核人员（当前登录者）
    private String psAudition;				//单据状态（0新增，1审核，2取消审核）
    private String psYn;					//是否删除（0否，1是；默认0）
    
    private List<PurchaseStorageDetails> psdList;
    
    private Integer pageNum;				//当前页
    private final Integer pageSize = 1;		//每页显示条数
    private String statu;					//goInsert：新增	goUpdate：修改
    
    //无参构造函数
    public PurchaseStorage() {
		super();
	}
    
    //

    public String getPsDocumentNumber() {
        return psDocumentNumber;
    }

    public void setPsDocumentNumber(String psDocumentNumber) {
        this.psDocumentNumber = psDocumentNumber;
    }

    public Date getPsDocumentDate() {
        return psDocumentDate;
    }

    public void setPsDocumentDate(Date psDocumentDate) {
        this.psDocumentDate = psDocumentDate;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public Float getPsExchangeRate() {
        return psExchangeRate;
    }

    public void setPsExchangeRate(Float psExchangeRate) {
        this.psExchangeRate = psExchangeRate;
    }

    public String getPsForeignTrade() {
        return psForeignTrade;
    }

    public void setPsForeignTrade(String psForeignTrade) {
        this.psForeignTrade = psForeignTrade;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierEngname() {
        return supplierEngname;
    }

    public void setSupplierEngname(String supplierEngname) {
        this.supplierEngname = supplierEngname;
    }

    public String getPstId() {
        return pstId;
    }

    public void setPstId(String pstId) {
        this.pstId = pstId;
    }

    public String getPsPriceIncludeTax() {
        return psPriceIncludeTax;
    }

    public void setPsPriceIncludeTax(String psPriceIncludeTax) {
        this.psPriceIncludeTax = psPriceIncludeTax;
    }

    public String getWarehouseid() {
        return warehouseid;
    }

    public void setWarehouseid(String warehouseid) {
        this.warehouseid = warehouseid;
    }

    public String getWarehousename() {
        return warehousename;
    }

    public void setWarehousename(String warehousename) {
        this.warehousename = warehousename;
    }

    public String getPsSingleStatus() {
        return psSingleStatus;
    }

    public void setPsSingleStatus(String psSingleStatus) {
        this.psSingleStatus = psSingleStatus;
    }

    public Integer getPsSunnum() {
        return psSunnum;
    }

    public void setPsSunnum(Integer psSunnum) {
        this.psSunnum = psSunnum;
    }

    public Float getPsSunmoney() {
        return psSunmoney;
    }

    public void setPsSunmoney(Float psSunmoney) {
        this.psSunmoney = psSunmoney;
    }

    public Float getPsTax() {
        return psTax;
    }

    public void setPsTax(Float psTax) {
        this.psTax = psTax;
    }

    public Float getPsIncludeTaxAmount() {
        return psIncludeTaxAmount;
    }

    public void setPsIncludeTaxAmount(Float psIncludeTaxAmount) {
        this.psIncludeTaxAmount = psIncludeTaxAmount;
    }

    public Float getPsWentDutch() {
        return psWentDutch;
    }

    public void setPsWentDutch(Float psWentDutch) {
        this.psWentDutch = psWentDutch;
    }

    public String getPsAccountOwnershipId() {
        return psAccountOwnershipId;
    }

    public void setPsAccountOwnershipId(String psAccountOwnershipId) {
        this.psAccountOwnershipId = psAccountOwnershipId;
    }

    public String getPsAccountOwnershipName() {
        return psAccountOwnershipName;
    }

    public void setPsAccountOwnershipName(String psAccountOwnershipName) {
        this.psAccountOwnershipName = psAccountOwnershipName;
    }

    public String getPsPaymentClause() {
        return psPaymentClause;
    }

    public void setPsPaymentClause(String psPaymentClause) {
        this.psPaymentClause = psPaymentClause;
    }

    public Short getPsPaymentClauseNum() {
        return psPaymentClauseNum;
    }

    public void setPsPaymentClauseNum(Short psPaymentClauseNum) {
        this.psPaymentClauseNum = psPaymentClauseNum;
    }

    public Date getPsPaymentDate() {
        return psPaymentDate;
    }

    public void setPsPaymentDate(Date psPaymentDate) {
        this.psPaymentDate = psPaymentDate;
    }

    public String getPsAccountReceivable() {
        return psAccountReceivable;
    }

    public void setPsAccountReceivable(String psAccountReceivable) {
        this.psAccountReceivable = psAccountReceivable;
    }

    public String getPsCustom1() {
        return psCustom1;
    }

    public void setPsCustom1(String psCustom1) {
        this.psCustom1 = psCustom1;
    }

    public String getPsCustom2() {
        return psCustom2;
    }

    public void setPsCustom2(String psCustom2) {
        this.psCustom2 = psCustom2;
    }

    public String getPsRemark() {
        return psRemark;
    }

    public void setPsRemark(String psRemark) {
        this.psRemark = psRemark;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    public String getPsBelongsProject() {
        return psBelongsProject;
    }

    public void setPsBelongsProject(String psBelongsProject) {
        this.psBelongsProject = psBelongsProject;
    }

    public String getPsExecutor() {
        return psExecutor;
    }

    public void setPsExecutor(String psExecutor) {
        this.psExecutor = psExecutor;
    }

    public String getPsCheckagainStaff() {
        return psCheckagainStaff;
    }

    public void setPsCheckagainStaff(String psCheckagainStaff) {
        this.psCheckagainStaff = psCheckagainStaff;
    }

    public String getPsAudition() {
        return psAudition;
    }

    public void setPsAudition(String psAudition) {
        this.psAudition = psAudition;
    }

    public String getPsYn() {
        return psYn;
    }

    public void setPsYn(String psYn) {
        this.psYn = psYn;
    }
	
	public List<PurchaseStorageDetails> getPsdList() {
		return psdList;
	}

	public void setPsdList(List<PurchaseStorageDetails> psdList) {
		this.psdList = psdList;
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

	public String getStatu() {
		return statu;
	}

	public void setStatu(String statu) {
		this.statu = statu;
	}

	@Override
	public String toString() {
		return "采购入库主类 - PurchaseStorage [psDocumentNumber=" + psDocumentNumber + ", psDocumentDate=" + psDocumentDate
				+ ", currencyName=" + currencyName + ", psExchangeRate=" + psExchangeRate + ", psForeignTrade="
				+ psForeignTrade + ", supplierId=" + supplierId + ", supplierName=" + supplierName
				+ ", supplierEngname=" + supplierEngname + ", pstId=" + pstId + ", psPriceIncludeTax="
				+ psPriceIncludeTax + ", warehouseid=" + warehouseid + ", warehousename=" + warehousename
				+ ", psSingleStatus=" + psSingleStatus + ", psSunnum=" + psSunnum + ", psSunmoney=" + psSunmoney
				+ ", psTax=" + psTax + ", psIncludeTaxAmount=" + psIncludeTaxAmount + ", psWentDutch=" + psWentDutch
				+ ", psAccountOwnershipId=" + psAccountOwnershipId + ", psAccountOwnershipName="
				+ psAccountOwnershipName + ", psPaymentClause=" + psPaymentClause + ", psPaymentClauseNum="
				+ psPaymentClauseNum + ", psPaymentDate=" + psPaymentDate + ", psAccountReceivable="
				+ psAccountReceivable + ", psCustom1=" + psCustom1 + ", psCustom2=" + psCustom2 + ", psRemark="
				+ psRemark + ", staffId=" + staffId + ", staffName=" + staffName + ", teamId=" + teamId
				+ ", departName=" + departName + ", psBelongsProject=" + psBelongsProject + ", psExecutor=" + psExecutor
				+ ", psCheckagainStaff=" + psCheckagainStaff + ", psAudition=" + psAudition + ", psYn=" + psYn
				+ ", psdList=" + psdList + ", pageNum=" + pageNum + ", pageSize=" + pageSize + ", statu=" + statu + "]";
	}
	
}