package com.kkpjj.sysostory.model.service;

import static com.kkpjj.common.JDBCTemplate.close;
import static com.kkpjj.common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.List;

import com.kkpjj.sysostory.controller.BattleController;
import com.kkpjj.sysostory.model.dao.BattleDAO;
import com.kkpjj.sysostory.model.dto.MonsterDTO;
import com.kkpjj.sysostory.view.ViewUtil;

public class BattleService {
	private BattleController bc;
	private BattleDAO battleDAO;

	public BattleService() {
		this.battleDAO = new BattleDAO();
	}

	public List<MonsterDTO> fightMonster() {
		Connection con = getConnection();

		List<MonsterDTO> monsterList = battleDAO.selectAllMonList(con);

		close(con);

		return monsterList;
	}
	
	public int checkMp(String subMenuName) {
		int chrMp = 10;				// chracterDTO.getChrMp();
		int mpConsume = 25;			// skillDTO.getMpConsume();
		double skillAtt = 0.2;
		int result = 0;
		
		if(chrMp >= mpConsume) {
			chrMp -= mpConsume;		// characterDTO.setChrMp();
			result = 1;
		} else {
			System.out.println("MP가 부족합니다.");
		}
		return result;
	}

	public int chrAttack(String AttackType, String subMenuName) {
		int chrAtt = 10;			// chracterDTO.getChrAtt();
		double skillAtt = 0.2;		// monsterDTO.getSkillAtt();
		int monHp = 50;				// monsterDTO.getMonHp();
		int monDef = 5;				// monsterDTO.getMonDef();

		switch(AttackType) {
			case "attack" : monHp -= (chrAtt - monDef); break;
			case "skill" : monHp -= (int) (chrAtt * (1 + skillAtt) - monDef); break; 
		}
		
		int result = isMonAlive(monHp);
		
		return result;
	}

	private int isMonAlive(int hp) {
		int result = 0;
		
		if(hp > 0) {
			result = 1;
		} else {
			hp = 0;
//			result = isOtherMonAlive();
		}
		return result;
	}
	
	public int isOtherMonAlive() {
		int result = 0;
		return result;
	}

	public int monAttack() {
		int chrHp = 100;
		int chrDef = 5;
		String monType = "boss";
		int monAtt = 10;
		double monSkillAtt = 0.2;

		if(monType.equals("boss")) {
			chrHp -= (int) (monAtt * (1 + monSkillAtt) - chrDef);
		} else {
			chrHp -= monAtt - chrDef;			
		}

		int result = isChrAlive(chrHp);
		return result;
	}

	private int isChrAlive(int chrHp) {
		int result = 0;
		
		if(chrHp > 0) {
			result = 1;
		}
		return result;
	}
}
