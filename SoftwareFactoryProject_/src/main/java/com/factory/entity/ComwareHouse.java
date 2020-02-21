package com.factory.entity;

/**
 * - 实体层 - 部门类
 * @author south wind
 * @version v1.0 2020年2月21日 下午5:16:48
 * - 表/功能：
 */
public class ComwareHouse {
	
    private String warehouseid;
    private String warehousename;
    private String shortname;
    private String engname;
    private String linkman;
    private String telephone;
    private String warehouseaddress;
    private String memo;
    private Short mergeoutstate;
    private Integer dataver;
    
    private Integer pageNum;				//当前页
    private final Integer pageSize = 1;		//每页显示条数
    private String flag;					//goInsert：新增	goUpdate：修改

    public ComwareHouse() {
		super();
	}

	public ComwareHouse(String warehouseid, String warehousename, String shortname, String engname, String linkman,
			String telephone, String warehouseaddress, String memo, Short mergeoutstate, Integer dataver,
			Integer pageNum, String flag) {
		super();
		this.warehouseid = warehouseid;
		this.warehousename = warehousename;
		this.shortname = shortname;
		this.engname = engname;
		this.linkman = linkman;
		this.telephone = telephone;
		this.warehouseaddress = warehouseaddress;
		this.memo = memo;
		this.mergeoutstate = mergeoutstate;
		this.dataver = dataver;
		this.pageNum = pageNum;
		this.flag = flag;
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

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public String getEngname() {
        return engname;
    }

    public void setEngname(String engname) {
        this.engname = engname;
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getWarehouseaddress() {
        return warehouseaddress;
    }

    public void setWarehouseaddress(String warehouseaddress) {
        this.warehouseaddress = warehouseaddress;
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

    public Integer getDataver() {
        return dataver;
    }

    public void setDataver(Integer dataver) {
        this.dataver = dataver;
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

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	@Override
	public String toString() {
		return "ComwareHouse [warehouseid=" + warehouseid + ", warehousename=" + warehousename + ", shortname="
				+ shortname + ", engname=" + engname + ", linkman=" + linkman + ", telephone=" + telephone
				+ ", warehouseaddress=" + warehouseaddress + ", memo=" + memo + ", mergeoutstate=" + mergeoutstate
				+ ", dataver=" + dataver + ", pageNum=" + pageNum + ", pageSize=" + pageSize + ", flag=" + flag + "]";
	}

}