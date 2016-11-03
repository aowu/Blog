package cn.edu.nuc.ssm.dao;

import cn.edu.nuc.ssm.modle.Essay;

public interface EssayMapper {
    int deleteByPrimaryKey(Integer esyid);

    int insert(Essay record);

    int insertSelective(Essay record);

    Essay selectByPrimaryKey(Integer esyid);

    int updateByPrimaryKeySelective(Essay record);

    int updateByPrimaryKey(Essay record);
}