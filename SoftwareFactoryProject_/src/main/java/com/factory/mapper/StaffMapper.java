package com.factory.mapper;

import com.factory.entity.Customer;
import com.factory.entity.Staff;
import com.factory.entity.StaffExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StaffMapper {

    List<Integer> listRoleIdsByUserId(Integer id);
    
    Staff findUserByName(@Param("name")String name);
    
    Staff login(@Param("jobNumber")String jobNumber, @Param("password")String password);
    

    //查询账户密码登录
    Staff queryNameAndPwd(Staff account);
    
    
    //完成  销售报价单  业务人员   开窗取值--zp
    public List<Staff> queryyg(@Param("type") String type,@Param("name") String name);
    
    
	
	
    int countByExample(StaffExample example);

    int deleteByExample(StaffExample example);

    int deleteByPrimaryKey(Integer staffId);

    int insert(Staff record);

    int insertSelective(Staff record);

    List<Staff> selectByExample(StaffExample example);

    Staff selectByPrimaryKey(Integer staffId);

    int updateByExampleSelective(@Param("record") Staff record, @Param("example") StaffExample example);

    int updateByExample(@Param("record") Staff record, @Param("example") StaffExample example);

    int updateByPrimaryKeySelective(Staff record);

    int updateByPrimaryKey(Staff record);
    
    
	public List<Staff> selectstaff();

}