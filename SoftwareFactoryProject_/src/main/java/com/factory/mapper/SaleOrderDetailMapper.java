package com.factory.mapper;

import com.factory.entity.SaleOrderDetail;
import com.factory.entity.SaleOrderDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaleOrderDetailMapper {
    int countByExample(SaleOrderDetailExample example);

    int deleteByExample(SaleOrderDetailExample example);

    int deleteByPrimaryKey(String solId);

    int insert(SaleOrderDetail record);

    int insertSelective(SaleOrderDetail record);

    List<SaleOrderDetail> selectByExample(SaleOrderDetailExample example);

    SaleOrderDetail selectByPrimaryKey(String solId);

    int updateByExampleSelective(@Param("record") SaleOrderDetail record, @Param("example") SaleOrderDetailExample example);

    int updateByExample(@Param("record") SaleOrderDetail record, @Param("example") SaleOrderDetailExample example);

    int updateByPrimaryKeySelective(SaleOrderDetail record);

    int updateByPrimaryKey(SaleOrderDetail record);
}