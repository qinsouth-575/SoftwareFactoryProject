package com.factory.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.factory.entity.Comdepartment;
import com.factory.entity.ComdepartmentExample;
import com.factory.mapper.ComdepartmentMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

public class Flqj_ComcustClass {
	
	@Autowired
	private ComdepartmentMapper dao;
	
	//供应商类别/客户类别 设定 - 1.分页查询一条 供应商类别/客户类别
    public PageInfo<Comdepartment> queryCDAll(Comdepartment record){
    	PageHelper.startPage(record.getPageNum(), record.getPageSize());
    	List<Comdepartment> cdList = dao.queryCDAll(record);
    	PageInfo<Comdepartment> page = new PageInfo<Comdepartment>(cdList); 
    	return page;
    }

    //供应商类别/客户类别设定 - 2.新增 供应商类别/客户类别
    public boolean insertComDepartment(Comdepartment record) {
    	return dao.insert(record) > 0;
    };

    //供应商类别/客户类别设定 - 3.删除 供应商类别/客户类别
    public boolean deleteComDepartment(String departID) {
    	ComdepartmentExample example = new ComdepartmentExample();
    	example.createCriteria().andDepartidEqualTo(departID);
    	return dao.deleteByExample(example) > 0;
    };

    //供应商类别/客户类别设定 - 4.修改 供应商类别/客户类别
    public boolean updateComDepartment(Comdepartment record) {
    	ComdepartmentExample example = new ComdepartmentExample();
    	example.createCriteria().andDepartidEqualTo(record.getDepartid());
    	return dao.updateByExample(record, example) > 0;
    };

}
