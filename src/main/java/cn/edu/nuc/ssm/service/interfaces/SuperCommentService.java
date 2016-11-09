package cn.edu.nuc.ssm.service.interfaces;

import cn.edu.nuc.ssm.dto.PageInfo;

public interface SuperCommentService {

	PageInfo superSelect(Integer userid, Integer current);
}
