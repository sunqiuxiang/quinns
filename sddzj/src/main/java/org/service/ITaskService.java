package org.service;

import java.util.List;

import org.pojo.TTask;
import org.pojo.TTaskCheck;

public interface ITaskService {
	public List<TTask> getTaskList();
	public TTask getone(int taskid);
	boolean updateres(TTask now);
	public int add(TTask task);
	public List<TTask> getlishi(int userid);
//	public List<TTask> getxz
}
