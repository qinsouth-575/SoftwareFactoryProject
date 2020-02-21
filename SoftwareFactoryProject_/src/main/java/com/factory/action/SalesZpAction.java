package com.factory.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.factory.biz.SalesZpBiz;
import com.factory.entity.SaleQuotation;
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
	 * 查询销售报价单
	 */
	@RequestMapping(value = "querybaojia", method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<SaleQuotation> querybaojia(Integer pageNum, Integer pageSize) {
		return sBiz.querybaojia(pageNum, pageSize);
	}
}
