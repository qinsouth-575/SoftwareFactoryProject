package com.factory.mapper;

import com.factory.entity.SaleOrder;
import com.factory.entity.SaleOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaleOrderMapper {
	
	//分页查询
	List<SaleOrder> PageQueryAll();

    int countByExample(SaleOrderExample example);

    int deleteByExample(SaleOrderExample example);

    int deleteByPrimaryKey(Integer soId);

    int insert(SaleOrder record);

    int insertSelective(SaleOrder record);

    List<SaleOrder> selectByExample(SaleOrderExample example);

    SaleOrder selectByPrimaryKey(Integer soId);

    int updateByExampleSelective(@Param("record") SaleOrder record, @Param("example") SaleOrderExample example);

    int updateByExample(@Param("record") SaleOrder record, @Param("example") SaleOrderExample example);

    int updateByPrimaryKeySelective(SaleOrder record);

    int updateByPrimaryKey(SaleOrder record);
    
    int updateAll(SaleOrder record);
    
    int deleteById(int id);
    
    public Integer queryPSDocumentNumber(@Param("documentdate") String psDocumentDate);
}