package cn.edu.nuc.ssm.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.nuc.ssm.dao.CommentMapper;
import cn.edu.nuc.ssm.dto.PageInfo;
import cn.edu.nuc.ssm.model.Comment;
import cn.edu.nuc.ssm.service.interfaces.CommentService;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentMapper commentMapper;
	@Override
	public PageInfo selectAllComment(Integer userid, Integer current) {
		
		
		PageInfo pi = new PageInfo(current);
		int count = commentMapper.selectAllCount(userid);
		pi.setCount(count);
		
		List<Comment> list = commentMapper.selectByUserid(userid, pi.getStart(), pi.getOffset());
		
		pi.setList(list);
		
		return pi;
	}
	
	
	@Override
	public int selectAllCount(Integer userid) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int insertNoCommentid(Comment record) {
		
		Date date = new Date();
		record.setCommenttime(date);
		int a = commentMapper.insertNoCommentid(record);
		return a;
	}

}
