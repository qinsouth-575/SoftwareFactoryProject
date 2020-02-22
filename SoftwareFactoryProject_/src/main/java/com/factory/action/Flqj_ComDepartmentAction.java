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

import com.factory.biz.Flqj_ComDepartmentBiz;
import com.factory.entity.Comdepartment;
import com.github.pagehelper.PageInfo;

/**
 * - 控制层 - 部门类
 * @author south wind
 * @version v1.0 2020年2月17日 上午10:26:43
 * - 表/功能：
 */
@Controller
@RequestMapping("/departments")
public class Flqj_ComDepartmentAction {
	
	private static Logger log = Logger.getLogger(Flqj_ComDepartmentAction.class);
	
	@Autowired
	private Flqj_ComDepartmentBiz cdb;
	
	//部门设定 - 1.分页查询单个部门信息
	@RequestMapping(value = "cd", method = RequestMethod.POST)
	@ResponseBody
	public PageInfo<Comdepartment> queryPage(@RequestBody Comdepartment cd){
		log.debug("SoftwareFactoryProject_ - ComDepartmentAction - queryPage - 部门设定 - 1.分页查询单个部门");
		log.info("多条件+分页查询 - 参数信息：" + cd);
		PageInfo<Comdepartment> page = cdb.queryCDAll(cd);
		log.info("查询结果分页类信息：" + page);
		return page;
	}

	//部门设定 - 2.新增部门信息 and 4.修改部门信息
	@RequestMapping(value = "cd", method = RequestMethod.PUT)
	@ResponseBody
	public Map<String,String> insertOrUpdateCD(@RequestBody Comdepartment cd){
		log.debug("SoftwareFactoryProject_ - ComDepartmentAction - insertOrUpdateCD - 部门设定 - 2.新增部门信息 and 4.修改部门信息");
		log.info("新增or修改部门类对象信息为：" + cd);
		Map<String,String> map = new HashMap<String,String>();
		if(cd.getFlag().equals("goInsert")) {
			if(cdb.insertComDepartment(cd)) {
				map.put("code", "1");
				map.put("message", "新增成功！");
			} else {
				map.put("code", "3");
				map.put("message", "新增失败！");
			}
		} else if(cd.getFlag().equals("goUpdate")) {
			if(cdb.updateComDepartment(cd)) {
				map.put("code", "2");
				map.put("message", "修改成功！");
			} else {
				map.put("code", "3");
				map.put("message", "修改失败！");
			}
		}
		return map;
	}

	//部门设定 - 3.删除部门信息
	@RequestMapping(value = "cd/{departID}", method = RequestMethod.DELETE)
	@ResponseBody
	public Map<String,String> deleteCD(@PathVariable String departID){
		log.debug("SoftwareFactoryProject_ - ComDepartmentAction - deleteCD - 部门设定 - 3.删除部门信息删除条件id为：" + departID);
		Map<String,String> map = new HashMap<String,String>();
		if(cdb.deleteComDepartment(departID)) {
			map.put("code", "1");
			map.put("message", "删除成功！");
		} else {
			map.put("code", "3");
			map.put("message", "删除失败！");
		}
		return map;
	}

}
