package cn.edu.nuc.ssm.service.interfaces;

import cn.edu.nuc.ssm.dto.PageInfo;
import cn.edu.nuc.ssm.model.Comment;

public interface CommentService {

	PageInfo selectAllComment(Integer userid, Integer current);
	
	int selectAllCount(Integer userid);
	
	int insertNoCommentid(Comment record);
}
