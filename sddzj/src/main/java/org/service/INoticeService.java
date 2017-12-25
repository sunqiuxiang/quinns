package org.service;

import java.util.List;

import org.pojo.TNotice;

public interface INoticeService {
	public int add(TNotice tt);
	public List<TNotice> getlist();
	public TNotice getnoticeByuuid(String uuid);
}
