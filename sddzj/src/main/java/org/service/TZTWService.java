package org.service;

import java.util.List;

import org.mapper.TztwMapper;
import org.pojo.Tztw;
import org.pojo.TztwExample;
import org.pojo.TztwExample.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @author quinn
 *
 */
@Service("twtzService")
public class TZTWService implements ITZTWcService{
	@Autowired private TztwMapper tztwMapper;

	@Override
	public List<Tztw> getlist(int depID) {
		TztwExample example = new TztwExample();
		Criteria criteria = example.createCriteria();
		criteria.andTaizhenEqualTo(depID);
		return tztwMapper.selectByExample(example);
	}

	



}
