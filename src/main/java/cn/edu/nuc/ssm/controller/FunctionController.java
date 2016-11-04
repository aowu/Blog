package cn.edu.nuc.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	
	@RequestMapping(value="/home/type", method=RequestMethod.GET)
	public String selectAllFunid(Model model){
		
		List<Function> fun = functionService.selectAllFunid();
		
		model.addAttribute("function", fun);
		
		return "home";
	}

}
