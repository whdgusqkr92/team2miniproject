package com.kkpjj.sysostory.model.service;

import static com.kkpjj.common.JDBCTemplate.close;
import static com.kkpjj.common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.List;

import com.kkpjj.sysostory.model.dao.LoginDAO;
import com.kkpjj.sysostory.model.dto.CharacterDTO;
import com.kkpjj.sysostory.model.dto.MemberDTO;


public class LoginService {
	
	private LoginDAO loginDAO;
	
	public LoginService() {
		this.loginDAO = new LoginDAO();
	}


	public int checkNickname(CharacterDTO characterDTO, MemberDTO memberDTO) {


		Connection con = getConnection();
		int nickNameResult = loginDAO.insertNickname(con, characterDTO, memberDTO);
		
		close(con);
		
		return nickNameResult;
	}

	
	public int checkMemberNumber(String idText) {
		Connection con = getConnection();
		int searchMemberNumber = loginDAO.searchMemberNumber(con, idText);
		close(con);
		
		return searchMemberNumber;
	}


	public List<MemberDTO> searchAllMember() {
		Connection con = getConnection();
		
		List<MemberDTO> memberList = loginDAO.selectAllMember(con);
		
		close(con);
		return memberList;
	}
	
	public CharacterDTO searchCharacterInfo(MemberDTO memDTO) {
		
		Connection con = getConnection();
		
		CharacterDTO charDTO = loginDAO.searchCharacterInfo(con, memDTO);
		
		close(con);
		
		return charDTO;

	}
	
}
