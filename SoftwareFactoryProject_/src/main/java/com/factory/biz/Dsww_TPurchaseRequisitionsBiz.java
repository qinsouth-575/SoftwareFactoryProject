package com.factory.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.factory.entity.Matter;
import com.factory.entity.MatterExample;
import com.factory.entity.TPurchaseRequisitions;
import com.factory.entity.TPurchaseRequisitionsDetails;
import com.factory.mapper.MatterMapper;
import com.factory.mapper.TPurchaseRequisitionsDetailsMapper;
import com.factory.mapper.TPurchaseRequisitionsMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * - 业务逻辑层 - 采购询价类（孙威威）
 * @author south wind
 * @version v1.0 2020年2月05日 上午10:37:53
 * - 表/功能：
 */

@Service
public class Dsww_TPurchaseRequisitionsBiz {
	
	@Autowired
	private TPurchaseRequisitionsMapper dao;
	
	@Autowired
	private TPurchaseRequisitionsDetailsMapper detailsdao;
	
	@Autowired
	private MatterMapper matterdao;
	
	//0.根据当前日期查询单据号码
	public String queryPRCount(String prDocumentDate) {
		int count = dao.queryPRCount("%" + prDocumentDate + "%")+1;
		String ptimecount = String.valueOf(count);
		String [] str = prDocumentDate.split("-");
		String ptime = "";
		for (int i = 0; i < str.length; i++) {
			ptime += str[i];
		}
		if (count < 10) {
			ptime += "0" + ptimecount;
		}else if (count < 100) {
			ptime += ptimecount;
		}
		return ptime;
	}
	
	//采购询价 - 1.分页查询一条采购询价单据
    public PageInfo<TPurchaseRequisitions> queryCDAll(TPurchaseRequisitions record){
    	PageHelper.startPage(record.getPageNum(), record.getPageSize());
    	List<TPurchaseRequisitions> cdList = dao.queryPRAll();
    	PageInfo<TPurchaseRequisitions> page = new PageInfo<TPurchaseRequisitions>(cdList);
    	//System.out.println("分页查询结果，主表信息" + page.getList().get(0));
    	page.getList().get(0).setPrdList(detailsdao.queryPRDAll(page.getList().get(0).getPrDocumentNumber()));
    	return page;
    }

    //采购询价 - 2.新增
    public boolean insert(TPurchaseRequisitions record) {
    	if(dao.insert(record) > 0) {
    		for (TPurchaseRequisitionsDetails tprd : record.getPrdList()) {
    			if(detailsdao.insert(tprd) <= 0) {
    				return false;
    			}
			}
    	}
    	return true;
    };
    
    //2.1根据物料编号查询是否存在
    public TPurchaseRequisitionsDetails queryMatter(String matterId) {
    	MatterExample matterExample = new MatterExample();
    	matterExample.createCriteria().andMatterIdEqualTo(matterId);
    	List<Matter> matList = matterdao.selectByExample(matterExample);
    	
    	if(matList.size() == 0) {
    		return new TPurchaseRequisitionsDetails("0");
    	}
    	
    	return new TPurchaseRequisitionsDetails("0");
    }
    
    //2.2查询物料集合
    public List<Matter> queryMatterAll(Matter mat) {
    	return matterdao.selectByExample(null);
    }

    //采购询价 - 3.删除/5.审核/6.取消审核
    public boolean updateState(TPurchaseRequisitions record) {
    	return dao.updateByPrimaryKeySelective(record) > 0;
    };

    //采购询价 - 4.修改
    public boolean update(TPurchaseRequisitions record) {
    	if(dao.updateByPrimaryKey(record) > 0) {
    		for (TPurchaseRequisitionsDetails tprd : record.getPrdList()) {
    			if(detailsdao.updateByPrimaryKey(tprd) <= 0) {
    				return false;
    			}
			}
    	}
    	return true;
    };

}
