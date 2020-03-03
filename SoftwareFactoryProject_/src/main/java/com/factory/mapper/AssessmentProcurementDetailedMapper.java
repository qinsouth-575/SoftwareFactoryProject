package com.factory.mapper;

import java.util.List;

import com.factory.entity.AssessmentProcurementDetailed;
import com.factory.entity.AssessmentProcurementFruit;
import com.factory.entity.PurchasingOrderDetails;

public interface AssessmentProcurementDetailedMapper {
	public List<AssessmentProcurementDetailed> selecttb_detail02(AssessmentProcurementDetailed bi);
	 int delete004(AssessmentProcurementDetailed pu);

}
