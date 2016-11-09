package cn.edu.nuc.ssm.dao;

import cn.edu.nuc.ssm.model.Userinfo;

public interface UserinfoMapper {
    
	/*-------------------放覆盖护体盾--------------------------*/

	int deleteByPrimaryKey(Integer infoid);

    int insert(Userinfo record);

    int insertSelective(Userinfo record);

    Userinfo selectByPrimaryKey(Integer infoid);

    int updateByPrimaryKeySelective(Userinfo record);

    int updateByPrimaryKey(Userinfo record);
    
    /*-------------------放覆盖护体盾--------------------------*/
}