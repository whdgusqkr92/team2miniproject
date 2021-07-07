package com.kkpjj.sysostory.model.service;

import static com.kkpjj.common.JDBCTemplate.close;
import static com.kkpjj.common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.List;

import com.kkpjj.sysostory.model.dao.SkillDAO;
import com.kkpjj.sysostory.model.dto.SkillDTO;

public class SkillService {

	SkillDAO skillDAO = new SkillDAO();

	public SkillDTO selectSkillScript(int SkillCode) {

		Connection con = getConnection();

		SkillDTO skillScript = skillDAO.selectSkillScript(con, SkillCode);


		close(con);

		return skillScript;

	}

	public SkillDTO selectSkillOpenLv(int SkillCode) {

		Connection con = getConnection();


		SkillDTO skillOpenLv = skillDAO.selectSkillScript(con, SkillCode);

		close(con);

		return skillOpenLv;

	}

	public List<SkillDTO> selectAllSkills() {
		Connection con = getConnection();

		List<SkillDTO> skillList = skillDAO.selectAllSkillList(con);
		close(con);

		return skillList;
	}
}
