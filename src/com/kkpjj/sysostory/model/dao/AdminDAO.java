package com.kkpjj.sysostory.model.dao;

import static com.kkpjj.common.JDBCTemplate.close;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

import com.kkpjj.sysostory.model.dto.MemberDTO;

public class AdminDAO {
	
	private Properties prop;
	
	public AdminDAO() {
		this.prop = new Properties();
		
		try {
			prop.loadFromXML(new FileInputStream("mapper/admin-query.xml"));
			
		} catch (InvalidPropertiesFormatException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public int loginAdmin(Connection con, MemberDTO memberDTO) {
		
		PreparedStatement pstmt = null;
		
		int result = 0;
		
		String query = prop.getProperty("loginAdmin");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, memberDTO.getUserId());
			pstmt.setString(2, memberDTO.getUserPwd());
			
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		
		return result;
	}

}















