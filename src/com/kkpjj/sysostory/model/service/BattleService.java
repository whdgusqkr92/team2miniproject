package com.kkpjj.sysostory.model.service;

import static com.kkpjj.common.JDBCTemplate.close;
import static com.kkpjj.common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.List;

import com.kkpjj.sysostory.controller.BattleController;


import com.kkpjj.sysostory.model.dao.MonsterDAO;
import com.kkpjj.sysostory.model.dao.SkillDAO;
import com.kkpjj.sysostory.model.dto.CharacterDTO;
import com.kkpjj.sysostory.model.dto.MonsterDTO;
import com.kkpjj.sysostory.model.dto.SkillDTO;


public class BattleService {
	private BattleController bc;
	private MonsterDAO monsterDAO;
	private SkillDAO skillDAO;

	public BattleService() {
		this.monsterDAO = new MonsterDAO();
		this.skillDAO = new SkillDAO();
	}

	public List<MonsterDTO> selectAllMonsters() {
		Connection con = getConnection();

		List<MonsterDTO> monsterList = monsterDAO.selectAllMonsters(con);

		close(con);

		return monsterList;
	}
	
	public List<SkillDTO> selectAllSkills() {
		Connection con = getConnection();
		
		List<SkillDTO> skillList = skillDAO.selectAllSkillList(con);
		
		close(con);
		
		return skillList;
	}
	
	
	public int checkMp(String subMenuName, CharacterDTO characterDTO, SkillDTO skillDTO) {
		int chrMp = characterDTO.getChrMp();
		int mpConsume = skillDTO.getMpConsum();
		double skillAtt = skillDTO.getSkillAtt();
		int result = 0;
		
		if(chrMp >= mpConsume) {
			chrMp -= mpConsume;		// characterDTO.setChrMp();
			result = 1;
		} else {
			System.out.println("MP가 부족합니다.");
		}
		return result;
	}

	public int chrAttack(String AttackType, String subMenuName, CharacterDTO characterDTO, MonsterDTO monsterDTO) {
		int chrAtt = characterDTO.getChrAtt();
		double skillAtt = monsterDTO.getSkillAtt();
		int monHp = monsterDTO.getMonHp();
		int monDef = monsterDTO.getMonDef();

		switch(AttackType) {
			case "attack" : monHp -= (chrAtt - monDef); break;
			case "skill" : monHp -= (int) (chrAtt * (1 + skillAtt) - monDef); break; 
		}
		
		int result = isMonAlive(monHp);
		
		return result;
	}

	private int isMonAlive(int monHp) {
		int result = 0;
		
		if(monHp > 0) {
			result = 1;
		} else {
			monHp = 0;
//			result = isOtherMonAlive();
		}
		return result;
	}
	
	public int isOtherMonAlive() {
		int result = 0;
		return result;
	}

	public int monAttack(CharacterDTO characterDTO, MonsterDTO monsterDTO) {
		int chrHp = characterDTO.getChrHp();
		int chrDef = characterDTO.getChrDef();
		int monCode = monsterDTO.getMonCode();
		int monAtt = monsterDTO.getMonAtt();
		double monSkillAtt = 0.2;

		if(monCode == 3) {
			chrHp -= (int) (monAtt * (1 + monSkillAtt) - chrDef);


		} else if(monCode == 0) {

			chrHp -= monAtt - chrDef;			
		}

		int result = isChrAlive(characterDTO, chrHp);
		return result;
	}

	private int isChrAlive(CharacterDTO characterDTO, int chrHp) {
		int result = 0;
		
		if(chrHp > 0) {
			characterDTO.setChrHp(chrHp);
			result = 1;
		} else {
			characterDTO.setChrHp(characterDTO.getChrMaxHp() / 10);
		}
		return result;
	}
}
