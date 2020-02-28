package com.factory.mapper;

import com.factory.entity.PayablesDetail;
import com.factory.entity.PayablesMain;
import com.factory.entity.PayablesMainExample;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface PayablesMainMapper {
    int countByExample(PayablesMainExample example);

    int deleteByExample(PayablesMainExample example);

    int deleteByPrimaryKey(String payablesId);
    
    //查询应付款单
	/*
	 * @Select("select * from `payables_main`") List<PayablesMain> CQueryPayMain();
	 */
    Integer deletePayMain(@Param("payablesId")String payablesId);
    
    //根据payablesid查询单号详情信息
    PayablesMain queryPayMainByPayablesId(@Param("payablesId")String payablesId);
    
    int insert(PayablesMain record);

    int insertSelective(PayablesMain record);

    List<PayablesMain> selectByExample(PayablesMainExample example);

    PayablesMain selectByPrimaryKey(String payablesId);

    int updateByExampleSelective(@Param("record") PayablesMain record, @Param("example") PayablesMainExample example);

    int updateByExample(@Param("record") PayablesMain record, @Param("example") PayablesMainExample example);

    int updateByPrimaryKeySelective(PayablesMain record);

    int updateByPrimaryKey(PayablesMain record);
}