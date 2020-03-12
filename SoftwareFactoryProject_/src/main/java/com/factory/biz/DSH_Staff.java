package com.factory.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.factory.entity.Staff;
import com.factory.mapper.StaffMapper;

@Service
public class DSH_Staff {
			@Autowired
			private StaffMapper dao;
			
			
			//查询所有人员信息
			public List<Staff> queryAll(){
				return dao.queryAll();
			}
}
