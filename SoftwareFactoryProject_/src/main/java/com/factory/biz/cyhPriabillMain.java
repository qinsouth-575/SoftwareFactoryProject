/*
 * package com.factory.biz;
 * 
 * import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Service;
 * 
 * import com.factory.entity.PriabillDetail; 
 * import com.factory.entity.PriabillMain; 
 * import com.github.pagehelper.Page;
 * import com.github.pagehelper.PageHelper; import
 * com.github.pagehelper.PageInfo;
 * 
 * @Service public class cyhPriabillMain {
 * 
 * @Autowired private PriabillMainMapper priabillMainMapper;
 * 
 * @Autowired private PriabillDetailMapper priabillDetailMapper; //查询预付款单信息--分页
 * public PageInfo cyhQueryAllPriabillMainInfo(Integer pageNum,Integer pageSize)
 * { List<PriabillMain> pmList=priabillMainMapper.selectByExample(null);
 * for(PriabillMain pm:pmList) { //根据主表id查询出详表的信息
 * pm.setPriableDetail(priabillDetailMapper.queryDetailByid(pm.getPriabillId));
 * } PageHelper.startPage(pageNum,pageSize); Page
 * list=(Page)priabillMainMapper.selectByExample(null); PageInfo<PriabillMain>
 * page =new PageInfo<PriabillMain>(list); return page;
 * 
 * }
 * 
 * //删除 public boolean deleteInfo(String priabillId) { boolean
 * bool1=priabillMainMapper.deleteInfo(priabillId)>0; boolean
 * bool2=priabillDetailMapper.deleteInfo(priabillId)>0; return bool1&&bool2 }
 * 
 * }
 */