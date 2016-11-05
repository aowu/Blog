package cn.edu.nuc.ssm.service.impl;




import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
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

	/**
	 * 将文章key写入数据库
	 * 文章写入服务器
	 */
	public int insertEssay(
			String esyinfo,
			Integer userid,
			Essay esy) {
		
		//生成esyid
		int esyid = essayMapper.selectMaxEsyid();
		esyid++;
		//存入Essay对象并存入数据库
		Date now = new Date(); 
		System.out.println(now);
		esy.setEsyid(esyid);
		esy.setUserid(userid);
		esy.setEsytime(now);
		esy.setEsysta(1);
		//生成路径和文件
		String path = "I:/essay/"+esyid+".txt";
		esy.setEsyurl(path);
		int end = essayMapper.insert(esy);
		
		//BufferedWriter写入
			try {
				File file = new File(path);
				if(!file.exists()){
				file.createNewFile();
				}
				 FileWriter fw = new FileWriter(file.getAbsoluteFile());
				   BufferedWriter bw = new BufferedWriter(fw);
				   bw.write(esyinfo);
				   bw.flush(); 
				   bw.close();
				   fw.close();

	             System.out.println("Done");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return end;
	}

	@Override
	public String sellectByEsyid(Integer esyid) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
