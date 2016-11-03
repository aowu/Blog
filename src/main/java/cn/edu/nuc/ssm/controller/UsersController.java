package cn.edu.nuc.ssm.controller;



import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.edu.nuc.ssm.model.Users;
import cn.edu.nuc.ssm.service.interfaces.UsersService;

@Controller
public class UsersController {

	@Autowired
	private UsersService usersService;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String forward(@ModelAttribute("user")Users user){
		return "users/login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(Users user, HttpSession session){
		
		try{
			usersService.login(user.getUsernum(), user.getUserpas());
			session.setAttribute("user", user);
			return "redirect:/u/"+user.getUsernum()+"/home";
		} catch(Exception e){
			e.printStackTrace();
		}
		return "redirect:users/login";
	}
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String home(){
		return "home";
	}
	
}
