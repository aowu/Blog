package cn.edu.nuc.ssm.dao;

import cn.edu.nuc.ssm.model.Levmessage;

public interface LevmessageMapper {
    

	int deleteByPrimaryKey(Integer levmsgeid);

    int insert(Levmessage record);

    int insertSelective(Levmessage record);

    Levmessage selectByPrimaryKey(Integer levmsgeid);

    int updateByPrimaryKeySelective(Levmessage record);

    int updateByPrimaryKey(Levmessage record);
}