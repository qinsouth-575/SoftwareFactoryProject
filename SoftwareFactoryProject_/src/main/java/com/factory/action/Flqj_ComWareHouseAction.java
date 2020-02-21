package com.factory.action;

import java.util.HashMap;
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
import com.factory.entity.ComwareHouse;
import com.github.pagehelper.PageInfo;

/**
 * - 控制层 - 仓库类
 * @author south wind
 * @version v1.0 2020年2月21日 下午7:09:45
 * - 表/功能：
 */
@Controller
@RequestMapping("/warehouses")
public class Flqj_ComWareHouseAction {
	
	private static Logger log = Logger.getLogger(Flqj_ComWareHouseAction.class);
	
	@Autowired
	private Flqj_ComwareHouseBiz chb;
	
	//仓库设定 - 1.分页查询单个仓库信息
	@RequestMapping(value = "cwh", method = RequestMethod.POST)
	@ResponseBody
	public PageInfo<ComwareHouse> queryPage(@RequestBody ComwareHouse record){
		log.debug("SoftwareFactoryProject_ - ComDepartmentAction - queryPage - 仓库设定 - 1.分页查询单个仓库");
		log.info("多条件+分页查询 - 参数信息：" + record);
		PageInfo<ComwareHouse> page = chb.queryCDAll(record);
		log.info("查询结果分页类信息：" + page);
		return page;
	}

	//仓库设定 - 2.新增仓库信息 and 4.修改仓库信息
	@RequestMapping(value = "cwh", method = RequestMethod.PUT)
	@ResponseBody
	public Map<String,String> insertOrUpdateCHB(@RequestBody ComwareHouse record){
		log.debug("SoftwareFactoryProject_ - ComDepartmentAction - insertOrUpdateCHB - 仓库设定 - 2.新增仓库信息 and 4.修改仓库信息");
		log.info("新增or修改仓库类对象信息为：" + record);
		Map<String,String> map = new HashMap<String,String>();
		if(record.getFlag().equals("goInsert")) {
			if(chb.insertComwareHouse(record)) {
				map.put("code", "1");
				map.put("message", "新增成功！");
			} else {
				map.put("code", "3");
				map.put("message", "新增失败！");
			}
		} else if(record.getFlag().equals("goUpdate")) {
			if(chb.updateComwareHouse(record)) {
				map.put("code", "2");
				map.put("message", "修改成功！");
			} else {
				map.put("code", "3");
				map.put("message", "修改失败！");
			}
		}
		return map;
	}

	//仓库设定 - 3.删除仓库信息
	@RequestMapping(value = "cwh/{warehouseid}", method = RequestMethod.DELETE)
	@ResponseBody
	public Map<String,String> deleteCWH(@PathVariable String warehouseid){
		log.debug("SoftwareFactoryProject_ - ComDepartmentAction - deleteCWH - 仓库设定 - 3.删除仓库信息删除条件id为：" + warehouseid);
		Map<String,String> map = new HashMap<String,String>();
		if(chb.deleteComwareHouse(warehouseid)) {
			map.put("code", "1");
			map.put("message", "删除成功！");
		} else {
			map.put("code", "3");
			map.put("message", "删除失败！");
		}
		return map;
	}

}
