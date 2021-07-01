package com.kkpjj.sysostory.model.service;

import static com.kkpjj.common.JDBCTemplate.close;
import static com.kkpjj.common.JDBCTemplate.getConnection;

import java.sql.Connection;

import com.kkpjj.sysostory.model.dao.MemberDAO;
import com.kkpjj.sysostory.model.dto.MemberDTO;

public class MemberService {
	
	private MemberDAO memberDAO;
	
	public MemberService() {
		this.memberDAO = new MemberDAO();
	}

	public int inputMember(MemberDTO member) {
		
		Connection con = getConnection();
		
		int memberResult = memberDAO.insertMember(con, member);
		
		close(con);
				
		return memberResult;
	}

	public int loginMember(MemberDTO member) {
		
		Connection con = getConnection();
		
		int memberResult = memberDAO.loginMember(con, member);
		
		close(con);
				
		return memberResult;
	}

	public int checkMemberId(MemberDTO member) {
		
		Connection con = getConnection();
		
		int memberResult = memberDAO.FindIdMember(con, member);
		
		close(con);
		
		return memberResult;
	}
	
}
