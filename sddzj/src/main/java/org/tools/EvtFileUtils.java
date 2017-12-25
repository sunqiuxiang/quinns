package org.tools;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.model.ConvertFile;
import org.model.Data;
import org.model.Head;
import org.model.Net;
import org.model.ReadFile;
import org.model.Sta;
import org.model.TWMetaInfo;
import org.model.TZMetaInfo;
import org.model.Task;
import org.model.EvtFile;
import org.pojo.MdFilepath;
import org.pojo.Mdtw;
import org.pojo.Mdtz;

import com.bingh.utils.PropsUtils;

/**
 * EvtFileUtils Evt文件工具类
 * @author lixiang
 *
 */
public class EvtFileUtils {
	//private static Log4jForProjectLogger logger = new Log4jForProjectLogger(EvtFileUtils.class);
	private static String[] cnameTemp=new String[]{null,null,null};
	/**
	 * 分离处理
	 * @param evtFile
	 * @return
	 */
	public static boolean partEvtFile(EvtFile evtFile,String path) throws Exception{
		
		System.gc();
		boolean flag = false;
        
		TWMetaInfo twMetaInfo = getTWMetaInfo(evtFile);
		saveTWMetaInfo(twMetaInfo,path);
		Map<String, List> tzData = getTZData(evtFile.getFilePath(), twMetaInfo.getStaNum(), twMetaInfo.getDataSec());
		saveTZMetaInfo(twMetaInfo,(List<TZMetaInfo>)tzData.get("tzMetaInfoList"),path);
		if(saveTZMetaInfo(twMetaInfo,(List<TZMetaInfo>)tzData.get("tzMetaInfoList"), path)==false)
		{
			deleteTWMetaInfo(twMetaInfo.getUuid());
		    File file = new File(evtFile.getFilePath());
		    file.delete();
		    return false;
		}
		/*System.out.print("(List<Data>)tzData.get(tzDataList)"+(List<Data>)tzData.get("tzDataList"));*/
		saveData(evtFile.getUuid(),(List<Data>)tzData.get("tzDataList"));
		File file = new File(evtFile.getFilePath());
		file.delete();
		return flag;
	}
	
	
	
	/**
	 * 找到台网下所以台站的path
	 * @param twUuid
	 * @param tz
	 * @param tw
	 * @return
	 */
	
	public static String mergeEvtFile(String twUuid,List<MdFilepath> tzfilepath,List<Mdtz> tz,Mdtw tw){
		System.out.println("mergeEvt");
		ArrayList<Sta> stas = new ArrayList<>();
		Net net = new Net();
		net.setUnkown1(0);
		net.setUnkown2("");
		ArrayList<byte[]> result = new ArrayList<>();
		String startDate = "";
		int datasec = 0;
		int staNum = 0;
		int starttime = 0;
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String createdFilePath = "";
		try{
			/*查询符合条件的记录*/
			//查询台网
				//组织台网信息
			System.out.println("try");
				net.setFlag(tw.getEvtflag());
				net.setType(tw.getType());
				net.setDoctype(tw.getDoctype());
				net.setTwname(tw.getTwname());
				net.setLat(tw.getLat());
				net.setLon(tw.getLon());
				net.setHei(tw.getHei());
				startDate = new SimpleDateFormat("yyyyMMddHHmmss").format(format.parse(tw.getStarttime()).getTime()) ;
				datasec = tw.getDatasec();
				System.out.println(startDate+"  "+datasec);
				Calendar calendar = Calendar.getInstance();
				calendar.setTime(format.parse(tw.getStarttime()));
				int year = calendar.get(calendar.YEAR);
				int dayOfYear = calendar.get(calendar.DAY_OF_YEAR);
				int hourOfDay = calendar.get(calendar.HOUR_OF_DAY);
				starttime =  (int) (getTimeLong(year, dayOfYear, hourOfDay, 0, 0,0) / 1000);
				System.out.println(starttime);
				
				//查询台站信息
				System.out.println("tzfilepath"+tzfilepath.size());
				System.out.println(tz.size());
				for (int i = 0; i < tz.size(); i++) {
					System.out.println("tz:"+i);
					//Sta sta = new Sta();
					Sta sta = new Sta();
					//查询路径
					System.out.println("if1");
						if(tzfilepath.get(i).getFiletype().endsWith("N")){
							sta.setDataN(readChanData(tzfilepath.get(i).getFilepath()));
						}else if(tzfilepath.get(i).getFiletype().endsWith("E")){
							sta.setDataE(readChanData(tzfilepath.get(i).getFilepath()));
						}else if(tzfilepath.get(i).getFiletype().endsWith("Z")){
							sta.setDataU(readChanData(tzfilepath.get(i).getFilepath()));
						}else if(tzfilepath.get(i).getFiletype().startsWith("U")){
							sta.setDataU(readChanData(tzfilepath.get(i).getFilepath()));
						}else if(tzfilepath.get(i).getFiletype().startsWith("N")){
							sta.setDataN(readChanData(tzfilepath.get(i).getFilepath()));
						}else if(tzfilepath.get(i).getFiletype().startsWith("E")){
							sta.setDataE(readChanData(tzfilepath.get(i).getFilepath()));
						}
					System.out.println("if2");
					//组织一个台站信息,数据
					sta.setStaId(tz.get(i).getStaid());
					sta.setStaName(tz.get(i).getStaname());
					sta.setDAtype(tz.get(i).getDatype());
					sta.setDAlen(Short.parseShort(tz.get(i).getDalen().toString()));
					sta.setV(tz.get(i).getV());
					sta.setSamp(tz.get(i).getSamp());
					sta.setStacom(tz.get(i).getStacom());
					sta.setBc(Short.parseShort(tz.get(i).getBc().toString()));
					sta.setTp(tz.get(i).getTp());
					sta.setChecktime(Short.parseShort(tz.get(i).getChecktime().toString()));
					sta.setTimetype(tz.get(i).getTimetype());
					sta.setSubtime(tz.get(i).getSubtime());
					sta.setStalat(tz.get(i).getStalat());
					sta.setStalon(tz.get(i).getStalon());
					sta.setShei(tz.get(i).getShei());
					sta.setUnkown1("");
					sta.setSwei(Short.parseShort(tz.get(i).getSwei().toString()));
					sta.setVmol(Short.parseShort(tz.get(i).getVmol().toString()));
					sta.setDmol(tz.get(i).getDmol());
					sta.setStype(tz.get(i).getStype());
					sta.setGfactorN(tz.get(i).getGfactorn());
					sta.setDgreeN(tz.get(i).getDgreen());
					sta.setUnkownN("");
					sta.setGfactorE(tz.get(i).getGfactore());
					sta.setDgreeE(tz.get(i).getDgreee());
					sta.setUnkownE("");
					sta.setGfactorU(tz.get(i).getGfactorz());
					sta.setDgreeU(tz.get(i).getDgreez());
					sta.setUnkownU("");
					sta.setCnameN(tz.get(i).getNcname());
					sta.setCnameE(tz.get(i).getEcname());
					sta.setCnameU(tz.get(i).getUcname());
					stas.add(sta);
					System.out.println("tz:"+i+"end");
				}
				staNum = stas.size();
				//stas.add(sta);
				//staNum = stas.size();
				System.out.println(111);
			// 生成台网卷头
			result.add(makeHead(net, staNum, starttime, datasec));
			System.out.println("——————台网头文件完毕——————");

			// 生成台站卷头
			for (int i = 0; i < stas.size(); i++) {
				result.add(makeStaHead(i, stas.get(i)));
			}
			result.add(setByteLength("", 4));
			System.out.println("——————台站头文件完毕——————");
			
			byte[] addData = addData(datasec, stas, result);
			createdFilePath = createEVTFile(addData,startDate);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return createdFilePath;
	}
	
	
	
	
	
	
	/**
	 * 保存台网元数据
	 * @param metaInfo
	 * @return
	 */
	public static boolean saveTWMetaInfo(TWMetaInfo twMetaInfo,String path){
		boolean flag = false;
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		Connection connection = null;
		PreparedStatement statement = null;
		System.out.println(twMetaInfo);
		
		
		List<Task> list = new ArrayList<>();
		String sql = "SELECT id,NAME,namev,uploadpath FROM md_taizhen where `uploadpath`=?";
		ResultSet resultSet = null;
		
		try(
			Connection connection1 = DBUtils.getConnection();
			PreparedStatement prepareStatement = connection1.prepareStatement(sql);
		){
			prepareStatement.setString(1,path);
			resultSet = prepareStatement.executeQuery();
			while(resultSet.next()){
				Task task = new Task();
				
				task.setId(Integer.parseInt(resultSet.getString(1)));
				task.setTaizhen(resultSet.getString(2));
				task.setTaizhenvalue(resultSet.getString(3));
				task.setUploadpath(resultSet.getString(4));
				list.add(task);
			}
		}catch(Exception e){
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
		}
		path=list.get(0).getTaizhen();
		
		
		
		String sql_tw = "insert into mdtw(uuid,evtflag,type,doctype,stasum,twname,lat,lon,hei,starttime,datasec,endtime,in_datetime,taizhen) value(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			connection = DBUtils.getConnection();
			statement = connection.prepareStatement(sql_tw);
			statement.setString(1,twMetaInfo.getUuid());
			statement.setString(2,twMetaInfo.getEvtFlag());
			statement.setString(3,twMetaInfo.getType());
			statement.setInt(4,twMetaInfo.getDocType());
			statement.setInt(5,twMetaInfo.getStaNum());
			statement.setString(6,twMetaInfo.getTwName().trim());
			statement.setFloat(7,twMetaInfo.getLat());
			statement.setFloat(8,twMetaInfo.getLon());
			statement.setFloat(9,twMetaInfo.getHei());
			statement.setString(10,twMetaInfo.getStartDate());
			statement.setInt(11,twMetaInfo.getDataSec());
			statement.setString(12, df.format(new Date(df.parse(twMetaInfo.getStartDate()).getTime() +  twMetaInfo.getDataSec() * 1000)));
			statement.setString(13,df.format(new Date()));
			statement.setString(14,path);
			int i =statement.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(statement != null){
				try {
					statement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					statement = null;
				}
			}
			if(connection != null){
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					connection = null;
				}
			}
		}
		return flag;
	}
	
	/**
	 * 保存台站元数据
	 * @param twMetaInfo 
	 * @param tzMetaInfoList 
	 */
	private static boolean saveTZMetaInfo(TWMetaInfo twMetaInfo, List<TZMetaInfo> tzMetaInfoList,String path) {
		// TODO Auto-generated method stub
		boolean flag = false;
		UUID staUUID = null;
		String twName = twMetaInfo.getTwName();
		String startDate = twMetaInfo.getStartDate();
		
		for (TZMetaInfo tzMetaInfo : tzMetaInfoList) 
		{
			System.out.println(tzMetaInfo);
			String staName = tzMetaInfo.getStaName().trim();
			
			if(staName==null||staName==""||staName.length()<1||tzMetaInfo.getNcname()==null||tzMetaInfo.getNcname()==""||tzMetaInfo.getEcname()==null||tzMetaInfo.getEcname()==""||tzMetaInfo.getUcname()==null||tzMetaInfo.getUcname()=="")
			{
				return false;
			}
		}
		
		
		for (TZMetaInfo tzMetaInfo : tzMetaInfoList) {
			System.out.println(tzMetaInfo +"名字"+tzMetaInfo.getStaName().trim());
			String staName = tzMetaInfo.getStaName().trim();
			String Ncname=tzMetaInfo.getNcname().trim();
			String Ecname=tzMetaInfo.getEcname().trim();
			String Ucname=tzMetaInfo.getUcname().trim();
			if(staName==null||staName==""||staName.length()<1||tzMetaInfo.getNcname()==null||tzMetaInfo.getNcname()==""||tzMetaInfo.getEcname()==null||tzMetaInfo.getEcname()==""||tzMetaInfo.getUcname()==null||tzMetaInfo.getUcname()=="")
			{
				return false;
			}
			
			Connection connection = null;
			staUUID = UUID.randomUUID();
			PreparedStatement statement = null;
			PreparedStatement filePathstatement = null;
			/*(uuid,tw_uuid,staid,staname,DAtype,DAlen,v,samp,stacom,bc,tp,checktime,timetype,subtime,"
					+ "stalat,stalon,shei,swei,vmol,dmol,stype,gfactore,gfactorn,gfactorz,dgreee,dgreen,dgreez,ncid,ecid,ucid,ncname,ecname,ucname) "*/
			try {
				String sql_tz = "insert into mdtz "
						+ "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				String sql_filepath = "insert into md_filepath values(?,?,?)";
				
				connection = DBUtils.getConnection();
				
				statement = connection.prepareStatement(sql_tz);
				
				statement.setString(1, staUUID.toString());
				statement.setString(2, twMetaInfo.getUuid());
				statement.setInt(3, tzMetaInfo.getStaid());
				statement.setString(4, tzMetaInfo.getStaName());
				statement.setString(5, tzMetaInfo.getDAtype());
				statement.setInt(6, tzMetaInfo.getDAlen());
				statement.setFloat(7, tzMetaInfo.getV());
				statement.setInt(8, tzMetaInfo.getSamp());
				statement.setInt(9, tzMetaInfo.getStacom());
				statement.setInt(10, tzMetaInfo.getBc());
				statement.setString(11, tzMetaInfo.getTp());
				statement.setInt(12, tzMetaInfo.getCheckTime());
				statement.setString(13, tzMetaInfo.getTimeType());
				statement.setFloat(14, tzMetaInfo.getSubTime());
				statement.setFloat(15, tzMetaInfo.getStalat());
				statement.setFloat(16, tzMetaInfo.getStalon());
				statement.setFloat(17, tzMetaInfo.getShei());
				statement.setInt(18, tzMetaInfo.getSwei());
				statement.setInt(19, tzMetaInfo.getVmol());
				statement.setInt(20, tzMetaInfo.getDmol());
				statement.setString(21, tzMetaInfo.getStype());
				statement.setFloat(22, tzMetaInfo.getEgfactor());
				statement.setFloat(23, tzMetaInfo.getNgfactor());
				statement.setFloat(24, tzMetaInfo.getUgfactor());
				statement.setInt(25, tzMetaInfo.getEdgree());
				statement.setFloat(26, tzMetaInfo.getNdgree());
				statement.setFloat(27, tzMetaInfo.getUdgree());
				statement.setInt(28, tzMetaInfo.getNcid());
				statement.setInt(29, tzMetaInfo.getEcid());
				statement.setInt(30, tzMetaInfo.getUcid());
				statement.setString(31, tzMetaInfo.getNcname());
				statement.setString(32, tzMetaInfo.getEcname());
				statement.setString(33, tzMetaInfo.getUcname());
				
				int executeUpdate = statement.executeUpdate();
				
				Map<String, String> paths = createPartFilePaths(twName, startDate, staName,path,Ncname,Ecname,Ucname);
			
				
				for (Map.Entry<String, String> entry : paths.entrySet()) {
					filePathstatement = connection.prepareStatement(sql_filepath);
					filePathstatement.setString(1, staUUID.toString());
					filePathstatement.setString(2, entry.getKey());
					filePathstatement.setString(3, entry.getValue());
					int r2 = filePathstatement.executeUpdate();
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				if(statement != null){
					try {
						
						statement.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}finally{
						statement = null;
					}
				}
				if(connection != null){
					try {
						
						connection.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}finally{
						connection = null;
					}
				}
			}
			
		}
		return true;
	}
	/**
	 * 保存观测数据
	 * @param list
	 * @return
	 */
	public static boolean saveData(String uuid,List<Data> list) {
		boolean flag = false;
		FSDataOutputStream eOutputStream = null;
		FSDataOutputStream uOutputStream = null;
		FSDataOutputStream nOutputStream = null;
		Connection connection = null;
		PreparedStatement statement = null;
		try{
			connection = DBUtils.getConnection();
			String sql = "select c.filepath from mdtw as a,mdtz as b,mdfilepath as c where a.uuid = b.tw_uuid and b.uuid = c.tz_uuid and a.uuid = ? and b.staid = ? and c.filetype = ?";
			ResultSet resultSet = null;
			FileSystem fileSystem = FileSystem.get(URI.create(PropsUtils.getUri("uri")), new Configuration(),PropsUtils.getUser("user"));
			System.out.println("uuid"+uuid);
			for (int i = 0;i<list.size();i++) {
				System.out.println("getStaid"+list.get(i).getStaid()+"");
				System.out.println("getEcname"+list.get(i).getEcname());
				
				statement = connection.prepareStatement(sql);
				statement.setString(1, uuid);
				statement.setString(2, list.get(i).getStaid()+"");
				//statement.setString(3, list.get(i).getStaName().split("/")[3].trim()+"E");
				statement.setString(3, list.get(i).getEcname().trim());
				System.out.print(statement);
				resultSet = statement.executeQuery();
				resultSet.next();
				String e_filePath = resultSet.getString(1);
				resultSet.close();
				statement.close();
				ArrayList<Double> el = list.get(i).e;
				eOutputStream = fileSystem.create(new Path(e_filePath));
			
				for (Double edata : el) {
					eOutputStream.write((edata+"\n").getBytes());
				}
				
				eOutputStream.close();
				
				statement = connection.prepareStatement(sql);
				statement.setString(1, uuid);
				statement.setString(2, list.get(i).getStaid()+"");
				//statement.setString(3, list.get(i).getStaName().split("/")[3].trim()+"Z");
				statement.setString(3, list.get(i).getUcname().trim());
				resultSet = statement.executeQuery();
				resultSet.next();
				String u_filePath = resultSet.getString(1);
				resultSet.close();
				statement.close();
				ArrayList<Double> ul = list.get(i).u;
				uOutputStream = fileSystem.create(new Path(u_filePath));
			
				for (Double udata : ul) {
					uOutputStream.write((udata+"\n").getBytes());
				}
				
				uOutputStream.close();
				
				statement = connection.prepareStatement(sql);
				statement.setString(1, uuid);
				statement.setString(2, list.get(i).getStaid()+"");
				//statement.setString(3, list.get(i).getStaName().split("/")[3].trim()+"N");
				statement.setString(3, list.get(i).getNcname().trim());
				resultSet = statement.executeQuery();
				resultSet.next();
				String n_filePath = resultSet.getString(1);
				resultSet.close();
				statement.close();
				ArrayList<Double> nl = list.get(i).n;
				nOutputStream = fileSystem.create(new Path(n_filePath));
			
				for (Double ndata : nl) {
					nOutputStream.write((ndata+"\n").getBytes());
				}
				
				nOutputStream.close();
			}
			flag = true;
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				if(eOutputStream != null){
					try {
						eOutputStream.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}finally{
						eOutputStream = null;
					}
				}
				if(uOutputStream != null){
					try {
						uOutputStream.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}finally{
						uOutputStream = null;
					}
				}
				if(nOutputStream != null){
					try {
						nOutputStream.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}finally{
						nOutputStream = null;
					}
				}
				if(connection!=null){
					try {
						connection.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}finally{
						connection = null;
					}
				}
			}
		
		return flag;
	}
	
	/**
	 * 获取台网元数据
	 * @param evtFile
	 * @return
	 * @throws Exception
	 */
	public static TWMetaInfo getTWMetaInfo(EvtFile evtFile) throws Exception{
		ConvertFile convert = new ConvertFile();
		File file = new File(evtFile.getFilePath());
		ReadFile read = new ReadFile();
		Head hd = new Head();
		TWMetaInfo twMetaInfo = new TWMetaInfo();
		twMetaInfo.setUuid(evtFile.getUuid());
		
		byte[] pos0 = read.readFilebyPos(file, 0, 16);
		String evtflag = new String(pos0);
		System.out.println("事件类型:" + evtflag);
		twMetaInfo.setEvtFlag(evtflag);
		
		byte[] pos16 = read.readFilebyPos(file, 16, 16);
		String type = new String(pos16);
		System.out.println("事件type:" + type);
		twMetaInfo.setType(type);
		
		// 32-35字节:long 文件记录类型
		byte[] pos33 = read.readFilebyPos(file, 32, 4);
		int doctype = convert.bytesToInt(pos33, 4);
		System.out.println("文件记录类型:" + doctype);
		twMetaInfo.setDocType(doctype);
		
		// 36-39字节:未知
		// byte[] pos33u = read.readFilebyPos(file, 36, 4);
		// int doctypeu = convert.bytesToInt(pos33u, 4);
		// System.out.println("weizhi类型:" + doctypeu);

		// 40-119字节:char 台网名称
		byte[] pos40 = read.readFilebyPos(file, 40, 80);
		String twname = new String(pos40);
		System.out.println("台网名称:" + twname);
		twMetaInfo.setTwName(twname);
		
		// 119-123字节:long 台网总数
		byte[] pos120 = read.readFilebyPos(file, 120, 4);
		int stasum = convert.bytesToInt(pos120, 4);
		hd.setStasum(stasum);
		System.out.println("台站总数:" + stasum);
		twMetaInfo.setStaNum(stasum);
		
		// 124-127字节:float台网中心纬度
		byte[] pos124 = read.readFilebyPos(file, 124, 4);
		float lat = convert.bytesToFloat(pos124);
		System.out.println("台网中心纬度:" + lat);
		twMetaInfo.setLat(lat);
		
		// 128-131字节:float台网中心经度
		byte[] pos128 = read.readFilebyPos(file, 128, 4);
		float lon = convert.bytesToFloat(pos128);
		System.out.println("台网中心经度:" + lon);
		twMetaInfo.setLon(lon);
		
		// 132-135字节:float台网中心经度
		byte[] pos132 = read.readFilebyPos(file, 132, 4);
		float hei = convert.bytesToFloat(pos132);
		System.out.println("台网中心高程:" + hei);
		twMetaInfo.setHei(hei);
		
		// 136-255:未知

		// 256-259:long 数据开始时间
		byte[] pos256 = read.readFilebyPos(file, 256, 4);
		int starttime = convert.bytesToInt(pos256, 4);
		System.out.println("数据开始时间:" + starttime);
		// 260-271:6个short 分别为数据开始的年、月、日、时、分、秒、
		byte[] pos260 = read.readFilebyPos(file, 260, 2);
		byte[] pos262 = read.readFilebyPos(file, 262, 2);
		byte[] pos264 = read.readFilebyPos(file, 264, 2);
		byte[] pos266 = read.readFilebyPos(file, 266, 2);
		byte[] pos268 = read.readFilebyPos(file, 268, 2);
		byte[] pos270 = read.readFilebyPos(file, 270, 2);
		int year = convert.bytesToInt(pos260, 2);
		hd.setYear(year);
		int month = convert.bytesToInt(pos262, 2);
		hd.setMonth(month);
		int date = convert.bytesToInt(pos264, 2);
		hd.setDate(date);
		int hour = convert.bytesToInt(pos266, 2);
		hd.setHour(hour);
		int min = convert.bytesToInt(pos268, 2);
		hd.setMin(min);
		int sec = convert.bytesToInt(pos270, 2);
		hd.setSec(sec);
		System.out.println("数据开始时间:" + year + "年" + month + "月" + date + "日" + hour + "时" + min + "分" + sec + "秒");
		twMetaInfo.setStartDate(""+year+"-"+month+"-"+date+" "+(hour < 10 ? "0"+hour : hour)+":"+(min < 10? "0"+min:min)+":"+(sec<10? "0"+sec:sec));
		
		// 272-275:long 记录长度（单位秒)
		byte[] pos272 = read.readFilebyPos(file, 272, 4);
		int datasec = convert.bytesToInt(pos272, 4);
		hd.setDatasec(datasec);
		System.out.println("记录长度（单位秒):" + datasec);
		twMetaInfo.setDataSec(datasec);
		
		return twMetaInfo;
	}
	
	/**
	 * 获取所有台站数据
	 * @param filepath
	 * @param stasum
	 * @param datasec
	 * @return tzMap tzMetaInfoList 为台站元数据list  datalist 为台站观测数据list
	 * @throws Exception
	 */
	/*public static Map<String,List> getTZData(String filepath, int stasum, int datasec) throws Exception{
		Map<String,List> tzMap = new HashMap<>();
		List<TZMetaInfo> tzMetaInfoList = new ArrayList<>();
		List<Data> datalist = new ArrayList<>();
		File file = new File(filepath);
		ReadFile read = new ReadFile();
		ConvertFile convert = new ConvertFile();
		
		int stalen = 0;
		for (int i = 0; i < stasum; i++) {
			// System.out.println("-----------------------");
			Data da = new Data();
			TZMetaInfo tzMetaInfo = new TZMetaInfo();
			// 276-279:long 台号
			byte[] pos276 = read.readFilebyPos(file, 276 + stalen, 4);
			int staid = convert.bytesToInt(pos276, 4);
			da.setStaid(staid);
			System.out.println("台号:" + staid);
			tzMetaInfo.setStaid(staid);
			
			// 280-299字节:char 台名
			byte[] pos280 = read.readFilebyPos(file, 280 + stalen, 20);
			String staname = new String(pos280);
			da.setStaName(staname.trim());
			System.out.println("台名:" + staname);
			tzMetaInfo.setStaName(staname);
			
			// 300-309字节:char 数采型号
			byte[] pos300 = read.readFilebyPos(file, 300 + stalen, 10);
			String DAtype = new String(pos300);
			da.setDAtype(DAtype);
			System.out.println("数采型号:" + DAtype);
			tzMetaInfo.setDAtype(DAtype);
			
			// 310-311:short
			byte[] pos310 = read.readFilebyPos(file, 310 + stalen, 2);
			int DAlen = convert.bytesToInt(pos310, 2);
			da.setDAlen(DAlen);
			System.out.println("数采字长:" + DAlen);
			tzMetaInfo.setDAlen(DAlen);
			
			// 312-315:float 满幅电压
			byte[] pos312 = read.readFilebyPos(file, 312 + stalen, 4);
			float v = convert.bytesToFloat(pos312);
			System.out.println("满幅电压:" + v);
			tzMetaInfo.setV(v);
			
			// 316-319:long 采样率
			byte[] pos316 = read.readFilebyPos(file, 316 + stalen, 4);
			int samp = convert.bytesToInt(pos316, 4);
			da.setSamp(samp);
			System.out.println("采样率:" + samp);
			tzMetaInfo.setSamp(samp);
			
			// 320-323:long 通道总数
			byte[] pos320 = read.readFilebyPos(file, 320 + stalen, 4);
			int stacom = convert.bytesToInt(pos320, 4);
			System.out.println("通道总数:" + stacom);
			tzMetaInfo.setStacom(stacom);
			
			// 324-325:short 数据传播方式
			byte[] pos324 = read.readFilebyPos(file, 324 + stalen, 2);
			int bc = convert.bytesToInt(pos324, 2);
			System.out.println("数据传播方式:" + bc);
			tzMetaInfo.setBc(bc);
			
			// 326-337字节:char 传输设备类型
			byte[] pos326 = read.readFilebyPos(file, 326 + stalen, 12);
			String tp = new String(pos326);
			System.out.println("传输设备类型:" + tp);
			tzMetaInfo.setTp(tp);
			
			// 338-339:short 对时方式
			byte[] pos338 = read.readFilebyPos(file, 338 + stalen, 2);
			int checktime = convert.bytesToInt(pos338, 2);
			System.out.println("对时方式:" + checktime);
			tzMetaInfo.setCheckTime(checktime);
			
			// 340-351字节:char 时钟型号
			byte[] pos340 = read.readFilebyPos(file, 340 + stalen, 12);
			String timetype = new String(pos340);
			System.out.println("时钟型号:" + timetype);
			tzMetaInfo.setTimeType(timetype);
			
			// 352-355:float 钟差
			byte[] pos352 = read.readFilebyPos(file, 352 + stalen, 4);
			float subtime = convert.bytesToFloat(pos352);
			System.out.println("钟差:" + subtime);
			tzMetaInfo.setSubTime(subtime);
			
			// 356-359:float 台站纬度
			byte[] pos356 = read.readFilebyPos(file, 356 + stalen, 4);
			float stalat = convert.bytesToFloat(pos356);
			da.setStalat(stalat);
			System.out.println("台站纬度:" + stalat);
			tzMetaInfo.setStalat(stalat);
			
			// 360-363:float 台站经度
			byte[] pos360 = read.readFilebyPos(file, 360 + stalen, 4);
			float stalon = convert.bytesToFloat(pos360);
			da.setStalon(stalon);
			System.out.println("台站经度:" + stalon);
			tzMetaInfo.setStalon(stalon);
			
			// 364-367:float 台站高程
			byte[] pos364 = read.readFilebyPos(file, 364 + stalen, 4);
			float shei = convert.bytesToFloat(pos364);
			da.setStahei(shei);
			System.out.println("台站高程:" + shei);
			tzMetaInfo.setShei(shei);
			
			// 空8字节:未知

			// 376-377:short 台站权重
			int swei = convert.bytesToInt(read.readFilebyPos(file, 376 + stalen, 2), 2);
			System.out.println("台站权重:" + swei);
			tzMetaInfo.setSwei(swei);
			
			// 378-379:short 台站速度模型
			int vmol = convert.bytesToInt(read.readFilebyPos(file, 378 + stalen, 2), 2);
			System.out.println("台站速度模型:" + vmol);
			tzMetaInfo.setVmol(vmol);
			
			// 380-383:long 原始数据模型
			int dmol = convert.bytesToInt(read.readFilebyPos(file, 380 + stalen, 4), 4);
			System.out.println("原始数据模型:" + dmol);
			tzMetaInfo.setDmol(dmol);
			
			// 384-395字节:char 地震计型号
			String stype = new String(read.readFilebyPos(file, 384 + stalen, 12));
			System.out.println("地震计型号:" + stype);
			tzMetaInfo.setStype(stype);
			
			// 通道信息循环读取
			int challen = stalen;
			// 通道数j=3
			for (int j = 0; j < 3; j++) {
				// 396-407字节:char 通道名称
				String cname = new String(read.readFilebyPos(file, 396 + challen, 12));
				System.out.println("通道名称:" + cname);

				// 408-411:long 通道编号
				int cid = convert.bytesToInt(read.readFilebyPos(file, 408 + challen, 4), 4);
				System.out.println("通道编号:" + cid);

				// 412-415:float增益因子
				float gfactor = convert.bytesToFloat(read.readFilebyPos(file, 412 + challen, 4));
				System.out.println("增益因子:" + gfactor);

				// 416-419:long 响应阶数
				int dgree = convert.bytesToInt(read.readFilebyPos(file, 416 + challen, 4), 4);
				System.out.println("响应阶数:" + dgree);

				// 空12288个字节：未知
				challen += 12288 + 24;

				if (cname.indexOf("Z") > 0 || cname.indexOf("z") > 0) {
					da.setUcid(j);
					da.setUcname(cname);
					da.setUfactor(gfactor);
					da.setUdgree(dgree);
					
					tzMetaInfo.setUcid(j);
					tzMetaInfo.setUcname(cname);
					tzMetaInfo.setUgfactor(gfactor);
					tzMetaInfo.setUdgree(dgree);
				}
				if (cname.indexOf("N") > 0 || cname.indexOf("n") > 0) {
					da.setNcid(j);
					da.setNcname(cname);
					da.setNfactor(gfactor);
					da.setNdgree(dgree);
					
					tzMetaInfo.setNcid(j);
					tzMetaInfo.setNcname(cname);
					tzMetaInfo.setNgfactor(gfactor);
					tzMetaInfo.setNdgree(dgree);
				}
				if (cname.indexOf("E") > 0 || cname.indexOf("e") > 0) {
					da.setEcid(j);
					da.setEcname(cname);
					da.setEfactor(gfactor);
					da.setEdgree(dgree);
					
					tzMetaInfo.setEcid(j);
					tzMetaInfo.setEcname(cname);
					tzMetaInfo.setEgfactor(gfactor);
					tzMetaInfo.setEdgree(dgree);
				}
			}
			stalen += 37056;
			datalist.add(da);
			tzMetaInfoList.add(tzMetaInfo);
		}

		*//** *//**
				 * 读取EVT台站数据 读取台站数据部分 从第(276+台站总数*37056)+4个字节开始； 三层循环 底层：采样率*通道数
				 * 中层：台站总数 外层：数据秒数
				 * 
				 * @param filepath文件路径
				 * @return
				 * @throws Exception
				 *//*
		// 空4字节:未知
		int stapos = 276 + stasum * 37056 + 4;// 开始位置
		for (int m = 0; m < datasec; m++) {
			// for (int m = 0; m < 1; m++) {
			for (int staid = 0; staid < stasum; staid++) {
				Data data = (Data) datalist.get(staid);
				// 进行该台站通道排序
				for (int j = 0; j < 3; j++) {
					if (data.getUcid() == j) {
						for (int l = 0; l < data.getSamp(); l++) {
							int stadata = convert.bytesToInt(read.readFilebyPos(file, stapos, 4), 4);
							double u = stadata / data.getUfcator();
							data.setUdata(u);
							stapos += 4;
						}
					} else if (data.getNcid() == j) {
						for (int l = 0; l < data.getSamp(); l++) {
							int stadata = convert.bytesToInt(read.readFilebyPos(file, stapos, 4), 4);
							double n = stadata / data.getNfcator();
							data.setNdata(n);
							stapos += 4;
						}
					} else if (data.getEcid() == j) {
						for (int l = 0; l < data.getSamp(); l++) {
							int stadata = convert.bytesToInt(read.readFilebyPos(file, stapos, 4), 4);
							double e = stadata / data.getEfcator();
							data.setEdata(e);
							stapos += 4;
						}
					}
				}
				
				stapos += 4;
			}
		}
		
		
		
		tzMap.put("tzMetaInfoList", tzMetaInfoList);
		tzMap.put("tzDataList", datalist);
		System.out.println("----------------数据解析完成----------------");
		return tzMap;
	}
	*/
	public static byte[] toByteArray(File file) throws IOException {  
        File f = file;  
        if (!f.exists()) {  
            throw new FileNotFoundException("file not exists");  
        }  
        ByteArrayOutputStream bos = new ByteArrayOutputStream((int) f.length());  
        BufferedInputStream in = null;  
        try {  
            in = new BufferedInputStream(new FileInputStream(f));  
            int buf_size = 1024;  
            byte[] buffer = new byte[buf_size];  
            int len = 0;  
            while (-1 != (len = in.read(buffer, 0, buf_size))) {  
                bos.write(buffer, 0, len);  
            }  
            return bos.toByteArray();  
        } catch (IOException e) {  
            e.printStackTrace();  
            throw e;  
        } finally {  
            try {  
                in.close();  
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
            bos.close();  
        }  
    }
	/**
	 * 获取所有台站数据
	 * @param filepath
	 * @param stasum
	 * @param datasec
	 * @return tzMap tzMetaInfoList 为台站元数据list  datalist 为台站观测数据list
	 * @throws Exception
	 */
	
	public static Map<String,List> getTZData(String filepath, int stasum, int datasec) throws Exception{
		Map<String,List> tzMap = new HashMap<>();
		List<TZMetaInfo> tzMetaInfoList = new ArrayList<>();
		List<Data> datalist = new ArrayList<>();
		
		try
		{
			
			File file = new File(filepath);
			ReadFile read = new ReadFile();
			
			byte[] fileByte = toByteArray(file);
	 
			ConvertFile convert = new ConvertFile();
			
			int stalen = 0;
			for (int i = 0; i < stasum; i++) {
				System.gc();
				// System.out.println("-----------------------");
				Data da = new Data();
				TZMetaInfo tzMetaInfo = new TZMetaInfo();
				// 276-279:long 台号
				byte[] pos276 = read.readByteyPos(fileByte, 276 + stalen, 4);
				int staid = convert.bytesToInt(pos276, 4);
				da.setStaid(staid);
				System.out.println("台号:" + staid);
				tzMetaInfo.setStaid(staid);
				
				// 280-299字节:char 台名
				byte[] pos280 = read.readByteyPos(fileByte, 280 + stalen, 20);
				String staname = new String(pos280);
				da.setStaName(staname.trim());
				//System.out.println("台名:" + staname);
				tzMetaInfo.setStaName(staname);
				
				// 300-309字节:char 数采型号
				byte[] pos300 = read.readByteyPos(fileByte, 300 + stalen, 10);
				String DAtype = new String(pos300);
				da.setDAtype(DAtype);
				//System.out.println("数采型号:" + DAtype);
				tzMetaInfo.setDAtype(DAtype);
				
				// 310-311:short
				byte[] pos310 = read.readByteyPos(fileByte, 310 + stalen, 2);
				int DAlen = convert.bytesToInt(pos310, 2);
				da.setDAlen(DAlen);
				//System.out.println("数采字长:" + DAlen);
				tzMetaInfo.setDAlen(DAlen);
				
				// 312-315:float 满幅电压
				byte[] pos312 = read.readByteyPos(fileByte, 312 + stalen, 4);
				float v = convert.bytesToFloat(pos312);
				//System.out.println("满幅电压:" + v);
				tzMetaInfo.setV(v);
				
				// 316-319:long 采样率
				byte[] pos316 = read.readByteyPos(fileByte, 316 + stalen, 4);
				int samp = convert.bytesToInt(pos316, 4);
				da.setSamp(samp);
				//System.out.println("采样率:" + samp);
				tzMetaInfo.setSamp(samp);
				
				// 320-323:long 通道总数
				byte[] pos320 = read.readByteyPos(fileByte, 320 + stalen, 4);
				int stacom = convert.bytesToInt(pos320, 4);
				//System.out.println("通道总数:" + stacom);
				tzMetaInfo.setStacom(stacom);
				
				// 324-325:short 数据传播方式
				byte[] pos324 = read.readByteyPos(fileByte, 324 + stalen, 2);
				int bc = convert.bytesToInt(pos324, 2);
				//System.out.println("数据传播方式:" + bc);
				tzMetaInfo.setBc(bc);
				
				// 326-337字节:char 传输设备类型
				byte[] pos326 = read.readByteyPos(fileByte, 326 + stalen, 12);
				String tp = new String(pos326);
				//System.out.println("传输设备类型:" + tp);
				tzMetaInfo.setTp(tp);
				
				// 338-339:short 对时方式
				byte[] pos338 = read.readByteyPos(fileByte, 338 + stalen, 2);
				int checktime = convert.bytesToInt(pos338, 2);
				//System.out.println("对时方式:" + checktime);
				tzMetaInfo.setCheckTime(checktime);
				
				// 340-351字节:char 时钟型号
				byte[] pos340 = read.readByteyPos(fileByte, 340 + stalen, 12);
				String timetype = new String(pos340);
				//System.out.println("时钟型号:" + timetype);
				tzMetaInfo.setTimeType(timetype);
				
				// 352-355:float 钟差
				byte[] pos352 = read.readByteyPos(fileByte, 352 + stalen, 4);
				float subtime = convert.bytesToFloat(pos352);
				//System.out.println("钟差:" + subtime);
				tzMetaInfo.setSubTime(subtime);
				
				// 356-359:float 台站纬度
				byte[] pos356 = read.readByteyPos(fileByte, 356 + stalen, 4);
				float stalat = convert.bytesToFloat(pos356);
				da.setStalat(stalat);
				//System.out.println("台站纬度:" + stalat);
				tzMetaInfo.setStalat(stalat);
				
				// 360-363:float 台站经度
				byte[] pos360 = read.readByteyPos(fileByte, 360 + stalen, 4);
				float stalon = convert.bytesToFloat(pos360);
				da.setStalon(stalon);
				//System.out.println("台站经度:" + stalon);
				tzMetaInfo.setStalon(stalon);
				
				// 364-367:float 台站高程
				byte[] pos364 = read.readByteyPos(fileByte, 364 + stalen, 4);
				float shei = convert.bytesToFloat(pos364);
				da.setStahei(shei);
				//System.out.println("台站高程:" + shei);
				tzMetaInfo.setShei(shei);
				
				// 空8字节:未知

				// 376-377:short 台站权重
				int swei = convert.bytesToInt(read.readByteyPos(fileByte, 376 + stalen, 2), 2);
				//System.out.println("台站权重:" + swei);
				tzMetaInfo.setSwei(swei);
				
				// 378-379:short 台站速度模型
				int vmol = convert.bytesToInt(read.readByteyPos(fileByte, 378 + stalen, 2), 2);
				//System.out.println("台站速度模型:" + vmol);
				tzMetaInfo.setVmol(vmol);
				
				// 380-383:long 原始数据模型
				int dmol = convert.bytesToInt(read.readByteyPos(fileByte, 380 + stalen, 4), 4);
				//System.out.println("原始数据模型:" + dmol);
				tzMetaInfo.setDmol(dmol);
				
				// 384-395字节:char 地震计型号
				String stype = new String(read.readByteyPos(fileByte, 384 + stalen, 12));
				//System.out.println("地震计型号:" + stype);
				tzMetaInfo.setStype(stype);
				
				// 通道信息循环读取
				int challen = stalen;
				// 通道数j=3
				for (int j = 0; j < 3; j++) {
					// 396-407字节:char 通道名称
					String cname = new String(read.readByteyPos(fileByte, 396 + challen, 12));
					//System.out.println("通道名称:" + cname);
                     if(!"".equals(cname.trim()))
                     {
                    	 cnameTemp[j]=cname;
                     }
                     else{
                    	 cname=cnameTemp[j];
                     }
					// 408-411:long 通道编号
					int cid = convert.bytesToInt(read.readByteyPos(fileByte, 408 + challen, 4), 4);
					//System.out.println("通道编号:" + cid);

					// 412-415:float增益因子
					float gfactor = convert.bytesToFloat(read.readByteyPos(fileByte, 412 + challen, 4));
					//System.out.println("增益因子:" + gfactor);

					// 416-419:long 响应阶数
					int dgree = convert.bytesToInt(read.readByteyPos(fileByte, 416 + challen, 4), 4);
					//System.out.println("响应阶数:" + dgree);

					// 空12288个字节：未知
					challen += 12288 + 24;

					if (cname.indexOf("Z") >= 0 || cname.indexOf("z") >= 0||cname.indexOf("U") >= 0 || cname.indexOf("u") >= 0) {
						da.setUcid(j);
						da.setUcname(cname);
						da.setUfactor(gfactor);
						da.setUdgree(dgree);
						
						tzMetaInfo.setUcid(j);
						tzMetaInfo.setUcname(cname);
						tzMetaInfo.setUgfactor(gfactor);
						tzMetaInfo.setUdgree(dgree);
					}
					if (cname.indexOf("N") >= 0 || cname.indexOf("n") >= 0) {
						da.setNcid(j);
						da.setNcname(cname);
						da.setNfactor(gfactor);
						da.setNdgree(dgree);
						
						tzMetaInfo.setNcid(j);
						tzMetaInfo.setNcname(cname);
						tzMetaInfo.setNgfactor(gfactor);
						tzMetaInfo.setNdgree(dgree);
					}
					if (cname.indexOf("E") >= 0 || cname.indexOf("e") >= 0) {
						da.setEcid(j);
						da.setEcname(cname);
						da.setEfactor(gfactor);
						da.setEdgree(dgree);
						
						tzMetaInfo.setEcid(j);
						tzMetaInfo.setEcname(cname);
						tzMetaInfo.setEgfactor(gfactor);
						tzMetaInfo.setEdgree(dgree);
					}
				}
				stalen += 37056;
				datalist.add(da);
				tzMetaInfoList.add(tzMetaInfo);
			}

			/** *//**
					 * 读取EVT台站数据 读取台站数据部分 从第(276+台站总数*37056)+4个字节开始； 三层循环 底层：采样率*通道数
					 * 中层：台站总数 外层：数据秒数
					 * 
					 * @param filepath文件路径
					 * @return
					 * @throws Exception
					 */
			// 空4字节:未知
			int stapos = 276 + stasum * 37056 + 4;// 开始位置
			
			
			for (int m = 0; m < datasec; m++) 
			{
				 
				// for (int m = 0; m < 1; m++) {
				for (int staid = 0; staid < stasum; staid++) {
					Data data = (Data) datalist.get(staid);
					// 进行该台站通道排序
					for (int j = 0; j < 3; j++) {
						if (data.getUcid() == j) {
							for (int l = 0; l < data.getSamp(); l++) {
								int stadata = convert.bytesToInt(read.readByteyPos(fileByte, stapos, 4), 4);
								double u = stadata / data.getUfcator();
								data.setUdata(u);
								stapos += 4;
							}
						} else if (data.getNcid() == j) {
							for (int l = 0; l < data.getSamp(); l++) {
								int stadata = convert.bytesToInt(read.readByteyPos(fileByte, stapos, 4), 4);
								double n = stadata / data.getNfcator();
								data.setNdata(n);
								stapos += 4;
							}
						} else if (data.getEcid() == j) {
							for (int l = 0; l < data.getSamp(); l++) {
								int stadata = convert.bytesToInt(read.readByteyPos(fileByte, stapos, 4), 4);
								double e = stadata / data.getEfcator();
								data.setEdata(e);
								stapos += 4;
							}
						}
					}

					//ToDBLogBean bean = new ToDBLogBean(new Date(),"台站序号staid："+staid,"数据行数row："+data.getUdata().size(),"n1:"+data.getNdata());
					//logger.record(bean);
					stapos += 4;
				}
			}
			
			
			
			for (int i = tzMetaInfoList.size()-1; i >=0 ; i--)  
            {
                for (int j =0 ; j < i; j++)  
                {
                    if (tzMetaInfoList.get(i).equals(tzMetaInfoList.get(j)))
                    {
                    	tzMetaInfoList.remove(j);
                    	break;
                    }
                    
                }
            }
			for (int i = datalist.size()-1; i >=0 ; i--)  
            {
                for (int j =0 ; j < i; j++)  
                {
                    if (datalist.get(i).equals(datalist.get(j)))
                    {
                    	datalist.remove(j);
                    	break;
                    }
                    
                }
            }
			
			
			tzMap.put("tzMetaInfoList", tzMetaInfoList);
			tzMap.put("tzDataList", datalist);
			fileByte=null;
		}
	    catch(Exception e){
		e.printStackTrace();
	    }
		
	//	System.out.println("----------------数据解析完成----------------");
		return tzMap;
	}
	public static Map<String,String> createPartFilePaths(String twName, String startDate, String name,String path,String Ncname,String Ecname,String Ucname){
		String netName = "";
		String staName = "";
		/*String pretype = "";*/
		String[] channels = new String[]{Ncname,Ecname,Ucname};
		Map<String,String> paths = new HashMap<>();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		int year = 0;
		int dayOfYear = 0;
		int hourOfDay = 0;
		try{
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(format.parse(startDate));
			year = calendar.get(calendar.YEAR);
			dayOfYear = calendar.get(calendar.DAY_OF_YEAR);
			hourOfDay = calendar.get(calendar.HOUR_OF_DAY);
			
			/*staName = name.split("/")[1];
			netName = name.split("/")[0];
			pretype = name.split("/")[3];*/
			if(name.indexOf("/")!=-1){
				staName = name.split("/")[1];
				/*pretype = name.split("/")[3];*/
			
			}
			else{
				staName = name;
			}
			netName = "SD";
		}catch(Exception e){
			e.printStackTrace();
		}
		/*String taizhanpath= PropsUtils.getPartPath("partpath").trim()+path;
		//建立台站目录
		File file = new File(taizhanpath);
		System.out.print(file);
		for(int i=0;i<channels.length;i++){
        if (file.exists()) {
            File[] files = file.listFiles();
            if (files.length == 0) {
            	file = new File(PropsUtils.getPartPath("partpath").trim()+path+staName);
            	file.mkdirs();
            	String path1 = PropsUtils.getPartPath("partpath").trim()+path+staName+"/"+netName+"."+staName+"."+year+"."+dayOfYear+"."+hourOfDay+"."+pretype.trim()+channels[i]+".txt";
    			paths.put(pretype.trim()+channels[i], path1);
                
            } else {
            	
                for (File file2 : files) {
                    if (file2.isDirectory()) {
                        System.out.println("文件夹:" + file2.getAbsolutePath());
                        if(file2.getAbsolutePath().equals(PropsUtils.getPartPath("partpath").trim()+path+staName)){
                        	
                    			String path1 = PropsUtils.getPartPath("partpath").trim()+path+staName+"/"+netName+"."+staName+"."+year+"."+dayOfYear+"."+hourOfDay+"."+pretype.trim()+channels[i]+".txt";
                    			paths.put(pretype.trim()+channels[i], path1);
                    		
                        }
                        else{
                        	file = new File(PropsUtils.getPartPath("partpath").trim()+path+staName);
                        	file.mkdirs();
                        	String path1 = PropsUtils.getPartPath("partpath").trim()+path+staName+"/"+netName+"."+staName+"."+year+"."+dayOfYear+"."+hourOfDay+"."+pretype.trim()+channels[i]+".txt";
                			paths.put(pretype.trim()+channels[i], path1);
                    	}
                    } else {
                        System.out.println("文件:" + file2.getAbsolutePath());
                    }
                }}
            }
        else {
            System.out.println("文件夹不存在!");
        }} */
		
		
		
		for(int i=0;i<channels.length;i++){
			/*String path1 = PropsUtils.getPartPath("partpath").trim()+path+netName+"."+staName+"."+year+"."+dayOfYear+"."+hourOfDay+"."+pretype.trim()+channels[i]+".txt";*/
			String path1 = PropsUtils.getPartPath("partpath").trim()+path+netName+"."+staName+"."+year+"."+dayOfYear+"."+hourOfDay+"."+channels[i]+".txt";
			//System.out.print(path1);
			paths.put(channels[i], path1);
		}
		return paths;
	}
	
	
	
	/**
	 * 生成头文件
	 * 
	 * @param net
	 *            net类
	 * @param stasum
	 *            台站个数
	 * @param starttime
	 *            开始时间，System.now()/1000
	 * @param datasec
	 *            数据长度，单位秒
	 * @return
	 * @throws Exception
	 */
	public static byte[] makeHead(Net net, int stasum, int starttime, int datasec) throws Exception {
		ArrayList<byte[]> al = new ArrayList<>();
		// 事件文件标志(默认值为:digital event)
		al.add(setByteLength(net.getFlag(), 16));
		// 记录主机类型(PC或Work Station)
		al.add(setByteLength(net.getType(), 16));
		// 文件记录类型,0：表示原始记录；1：表示加速度型；2：速度型；3：位移型
		al.add(intToByte4(net.getDoctype()));
		// 未知-------------/*处理经历(说明：32位中的不同位表示不同的处理经历，现定义为：0x00000004表示经历了仪器效正、；0x00000008
		// 表示经过了坐标轴旋转；0x00000010
		// 表示经过了数字滤波；0x000000020表示经过了直流效正；0x000000040表示经过了线性效正*/
		al.add(intToByte4(net.getUnkown1()));
		// 台网名称
		al.add(setByteLength(net.getTwname(), 80));
		// 台站总数
		if ("".equals("" + stasum)) {
			throw new Exception("台站总数不能为空");
		}
		al.add(intToByte4(stasum));
		// 124-127字节:float台网中心纬度
		al.add(floatToByte4(net.getLat()));
		// 128-131字节:float台网中心经度
		al.add(floatToByte4(net.getLon()));
		// 132-135字节:float台网中心高度
		al.add(floatToByte4(net.getHei()));
		// 136-255:未知
		al.add(setByteLength(net.getUnkown2(), 120));
		// 256-259:long 数据开始时间
		if ("".equals("" + starttime)) {
			throw new Exception("开始时间不能为空");
		}
		al.add(intToByte4(starttime));
		// 260-271:6个short 分别为数据开始的年、月、日、时、分、秒、
		Calendar cale = Calendar.getInstance();
		cale.setTimeInMillis(((long) starttime) * 1000);
		int cyear = cale.get(Calendar.YEAR);
		int cmouth = cale.get(Calendar.MONTH) + 1;//
		int cday = cale.get(Calendar.DAY_OF_MONTH);
		int chour = cale.get(Calendar.HOUR_OF_DAY);
		int cmin = cale.get(Calendar.MINUTE);
		int csec = cale.get(Calendar.SECOND);
		al.add(shortToByte2((short) cyear));
		al.add(shortToByte2((short) cmouth));
		al.add(shortToByte2((short) cday));
		al.add(shortToByte2((short) chour));
		al.add(shortToByte2((short) cmin));
		al.add(shortToByte2((short) csec));
		// 272-275:long 记录长度（单位秒)
		al.add(intToByte4(datasec));
		al.clone();
		return sumByte(al);

	}
	
	
	/**
	 * 生成台站头
	 * 
	 * @param stanum
	 * @param sta
	 * @return
	 */
	public static byte[] makeStaHead(int stanum, Sta sta) {
		ArrayList<byte[]> al = new ArrayList<>();
		al.add(intToByte4(stanum));// 276-279:long 台号
		al.add(setByteLength(sta.getStaName(), 20));// 280-299字节:char 台名
		al.add(setByteLength(sta.getDAtype(), 10));// 300-309字节:char 数采型号
		al.add(shortToByte2(sta.getDAlen()));// 310-311:short 数采字长
		al.add(floatToByte4(sta.getV()));// 312-315:float 满幅电压
		al.add(intToByte4(sta.getSamp()));// 316-319:long 采样率
		al.add(intToByte4(sta.getStacom()));// 320-323:long 通道总数
		al.add(shortToByte2(sta.getBc()));// 324-325:short 数据传播方式
		al.add(setByteLength(sta.getTp(), 12));// 326-337字节:char 传输设备类型
		al.add(shortToByte2(sta.getChecktime()));// 338-339:short 对时方式
		al.add(setByteLength(sta.getTimetype(), 12));// 340-351字节:char 时钟型号
		al.add(floatToByte4(sta.getSubtime()));// 352-355:float 钟差
		al.add(floatToByte4(sta.getStalat()));// 356-359:float 台站纬度
		al.add(floatToByte4(sta.getStalon()));// 360-363:float 台站经度
		al.add(floatToByte4(sta.getShei()));// 364-367:float 台站高程
		al.add(setByteLength(sta.getUnkown1(), 8));// 空8字节:未知
		al.add(shortToByte2(sta.getSwei()));// 376-377:short 台站权重
		al.add(shortToByte2(sta.getVmol()));// 378-379:short 台站速度模型
		al.add(intToByte4(sta.getDmol()));// 380-383:long 原始数据模型
		al.add(setByteLength(sta.getStype(), 12));// 384-395字节:char 地震计型号
		
		//限定顺序为Z-E-N
				// 第一通道
				al.add(setByteLength(sta.getCnameU(), 12));// 396-407字节:char 通道名称
				al.add(intToByte4(0));// 408-411:long 通道编号
				al.add(floatToByte4(sta.getGfactorU()));// 412-415:float增益因子
				al.add(intToByte4(sta.getDgreeU()));// 416-419:long 响应阶数
				al.add(setByteLength(sta.getUnkownU(), 12288));// 空12288个字节：未知
				// 第二通道
				al.add(setByteLength(sta.getCnameE(), 12));// 396-407字节:char 通道名称
				al.add(intToByte4(1));// 408-411:long 通道编号
				al.add(floatToByte4(sta.getGfactorE()));// 412-415:float增益因子
				al.add(intToByte4(sta.getDgreeE()));// 416-419:long 响应阶数
				al.add(setByteLength(sta.getUnkownE(), 12288));// 空12288个字节：未知
				// 第三通道
				al.add(setByteLength(sta.getCnameN(), 12));// 396-407字节:char 通道名称
				al.add(intToByte4(2));// 408-411:long 通道编号
				al.add(floatToByte4(sta.getGfactorN()));// 412-415:float增益因子
				al.add(intToByte4(sta.getDgreeN()));// 416-419:long 响应阶数
				al.add(setByteLength(sta.getUnkownN(), 12288));// 空12288个字节：未知???
		al.clone();
		return sumByte(al);
	}
	
	/**
	 * 添加数据
	 * @param datasec
	 * @param stas
	 * @param result
	 * @return
	 */
	public static byte[] addData(int datasec,ArrayList<Sta> stas,ArrayList<byte[]> result){
		System.out.println("------------------addData开始----------------------");
		for (int l = 0; l < datasec; l++) {
			for (int m = 0; m < stas.size(); m++) {
				System.out.println("m:"+m);
//				System.out.println("dataCount:"+stas.size());
				int splimit = stas.get(m).getSamp();
//				System.out.println(stas.get(m).getStaName()+"采样率:"+splimit);
				float gfN = stas.get(m).getGfactorN();
//				System.out.println(stas.get(m).getStaName()+"Ngf:"+gfN);
				float gfE = stas.get(m).getGfactorE();
//				System.out.println(stas.get(m).getStaName()+"Egf:"+gfE);
				float gfU = stas.get(m).getGfactorU();
//				System.out.println(stas.get(m).getStaName()+"Ugf:"+gfU);
				/*// N-S向数据
				for (int sp = 0; sp < splimit; sp++) {
					System.out.println("N-S-sp:"+sp);
					result.add(intToByte4((int) (stas.get(m).getDataN().get(l * splimit + sp) * gfN)));
				}
				// E-W向数据
				for (int sp = 0; sp < splimit; sp++) {
					System.out.println("E-W-sp:"+sp);
					result.add(intToByte4((int) (stas.get(m).getDataE().get(l * splimit + sp) * gfE)));
				}
				// U-D向数据
				for (int sp = 0; sp < splimit; sp++) {
					System.out.println("U-D-sp:"+sp);
					result.add(intToByte4((int) (stas.get(m).getDataU().get(l * splimit + sp) * gfU)));
				}*/
				
				//限定顺序为Z-E-N
				// U-D向数据
				for (int sp = 0; sp < splimit; sp++) {
					result.add(intToByte4((int) (stas.get(m).getDataU().get(l * splimit + sp) * gfU)));
				}
				// E-W向数据
				for (int sp = 0; sp < splimit; sp++) {
					result.add(intToByte4((int) (stas.get(m).getDataE().get(l * splimit + sp) * gfE)));
				}
				// N-S向数据
				for (int sp = 0; sp < splimit; sp++) {
					result.add(intToByte4((int) (stas.get(m).getDataN().get(l * splimit + sp) * gfN)));
				}
				result.add(setByteLength("", 4));
			}
		}
		
		byte[] byteResult = sumByte(result);
		System.out.println("------------------addData结束----------------------");
		return byteResult;
	}
	
	
	
	public static String createEVTFile(byte[] byteResult, String startDate){
		System.out.println("------------------createEVTFile开始----------------------");
		boolean flag = false;
		String createdFilePath = PropsUtils.getMergePath("mergepath").trim()+UUID.randomUUID()+"$"+startDate+".evt";
		try {
			WriteFile.writeBytes(createdFilePath, byteResult);
			flag = true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("------------------createEVTFile结束----------------------");
		return createdFilePath;
	}
	
	/**
	 *
	 * @param content
	 *            需要更改的字符
	 * @param length
	 *            设定的返回byte[] 长度
	 * @param isRight
	 *            是否从右侧补充空格
	 * @return 限定长度的byte[]
	 */
	public static byte[] setByteLength(String content, int length) {
		byte[] result = new byte[length];
		byte[] temp = content.getBytes();
		if (temp.length >= length) {
			System.arraycopy(temp, 0, result, 0, length);
		} else {
			System.arraycopy(temp, 0, result, 0, temp.length);
		}

		return result;
	}
	
	
	/**
	 * 
	 * 将32位int转换为由四个8位byte数字.
	 * 
	 * @param sum
	 * @return
	 */
	public static byte[] intToByte4(int sum) {
		byte[] targets = new byte[4];
		targets[0] = (byte) (sum & 0xff);// 最低位
		targets[1] = (byte) ((sum >> 8) & 0xff);// 次低位
		targets[2] = (byte) ((sum >> 16) & 0xff);// 次高位
		targets[3] = (byte) (sum >>> 24);// 最高位,无符号右移。
		return targets;

	}
	
	/**
	 * 
	 * 将一个float数字转换为4个byte数字组成的数组.
	 * 
	 * @param f
	 * @return
	 */
	public static byte[] floatToByte4(float f) {
		int i = Float.floatToIntBits(f);
		return intToByte4(i);
	}
	
	/**
	 * 将一个16位的short转换为长度为2的8位byte数组.
	 * 
	 * @param s
	 * @return
	 */
	public static byte[] shortToByte2(Short s) {
		byte[] arr = new byte[2];
		arr[1] = (byte) (s >> 8);
		arr[0] = (byte) (s >> 0);
		return arr;
	}
	
	/**
	 * 将byte[]数组组合成一个数组
	 *
	 * @param al
	 *            byte[]数组
	 * @return 组合成的byte[]
	 */
	public static byte[] sumByte(ArrayList<byte[]> al) {
		int rel = 0;
		for (byte[] bs : al) {
			rel += bs.length;
		}
		byte[] result = new byte[rel];
		int start = 0;
		for (byte[] bs : al) {
			System.arraycopy(bs, 0, result, start, bs.length);
			start += bs.length;
		}
		return result;
	}
	
	/**
	 * 得到时间
	 * 
	 * @param year
	 * @param dayOfYear
	 * @param hourOfDay
	 * @param minute
	 * @param second
	 * @param millSecond
	 * @return
	 */
	private static long getTimeLong(int year, int dayOfYear, int hourOfDay,int minute, int second, int millSecond) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.DAY_OF_YEAR, dayOfYear);
		cal.set(Calendar.HOUR_OF_DAY, hourOfDay);
		cal.set(Calendar.MINUTE, minute);
		cal.set(Calendar.SECOND, second);
		cal.set(Calendar.MILLISECOND, millSecond);
		return cal.getTimeInMillis();
	}

	
	/**
	 * 从hdfs读取单项通道数据，转换成ArrayList<Double>
	 * 
	 * @param chanFile
	 * @return
	 * @throws IOException
	 * @throws NumberFormatException
	 * @throws InterruptedException 
	 * @throws Exception
	 */
	public static ArrayList<Double> readChanData(String chanPath) throws NumberFormatException, IOException, InterruptedException {
	
		Path path = new Path(chanPath);
		FileSystem fileSystem = FileSystem.get(URI.create(PropsUtils.getUri("uri")), new Configuration(),PropsUtils.getUser("user"));
		if(fileSystem.exists(path)){
			ArrayList<Double> cd = new ArrayList<>();
			
			FSDataInputStream inputStream = fileSystem.open(path);
			InputStreamReader reader = new InputStreamReader(inputStream,"UTF-8");
			BufferedReader bufferedReader = new BufferedReader(reader);
			String lineTxt = null;
			while ((lineTxt = bufferedReader.readLine()) != null) {
				cd.add(Double.parseDouble(lineTxt));
			}
			reader.close();
			cd.clone();
			return cd;
		}else{
			return null;
		}
		

	}
	public static void deleteTWMetaInfo(String uuid)
	{
		Connection connection = null;
		PreparedStatement statement = null;
	    String sql_tw = "delete from mdtw where uuid=?";
	try {
		connection = DBUtils.getConnection();
		statement = connection.prepareStatement(sql_tw);
		statement.setString(1,uuid);
		int i =statement.executeUpdate();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally{
		if(statement != null){
			try {
				statement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				statement = null;
			}
		}
		if(connection != null){
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				connection = null;
			}
		}}
	}

}
