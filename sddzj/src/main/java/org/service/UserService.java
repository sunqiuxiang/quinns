package org.service;

import java.util.List;

import org.controller.DataController;
import org.log.Log4jForProjectLogger;
import org.mapper.DzjUserMapper;
import org.mapper.MdTasktableMapper;
import org.pojo.DzjUser;
import org.pojo.DzjUserExample;
import org.pojo.DzjUserExample.Criteria;
import org.pojo.MdTasktable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tools.Md5Util;


/**
 * 
 * @ file      UserService.java
 * @ function  TODO
 * @ author    quinns
 * @ date      2017年11月1日 下午9:13:24
 * @ version   2.0
 */
@Service("userService")
public class UserService implements IUserService{
	
	@Autowired
	private DzjUserMapper userMapper;
	@Autowired
	private MdTasktableMapper taskMapper;
	public DzjUser login(String username,String password) {
		DzjUserExample example = new DzjUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(username);
		criteria.andPasswordEqualTo(Md5Util.getMD5Str(password));
		List<DzjUser> list = userMapper.selectByExample(example);
		if (list.size()>0) {
			return list.get(0);
		}
		else {
			return null;
		}
		
	}

	public boolean update(DzjUser old, DzjUser now) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int username2id(String username) {
		DzjUserExample example = new DzjUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(username);
		List<DzjUser> list = userMapper.selectByExample(example);
		if (list.size()>0) {
			return list.get(0).getId();
		}else {
			return 0;
		}
	}

	@Override
	public String id2username(int userid) {
		DzjUserExample example = new DzjUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(userid);
		return userMapper.selectByExample(example).get(0).getUsername();
	}

	@Override
	public List<DzjUser> findall() {
		DzjUserExample example = new DzjUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdIsNotNull();
		return userMapper.selectByExample(example);
	}

	@Override
	public int adduser(DzjUser dj) {
		return userMapper.insert(dj);
	}

	@Override
	public List<DzjUser> getalladmin() {
		DzjUserExample example = new DzjUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andConstantidNotEqualTo(1);
		return userMapper.selectByExample(example);
	}

	@Override
	public DzjUser getuserbyid(int id) {
		DzjUserExample example = new DzjUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(id);
		return userMapper.selectByExample(example).size()>0?userMapper.selectByExample(example).get(0):null;
	}

	@Override
	public int updates(DzjUser user) {
		return userMapper.updates(user);
	}

	@Override
	public int check(String username) {
		DzjUserExample example = new DzjUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(username);
		return userMapper.selectByExample(example).size();
	}

	@Override
	public List<MdTasktable> shenhexiazai1(MdTasktable record) {
		return taskMapper.shenhexiazai1(record);
	}
	
	

}
