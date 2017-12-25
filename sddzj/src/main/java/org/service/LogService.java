package org.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.mapper.TLogMapper;
import org.pojo.TLog;
import org.pojo.TLogExample;
import org.pojo.TLogExample.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("logService")
public class LogService implements ILogService{
	@Autowired private TLogMapper logMapper;

	@Override
	public int add(TLog log) {
		return logMapper.insert(log);
	}

	@Override
	public List<TLog> getlist() {
		TLogExample example = new TLogExample();
		Criteria criteria = example.createCriteria();
		criteria.andLogTimeIsNotNull();
		return logMapper.selectByExample(example);
	}

	@Override
	public List<TLog> query(String startTime,String endTime,String event,String userName) {
		TLogExample example = new TLogExample();
		Criteria criteria = example.createCriteria();
		if (!startTime.equals("")) {
			criteria.andLogTimeGreaterThanOrEqualTo(startTime);
		}
		if (!endTime.equals("")) {
			
			Calendar c = Calendar.getInstance();
			c.set(Integer.parseInt(endTime.split("-")[0]), Integer.parseInt(endTime.split("-")[1])-1, Integer.parseInt(endTime.split("-")[2]));
			c.add(Calendar.DATE, 1);
			criteria.andLogTimeLessThanOrEqualTo(new SimpleDateFormat ("yyyy-MM-dd").format(c.getTime()));
		}
		if (!event.equals("")) {
			criteria.andEventEqualTo(event);
		}
		if (!userName.equals("")) {
			criteria.andLogCreaterEqualTo(userName);
		}
		return logMapper.selectByExample(example);
	}

	@Override
	public List<String> distincts() {
		List<TLog> logs = logMapper.dist();
		List<String> ls = new ArrayList<>();
		for (int i = 0; i < logs.size(); i++) {
			ls.add(logs.get(i).getEvent());
		}
		return ls;
	}

	
}
