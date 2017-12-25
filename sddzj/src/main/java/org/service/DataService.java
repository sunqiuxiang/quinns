package org.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.mapper.MdTaizhenMapper;
import org.pojo.MdTaizhen;
import org.pojo.MdTaizhenExample;
import org.pojo.MdTaizhenExample.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bingh.filemanager.HDFSFile;
import com.bingh.filemanager.HDFSFileManager;
import com.bingh.utils.PropsUtils;

@Service("dataService")
public class DataService implements IDataService{
	@Autowired MdTaizhenMapper dataMapper;
//	public void addTask(Task task){
//		dataDao.addTask(task);
//	}
//	public List<Task> getTaskList(){
//		List<Task> list = dataDao.getList();
//		return list;
//	}
//	
//	public List<Task> getTaskListUnderway(){
//		List<Task> list = dataDao.getListUnderway();
//		return list;
//	}
//
//	public List<Task> getTaskListUnderway1(){
//		List<Task> list = dataDao.getListUnderway1();
//		return list;
//	}
//	
//	public List<Task> getTaskListApply(Task task){
//		List<Task> list = dataDao.getListApply(task);
//		return list;
//	}
//	
//	public SequenceInputStream getComputeResult(String taskID,String taskType){
//		String sql = "update t_task set reviewed = 3 where task_id = ?";
//		try(
//			Connection connection = DBUtils.getConnection();
//			PreparedStatement prepareStatement = connection.prepareStatement(sql);
//		){
//			prepareStatement.setInt(1, Integer.parseInt(taskID));
//			prepareStatement.executeUpdate();
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
//		Vector<InputStream> streams = dataDao.getResultInputStream(taskID, taskType);
//		Enumeration<InputStream> elements = streams.elements();
//		SequenceInputStream iss = new SequenceInputStream(elements);
//		return iss;
//	}
//	
	public boolean checkComput(String tz,String param,String start,String end,String taizhen,String uploadpath){
		boolean flag = true;
		List<String> dataFilePathes = createDataFilePathes(tz, param, start, end,taizhen,uploadpath);
		if(dataFilePathes == null || dataFilePathes.size() == 0){
			flag = false;
		}else
		{flag=false;
			for (String dataFilePath : dataFilePathes) {
				HDFSFileManager fileManager = new HDFSFileManager();
				if(fileManager.exists(new HDFSFile(dataFilePath))){
					flag=true;
					break;
				}
				/*flag = flag && fileManager.exists(new HDFSFile(dataFilePath));*/
			}
		}
		return flag;
	}
	
	public List<String> createDataFilePathes(String tz,String param,String start,String end,String taizhen,String uploadpath){
		List<String> list = new ArrayList<>();
//		String partPath = PropsUtils.getPartPath("partpath");
		String partPath = "hdfs://10.37.181.32:8020/user/hdfs/";
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
		try {
			Date startData = format.parse(start);
			Date endData = format.parse(end);
			long longStartData = startData.getTime();
			long longEndData = endData.getTime();
			long hours = (long) (((longEndData - longStartData) * 1.0 / (1000*60*60)));
			for(int i = 1;i<=hours;i++){
				Calendar calendar = Calendar.getInstance();
				calendar.setTime(new Date(longStartData));
				String path = partPath+uploadpath + "SD." + tz + "." + calendar.get(Calendar.YEAR) + "." + calendar.get(Calendar.DAY_OF_YEAR) + "." + calendar.get(Calendar.HOUR_OF_DAY) + "." + param + "." + "txt";
				System.out.println();
				list.add(path);
				longStartData += 1000*60*60;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
//	
//	
//	public List<String> getUserPower(String Type,String DepID) {
//		List<String> list = new ArrayList<>();
//		ResultSet resultSet = null;
//		if("3".equals(Type)){
//			return Arrays.asList("1","2","3");
//		}
//		String sql = "select Authority from md_seconduser where DepID = ?";
//		try(
//			Connection connection = DBUtils.getConnection();
//			PreparedStatement prepareStatement = connection.prepareStatement(sql);
//		){
//			prepareStatement.setString(1, DepID);
//			resultSet = prepareStatement.executeQuery();
//			while(resultSet.next()){
//				list.add(resultSet.getString(1));
//			}
//		}catch(Exception e){
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
//		}
//		return list;
//	}


	public List<MdTaizhen> getTaizhenPower() {
		MdTaizhenExample example = new MdTaizhenExample();
		example.setOrderByClause("id");
		return dataMapper.selectByExample(example);
	}
	public List<MdTaizhen> getAllTaizhen() {
		MdTaizhenExample example = new MdTaizhenExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdIsNotNull();
		return dataMapper.selectByExample(example);
	}


@Override
public MdTaizhen getonetaizhen(int taizhenid) {
	return dataMapper.selectByPrimaryKey(taizhenid);
}
}
