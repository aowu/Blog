package cn.edu.nuc.ssm.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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

	@RequestMapping(value="/{userid}/upload",method=RequestMethod.POST)
	public @ResponseBody String upload(
			@PathVariable("userid") int userid,
			HttpServletRequest request,
			HttpSession session
			){
		
		List<Data> list = null;
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
	
	
	@RequestMapping(value="/{userid}/upload",method=RequestMethod.GET)
	public String uploadtest(
			@PathVariable("userid") int userid,
			Model model
			){
		model.addAttribute("userid", userid);
		return "upload/uploadtest";
	}
	
	@RequestMapping(value="/{dataid}/down",method=RequestMethod.GET)
	public ResponseEntity<byte[]> download(
			@PathVariable("dataid") int dataid
			) throws IOException{
		
		
		Data data = dataService.selectByDataid(dataid);
		
		ResponseEntity<byte[]> aowu = FileOperateUtil.download(data);
		
		return aowu;
		
	}
	
	@RequestMapping(value="/{userid}/download",method=RequestMethod.GET)
	public String downloadtest(
			@PathVariable("userid") int userid,
			Model model
			){
		model.addAttribute("userid", userid);
		return "upload/dowload";
	}
	
	
	
	@RequestMapping(value="/{userid}/getdownload",method=RequestMethod.POST)
	public @ResponseBody List<Data> getupload(
			@PathVariable("userid") int userid,
			HttpSession session
			){
		
		List<Data> list = dataService.selectByUserid(userid);
		
		
		return list;
	}
	
	
	
}
