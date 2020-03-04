package com.factory.entity;

import java.sql.Date;
import java.util.List;


public class AssessmentProcurement {

	
	
	private String apId;
	private Date apDateDocument;
	private String apMethodAssessment;
	private float apPrincipalCurrencyAmortized;
	private String apSingleStatus;
	private String apBelongsProject;
	private String apExecutor;
	private String apCheckagainStaff;
	private String apHeaderProvision;
	private String apEndClause;
	private String apRemark;
	private String apAudition;
	private String apYn;
	private String apCustom1;
	private String apCustom2;
	private String apCustom3;
	private String apCustom4;
	private String apCustom5;
	private String apCustom6;
	private List<AssessmentProcurementDetailed> jb;
	private List<AssessmentProcurementFruit> dajb;
	public List<AssessmentProcurementDetailed> getJb() {
		return jb;
	}
	public void setJb(List<AssessmentProcurementDetailed> jb) {
		this.jb = jb;
	}
	public List<AssessmentProcurementFruit> getDajb() {
		return dajb;
	}
	public void setDajb(List<AssessmentProcurementFruit> dajb) {
		this.dajb = dajb;
	}
	@Override
	public String toString() {
		return "AssessmentProcurement [apId=" + apId + ", apDateDocument=" + apDateDocument + ", apMethodAssessment="
				+ apMethodAssessment + ", apPrincipalCurrencyAmortized=" + apPrincipalCurrencyAmortized
				+ ", apSingleStatus=" + apSingleStatus + ", apBelongsProject=" + apBelongsProject + ", apExecutor="
				+ apExecutor + ", apCheckagainStaff=" + apCheckagainStaff + ", apHeaderProvision=" + apHeaderProvision
				+ ", apEndClause=" + apEndClause + ", apRemark=" + apRemark + ", apAudition=" + apAudition + ", apYn="
				+ apYn + ", apCustom1=" + apCustom1 + ", apCustom2=" + apCustom2 + ", apCustom3=" + apCustom3
				+ ", apCustom4=" + apCustom4 + ", apCustom5=" + apCustom5 + ", apCustom6=" + apCustom6 + "]";
	}
	public String getApId() {
		return apId;
	}
	public void setApId(String apId) {
		this.apId = apId;
	}
	public Date getApDateDocument() {
		return apDateDocument;
	}
	public void setApDateDocument(Date apDateDocument) {
		this.apDateDocument = apDateDocument;
	}
	public String getApMethodAssessment() {
		return apMethodAssessment;
	}
	public void setApMethodAssessment(String apMethodAssessment) {
		this.apMethodAssessment = apMethodAssessment;
	}
	public float getApPrincipalCurrencyAmortized() {
		return apPrincipalCurrencyAmortized;
	}
	public void setApPrincipalCurrencyAmortized(float apPrincipalCurrencyAmortized) {
		this.apPrincipalCurrencyAmortized = apPrincipalCurrencyAmortized;
	}
	public String getApSingleStatus() {
		return apSingleStatus;
	}
	public void setApSingleStatus(String apSingleStatus) {
		this.apSingleStatus = apSingleStatus;
	}
	public String getApBelongsProject() {
		return apBelongsProject;
	}
	public void setApBelongsProject(String apBelongsProject) {
		this.apBelongsProject = apBelongsProject;
	}
	public String getApExecutor() {
		return apExecutor;
	}
	public void setApExecutor(String apExecutor) {
		this.apExecutor = apExecutor;
	}
	public String getApCheckagainStaff() {
		return apCheckagainStaff;
	}
	public void setApCheckagainStaff(String apCheckagainStaff) {
		this.apCheckagainStaff = apCheckagainStaff;
	}
	public String getApHeaderProvision() {
		return apHeaderProvision;
	}
	public void setApHeaderProvision(String apHeaderProvision) {
		this.apHeaderProvision = apHeaderProvision;
	}
	public String getApEndClause() {
		return apEndClause;
	}
	public void setApEndClause(String apEndClause) {
		this.apEndClause = apEndClause;
	}
	public String getApRemark() {
		return apRemark;
	}
	public void setApRemark(String apRemark) {
		this.apRemark = apRemark;
	}
	public String getApAudition() {
		return apAudition;
	}
	public void setApAudition(String apAudition) {
		this.apAudition = apAudition;
	}
	public String getApYn() {
		return apYn;
	}
	public void setApYn(String apYn) {
		this.apYn = apYn;
	}
	public String getApCustom1() {
		return apCustom1;
	}
	public void setApCustom1(String apCustom1) {
		this.apCustom1 = apCustom1;
	}
	public String getApCustom2() {
		return apCustom2;
	}
	public void setApCustom2(String apCustom2) {
		this.apCustom2 = apCustom2;
	}
	public String getApCustom3() {
		return apCustom3;
	}
	public void setApCustom3(String apCustom3) {
		this.apCustom3 = apCustom3;
	}
	public String getApCustom4() {
		return apCustom4;
	}
	public void setApCustom4(String apCustom4) {
		this.apCustom4 = apCustom4;
	}
	public String getApCustom5() {
		return apCustom5;
	}
	public void setApCustom5(String apCustom5) {
		this.apCustom5 = apCustom5;
	}
	public String getApCustom6() {
		return apCustom6;
	}
	public void setApCustom6(String apCustom6) {
		this.apCustom6 = apCustom6;
	}
}
