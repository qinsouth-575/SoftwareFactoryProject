package com.factory.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.factory.entity.AdvancesReceivedMain;
import com.factory.entity.AdvancesReceivedMainY;
import com.factory.mapper.AdvancesReceivedDetailsMapper;
import com.factory.mapper.AdvancesReceivedMainMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class Cgt_AdvancesReceivedMainBiz {
		@Autowired
		private AdvancesReceivedMainMapper dao;
		@Autowired
		private AdvancesReceivedDetailsMapper dao2;
		
		// 根据当前日期查询单据号码
		public String gt_select_payablestime(String payablestime) {
			int count = dao.gt_select_payablestime("%" + payablestime + "%")+1;
			
			String ptimecount = String.valueOf(count);
			String [] str = payablestime.split("-");
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
		
		public PageInfo<AdvancesReceivedMain> queryAdvancesReceivedMainYAllDESC(AdvancesReceivedMain record){
	    	PageHelper.startPage(record.getPageNum(), record.getPageSize());
	    	List<AdvancesReceivedMain> adrmList = dao.selectAdvancesReceivedMainAllDESC();
	    	PageInfo<AdvancesReceivedMain> page = new PageInfo<AdvancesReceivedMain>(adrmList);
	    	page.getList().get(0).setArd(dao2.gt_selectBypayables_id(page.getList().get(0).getPayablesId()));
	    	return page;
	    }
}
