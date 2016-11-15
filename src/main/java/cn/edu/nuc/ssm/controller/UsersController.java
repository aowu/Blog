package cn.edu.nuc.ssm.controller;



import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.edu.nuc.ssm.model.Roles;
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
	public String login(
			Users user,
			HttpSession session
			){
		try{
			Users usera = usersService.login(user.getUsernum(), user.getUserpas());
			session.setAttribute("user", usera);
			Users userc = (Users) session.getAttribute("user");
			System.out.println(userc);
			return "redirect:/"+usera.getUserid()+"/home";
		} catch(Exception e){
			e.printStackTrace();
		}
		return "redirect:users/login";
	}
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String home(){
		return "home";
	}
	
	
	
	@RequestMapping(value="/{userid}/showusers", method=RequestMethod.GET)
	public String showRoles(){
		
		return "users/users";
	}
	
	@RequestMapping(value="/{userid}/getusers", method=RequestMethod.POST)
	public @ResponseBody List<Users> showRoles(
			@PathVariable("userid") int userid
			){
		
		List<Users> list = usersService.selectAllUser();
		return list;
	}
	
	
	
	
}
