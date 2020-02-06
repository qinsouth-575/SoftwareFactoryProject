package com.factory.mapper;

import com.factory.entity.PurchasingOrderDetails;
import com.factory.entity.PurchasingOrderDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchasingOrderDetailsMapper {
    int countByExample(PurchasingOrderDetailsExample example);

    int deleteByExample(PurchasingOrderDetailsExample example);

    int deleteByPrimaryKey(String podId);

    int insert(PurchasingOrderDetails record);

    int insertSelective(PurchasingOrderDetails record);

    List<PurchasingOrderDetails> selectByExample(PurchasingOrderDetailsExample example);

    PurchasingOrderDetails selectByPrimaryKey(String podId);

    int updateByExampleSelective(@Param("record") PurchasingOrderDetails record, @Param("example") PurchasingOrderDetailsExample example);

    int updateByExample(@Param("record") PurchasingOrderDetails record, @Param("example") PurchasingOrderDetailsExample example);

    int updateByPrimaryKeySelective(PurchasingOrderDetails record);

    int updateByPrimaryKey(PurchasingOrderDetails record);
}