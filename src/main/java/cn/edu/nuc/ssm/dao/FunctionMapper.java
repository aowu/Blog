package cn.edu.nuc.ssm.dao;

import java.util.List;

import cn.edu.nuc.ssm.model.Function;

public interface FunctionMapper {
    

	int deleteByPrimaryKey(Integer funid);

    int insert(Function record);

    int insertSelective(Function record);

    Function selectByFunid(Integer funid);

    int updateByPrimaryKeySelective(Function record);

    int updateByPrimaryKey(Function record);
    
	List<Function> selectALLFunid();
}