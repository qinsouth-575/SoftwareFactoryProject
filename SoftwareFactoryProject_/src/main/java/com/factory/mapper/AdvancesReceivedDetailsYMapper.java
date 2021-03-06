package com.factory.mapper;

import com.factory.entity.AdvancesReceivedDetailsY;
import com.factory.entity.AdvancesReceivedDetailsYExample;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;

public interface AdvancesReceivedDetailsYMapper {
	
	@Delete("DELETE FROM `factory_data`.`advances_received_details_y`  WHERE `priabill_id` = #{priabillId}")
	int gt_del_dy(@Param("priabillId") String priabillId);
	
	//@Select("SELECT * FROM `advances_received_details_y` WHERE `priabill_id` = #{priabillid}")
	List<AdvancesReceivedDetailsY> gt_selectBypriabill_id(@Param("priabill_id") String priabill_id);
	
    int countByExample(AdvancesReceivedDetailsYExample example);

    int deleteByExample(AdvancesReceivedDetailsYExample example);

    int deleteByPrimaryKey(String priadetailsId);

    int insert(AdvancesReceivedDetailsY record);

    int insertSelective(AdvancesReceivedDetailsY record);

    List<AdvancesReceivedDetailsY> selectByExample(AdvancesReceivedDetailsYExample example);

    AdvancesReceivedDetailsY selectByPrimaryKey(String priadetailsId);

    int updateByExampleSelective(@Param("record") AdvancesReceivedDetailsY record, @Param("example") AdvancesReceivedDetailsYExample example);

    int updateByExample(@Param("record") AdvancesReceivedDetailsY record, @Param("example") AdvancesReceivedDetailsYExample example);

    int updateByPrimaryKeySelective(AdvancesReceivedDetailsY record);

    int updateByPrimaryKey(AdvancesReceivedDetailsY record);
}