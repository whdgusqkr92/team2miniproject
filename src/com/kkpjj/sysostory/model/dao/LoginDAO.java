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

import com.kkpjj.sysostory.model.dto.CharaDTO;
import com.kkpjj.sysostory.model.dto.MemberDTO;

public class LoginDAO {
	
	private Properties prop;
	CharaDTO charaDTO;
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

	public int insertNickname(Connection con, CharaDTO charaDTO) {

		PreparedStatement pstmt = null;
		charaDTO = new CharaDTO();
//		memberDTO = new MemberDTO();
		
		int result = 0;
		
		
		String query = prop.getProperty("insertNickname");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, charaDTO.getChrName());
//			pstmt.setInt(2, charaDTO.getUserNo());
			
//			if(charaDTO.getUserNo() == memberDTO.getUserNo()) {
				result = pstmt.executeUpdate();
//			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		
		
		return result;
	}

}
