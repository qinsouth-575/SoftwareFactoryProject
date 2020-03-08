package com.factory.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.factory.entity.Customer;
import com.factory.mapper.CustomerMapper;

@Service
public class xsCustomer {
				
				@Autowired
				private CustomerMapper dao;
				
				//销售订单
				public List<Customer> xsquery(){
					List<Customer> list=dao.xsquery();
					return list;
				}
}
