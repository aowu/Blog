package cn.edu.nuc.ssm.service.interfaces;

import cn.edu.nuc.ssm.dto.PageInfo;
import cn.edu.nuc.ssm.model.Reply;

public interface ReplyService {

	PageInfo selectAllReply(Integer commentid, Integer current);
	
	int insertNoReplyid(Reply record);
}
