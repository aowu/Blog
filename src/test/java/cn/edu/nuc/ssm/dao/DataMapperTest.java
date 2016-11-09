package cn.edu.nuc.ssm.dao;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.edu.nuc.ssm.BaseTest;
import cn.edu.nuc.ssm.model.Data;

public class DataMapperTest extends BaseTest {

	@Autowired
	private DataMapper dataMapper;
	
	@Test
	public void test1(){
		
		Data data = new Data();
		data.setUserid(1);
		dataMapper.insert(data);
	}
	
	@Test
	public void test2(){
		
		Date date = new Date();
		System.out.println(date);
	}
}
