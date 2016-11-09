package cn.edu.nuc.ssm.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.edu.nuc.ssm.BaseTest;
import cn.edu.nuc.ssm.model.Comment;
import cn.edu.nuc.ssm.model.SuperComment;

public class CommentMapperTest extends BaseTest {

	@Autowired
	private CommentMapper commentMapper;
	
	@Test
	public void selectAll(){
		
		List<Comment> list = commentMapper.selectByUserid(1, 0, 5);
		System.out.println(list);
	}
	
	@Test
	public void count(){
		
		int a = commentMapper.selectAllCount(1);
		System.out.println(a);
	}
	
	@Test
	public void superselect(){
		List<SuperComment> list = commentMapper.superSelectComment(1, 0, 5);
		System.out.println(list);
		
	}
}
