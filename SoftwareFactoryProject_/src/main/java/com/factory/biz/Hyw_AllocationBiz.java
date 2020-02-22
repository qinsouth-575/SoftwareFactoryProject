package com.factory.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.factory.mapper.AllocationPrimaryBillMapper;

@Service
public class Hyw_AllocationBiz {

	@Autowired
	private AllocationPrimaryBillMapper mapper;
	
	
}
