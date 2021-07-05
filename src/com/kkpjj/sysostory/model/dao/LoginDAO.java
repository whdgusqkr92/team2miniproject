package com.kkpjj.sysostory.model.dao;

import static com.kkpjj.common.JDBCTemplate.close;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

import com.kkpjj.sysostory.model.dto.CharacterDTO;
import com.kkpjj.sysostory.model.dto.MemberDTO;

public class LoginDAO {
	
	private Properties prop;
	CharacterDTO characterDTO;
	MemberDTO memberDTO;
	
	public LoginDAO() {
		this.prop = new Properties();
		
		try {
			prop.loadFromXML(new FileInputStream("mapper/login-query.xml"));
			
		} catch (InvalidPropertiesFormatException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public int insertNickname(Connection con, CharacterDTO characterDTO, MemberDTO memberDTO) {

		PreparedStatement pstmt = null;
		
		int result = 0;
//		int userNumber = 0;
//		String chrName = "";
		
//		userNumber = memberDTO.getUserNo();
//		chrName = characterDTO.getChrName();
		
		String query = prop.getProperty("insertNickname");
		
		
//		System.out.println("박종현3 : " + memberDTO.getUserNo());
//		System.out.println("박종현4 : " + characterDTO.getUserNo());
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, memberDTO.getUserNo());
			pstmt.setString(2, characterDTO.getChrName());
//			pstmt.setInt(3, characterDTO.getUserNo());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
//			close(con);
		}
		
		return result;
	}

	
	public int searchMemberNumber(Connection con, String idText) {
		PreparedStatement pstmt = null;
		ResultSet result = null;
		
		String query = prop.getProperty("searchMemberNumber");
		int resultIdNumber = 0;
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, idText);

			result = pstmt.executeQuery();
			
			while(result.next()) {
				resultIdNumber = result.getInt("USER_NO");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(result);
			close(pstmt);
		}
		
		return resultIdNumber;
	}
	
}
