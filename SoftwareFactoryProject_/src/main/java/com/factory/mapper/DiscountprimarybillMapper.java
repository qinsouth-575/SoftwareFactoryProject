package com.factory.mapper;

import com.factory.entity.Discountprimarybill;
import com.factory.entity.DiscountprimarybillExample;
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
}