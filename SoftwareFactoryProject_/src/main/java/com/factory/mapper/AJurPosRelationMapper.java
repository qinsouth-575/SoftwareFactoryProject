package com.factory.mapper;

import com.factory.entity.AJurPosRelation;
import com.factory.entity.AJurPosRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AJurPosRelationMapper {
    int countByExample(AJurPosRelationExample example);

    int deleteByExample(AJurPosRelationExample example);

    int insert(AJurPosRelation record);

    int insertSelective(AJurPosRelation record);

    List<AJurPosRelation> selectByExample(AJurPosRelationExample example);

    int updateByExampleSelective(@Param("record") AJurPosRelation record, @Param("example") AJurPosRelationExample example);

    int updateByExample(@Param("record") AJurPosRelation record, @Param("example") AJurPosRelationExample example);
}