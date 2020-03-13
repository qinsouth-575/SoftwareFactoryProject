package com.factory.mapper;

import com.factory.entity.AdvancesReceivedMain;
import com.factory.entity.AdvancesReceivedMainExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface AdvancesReceivedMainMapper {
	
	@Select("SELECT COUNT(*) FROM `advances_received_main` WHERE payables_payablestime LIKE #{payablestime}")
	int gt_select_payablestime(@Param("payablestime") String payablestime);
	
	public List<AdvancesReceivedMain> selectAdvancesReceivedMainAllDESC();
	
    int countByExample(AdvancesReceivedMainExample example);

    int deleteByExample(AdvancesReceivedMainExample example);

    int deleteByPrimaryKey(String payablesId);

    int insert(AdvancesReceivedMain record);

    int insertSelective(AdvancesReceivedMain record);

    List<AdvancesReceivedMain> selectByExample(AdvancesReceivedMainExample example);

    AdvancesReceivedMain selectByPrimaryKey(String payablesId);

    int updateByExampleSelective(@Param("record") AdvancesReceivedMain record, @Param("example") AdvancesReceivedMainExample example);

    int updateByExample(@Param("record") AdvancesReceivedMain record, @Param("example") AdvancesReceivedMainExample example);

    int updateByPrimaryKeySelective(AdvancesReceivedMain record);

    int updateByPrimaryKey(AdvancesReceivedMain record);
}