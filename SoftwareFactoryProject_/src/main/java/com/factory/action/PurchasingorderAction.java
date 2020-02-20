package com.factory.action;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import com.factory.biz.ComDepartmentBiz;
import com.factory.biz.purchasingorderBiz;
import com.factory.entity.Comdepartment;
import com.factory.entity.PurchasingOrder;
import com.factory.entity.PurchasingOrderDetails;
import com.factory.entity.PurchasingOrderDetailsExample;
import com.github.pagehelper.PageInfo;

@Controller  
@RequestMapping("/stu")
public class PurchasingorderAction {
	
private static Logger log = Logger.getLogger(PurchasingorderAction.class);
	
	@Autowired
	private purchasingorderBiz sb;

	//设定 - 1.分页查询主表
	@RequestMapping(value="selectb")
	@ResponseBody
	public PageInfo<PurchasingOrder> select2(Integer pageNum,Integer pageSize){
		
		log.debug("SoftwareFactoryProject_  - queryPage - 订单设定 - 1.分页查询采购订单");
		log.debug(pageNum+"页面");
		log.debug(pageSize+"数量");

		PageInfo<PurchasingOrder> le=sb.selectb_bill(pageNum,pageSize);
		log.debug(le+"牛逼");
		return le;
	     }
	
	
	
	@RequestMapping(value="selecttb_de",method=RequestMethod.POST)
	@ResponseBody
	public List<PurchasingOrderDetails> inserttb_detail(@RequestBody PurchasingOrderDetails bi){
		log.debug("经过");
		List<PurchasingOrderDetails>  list= sb.selecttb_detail(bi);

		return list;
	}
}
