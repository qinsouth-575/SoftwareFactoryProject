package com.factory.biz;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.factory.mapper.AdvancesReceivedMainYMapper;

@Service
public class gt_AdvancesReceivedMainYBiz {

	@Autowired
	private AdvancesReceivedMainYMapper dao;

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
}
