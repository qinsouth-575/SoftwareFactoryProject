package com.factory.mapper;

import com.factory.entity.PurchaseStorage;
import com.factory.entity.PurchaseStorageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseStorageMapper {
    int countByExample(PurchaseStorageExample example);

    int deleteByExample(PurchaseStorageExample example);

    int deleteByPrimaryKey(String psId);

    int insert(PurchaseStorage record);

    int insertSelective(PurchaseStorage record);

    List<PurchaseStorage> selectByExample(PurchaseStorageExample example);

    PurchaseStorage selectByPrimaryKey(String psId);

    int updateByExampleSelective(@Param("record") PurchaseStorage record, @Param("example") PurchaseStorageExample example);

    int updateByExample(@Param("record") PurchaseStorage record, @Param("example") PurchaseStorageExample example);

    int updateByPrimaryKeySelective(PurchaseStorage record);

    int updateByPrimaryKey(PurchaseStorage record);
}