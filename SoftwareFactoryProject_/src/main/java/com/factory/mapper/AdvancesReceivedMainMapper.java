package com.factory.mapper;

import com.factory.entity.AdvancesReceivedMain;
import com.factory.entity.AdvancesReceivedMainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdvancesReceivedMainMapper {
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