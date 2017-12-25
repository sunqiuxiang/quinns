package org.service;

import java.util.List;

import org.pojo.MdTasktable;

public interface ITaskTableService {
	public List<MdTasktable> shenhexiazaitz(String taizhen);
	public int addtask(MdTasktable mtt);
	public int shenpixiazai(MdTasktable record);
	public List<MdTasktable> finduuid1(MdTasktable record);
	public MdTasktable getByid(int id);
	public int update(MdTasktable newtasktable);
	public int updates(MdTasktable newtasktable);
	public int countsums(MdTasktable mtk);
	public List<MdTasktable> checks(String applyname,String applytime);
	public int xiazaidead();
	public List<MdTasktable> xiazailishi(MdTasktable record);
	public List<MdTasktable> xiazailishi1(MdTasktable record);
	public int downloads(MdTasktable record);
}
 