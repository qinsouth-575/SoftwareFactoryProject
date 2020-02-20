package com.factory.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.factory.entity.AJurisdiction;
import com.factory.entity.AJurisdictionExample;

public interface AJurisdictionMapper {
	
    List<Integer> listPermissionIdsByRoleIds(List<Integer> role_ids) ;

    List<AJurisdiction> listPermissionsByPermissionIds(List<Integer> permissions_ids);
    
    
    int countByExample(AJurisdictionExample example);

    int deleteByExample(AJurisdictionExample example);

    int deleteByPrimaryKey(Integer jurId);

    int insert(AJurisdiction record);

    int insertSelective(AJurisdiction record);

    List<AJurisdiction> selectByExample(AJurisdictionExample example);

    AJurisdiction selectByPrimaryKey(Integer jurId);

    int updateByExampleSelective(@Param("record") AJurisdiction record, @Param("example") AJurisdictionExample example);

    int updateByExample(@Param("record") AJurisdiction record, @Param("example") AJurisdictionExample example);

    int updateByPrimaryKeySelective(AJurisdiction record);

    int updateByPrimaryKey(AJurisdiction record);
}