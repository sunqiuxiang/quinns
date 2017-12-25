package org.service;

import java.util.List;

import org.pojo.TLog;


public interface ILogService {
	public int add(TLog log);
	public List<TLog> getlist();
	public List<TLog> query(String startTime,String endTime,String event,String log_creater);
	public List<String> distincts();
}
