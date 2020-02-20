package com.factory.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.factory.biz.Flqj_StaffBiz;
import com.factory.biz.UserService;
import com.factory.entity.Staff;

/**
 * - 控制层 - 登录类
 * @author south wind
 * @version v1.0 2020年2月15日 下午12:18:22
 * - 表/功能：
 */
@Controller
@RequestMapping("/staffs")
//@CrossOrigin(allowCredentials ="true")	//设置是否允许客户端发送cookie信息。默认是false 
public class Flqj_LoginAction {
	
	private static Logger log = Logger.getLogger(Flqj_LoginAction.class);
	
	@Autowired
	private Flqj_StaffBiz sb;

	@Autowired
	private UserService us;

	//1.登录查询
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, String> queryNameAndPwd(@RequestBody Staff user, HttpSession session) {
		log.debug("SoftwareFactoryProject_ - Flqj_LoginAction - queryNameAndPwd - 1.进入登录，页面传回的user对象为：" + user);
		
		Map<String, String> map = new HashMap<String, String>();

		/*	1.shiro框架						*/
		try{
            Subject subject = SecurityUtils.getSubject();
            UsernamePasswordToken token = new UsernamePasswordToken(user.getJobNumber(), user.getPassword());
            subject.login(token);
            log.info("登录成功");
            
            //Session subjectSession = subject.getSession();
            Staff userr = us.findUserByName(user.getJobNumber());
            userr.setPassword(user.getPassword());
            log.info("登录成功后查询：" + userr);
            session.setAttribute("account", userr);
            
    		map.put("code", userr.getStaffId() + "");
    		map.put("message", "登录成功！");
    		return map;
    		
            //return "redirect:/finduser";
        }catch (Exception e) {
            e.printStackTrace();
        }
        log.info("登录失败！");
        
		map.put("code", "0");
		map.put("message", "登录失败，用户名或密码输入错误！");
		return map;			//			*/
		
		/*	2.普通方法：执行查询，验证用户名和密码		*
		user = sb.queryNameAndPwd(user);
		if (user == null) {
			log.info("登录失败！");
			map.put("code", "1");
			map.put("message", "登录失败，用户名或密码输入错误！");
			return map;
		}
		
		//session.setAttribute("account", user);
		//System.out.println("保存进session：" + user);

		log.info("登录成功！");
		map.put("code", "2");
		map.put("message", "登录成功！");
		return map;			//			*/
	}
	
	//2.读取登录用户信息
	@RequestMapping(value = "queryLoginUser", method = RequestMethod.POST)
	@ResponseBody
	public Staff queryLoginUser(@RequestBody Staff user, HttpSession session) {
		log.debug("SoftwareFactoryProject_ - LoginAction - queryLoginUser - 2.读取登录用户信息，staffId为：" + user.getStaffId());
		//Staff user = (Staff) session.getAttribute("account");
		user = sb.selectByPrimaryKey(user.getStaffId());
		log.info("当前登录用户为：" + user);
		return user;
	}
	
	//3.安全退出
	@RequestMapping(value = "loginOut", method = RequestMethod.GET)
	@ResponseBody
	public Staff loginOut(HttpSession session) {
		log.debug("SoftwareFactoryProject_ - LoginAction - loginOut - 3.退出登录");
		session.invalidate();
		
		return new Staff(0);
	}
	
	
	
}
