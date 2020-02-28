package com.factory.mapper;

import com.factory.entity.Ordbillstyle;
import com.factory.entity.OrdbillstyleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrdbillstyleMapper {
	
    int countByExample(OrdbillstyleExample example);

    int deleteByExample(OrdbillstyleExample example);

    int insert(Ordbillstyle record);

    int insertSelective(Ordbillstyle record);

    List<Ordbillstyle> selectByExample(OrdbillstyleExample example);

    int updateByExampleSelective(@Param("record") Ordbillstyle record, @Param("example") OrdbillstyleExample example);

    int updateByExample(@Param("record") Ordbillstyle record, @Param("example") OrdbillstyleExample example);
    
}