package com.factory.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.factory.biz.SalesZpBiz;
import com.factory.entity.Comdepartment;
import com.factory.entity.Customer;
import com.factory.entity.SaleOutWarehouse;
import com.factory.entity.SaleQuotation;
import com.factory.entity.Staff;
import com.github.pagehelper.PageInfo;

/**
 *  控制层
 * @author zhoupeng
 *
 */
@Controller
@RequestMapping("/zp")
public class SalesZpAction {
	
	@Autowired
	private SalesZpBiz sBiz;
	
	/**
	 *审核销售报价单
	 */
	@RequestMapping(value = "shbaojia", method = RequestMethod.GET)
	@ResponseBody
	public int shbaojia(String sqId) {
		return sBiz.shbaojia(sqId);
	}
	
	/**
	 * 查询客户资料
	 */
	@RequestMapping(value = "querykh", method = RequestMethod.GET)
	@ResponseBody
	public List<Customer> querykh(String type,String name) {
		return sBiz.querykh(type, name);
	}
	
	/**
	 * 查询员工资料
	 */
	@RequestMapping(value = "queryyg", method = RequestMethod.GET)
	@ResponseBody
	public List<Staff> queryyg(String type,String name) {
		return sBiz.queryyg(type, name);
	}
	
	/**
	 * 查询部门资料
	 */
	@RequestMapping(value = "querybm", method = RequestMethod.GET)
	@ResponseBody
	public List<Comdepartment> querybm(String type,String name) {
		return sBiz.querybm(type, name);
	}
	
	/**
	 * 查询销售报价单
	 */
	@RequestMapping(value = "querybaojia", method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<SaleQuotation> querybaojia(Integer pageNum, Integer pageSize) {
		return sBiz.querybaojia(pageNum, pageSize);
	}
	
	/**
	 * 查询销售出库单
	 */
	@RequestMapping(value = "querychuku", method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<SaleOutWarehouse> querychuku(Integer pageNum, Integer pageSize) {
		return sBiz.querychuku(pageNum, pageSize);
	}
	
	/**
	 * 新增销售报价单
	 */
	@RequestMapping(value = "addbaojia", method = RequestMethod.POST)
	@ResponseBody
	public int addbaojia(@RequestBody SaleQuotation s) {
		return sBiz.addbaojia(s);
	}
	
	/**
	 * 新增销售出库单
	 */
	@RequestMapping(value = "addchuku", method = RequestMethod.POST)
	@ResponseBody
	public int addchuku(@RequestBody SaleOutWarehouse s) {
		return sBiz.addchuku(s);
	}
	
	/**
	 * 修改销售报价单
	 */
	@RequestMapping(value = "updatebaojia", method = RequestMethod.POST)
	@ResponseBody
	public int updatebaojia(@RequestBody SaleQuotation s) {
		return sBiz.updatebaojia(s);
	}
	
	/**
	 * 修改销售出库单
	 */
	@RequestMapping(value = "updatechuku", method = RequestMethod.POST)
	@ResponseBody
	public int updatechuku(@RequestBody SaleOutWarehouse s) {
		return sBiz.updatechuku(s);
	}
	
	/**
	 * 删除销售报价单
	 */
	@RequestMapping(value = "deletebaojia", method = RequestMethod.POST)
	@ResponseBody
	public int deletebaojia(String sqId) {
		return sBiz.deletebaojia(sqId);
	}
	
	/**
	 * 删除销售出库单
	 */
	@RequestMapping(value = "deletechuku", method = RequestMethod.POST)
	@ResponseBody
	public int deletechuku(String sowId) {
		return sBiz.deletechuku(sowId);
	}
}
