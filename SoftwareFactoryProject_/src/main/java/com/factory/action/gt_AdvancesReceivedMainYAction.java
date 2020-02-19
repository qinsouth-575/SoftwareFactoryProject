package com.factory.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.factory.biz.gt_AdvancesReceivedMainYBiz;

@Controller
@RequestMapping("/gt_AdvancesReceivedMainY")
public class gt_AdvancesReceivedMainYAction {
	
	@Autowired
	private gt_AdvancesReceivedMainYBiz army;

	//1.单据号码查询
	@GetMapping("/gt_select_payablestime")
	@ResponseBody
	public String gt_select_payablestime(String payablestime) {
		return army.gt_select_payablestime(payablestime);
	}
}
