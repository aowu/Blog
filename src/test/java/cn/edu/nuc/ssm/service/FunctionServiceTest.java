package cn.edu.nuc.ssm.service;

import java.util.List;

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
	
	@Test
	public void selectAllFunid(){
		
		List<Function> fun = functionService.selectAllFunid();
		System.out.println(fun);
	}
	
	@Test
	public void selectByRole(){
		List<Function> fun = functionService.selectByroleid(1);
		System.out.println(fun);
	}
	
}
