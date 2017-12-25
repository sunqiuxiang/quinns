package org.service;

import java.util.List;

import org.pojo.Mdtz;

public interface ITzService {
	public List<Mdtz> getTzByuuid(String twuuid);
}
