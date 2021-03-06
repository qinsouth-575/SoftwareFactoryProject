package com.factory.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.factory.entity.Staff;
import com.factory.mapper.StaffMapper;

@Service
public class Flqj_StaffBiz {
	
	@Autowired
	private StaffMapper dao;
	
	public List<Staff> querySTAAll(Staff sta){
		return dao.selectByExample(null);
	}
	
	//查询账户密码
	public Staff queryNameAndPwd(Staff staff) {
		return dao.queryNameAndPwd(staff);
	}

	//按Id查询当前登录用户信息
    public Staff selectByPrimaryKey(Integer staffId) {
    	return dao.selectByPrimaryKey(staffId);
    };
	
	
	
	
}
