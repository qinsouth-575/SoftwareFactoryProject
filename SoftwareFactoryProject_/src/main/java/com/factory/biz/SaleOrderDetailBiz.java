package com.factory.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.factory.entity.SaleOrderDetail;
import com.factory.mapper.SaleOrderDetailMapper;

@Service
public class SaleOrderDetailBiz {
			
			@Autowired
			private SaleOrderDetailMapper biz;
			//根据订单主表id查询详表信息
			public List<SaleOrderDetail> queryAlldetail(int soid){
				List<SaleOrderDetail> list=biz.queryAlldetail(soid);
				return list;
			}
			
			//修改详表信息
			public boolean insertSelective(List<SaleOrderDetail> details){
				boolean b=biz.insertSelective(details)>0;
				return b;
			}
			
			//删除详表信息
			public boolean deleteAll() {
				boolean b=biz.deleteAll()>0;
				return b;
			}
			
			//根据主表编号删除
			public boolean deleteByIddetail(int id) {
				boolean b=biz.deleteByIddetail(id)>0;
				return b;
			}
}
