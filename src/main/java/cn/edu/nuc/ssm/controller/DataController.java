package cn.edu.nuc.ssm.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.edu.nuc.ssm.model.Data;
import cn.edu.nuc.ssm.service.interfaces.DataService;
import cn.edu.nuc.ssm.util.FileOperateUtil;

@Controller
public class DataController {
	
	@Autowired
	private  DataService dataService;

	@RequestMapping(value="upload",method=RequestMethod.POST)
	public @ResponseBody String upload(
			HttpServletRequest request,
			HttpSession session
			){
		
		List<Data> list = null;
		int userid =1;
		int a =0;
		try {
			list = FileOperateUtil.upload(request);
			System.out.println(list+""+userid);
			a = dataService.insert(list,userid);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("controller"+a);
		return "OK";
	}
	
	
	@RequestMapping(value="upload",method=RequestMethod.GET)
	public String uploadtest(){
		
		
		return "upload/uploadtest";
	}
	
	@RequestMapping(value="download",method=RequestMethod.GET)
	public ResponseEntity<byte[]> download() throws IOException{
		
		Data data1 = new Data();
		data1.setDataurl("I:/upload/201611071051169523640393000.gif");
		ResponseEntity<byte[]> aowu = FileOperateUtil.download(data1);
		
		return aowu;
		
	}
	
	/*@RequestMapping(value="download",method=RequestMethod.GET)
	public String downloadtest(){
		
		return "upload/download";
	}*/
	
	
	
}
