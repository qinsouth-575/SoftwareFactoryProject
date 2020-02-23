package com.factory.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.factory.entity.Hyw_BlitemPrimaryAndSchedule;
import com.factory.mapper.BlitemPrimaryBillMapper;

@Service
public class Hyw_BlitemBiz {

	@Autowired
	private BlitemPrimaryBillMapper mapper;
	
	//库存管理 -- 盘点单  主详新增
    int Hyw_insert_blitem(Hyw_BlitemPrimaryAndSchedule biltem) {
    	return mapper.Hyw_insert_blitem(biltem);
    }
    
    //库存管理 -- 盘点单  主详删除
    int Hyw_delete_blitem(String bpbid) {
    	return mapper.Hyw_delete_blitem(bpbid);
    }
    
    //库存管理 -- 盘点单  主详修改
    int Hyw_update_blitem(Hyw_BlitemPrimaryAndSchedule biltem) {
    	return mapper.Hyw_update_blitem(biltem);
    }
    
    //库存管理 -- 盘点单  查询全部
    List<Hyw_BlitemPrimaryAndSchedule> Hyw_select_blitem(){
    	return mapper.Hyw_select_blitem();
    }
    
    //库存管理 -- 盘点单  按单号查询
    Hyw_BlitemPrimaryAndSchedule Hyw_select_blitemByDpbid(String bpbid) {
    	return mapper.Hyw_select_blitemByDpbid(bpbid);
    }
}
