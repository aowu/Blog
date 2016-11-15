package cn.edu.nuc.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.edu.nuc.ssm.model.Roles;
import cn.edu.nuc.ssm.service.interfaces.RolesService;

@Controller
public class RolesController {

	@Autowired
	private RolesService rolesService;
	
	@RequestMapping(value="/{userid}/showroles", method=RequestMethod.GET)
	public String showRoles(){
		
		return "Roles/Roles";
	}
	
	@RequestMapping(value="/getroles", method=RequestMethod.POST)
	public @ResponseBody List<Roles> showRoles1(
			){
		
		List<Roles> list = rolesService.selectAllRoles();
		return list;
	}
	
}
