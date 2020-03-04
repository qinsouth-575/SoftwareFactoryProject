package com.factory.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.factory.biz.Dsww_TPurchaseRequisitionsBiz;
import com.factory.biz.Flqj_OrdbillstyleBiz;
import com.factory.entity.Ordbillstyle;
import com.factory.entity.TPurchaseRequisitions;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/tpr")
public class Dsww_TPurchaseRequisitionsAction {
	
	private static Logger log = Logger.getLogger(Dsww_TPurchaseRequisitionsAction.class);
	
	@Autowired
	private Dsww_TPurchaseRequisitionsBiz tprb;
	
	@Autowired
	private Flqj_OrdbillstyleBiz fobsb;
	
	//采购询价 - 0.单据号码查询
	@RequestMapping(value = "queryDateToId", method = RequestMethod.GET)
	@ResponseBody
	public String queryPRCount(String prDocumentDate) {
		log.debug("SoftwareFactoryProject_ - Dsww_TPurchaseRequisitionsAction - queryPRCount - 采购请购 - 0.单据号码查询，预开单日期：" + prDocumentDate);
		return tprb.queryPRCount(prDocumentDate);
	}
	
	//采购询价 - 1.分页查询单个采购询价单据
	@RequestMapping(value = "tpra", method = RequestMethod.POST)
	@ResponseBody
	public PageInfo<TPurchaseRequisitions> queryPRPage(@RequestBody TPurchaseRequisitions tpr){
		log.debug("SoftwareFactoryProject_ - Dsww_TPurchaseRequisitionsAction - queryPRPage - 采购请购 - 1.分页查询单个请购单据 - 参数信息：" + tpr);
		PageInfo<TPurchaseRequisitions> page = tprb.queryCDAll(tpr);
		log.info("查询结果分页类信息：" + page.getList().get(0));
		return page;
	}

	//采购询价 - 2.新增 and 4.修改
	@RequestMapping(value = "tpra", method = RequestMethod.PUT)
	@ResponseBody
	public Map<String,String> insertOrUpdatePR(@RequestBody TPurchaseRequisitions tpr){
		log.debug("SoftwareFactoryProject_ - Dsww_TPurchaseRequisitionsAction - insertOrUpdatePR - 采购请购 - 2.新增信息 and 4.修改信息，参数信息：" + tpr);
		Map<String,String> map = new HashMap<String,String>();
		if(tpr.getStatu().equals("goInsert")) {
			if(tprb.insert(tpr)) {
				map.put("code", "1");
				map.put("message", "新增成功！");
			} else {
				map.put("code", "3");
				map.put("message", "新增失败！");
			}
		} else if(tpr.getStatu().equals("goUpdate")) {
			if(tprb.update(tpr)) {
				map.put("code", "2");
				map.put("message", "修改成功！");
			} else {
				map.put("code", "3");
				map.put("message", "修改失败！");
			}
		}
		return map;
	}
	
	@RequestMapping(value = "queryobs", method = RequestMethod.POST)
	@ResponseBody
	public List<Ordbillstyle> queryOBSthreeAll(@RequestBody Ordbillstyle obs){
		log.debug("SoftwareFactoryProject_ - Dsww_TPurchaseRequisitionsAction - queryOBSthreeAll - 参数信息：" + obs);
		return fobsb.queryOBSthreeAll(obs);
	}

	//采购询价 - 3.删除
	@RequestMapping(value = "tpra/{prDocumentNumber}", method = RequestMethod.DELETE)
	@ResponseBody
	public Map<String,String> deletePS(@PathVariable String prDocumentNumber){
		log.debug("SoftwareFactoryProject_ - Dsww_TPurchaseRequisitionsAction - deletePS - 采购请购 - 3.删除采购询价信息，删除条件id为：" + prDocumentNumber);
		TPurchaseRequisitions tpr = new TPurchaseRequisitions(prDocumentNumber, (short)1);
		Map<String,String> map = new HashMap<String,String>();
		if(tprb.delete(tpr)) {
			map.put("code", "1");
			map.put("message", "删除成功（修改删除状态成功）！");
		} else {
			map.put("code", "3");
			map.put("message", "删除失败（修改删除状态失败）！");
		}
		return map;
	}
	
	
	
}
