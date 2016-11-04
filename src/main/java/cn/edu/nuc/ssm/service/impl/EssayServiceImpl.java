package cn.edu.nuc.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.nuc.ssm.dao.EssayMapper;
import cn.edu.nuc.ssm.dto.PageInfo;
import cn.edu.nuc.ssm.model.Essay;
import cn.edu.nuc.ssm.service.interfaces.EssayService;
@Service
public class EssayServiceImpl implements EssayService {

	@Autowired
	private EssayMapper essayMapper;
	
	@Override
	public PageInfo selectAllEssay(Integer userid,Integer current) {
		
		PageInfo pi = new PageInfo(current);
		int count = essayMapper.selectAllCount(userid);
		pi.setCount(count);
		
		List<Essay> list = essayMapper.selectAllEssay(userid, pi.getStart(), pi.getOffset());
		
		pi.setList(list);
		
		return pi;
	}

}
