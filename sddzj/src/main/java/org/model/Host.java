package org.model;

public class Host {
	private String hostname;
	private String ip;
	private String cpuUsage;
	private String memTotal;
	private String memUsed;
	private String memUsage;
	private String diskTotal;
	private String diskUsed;
	private String diskUsage;
	public Host() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Host(String hostname, String ip, String cpuUsage, String memTotal, String memUsed, String memUsage, String diskTotal,
			String diskUsed, String diskUsage) {
		super();
		this.hostname = hostname;
		this.ip = ip;
		this.cpuUsage = cpuUsage;
		this.memTotal = memTotal;
		this.memUsed = memUsed;
		this.memUsage = memUsage;
		this.diskTotal = diskTotal;
		this.diskUsed = diskUsed;
		this.diskUsage = diskUsage;
	}
	public String getHostname() {
		return hostname;
	}
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getCpuUsage() {
		return cpuUsage;
	}
	public void setCpuUsage(String cpuUsage) {
		this.cpuUsage = cpuUsage;
	}
	public String getMemTotal() {
		return memTotal;
	}
	public void setMemTotal(String memTotal) {
		this.memTotal = memTotal;
	}
	public String getMemUsed() {
		return memUsed;
	}
	public void setMemUsed(String memUsed) {
		this.memUsed = memUsed;
	}
	public String getMemUsage() {
		return memUsage;
	}
	public void setMemUsage(String memUsage) {
		this.memUsage = memUsage;
	}
	public String getDiskTotal() {
		return diskTotal;
	}
	public void setDiskTotal(String diskTotal) {
		this.diskTotal = diskTotal;
	}
	public String getDiskUsed() {
		return diskUsed;
	}
	public void setDiskUsed(String diskUsed) {
		this.diskUsed = diskUsed;
	}
	public String getDiskUsage() {
		return diskUsage;
	}
	public void setDiskUsage(String diskUsage) {
		this.diskUsage = diskUsage;
	}
	@Override
	public String toString() {
		return "Host [hostname=" + hostname + ", ip=" + ip + ", cpuUsage=" + cpuUsage + ", memTotal=" + memTotal
				+ ", memUsed=" + memUsed + ", memUsage=" + memUsage + ", diskTotal=" + diskTotal + ", diskUsed="
				+ diskUsed + ", diskUsage=" + diskUsage + "]";
	}
	
	
}
