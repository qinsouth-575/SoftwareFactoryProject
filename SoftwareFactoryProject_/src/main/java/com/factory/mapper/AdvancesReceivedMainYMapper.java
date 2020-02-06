package com.factory.mapper;

import com.factory.entity.AdvancesReceivedMainY;
import com.factory.entity.AdvancesReceivedMainYExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdvancesReceivedMainYMapper {
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