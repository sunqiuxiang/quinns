package org.service;

import java.util.List;

import org.mapper.DzjFunctionMapper;
import org.pojo.DzjFunction;
import org.pojo.DzjFunctionExample;
import org.pojo.DzjFunctionExample.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @ file      FuncService.java
 * @ function  TODO
 * @ author    quinns
 * @ date      2017年11月2日 下午2:04:06
 * @ version   1.0
 */
@Service("funcService")
public class FuncService implements IFuncService{
	@Autowired private DzjFunctionMapper funcMapper;

	public List<DzjFunction> getitem(int power) {
		System.out.println("power:"+power);
		DzjFunctionExample example = new DzjFunctionExample();
		
		Criteria criteria = example.createCriteria();
		criteria.andFuncpowerLessThanOrEqualTo(power);
		List<DzjFunction> list = funcMapper.selectByExample(example);
		System.out.println(list.size());
		return list;
	}

	@Override
	public List<DzjFunction> getlist() {
		DzjFunctionExample example = new DzjFunctionExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdIsNotNull();
		return funcMapper.selectByExample(example);
	}

	@Override
	public int updatepower(DzjFunction dj) {
		return funcMapper.updatepower(dj);
	}

	@Override
	public int getpower(int funcid) {
		return funcMapper.selectByPrimaryKey(funcid)!=null?funcMapper.selectByPrimaryKey(funcid).getFuncpower():0;
	}



}
