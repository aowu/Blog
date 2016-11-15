package cn.edu.nuc.ssm.dao;

import java.util.List;

import cn.edu.nuc.ssm.model.Users;

public interface UsersMapper {
    
/*-------------------放覆盖护体盾--------------------------*/
	int deleteByPrimaryKey(Integer userid);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
    
    Users selectByUsernum(String usernum);
    
    List<Users> selectAllUser();
    
    /*-------------------放覆盖护体盾--------------------------*/
}