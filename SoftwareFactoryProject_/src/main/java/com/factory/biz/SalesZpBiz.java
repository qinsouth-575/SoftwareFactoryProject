package com.factory.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.factory.entity.Comdepartment;
import com.factory.entity.SaleQuotation;
import com.factory.entity.SaleQuotationDetails;
import com.factory.entity.SaleQuotationDetailsExample;
import com.factory.mapper.CustomerMapper;
import com.factory.mapper.SaleQuotationDetailsMapper;
import com.factory.mapper.SaleQuotationMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class SalesZpBiz {

	@Autowired
	private SaleQuotationMapper sq;

	@Autowired
	private SaleQuotationDetailsMapper sqd;
	
	@Autowired
	private CustomerMapper c;

	public PageInfo<SaleQuotation> querybaojia(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<SaleQuotation> list = sq.selectByExample(null);
		/*for (SaleQuotation saleQuotation2 : list) {
			SaleQuotationDetailsExample example=new SaleQuotationDetailsExample();
			 example.createCriteria().andSqlIdEqualTo(saleQuotation2.getSqId());
			 saleQuotation2.setList(sqd.selectByExample(example));
			 if(c.selectByPrimaryKey(saleQuotation2.getCustomerId())!=null)
			 saleQuotation2.setCustomerName(c.selectByPrimaryKey(saleQuotation2.getCustomerId()).getCustomerName());
			 
		}*/
		PageInfo<SaleQuotation> page = new PageInfo<SaleQuotation>(list);
		return page;
	}
}
