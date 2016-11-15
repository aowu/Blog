package cn.edu.nuc.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.nuc.ssm.dao.RolesMapper;
import cn.edu.nuc.ssm.model.Roles;
import cn.edu.nuc.ssm.service.interfaces.RolesService;

@Service
public class RolesServiceImpl implements RolesService {

	
	@Autowired
	private RolesMapper rolesMapper;
	@Override
	public List<Roles> selectAllRoles() {
		
		List<Roles> list = rolesMapper.selectAllRoles();
		return list;
	}

}
