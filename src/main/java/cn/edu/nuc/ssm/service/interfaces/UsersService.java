package cn.edu.nuc.ssm.service.interfaces;

import cn.edu.nuc.ssm.model.Users;

public interface UsersService {

	/**
	 * 用户登录
	 * @return
	 */
	Users login(String usernum, String userpas);
}
