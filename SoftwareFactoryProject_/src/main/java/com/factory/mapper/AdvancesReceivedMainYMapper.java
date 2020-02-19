package com.factory.mapper;

import com.factory.entity.AdvancesReceivedMainY;
import com.factory.entity.AdvancesReceivedMainYExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface AdvancesReceivedMainYMapper {
	@Select("SELECT COUNT(*) FROM `advances_received_main_y` WHERE priabill_payablestime LIKE #{payablestime}")
	int gt_select_payablestime(@Param("payablestime") String payablestime);
	
    int countByExample(AdvancesReceivedMainYExample example);

    int deleteByExample(AdvancesReceivedMainYExample example);

    int deleteByPrimaryKey(String priabillId);

    int insert(AdvancesReceivedMainY record);

    int insertSelective(AdvancesReceivedMainY record);

    List<AdvancesReceivedMainY> selectByExample(AdvancesReceivedMainYExample example);

    AdvancesReceivedMainY selectByPrimaryKey(String priabillId);

    int updateByExampleSelective(@Param("record") AdvancesReceivedMainY record, @Param("example") AdvancesReceivedMainYExample example);

    int updateByExample(@Param("record") AdvancesReceivedMainY record, @Param("example") AdvancesReceivedMainYExample example);

    int updateByPrimaryKeySelective(AdvancesReceivedMainY record);

    int updateByPrimaryKey(AdvancesReceivedMainY record);
}