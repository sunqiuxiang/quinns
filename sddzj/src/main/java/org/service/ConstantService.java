package org.service;

import java.util.List;

import org.log.Log4jForProjectLogger;
import org.mapper.DzjConstantMapper;
import org.pojo.DzjConstant;
import org.pojo.DzjConstantExample;
import org.pojo.DzjConstantExample.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("constantService")
public class ConstantService implements IConstantService{
	
	@Autowired
	private DzjConstantMapper consMapper;

	@Override
	public DzjConstant id2rolename(int id) {
		return consMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<DzjConstant> getlist() {
		DzjConstantExample example = new DzjConstantExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdIsNotNull();
		return consMapper.selectByExample(example);
	}

	@Override
	public String getrolelist(int power) {
		DzjConstantExample example = new DzjConstantExample();
		Criteria criteria = example.createCriteria();
		criteria.andPowerlevelGreaterThanOrEqualTo(power);
		List<DzjConstant> list = consMapper.selectByExample(example);
		if (list.size()>0) {
			String ret = "";
			for (int i = 0; i < list.size(); i++) {
				ret+=list.get(i).getRolename()+" ";
			}
			return ret;
		}else {
			return "";
		}
	}

	@Override
	public int getpower(int consid) {
		return consMapper.selectByPrimaryKey(consid).getPowerlevel();
	}
	

}
