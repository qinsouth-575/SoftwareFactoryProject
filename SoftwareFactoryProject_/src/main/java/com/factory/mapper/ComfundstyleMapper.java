package com.factory.mapper;

import com.factory.entity.Comfundstyle;
import com.factory.entity.ComfundstyleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComfundstyleMapper {
    int countByExample(ComfundstyleExample example);

    int deleteByExample(ComfundstyleExample example);

    int insert(Comfundstyle record);

    int insertSelective(Comfundstyle record);

    List<Comfundstyle> selectByExample(ComfundstyleExample example);

    int updateByExampleSelective(@Param("record") Comfundstyle record, @Param("example") ComfundstyleExample example);

    int updateByExample(@Param("record") Comfundstyle record, @Param("example") ComfundstyleExample example);
}