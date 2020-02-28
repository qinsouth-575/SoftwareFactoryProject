package com.factory.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.factory.entity.Ordbillstyle;
import com.factory.entity.OrdbillstyleExample;
import com.factory.mapper.OrdbillstyleMapper;

@Service
public class Flqj_OrdbillstyleBiz {
	
	@Autowired
	public OrdbillstyleMapper dao;
	
	public List<Ordbillstyle> queryOBSthreeAll(Ordbillstyle obs){
		OrdbillstyleExample example = new OrdbillstyleExample();
		example.createCriteria().andFlagEqualTo(obs.getFlag());
		return dao.selectByExample(example);
	}
	
	//尚未继续开发
	
	
	
}
