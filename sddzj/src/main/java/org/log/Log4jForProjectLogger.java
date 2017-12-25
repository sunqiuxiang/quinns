package org.log;

import org.apache.log4j.Logger;

public class Log4jForProjectLogger {
	private Class<?> clazz;
	private Logger logger;
	
	public Log4jForProjectLogger(Class<?> clazz){
		this.clazz = clazz;
		this.logger = Logger.getLogger(clazz);
	}
	
	public void record(Object message){
		this.logger.log(Log4jForProjectLevels.record, message);
	}
}
