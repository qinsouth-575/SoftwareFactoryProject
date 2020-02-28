package com.factory.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.factory.entity.TPurchaseRequisitionsDetails;
import com.factory.entity.TPurchaseRequisitionsDetailsExample;

public interface TPurchaseRequisitionsDetailsMapper {
	
	//1.根据主表编号查询全部（查询）
	public List<TPurchaseRequisitionsDetails> queryPRDAll(@Param("prdDocumentNumber") String prdDocumentNumber);
	
	
	
    int countByExample(TPurchaseRequisitionsDetailsExample example);

    int deleteByExample(TPurchaseRequisitionsDetailsExample example);

    int deleteByPrimaryKey(Integer prdId);

    int insert(TPurchaseRequisitionsDetails record);

    int insertSelective(TPurchaseRequisitionsDetails record);

    List<TPurchaseRequisitionsDetails> selectByExample(TPurchaseRequisitionsDetailsExample example);

    TPurchaseRequisitionsDetails selectByPrimaryKey(Integer prdId);

    int updateByExampleSelective(@Param("record") TPurchaseRequisitionsDetails record, @Param("example") TPurchaseRequisitionsDetailsExample example);

    int updateByExample(@Param("record") TPurchaseRequisitionsDetails record, @Param("example") TPurchaseRequisitionsDetailsExample example);

    int updateByPrimaryKeySelective(TPurchaseRequisitionsDetails record);

    int updateByPrimaryKey(TPurchaseRequisitionsDetails record);
    
}