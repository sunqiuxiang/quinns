package org.service;

import java.util.List;

import org.pojo.DzjUserCheck;

public interface IUserCheckService {
	public int register(DzjUserCheck djc);
	public List<DzjUserCheck> getall();
	public int delone(int checkid);
	public DzjUserCheck getone(int checkid);
}
