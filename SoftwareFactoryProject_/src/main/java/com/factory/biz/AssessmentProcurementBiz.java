package com.factory.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.factory.entity.AssessmentProcurement;
import com.factory.entity.AssessmentProcurementDetailed;
import com.factory.entity.AssessmentProcurementFruit;

import com.factory.mapper.AssessmentProcurementDetailedMapper;
import com.factory.mapper.AssessmentProcurementFruitMapper;
import com.factory.mapper.AssessmentProcurementMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class AssessmentProcurementBiz {

	@Autowired
    private AssessmentProcurementMapper dao;
	
	
	@Autowired
    private AssessmentProcurementDetailedMapper dao2;
	
	
	@Autowired
    private AssessmentProcurementFruitMapper dao3;
	
	public PageInfo<AssessmentProcurement> selectb_bill(Integer pageNum,Integer pageSize){
		//PurchasingOrderExample example = new PurchasingOrderExample();
		PageHelper.startPage(pageNum,pageSize);
		List<AssessmentProcurement> le= dao.selectap_date_document();
		//List<PurchasingOrder> le= dao.selectByExample(example);
		System.out.println(le.get(0)+"666");
		PageInfo<AssessmentProcurement> page=new PageInfo<AssessmentProcurement>(le);
		return page;
	}
	
	
public List<AssessmentProcurementDetailed> selecttb_detail02(AssessmentProcurementDetailed bi){
		
		return dao2.selecttb_detail02(bi);
	}



public List<AssessmentProcurementFruit> selecttb_detail03(AssessmentProcurementFruit bi){
	
	return dao3.selecttb_detail02(bi);
}



public int updateap_yn(AssessmentProcurement bi){
	
	return dao.updateap_yn(bi);
}



public int delete003(AssessmentProcurement pu) {
	return dao.delete003(pu);
}


public int delete004(AssessmentProcurementDetailed pu) {
	return dao2.delete004(pu);
}

public int delete005(AssessmentProcurementFruit pu) {
	return dao3.delete005(pu);
}



public int insertpurchasenote1(AssessmentProcurement pu) {
	return dao.insertpurchasenote1(pu);
}


public int insertpurchasenote2(AssessmentProcurement pu) {
	return dao.insertpurchasenote2(pu);
}


public int insertpurchasenote3(AssessmentProcurement pu) {
	return dao.insertpurchasenote3(pu);
}
	
}
