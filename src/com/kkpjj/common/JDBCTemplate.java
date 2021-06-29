package com.kkpjj.common;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCTemplate {
	
	public static Connection getConnection() {
		
		Connection con = null;
		
		Properties prop = new Properties();
		
		try {
			prop.load(new FileReader("conifg/connection-info.properties"));
			
			String driver = prop.getProperty("driver");
			String url = prop.getProperty("url");
			
			Class.forName(driver);
			con = DriverManager.getConnection(url, prop);
			
			con.setAutoCommit(false);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public static void close(Connection con) {
		try {
			if(con != null && con.isClosed()) {
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(PreparedStatement pstmt) {
		try {
			if(pstmt != null && pstmt.isClosed()) {
				pstmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}










