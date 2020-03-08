package com.factory.mapper;

import com.factory.entity.PriabillDetails;
import com.factory.entity.PriabillDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PriabillDetailsMapper {
    int countByExample(PriabillDetailsExample example);

    int deleteByExample(PriabillDetailsExample example);

    int deleteByPrimaryKey(String priadetailsId);

    int insert(PriabillDetails record);

    int insertSelective(PriabillDetails record);

    List<PriabillDetails> selectByExample(PriabillDetailsExample example);

    PriabillDetails selectByPrimaryKey(String priadetailsId);

    int updateByExampleSelective(@Param("record") PriabillDetails record, @Param("example") PriabillDetailsExample example);

    int updateByExample(@Param("record") PriabillDetails record, @Param("example") PriabillDetailsExample example);

    int updateByPrimaryKeySelective(PriabillDetails record);

    int updateByPrimaryKey(PriabillDetails record);
}