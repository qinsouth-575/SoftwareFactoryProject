package com.factory.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.factory.entity.PurchasingOrder;
import com.factory.entity.PurchasingOrderDetails;
import com.factory.mapper.PurchasingOrderDetailsMapper;
import com.factory.mapper.PurchasingOrderMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class purchasingorderBiz {

	@Autowired
    private PurchasingOrderMapper dao;
	
	@Autowired
    private PurchasingOrderDetailsMapper dao2;
	
	public PageInfo<PurchasingOrder> selectb_bill(Integer pageNum,Integer pageSize){
		//PurchasingOrderExample example = new PurchasingOrderExample();
		PageHelper.startPage(pageNum,pageSize);
		List<PurchasingOrder> le= dao.selectpo_document_date();
		//List<PurchasingOrder> le= dao.selectByExample(example);
		System.out.println(le.get(0)+"666");
		PageInfo<PurchasingOrder> page=new PageInfo<PurchasingOrder>(le);
		return page;
	}
	
	
	public List<PurchasingOrderDetails> selecttb_detail(PurchasingOrderDetails bi){
		
		return dao2.selecttb_detail(bi);
	}
}
