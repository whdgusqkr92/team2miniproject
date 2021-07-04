package com.kkpjj.sysostory.model.service;

import static com.kkpjj.common.JDBCTemplate.close;
import static com.kkpjj.common.JDBCTemplate.getConnection;

import java.sql.Connection;

import com.kkpjj.sysostory.model.dao.BattleDAO;
import com.kkpjj.sysostory.model.dto.MonsterDTO;

public class BattleService {
	
	private BattleDAO battleDAO;
	
	public BattleService() {
		this.battleDAO = new BattleDAO();
	}

	public MonsterDTO fightMonster() {
		Connection con = getConnection();
		
		BattleDAO battleDAO = new BattleDAO();
		battleDAO.selectAllMonList(con);
		
		close(con);
		
		return null;
	}
}
