package cn.edu.nuc.ssm.service.interfaces;

import java.util.List;

import cn.edu.nuc.ssm.dto.PageInfo;
import cn.edu.nuc.ssm.model.Essay;

public interface EssayService {

	

	PageInfo selectAllEssay(Integer userid, Integer current);
}
