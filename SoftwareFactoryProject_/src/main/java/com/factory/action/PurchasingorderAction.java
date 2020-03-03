package com.factory.action;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.factory.biz.purchasingorderBiz;
import com.factory.entity.PurchasingOrder;
import com.factory.entity.PurchasingOrderDetails;
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
	
	
	
	@RequestMapping(value="updatepo_yn",method=RequestMethod.POST)
	@ResponseBody
	public int updatepo_yn(@RequestBody PurchasingOrder bi){
		log.debug("经过:" + bi);
		int list=sb.updatepo_yn(bi);

		return list;
	}
	
	
	
	@RequestMapping(value="detele001",method=RequestMethod.POST)
	@ResponseBody
	public int detele001(@RequestBody PurchasingOrder pu){
		int  list= sb.delete001(pu);
		return list;
	}
	
	
	 
	@RequestMapping(value="detele002",method=RequestMethod.POST)
	@ResponseBody
	public int detele002(@RequestBody PurchasingOrderDetails pu){
		int  list= sb.delete002(pu);
		return list;
	}
	
	
	

	@RequestMapping(value="insertpurchasenote",method=RequestMethod.POST)
	@ResponseBody
	public int insertpurchasenote(@RequestBody PurchasingOrder pu) {
		System.out.println("数据；aaaaaaaaaaaaaaaaaaa"+JSON.toJSONString(pu));
		int list=sb.insertpurchasenote(pu);
		int kk=sb.insertpurchasenot(pu);
		return list;
	}
	
}
