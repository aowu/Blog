package cn.edu.nuc.ssm.service.interfaces;

import cn.edu.nuc.ssm.dto.PageInfo;

public interface ReplyService {

	PageInfo selectAllReply(Integer commentid, Integer current);
}
