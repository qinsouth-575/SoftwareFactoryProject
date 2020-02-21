package com.factory.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.factory.entity.APosition;
import com.factory.entity.APositionExample;

public interface APositionMapper {
	
    List<APosition> listRolesByRoleIds(List<Integer> role_ids);
    
    
    
    int countByExample(APositionExample example);

    int deleteByExample(APositionExample example);

    int deleteByPrimaryKey(Integer posId);

    int insert(APosition record);

    int insertSelective(APosition record);

    List<APosition> selectByExample(APositionExample example);

    APosition selectByPrimaryKey(Integer posId);

    int updateByExampleSelective(@Param("record") APosition record, @Param("example") APositionExample example);

    int updateByExample(@Param("record") APosition record, @Param("example") APositionExample example);

    int updateByPrimaryKeySelective(APosition record);

    int updateByPrimaryKey(APosition record);
}