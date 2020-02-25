package com.factory.mapper;

import com.factory.entity.BlitemPrimaryBill;
import com.factory.entity.BlitemPrimaryBillExample;
import com.factory.entity.Hyw_BlitemPrimaryAndSchedule;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlitemPrimaryBillMapper {
    int countByExample(BlitemPrimaryBillExample example);

    int deleteByExample(BlitemPrimaryBillExample example);

    int deleteByPrimaryKey(String bpbid);

    int insert(BlitemPrimaryBill record);

    int insertSelective(BlitemPrimaryBill record);

    List<BlitemPrimaryBill> selectByExampleWithBLOBs(BlitemPrimaryBillExample example);

    List<BlitemPrimaryBill> selectByExample(BlitemPrimaryBillExample example);

    BlitemPrimaryBill selectByPrimaryKey(String bpbid);

    int updateByExampleSelective(@Param("record") BlitemPrimaryBill record, @Param("example") BlitemPrimaryBillExample example);

    int updateByExampleWithBLOBs(@Param("record") BlitemPrimaryBill record, @Param("example") BlitemPrimaryBillExample example);

    int updateByExample(@Param("record") BlitemPrimaryBill record, @Param("example") BlitemPrimaryBillExample example);

    int updateByPrimaryKeySelective(BlitemPrimaryBill record);

    int updateByPrimaryKeyWithBLOBs(BlitemPrimaryBill record);

    int updateByPrimaryKey(BlitemPrimaryBill record);
    
    //库存管理 -- 盘点单  主详新增
    int Hyw_insert_blitem(Hyw_BlitemPrimaryAndSchedule biltem);
    
    //库存管理 -- 盘点单  主详删除
    int Hyw_delete_blitem(String bpbid);
    
    //库存管理 -- 盘点单  主详修改
    int Hyw_update_blitem(Hyw_BlitemPrimaryAndSchedule biltem);
    
    //库存管理 -- 盘点单  查询全部
    List<Hyw_BlitemPrimaryAndSchedule> Hyw_select_blitem();
    
    //库存管理 -- 盘点单  按单号查询
    Hyw_BlitemPrimaryAndSchedule Hyw_select_blitemByDpbid(String bpbid);
}