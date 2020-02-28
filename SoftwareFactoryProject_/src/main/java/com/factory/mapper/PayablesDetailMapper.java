package com.factory.mapper;

import com.factory.entity.PayablesDetail;
import com.factory.entity.PayablesDetailExample;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface PayablesDetailMapper {
    int countByExample(PayablesDetailExample example);

    int deleteByExample(PayablesDetailExample example);

    int deleteByPrimaryKey(String paydetailId);

    int insert(PayablesDetail record);

    int insertSelective(PayablesDetail record);
    //根据主表id查询详表信息
    List<PayablesDetail> queryByPayablesId(@Param("payablesId")String payablesId);
    
    //根据主表id删除详表信息
    int deleteByPayablesId(@Param("payablesId")String payablesId);

    List<PayablesDetail> selectByExample(PayablesDetailExample example);

    PayablesDetail selectByPrimaryKey(String paydetailId);

    int updateByExampleSelective(@Param("record") PayablesDetail record, @Param("example") PayablesDetailExample example);

    int updateByExample(@Param("record") PayablesDetail record, @Param("example") PayablesDetailExample example);

    int updateByPrimaryKeySelective(PayablesDetail record);

    int updateByPrimaryKey(PayablesDetail record);
}