package cn.edu.nuc.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.nuc.ssm.dao.CommentMapper;
import cn.edu.nuc.ssm.dao.ReplyMapper;
import cn.edu.nuc.ssm.dto.PageInfo;
import cn.edu.nuc.ssm.model.SuperComment;
import cn.edu.nuc.ssm.model.SuperReply;
import cn.edu.nuc.ssm.service.interfaces.SuperCommentService;

@Service
public class SuperCommentServiceImpl implements SuperCommentService {

	@Autowired
	private CommentMapper commentMapper;
	
	@Autowired
	private ReplyMapper replyMapper;
	
	
	
	public PageInfo superSelect(Integer userid, Integer current) {
		
		PageInfo pi = new PageInfo(current);
		int count = commentMapper.selectAllCount(userid);
		pi.setCount(count);
		
		/*接受评论*/
		List<SuperComment> listc = commentMapper.superSelectComment(userid, pi.getStart(), pi.getOffset());
		for(SuperComment sc : listc){
			
			/*抽取评论id*/
			Integer re = sc.getCommentid();
			
			/*通过评论id查回复*/
			List<SuperReply> listr = replyMapper.SuperSelectReply(re);
			System.out.println(listr);
			/*将回复注入评论对象*/
			sc.setReplys(listr);
			
		}
		pi.setList(listc);
		return pi;
	}

}
