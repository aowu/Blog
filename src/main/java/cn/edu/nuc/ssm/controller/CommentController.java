package cn.edu.nuc.ssm.controller;

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
import cn.edu.nuc.ssm.model.Comment;
import cn.edu.nuc.ssm.service.interfaces.CommentService;
import cn.edu.nuc.ssm.service.interfaces.SuperCommentService;

@Controller
public class CommentController {

	@Autowired
	private CommentService commentService;
	
	@Autowired
	private SuperCommentService scs;
	
	/**
	 * 查看评论（以淘汰）
	 * @param userid
	 * @param current
	 * @param session
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/{userid}/CommentTest",method=RequestMethod.GET)
	public String commenttest(
			@PathVariable("userid") int userid,
			@RequestParam(name="current",defaultValue="1") int current,
			HttpSession session, 
			Model model
			){
		
		PageInfo pi = commentService.selectAllComment(userid, current);
		
		model.addAttribute("pi", "pi");
		
		return "Test/comment";
		
	}
	
	/**
	 * 返回评论表单
	 * @param userid
	 * @param current
	 * @param session
	 * @return
	 */
	@RequestMapping(value="/{userid}/comment",method=RequestMethod.POST)
	public @ResponseBody PageInfo comment(
			@PathVariable("userid") int userid,
			@RequestParam(name="current",defaultValue="1") int current,
			HttpSession session,
			Model model
			){
		
		PageInfo pi = scs.superSelect(userid, current);
		model.addAttribute("userid",userid);
		System.out.println(pi);
		return pi;
	}
	
	/**
	 * 查看评论
	 * @return
	 */
	@RequestMapping(value="/{userid}/commentTest",method=RequestMethod.GET)
	public String show(
			@PathVariable("userid") int userid,
			Model model
			){
		model.addAttribute("userid",userid);
		return "Test/Comment";
	}
	
	@RequestMapping(value="/{userid}/comment/insert",method=RequestMethod.POST)
	public String insert(
			@PathVariable("userid") int userid,
			Comment comment,
			HttpSession session
			){
		
		commentService.insertNoCommentid(comment);
		
		return "redirect:/"+userid+"/commentTest";
	}
	
	
	
}
