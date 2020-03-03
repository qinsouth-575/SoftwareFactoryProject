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
	
public int updatepo_yn(PurchasingOrder bi){
		
		return dao.updatepo_yn(bi);
	}



public int delete001(PurchasingOrder pu) {
	return dao.delete001(pu);
}



public int delete002(PurchasingOrderDetails pu) {
	System.out.println("666");
	return dao2.delete002(pu);
}


public int insertpurchasenote(PurchasingOrder pu) {
	return dao.insertpurchasenote(pu);
}

public int insertpurchasenot(PurchasingOrder pu) {
	return dao.insertpurchasenot(pu);
}
}
