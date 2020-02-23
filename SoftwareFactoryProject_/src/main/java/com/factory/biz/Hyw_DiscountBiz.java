package com.factory.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.factory.entity.Hyw_DiscountPrimaryAndSchedule;
import com.factory.mapper.DiscountprimarybillMapper;

@Service
public class Hyw_DiscountBiz {

	@Autowired
	private DiscountprimarybillMapper mapper;
	
	//库存管理 -- 调价单  主详新增
    int Hyw_insert_discount(Hyw_DiscountPrimaryAndSchedule discount) {
    	return mapper.Hyw_insert_discount(discount);
    }
    
    //库存管理 -- 调价单  主详删除
    int Hyw_delete_discount(String dpbid) {
    	return mapper.Hyw_delete_discount(dpbid);
    }
    
    //库存管理 -- 调价单  主详修改
    int Hyw_update_discount(Hyw_DiscountPrimaryAndSchedule discount) {
    	return mapper.Hyw_update_discount(discount);
    }
    
    //库存管理 -- 调价单  查询全部
    List<Hyw_DiscountPrimaryAndSchedule> Hyw_select_discount(){
    	return mapper.Hyw_select_discount();
    }
    
    //库存管理 -- 调价单  按单号查询
    Hyw_DiscountPrimaryAndSchedule Hyw_select_discountByDpbid(String dpbid) {
    	return mapper.Hyw_select_discountByDpbid(dpbid);
    }
}
