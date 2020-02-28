package com.factory.mapper;

import com.factory.entity.ComcustClass;
import com.factory.entity.ComcustClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComcustClassMapper {
    int countByExample(ComcustClassExample example);

    int deleteByExample(ComcustClassExample example);

    int insert(ComcustClass record);

    int insertSelective(ComcustClass record);

    List<ComcustClass> selectByExample(ComcustClassExample example);

    int updateByExampleSelective(@Param("record") ComcustClass record, @Param("example") ComcustClassExample example);

    int updateByExample(@Param("record") ComcustClass record, @Param("example") ComcustClassExample example);
}