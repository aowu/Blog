package cn.edu.nuc.ssm.service;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.edu.nuc.ssm.BaseTest;
import cn.edu.nuc.ssm.dto.PageInfo;
import cn.edu.nuc.ssm.model.Reply;
import cn.edu.nuc.ssm.service.interfaces.ReplyService;

public class ReplyServiceTest extends BaseTest {

	@Autowired
	private ReplyService replyService;
	
	@Test
	public void selectAllTest(){
		
		PageInfo pi = replyService.selectAllReply(1, 1);
		
		List<?> list =pi.getList();
		
		System.out.println(list);
	}
}
