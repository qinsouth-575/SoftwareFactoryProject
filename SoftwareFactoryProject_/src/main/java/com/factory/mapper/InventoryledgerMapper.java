package com.factory.mapper;

import com.factory.entity.Inventoryledger;
import com.factory.entity.InventoryledgerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InventoryledgerMapper {
    int countByExample(InventoryledgerExample example);

    int deleteByExample(InventoryledgerExample example);

    int deleteByPrimaryKey(Integer ilid);

    int insert(Inventoryledger record);

    int insertSelective(Inventoryledger record);

    List<Inventoryledger> selectByExample(InventoryledgerExample example);

    Inventoryledger selectByPrimaryKey(Integer ilid);

    int updateByExampleSelective(@Param("record") Inventoryledger record, @Param("example") InventoryledgerExample example);

    int updateByExample(@Param("record") Inventoryledger record, @Param("example") InventoryledgerExample example);

    int updateByPrimaryKeySelective(Inventoryledger record);

    int updateByPrimaryKey(Inventoryledger record);
}