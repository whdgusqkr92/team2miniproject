package com.kkpjj.sysostory.controller;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import com.kkpjj.sysostory.model.dto.MonsterDTO;
import com.kkpjj.sysostory.model.service.BattleService;
import com.kkpjj.sysostory.model.service.SkillService;
import com.kkpjj.sysostory.view.battle.BattleChr;
import com.kkpjj.sysostory.view.battle.BattleMenu;
import com.kkpjj.sysostory.view.battle.BattleMon;

public class BattleController {

	private JFrame mf;
	private BattleController bc;
	private BattleService bs;
	private BattleChr battleChr;
	private BattleMon battleMon;
	private BattleMenu battleMenu;
	private String attackType;
	private String subMenuName;
	int numOfMon;
	int monCode;
	
	// getCharacterDTO
	// chrAtt,  monHp, monDef, 선택 몬스터, chrMp, skill_code(chrDTO / monDTO 필요)
//	int chrCode;
//	int skillCode;
//	int monCode;
//	int chrMp = 50;				// chracterDTO.getChrMp();
//	int chrAtt = 10;			// chracterDTO.getChrAtt();
//	double skillAtt = 0.2;		// skillDTO.getSkillAtt();
//	int mpConsume = 25;			// skillDTO.getMpConsume();
//	int monHp = 50;				// monsterDTO.getMonHp();
//	int monDef = 5;				// monsterDTO.getMonDef();
	
	// getSkillDTO
	// getMonsterDTO
	// getInventoryDTO
	
	public BattleController(JFrame mf) {
		this.mf = mf;
		this.bc = this;
		this.bs = new BattleService();
	}

	public void createChr() {
		this.battleChr = new BattleChr();
		mf.add(battleChr);
	}

	public void createMon() {
		// 몬스터 생성
		// (1 ~ 4 마리의 몬스터 생성)
		numOfMon = 4;	// 1 ~ 4 사이의 난수로 변경
		// 등장 확률이 0이 아닌 몬스터의 DTO를 가져오고, 몬스터를 생성(추후 구현)
		
//		List<MonsterDTO> monsterList = bs.fightMonster();
		List<MonsterDTO> fightMonList = new ArrayList<>();
		
		for(int i = 0; i < numOfMon; i++) {
//			fightMonList.add(i, Mon);
		}
		
		this.battleMon = new BattleMon(this);
		mf.add(battleMon);
	}

	public void createMenu() {
		SkillService ss = new SkillService();
//		List<SkillDTO> skillList = ss.selectAllSkills();
		
		// 전투 메뉴 생성
		this.battleMenu = new BattleMenu(this);
		mf.add(battleMenu);
	}

	public void selectAction(String attackType, String subMenuName) {
		this.attackType = attackType;
		this.subMenuName = subMenuName;
		switch(attackType) {
			case "attack" : battleMon.selectMon(); break;
			case "skill" : battleMon.selectMon(); break;
			case "item" : useItem(); break;
			case "run" : runAway(); break;
			default : System.out.println("서브 메뉴 선택 오류");
		}
	}

	public void characterAttack(int selectMonNo, int selectMonCode) {
		switch(attackType) {		// characterDTO();
			case "attack" : bs.chrAttack(subMenuName); break;
			case "skill" :
				if(!bs.chrSkill(subMenuName)) {
					new BattleMenu(this);
					}
				break;
			default : System.out.println("캐릭터 공격 error"); break;
		}
	}

	private void useItem() {
		System.out.println("물약 사용");	// 인벤토리로 연결
	}

	private void runAway() {
		System.out.println("도망~");		// 필드로 연결
	}
}
