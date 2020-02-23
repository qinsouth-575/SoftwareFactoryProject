package com.factory.mapper;

import com.factory.entity.AllocationPrimaryBill;
import com.factory.entity.AllocationPrimaryBillExample;
import com.factory.entity.Hyw_AllocationPrimaryAndSchedule;

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
    
    //库存管理 -- 调拨单  主详新增
    int Hyw_insert_allocation(Hyw_AllocationPrimaryAndSchedule allocation);
    
    //库存管理 -- 调拨单  主详删除
    int Hyw_delete_allocation(String apbid);
    
    //库存管理 -- 调拨单  主详修改
    int Hyw_update_allocation(Hyw_AllocationPrimaryAndSchedule allocation);
    
    //库存管理 -- 调拨单  查询全部
    List<Hyw_AllocationPrimaryAndSchedule> Hyw_select_allocation();
    
    //库存管理 -- 调拨单  按单号查询
    Hyw_AllocationPrimaryAndSchedule Hyw_select_allocationByApbid(String apbid);
    
}