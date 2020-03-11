package com.factory.biz;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.factory.entity.Matter;
import com.factory.entity.MatterExample;
import com.factory.entity.PurchaseStorageDetails;
import com.factory.entity.TPurchaseRequisitions;
import com.factory.entity.TPurchaseRequisitionsDetails;
import com.factory.mapper.MatterMapper;
import com.factory.mapper.PurchaseStorageDetailsMapper;
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
	
	private static Logger log = Logger.getLogger(Dsww_TPurchaseRequisitionsBiz.class);
	
	@Autowired
	private TPurchaseRequisitionsMapper dao;
	
	@Autowired
	private TPurchaseRequisitionsDetailsMapper detailsdao;

	@Autowired
	private PurchaseStorageDetailsMapper psddetailsdao;
	
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
    			if(tprd.getPrdMatterId().equals("")) {
    				continue;
    			}
    			
    			if(detailsdao.insert(tprd) <= 0) {
    				return false;
    			}
			}
    	}
    	return true;
    };

    //采购询价 - 3.删除/5.审核/6.取消审核
    public boolean updateState(TPurchaseRequisitions record) {
    	return dao.updateByPrimaryKeySelective(record) > 0;
    };

    //采购询价 - 4.修改
    public boolean update(TPurchaseRequisitions record) {
    	if(dao.updateByPrimaryKey(record) > 0) {
    		for (TPurchaseRequisitionsDetails tprd : record.getPrdList()) {
    			if(tprd.getPrdMatterId().equals("")) {
    				continue;
    			}
    			
    			if(detailsdao.updateByPrimaryKey(tprd) <= 0) {
    				return false;
    			}
			}
    	}
    	return true;
    };
    
    //2.1-4.1（新增/修改）根据物料编号查询是否存在	不存在返回matterId为0的对象做判断显示，存在则创建采购询价详情类对象录入物料及采购入库详表最后一次采购信息并返回
    //瑕疵：采购入库未查主表币别，本项目为单币别项目，故直接引用物料主文件币别信息
    public TPurchaseRequisitionsDetails queryMatter(String matterId) {
    	MatterExample matterExample = new MatterExample();
    	matterExample.createCriteria().andMatterIdEqualTo(matterId);
    	List<Matter> matList = matterdao.selectByExample(matterExample);
    	
    	if(matList.size() == 0) {
    		return new TPurchaseRequisitionsDetails("0");
    	}
    	
    	Matter matter = matList.get(0);
    	log.info("物料主文件（根据物料编号查询是否存在）：" + matter);
    	PurchaseStorageDetails psd = psddetailsdao.queryPASByMatterId(matterId);
    	return new TPurchaseRequisitionsDetails(matter.getMatterId(), matter.getMatterName(), matter.getMatterSize(), matter.getUnitname(), matter.getCurrencyname(), matter.getMatterStandardPrice(), matter.getCurrencyname(), psd.getPsdPrice());
    }
    
    //2.2-4.2（新增/修改）查询物料集合
    public List<TPurchaseRequisitionsDetails> queryMatterAll(Matter mat) {
    	List<Matter> matList = matterdao.selectByExample(null);
    	List<TPurchaseRequisitionsDetails> tprdList = new ArrayList<TPurchaseRequisitionsDetails>();;
    	
    	for (Matter matter : matList) {
        	PurchaseStorageDetails psd = psddetailsdao.queryPASByMatterId(matter.getMatterId());
        	tprdList.add(new TPurchaseRequisitionsDetails(matter.getMatterId(), matter.getMatterName(), matter.getMatterSize(), matter.getUnitname(), matter.getCurrencyname(), matter.getMatterStandardPrice(), matter.getCurrencyname(), psd.getPsdPrice()));
		}
    	
    	return tprdList;
    }

}
