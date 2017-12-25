package org.log;
//package org.tools.log;
//
//import java.sql.Connection;
//import java.sql.SQLException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//import org.apache.log4j.jdbc.JDBCAppender;
//import org.apache.log4j.spi.LoggingEvent;
//import org.tools.DBUtils;
//
//
//public class Log4jForProjectDBAppander extends JDBCAppender{
//
//	@Override
//	protected Connection getConnection() throws SQLException {
//		return DBUtils.getConnection();
//	}
//
//	@Override
//	protected String getLogStatement(LoggingEvent loggingevent) {
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		String sql = "";
//		ToDBLogBean logBean = (ToDBLogBean)loggingevent.getMessage();
//		Date log_time = logBean.getLog_time();
//		String log_time_string = dateFormat.format(log_time);
//		String event = logBean.getEvent();
//		String event_producer = logBean.getEvent_producer();
//		String event_customer = logBean.getEvent_customer();
//		sql = "insert into t_logs(log_time,event,event_producer,event_customer) values(\'"+log_time_string+"\',\'"+event+"\',\'"+event_producer+"\',\'"+event_customer+"\')";
//		return sql;
//	}
//	
//	@Override
//	protected void closeConnection(Connection con) {
//		try(Connection thisCon = con){
//			
//		}catch(Exception e){
//			e.printStackTrace();
//		}
//	}
//
//	
//	
//}
