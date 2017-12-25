package org.service;

import java.util.List;

import org.pojo.DzjUser;
import org.pojo.MdTasktable;

public interface IUserService {
	public DzjUser login(String username,String password);
	public boolean update(DzjUser old,DzjUser now);
	public int username2id(String username);
	public String id2username(int userid);
	public List<DzjUser> findall();
	public int adduser(DzjUser dj);
	public List<DzjUser> getalladmin();
	public DzjUser getuserbyid(int id);
	public int updates(DzjUser user);
	public int check(String username);
	public List<MdTasktable> shenhexiazai1(MdTasktable table);
}
