package com.kkpjj.sysostory.model.service;

import java.sql.Connection;

import com.kkpjj.sysostory.model.dao.SkillDAO;
import com.kkpjj.sysostory.model.dto.SkillDTO;

import static com.kkpjj.common.JDBCTemplate.close;
import static com.kkpjj.common.JDBCTemplate.getConnection;

public class SkillService {
	
	SkillDAO skillDAO = new SkillDAO();

	public SkillDTO selectSkillScript(int SkillCode) {
		
		Connection con = getConnection();
		
		SkillDTO skillScript = skillDAO.selectSkillScript(con, SkillCode);
		
		close(con);
		
		return skillScript;
		
	}
	
}
