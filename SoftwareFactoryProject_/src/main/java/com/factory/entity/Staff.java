package com.factory.entity;

import java.util.Date;

public class Staff {
    private String staffId;

    private String staffName;

    private String staffEnglishName;

    private String teamId;

    private Boolean staffGender;

    private String staffIdnumber;

    private String password;

    private Date staffBirthday;

    private Integer staffMaritalstatus;

    private Integer staffNativePlace;

    private String staffNativeplace;

    private String staffNationality;

    private String staffNation;

    private String staffChineseposition;

    private String staffZipcode;

    private String staffMobilephone;

    private String staffPoliticalstatus;

    private Date staffEntrydate;

    private Date staffBecomeaRegularworker;

    private String staffProbationperiod;

    private Date staffDimissiondate;

    private String staffTechnicaltitle;

    private String staffEnglishposition;

    private String staffAddress;

    private String staffPhone;

    private String staffHighesteducation;

    private String staffDegree;

    private String staffGraduateschool;

    private String staffMajor;

    private String staffForeignlanguagelevel;

    private Date staffPhysicalExaminationdate;

    private Date staffAtmaturitydate;

    private Date staffEntercountry;

    private String staffPassportNumber;

    private Date staffContractstartdate;

    private Date staffContractenddate;

    private String staffContractduration;

    private String staffEmail;

    private String staffCensusregisternumber;

    private String staffCensusregistezipcode;

    private String staffCensusregisteraddress;

    private String staffHometelephone;

    private String staffHomezipcode;

    private String staffHomeaddress;

    private String staffNewphone;

    private String staffNewzipcode;

    private String staffNewaddress;

    private String staffEmergencycontact;

    private String staffUrgentcontactzipcode;

    private String staffEmergencycontactnumber;

    private String staffEmergencycontactaddress;

    private String staffRemark;

    private String staffAuditing;

    private String staffYn;

    private String staffCustom1;

    private String staffCustom2;

    private String staffCustom3;
    
    public Staff() {
		super();
	}

	public Staff(String staffId) {
		super();
		this.staffId = staffId;
	}

	public Staff(String staffId, String staffName, String staffEnglishName, String teamId, Boolean staffGender,
			String staffIdnumber, String password, Date staffBirthday, Integer staffMaritalstatus,
			Integer staffNativePlace, String staffNativeplace2, String staffNationality, String staffNation,
			String staffChineseposition, String staffZipcode, String staffMobilephone, String staffPoliticalstatus,
			Date staffEntrydate, Date staffBecomeaRegularworker, String staffProbationperiod, Date staffDimissiondate,
			String staffTechnicaltitle, String staffEnglishposition, String staffAddress, String staffPhone,
			String staffHighesteducation, String staffDegree, String staffGraduateschool, String staffMajor,
			String staffForeignlanguagelevel, Date staffPhysicalExaminationdate, Date staffAtmaturitydate,
			Date staffEntercountry, String staffPassportNumber, Date staffContractstartdate, Date staffContractenddate,
			String staffContractduration, String staffEmail, String staffCensusregisternumber,
			String staffCensusregistezipcode, String staffCensusregisteraddress, String staffHometelephone,
			String staffHomezipcode, String staffHomeaddress, String staffNewphone, String staffNewzipcode,
			String staffNewaddress, String staffEmergencycontact, String staffUrgentcontactzipcode,
			String staffEmergencycontactnumber, String staffEmergencycontactaddress, String staffRemark,
			String staffAuditing, String staffYn, String staffCustom1, String staffCustom2, String staffCustom3) {
		super();
		this.staffId = staffId;
		this.staffName = staffName;
		this.staffEnglishName = staffEnglishName;
		this.teamId = teamId;
		this.staffGender = staffGender;
		this.staffIdnumber = staffIdnumber;
		this.password = password;
		this.staffBirthday = staffBirthday;
		this.staffMaritalstatus = staffMaritalstatus;
		this.staffNativePlace = staffNativePlace;
		staffNativeplace = staffNativeplace2;
		this.staffNationality = staffNationality;
		this.staffNation = staffNation;
		this.staffChineseposition = staffChineseposition;
		this.staffZipcode = staffZipcode;
		this.staffMobilephone = staffMobilephone;
		this.staffPoliticalstatus = staffPoliticalstatus;
		this.staffEntrydate = staffEntrydate;
		this.staffBecomeaRegularworker = staffBecomeaRegularworker;
		this.staffProbationperiod = staffProbationperiod;
		this.staffDimissiondate = staffDimissiondate;
		this.staffTechnicaltitle = staffTechnicaltitle;
		this.staffEnglishposition = staffEnglishposition;
		this.staffAddress = staffAddress;
		this.staffPhone = staffPhone;
		this.staffHighesteducation = staffHighesteducation;
		this.staffDegree = staffDegree;
		this.staffGraduateschool = staffGraduateschool;
		this.staffMajor = staffMajor;
		this.staffForeignlanguagelevel = staffForeignlanguagelevel;
		this.staffPhysicalExaminationdate = staffPhysicalExaminationdate;
		this.staffAtmaturitydate = staffAtmaturitydate;
		this.staffEntercountry = staffEntercountry;
		this.staffPassportNumber = staffPassportNumber;
		this.staffContractstartdate = staffContractstartdate;
		this.staffContractenddate = staffContractenddate;
		this.staffContractduration = staffContractduration;
		this.staffEmail = staffEmail;
		this.staffCensusregisternumber = staffCensusregisternumber;
		this.staffCensusregistezipcode = staffCensusregistezipcode;
		this.staffCensusregisteraddress = staffCensusregisteraddress;
		this.staffHometelephone = staffHometelephone;
		this.staffHomezipcode = staffHomezipcode;
		this.staffHomeaddress = staffHomeaddress;
		this.staffNewphone = staffNewphone;
		this.staffNewzipcode = staffNewzipcode;
		this.staffNewaddress = staffNewaddress;
		this.staffEmergencycontact = staffEmergencycontact;
		this.staffUrgentcontactzipcode = staffUrgentcontactzipcode;
		this.staffEmergencycontactnumber = staffEmergencycontactnumber;
		this.staffEmergencycontactaddress = staffEmergencycontactaddress;
		this.staffRemark = staffRemark;
		this.staffAuditing = staffAuditing;
		this.staffYn = staffYn;
		this.staffCustom1 = staffCustom1;
		this.staffCustom2 = staffCustom2;
		this.staffCustom3 = staffCustom3;
	}

	public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffEnglishName() {
        return staffEnglishName;
    }

    public void setStaffEnglishName(String staffEnglishName) {
        this.staffEnglishName = staffEnglishName;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public Boolean getStaffGender() {
        return staffGender;
    }

    public void setStaffGender(Boolean staffGender) {
        this.staffGender = staffGender;
    }

    public String getStaffIdnumber() {
        return staffIdnumber;
    }

    public void setStaffIdnumber(String staffIdnumber) {
        this.staffIdnumber = staffIdnumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getStaffBirthday() {
        return staffBirthday;
    }

    public void setStaffBirthday(Date staffBirthday) {
        this.staffBirthday = staffBirthday;
    }

    public Integer getStaffMaritalstatus() {
        return staffMaritalstatus;
    }

    public void setStaffMaritalstatus(Integer staffMaritalstatus) {
        this.staffMaritalstatus = staffMaritalstatus;
    }

    public Integer getStaffNativePlace() {
        return staffNativePlace;
    }

    public void setStaffNativePlace(Integer staffNativePlace) {
        this.staffNativePlace = staffNativePlace;
    }

    public String getStaffNativeplace() {
        return staffNativeplace;
    }

    public void setStaffNativeplace(String staffNativeplace) {
        this.staffNativeplace = staffNativeplace;
    }

    public String getStaffNationality() {
        return staffNationality;
    }

    public void setStaffNationality(String staffNationality) {
        this.staffNationality = staffNationality;
    }

    public String getStaffNation() {
        return staffNation;
    }

    public void setStaffNation(String staffNation) {
        this.staffNation = staffNation;
    }

    public String getStaffChineseposition() {
        return staffChineseposition;
    }

    public void setStaffChineseposition(String staffChineseposition) {
        this.staffChineseposition = staffChineseposition;
    }

    public String getStaffZipcode() {
        return staffZipcode;
    }

    public void setStaffZipcode(String staffZipcode) {
        this.staffZipcode = staffZipcode;
    }

    public String getStaffMobilephone() {
        return staffMobilephone;
    }

    public void setStaffMobilephone(String staffMobilephone) {
        this.staffMobilephone = staffMobilephone;
    }

    public String getStaffPoliticalstatus() {
        return staffPoliticalstatus;
    }

    public void setStaffPoliticalstatus(String staffPoliticalstatus) {
        this.staffPoliticalstatus = staffPoliticalstatus;
    }

    public Date getStaffEntrydate() {
        return staffEntrydate;
    }

    public void setStaffEntrydate(Date staffEntrydate) {
        this.staffEntrydate = staffEntrydate;
    }

    public Date getStaffBecomeaRegularworker() {
        return staffBecomeaRegularworker;
    }

    public void setStaffBecomeaRegularworker(Date staffBecomeaRegularworker) {
        this.staffBecomeaRegularworker = staffBecomeaRegularworker;
    }

    public String getStaffProbationperiod() {
        return staffProbationperiod;
    }

    public void setStaffProbationperiod(String staffProbationperiod) {
        this.staffProbationperiod = staffProbationperiod;
    }

    public Date getStaffDimissiondate() {
        return staffDimissiondate;
    }

    public void setStaffDimissiondate(Date staffDimissiondate) {
        this.staffDimissiondate = staffDimissiondate;
    }

    public String getStaffTechnicaltitle() {
        return staffTechnicaltitle;
    }

    public void setStaffTechnicaltitle(String staffTechnicaltitle) {
        this.staffTechnicaltitle = staffTechnicaltitle;
    }

    public String getStaffEnglishposition() {
        return staffEnglishposition;
    }

    public void setStaffEnglishposition(String staffEnglishposition) {
        this.staffEnglishposition = staffEnglishposition;
    }

    public String getStaffAddress() {
        return staffAddress;
    }

    public void setStaffAddress(String staffAddress) {
        this.staffAddress = staffAddress;
    }

    public String getStaffPhone() {
        return staffPhone;
    }

    public void setStaffPhone(String staffPhone) {
        this.staffPhone = staffPhone;
    }

    public String getStaffHighesteducation() {
        return staffHighesteducation;
    }

    public void setStaffHighesteducation(String staffHighesteducation) {
        this.staffHighesteducation = staffHighesteducation;
    }

    public String getStaffDegree() {
        return staffDegree;
    }

    public void setStaffDegree(String staffDegree) {
        this.staffDegree = staffDegree;
    }

    public String getStaffGraduateschool() {
        return staffGraduateschool;
    }

    public void setStaffGraduateschool(String staffGraduateschool) {
        this.staffGraduateschool = staffGraduateschool;
    }

    public String getStaffMajor() {
        return staffMajor;
    }

    public void setStaffMajor(String staffMajor) {
        this.staffMajor = staffMajor;
    }

    public String getStaffForeignlanguagelevel() {
        return staffForeignlanguagelevel;
    }

    public void setStaffForeignlanguagelevel(String staffForeignlanguagelevel) {
        this.staffForeignlanguagelevel = staffForeignlanguagelevel;
    }

    public Date getStaffPhysicalExaminationdate() {
        return staffPhysicalExaminationdate;
    }

    public void setStaffPhysicalExaminationdate(Date staffPhysicalExaminationdate) {
        this.staffPhysicalExaminationdate = staffPhysicalExaminationdate;
    }

    public Date getStaffAtmaturitydate() {
        return staffAtmaturitydate;
    }

    public void setStaffAtmaturitydate(Date staffAtmaturitydate) {
        this.staffAtmaturitydate = staffAtmaturitydate;
    }

    public Date getStaffEntercountry() {
        return staffEntercountry;
    }

    public void setStaffEntercountry(Date staffEntercountry) {
        this.staffEntercountry = staffEntercountry;
    }

    public String getStaffPassportNumber() {
        return staffPassportNumber;
    }

    public void setStaffPassportNumber(String staffPassportNumber) {
        this.staffPassportNumber = staffPassportNumber;
    }

    public Date getStaffContractstartdate() {
        return staffContractstartdate;
    }

    public void setStaffContractstartdate(Date staffContractstartdate) {
        this.staffContractstartdate = staffContractstartdate;
    }

    public Date getStaffContractenddate() {
        return staffContractenddate;
    }

    public void setStaffContractenddate(Date staffContractenddate) {
        this.staffContractenddate = staffContractenddate;
    }

    public String getStaffContractduration() {
        return staffContractduration;
    }

    public void setStaffContractduration(String staffContractduration) {
        this.staffContractduration = staffContractduration;
    }

    public String getStaffEmail() {
        return staffEmail;
    }

    public void setStaffEmail(String staffEmail) {
        this.staffEmail = staffEmail;
    }

    public String getStaffCensusregisternumber() {
        return staffCensusregisternumber;
    }

    public void setStaffCensusregisternumber(String staffCensusregisternumber) {
        this.staffCensusregisternumber = staffCensusregisternumber;
    }

    public String getStaffCensusregistezipcode() {
        return staffCensusregistezipcode;
    }

    public void setStaffCensusregistezipcode(String staffCensusregistezipcode) {
        this.staffCensusregistezipcode = staffCensusregistezipcode;
    }

    public String getStaffCensusregisteraddress() {
        return staffCensusregisteraddress;
    }

    public void setStaffCensusregisteraddress(String staffCensusregisteraddress) {
        this.staffCensusregisteraddress = staffCensusregisteraddress;
    }

    public String getStaffHometelephone() {
        return staffHometelephone;
    }

    public void setStaffHometelephone(String staffHometelephone) {
        this.staffHometelephone = staffHometelephone;
    }

    public String getStaffHomezipcode() {
        return staffHomezipcode;
    }

    public void setStaffHomezipcode(String staffHomezipcode) {
        this.staffHomezipcode = staffHomezipcode;
    }

    public String getStaffHomeaddress() {
        return staffHomeaddress;
    }

    public void setStaffHomeaddress(String staffHomeaddress) {
        this.staffHomeaddress = staffHomeaddress;
    }

    public String getStaffNewphone() {
        return staffNewphone;
    }

    public void setStaffNewphone(String staffNewphone) {
        this.staffNewphone = staffNewphone;
    }

    public String getStaffNewzipcode() {
        return staffNewzipcode;
    }

    public void setStaffNewzipcode(String staffNewzipcode) {
        this.staffNewzipcode = staffNewzipcode;
    }

    public String getStaffNewaddress() {
        return staffNewaddress;
    }

    public void setStaffNewaddress(String staffNewaddress) {
        this.staffNewaddress = staffNewaddress;
    }

    public String getStaffEmergencycontact() {
        return staffEmergencycontact;
    }

    public void setStaffEmergencycontact(String staffEmergencycontact) {
        this.staffEmergencycontact = staffEmergencycontact;
    }

    public String getStaffUrgentcontactzipcode() {
        return staffUrgentcontactzipcode;
    }

    public void setStaffUrgentcontactzipcode(String staffUrgentcontactzipcode) {
        this.staffUrgentcontactzipcode = staffUrgentcontactzipcode;
    }

    public String getStaffEmergencycontactnumber() {
        return staffEmergencycontactnumber;
    }

    public void setStaffEmergencycontactnumber(String staffEmergencycontactnumber) {
        this.staffEmergencycontactnumber = staffEmergencycontactnumber;
    }

    public String getStaffEmergencycontactaddress() {
        return staffEmergencycontactaddress;
    }

    public void setStaffEmergencycontactaddress(String staffEmergencycontactaddress) {
        this.staffEmergencycontactaddress = staffEmergencycontactaddress;
    }

    public String getStaffRemark() {
        return staffRemark;
    }

    public void setStaffRemark(String staffRemark) {
        this.staffRemark = staffRemark;
    }

    public String getStaffAuditing() {
        return staffAuditing;
    }

    public void setStaffAuditing(String staffAuditing) {
        this.staffAuditing = staffAuditing;
    }

    public String getStaffYn() {
        return staffYn;
    }

    public void setStaffYn(String staffYn) {
        this.staffYn = staffYn;
    }

    public String getStaffCustom1() {
        return staffCustom1;
    }

    public void setStaffCustom1(String staffCustom1) {
        this.staffCustom1 = staffCustom1;
    }

    public String getStaffCustom2() {
        return staffCustom2;
    }

    public void setStaffCustom2(String staffCustom2) {
        this.staffCustom2 = staffCustom2;
    }

    public String getStaffCustom3() {
        return staffCustom3;
    }

    public void setStaffCustom3(String staffCustom3) {
        this.staffCustom3 = staffCustom3;
    }

	@Override
	public String toString() {
		return "Staff [staffId=" + staffId + ", staffName=" + staffName + ", staffEnglishName=" + staffEnglishName
				+ ", teamId=" + teamId + ", staffGender=" + staffGender + ", staffIdnumber=" + staffIdnumber
				+ ", password=" + password + ", staffBirthday=" + staffBirthday + ", staffMaritalstatus="
				+ staffMaritalstatus + ", staffNativePlace=" + staffNativePlace + ", staffNativeplace="
				+ staffNativeplace + ", staffNationality=" + staffNationality + ", staffNation=" + staffNation
				+ ", staffChineseposition=" + staffChineseposition + ", staffZipcode=" + staffZipcode
				+ ", staffMobilephone=" + staffMobilephone + ", staffPoliticalstatus=" + staffPoliticalstatus
				+ ", staffEntrydate=" + staffEntrydate + ", staffBecomeaRegularworker=" + staffBecomeaRegularworker
				+ ", staffProbationperiod=" + staffProbationperiod + ", staffDimissiondate=" + staffDimissiondate
				+ ", staffTechnicaltitle=" + staffTechnicaltitle + ", staffEnglishposition=" + staffEnglishposition
				+ ", staffAddress=" + staffAddress + ", staffPhone=" + staffPhone + ", staffHighesteducation="
				+ staffHighesteducation + ", staffDegree=" + staffDegree + ", staffGraduateschool="
				+ staffGraduateschool + ", staffMajor=" + staffMajor + ", staffForeignlanguagelevel="
				+ staffForeignlanguagelevel + ", staffPhysicalExaminationdate=" + staffPhysicalExaminationdate
				+ ", staffAtmaturitydate=" + staffAtmaturitydate + ", staffEntercountry=" + staffEntercountry
				+ ", staffPassportNumber=" + staffPassportNumber + ", staffContractstartdate=" + staffContractstartdate
				+ ", staffContractenddate=" + staffContractenddate + ", staffContractduration=" + staffContractduration
				+ ", staffEmail=" + staffEmail + ", staffCensusregisternumber=" + staffCensusregisternumber
				+ ", staffCensusregistezipcode=" + staffCensusregistezipcode + ", staffCensusregisteraddress="
				+ staffCensusregisteraddress + ", staffHometelephone=" + staffHometelephone + ", staffHomezipcode="
				+ staffHomezipcode + ", staffHomeaddress=" + staffHomeaddress + ", staffNewphone=" + staffNewphone
				+ ", staffNewzipcode=" + staffNewzipcode + ", staffNewaddress=" + staffNewaddress
				+ ", staffEmergencycontact=" + staffEmergencycontact + ", staffUrgentcontactzipcode="
				+ staffUrgentcontactzipcode + ", staffEmergencycontactnumber=" + staffEmergencycontactnumber
				+ ", staffEmergencycontactaddress=" + staffEmergencycontactaddress + ", staffRemark=" + staffRemark
				+ ", staffAuditing=" + staffAuditing + ", staffYn=" + staffYn + ", staffCustom1=" + staffCustom1
				+ ", staffCustom2=" + staffCustom2 + ", staffCustom3=" + staffCustom3 + "]";
	}
    
}