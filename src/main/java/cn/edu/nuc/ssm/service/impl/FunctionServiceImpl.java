package cn.edu.nuc.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.nuc.ssm.dao.FunctionMapper;
import cn.edu.nuc.ssm.model.Function;
import cn.edu.nuc.ssm.service.interfaces.FunctionService;

@Service
public class FunctionServiceImpl implements FunctionService {

	@Autowired
	private FunctionMapper functionMapper;
	@Override
	public Function selectByFunid(Integer funid) {
		
		Function fun = functionMapper.selectByFunid(funid);
		
		return fun;
	}

}
