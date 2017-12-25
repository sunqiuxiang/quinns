package org.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.mapper.ClusterDao;
import org.mapper.MdMonitorMapper;
import org.pojo.MdMonitor;
import org.pojo.MdMonitorExample;
import org.pojo.MdMonitorExample.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.org.apache.regexp.internal.RE;

@Service("clusterService")
public class ClusterService implements IClusterService{
	@Autowired
	private MdMonitorMapper mdMonitorMapper;
	
	public List<String> getHosts(){
		MdMonitorExample example = new MdMonitorExample();
		Criteria criteria = example.createCriteria();
		criteria.andHostnameIsNotNull();
	    List<MdMonitor> list = mdMonitorMapper.selectByExample(example);
	    List<String> result = new ArrayList<>();
		for (MdMonitor mdMonitor : list) {
			result.add(mdMonitor.getHostname());
		}
		return result;
	}
	
	public String getCpuState(String hostname){
		String result = "";
		MdMonitorExample example = new MdMonitorExample();
		Criteria criteria = example.createCriteria();
		criteria.andHostnameEqualTo(hostname);
		List<MdMonitor> list = mdMonitorMapper.selectByExample(example);
		if (list.size()>0) {
			result = "{\'SUCCESS\':\'true\',\'CPU_USAGE\':\'"+list.get(0).getCpuUsage()+"\'}";
		}else {
			result = "{\'SUCCESS\':\'false\'}";
		}
		return result;
	}
	
	public String getMemState(String hostname){
		String result = "";
		MdMonitorExample example = new MdMonitorExample();
		Criteria criteria = example.createCriteria();
		criteria.andHostnameEqualTo(hostname);
		List<MdMonitor> list = mdMonitorMapper.selectByExample(example);
		if (list.size()>0) {
			result = "{\'SUCCESS\':\'true\',\'MEM_USAGE\':\'"+list.get(0).getMemUsage()+"\',\'MEM_TOTAL\':\'"+list.get(0).getMemTotal()+"\',\'MEM_USED\':\'"+list.get(0).getMemUsed()+"\'}";
		}else {
			result = "{\'SUCCESS\':\'false\'}";
		}
		return result;
	}
	
	public String getDiskState(String hostname){
		String result = "";
		MdMonitorExample example = new MdMonitorExample();
		Criteria criteria = example.createCriteria();
		criteria.andHostnameEqualTo(hostname);
		List<MdMonitor> list = mdMonitorMapper.selectByExample(example);
		if (list.size()>0) {
			result = "{\'SUCCESS\':\'true\',\'DISK_USAGE\':\'"+list.get(0).getDiskUsage()+"\',\'DISK_TOTAL\':\'"+list.get(0).getDiskTotal()+"\',\'DISK_USED\':\'"+list.get(0).getDiskUsed()+"\'}";
		}else {
			result = "{\'SUCCESS\':\'false\'}";
		}
		return result;
	}
	
	public String getOverview(){
		String result = "";
		MdMonitorExample example = new MdMonitorExample();
		Criteria criteria = example.createCriteria();
		criteria.andHostnameIsNotNull();
		List<MdMonitor> list = mdMonitorMapper.selectByExample(example);
		
		if (list.size()>0) {
			double cpusum = 0;
			double memusedsum = 0;
			double memtotalsum = 0;
			double disktotalsum = 0;
			double diskusedsum = 0;
			for (int i = 0; i < list.size(); i++) {
				cpusum+=Double.parseDouble(list.get(i).getCpuUsage());
				memusedsum+=Double.parseDouble(list.get(i).getMemUsed().toString().trim());
				memtotalsum+=Double.parseDouble(list.get(i).getMemTotal().toString().trim());
				diskusedsum+=Double.parseDouble(list.get(i).getDiskUsed().toString().trim());
				disktotalsum+=Double.parseDouble(list.get(i).getDiskTotal().toString().trim());
			}
			
			String cpuUsage = (cpusum/list.size())+"";
			String memUsage = (memusedsum/memtotalsum)+"";
			String memSurplus = (memtotalsum/memusedsum)+"";
			String diskUsage = (diskusedsum/disktotalsum)+"";
			String diskSurplus = (disktotalsum/diskusedsum)+"";;
			String memUsed = memusedsum+"";
			String memTotal = memtotalsum+"";
			String diskUsed = diskusedsum+"";
			String diskTotal = disktotalsum+"";
			
			result = "{"
					+ "\'SUCCESS\':\'true\',"
					+ "\'CPU_USAGE\':\'"+cpuUsage+"\',"
					+ "\'MEM_USAGE\':\'"+memUsage+"\',"
					+ "\'MEM_SUR\':\'"+memSurplus+"\',"
					+ "\'DISK_USAGE\':\'"+diskUsage+"\',"
					+ "\'DISK_SUR\':\'"+diskSurplus+"\',"
					+ "\'MEM_USED\':\'"+memUsed+"\',"
					+ "\'MEM_TOTAL\':\'"+memTotal+"\',"
					+ "\'DISK_USED\':\'"+diskUsed+"\',"
					+ "\'DISK_TOTAL\':\'"+diskTotal+"\'"
					+ "}";
			}else {
			result = "{\'SUCCESS\':\'false\'}";
		}
		return result;
	}
	

	public String getDetails() {
		MdMonitorExample example = new MdMonitorExample();
		Criteria criteria = example.createCriteria();
		criteria.andHostnameIsNotNull();
		List<MdMonitor> list = mdMonitorMapper.selectByExample(example);
		
		String result = "{\'HOSTS\':[";
		for (MdMonitor host : list) {
			result += "{";
			result += "\'HOSTNAME\':\'"+host.getHostname()+"\',";
			result += "\'IP\':\'"+host.getIp()+"\',";
			result += "\'CPU_USAGE\':\'"+host.getCpuUsage()+"\',";
			result += "\'MEM_USED\':\'"+host.getMemUsed()+"\',";
			result += "\'MEM_TOTAL\':\'"+host.getMemTotal()+"\',";
			result += "\'DISK_USED\':\'"+host.getDiskUsed()+"\',";
			result += "\'DISK_TOTAL\':\'"+host.getDiskTotal()+"\'";
			result += "},";
		}
		result = result.substring(0, result.length() - 1);
		result += "]}";
		return result;
	}
}
