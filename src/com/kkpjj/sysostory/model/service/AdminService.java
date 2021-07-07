package com.kkpjj.sysostory.model.service;

import static com.kkpjj.common.JDBCTemplate.getConnection;

import java.sql.Connection;

import com.kkpjj.sysostory.model.dao.AdminDAO;
import com.kkpjj.sysostory.model.dto.MemberDTO;

public class AdminService {
	
	private AdminDAO adminDAO;
	
	public AdminService() {
		
	}

	public int adminLoginManager(MemberDTO memberDTO) {

		Connection con = getConnection();
		
		int adminResult = adminDAO.loginAdmin(con, memberDTO);
		
		return adminResult;
	}

}
