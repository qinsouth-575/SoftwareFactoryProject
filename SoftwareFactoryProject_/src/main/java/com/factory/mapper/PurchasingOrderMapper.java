package com.factory.mapper;

import com.factory.entity.PurchasingOrder;
import com.factory.entity.PurchasingOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchasingOrderMapper {
    int countByExample(PurchasingOrderExample example);

    int deleteByExample(PurchasingOrderExample example);

    int deleteByPrimaryKey(String poId);

    int insert(PurchasingOrder record);

    int insertSelective(PurchasingOrder record);

    List<PurchasingOrder> selectByExample(PurchasingOrderExample example);

    PurchasingOrder selectByPrimaryKey(String poId);

    int updateByExampleSelective(@Param("record") PurchasingOrder record, @Param("example") PurchasingOrderExample example);

    int updateByExample(@Param("record") PurchasingOrder record, @Param("example") PurchasingOrderExample example);

    int updateByPrimaryKeySelective(PurchasingOrder record);

    int updateByPrimaryKey(PurchasingOrder record);
}