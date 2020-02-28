package com.factory.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.factory.entity.PurchaseStorage;
import com.factory.entity.PurchaseStorageDetails;
import com.factory.mapper.PurchaseStorageDetailsMapper;
import com.factory.mapper.PurchaseStorageMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * - 业务逻辑层 - 采购入库（刘岂均）
 * @author south wind
 * @version v1.0 2020年2月5日 上午12:42:23
 * - 表/功能：
 */
@Service
public class Flqj_PurchaseStorageBiz {
	
	@Autowired
	private PurchaseStorageMapper dao;
	
	@Autowired
	private PurchaseStorageDetailsMapper detailsdao;

	//0.根据当前日期查询单据号码
	public String queryPSDocumentNumber(String psDocumentDate) {
		int count = dao.queryPSDocumentNumber("%" + psDocumentDate + "%")+1;
		String ptimecount = String.valueOf(count);
		String [] str = psDocumentDate.split("-");
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
	
	//采购入库 - 1.分页查询一条采购退货单据
    public PageInfo<PurchaseStorage> queryCDAll(PurchaseStorage record){
    	PageHelper.startPage(record.getPageNum(), record.getPageSize());
    	List<PurchaseStorage> cdList = dao.queryPSAll();
    	PageInfo<PurchaseStorage> page = new PageInfo<PurchaseStorage>(cdList); 
    	page.getList().get(0).setPsdList(detailsdao.queryPSDAll(page.getList().get(0).getPsDocumentNumber()));
    	return page;
    }

    //采购入库 - 2.新增
    public boolean insertPurchaseStorage(PurchaseStorage record) {
    	if(dao.insert(record) > 0) {
    		for (PurchaseStorageDetails tprd : record.getPsdList()) {
    			if(detailsdao.insert(tprd) <= 0) {
    				return false;
    			}
			}
    	}
    	return true;
    };

    //采购入库 - 3.删除
    public boolean deletePurchaseStorage(String psDocumentNumber) {
    	return dao.deleteByPrimaryKey(psDocumentNumber) > 0;
    };

    //采购入库 - 4.修改
    public boolean updatePurchaseStorage(PurchaseStorage record) {
    	if(dao.updateByPrimaryKey(record) > 0) {
    		for (PurchaseStorageDetails tprd : record.getPsdList()) {
    			if(detailsdao.updateByPrimaryKey(tprd) <= 0) {
    				return false;
    			}
			}
    	}
    	return dao.updateByPrimaryKey(record) > 0;
    };
	
	
	
	
}
