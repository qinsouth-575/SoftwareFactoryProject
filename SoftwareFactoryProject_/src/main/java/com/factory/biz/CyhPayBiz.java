package com.factory.biz;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.factory.entity.PayablesDetail;
import com.factory.entity.PayablesMain;
import com.factory.entity.Supplier;
import com.factory.mapper.PayablesDetailMapper;
import com.factory.mapper.PayablesMainMapper;
import com.factory.mapper.SupplierMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class CyhPayBiz {
	@Autowired  //主表
	private PayablesMainMapper payablesMainMapper;
	@Autowired  //详表
	private PayablesDetailMapper payablesDetailMapper;
	@Autowired
	private SupplierMapper supplierMapper;
	
	
	//查询所有供应商
	public List<Supplier> querAllSupplier(){
		return supplierMapper.selectByExample(null);
	}
	
	//根据id查询指向标信息
	public PayablesMain CqueryMainInfoByPayId(String payablesId) {
		System.out.println(payablesId);
		//根据主表id查询出详表的信息
		PayablesMain payMain=payablesMainMapper.queryPayMainByPayablesId(payablesId);
		System.out.println("id："+payMain.getPayablesSupplierName());
		payMain.setListPayablesDateil(payablesDetailMapper.queryByPayablesId(payMain.getPayablesId()));
		return payMain;  
			
	}
	
	//根据id查询详表信息
	public PageInfo CqueryDetail(String payablesid) {
		PageHelper.startPage(1,1);
		Page  list=(Page)payablesDetailMapper.queryByPayablesId(payablesid);
		PageInfo<PayablesDetail> page=new PageInfo<PayablesDetail>(list);
		return page;
	}
	
	public PageInfo CqueryPaMain(Integer pageNum,Integer pageSize) {
		if(pageNum==null) {
			pageNum=1;
		}if(pageSize==null){
			pageSize=1;
		}
		//根据主表id查询出详表的信息
		List<PayablesMain> payMainList=payablesMainMapper.selectByExample(null);
		System.out.println("条数:"+payMainList.size());
		
		for(PayablesMain payMain : payMainList) {
			System.out.println("xx:"+payMain.getPayablesId());
			payMain.setListPayablesDateil(payablesDetailMapper.queryByPayablesId(payMain.getPayablesId()));
		}
		PageHelper.startPage(pageNum, pageSize);
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
		System.out.println("id"+payablesMain.getSupplierId());
		int id=10;
		payablesMain.setPayablesId(""+id+"");
		payablesMain.setPayablesSupplierName(payablesMain.getSupplierId());
		id++;
		payablesMain.setPayablesEndtime(new Date());
		//根据供应商名称查询出其id
		payablesMain.setSupplierId(supplierMapper.querySupplierIdByName(payablesMain.getSupplierId()));
		payablesMain.setPayablesAuditstatus(0);
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
