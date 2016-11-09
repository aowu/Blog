package cn.edu.nuc.ssm.service;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.edu.nuc.ssm.BaseTest;
import cn.edu.nuc.ssm.dto.PageInfo;
import cn.edu.nuc.ssm.model.Comment;
import cn.edu.nuc.ssm.model.SuperComment;
import cn.edu.nuc.ssm.service.interfaces.CommentService;
import cn.edu.nuc.ssm.service.interfaces.SuperCommentService;

public class CommentServiceTest extends BaseTest {

	@Autowired
	private CommentService commentService;
	
	@Autowired
	private SuperCommentService aowu;
	
	@Test
	public void selectALLTest(){
		
		PageInfo pi = commentService.selectAllComment(1, 1);
		
		List<Comment> list = (List<Comment>) pi.getList();
		
		System.out.println(list);
	}
	
	@Test
	public void selectsuper(){
		PageInfo pi = aowu.superSelect(1, 1);
		
		List<SuperComment> list = (List<SuperComment>) pi.getList();
		
		System.out.println(list);
		
	}
	
}
