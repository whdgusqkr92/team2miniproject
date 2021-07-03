package com.kkpjj.sysostory.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

import com.kkpjj.sysostory.model.dto.SkillDTO;

import static com.kkpjj.common.JDBCTemplate.close;

public class SkillDAO {

	private Properties prop;
	
	public SkillDAO() {
		this.prop = new Properties();
		
		try {
			prop.loadFromXML(new FileInputStream("mapper/skill-query.xml"));
		} catch (InvalidPropertiesFormatException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public SkillDTO selectSkillScript(Connection con, int skillCode) {
		
		
		
//		Statement         고정 값인 쿼리문
		
		PreparedStatement pstmt = null;			//유동적으로 쿼리문 ('?'있는것들)																
		ResultSet rset = null;
		
		SkillDTO skill = null;
		
		String query = prop.getProperty("selectSkill");
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, skillCode);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				skill = new SkillDTO();
				
				skill.setSkillName(rset.getString("SKILL_NAME"));
				skill.setSkillAtt(rset.getInt("SKILL_ATT"));
				skill.setMpConsum(rset.getInt("MP_CONSUM"));
				skill.setSkillOpenLv(rset.getInt("SKILL_OPEN_LV"));
				skill.setSkillScript(rset.getString("SKILL_SCRIPT"));
				
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return skill;
	}
	
	
}

