package com.factory.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.factory.entity.ComwareHouse;
import com.factory.entity.ComwareHouseExample;
import com.factory.mapper.ComwareHouseMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * - 业务逻辑层 - 仓库类
 * @author south wind
 * @version v1.0 2020年2月21日 下午5:18:34
 * - 表/功能：
 */
@Service
public class Flqj_ComwareHouseBiz {
	
	@Autowired
	private ComwareHouseMapper dao;
	
	public List<ComwareHouse> queryCOMAll(ComwareHouse comwarehouse){
		return dao.selectByExample(null);
	}
	
	//仓库设定 - 1.分页查询一条仓库
    public PageInfo<ComwareHouse> queryCDAll(ComwareHouse record){
    	//ComwareHouseExample example = new ComwareHouseExample();
    	PageHelper.startPage(record.getPageNum(), record.getPageSize());
    	List<ComwareHouse> chList = dao.selectByExample(null);
    	PageInfo<ComwareHouse> page = new PageInfo<ComwareHouse>(chList);
    	return page;
    }

    //仓库设定 - 2.新增仓库
    public boolean insertComwareHouse(ComwareHouse record) {
    	return dao.insert(record) > 0;
    };

    //仓库设定 - 3.删除仓库
    public boolean deleteComwareHouse(String warehouseid) {
    	ComwareHouseExample example = new ComwareHouseExample();
    	example.createCriteria().andWarehouseidEqualTo(warehouseid);
    	return dao.deleteByExample(example) > 0;
    };

    //仓库设定 - 4.修改仓库
    public boolean updateComwareHouse(ComwareHouse record) {
    	ComwareHouseExample example = new ComwareHouseExample();
    	example.createCriteria().andWarehouseidEqualTo(record.getWarehouseid());
    	return dao.updateByExample(record, example) > 0;
    };
	
}
