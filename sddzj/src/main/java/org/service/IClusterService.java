package org.service;

import java.util.List;

public interface IClusterService {
	public List<String> getHosts();
	public String getCpuState(String hostname);
	public String getMemState(String hostname);
	public String getDiskState(String hostname);
	public String getOverview();
	public String getDetails();
	
}
