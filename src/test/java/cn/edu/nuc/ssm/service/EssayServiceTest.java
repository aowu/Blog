package cn.edu.nuc.ssm.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.edu.nuc.ssm.BaseTest;
import cn.edu.nuc.ssm.dto.PageInfo;
import cn.edu.nuc.ssm.service.interfaces.EssayService;

public class EssayServiceTest extends BaseTest {

	@Autowired
	private EssayService essayService;
	
	@Test
	public void selectEssay(){
		
		PageInfo pi = essayService.selectAllEssay(1, 1);
		
		System.out.println(pi.getList());
	}
	
}
