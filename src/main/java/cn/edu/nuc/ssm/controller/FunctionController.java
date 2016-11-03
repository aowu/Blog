package cn.edu.nuc.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import cn.edu.nuc.ssm.model.Function;
import cn.edu.nuc.ssm.service.interfaces.FunctionService;

@Controller
public class FunctionController {
	
	@Autowired
	private FunctionService functionService; 
	
	public Function selectByFunid(Integer funid){
		
		Function fun = functionService.selectByFunid(funid);
		
		return fun;
	}

}
