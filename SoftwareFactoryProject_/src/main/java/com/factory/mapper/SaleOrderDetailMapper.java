package com.factory.mapper;

import com.factory.entity.SaleOrderDetail;
import com.factory.entity.SaleOrderDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaleOrderDetailMapper {
    int countByExample(SaleOrderDetailExample example);

    int deleteByExample(SaleOrderDetailExample example);

    int deleteByPrimaryKey(SaleOrderDetail key);

    int insert(SaleOrderDetail record);

    int insertSelective(@Param("details") List<SaleOrderDetail> details);

    List<SaleOrderDetail> selectByExample(SaleOrderDetailExample example);

    SaleOrderDetail selectByPrimaryKey(SaleOrderDetail key);

    int updateByExampleSelective(@Param("record") SaleOrderDetail record, @Param("example") SaleOrderDetailExample example);

    int updateByExample(@Param("record") SaleOrderDetail record, @Param("example") SaleOrderDetailExample example);

    int updateByPrimaryKeySelective(SaleOrderDetail record);

    int updateByPrimaryKey(SaleOrderDetail record);
    
    List<SaleOrderDetail> queryAlldetail(int soid);
    
    int deleteAll();
    
    int deleteByIddetail(int id);
}