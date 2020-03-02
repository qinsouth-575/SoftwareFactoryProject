package com.factory.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.factory.entity.SaleOrderDetail;
import com.factory.entity.SaleReturnWarehouseDetails;
import com.factory.mapper.SaleReturnWarehouseDetailsMapper;

@Service
public class SaleReturnWarehouseDetailBiz {
	@Autowired
	private SaleReturnWarehouseDetailsMapper dao;
	//根据订单主表id查询详表信息
	public List<SaleReturnWarehouseDetails> queryAlldetail(int soid){
		List<SaleReturnWarehouseDetails> list=dao.queryAlldetial(soid);
		return list;
	}
	
	//根据订单主表id查询
	public boolean deleteByIddetial(int id) {
		return dao.deleteByIddetial(id)>0;
	}
	
	//修改详表信息
	public boolean insertSelective(List<SaleReturnWarehouseDetails> details){
		boolean b=dao.insertSelective(details)>0;
		return b;
	}
	
	//删除详表信息
	public boolean deleteAll() {
		boolean b=dao.deleteAll()>0;
		return b;
	}
}
