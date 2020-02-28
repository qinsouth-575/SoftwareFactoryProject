package com.factory.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.factory.entity.Supplier;
import com.factory.mapper.SupplierMapper;

@Service
public class Flqj_SupplierBiz {
	
	@Autowired
	public SupplierMapper dao;
	
	public List<Supplier> queryOBSthreeAll(Supplier supplier){
		return dao.selectByExample(null);
	}
	
	//尚未继续开发

}
