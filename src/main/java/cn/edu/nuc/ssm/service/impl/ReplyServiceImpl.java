package cn.edu.nuc.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.nuc.ssm.dao.ReplyMapper;
import cn.edu.nuc.ssm.dto.PageInfo;
import cn.edu.nuc.ssm.model.Reply;
import cn.edu.nuc.ssm.service.interfaces.ReplyService;

@Service
public class ReplyServiceImpl implements ReplyService {

	@Autowired
	private ReplyMapper replyMapper;
	@Override
	public PageInfo selectAllReply(Integer commentid, Integer current) {
		
		PageInfo pi = new PageInfo(current);
		int count = replyMapper.selectAllCount(commentid);
		pi.setCount(count);
		
		List<Reply> list = replyMapper.selectAllByCommentid(commentid, pi.getStart(), pi.getOffset());
		
		pi.setList(list);
		
		return pi;
		
	}

}
