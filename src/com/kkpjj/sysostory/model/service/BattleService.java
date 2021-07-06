package com.kkpjj.sysostory.model.service;

import static com.kkpjj.common.JDBCTemplate.close;
import static com.kkpjj.common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.List;

import com.kkpjj.sysostory.controller.BattleController;
import com.kkpjj.sysostory.model.dao.BattleDAO;
import com.kkpjj.sysostory.model.dto.MonsterDTO;

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

	public void chrAttack(String subMenuName) {
		int chrAtt = 10;			// chracterDTO.getChrAtt();
		double skillAtt = 0.2;		// monsterDTO.getSkillAtt();
		int monHp = 50;				// monsterDTO.getMonHp();
		int monDef = 5;				// monsterDTO.getMonDef();

		monHp = monHp - (chrAtt - monDef);
	}

	public boolean chrSkill(String subMenuName) {
		int chrAtt = 10;			// chracterDTO.getChrAtt();
		double skillAtt = 0.2;		// monsterDTO.getSkillAtt();
		int monHp = 50;				// monsterDTO.getMonHp();
		int monDef = 5;				// monsterDTO.getMonDef();
		Boolean result = false;
		
		if(checkMp(subMenuName)) {
			monHp = (int) (monHp - (chrAtt * (1 + skillAtt) - monDef));
			result = true;
		}
		return result;
	}

	private boolean checkMp(String subMenuName) {
		int chrMp = 0;				// chracterDTO.getChrMp();
		int mpConsume = 25;			// skillDTO.getMpConsume();
		double skillAtt = 0.2;
		boolean result = false;
		
		if(chrMp > mpConsume) {
			chrMp -= mpConsume;		// characterDTO.setChrMp();
			result = true;
		} else {
			System.out.println("MP가 부족합니다.");
		}
		return result;
	}

	private void isMonAlive(int monHp) {
		if(monHp > 0) {
			monAttack();
		} else {
			monHp = 0;
			otherMonIsAlive();
		}
		//		checkAlive();
		// 몬스터가 죽었는지 확인 - y: 다른 몬스터가 있는지 확인, n: 몬스터 턴
		// 몬스터가 남아있는지 확인 - y: 몬스터 턴, n: 전투 종료
		// 전투 종료 시 경험치, 골드 획득, 필드로 이동(화면 전환) 
	}

	private void monAttack() {
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

		isChrAlive(chrHp);
	}

	private void isChrAlive(int chrHp) {
		if(chrHp > 0) {

		} else {
			chrHp = 0;

		}
	}

	private void otherMonIsAlive() {

	}

	private void winReward() {

	}
}
