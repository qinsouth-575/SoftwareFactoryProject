package com.factory.mapper;

import com.factory.entity.BlitemPrimaryBill;
import com.factory.entity.BlitemPrimaryBillExample;
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
}