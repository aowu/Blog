package cn.edu.nuc.ssm.dao;

import cn.edu.nuc.ssm.modle.Userinfo;

public interface UserinfoMapper {
    int deleteByPrimaryKey(Integer infoid);

    int insert(Userinfo record);

    int insertSelective(Userinfo record);

    Userinfo selectByPrimaryKey(Integer infoid);

    int updateByPrimaryKeySelective(Userinfo record);

    int updateByPrimaryKey(Userinfo record);
}