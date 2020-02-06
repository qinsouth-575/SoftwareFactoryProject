package com.factory.mapper;

import com.factory.entity.Stockprimarybill;
import com.factory.entity.StockprimarybillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StockprimarybillMapper {
    int countByExample(StockprimarybillExample example);

    int deleteByExample(StockprimarybillExample example);

    int deleteByPrimaryKey(Integer spbid);

    int insert(Stockprimarybill record);

    int insertSelective(Stockprimarybill record);

    List<Stockprimarybill> selectByExample(StockprimarybillExample example);

    Stockprimarybill selectByPrimaryKey(Integer spbid);

    int updateByExampleSelective(@Param("record") Stockprimarybill record, @Param("example") StockprimarybillExample example);

    int updateByExample(@Param("record") Stockprimarybill record, @Param("example") StockprimarybillExample example);

    int updateByPrimaryKeySelective(Stockprimarybill record);

    int updateByPrimaryKey(Stockprimarybill record);
}