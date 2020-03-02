package com.factory.mapper;

import com.factory.entity.SaleQuotationDetails;
import com.factory.entity.SaleQuotationDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaleQuotationDetailsMapper {
    int countByExample(SaleQuotationDetailsExample example);

    int deleteByExample(SaleQuotationDetailsExample example);

    int deleteByPrimaryKey(String sqdProdid);

    int insert(SaleQuotationDetails record);

    int insertSelective(SaleQuotationDetails record);

    List<SaleQuotationDetails> selectByExample(SaleQuotationDetailsExample example);

    SaleQuotationDetails selectByPrimaryKey(String sqdProdid);

    int updateByExampleSelective(@Param("record") SaleQuotationDetails record, @Param("example") SaleQuotationDetailsExample example);

    int updateByExample(@Param("record") SaleQuotationDetails record, @Param("example") SaleQuotationDetailsExample example);

    int updateByPrimaryKeySelective(SaleQuotationDetails record);

    int updateByPrimaryKey(SaleQuotationDetails record);
}