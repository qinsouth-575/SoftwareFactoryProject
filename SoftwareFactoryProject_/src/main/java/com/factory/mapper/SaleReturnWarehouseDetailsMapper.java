package com.factory.mapper;

import com.factory.entity.SaleOrderDetail;
import com.factory.entity.SaleReturnWarehouseDetails;
import com.factory.entity.SaleReturnWarehouseDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaleReturnWarehouseDetailsMapper {
    int countByExample(SaleReturnWarehouseDetailsExample example);

    int deleteByExample(SaleReturnWarehouseDetailsExample example);

    int deleteByPrimaryKey(Integer srwdId);

    int insert(SaleReturnWarehouseDetails record);

    int insertSe(SaleReturnWarehouseDetails record);

    List<SaleReturnWarehouseDetails> selectByExample(SaleReturnWarehouseDetailsExample example);

    SaleReturnWarehouseDetails selectByPrimaryKey(Integer srwdId);

    int updateByExampleSelective(@Param("record") SaleReturnWarehouseDetails record, @Param("example") SaleReturnWarehouseDetailsExample example);

    int updateByExample(@Param("record") SaleReturnWarehouseDetails record, @Param("example") SaleReturnWarehouseDetailsExample example);

    int updateByPrimaryKeySelective(SaleReturnWarehouseDetails record);

    int updateByPrimaryKey(SaleReturnWarehouseDetails record);
    
    List<SaleReturnWarehouseDetails> queryAlldetial(int record);
    
    int deleteByIddetial(int id);
    
    int insertSelective(@Param("details") List<SaleReturnWarehouseDetails> details);
    
    int deleteAll();
}