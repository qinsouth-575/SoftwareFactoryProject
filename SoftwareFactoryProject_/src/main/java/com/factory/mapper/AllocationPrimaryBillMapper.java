package com.factory.mapper;

import com.factory.entity.AllocationPrimaryBill;
import com.factory.entity.AllocationPrimaryBillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AllocationPrimaryBillMapper {
    int countByExample(AllocationPrimaryBillExample example);

    int deleteByExample(AllocationPrimaryBillExample example);

    int deleteByPrimaryKey(String apbid);

    int insert(AllocationPrimaryBill record);

    int insertSelective(AllocationPrimaryBill record);

    List<AllocationPrimaryBill> selectByExampleWithBLOBs(AllocationPrimaryBillExample example);

    List<AllocationPrimaryBill> selectByExample(AllocationPrimaryBillExample example);

    AllocationPrimaryBill selectByPrimaryKey(String apbid);

    int updateByExampleSelective(@Param("record") AllocationPrimaryBill record, @Param("example") AllocationPrimaryBillExample example);

    int updateByExampleWithBLOBs(@Param("record") AllocationPrimaryBill record, @Param("example") AllocationPrimaryBillExample example);

    int updateByExample(@Param("record") AllocationPrimaryBill record, @Param("example") AllocationPrimaryBillExample example);

    int updateByPrimaryKeySelective(AllocationPrimaryBill record);

    int updateByPrimaryKeyWithBLOBs(AllocationPrimaryBill record);

    int updateByPrimaryKey(AllocationPrimaryBill record);
}