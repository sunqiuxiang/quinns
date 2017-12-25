package org.service;

import java.util.List;

import org.mapper.MdTasktableMapper;
import org.pojo.MdTasktable;
import org.pojo.MdTasktableExample;
import org.pojo.MdTasktableExample.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("tasktableService")
public class TaskTableService implements ITaskTableService{
	@Autowired
	private MdTasktableMapper tTaskTableMapper;

	@Override
	public List<MdTasktable> shenhexiazaitz(String taizhen) {
		System.out.println(taizhen);
//	MdTasktableExample example = new MdTasktableExample();
//	Criteria criteria = example.createCriteria();
//	criteria.andReviewedEqualTo("0");
//	criteria.andTaizhenEqualTo(taizhen);
//		List<MdTasktable> list = tTaskTableMapper.selectByExample(example);
//		System.out.println("service:"+list.size());
		List<MdTasktable> list = tTaskTableMapper.shenhexiazaitz(taizhen);
		return list;
	}
	
	@Override
	public int addtask(MdTasktable mtt) {
		return tTaskTableMapper.insert(mtt);
	}

	@Override
	public int shenpixiazai(MdTasktable record) {
		return tTaskTableMapper.shenpixiazai(record);
	}

	@Override
	public List<MdTasktable> finduuid1(MdTasktable record) {
		return tTaskTableMapper.finduuid1(record);
	}

	@Override
	public MdTasktable getByid(int id) {
		return tTaskTableMapper.selectByPrimaryKey(id);
	}

	@Override
	public int update(MdTasktable newtasktable) {
		return tTaskTableMapper.updateByPrimaryKey(newtasktable);
	}

	@Override
	public int countsums(MdTasktable mtk) {
		MdTasktableExample example = new MdTasktableExample();
		Criteria criteria = example.createCriteria();
		criteria.andFilepathIsNull()
				.andReviewedEqualTo("1")
				.andApplynameEqualTo(mtk.getApplyname())
				.andApplytimeEqualTo(mtk.getApplytime());
		return tTaskTableMapper.selectByExample(example).size();
	}

	@Override
	public List<MdTasktable> checks(String applyname, String applytime) {
		MdTasktableExample example = new MdTasktableExample();
		Criteria criteria = example.createCriteria();
		criteria.andReviewedEqualTo("1")
				.andApplynameEqualTo(applyname)
				.andApplytimeEqualTo(applytime)
				.andFilepathIsNotNull()
				.andFilepathNotEqualTo("");
		return tTaskTableMapper.selectByExample(example);
	}

	@Override
	public int updates(MdTasktable newtasktable) {
		return tTaskTableMapper.update22(newtasktable);
	}

	@Override
	public int xiazaidead() {
		return tTaskTableMapper.xiazaidead();
	}

	@Override
	public List<MdTasktable> xiazailishi(MdTasktable record) {
		return tTaskTableMapper.xiazailishi(record);
	}

	@Override
	public List<MdTasktable> xiazailishi1(MdTasktable record) {
		return tTaskTableMapper.xiazailishi1(record);
	}

	@Override
	public int downloads(MdTasktable record) {
		return tTaskTableMapper.downloads(record);
	}


	
}
