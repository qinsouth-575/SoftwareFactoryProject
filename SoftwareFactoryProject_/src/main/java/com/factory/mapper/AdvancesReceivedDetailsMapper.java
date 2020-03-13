package com.factory.mapper;

import com.factory.entity.AdvancesReceivedDetails;
import com.factory.entity.AdvancesReceivedDetailsExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdvancesReceivedDetailsMapper {
	
	List<AdvancesReceivedDetails> gt_selectBypayables_id(@Param("payables_id") String payables_id);
	
    int countByExample(AdvancesReceivedDetailsExample example);

    int deleteByExample(AdvancesReceivedDetailsExample example);

    int deleteByPrimaryKey(String paydetailId);

    int insert(AdvancesReceivedDetails record);

    int insertSelective(AdvancesReceivedDetails record);

    List<AdvancesReceivedDetails> selectByExample(AdvancesReceivedDetailsExample example);

    AdvancesReceivedDetails selectByPrimaryKey(String paydetailId);

    int updateByExampleSelective(@Param("record") AdvancesReceivedDetails record, @Param("example") AdvancesReceivedDetailsExample example);

    int updateByExample(@Param("record") AdvancesReceivedDetails record, @Param("example") AdvancesReceivedDetailsExample example);

    int updateByPrimaryKeySelective(AdvancesReceivedDetails record);

    int updateByPrimaryKey(AdvancesReceivedDetails record);
}