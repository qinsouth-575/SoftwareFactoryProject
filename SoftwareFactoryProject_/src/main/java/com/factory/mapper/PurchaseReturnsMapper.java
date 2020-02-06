package com.factory.mapper;

import com.factory.entity.PurchaseReturns;
import com.factory.entity.PurchaseReturnsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseReturnsMapper {
    int countByExample(PurchaseReturnsExample example);

    int deleteByExample(PurchaseReturnsExample example);

    int deleteByPrimaryKey(String pureId);

    int insert(PurchaseReturns record);

    int insertSelective(PurchaseReturns record);

    List<PurchaseReturns> selectByExample(PurchaseReturnsExample example);

    PurchaseReturns selectByPrimaryKey(String pureId);

    int updateByExampleSelective(@Param("record") PurchaseReturns record, @Param("example") PurchaseReturnsExample example);

    int updateByExample(@Param("record") PurchaseReturns record, @Param("example") PurchaseReturnsExample example);

    int updateByPrimaryKeySelective(PurchaseReturns record);

    int updateByPrimaryKey(PurchaseReturns record);
}