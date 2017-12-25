package org.service;

import java.util.List;

import org.pojo.DzjConstant;


public interface IConstantService {
	public DzjConstant id2rolename(int id);
	public List<DzjConstant> getlist();
	public String getrolelist(int power);
	public int getpower(int consid);
}
