package org.service;

import java.util.List;

import org.pojo.MdTaizhen;



public interface IDataService {
	public List<MdTaizhen> getTaizhenPower();
	public List<MdTaizhen> getAllTaizhen();
	public MdTaizhen getonetaizhen(int taizhenid);
	public boolean checkComput(String tz, String parameter, String start, String end, String taizhen, String uploadpath);
}
