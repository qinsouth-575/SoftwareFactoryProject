package com.factory.mapper;

import com.factory.entity.TPurchaseRequisitions;
import com.factory.entity.TPurchaseRequisitionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPurchaseRequisitionsMapper {
	
	//0.根据当前日期查询单据号码
	public Integer queryPRCount(@Param("prDocumentDate") String prDocumentDate);
	
	//1.查询全部（查询、分页）
	public List<TPurchaseRequisitions> queryPRAll();
	
	
	
	
	
    int countByExample(TPurchaseRequisitionsExample example);

    int deleteByExample(TPurchaseRequisitionsExample example);

    int deleteByPrimaryKey(String prDocumentNumber);

    int insert(TPurchaseRequisitions record);

    int insertSelective(TPurchaseRequisitions record);

    List<TPurchaseRequisitions> selectByExample(TPurchaseRequisitionsExample example);

    TPurchaseRequisitions selectByPrimaryKey(String prDocumentNumber);

    int updateByExampleSelective(@Param("record") TPurchaseRequisitions record, @Param("example") TPurchaseRequisitionsExample example);

    int updateByExample(@Param("record") TPurchaseRequisitions record, @Param("example") TPurchaseRequisitionsExample example);

    int updateByPrimaryKeySelective(TPurchaseRequisitions record);

    int updateByPrimaryKey(TPurchaseRequisitions record);
    
}