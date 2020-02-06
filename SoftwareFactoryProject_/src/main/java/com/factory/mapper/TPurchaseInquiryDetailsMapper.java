package com.factory.mapper;

import com.factory.entity.TPurchaseInquiryDetails;
import com.factory.entity.TPurchaseInquiryDetailsExample;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPurchaseInquiryDetailsMapper {
    int countByExample(TPurchaseInquiryDetailsExample example);

    int deleteByExample(TPurchaseInquiryDetailsExample example);

    int deleteByPrimaryKey(Date prodid);

    int insert(TPurchaseInquiryDetails record);

    int insertSelective(TPurchaseInquiryDetails record);

    List<TPurchaseInquiryDetails> selectByExample(TPurchaseInquiryDetailsExample example);

    TPurchaseInquiryDetails selectByPrimaryKey(Date prodid);

    int updateByExampleSelective(@Param("record") TPurchaseInquiryDetails record, @Param("example") TPurchaseInquiryDetailsExample example);

    int updateByExample(@Param("record") TPurchaseInquiryDetails record, @Param("example") TPurchaseInquiryDetailsExample example);

    int updateByPrimaryKeySelective(TPurchaseInquiryDetails record);

    int updateByPrimaryKey(TPurchaseInquiryDetails record);
}