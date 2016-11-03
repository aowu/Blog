package cn.edu.nuc.ssm.service.interfaces;

import cn.edu.nuc.ssm.model.Function;

public interface FunctionService {

	/**
	 * byid搜功能
	 * @param funid 
	 * @return
	 */
	Function selectByFunid(Integer funid);
}
