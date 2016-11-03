package cn.edu.nuc.ssm.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.nuc.ssm.dao.UsersMapper;
import cn.edu.nuc.ssm.exception.LoginException;
import cn.edu.nuc.ssm.model.Users;
import cn.edu.nuc.ssm.service.interfaces.UsersService;

@Service
public class UsersServiceImpl implements UsersService {

	private transient Logger log = LoggerFactory.getLogger(UsersServiceImpl.class);
	
	@Autowired
	private UsersMapper usersMapper;
	
	@Override
	public Users login(String usernum, String userpas) {
		
		log.debug("账号{}尝试登录，密码{}",usernum,userpas);
		
		Users user = usersMapper.selectByUsernum(usernum);
		if(user == null || (! userpas.equals(user.getUserpas()))){
			log.error("{}账号登录错误",usernum);
			
			throw new LoginException("用户名或密码错误");
		}
		
		log.info("{}帐号登录成功!", usernum);
		return user;
	}

}
