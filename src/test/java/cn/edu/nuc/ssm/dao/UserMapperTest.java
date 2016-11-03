package cn.edu.nuc.ssm.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.edu.nuc.ssm.BaseTest;
import cn.edu.nuc.ssm.model.Users;

public class UserMapperTest extends BaseTest {
	
	@Autowired
	private UsersMapper usersMapper;

	@Test
	public void selectusers(){
		
		Users user =  usersMapper.selectByPrimaryKey(1);
		System.out.println(user);
	}
}
