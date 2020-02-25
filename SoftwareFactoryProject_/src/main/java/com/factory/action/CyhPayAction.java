package com.factory.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.factory.biz.CyhPayBiz;
import com.factory.entity.PayablesDetail;
import com.factory.entity.PayablesMain;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
@RequestMapping("/CPayMain")
@Controller
public class CyhPayAction {
	@Autowired
	private CyhPayBiz cyhPayBizService;
	
	//根据id查询详表信息
	@RequestMapping("/queryDetail")
	@ResponseBody
	public PageInfo queryDetail(String payablesid) {
		return cyhPayBizService.CqueryDetail(payablesid);
	}
	
	@RequestMapping("/cyhQueryPayMain")
	@ResponseBody
	public PageInfo queryByPagePayMain() {
		return cyhPayBizService.CqueryPaMain();
	}
	
	@RequestMapping("/cDeletePayMain")
	@ResponseBody
	public boolean cDeletePayMian(String payablesId) {
		return cyhPayBizService.deletePayMain(payablesId);
	}
	
	//先增主表
	@RequestMapping("/insertPayMainInfo")
	@ResponseBody
	public boolean insertPayMainInfo(PayablesMain payablesMain) {
		return cyhPayBizService.insertPayMainInfo(payablesMain);
	}
	
	
	//再增详表
	@RequestMapping("/insertPayablesDetail")
	@ResponseBody
	public boolean insertPayablesDetail(@RequestBody List<PayablesDetail> list) {
		for(PayablesDetail payablesDetail:list) {
			return cyhPayBizService.insertPayablesDetail(payablesDetail);
		}
		return false;
	}
	
	//修改主表
	@ResponseBody
	@RequestMapping("/updatePayablesMainInfo")
	public boolean updatePayablesMainInfo(PayablesMain payablesMain) {
		return cyhPayBizService.updatePayablesMainInfo(payablesMain);
	}
	
	//修改详表
	@RequestMapping("/updatePayablesDetailInfo")
	@ResponseBody
	public boolean updatePayablesDetailInfo(PayablesDetail payablesDetail) {
		return cyhPayBizService.updatePayablesDetailInfo(payablesDetail);
	}
	
	
}
