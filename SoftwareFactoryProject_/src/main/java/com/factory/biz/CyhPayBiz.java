package com.factory.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.factory.entity.PayablesDetail;
import com.factory.entity.PayablesMain;
import com.factory.mapper.PayablesDetailMapper;
import com.factory.mapper.PayablesMainMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class CyhPayBiz {
	@Autowired  //主表
	private PayablesMainMapper payablesMainMapper;
	@Autowired  //详表
	private PayablesDetailMapper payablesDetailMapper;
	
	//根据id查询详表信息
	public PageInfo CqueryDetail(String payablesid) {
		PageHelper.startPage(1,1);
		Page  list=(Page)payablesDetailMapper.queryByPayablesId(payablesid);
		PageInfo<PayablesDetail> page=new PageInfo<PayablesDetail>(list);
		return page;
	}
	
	public PageInfo CqueryPaMain() {
		//根据主表id查询出详表的信息
		List<PayablesMain> payMainList=payablesMainMapper.selectByExample(null);
		System.out.println("条数:"+payMainList.size());
		
		for(PayablesMain payMain : payMainList) {
			System.out.println("xx:"+payMain.getPayablesId());
			payMain.setListPayablesDateil(payablesDetailMapper.queryByPayablesId(payMain.getPayablesId()));
		}
		PageHelper.startPage(1, 5);
		Page list=(Page)payablesMainMapper.selectByExample(null);
		PageInfo<PayablesMain> page =new PageInfo<PayablesMain>(list);
		return page;  
	}
	
	public boolean deletePayMain(String payablesId) {
		boolean bool=payablesDetailMapper.deleteByPayablesId(payablesId)>0 ;
		boolean bool1=payablesMainMapper.deletePayMain(payablesId)>0;
		return bool&&bool1 ;
	}
	
	//先增主表
	public boolean insertPayMainInfo(PayablesMain payablesMain) {
		return payablesMainMapper.insert(payablesMain)>0;
	}
	
	//再增详表
	public boolean insertPayablesDetail(PayablesDetail payablesDetail) {
		return payablesDetailMapper.insert(payablesDetail)>0;
	}
	
	//修改---先修改主表
	public boolean updatePayablesMainInfo(PayablesMain payablesMain) {
		return payablesMainMapper.updateByPrimaryKey(payablesMain)>0;
	}
	
	//修改详表
	public boolean updatePayablesDetailInfo(PayablesDetail payablesDetail) {
		return payablesDetailMapper.updateByPrimaryKey(payablesDetail)>0;
	}
	
}
