package cn.edu.nuc.ssm.dao;

import cn.edu.nuc.ssm.model.Data;

public interface DataMapper {
	

	

	/*-------------------放覆盖护体盾--------------------------*/
    int deleteByPrimaryKey(Integer dataid);

    int insert(Data record);

    int insertSelective(Data record);

    Data selectByPrimaryKey(Integer dataid);

    int updateByPrimaryKeySelective(Data record);

    int updateByPrimaryKey(Data record);
    
    /*-------------------放覆盖护体盾--------------------------*/
}