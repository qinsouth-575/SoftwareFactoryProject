package com.factory.mapper;

import com.factory.entity.TPurchaseRequisitions;
import com.factory.entity.TPurchaseRequisitionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPurchaseRequisitionsMapper {
    int countByExample(TPurchaseRequisitionsExample example);

    int deleteByExample(TPurchaseRequisitionsExample example);

    int deleteByPrimaryKey(String billno);

    int insert(TPurchaseRequisitions record);

    int insertSelective(TPurchaseRequisitions record);

    List<TPurchaseRequisitions> selectByExample(TPurchaseRequisitionsExample example);

    TPurchaseRequisitions selectByPrimaryKey(String billno);

    int updateByExampleSelective(@Param("record") TPurchaseRequisitions record, @Param("example") TPurchaseRequisitionsExample example);

    int updateByExample(@Param("record") TPurchaseRequisitions record, @Param("example") TPurchaseRequisitionsExample example);

    int updateByPrimaryKeySelective(TPurchaseRequisitions record);

    int updateByPrimaryKey(TPurchaseRequisitions record);
}