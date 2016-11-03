package cn.edu.nuc.ssm.dao;

import cn.edu.nuc.ssm.model.Ftor;

public interface FtorMapper {
    int deleteByPrimaryKey(Integer ftorid);

    int insert(Ftor record);

    int insertSelective(Ftor record);

    Ftor selectByPrimaryKey(Integer ftorid);

    int updateByPrimaryKeySelective(Ftor record);

    int updateByPrimaryKey(Ftor record);
}