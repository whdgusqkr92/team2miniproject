package com.kkpjj.sysostory.model.service;

import static com.kkpjj.common.JDBCTemplate.close;
import static com.kkpjj.common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.List;

import com.kkpjj.sysostory.model.dao.BattleDAO;
import com.kkpjj.sysostory.model.dto.MonsterDTO;

public class BattleService {
	
	private BattleDAO battleDAO;
	
	public BattleService() {
		this.battleDAO = new BattleDAO();
	}

	public List<MonsterDTO> fightMonster() {
		Connection con = getConnection();
		
//		BattleDAO battleDAO = new BattleDAO();
		List<MonsterDTO> monsterList = battleDAO.selectAllMonList(con);
		
		close(con);
		
		return monsterList;
	}
	
	public void attack(String attackType) {
		int chrAtt = 10;			// chracterDTO.getChrAtt();
		double skillAtt = 0.2;
		int monHp = 50;				// monsterDTO.getMonHp();
		int monDef = 5;				// monsterDTO.getMonDef();
		
		if(attackType.equals("attack")) {
			monHp = monHp - (chrAtt - monDef);			
		} else if (attackType.equals("skill")) {
			monHp = (int) (monHp - (chrAtt * (1 + skillAtt) - monDef));
		}
		System.out.println(monHp);
	}
	private void isAlive(int hp) {
		if(hp > 0) {
			monAttack();
		} else {
			winReward();
		}
//		checkAlive();
		// 몬스터가 죽었는지 확인 - y: 다른 몬스터가 있는지 확인, n: 몬스터 턴
		// 몬스터가 남아있는지 확인 - y: 몬스터 턴, n: 전투 종료
		// 전투 종료 시 경험치, 골드 획득, 필드로 이동(화면 전환) 
	}

	public void checkMp(String attackType, int chrMp, int mpConsume) {
		double skillAtt = 0.2;
		if(chrMp > mpConsume) {
			chrMp -= mpConsume;
			attack(attackType);
		} else {
			System.out.println("MP가 부족합니다.");
		}
	}
	
	private void monAttack() {
		
	}
	
	private void winReward() {
		// TODO Auto-generated method stub
		
	}
}
