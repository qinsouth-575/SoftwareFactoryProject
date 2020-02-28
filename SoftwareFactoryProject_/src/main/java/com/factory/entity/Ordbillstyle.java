package com.factory.entity;

public class Ordbillstyle {
	
    private Short flag;				//标识（3.采购请购/6.入库类型/7.出库类型）
    private String classid;			//类型编号
    private String classname;		//类型名称
    private String engname;			//英文名称
    private String memo;			//备注
    private Short mergeoutstate;
    private String accsubjectid;	//货方科目

    public Short getFlag() {
        return flag;
    }

    public void setFlag(Short flag) {
        this.flag = flag;
    }

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
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

    public Short getMergeoutstate() {
        return mergeoutstate;
    }

    public void setMergeoutstate(Short mergeoutstate) {
        this.mergeoutstate = mergeoutstate;
    }

    public String getAccsubjectid() {
        return accsubjectid;
    }

    public void setAccsubjectid(String accsubjectid) {
        this.accsubjectid = accsubjectid;
    }

	@Override
	public String toString() {
		return "Ordbillstyle [flag=" + flag + ", classid=" + classid + ", classname=" + classname + ", engname="
				+ engname + ", memo=" + memo + ", mergeoutstate=" + mergeoutstate + ", accsubjectid=" + accsubjectid
				+ "]";
	}
    
}