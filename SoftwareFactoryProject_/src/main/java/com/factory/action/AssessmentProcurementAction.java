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
import com.factory.biz.AssessmentProcurementBiz;
import com.factory.entity.AssessmentProcurement;
import com.factory.entity.AssessmentProcurementDetailed;
import com.factory.entity.AssessmentProcurementFruit;
import com.factory.entity.PurchasingOrder;
import com.factory.entity.PurchasingOrderDetails;
import com.github.pagehelper.PageInfo;

@Controller  
@RequestMapping("/sts")
public class AssessmentProcurementAction {

	
	
private static Logger log = Logger.getLogger(AssessmentProcurementAction.class);
	
	@Autowired
	private AssessmentProcurementBiz sb;

	//设定 - 1.分页查询主表
	@RequestMapping(value="selectb")
	@ResponseBody
	public PageInfo<AssessmentProcurement> select2(Integer pageNum,Integer pageSize){
		
		log.debug("SoftwareFactoryProject_  - queryPage - 分摊设定 - 1.分页查询采购分摊");
		log.debug(pageNum+"页面");
		log.debug(pageSize+"数量");

		PageInfo<AssessmentProcurement> le=sb.selectb_bill(pageNum,pageSize);
		log.debug(le+"牛逼");
		return le;
	     }
	
	
	
	@RequestMapping(value="selecttb_de",method=RequestMethod.POST)
	@ResponseBody
	public List<AssessmentProcurementDetailed> inserttb_detail(@RequestBody AssessmentProcurementDetailed bi){
		log.debug("经过费用明细");
		List<AssessmentProcurementDetailed>  list= sb.selecttb_detail02(bi);

		return list;
	}
	
	
	
	@RequestMapping(value="selecttb_de2",method=RequestMethod.POST)
	@ResponseBody
	public List<AssessmentProcurementFruit> inserttb_detail2(@RequestBody AssessmentProcurementFruit bi){
		log.debug("经过分摊结果");
		List<AssessmentProcurementFruit>  list= sb.selecttb_detail03(bi);

		return list;
	}
	
	
	
	
	@RequestMapping(value="updateap_yn",method=RequestMethod.POST)
	@ResponseBody
	public int updatepo_yn(@RequestBody AssessmentProcurement bi){
		log.debug("经过:" + bi);
		int list=sb.updateap_yn(bi);

		return list;
	}
	
	
	
	@RequestMapping(value="detele003",method=RequestMethod.POST)
	@ResponseBody
	public int detele001(@RequestBody AssessmentProcurement pu){
		int  list= sb.delete003(pu);
		return list;
	}
	
	
	@RequestMapping(value="detele004",method=RequestMethod.POST)
	@ResponseBody
	public int detele001(@RequestBody AssessmentProcurementDetailed pu){
		int  list= sb.delete004(pu);
		return list;
	}
	
	
	
	@RequestMapping(value="detele005",method=RequestMethod.POST)
	@ResponseBody
	public int detele001(@RequestBody AssessmentProcurementFruit pu){
		int  list= sb.delete005(pu);
		return list;
	}
	
	
	
	@RequestMapping(value="insertpurchasenoteok",method=RequestMethod.POST)
	@ResponseBody
	public int insertpurchasenote(@RequestBody AssessmentProcurement pu) {
		System.out.println("数据；aaaaaaaaaaaaaaaaaaa"+JSON.toJSONString(pu));
		int list=sb.insertpurchasenote1(pu);
		int list2=sb.insertpurchasenote2(pu);
		int list3=sb.insertpurchasenote3(pu);

		return list;
	}
	
	
	
	@RequestMapping(value="updatepoDocumentNumber",method=RequestMethod.POST)
	@ResponseBody
	public int updatepoDocumentNumber(@RequestBody AssessmentProcurement bi){
		log.debug("经过:" + bi);
		int list=sb.updatepoDocumentNumber(bi);
		log.debug(list+"结果");
		return list;
	}
	
	
	
	@RequestMapping(value="selectpoaudition",method=RequestMethod.POST)
	@ResponseBody
	public String inserttb_detail(@RequestBody AssessmentProcurement bi){
		System.out.println(bi);
		AssessmentProcurement dd=sb.selectpoaudition(bi);
		System.out.println(dd);
		if (dd!=null) {
			return "0";
		}else {
		    return "1";
		}
	}
	//反审核
	@RequestMapping(value="updatepoDocumentNumber2",method=RequestMethod.POST)
	@ResponseBody
	public int updatepoDocumentNumber2(@RequestBody AssessmentProcurement bi){
		log.debug("经过:" + bi);
		int list=sb.updatepoDocumentNumber2(bi);
		log.debug(list+"结果");
		return list;
	}
}
