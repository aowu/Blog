package cn.edu.nuc.ssm.service.interfaces;

import java.io.IOException;
import java.util.List;

import cn.edu.nuc.ssm.dto.PageInfo;
import cn.edu.nuc.ssm.model.Essay;

public interface EssayService {


	PageInfo selectAllEssay(Integer userid, Integer current);
	
	String sellectByEsyid(Integer esyid) throws IOException;

	int insertEssay(String esyinfo, Integer userid, Essay record);

	void updateByEsyinfo(Integer esyid, String esyinfo) throws IOException;

	Integer updateEssay(Essay record);
	
	Essay sellectByEsyidEssay(Integer esyid);
}
