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
//		System.out.println("Serveice : " + characterDTO.getChrName());
//		System.out.println("ServiceMem_No : " + memberDTO.getUserNo());
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
	
//	public int checkCharacterNumber(String idText) {
//		Connection con = getConnection();
//		int searchCharacterNumber = loginDAO.searchCharacterNumber(con, idText);
//		close(con);
//		
//		return searchCharacterNumber;
//	}
}
