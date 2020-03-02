package com.factory.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.factory.entity.SaleOrder;
import com.factory.entity.SaleReturnWarehouse;
import com.factory.entity.SaleReturnWarehouseDetails;
import com.factory.mapper.SaleReturnWarehouseMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class SaleReturnWarehouseBiz {
	@Autowired
	private SaleReturnWarehouseMapper dao;
	
	@Autowired
	private SaleReturnWarehouseDetailBiz DetailBiz;
	
	//分页查询---退货订单
	public PageInfo<SaleReturnWarehouse> PageQueryAll(SaleReturnWarehouse secord){
		System.out.println(secord.getPageNum());
		PageHelper.startPage(secord.getPageNum(), 1);
		List<SaleReturnWarehouse> list=dao.queryAll();//主表信息
		System.out.println("显示主表编号"+list.get(0).getSrwId());
		List<SaleReturnWarehouseDetails> detail=DetailBiz.queryAlldetail(list.get(0).getSrwId());
		System.out.println(JSON.toJSONString(detail));
		PageInfo<SaleReturnWarehouse> page=new PageInfo<SaleReturnWarehouse>(list);
		page.getList().get(0).setSrwList(detail);
		return page;
	}
	
	//修改出库订单
    public boolean updateSaleOrder(SaleReturnWarehouse record) {
    	boolean bool=false;
    	boolean b=dao.updateAll(record)>0;
    	boolean b2=DetailBiz.deleteAll();
    	if(b2) {
    		System.out.println("删除详表成功！");
    	}
    	boolean b3=DetailBiz.insertSelective(record.getSrwList());
    	if(b3) {
    		System.out.println("新增详表成功！");
    	}
    	if(b&&b2&&b3) {
    		bool=true;
    	}
    	return bool;
    };
	
	//删除
	public boolean deleteById(int id) {
		boolean b=false;
		if(DetailBiz.deleteByIddetial(id)) {
			if(dao.deleteById(id)>0) {
				b=true;
			}
		}
		return b;
	}
}
