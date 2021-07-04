package com.kkpjj.sysostory.controller;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import com.kkpjj.sysostory.model.dto.MonsterDTO;
import com.kkpjj.sysostory.model.dto.SkillDTO;
import com.kkpjj.sysostory.model.service.BattleService;
import com.kkpjj.sysostory.model.service.SkillService;
import com.kkpjj.sysostory.view.battle.BattleChr;
import com.kkpjj.sysostory.view.battle.BattleMenu;
import com.kkpjj.sysostory.view.battle.BattleMon;

public class BattleController {

	private JFrame mf;
	private BattleChr battleChr;
	private BattleMon battleMon;
	private BattleMenu battleMenu;
	private String attackType;
	private String subMenuName;
	int numOfMon;
	int monCode;

	public BattleController(JFrame mf) {
		this.mf = mf;
	}

	public void createChr() {
		this.battleChr = new BattleChr();
		mf.add(battleChr);
	}

	public void createMon() {
		BattleService bs = new BattleService();
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
	
	public void selectMenu() {
		battleMenu.selectMenu();
	}

	public void selectSubMenu(String attackType, String subMenuName) {
		this.attackType = attackType;
		this.subMenuName = subMenuName;
		
		System.out.println(attackType);

		switch(attackType) {
			case "attack" : battleMon.selectMon(); break;
			case "skill" : battleMon.selectMon(); break;
			case "potion" : useItem(); break;
			case "run" : runAway(); break;
			default : System.out.println("서브 메뉴 선택 오류");
		}
	}

	public void characterAttack(int selectMonNo, int selectMonCode) {
		// chrAtt,  monHp, monDef, 선택 몬스터, chrMp, skill_code(chrDTO / monDTO 필요)
		int chrCode;
		int skillCode;
		int monCode;
		int chrMp = 50;				// chracterDTO.getChrMp();
		int chrAtt = 10;			// chracterDTO.getChrAtt();
		double skillAtt = 0.2;		// skillDTO.getSkillAtt();
		int mpConsume = 25;			// skillDTO.getMpConsume();
		int monHp = 50;				// monsterDTO.getMonHp();
		int monDef = 5;				// monsterDTO.getMonDef();

		switch(attackType) {
			case "attack" : attack(); break;
			case "skill" : checkMp(chrMp, mpConsume); break;
			default : System.out.println("캐릭터 공격 오류"); break;
		}
	}

	private void attack() {
		int chrAtt = 10;			// chracterDTO.getChrAtt();
		int monHp = 50;				// monsterDTO.getMonHp();
		int monDef = 5;				// monsterDTO.getMonDef();

		monHp = monHp - (chrAtt - monDef);
		
//		checkAlive();
		// 몬스터가 죽었는지 확인 - y: 다른 몬스터가 있는지 확인, n: 몬스터 턴
		// 몬스터가 남아있는지 확인 - y: 몬스터 턴, n: 전투 종료
		// 전투 종료 시 경험치, 골드 획득, 필드로 이동(화면 전환) 

	}

	private void attack(int chrMp, int mpConsume) {
		chrMp = chrMp - mpConsume;

	}

	private void useItem() {
		System.out.println("물약 사용");
	}

	private void runAway() {
		System.out.println("도망~");
	}


	private void checkMp(int chrMp, int mpConsume) {

		if(chrMp > mpConsume) {
			attack(chrMp, mpConsume);
			System.out.println("스킬 발사!!");
		} else {
			System.out.println("MP가 부족합니다.");
		}
	}
}
