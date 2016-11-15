package cn.edu.nuc.ssm.dao;

import java.util.List;

import cn.edu.nuc.ssm.model.Ftor;

public interface FtorMapper {
    
	
	/*-------------------放覆盖护体盾--------------------------*/

	int deleteByPrimaryKey(Integer ftorid);

    int insert(Ftor record);

    int insertSelective(Ftor record);

    Ftor selectByPrimaryKey(Integer ftorid);

    int updateByPrimaryKeySelective(Ftor record);

    int updateByPrimaryKey(Ftor record);
    
    List<Ftor> selectByRoleid(Integer roleid);
    
    /*-------------------放覆盖护体盾--------------------------*/
}