package org.service;

import java.util.List;

import org.pojo.DzjFunction;

public interface IFuncService {
	public List<DzjFunction> getitem(int power);
	public List<DzjFunction> getlist();
	public int updatepower(DzjFunction dj);
	public int getpower(int funcid);
}
