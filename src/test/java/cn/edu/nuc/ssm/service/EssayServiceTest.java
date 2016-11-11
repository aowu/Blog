package cn.edu.nuc.ssm.service;

import java.io.IOException;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.edu.nuc.ssm.BaseTest;
import cn.edu.nuc.ssm.dto.PageInfo;
import cn.edu.nuc.ssm.model.Essay;
import cn.edu.nuc.ssm.service.interfaces.EssayService;

public class EssayServiceTest extends BaseTest {

	@Autowired
	private EssayService essayService;
	
	@Test
	public void selectEssay(){
		
		PageInfo pi = essayService.selectAllEssay(1, 1);
		
		System.out.println(pi.getList());
	}
	
	@Test
	public void insert(){
		int a = essayService.insertEssay("aowu",1, new Essay());
		System.out.println("测试："+a);
	}
	
	@Test
	public void selectbyid(){
		try {
			String aowu = essayService.sellectByEsyid(3);
			System.out.println(aowu);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
