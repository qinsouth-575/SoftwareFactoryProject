package com.factory.mapper;

import com.factory.entity.PriabillMain;
import com.factory.entity.PriabillMainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PriabillMainMapper {
    int countByExample(PriabillMainExample example);

    int deleteByExample(PriabillMainExample example);

    int deleteByPrimaryKey(String priabillId);

    int insert(PriabillMain record);

    int insertSelective(PriabillMain record);

    List<PriabillMain> selectByExample(PriabillMainExample example);

    PriabillMain selectByPrimaryKey(String priabillId);

    int updateByExampleSelective(@Param("record") PriabillMain record, @Param("example") PriabillMainExample example);

    int updateByExample(@Param("record") PriabillMain record, @Param("example") PriabillMainExample example);

    int updateByPrimaryKeySelective(PriabillMain record);

    int updateByPrimaryKey(PriabillMain record);
}