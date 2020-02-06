package com.factory.mapper;

import com.factory.entity.PayablesMain;
import com.factory.entity.PayablesMainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PayablesMainMapper {
    int countByExample(PayablesMainExample example);

    int deleteByExample(PayablesMainExample example);

    int deleteByPrimaryKey(String payablesId);

    int insert(PayablesMain record);

    int insertSelective(PayablesMain record);

    List<PayablesMain> selectByExample(PayablesMainExample example);

    PayablesMain selectByPrimaryKey(String payablesId);

    int updateByExampleSelective(@Param("record") PayablesMain record, @Param("example") PayablesMainExample example);

    int updateByExample(@Param("record") PayablesMain record, @Param("example") PayablesMainExample example);

    int updateByPrimaryKeySelective(PayablesMain record);

    int updateByPrimaryKey(PayablesMain record);
}