package com.kkpjj.sysostory.model.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import static com.kkpjj.common.JDBCTemplate.close;
import com.kkpjj.sysostory.model.dto.MonsterDTO;

public class BossAttDAO {
	
	private Properties prop;
	
	public BossAttDAO() {
		this.prop = new Properties();
		
		try {
			prop.loadFromXML(new FileInputStream("mapper/monster-query.xml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public MonsterDTO selectattBoss(Connection con, int monCode) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		MonsterDTO monster = null;
		String query = prop.getProperty("selectMonster");
		
		try {
			
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, monCode);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				monster = new MonsterDTO();
				monster.setMonCode(rset.getInt("MON_CODE"));
				monster.setMonName(rset.getString("MON_NAME"));
				monster.setMonHp(rset.getInt("MON_HP"));
				monster.setMonAtt(rset.getInt("MON_ATT"));
				monster.setSkillAtt(rset.getInt("MON_SKILL_ATT"));
				monster.setMonDef(rset.getInt("MON_DEF"));
				monster.setMonExp(rset.getInt("MON_EXP"));
				monster.setDropGold(rset.getInt("DROP_GOLD"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
//		System.out.println(monCode); 확인용
		return monster;
	}
}
