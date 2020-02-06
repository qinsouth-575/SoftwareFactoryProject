package com.factory.mapper;

import com.factory.entity.Comfaremeans;
import com.factory.entity.ComfaremeansExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComfaremeansMapper {
    int countByExample(ComfaremeansExample example);

    int deleteByExample(ComfaremeansExample example);

    int insert(Comfaremeans record);

    int insertSelective(Comfaremeans record);

    List<Comfaremeans> selectByExample(ComfaremeansExample example);

    int updateByExampleSelective(@Param("record") Comfaremeans record, @Param("example") ComfaremeansExample example);

    int updateByExample(@Param("record") Comfaremeans record, @Param("example") ComfaremeansExample example);
}