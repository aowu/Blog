package cn.edu.nuc.ssm.dao;

import cn.edu.nuc.ssm.model.Users;

public interface UsersMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
    
    Users selectByUsernum(String usernum);
}