package com.factory.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.factory.entity.Comdepartment;
import com.factory.entity.ComdepartmentExample;
import com.factory.entity.ComwareHouse;
import com.factory.mapper.ComwareHouseMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * - 业务逻辑层 - 仓库类
 * @author south wind
 * @version v1.0 2020年2月21日 下午5:18:34
 * - 表/功能：
 */
public class Flqj_ComwareHouseBiz {
	
	@Autowired
	private ComwareHouseMapper dao;
	
	//部门设定 - 1.分页查询一条部门
    /*public PageInfo<ComwareHouse> queryCDAll(ComwareHouse record){
    	PageHelper.startPage(record.getPageNum(), record.getPageSize());
    	List<ComwareHouse> cdList = dao.queryCDAll(record);
    	PageInfo<ComwareHouse> page = new PageInfo<ComwareHouse>(cdList); 
    	return page;
    }

    //部门设定 - 2.新增部门
    public boolean insertComDepartment(Comdepartment record) {
    	return dao.insert(record) > 0;
    };

    //部门设定 - 3.删除部门
    public boolean deleteComDepartment(String departID) {
    	ComdepartmentExample example = new ComdepartmentExample();
    	example.createCriteria().andDepartidEqualTo(departID);
    	return dao.deleteByExample(example) > 0;
    };

    //部门设定 - 4.修改部门
    public boolean updateComDepartment(Comdepartment record) {
    	ComdepartmentExample example = new ComdepartmentExample();
    	example.createCriteria().andDepartidEqualTo(record.getDepartid());
    	return dao.updateByExample(record, example) > 0;
    };*/
	
	
	
	
}
