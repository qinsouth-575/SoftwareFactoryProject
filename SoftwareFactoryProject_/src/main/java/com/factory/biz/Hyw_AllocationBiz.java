package com.factory.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.factory.entity.Hyw_AllocationPrimaryAndSchedule;
import com.factory.mapper.AllocationPrimaryBillMapper;

@Service
public class Hyw_AllocationBiz {

	@Autowired
	private AllocationPrimaryBillMapper mapper;
	
	
	//库存管理 -- 调拨单  主详新增
    int Hyw_insert_allocation(Hyw_AllocationPrimaryAndSchedule allocation) {
    	return mapper.Hyw_insert_allocation(allocation);
    }
    
    //库存管理 -- 调拨单  主详删除
    int Hyw_delete_allocation(String apbid) {
    	return mapper.Hyw_delete_allocation(apbid);
    }
    
    //库存管理 -- 调拨单  主详修改
    int Hyw_update_allocation(Hyw_AllocationPrimaryAndSchedule allocation) {
    	return mapper.Hyw_update_allocation(allocation);
    }
    
    //库存管理 -- 调拨单  查询全部
    List<Hyw_AllocationPrimaryAndSchedule> Hyw_select_allocation(){
    	return mapper.Hyw_select_allocation();
    }
    
    //库存管理 -- 调拨单  按单号查询
    Hyw_AllocationPrimaryAndSchedule Hyw_select_allocationByApbid(String apbid) {
    	return mapper.Hyw_select_allocationByApbid(apbid);
    }
}
