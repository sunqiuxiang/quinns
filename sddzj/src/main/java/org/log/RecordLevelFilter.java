package org.log;

import org.apache.log4j.Level;
import org.apache.log4j.varia.LevelRangeFilter;

public class RecordLevelFilter extends LevelRangeFilter {

	@Override
	public void setLevelMax(Level levelMax) {
		super.setLevelMax(Log4jForProjectLevels.record);
	}

	@Override
	public void setLevelMin(Level levelMin) {
		super.setLevelMin(Log4jForProjectLevels.record);
	}

	
	
}
