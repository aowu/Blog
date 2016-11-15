package cn.edu.nuc.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.edu.nuc.ssm.model.Function;
import cn.edu.nuc.ssm.model.Users;
import cn.edu.nuc.ssm.service.interfaces.FunctionService;
import cn.edu.nuc.ssm.service.interfaces.UsersService;

@Controller
public class FunctionController {
	
	@Autowired
	private FunctionService functionService; 
	
	@Autowired
	private UsersService usersService;
	
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
	
	/**
	 * 获得功能列表
	 * @param userid
	 * @param session
	 * @return
	 */
	@RequestMapping(value="/{userid}/getfunction", method=RequestMethod.POST)
	public @ResponseBody List<Function> getAllFunidw(
			@PathVariable("userid") int userid,
			HttpSession session,
			Model model
			){
		
		List<Function> fun = functionService.selectAllFunid();
		System.out.println("controller"+fun);
		model.addAttribute("userid",userid);
		return fun;
	}
	
	@RequestMapping(value="/{userid}/showfunction", method=RequestMethod.GET)
	public String showfunction(
			@PathVariable("userid") int userid
			){
		
		return "Function/function";
		
	}
	
	
	@RequestMapping(value="/{userid}/home", method=RequestMethod.GET)
	public  String getAllFunid(
			@PathVariable("userid") int userid,
			HttpSession session,
			Model model
			){
		
		
		Users userc = (Users)session.getAttribute("user");
		System.out.println("function"+userc);
		Users user = usersService.selectByUserid(userid);
		
		List<Function> fun = new ArrayList<Function>();
		if(userc.getUserid().equals(user.getUserid())){
			
			fun = functionService.selectByroleid(user.getRoleid());
			model.addAttribute("function", fun);
			model.addAttribute("userid",userid);
			return "home";
		}else{
			return "error";
		}
		
		
		
		
		
	}
	
	
	
	

}
