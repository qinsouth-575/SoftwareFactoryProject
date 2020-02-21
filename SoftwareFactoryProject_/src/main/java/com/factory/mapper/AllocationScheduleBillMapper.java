package com.factory.mapper;

import com.factory.entity.AllocationScheduleBill;
import com.factory.entity.AllocationScheduleBillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AllocationScheduleBillMapper {
    int countByExample(AllocationScheduleBillExample example);

    int deleteByExample(AllocationScheduleBillExample example);

    int deleteByPrimaryKey(Integer asbid);

    int insert(AllocationScheduleBill record);

    int insertSelective(AllocationScheduleBill record);

    List<AllocationScheduleBill> selectByExampleWithBLOBs(AllocationScheduleBillExample example);

    List<AllocationScheduleBill> selectByExample(AllocationScheduleBillExample example);

    AllocationScheduleBill selectByPrimaryKey(Integer asbid);

    int updateByExampleSelective(@Param("record") AllocationScheduleBill record, @Param("example") AllocationScheduleBillExample example);

    int updateByExampleWithBLOBs(@Param("record") AllocationScheduleBill record, @Param("example") AllocationScheduleBillExample example);

    int updateByExample(@Param("record") AllocationScheduleBill record, @Param("example") AllocationScheduleBillExample example);

    int updateByPrimaryKeySelective(AllocationScheduleBill record);

    int updateByPrimaryKeyWithBLOBs(AllocationScheduleBill record);

    int updateByPrimaryKey(AllocationScheduleBill record);
}