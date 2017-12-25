package org.service;

import java.util.List;

import org.mapper.MdtwMapper;
import org.pojo.Mdtw;
import org.pojo.MdtwExample;
import org.pojo.MdtwExample.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @ file      twService.java
 * @ function  TODO
 * @ author    quinns
 * @ date      2017年11月2日 下午2:04:06
 * @ version   1.0
 */
@Service("twService")
public class TwService implements ITwService{
	@Autowired private MdtwMapper twMapper;

	@Override
	public List<Mdtw> chaxunxiazai(Mdtw power) {
		return twMapper.chaxunxiazai(power);
	}

	@Override
	public List<Mdtw> chaxunxiazai1(Mdtw power) {
		return twMapper.chaxunxiazai1(power);
	}

	@Override
	public List<Mdtw> chaxuntztaiwang(int taizhenid) {
		MdtwExample example = new MdtwExample();
	    Criteria criteria = example.createCriteria();
	    criteria.andTaizhenEqualTo(taizhenid);
		return twMapper.selectByExample(example);
	}

	@Override
	public Mdtw getSecs(String uuid) {
		return twMapper.selectByPrimaryKey(uuid);
	}

	@Override
	public List<Mdtw> chaxuntaiwang() {
		return twMapper.chaxuntaiwang();
	}



}
