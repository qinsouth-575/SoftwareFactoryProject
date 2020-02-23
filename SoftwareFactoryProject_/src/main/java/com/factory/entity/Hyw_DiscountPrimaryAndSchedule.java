package com.factory.entity;

import java.util.Date;
import java.util.List;

public class Hyw_DiscountPrimaryAndSchedule {
	private String dpbid;

    private Date dpbdate;

    private String appreciationitem;

    private String impairmentitem;

    private String straighteningmethod;

    private String documentmaker;

    private String verifier;

    private String custom1;

    private String custom2;
    
    private String examineType;
    
    private String delType;

    private String standby;

    private String remark;
    
    private List<Discountschedulebill> list;

	public String getDpbid() {
		return dpbid;
	}

	public void setDpbid(String dpbid) {
		this.dpbid = dpbid;
	}

	public Date getDpbdate() {
		return dpbdate;
	}

	public void setDpbdate(Date dpbdate) {
		this.dpbdate = dpbdate;
	}

	public String getAppreciationitem() {
		return appreciationitem;
	}

	public void setAppreciationitem(String appreciationitem) {
		this.appreciationitem = appreciationitem;
	}

	public String getImpairmentitem() {
		return impairmentitem;
	}

	public void setImpairmentitem(String impairmentitem) {
		this.impairmentitem = impairmentitem;
	}

	public String getStraighteningmethod() {
		return straighteningmethod;
	}

	public void setStraighteningmethod(String straighteningmethod) {
		this.straighteningmethod = straighteningmethod;
	}

	public String getDocumentmaker() {
		return documentmaker;
	}

	public void setDocumentmaker(String documentmaker) {
		this.documentmaker = documentmaker;
	}

	public String getVerifier() {
		return verifier;
	}

	public void setVerifier(String verifier) {
		this.verifier = verifier;
	}

	public String getCustom1() {
		return custom1;
	}

	public void setCustom1(String custom1) {
		this.custom1 = custom1;
	}

	public String getCustom2() {
		return custom2;
	}

	public void setCustom2(String custom2) {
		this.custom2 = custom2;
	}

	public String getExamineType() {
		return examineType;
	}

	public void setExamineType(String examineType) {
		this.examineType = examineType;
	}

	public String getDelType() {
		return delType;
	}

	public void setDelType(String delType) {
		this.delType = delType;
	}

	public String getStandby() {
		return standby;
	}

	public void setStandby(String standby) {
		this.standby = standby;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public List<Discountschedulebill> getList() {
		return list;
	}

	public void setList(List<Discountschedulebill> list) {
		this.list = list;
	}
}
