package com.factory.mapper;

import com.factory.entity.SaleQuotation;
import com.factory.entity.SaleQuotationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaleQuotationMapper {
    int countByExample(SaleQuotationExample example);

    int deleteByExample(SaleQuotationExample example);

    int deleteByPrimaryKey(String sqId);

    int insert(SaleQuotation record);

    int insertSelective(SaleQuotation record);

    List<SaleQuotation> selectByExample(SaleQuotationExample example);

    SaleQuotation selectByPrimaryKey(String sqId);

    int updateByExampleSelective(@Param("record") SaleQuotation record, @Param("example") SaleQuotationExample example);

    int updateByExample(@Param("record") SaleQuotation record, @Param("example") SaleQuotationExample example);

    int updateByPrimaryKeySelective(SaleQuotation record);

    int updateByPrimaryKey(SaleQuotation record);
}