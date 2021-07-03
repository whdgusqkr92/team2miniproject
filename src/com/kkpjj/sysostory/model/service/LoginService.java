package com.kkpjj.sysostory.model.service;

import static com.kkpjj.common.JDBCTemplate.close;
import static com.kkpjj.common.JDBCTemplate.getConnection;

import java.sql.Connection;

import com.kkpjj.sysostory.model.dao.LoginDAO;
import com.kkpjj.sysostory.model.dto.CharaDTO;

public class LoginService {
	
	private LoginDAO loginDAO;
	
	public LoginService() {
		this.loginDAO = new LoginDAO();
	}

	public int checkNickname(CharaDTO charaDTO) {

		Connection con = getConnection();
		
		int nickNameResult = loginDAO.insertNickname(con, charaDTO);
		
		close(con);
		
		return nickNameResult;
	}

}
