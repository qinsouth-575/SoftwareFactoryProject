package com.factory.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.factory.entity.Ordbillstyle;
import com.factory.entity.OrdbillstyleExample;
import com.factory.mapper.OrdbillstyleMapper;

/**
 * - 业务逻辑层 - 类型 - 1.采购请购类型设定（Flag：3）		2.入库类型设定（Flag：6）	3.出库类型设定（Flag：7）
 * @author south wind
 * @version v1.0 2020年3月7日 下午2:11:19
 * - 表/功能：
 */
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
