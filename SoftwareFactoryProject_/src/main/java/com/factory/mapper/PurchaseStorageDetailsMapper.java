package com.factory.mapper;

import com.factory.entity.PurchaseStorageDetails;
import com.factory.entity.PurchaseStorageDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseStorageDetailsMapper {
    int countByExample(PurchaseStorageDetailsExample example);

    int deleteByExample(PurchaseStorageDetailsExample example);

    int deleteByPrimaryKey(Integer psdId);

    int insert(PurchaseStorageDetails record);

    int insertSelective(PurchaseStorageDetails record);

    List<PurchaseStorageDetails> selectByExample(PurchaseStorageDetailsExample example);

    PurchaseStorageDetails selectByPrimaryKey(Integer psdId);

    int updateByExampleSelective(@Param("record") PurchaseStorageDetails record, @Param("example") PurchaseStorageDetailsExample example);

    int updateByExample(@Param("record") PurchaseStorageDetails record, @Param("example") PurchaseStorageDetailsExample example);

    int updateByPrimaryKeySelective(PurchaseStorageDetails record);

    int updateByPrimaryKey(PurchaseStorageDetails record);
}