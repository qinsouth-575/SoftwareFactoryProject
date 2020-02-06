package com.factory.mapper;

import com.factory.entity.SaleOutWarehouseDetailed;
import com.factory.entity.SaleOutWarehouseDetailedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaleOutWarehouseDetailedMapper {
    int countByExample(SaleOutWarehouseDetailedExample example);

    int deleteByExample(SaleOutWarehouseDetailedExample example);

    int deleteByPrimaryKey(String sowdId);

    int insert(SaleOutWarehouseDetailed record);

    int insertSelective(SaleOutWarehouseDetailed record);

    List<SaleOutWarehouseDetailed> selectByExample(SaleOutWarehouseDetailedExample example);

    SaleOutWarehouseDetailed selectByPrimaryKey(String sowdId);

    int updateByExampleSelective(@Param("record") SaleOutWarehouseDetailed record, @Param("example") SaleOutWarehouseDetailedExample example);

    int updateByExample(@Param("record") SaleOutWarehouseDetailed record, @Param("example") SaleOutWarehouseDetailedExample example);

    int updateByPrimaryKeySelective(SaleOutWarehouseDetailed record);

    int updateByPrimaryKey(SaleOutWarehouseDetailed record);
}