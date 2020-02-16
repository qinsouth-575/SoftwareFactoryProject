package com.factory.entity;

/**
 * - 实体层 - 部门类
 * @author south wind
 * @version v1.0 2020年2月15日 上午11:19:21
 * - 表/功能：
 */
public class Comdepartment {
	
    private String departid;		//部门编号

    private String departname;		//部门名称

    private String engname;			//英文名称

    private String memo;			//备注

    private Short female;

    private Short male;

    private String jobsch;

    private Short mergeoutstate;

    private String calid;

    private String salarytypeid;

    public String getDepartid() {
        return departid;
    }

    public void setDepartid(String departid) {
        this.departid = departid;
    }

    public String getDepartname() {
        return departname;
    }

    public void setDepartname(String departname) {
        this.departname = departname;
    }

    public String getEngname() {
        return engname;
    }

    public void setEngname(String engname) {
        this.engname = engname;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Short getFemale() {
        return female;
    }

    public void setFemale(Short female) {
        this.female = female;
    }

    public Short getMale() {
        return male;
    }

    public void setMale(Short male) {
        this.male = male;
    }

    public String getJobsch() {
        return jobsch;
    }

    public void setJobsch(String jobsch) {
        this.jobsch = jobsch;
    }

    public Short getMergeoutstate() {
        return mergeoutstate;
    }

    public void setMergeoutstate(Short mergeoutstate) {
        this.mergeoutstate = mergeoutstate;
    }

    public String getCalid() {
        return calid;
    }

    public void setCalid(String calid) {
        this.calid = calid;
    }

    public String getSalarytypeid() {
        return salarytypeid;
    }

    public void setSalarytypeid(String salarytypeid) {
        this.salarytypeid = salarytypeid;
    }

	@Override
	public String toString() {
		return "部门类 - Comdepartment [departid=" + departid + ", departname=" + departname + ", engname=" + engname + ", memo="
				+ memo + ", female=" + female + ", male=" + male + ", jobsch=" + jobsch + ", mergeoutstate="
				+ mergeoutstate + ", calid=" + calid + ", salarytypeid=" + salarytypeid + "]";
	}
    
}