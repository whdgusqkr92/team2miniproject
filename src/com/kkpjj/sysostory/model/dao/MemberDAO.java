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

public class MemberDAO {
	
	private Properties prop;
	
	public MemberDAO() {
		this.prop = new Properties();
		
		try {
			prop.loadFromXML(new FileInputStream("mapper/member-query.xml"));
			
		} catch (InvalidPropertiesFormatException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public int insertMember(Connection con, MemberDTO member) {
		
		PreparedStatement pstmt = null;
		
		int result = 0;
		
		String query = prop.getProperty("insertMember");
		
		try {
			pstmt = con.prepareStatement(query);
//			pstmt.setString(1, "7"); /* 하드 코딩 */
//			pstmt.setString(2, member.getUserId());
//			pstmt.setString(3, member.getUserPwd());
//			pstmt.setString(4, member.getUserName());
//			pstmt.setString(5, member.getEmail());

			pstmt.setString(1, member.getUserId());
			pstmt.setString(2, member.getUserPwd());
			pstmt.setString(3, member.getUserName());
			pstmt.setString(4, member.getEmail());
			
			result = pstmt.executeUpdate();
					
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.print(e.getLocalizedMessage());
		} finally {
			close(pstmt);
		}
		
		return result;
	}
	
public int loginMember(Connection con, MemberDTO member) {
		
		PreparedStatement pstmt = null;
		
		int result = 0;
		
		String query = prop.getProperty("loginMember");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, member.getUserId());
			pstmt.setString(2, member.getUserPwd());
		
			result = pstmt.executeUpdate();
					
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.print(e.getLocalizedMessage());
		} finally {
			close(pstmt);
		}
		
		return result;
	}
}

















