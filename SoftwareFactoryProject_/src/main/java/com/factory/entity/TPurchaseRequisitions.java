package com.factory.entity;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class TPurchaseRequisitions {
	
    private String prDocumentNumber;	//单据号码（主键，编号）
    @DateTimeFormat(pattern = "yyyy-MM-dd")					//接受前台的时间格式 传到后台的格式
    @JsonFormat(pattern = "yyyy-MM-dd")	//后台的时间 格式化 发送到前台
    private Date prDocumentDate;		//单据日期
    private String prTypeId;			//采购请购类型id
    private String prTypeName;			//采购请购类型名称
    private Integer prSingleCase;		//单况（0未结案、1已结案、2无效）
    private Integer prAmount;			//总数量
    private Integer prSumAmount;		//总未采购量
    private String prHeaderSection;		//表头条文
    private String prFooterSection;		//表尾条文
    private String prCustom1;			//自定栏一
    private String prCustom2;			//自定栏二
    private String prRemark;			//备注
    private Integer prStaffId;			//请购人员id
    private String prStaffName;			//请购人员名称
    private String prTeamId;			//请购部门id
    private String prDepartName;		//请购部门名称
    private String prExecutor;			//制单人员（当前登录者）
    private String prCheckagainStaff;	//复核人员（当前登录者）
    private Short prAudition;			//单据状态（0新增，1审核，2取消审核）
    private Short prYn;					//是否删除（0否，1是；默认0）
    
    private List<TPurchaseRequisitionsDetails> prdList;
    
    private Integer pageNum;			//当前页
    private final Integer pageSize = 1;	//每页显示条数
    private String statu;				//goInsert：新增	goUpdate：修改

    //无参构造
    public TPurchaseRequisitions() {
		super();
	}

    //
    public TPurchaseRequisitions(String prDocumentNumber, Short prYn) {
		super();
		this.prDocumentNumber = prDocumentNumber;
		this.prYn = prYn;
	}

    //
	public TPurchaseRequisitions(String prDocumentNumber, String prCheckagainStaff, Short prAudition) {
		super();
		this.prDocumentNumber = prDocumentNumber;
		this.prCheckagainStaff = prCheckagainStaff;
		this.prAudition = prAudition;
	}

	public String getPrDocumentNumber() {
        return prDocumentNumber;
    }

	public void setPrDocumentNumber(String prDocumentNumber) {
        this.prDocumentNumber = prDocumentNumber;
    }

    public Date getPrDocumentDate() {
        return prDocumentDate;
    }

    public void setPrDocumentDate(Date prDocumentDate) {
        this.prDocumentDate = prDocumentDate;
    }

    public String getPrTypeId() {
        return prTypeId;
    }

    public void setPrTypeId(String prTypeId) {
        this.prTypeId = prTypeId;
    }

    public String getPrTypeName() {
        return prTypeName;
    }

    public void setPrTypeName(String prTypeName) {
        this.prTypeName = prTypeName;
    }

    public Integer getPrSingleCase() {
        return prSingleCase;
    }

    public void setPrSingleCase(Integer prSingleCase) {
        this.prSingleCase = prSingleCase;
    }

    public Integer getPrAmount() {
        return prAmount;
    }

    public void setPrAmount(Integer prAmount) {
        this.prAmount = prAmount;
    }

    public Integer getPrSumAmount() {
        return prSumAmount;
    }

    public void setPrSumAmount(Integer prSumAmount) {
        this.prSumAmount = prSumAmount;
    }

    public String getPrHeaderSection() {
        return prHeaderSection;
    }

    public void setPrHeaderSection(String prHeaderSection) {
        this.prHeaderSection = prHeaderSection;
    }

    public String getPrFooterSection() {
        return prFooterSection;
    }

    public void setPrFooterSection(String prFooterSection) {
        this.prFooterSection = prFooterSection;
    }

    public String getPrCustom1() {
        return prCustom1;
    }

    public void setPrCustom1(String prCustom1) {
        this.prCustom1 = prCustom1;
    }

    public String getPrCustom2() {
        return prCustom2;
    }

    public void setPrCustom2(String prCustom2) {
        this.prCustom2 = prCustom2;
    }

    public String getPrRemark() {
        return prRemark;
    }

    public void setPrRemark(String prRemark) {
        this.prRemark = prRemark;
    }

    public Integer getPrStaffId() {
        return prStaffId;
    }

    public void setPrStaffId(Integer prStaffId) {
        this.prStaffId = prStaffId;
    }

    public String getPrStaffName() {
        return prStaffName;
    }

    public void setPrStaffName(String prStaffName) {
        this.prStaffName = prStaffName;
    }

    public String getPrTeamId() {
        return prTeamId;
    }

    public void setPrTeamId(String prTeamId) {
        this.prTeamId = prTeamId;
    }

    public String getPrDepartName() {
        return prDepartName;
    }

    public void setPrDepartName(String prDepartName) {
        this.prDepartName = prDepartName;
    }

    public String getPrExecutor() {
        return prExecutor;
    }

    public void setPrExecutor(String prExecutor) {
        this.prExecutor = prExecutor;
    }

    public String getPrCheckagainStaff() {
        return prCheckagainStaff;
    }

    public void setPrCheckagainStaff(String prCheckagainStaff) {
        this.prCheckagainStaff = prCheckagainStaff;
    }

    public Short getPrAudition() {
        return prAudition;
    }

    public void setPrAudition(Short prAudition) {
        this.prAudition = prAudition;
    }

    public Short getPrYn() {
        return prYn;
    }

    public void setPrYn(Short prYn) {
        this.prYn = prYn;
    }

	public List<TPurchaseRequisitionsDetails> getPrdList() {
		return prdList;
	}

	public void setPrdList(List<TPurchaseRequisitionsDetails> prdList) {
		this.prdList = prdList;
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public String getStatu() {
		return statu;
	}

	public void setStatu(String statu) {
		this.statu = statu;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	@Override
	public String toString() {
		return "TPurchaseRequisitions [prDocumentNumber=" + prDocumentNumber + ", prDocumentDate=" + prDocumentDate
				+ ", prTypeId=" + prTypeId + ", prTypeName=" + prTypeName + ", prSingleCase=" + prSingleCase
				+ ", prAmount=" + prAmount + ", prSumAmount=" + prSumAmount + ", prHeaderSection=" + prHeaderSection
				+ ", prFooterSection=" + prFooterSection + ", prCustom1=" + prCustom1 + ", prCustom2=" + prCustom2
				+ ", prRemark=" + prRemark + ", prStaffId=" + prStaffId + ", prStaffName=" + prStaffName + ", prTeamId="
				+ prTeamId + ", prDepartName=" + prDepartName + ", prExecutor=" + prExecutor + ", prCheckagainStaff="
				+ prCheckagainStaff + ", prAudition=" + prAudition + ", prYn=" + prYn + ", prdList=" + prdList
				+ ", pageNum=" + pageNum + ", pageSize=" + pageSize + ", statu=" + statu + "]";
	}

}