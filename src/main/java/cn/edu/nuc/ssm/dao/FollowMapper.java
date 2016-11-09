package cn.edu.nuc.ssm.dao;

import cn.edu.nuc.ssm.model.Follow;

public interface FollowMapper {
   
	
	/*-------------------放覆盖护体盾--------------------------*/

	int deleteByPrimaryKey(Integer followid);

    int insert(Follow record);

    int insertSelective(Follow record);

    Follow selectByPrimaryKey(Integer followid);

    int updateByPrimaryKeySelective(Follow record);

    int updateByPrimaryKey(Follow record);
    
    /*-------------------放覆盖护体盾--------------------------*/
}