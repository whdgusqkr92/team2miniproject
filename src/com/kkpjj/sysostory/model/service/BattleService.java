package com.kkpjj.sysostory.model.service;

import java.sql.Connection;

import com.kkpjj.sysostory.model.dao.BattleDAO;
import com.kkpjj.sysostory.model.dto.MonsterDTO;

import static com.kkpjj.common.JDBCTemplate.getConnection;
import static com.kkpjj.common.JDBCTemplate.close;

public class BattleService {
	
	private BattleDAO battleDAO;
	
	public BattleService() {
		this.battleDAO = new BattleDAO();
	}

	public MonsterDTO fightMon(int monCode) {
		Connection con = getConnection();
		
		
		
		close(con);
		return null;
	}
}
