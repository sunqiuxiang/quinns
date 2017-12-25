package org.service;

import java.util.List;

import org.pojo.TTask;
import org.pojo.TTaskCheck;

public interface ITaskCheckService {
	public List<TTaskCheck> getTaskList();
	public TTaskCheck getone(int taskid);
	public int add(TTaskCheck task);
	public int dele(int taskid);
}
