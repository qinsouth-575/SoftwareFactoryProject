package com.factory.mapper;

import java.util.List;

import com.factory.entity.AssessmentProcurement;
import com.factory.entity.PurchasingOrder;
import com.factory.entity.PurchasingOrderDetails;

public interface AssessmentProcurementMapper {
	List<AssessmentProcurement> selectap_date_document();
	
	int updateap_yn(AssessmentProcurement pu);
	
	 int delete003(AssessmentProcurement pu);
	 
	 int insertpurchasenote1(AssessmentProcurement pu);
	 int insertpurchasenote2(AssessmentProcurement pu);

	 int insertpurchasenote3(AssessmentProcurement pu);
	 int updatepoDocumentNumber(AssessmentProcurement pu);
	 
	 AssessmentProcurement selectpoaudition(AssessmentProcurement bi);
	  int updatepoDocumentNumber2(AssessmentProcurement pu);
	
}
