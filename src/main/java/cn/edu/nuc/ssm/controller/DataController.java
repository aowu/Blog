package cn.edu.nuc.ssm.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.edu.nuc.ssm.util.FileOperateUtil;

@Controller
public class DataController {

	@RequestMapping(value="upload",method=RequestMethod.POST)
	public @ResponseBody String upload(
			HttpServletRequest request,
			HttpSession session
			){
		try {
			FileOperateUtil.upload(request);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "OK";
	}
	
	
	@RequestMapping(value="upload",method=RequestMethod.GET)
	public String uploadtest(){
		
		
		return "upload/uploadtest";
	}
	
}
