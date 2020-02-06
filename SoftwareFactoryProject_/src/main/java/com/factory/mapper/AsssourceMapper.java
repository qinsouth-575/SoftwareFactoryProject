package com.factory.mapper;

import com.factory.entity.Asssource;
import com.factory.entity.AsssourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AsssourceMapper {
    int countByExample(AsssourceExample example);

    int deleteByExample(AsssourceExample example);

    int insert(Asssource record);

    int insertSelective(Asssource record);

    List<Asssource> selectByExample(AsssourceExample example);

    int updateByExampleSelective(@Param("record") Asssource record, @Param("example") AsssourceExample example);

    int updateByExample(@Param("record") Asssource record, @Param("example") AsssourceExample example);
}