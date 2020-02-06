package com.factory.mapper;

import com.factory.entity.Discountschedulebill;
import com.factory.entity.DiscountschedulebillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DiscountschedulebillMapper {
    int countByExample(DiscountschedulebillExample example);

    int deleteByExample(DiscountschedulebillExample example);

    int deleteByPrimaryKey(Integer dsbid);

    int insert(Discountschedulebill record);

    int insertSelective(Discountschedulebill record);

    List<Discountschedulebill> selectByExampleWithBLOBs(DiscountschedulebillExample example);

    List<Discountschedulebill> selectByExample(DiscountschedulebillExample example);

    Discountschedulebill selectByPrimaryKey(Integer dsbid);

    int updateByExampleSelective(@Param("record") Discountschedulebill record, @Param("example") DiscountschedulebillExample example);

    int updateByExampleWithBLOBs(@Param("record") Discountschedulebill record, @Param("example") DiscountschedulebillExample example);

    int updateByExample(@Param("record") Discountschedulebill record, @Param("example") DiscountschedulebillExample example);

    int updateByPrimaryKeySelective(Discountschedulebill record);

    int updateByPrimaryKeyWithBLOBs(Discountschedulebill record);

    int updateByPrimaryKey(Discountschedulebill record);
}