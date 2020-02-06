package com.factory.mapper;

import com.factory.entity.Comarea;
import com.factory.entity.ComareaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComareaMapper {
    int countByExample(ComareaExample example);

    int deleteByExample(ComareaExample example);

    int insert(Comarea record);

    int insertSelective(Comarea record);

    List<Comarea> selectByExample(ComareaExample example);

    int updateByExampleSelective(@Param("record") Comarea record, @Param("example") ComareaExample example);

    int updateByExample(@Param("record") Comarea record, @Param("example") ComareaExample example);
}