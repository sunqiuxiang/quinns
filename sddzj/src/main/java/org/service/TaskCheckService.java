package org.service;

import java.util.List;

import org.mapper.TTaskCheckMapper;
import org.pojo.TTaskCheck;
import org.pojo.TTaskCheckExample;
import org.pojo.TTaskCheckExample.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("taskCheckService")
public class TaskCheckService implements ITaskCheckService{
	@Autowired
	private TTaskCheckMapper tTaskCheckMapper;

	@Override
	public List<TTaskCheck> getTaskList() {
		TTaskCheckExample task = new TTaskCheckExample();
		Criteria criteria = task.createCriteria();
		criteria.andTaskIdIsNotNull();
		return tTaskCheckMapper.selectByExample(task);
	}

	@Override
	public TTaskCheck getone(int taskId) {
		return tTaskCheckMapper.selectByPrimaryKey(taskId);
	}

	@Override
	public int add(TTaskCheck task) {
		return tTaskCheckMapper.insert(task);
	}

	@Override
	public int dele(int taskId) {
		return tTaskCheckMapper.deleteByPrimaryKey(taskId);
	}
	
	
}
