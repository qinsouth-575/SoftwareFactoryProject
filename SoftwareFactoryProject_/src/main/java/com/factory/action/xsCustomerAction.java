package com.factory.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.factory.biz.xsCustomer;
import com.factory.entity.Customer;

@Controller
@RequestMapping("/xscustomer")
public class xsCustomerAction {
	
		@Autowired
		private xsCustomer biz;
		
		//
		@RequestMapping(value = "xsquery",method = RequestMethod.POST)
		@ResponseBody
		public List<Customer> xsquery(){
			System.out.println("进入查询");
			return biz.xsquery();
		}
}
