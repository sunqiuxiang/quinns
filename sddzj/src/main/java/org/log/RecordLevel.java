package org.log;

import org.apache.log4j.Level;
import org.apache.log4j.net.SyslogAppender;

public class RecordLevel extends Level {
	static final int level = 20201;
	private static final String levelStr = "Record";
	private static final int syslogEquivalent = SyslogAppender.LOG_LOCAL0;
	
	private RecordLevel(int level, String levelStr, int syslogEquivalent) {
		super(level, levelStr, syslogEquivalent);
	}
	
	public RecordLevel(){
		this(level,levelStr,syslogEquivalent);
	}
	
	
	
}
