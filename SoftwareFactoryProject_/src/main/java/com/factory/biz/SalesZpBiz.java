package com.factory.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.factory.entity.Comdepartment;
import com.factory.entity.SaleOutWarehouse;
import com.factory.entity.SaleOutWarehouseDetailedExample;
import com.factory.entity.SaleOutWarehouseExample;
import com.factory.entity.SaleQuotation;
import com.factory.entity.SaleQuotationDetails;
import com.factory.entity.SaleQuotationDetailsExample;
import com.factory.mapper.CustomerMapper;
import com.factory.mapper.SaleOutWarehouseDetailedMapper;
import com.factory.mapper.SaleOutWarehouseMapper;
import com.factory.mapper.SaleQuotationDetailsMapper;
import com.factory.mapper.SaleQuotationMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class SalesZpBiz {

	@Autowired
	private SaleQuotationMapper sq;

	@Autowired
	private SaleQuotationDetailsMapper sqd;
	
	@Autowired
	private SaleOutWarehouseMapper sowh;
	
	@Autowired
	private SaleOutWarehouseDetailedMapper sowhd;
	
	@Autowired
	private CustomerMapper c;

	public PageInfo<SaleQuotation> querybaojia(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<SaleQuotation> list = sq.selectByExample(null);
		for (SaleQuotation saleQuotation2 : list) {
			SaleQuotationDetailsExample example=new SaleQuotationDetailsExample();
			 example.createCriteria().andSqIdEqualTo(saleQuotation2.getSqId());
			 saleQuotation2.setList(sqd.selectByExample(example));
		}
		PageInfo<SaleQuotation> page = new PageInfo<SaleQuotation>(list);
		return page;
	}
	
	public PageInfo<SaleOutWarehouse> querychuku(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<SaleOutWarehouse> list = sowh.selectByExample(null);
		for (SaleOutWarehouse saleOutWarehouse : list) {
			SaleOutWarehouseDetailedExample example=new SaleOutWarehouseDetailedExample();
			example.createCriteria().andSowIdEqualTo(saleOutWarehouse.getSowId());
			saleOutWarehouse.setList(sowhd.selectByExample(example));
		}
		PageInfo<SaleOutWarehouse> page = new PageInfo<SaleOutWarehouse>(list);
		return page;
	}
	
	public int addbaojia(SaleQuotation s) {
		sq.insert(s);
		for (SaleQuotationDetails a : s.getList()) {
			a.setSqId(s.getSqId());
			sqd.insert(a);
		}
		return 1;
	}
	
	public int updatebaojia(SaleQuotation s) {
		sq.updateByPrimaryKey(s);
		for (SaleQuotationDetails a : s.getList()) {
			a.setSqId(s.getSqId());
			sqd.updateByPrimaryKey(a);
		}
		return 1;
	}
	
	public int deletebaojia(String sqId) {
		sq.deleteByPrimaryKey(sqId);
		SaleQuotationDetailsExample example=new SaleQuotationDetailsExample();
		example.createCriteria().andSqIdEqualTo(sqId);
		sqd.deleteByExample(example);
		return 1;
	}
}
