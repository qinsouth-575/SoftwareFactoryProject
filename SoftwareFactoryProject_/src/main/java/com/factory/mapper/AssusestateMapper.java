package com.factory.mapper;

import com.factory.entity.Assusestate;
import com.factory.entity.AssusestateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssusestateMapper {
    int countByExample(AssusestateExample example);

    int deleteByExample(AssusestateExample example);

    int insert(Assusestate record);

    int insertSelective(Assusestate record);

    List<Assusestate> selectByExample(AssusestateExample example);

    int updateByExampleSelective(@Param("record") Assusestate record, @Param("example") AssusestateExample example);

    int updateByExample(@Param("record") Assusestate record, @Param("example") AssusestateExample example);
}