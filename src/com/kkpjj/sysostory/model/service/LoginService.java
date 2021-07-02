package com.kkpjj.sysostory.model.service;

import static com.kkpjj.common.JDBCTemplate.getConnection;
import static com.kkpjj.common.JDBCTemplate.close;

import java.sql.Connection;

import com.kkpjj.sysostory.model.dao.LoginDAO;
import com.kkpjj.sysostory.model.dto.CharacterDTO;

public class LoginService {
	
	private LoginDAO loginDAO;
	
	public LoginService() {
		this.loginDAO = new LoginDAO();
	}

	public int checkNickname(CharacterDTO characterDTO) {

		Connection con = getConnection();
		
		int nickNameResult = loginDAO.insertNickname(con, characterDTO);
		
		close(con);
		
		return nickNameResult;
	}

}
