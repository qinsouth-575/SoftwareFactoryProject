package com.factory.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.factory.entity.Comdepartment;
import com.factory.entity.ComdepartmentExample;

public interface ComdepartmentMapper {
	
    int countByExample(ComdepartmentExample example);

    int deleteByExample(ComdepartmentExample example);

    int insert(Comdepartment record);

    int insertSelective(Comdepartment record);

    List<Comdepartment> selectByExample(ComdepartmentExample example);

    int updateByExampleSelective(@Param("record") Comdepartment record, @Param("example") ComdepartmentExample example);

    int updateByExample(@Param("record") Comdepartment record, @Param("example") ComdepartmentExample example);
    
    

	//1.查询全部
    public List<Comdepartment> queryCDAll(Comdepartment cd);
}