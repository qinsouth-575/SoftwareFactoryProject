package com.factory.mapper;

import com.factory.entity.SaleOutWarehouse;
import com.factory.entity.SaleOutWarehouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaleOutWarehouseMapper {
    int countByExample(SaleOutWarehouseExample example);

    int deleteByExample(SaleOutWarehouseExample example);

    int deleteByPrimaryKey(String sowId);

    int insert(SaleOutWarehouse record);

    int insertSelective(SaleOutWarehouse record);

    List<SaleOutWarehouse> selectByExample(SaleOutWarehouseExample example);

    SaleOutWarehouse selectByPrimaryKey(String sowId);

    int updateByExampleSelective(@Param("record") SaleOutWarehouse record, @Param("example") SaleOutWarehouseExample example);

    int updateByExample(@Param("record") SaleOutWarehouse record, @Param("example") SaleOutWarehouseExample example);

    int updateByPrimaryKeySelective(SaleOutWarehouse record);

    int updateByPrimaryKey(SaleOutWarehouse record);
}