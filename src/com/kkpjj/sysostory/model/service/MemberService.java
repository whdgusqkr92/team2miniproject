package com.kkpjj.sysostory.model.service;

import static com.kkpjj.common.JDBCTemplate.close;
import static com.kkpjj.common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.sql.ResultSet;

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

	public String checkMemberId(MemberDTO member) {
		
		Connection con = getConnection();
		
		String resultID = memberDAO.FindIdMember(con, member);
		
		close(con);
		
		return resultID;
	}

	public String checkMemberPwd(MemberDTO memberDTO) {

		Connection con = getConnection();
		
		String resultPwd = memberDAO.FindPwdMember(con, memberDTO);
		
		close(con);
		
		return resultPwd;
	}
	
}
