package com.factory.mapper;

import com.factory.entity.Chartofaccountsbill;
import com.factory.entity.ChartofaccountsbillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChartofaccountsbillMapper {
    int countByExample(ChartofaccountsbillExample example);

    int deleteByExample(ChartofaccountsbillExample example);

    int deleteByPrimaryKey(Integer coabid);

    int insert(Chartofaccountsbill record);

    int insertSelective(Chartofaccountsbill record);

    List<Chartofaccountsbill> selectByExample(ChartofaccountsbillExample example);

    Chartofaccountsbill selectByPrimaryKey(Integer coabid);

    int updateByExampleSelective(@Param("record") Chartofaccountsbill record, @Param("example") ChartofaccountsbillExample example);

    int updateByExample(@Param("record") Chartofaccountsbill record, @Param("example") ChartofaccountsbillExample example);

    int updateByPrimaryKeySelective(Chartofaccountsbill record);

    int updateByPrimaryKey(Chartofaccountsbill record);
}