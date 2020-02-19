package com.factory.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.factory.entity.Comdepartment;
import com.factory.entity.ComdepartmentExample;
import com.factory.mapper.ComdepartmentMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * - 业务逻辑层 - 部门类
 * @author south wind
 * @version v1.0 2020年2月17日 上午10:17:49
 * - 表/功能：
 */
@Service
public class Flqj_ComDepartmentBiz {
	
	@Autowired
	private ComdepartmentMapper dao;
	
	//部门设定 - 1.分页查询一条部门
    public PageInfo<Comdepartment> queryCDAll(Comdepartment record){
    	PageHelper.startPage(record.getPageNum(), record.getPageSize());
    	List<Comdepartment> cdList = dao.queryCDAll(record);
    	PageInfo<Comdepartment> page = new PageInfo<Comdepartment>(cdList); 
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
    };
	
}
