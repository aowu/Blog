package cn.edu.nuc.ssm.dao;

import cn.edu.nuc.ssm.modle.Function;

public interface FunctionMapper {
    int deleteByPrimaryKey(Integer funid);

    int insert(Function record);

    int insertSelective(Function record);

    Function selectByPrimaryKey(Integer funid);

    int updateByPrimaryKeySelective(Function record);

    int updateByPrimaryKey(Function record);
}