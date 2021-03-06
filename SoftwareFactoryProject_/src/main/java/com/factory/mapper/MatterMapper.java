package com.factory.mapper;

import com.factory.entity.Matter;
import com.factory.entity.MatterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MatterMapper {
    int countByExample(MatterExample example);

    int deleteByExample(MatterExample example);

    int deleteByPrimaryKey(String matterId);

    int insert(Matter record);

    int insertSelective(Matter record);

    List<Matter> selectByExample(MatterExample example);

    Matter selectByPrimaryKey(String matterId);

    int updateByExampleSelective(@Param("record") Matter record, @Param("example") MatterExample example);

    int updateByExample(@Param("record") Matter record, @Param("example") MatterExample example);

    int updateByPrimaryKeySelective(Matter record);

    int updateByPrimaryKey(Matter record);
}