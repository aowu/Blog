package cn.edu.nuc.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.nuc.ssm.dao.DataMapper;
import cn.edu.nuc.ssm.model.Data;
import cn.edu.nuc.ssm.service.interfaces.DataService;

@Service
public class DataServiceImpl implements DataService {
	
	@Autowired
	private DataMapper dataMapper;

	@Override
	public int insert(List<Data> list, int userid) {
		
		Data data = null;
		int a = 0;
		for(int i=0 ;i<list.size();i++){
			data = list.get(i);
			System.out.println(data.getDataname());
			data.setUserid(userid);
			a = dataMapper.insert(data);
		}
		
		return a;
	}

	@Override
	public List<Data> selectByUserid(Integer userid) {
		
		List<Data> list = dataMapper.selectByUserid(userid);
		return list;
	}
	
	@Override
	public Data selectByDataid(Integer dataid) {
		
		Data  data = dataMapper.selectByPrimaryKey(dataid);
		return data;
	}

}
