package cn.edu.nuc.ssm.controller;

import java.io.IOException;

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
public class EssayController {

	@Autowired
	private EssayService essayService;
	
	//分页查看文章列表
	@RequestMapping(value="/{userid}/essay",method=RequestMethod.GET)
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
	
	/**
	 * 文章添加
	 * @param userid
	 * @param session
	 * @param request
	 * @param model
	 * @return
	 */
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
			
			return "redirect:/"+userid+"/home/type";
			
	}
	
	/**
	 * 文章添加GET
	 * @return
	 */
	@RequestMapping(value="/{userid}/addessay",method=RequestMethod.GET)
	public String cktest1(){
		
		return "Essay/editor";
	}
	
	/**
	 * 文章展示
	 * @param userid
	 * @param esyid
	 * @param session
	 * @return
	 */
	@RequestMapping(value="/{userid}/{esyid}/essay/showeesyinfo",method=RequestMethod.GET)
	public String showessayinfo(
			@PathVariable("userid") int userid,
			@PathVariable("esyid") int esyid,
			HttpSession session,
			Model model
			){
			String esyinfo = null;
			try {
				esyinfo = essayService.sellectByEsyid(esyid);
				System.out.println("controller:"+esyinfo);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			model.addAttribute("esyinfo", esyinfo);
			return "Essay/show";
	}
	
	/**
	 * 文章修改编辑器跳转处
	 * @param userid
	 * @param esyid
	 * @param session
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/{userid}/{esyid}/essay/updateesyinfo",method=RequestMethod.GET)
	public String updateessayinfo(
			@PathVariable("userid") int userid,
			@PathVariable("esyid") int esyid,
			HttpSession session,
			Model model
			){
			String esyinfo = null;
			try {
				esyinfo = essayService.sellectByEsyid(esyid);
				System.out.println(esyinfo);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			model.addAttribute("esyinfo", esyinfo);
			
			return "Essay/updateEssay";
	}
	
	/**
	 * 更新文章内容
	 * @param userid
	 * @param esyid
	 * @param session
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/{userid}/{esyid}/essay/updateesyinfo",method=RequestMethod.POST)
	public String updateessayinfotofile(
			@PathVariable("userid") int userid,
			@PathVariable("esyid") int esyid,
			HttpSession session,
			HttpServletRequest request,
			Model model
			){
			String esyinfo = request.getParameter("content");
			
			try {
				essayService.updateByEsyinfo(esyid, esyinfo);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "redirect:/1/"+esyid+"/essay/showeesyinfo";
	}
	
	/**
	 * 更新文章属性
	 * @param userid
	 * @param esyid
	 * @param session
	 * @param essay
	 * @return
	 */
	@RequestMapping(value="/{userid}/{esyid}/essay/updateessay",method=RequestMethod.POST)
	public String updateessay(
			@PathVariable("userid") int userid,
			@PathVariable("esyid") int esyid,
			HttpSession session,
			Essay essay
			){
			System.out.println("updateessay"+essay);
			essayService.updateEssay(essay);
			
			return "Essay/Essay";
			
	}
	
	@RequestMapping(value="/{userid}/{esyid}/essay/updateessay",method=RequestMethod.GET)
	public String updateessayget(
			@PathVariable("userid") int userid,
			@PathVariable("esyid") int esyid,
			HttpSession session,
			Model model
			){
			model.addAttribute("esyid", esyid);
			
			return "Essay/updateEssayNoUrl";
	}
	
	/**
	 * 返回文章属性
	 * @param userid
	 * @param esyid
	 * @param session
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/{userid}/{esyid}/getessay",method=RequestMethod.POST)
	public @ResponseBody Essay getessay(
			@PathVariable("userid") int userid,
			@PathVariable("esyid") int esyid,
			HttpSession session,
			Model model
			){
			Essay essay = essayService.sellectByEsyidEssay(esyid);
			System.out.println(essay);
			return essay;
	}
	
	
	
	/**
	 * 测试
	 * @return
	 */
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public String cktest(){
		
		return "redirect:/ckeditor/samples/index.html";
	}
	
	
}
