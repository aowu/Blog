package cn.edu.nuc.ssm.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.edu.nuc.ssm.BaseTest;
import cn.edu.nuc.ssm.model.Function;
import cn.edu.nuc.ssm.service.interfaces.FunctionService;

public class FunctionServiceTest extends BaseTest {

	@Autowired
	private FunctionService functionService;
	
	@Test
	public void selectByFunid(){
		
		Function fun = functionService.selectByFunid(1);
		
		System.out.println(fun);
		
	}
}
