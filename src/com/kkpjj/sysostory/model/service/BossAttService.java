package com.kkpjj.sysostory.model.service;

import java.sql.Connection;

import com.kkpjj.sysostory.model.dao.BossAttDAO;
import com.kkpjj.sysostory.model.dto.MonsterDTO;

import static com.kkpjj.common.JDBCTemplate.getConnection;
import static com.kkpjj.common.JDBCTemplate.close;


public class BossAttService {

	private BossAttDAO bossAttDAO;
	public BossAttService() {
	this.bossAttDAO = new BossAttDAO();
	}

	
	public MonsterDTO attBoss(int monCode) {
		
		Connection con = getConnection();
		
		MonsterDTO monster = bossAttDAO.selectattBoss(con , monCode);
		
		close(con);
		
		return monster;
	}

}
