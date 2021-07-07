package com.kkpjj.sysostory.model.dao;

import static com.kkpjj.common.JDBCTemplate.close;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.InvalidPropertiesFormatException;
import java.util.List;
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

			pstmt.setString(1, member.getUserId());
			pstmt.setString(2, member.getUserPwd());
			pstmt.setString(3, member.getUserName());
			pstmt.setString(4, member.getEmail());

			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
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
		} finally {
			close(pstmt);
		}

		return result;
	}

	public String FindIdMember(Connection con, MemberDTO member) {	
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = prop.getProperty("FindIdMember");
		String resultId = "";
		
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, member.getUserName());
			pstmt.setString(2, member.getEmail());
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				resultId = rset.getString("USER_ID");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);

		}

		return resultId;
	}

	public String FindPwdMember(Connection con, MemberDTO memberDTO) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String resultPwd = "";;
		
		String query = prop.getProperty("FindPwdMember");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, memberDTO.getUserId());
			pstmt.setString(2, memberDTO.getUserName());
			pstmt.setString(3, memberDTO.getEmail());
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				resultPwd = rset.getString("USER_PWD");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return resultPwd;
	}
}

















