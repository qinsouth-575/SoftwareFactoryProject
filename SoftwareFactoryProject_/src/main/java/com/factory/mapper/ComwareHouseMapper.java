package com.factory.mapper;

import com.factory.entity.ComwareHouse;
import com.factory.entity.ComwareHouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComwareHouseMapper {
	
    int countByExample(ComwareHouseExample example);

    int deleteByExample(ComwareHouseExample example);

    int insert(ComwareHouse record);

    int insertSelective(ComwareHouse record);

    List<ComwareHouse> selectByExample(ComwareHouseExample example);

    int updateByExampleSelective(@Param("record") ComwareHouse record, @Param("example") ComwareHouseExample example);

    int updateByExample(@Param("record") ComwareHouse record, @Param("example") ComwareHouseExample example);
    
}