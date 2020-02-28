/*
 * package com.factory.action;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Controller; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.ResponseBody;
 * 
 * import com.factory.biz.cyhPriabillMain; import com.github.pagehelper.Page;
 * import com.github.pagehelper.PageInfo;
 * 
 * @RequestMapping("/CyhPriabillAction")
 * 
 * @Controller public class CyhPriabillAction {
 * 
 * @Autowired private cyhPriabillMain cyhPriabillMainService;
 * 
 * //查询所有--分页
 * 
 * @RequestMapping("/cyhQueryAll")
 * 
 * @ResponseBody public PageInfo cyhQueryAll(Integer pageNum,Integer pageSize) {
 * return cyhPriabillMainService.cyhQueryAllPriabillMainInfo(pageNum, pageSize);
 * }
 * 
 * 
 * //删除
 * 
 * @RequestMapping("/deleteInfo")
 * 
 * @ResponseBody public boolean deletInfo(String priabillId) { return
 * cyhPriabillMainService.deleteInfo(priabillId); } }
 */