package cn.edu.nuc.ssm.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.nuc.ssm.dao.FtorMapper;
import cn.edu.nuc.ssm.dao.FunctionMapper;
import cn.edu.nuc.ssm.model.Ftor;
import cn.edu.nuc.ssm.model.Function;
import cn.edu.nuc.ssm.service.interfaces.FunctionService;

@Service
public class FunctionServiceImpl implements FunctionService {

	@Autowired
	private FunctionMapper functionMapper;
	
	@Autowired
	private FtorMapper ftorMapper;
	@Override
	public Function selectByFunid(Integer funid) {
		
		Function fun = functionMapper.selectByFunid(funid);
		
		return fun;
	}
	
	@Override
	public List<Function> selectAllFunid() {
		
		List<Function> fun = functionMapper.selectALLFunid();
		System.out.println(fun);
		
		return fun;
	}

	@Override
	public List<Function> selectByroleid(Integer roleid) {
		
		List<Ftor> listb = ftorMapper.selectByRoleid(roleid);
		System.out.println("listb:"+listb);
		List<Function> lista = new ArrayList<Function>();
		System.out.println(listb.size());
		for(Ftor ftor : listb){
			
			Function fun = selectByFunid(ftor.getFunid());
			
			lista.add(fun);
		}
		
		return lista;
	}
	
	

}
