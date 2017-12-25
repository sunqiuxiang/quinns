package org.service;

import java.util.List;

import org.mapper.DzjUserCheckMapper;
import org.pojo.DzjUserCheck;
import org.pojo.DzjUserCheckExample;
import org.pojo.DzjUserCheckExample.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tools.Md5Util;

@Service("userCheckService")
public class UserCheckService implements IUserCheckService{
	
	@Autowired
	private DzjUserCheckMapper usercheckMapper;

	@Override
	public int register(DzjUserCheck djc) {
		return usercheckMapper.insert(djc);
	}

	@Override
	public List<DzjUserCheck> getall() {
		DzjUserCheckExample example = new DzjUserCheckExample();
		Criteria criteria = example.createCriteria();
		criteria.andCheckidIsNotNull();
		return usercheckMapper.selectByExample(example);
	}

	@Override
	public int delone(int checkid) {
		return usercheckMapper.deleteByPrimaryKey(checkid);
	}

	@Override
	public DzjUserCheck getone(int checkid) {
		return usercheckMapper.selectByPrimaryKey(checkid);
	}
	

}
