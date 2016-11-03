package cn.edu.nuc.ssm.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.edu.nuc.ssm.BaseTest;
import cn.edu.nuc.ssm.model.Users;
import cn.edu.nuc.ssm.service.interfaces.UsersService;

public class UsersServiceTest extends BaseTest {

	@Autowired
	private UsersService usersService;
	
	@Test
	public void testLogin(){
		
		Users user = usersService.login("aowu", "123");
		System.out.println(user);
	}
		
		
	
}
