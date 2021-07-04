package com.kkpjj.sysostory.model.dao;

import static com.kkpjj.common.JDBCTemplate.close;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.InvalidPropertiesFormatException;
import java.util.List;
import java.util.Properties;

import com.kkpjj.sysostory.model.dto.MonsterDTO;

public class BattleDAO {
	
	private Properties prop;
	
	public BattleDAO() {
		this.prop = new Properties();
		try {
			prop.loadFromXML(new FileInputStream("mapper/monster-query.xml"));
		} catch (InvalidPropertiesFormatException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

	public List<MonsterDTO> selectAllMonList(Connection con) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		List<MonsterDTO> monsterList = null;
		
		String query = prop.getProperty("selectAllMonList");
		
		try {
			pstmt = con.prepareStatement(query);
			rset = pstmt.executeQuery();
			
			monsterList = new ArrayList<>();
			
			while(rset.next()) {
				MonsterDTO monster = new MonsterDTO();
				monster.setMonCode(rset.getInt("MON_CODE"));
				monster.setMonName(rset.getString("MON_NAME"));
				monster.setMonHp(rset.getInt("MON_HP"));
				monster.setMonAtt(rset.getInt("MON_ATT"));
				monster.setSkillAtt(rset.getInt("MON_SKILL_ATT"));
				monster.setMonDef(rset.getInt("MON_DEF"));
				monster.setMonExp(rset.getInt("MON_EXP"));
				monster.setDropGold(rset.getInt("DROP_GOLD"));
				
				monsterList.add(monster);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		return monsterList;
	}
}
