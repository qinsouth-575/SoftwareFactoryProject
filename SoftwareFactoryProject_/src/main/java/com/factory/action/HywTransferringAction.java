package com.factory.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.factory.biz.Hyw_ComwareHouseBiz;
import com.factory.entity.ComwareHouse;
import com.factory.entity.ComwareHouseExample;

@Controller
@RequestMapping("/yw_transfer")
public class HywTransferringAction {
	
	@Autowired
	private Hyw_ComwareHouseBiz chBiz;
	
	//跨域测试
	@RequestMapping(value = "ceshi/{str}",method = RequestMethod.GET)
	public void ceshi(@PathVariable String str){
		System.out.println(str);
	}
	
	//仓库设定 - 查询仓库信息
	@RequestMapping(value = "yw_select_comwarehouse",method = RequestMethod.GET)
	@ResponseBody
	public List<ComwareHouse> selectByExample(@RequestBody ComwareHouse example){
		return chBiz.selectAll(example);
	}
	
	
}
