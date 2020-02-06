package com.factory.mapper;

import com.factory.entity.SaleReturnWarehouse;
import com.factory.entity.SaleReturnWarehouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaleReturnWarehouseMapper {
    int countByExample(SaleReturnWarehouseExample example);

    int deleteByExample(SaleReturnWarehouseExample example);

    int deleteByPrimaryKey(String srwId);

    int insert(SaleReturnWarehouse record);

    int insertSelective(SaleReturnWarehouse record);

    List<SaleReturnWarehouse> selectByExample(SaleReturnWarehouseExample example);

    SaleReturnWarehouse selectByPrimaryKey(String srwId);

    int updateByExampleSelective(@Param("record") SaleReturnWarehouse record, @Param("example") SaleReturnWarehouseExample example);

    int updateByExample(@Param("record") SaleReturnWarehouse record, @Param("example") SaleReturnWarehouseExample example);

    int updateByPrimaryKeySelective(SaleReturnWarehouse record);

    int updateByPrimaryKey(SaleReturnWarehouse record);
}