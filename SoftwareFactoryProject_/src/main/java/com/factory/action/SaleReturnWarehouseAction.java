package com.factory.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.factory.biz.SaleReturnWarehouseBiz;
import com.factory.entity.SaleOrder;
import com.factory.entity.SaleReturnWarehouse;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/salereturnwarehouse")
public class SaleReturnWarehouseAction {
	@Autowired
	private SaleReturnWarehouseBiz biz;
	
	
	@RequestMapping(value = "PageQueryAll",method = RequestMethod.POST)
	@ResponseBody
	public PageInfo<SaleReturnWarehouse> PageQueryAll(@RequestBody SaleReturnWarehouse secord){
		PageInfo<SaleReturnWarehouse> page=biz.PageQueryAll(secord);
		return page;
	}
	
	//修改和新增
	@RequestMapping(value = "insertOrUpdateCD", method = RequestMethod.PUT)
	@ResponseBody
	public Map<String,String> insertOrUpdateCD(@RequestBody SaleReturnWarehouse cd){
		Map<String,String> map = new HashMap<String,String>();
		System.out.println(cd.getFlag());
		if(cd.getFlag().equals("goInsert")) {
			if(biz.insertSaleOrder(cd)) {
				map.put("code", "1");
				map.put("message", "新增成功！");
			} else {
				map.put("code", "3");
				map.put("message", "新增失败！");
			}
		} else if(cd.getFlag().equals("goUpdate")) {
			if(biz.updateSaleOrder(cd)) {
				map.put("code", "2");
				map.put("message", "修改成功！");
			} else {
				map.put("code", "3");
				map.put("message", "修改失败！");
			}
		}
		return map;
	}
	
	//根据编号删除
	@RequestMapping(value = "deleteById/{srwId}", method = RequestMethod.DELETE)
	@ResponseBody
	public Map<String,String> deleteById(@PathVariable int srwId){
		System.out.println(""+srwId);
		Map<String,String> map = new HashMap<String,String>();
		if(biz.deleteById(srwId)) {
			map.put("code", "1");
			map.put("message", "删除成功！");
		} else {
			map.put("code", "3");
			map.put("message", "删除失败！");
		}
		return map;
	}
	
	
			//查询编号
			@RequestMapping(value = "querydescid",method = RequestMethod.POST)
			@ResponseBody
			public List<SaleReturnWarehouse> querydescid(){
		  		return biz.querydescid();
		  	}
			
			//销售订单 - 单据号码查询
			@RequestMapping(value = "queryDateToId", method = RequestMethod.GET)
			@ResponseBody
			public String queryPSDocumentNumber(String srwDocumentDate) {
				return biz.queryPSDocumentNumber(srwDocumentDate);
			}
			
			
			//审核与取消审核
			@RequestMapping(value = "updateshyqxsh", method = RequestMethod.POST)
			@ResponseBody
			public Map<String,String> updateshyqxsh(@RequestBody SaleReturnWarehouse cd){
				Map<String,String> map = new HashMap<String,String>();
				 
					if(biz.updateAll(cd)) {
						map.put("code", "1");
						map.put("message", "修改成功！");
					} else {
						map.put("code", "2");
						map.put("message", "修改失败！");
					}
				
				return map;
			}
}
