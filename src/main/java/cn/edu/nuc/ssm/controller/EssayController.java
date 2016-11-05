package cn.edu.nuc.ssm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.edu.nuc.ssm.dto.PageInfo;
import cn.edu.nuc.ssm.model.Essay;
import cn.edu.nuc.ssm.service.interfaces.EssayService;

@Controller
@RequestMapping("/u")
public class EssayController {

	@Autowired
	private EssayService essayService;
	
	//分页查看文章列表
	@RequestMapping(value="/{userid}/home",method=RequestMethod.GET)
	public String essay(
			@PathVariable("userid") int userid,
			@RequestParam(name="current",defaultValue="1") int current,
			HttpSession session, 
			Model model
			){
		/*Users user = (Users)session.getAttribute("user");
		if(user == null || user.getUserid()!=userid){
			return "redirect:/login";
		}*/
		PageInfo pi = essayService.selectAllEssay(userid, current);
		model.addAttribute("pi", pi);
		System.out.println("pageinfo:"+pi);
		return "Essay/Essay";
		
	}
	//写入输出测试
	@RequestMapping(value="/{userid}/addessaytest",method=RequestMethod.POST)
	public @ResponseBody String addessaytest(
			@PathVariable("userid") int userid,
			HttpSession session,
			HttpServletRequest request,
			Model model
			){
			String a = request.getParameter("content");
			return a;
	}
	
	@RequestMapping(value="/{userid}/addessay",method=RequestMethod.POST)
	public String addessay(
			@PathVariable("userid") int userid,
			HttpSession session,
			HttpServletRequest request,
			Model model
			){
			Essay essay = new Essay();
			String a = request.getParameter("content");
			String esyname = request.getParameter("esyname");
			essay.setEsyname(esyname);
			essayService.insertEssay(a, userid, essay);
			
			return "redirect:/u/"+userid+"/home";
			
	}
	
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public String cktest(){
		
		return "redirect:/ckeditor/samples/index.html";
	}
	
	@RequestMapping(value="/test1",method=RequestMethod.GET)
	public String cktest1(){
		
		return "Essay/editor";
	}
	
	
}
