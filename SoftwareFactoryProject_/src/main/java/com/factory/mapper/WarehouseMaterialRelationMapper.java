package com.factory.mapper;

import com.factory.entity.WarehouseMaterialRelation;
import com.factory.entity.WarehouseMaterialRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WarehouseMaterialRelationMapper {
    int countByExample(WarehouseMaterialRelationExample example);

    int deleteByExample(WarehouseMaterialRelationExample example);

    int deleteByPrimaryKey(Integer wmrId);

    int insert(WarehouseMaterialRelation record);

    int insertSelective(WarehouseMaterialRelation record);

    List<WarehouseMaterialRelation> selectByExample(WarehouseMaterialRelationExample example);

    WarehouseMaterialRelation selectByPrimaryKey(Integer wmrId);

    int updateByExampleSelective(@Param("record") WarehouseMaterialRelation record, @Param("example") WarehouseMaterialRelationExample example);

    int updateByExample(@Param("record") WarehouseMaterialRelation record, @Param("example") WarehouseMaterialRelationExample example);

    int updateByPrimaryKeySelective(WarehouseMaterialRelation record);

    int updateByPrimaryKey(WarehouseMaterialRelation record);
}