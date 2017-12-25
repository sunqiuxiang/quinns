package org.mapper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.model.Host;
import org.springframework.stereotype.Repository;
import org.tools.DBUtils;


@Repository
public class ClusterDao {
	
	
	
//	public List<String> getHosts(){
//		Connection connection = null;
//		PreparedStatement statement = null;
//		ResultSet resultSet = null;
//		ArrayList<String> list = new ArrayList<>();
//		 try {
//			connection = DBUtils.getConnection();
//			statement = connection.prepareStatement("select hostname from md_monitor");
//			resultSet = statement.executeQuery();
//			while(resultSet.next()){
//				list.add(resultSet.getString(1));
//			}
//			resultSet.close();
//			statement.close();
//			connection.close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally{
//			if(resultSet != null){
//				try {
//					resultSet.close();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}finally{
//					if(resultSet != null){
//						resultSet = null;
//					}
//				}
//			}
//			if(statement != null){
//				try {
//					statement.close();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}finally{
//					if(statement != null){
//						statement = null;
//					}
//				}
//			}
//			if(connection != null){
//				try {
//					connection.close();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}finally{
//					if(connection != null){
//						connection = null;
//					}
//				}
//			}
//		}
//		 return list;
//		
//	}
	
//	public Map<String,String> getCpuState(String hostname){
//		Connection connection = null;
//		HashMap<String,String> result = new HashMap<>();
//		PreparedStatement statement = null;
//		ResultSet resultSet = null;
//		try {
//			connection = DBUtils.getConnection();
//			statement = connection.prepareStatement("select cpu_usage from md_monitor where hostname = ?");
//			statement.setString(1, hostname);
//			resultSet = statement.executeQuery();
//			while(resultSet.next()){
//				result.put("CPU_USAGE", resultSet.getString(1)) ;
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally{
//			if(resultSet != null){
//				try {
//					resultSet.close();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}finally{
//					if(resultSet != null){
//						resultSet = null;
//					}
//				}
//			}
//			if(statement != null){
//				try {
//					statement.close();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}finally{
//					if(statement != null){
//						statement = null;
//					}
//				}
//			}
//			if(connection != null){
//				try {
//					connection.close();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}finally{
//					if(connection != null){
//						connection = null;
//					}
//				}
//			}
//		}
//		return result;
//	}
	
	public Map<String,String> getMemState(String hostname){
		Connection connection = null;
		HashMap<String,String> result = new HashMap<>();
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		try {
			connection = DBUtils.getConnection();
			statement = connection.prepareStatement("select mem_usage,mem_total,mem_used from md_monitor where hostname = ?");
			statement.setString(1, hostname);
			resultSet = statement.executeQuery();
			while(resultSet.next()){
				result.put("MEM_USAGE", resultSet.getString(1)) ;
				result.put("MEM_TOTAL", resultSet.getString(2)) ;//float --> String,防止科学技术法
				result.put("MEM_USED", resultSet.getString(3)) ;//float --> String,防止科学技术法
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(resultSet != null){
				try {
					resultSet.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					if(resultSet != null){
						resultSet = null;
					}
				}
			}
			if(statement != null){
				try {
					statement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					if(statement != null){
						statement = null;
					}
				}
			}
			if(connection != null){
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					if(connection != null){
						connection = null;
					}
				}
			}
		}
		return result;
	}
	
	public Map<String,String> getDiskState(String hostname){
		Connection connection = null;
		HashMap<String,String> result = new HashMap<>();
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		try {
			connection = DBUtils.getConnection();
			statement = connection.prepareStatement("select disk_usage,disk_total,disk_used from md_monitor where hostname = ?");
			statement.setString(1, hostname);
			resultSet = statement.executeQuery();
			while(resultSet.next()){
				result.put("DISK_USAGE", resultSet.getString(1)) ;
				result.put("DISK_TOTAL", resultSet.getString(2)) ;//float --> String,防止科学技术法
				result.put("DISK_USED", resultSet.getString(3)) ;//float --> String,防止科学技术法
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(resultSet != null){
				try {
					resultSet.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					if(resultSet != null){
						resultSet = null;
					}
				}
			}
			if(statement != null){
				try {
					statement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					if(statement != null){
						statement = null;
					}
				}
			}
			if(connection != null){
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					if(connection != null){
						connection = null;
					}
				}
			}
		}
		return result;
	}
	
	public Map<String,String> getOverview(){
		Map<String, String> overviewMap = new HashMap<>();
		String sql = "select  avg(cpu_usage)  ,sum(mem_used) / sum(mem_total) ,sum(mem_total)-sum(mem_used),sum(disk_used) / sum(disk_total) ,sum(disk_total) - sum(disk_used) ,sum(mem_used),sum(mem_total),sum(disk_used),sum(disk_total) from md_monitor;";
		ResultSet resultSet;
		try(
			Connection connection = DBUtils.getConnection();
			PreparedStatement statement = connection.prepareStatement(sql);
		){
			resultSet = statement.executeQuery();
			while(resultSet.next()){
				overviewMap.put("cpuUsage", resultSet.getString(1));
				overviewMap.put("memUsage", resultSet.getString(2));
				overviewMap.put("memSurplus", resultSet.getString(3));
				overviewMap.put("diskUsage", resultSet.getString(4));
				overviewMap.put("diskSurplus", resultSet.getString(5));
				overviewMap.put("memUsed", resultSet.getString(6));
				overviewMap.put("memTotal", resultSet.getString(7));
				overviewMap.put("diskUsed", resultSet.getString(8));
				overviewMap.put("diskTotal", resultSet.getString(9));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return overviewMap;
	}
	

	public List<Host> getHostDetails() {
		// TODO Auto-generated method stub
		List<Host> list = new ArrayList<>();
		String sql = "select * from md_monitor";
		ResultSet resultSet = null;
		try(
			Connection connection = DBUtils.getConnection();
			PreparedStatement statement = connection.prepareStatement(sql);
		){
			resultSet = statement.executeQuery();
			while(resultSet.next()){
				Host host = new Host();
				host.setHostname(resultSet.getString(1));
				host.setIp(resultSet.getString(2));
				host.setCpuUsage(resultSet.getString(3));
				host.setMemUsed(resultSet.getString(5));
				host.setMemTotal(resultSet.getString(4));
				host.setDiskUsed(resultSet.getString(8));
				host.setDiskTotal(resultSet.getString(7));
				list.add(host);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(resultSet!=null){
				try {
					resultSet.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					if(resultSet!=null){
						resultSet = null;
					}
				}
			}
		}
		return list;
	}
	
}
