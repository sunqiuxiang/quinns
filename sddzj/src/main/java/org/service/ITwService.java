package org.service;

import java.util.List;

import org.pojo.Mdtw;

public interface ITwService {
	
	
	public List<Mdtw> chaxunxiazai(Mdtw power);
	public List<Mdtw> chaxunxiazai1(Mdtw power);
	public List<Mdtw> chaxuntztaiwang(int taizhenid);
	public Mdtw getSecs(String uuid);
	public List<Mdtw> chaxuntaiwang();
}
