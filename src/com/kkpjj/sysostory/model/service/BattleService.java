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


	public int checkMp(String subMenuName, CharacterDTO chrDTO, SkillDTO skillDTO) {
		int chrMp = chrDTO.getChrMp();
		int mpConsume = skillDTO.getMpConsum();
		double skillAtt = skillDTO.getSkillAtt();
		int result = 0;

		if(chrMp >= mpConsume) {
			chrMp -= mpConsume;
			chrDTO.setChrMp(chrMp);
			result = 1;
		} else {
			System.out.println("MP가 부족합니다.");
		}
		return result;
	}

	public int chrAttack(String AttackType, String subMenuName, CharacterDTO chrDTO, MonsterDTO monDTO) {
		int chrAtt = chrDTO.getChrAtt();
		double skillAtt = monDTO.getSkillAtt();
		int monHp = monDTO.getMonHp();
		int monDef = monDTO.getMonDef();
		System.out.println(chrAtt);
		switch(AttackType) {
		case "attack" : monHp -= (chrAtt - monDef); break;
		case "skill" : monHp -= (int) (chrAtt * (1 + skillAtt) - monDef); break; 
		}
		return monHp;
	}

	public int monAttack(CharacterDTO chrDTO, MonsterDTO monDTO) {
		int chrHp = chrDTO.getChrHp();
		int chrDef = chrDTO.getChrDef();
		int monCode = monDTO.getMonCode();
		int monAtt = monDTO.getMonAtt();
		double monSkillAtt = monDTO.getSkillAtt();

		if(monCode == 3) {
			chrHp -= (int) (monAtt * (1 + monSkillAtt) - chrDef);
		} else {
			chrHp -= monAtt - chrDef;
		}

		return chrHp;
	}
}
