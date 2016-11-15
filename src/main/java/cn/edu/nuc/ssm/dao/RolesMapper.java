package cn.edu.nuc.ssm.dao;

import java.util.List;

import cn.edu.nuc.ssm.model.Roles;

public interface RolesMapper {
   
	
	/*-------------------放覆盖护体盾--------------------------*/

	int deleteByPrimaryKey(Integer roleid);

    int insert(Roles record);

    int insertSelective(Roles record);

    Roles selectByPrimaryKey(Integer roleid);

    int updateByPrimaryKeySelective(Roles record);

    int updateByPrimaryKey(Roles record);
    
    List<Roles> selectAllRoles();
    
    /*-------------------放覆盖护体盾--------------------------*/
}