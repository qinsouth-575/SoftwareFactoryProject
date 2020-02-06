package com.factory.mapper;

import com.factory.entity.Stockschedulebill;
import com.factory.entity.StockschedulebillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StockschedulebillMapper {
    int countByExample(StockschedulebillExample example);

    int deleteByExample(StockschedulebillExample example);

    int deleteByPrimaryKey(Integer ssbid);

    int insert(Stockschedulebill record);

    int insertSelective(Stockschedulebill record);

    List<Stockschedulebill> selectByExample(StockschedulebillExample example);

    Stockschedulebill selectByPrimaryKey(Integer ssbid);

    int updateByExampleSelective(@Param("record") Stockschedulebill record, @Param("example") StockschedulebillExample example);

    int updateByExample(@Param("record") Stockschedulebill record, @Param("example") StockschedulebillExample example);

    int updateByPrimaryKeySelective(Stockschedulebill record);

    int updateByPrimaryKey(Stockschedulebill record);
}