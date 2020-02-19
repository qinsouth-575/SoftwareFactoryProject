package com.factory.action;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.factory.biz.Cgt_AdvancesReceivedMainYBiz;
import com.factory.entity.AdvancesReceivedMainY;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/gt_AdvancesReceivedMainY")
public class Cgt_AdvancesReceivedMainYAction {
	
	private static Logger log = Logger.getLogger(Cgt_AdvancesReceivedMainYAction.class);
	
	@Autowired
	private Cgt_AdvancesReceivedMainYBiz army;

	//1.单据号码查询
	@GetMapping("/gt_select_payablestime")
	@ResponseBody
	public String gt_select_payablestime(String payablestime) {
		return army.gt_select_payablestime(payablestime);
	}

	@PostMapping("/gt_queryPage_AdvancesReceivedMainY")
	@ResponseBody
	public PageInfo<AdvancesReceivedMainY> queryPage(@RequestBody AdvancesReceivedMainY adrmy){
		log.debug("SoftwareFactoryProject_ - ComDepartmentAction - queryPage - 部门设定 - 1.分页查询单个部门");
		log.info("多条件+分页查询 - 参数信息：" + adrmy);
		PageInfo<AdvancesReceivedMainY> page = army.queryAdvancesReceivedMainYAllDESC(adrmy);
		log.info("查询结果信息：" + page.getList().get(0));
		return page;
	}
	
	
}
