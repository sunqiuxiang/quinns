package org.tools;

import java.sql.Connection;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;


public class DBUtils {
	private static ComboPooledDataSource cpds = new ComboPooledDataSource(true);
	public static Connection getConnection() throws SQLException{
		return cpds.getConnection();
	}
}
