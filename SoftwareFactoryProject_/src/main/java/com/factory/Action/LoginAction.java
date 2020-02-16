package com.factory.Action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.factory.biz.StaffBiz;
import com.factory.entity.Staff;

/**
 * - 控制层 - 登录类
 * @author south wind
 * @version v1.0 2020年2月15日 下午12:18:22
 * - 表/功能：
 */
@Controller
@RequestMapping("/staffs")
public class LoginAction {
	
	private static Logger log = Logger.getLogger(LoginAction.class);
	
	@Autowired
	private StaffBiz sb;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, String> queryNameAndPwd(@RequestBody Staff user, HttpSession session) {
		log.debug("1.进入登录，页面传回的user对象为：" + user);
		
		Map<String, String> map = new HashMap<String, String>();
		
		/*	执行查询，验证用户名和密码		*/
		user = sb.queryNameAndPwd(user);
		if (user == null) {
			log.info("登录失败！");
			map.put("code", "1");
			map.put("message", "登录失败，用户名或密码输入错误！");
			return map;
		}
		
		session.setAttribute("account", user);
		System.out.println("保存进session：" + user);

		log.info("登录成功！");
		map.put("code", "2");
		map.put("message", "登录成功！");
		return map;			//			*/
	}
	
	//安全退出
	@RequestMapping(value = "loginOut", method = RequestMethod.GET)
	@ResponseBody
	public Staff loginOut(HttpSession session) {
		log.debug("BambooForestQuicksand - LoginAction - loginOut - 退出登录");
		session.invalidate();
		
		return new Staff("0");
	}
	
}
