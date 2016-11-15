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
import cn.edu.nuc.ssm.model.Reply;
import cn.edu.nuc.ssm.service.interfaces.ReplyService;

@Controller
public class ReplyController {

	@Autowired
	private ReplyService replyService;
	
	@RequestMapping(value="/{commentid}/reply",method=RequestMethod.GET)
	public @ResponseBody PageInfo selectReply(
			@PathVariable("commentid") int commentid,
			@RequestParam(name="current",defaultValue="1") int current,
		
			HttpSession session
			){
		PageInfo pi = replyService.selectAllReply(commentid, current);
		
		System.out.println(pi);
		return pi;
	}
	
	@RequestMapping(value="/reply/insert",method=RequestMethod.POST)
	public String insertreply(
			Reply record,
			HttpSession session
			){
		
		replyService.insertNoReplyid(record);
		return "redirect:/commentTest";
	}
	
}
