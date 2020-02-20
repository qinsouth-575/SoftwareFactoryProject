package com.factory.mapper;

import com.factory.entity.AStaPosRelation;
import com.factory.entity.AStaPosRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AStaPosRelationMapper {
    int countByExample(AStaPosRelationExample example);

    int deleteByExample(AStaPosRelationExample example);

    int insert(AStaPosRelation record);

    int insertSelective(AStaPosRelation record);

    List<AStaPosRelation> selectByExample(AStaPosRelationExample example);

    int updateByExampleSelective(@Param("record") AStaPosRelation record, @Param("example") AStaPosRelationExample example);

    int updateByExample(@Param("record") AStaPosRelation record, @Param("example") AStaPosRelationExample example);
}