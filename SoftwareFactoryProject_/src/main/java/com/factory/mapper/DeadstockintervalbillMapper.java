package com.factory.mapper;

import com.factory.entity.Deadstockintervalbill;
import com.factory.entity.DeadstockintervalbillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeadstockintervalbillMapper {
    int countByExample(DeadstockintervalbillExample example);

    int deleteByExample(DeadstockintervalbillExample example);

    int deleteByPrimaryKey(Integer dsibid);

    int insert(Deadstockintervalbill record);

    int insertSelective(Deadstockintervalbill record);

    List<Deadstockintervalbill> selectByExample(DeadstockintervalbillExample example);

    Deadstockintervalbill selectByPrimaryKey(Integer dsibid);

    int updateByExampleSelective(@Param("record") Deadstockintervalbill record, @Param("example") DeadstockintervalbillExample example);

    int updateByExample(@Param("record") Deadstockintervalbill record, @Param("example") DeadstockintervalbillExample example);

    int updateByPrimaryKeySelective(Deadstockintervalbill record);

    int updateByPrimaryKey(Deadstockintervalbill record);
}