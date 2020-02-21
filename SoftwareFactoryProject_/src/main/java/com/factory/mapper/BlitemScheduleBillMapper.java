package com.factory.mapper;

import com.factory.entity.BlitemScheduleBill;
import com.factory.entity.BlitemScheduleBillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlitemScheduleBillMapper {
    int countByExample(BlitemScheduleBillExample example);

    int deleteByExample(BlitemScheduleBillExample example);

    int deleteByPrimaryKey(Integer bsbid);

    int insert(BlitemScheduleBill record);

    int insertSelective(BlitemScheduleBill record);

    List<BlitemScheduleBill> selectByExample(BlitemScheduleBillExample example);

    BlitemScheduleBill selectByPrimaryKey(Integer bsbid);

    int updateByExampleSelective(@Param("record") BlitemScheduleBill record, @Param("example") BlitemScheduleBillExample example);

    int updateByExample(@Param("record") BlitemScheduleBill record, @Param("example") BlitemScheduleBillExample example);

    int updateByPrimaryKeySelective(BlitemScheduleBill record);

    int updateByPrimaryKey(BlitemScheduleBill record);
}