package com.factory.mapper;

import com.factory.entity.Discountprimarybill;
import com.factory.entity.DiscountprimarybillExample;
import com.factory.entity.Hyw_BlitemPrimaryAndSchedule;
import com.factory.entity.Hyw_DiscountPrimaryAndSchedule;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DiscountprimarybillMapper {
    int countByExample(DiscountprimarybillExample example);

    int deleteByExample(DiscountprimarybillExample example);

    int deleteByPrimaryKey(String dpbid);

    int insert(Discountprimarybill record);

    int insertSelective(Discountprimarybill record);

    List<Discountprimarybill> selectByExampleWithBLOBs(DiscountprimarybillExample example);

    List<Discountprimarybill> selectByExample(DiscountprimarybillExample example);

    Discountprimarybill selectByPrimaryKey(String dpbid);

    int updateByExampleSelective(@Param("record") Discountprimarybill record, @Param("example") DiscountprimarybillExample example);

    int updateByExampleWithBLOBs(@Param("record") Discountprimarybill record, @Param("example") DiscountprimarybillExample example);

    int updateByExample(@Param("record") Discountprimarybill record, @Param("example") DiscountprimarybillExample example);

    int updateByPrimaryKeySelective(Discountprimarybill record);

    int updateByPrimaryKeyWithBLOBs(Discountprimarybill record);

    int updateByPrimaryKey(Discountprimarybill record);
    
    //库存管理 -- 调价单  主详新增
    int Hyw_insert_discount(Hyw_DiscountPrimaryAndSchedule discount);
    
    //库存管理 -- 调价单  主详删除
    int Hyw_delete_discount(String dpbid);
    
    //库存管理 -- 调价单  主详修改
    int Hyw_update_discount(Hyw_DiscountPrimaryAndSchedule discount);
    
    //库存管理 -- 调价单  查询全部
    List<Hyw_DiscountPrimaryAndSchedule> Hyw_select_discount();
    
    //库存管理 -- 调价单  按单号查询
    Hyw_DiscountPrimaryAndSchedule Hyw_select_discountByDpbid(String dpbid);
}