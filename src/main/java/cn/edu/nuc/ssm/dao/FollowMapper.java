package cn.edu.nuc.ssm.dao;

import cn.edu.nuc.ssm.modle.Follow;

public interface FollowMapper {
    int deleteByPrimaryKey(Integer followid);

    int insert(Follow record);

    int insertSelective(Follow record);

    Follow selectByPrimaryKey(Integer followid);

    int updateByPrimaryKeySelective(Follow record);

    int updateByPrimaryKey(Follow record);
}