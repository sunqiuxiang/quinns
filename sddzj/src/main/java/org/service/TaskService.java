package org.service;

import java.util.List;
import org.mapper.TTaskMapper;
import org.pojo.TTask;
import org.pojo.TTaskExample;
import org.pojo.TTaskExample.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("taskService")
public class TaskService implements ITaskService{
	@Autowired
	private TTaskMapper tTaskMapper;

	@Override
	public List<TTask> getTaskList() {
		TTaskExample task = new TTaskExample();
		Criteria criteria = task.createCriteria();
		criteria.andTaskIdIsNotNull();
		return tTaskMapper.selectByExample(task);
	}

	@Override
	public boolean updateres(TTask now) {
		tTaskMapper.updateByPrimaryKey(now);
		return false;
	}

	@Override
	public TTask getone(int taskId) {
		return tTaskMapper.selectByPrimaryKey(taskId);
	}

	@Override
	public int add(TTask task) {
		return tTaskMapper.insert(task);
	}

	@Override
	public List<TTask> getlishi(int userid) {
		TTaskExample example = new TTaskExample();
		Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(userid);
		return tTaskMapper.selectByExample(example);
	}
	
	
}
