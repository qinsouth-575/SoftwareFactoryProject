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

import com.factory.biz.Flqj_ComwareHouseBiz;
import com.factory.biz.Flqj_PurchaseStorageBiz;
import com.factory.biz.Flqj_StaffBiz;
import com.factory.biz.Flqj_SupplierBiz;
import com.factory.entity.ComwareHouse;
import com.factory.entity.PurchaseStorage;
import com.factory.entity.Staff;
import com.factory.entity.Supplier;
import com.github.pagehelper.PageInfo;

/**
 * - 控制层 - 采购入库表Servlet
 * @author south wind
 * @version v1.0 2020年2月5日 上午12:45:16
 * - 表/功能：
 */
@Controller
@RequestMapping("/ps")
public class Flqj_PurchaseStorageAction {
	
	private static Logger log = Logger.getLogger(Flqj_PurchaseStorageAction.class);
	
	@Autowired
	private Flqj_PurchaseStorageBiz psb;

	@Autowired
	private Flqj_SupplierBiz sb;

	@Autowired
	private Flqj_ComwareHouseBiz chb;

	@Autowired
	private Flqj_StaffBiz sbz;
	
	
	//采购入库 - 0.单据号码查询
	@RequestMapping(value = "queryDateToId", method = RequestMethod.GET)
	@ResponseBody
	public String queryPSDocumentNumber(String psDocumentDate) {
		log.debug("SoftwareFactoryProject_ - Flqj_PurchaseStorageAction - queryPSDocumentNumber - 采购入库 - 0.单据号码查询，预开单日期：" + psDocumentDate);
		return psb.queryPSDocumentNumber(psDocumentDate);
	}
	
	//采购入库 - 1.分页查询单个采购入库单据
	@RequestMapping(value = "psa", method = RequestMethod.POST)
	@ResponseBody
	public PageInfo<PurchaseStorage> queryPSPage(@RequestBody PurchaseStorage ps){
		log.debug("SoftwareFactoryProject_ - Flqj_PurchaseStorageAction - queryPSPage - 采购入库 - 1.分页查询单个入库单据 - 参数信息：" + ps);
		PageInfo<PurchaseStorage> page = psb.queryCDAll(ps);
		log.info("查询结果分页类信息：" + page.getList().get(0));
		return page;
	}

	//采购入库 - 2.新增 and 4.修改
	@RequestMapping(value = "psa", method = RequestMethod.PUT)
	@ResponseBody
	public Map<String,String> insertOrUpdatePS(@RequestBody PurchaseStorage ps){
		log.debug("SoftwareFactoryProject_ - Flqj_PurchaseStorageAction - insertOrUpdatePS - 采购入库 - 2.新增信息 and 4.修改信息，参数信息：" + ps);
		Map<String,String> map = new HashMap<String,String>();
		if(ps.getStatu().equals("goInsert")) {
			if(psb.insertPurchaseStorage(ps)) {
				map.put("code", "1");
				map.put("message", "新增成功！");
			} else {
				map.put("code", "3");
				map.put("message", "新增失败！");
			}
		} else if(ps.getStatu().equals("goUpdate")) {
			if(psb.updatePurchaseStorage(ps)) {
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
	public List<Supplier> queryOBSthreeAll(@RequestBody Supplier obs){
		log.debug("SoftwareFactoryProject_ - Flqj_PurchaseStorageAction - queryOBSthreeAll - 参数信息：" + obs);
		return sb.queryOBSthreeAll(obs);
	}
	
	@RequestMapping(value = "querycom", method = RequestMethod.POST)
	@ResponseBody
	public List<ComwareHouse> queryCOMAll(@RequestBody ComwareHouse obs){
		log.debug("SoftwareFactoryProject_ - Flqj_PurchaseStorageAction - queryOBSthreeAll - 参数信息：" + obs);
		return chb.queryCOMAll(obs);
	}
	
	@RequestMapping(value = "querysta", method = RequestMethod.POST)
	@ResponseBody
	public List<Staff> querySTAAll(@RequestBody Staff obs){
		log.debug("SoftwareFactoryProject_ - Flqj_PurchaseStorageAction - queryOBSthreeAll - 参数信息：" + obs);
		return sbz.querySTAAll(obs);
	}

	//采购入库s - 3.删除
	@RequestMapping(value = "psa/{psDocumentNumber}", method = RequestMethod.DELETE)
	@ResponseBody
	public Map<String,String> deletePS(@PathVariable String psDocumentNumber){
		log.debug("SoftwareFactoryProject_ - Flqj_PurchaseStorageAction - deletePS - 采购入库 - 3.删除采购入库信息，删除条件id为：" + psDocumentNumber);
		Map<String,String> map = new HashMap<String,String>();
		if(psb.deletePurchaseStorage(psDocumentNumber)) {
			map.put("code", "1");
			map.put("message", "删除成功！");
		} else {
			map.put("code", "3");
			map.put("message", "删除失败！");
		}
		return map;
	}
	
	
	
}
