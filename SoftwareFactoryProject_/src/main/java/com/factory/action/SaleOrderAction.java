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

import com.factory.biz.DSH_Staff;
import com.factory.biz.SaleOrderBiz;
import com.factory.entity.SaleOrder;
import com.factory.entity.Staff;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/saleorder")
public class SaleOrderAction {
		
		@Autowired
		private SaleOrderBiz biz;
		
		@Autowired
		private DSH_Staff staffbiz;
		
		
		@RequestMapping(value = "PageQueryAll",method = RequestMethod.POST)
		@ResponseBody
		public PageInfo<SaleOrder> PageQueryAll(@RequestBody SaleOrder secord){
			PageInfo<SaleOrder> page=biz.PageQueryAll(secord);
			return page;
		}
		
		
		@RequestMapping(value = "insertOrUpdateCD", method = RequestMethod.PUT)
		@ResponseBody
		public Map<String,String> insertOrUpdateCD(@RequestBody SaleOrder cd){
			Map<String,String> map = new HashMap<String,String>();
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
		
		//删除
		@RequestMapping(value = "deleteById/{soId}", method = RequestMethod.DELETE)
		@ResponseBody
		public Map<String,String> deleteById(@PathVariable int soId){
			System.out.println(""+soId);
			Map<String,String> map = new HashMap<String,String>();
			if(biz.deleteById(soId)) {
				map.put("code", "1");
				map.put("message", "删除成功！");
			} else {
				map.put("code", "3");
				map.put("message", "删除失败！");
			}
			return map;
		}
		
		//销售订单 - 单据号码查询
		@RequestMapping(value = "queryDateToId", method = RequestMethod.GET)
		@ResponseBody
		public String queryPSDocumentNumber(String psDocumentDate) {
			return biz.queryPSDocumentNumber(psDocumentDate);
		}
		
		
		//查询人员
		@RequestMapping(value = "staffqueryAll",method = RequestMethod.POST)
		@ResponseBody
		public List<Staff> queryAll(){
			return staffbiz.queryAll();
		}
		
		//查询编号
		@RequestMapping(value = "querydescid",method = RequestMethod.POST)
		@ResponseBody
		public List<SaleOrder> querydescid(){
	  		return biz.querydescid();
	  	}
		
		//审核与取消审核
		@RequestMapping(value = "updateshyqxsh", method = RequestMethod.POST)
		@ResponseBody
		public Map<String,String> updateshyqxsh(@RequestBody SaleOrder cd){
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
