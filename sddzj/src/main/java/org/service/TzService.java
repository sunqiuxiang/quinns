package org.service;

import java.util.List;

import org.mapper.MdtzMapper;
import org.pojo.Mdtz;
import org.pojo.MdtzExample;
import org.pojo.MdtzExample.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 
 * @author quinn
 *
 */
@Service("tzService")
public class TzService implements ITzService{
	@Autowired private MdtzMapper tzMapper;

	@Override
	public List<Mdtz> getTzByuuid(String twuuid) {
		MdtzExample example = new MdtzExample();
		Criteria criteria = example.createCriteria();
		criteria.andTwUuidEqualTo(twuuid);
		return tzMapper.selectByExample(example);
	}



}
