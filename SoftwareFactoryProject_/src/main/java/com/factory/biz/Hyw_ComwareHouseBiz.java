package com.factory.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.factory.entity.ComwareHouse;
import com.factory.mapper.ComwareHouseMapper;

@Service
public class Hyw_ComwareHouseBiz {

	@Autowired
	private ComwareHouseMapper mapper;
	
	//仓库设定 - 查询仓库信息
	public List<ComwareHouse> selectAll(ComwareHouse example){
		return mapper.selectAll(example);
	}
}
