package com.kkpjj.sysostory.controller;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import com.kkpjj.sysostory.model.dto.CharacterDTO;
import com.kkpjj.sysostory.model.dto.InventoryDTO;
import com.kkpjj.sysostory.model.dto.MonsterDTO;
import com.kkpjj.sysostory.model.dto.SkillDTO;
import com.kkpjj.sysostory.model.service.BattleService;
import com.kkpjj.sysostory.model.service.SkillService;
import com.kkpjj.sysostory.view.ViewUtil;
import com.kkpjj.sysostory.view.battle.BattleChr;
import com.kkpjj.sysostory.view.battle.BattleMenu;
import com.kkpjj.sysostory.view.battle.BattleMon;
import com.kkpjj.sysostory.view.battle.BattlePage;
import com.kkpjj.sysostory.view.battle.BossBattlePage;
import com.kkpjj.sysostory.view.character.FieldCharacterBattle;
import com.kkpjj.sysostory.view.character.VillageView;

public class BattleController {

	private JFrame mf;
	private BattlePage battlePage;
	private BattleController bc;
	private BattleService bs;
	private SkillService ss;
//	private MonsterService ms;
	private CharacterDTO characterDTO;
	private InventoryDTO inventoryDTO;
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

	public BattleController(JFrame mf, BattlePage battlePage, CharacterDTO characterDTO, InventoryDTO inventoryDTO) {
		this.mf = mf;
		this.battlePage = battlePage;
		this.characterDTO = characterDTO;
		this.inventoryDTO = inventoryDTO;
		this.bc = this;
		this.bs = new BattleService();
//		this.ms = new MonsterService();
		this.ss = new SkillService();
	}
//	
//	public BattleController(JFrame mf, BossBattlePage BossBattlePage, CharacterDTO characterDTO, InventoryDTO inventoryDTO) {
//		this.mf = mf;
//		this.battlePage = battlePage;
//		this.characterDTO = characterDTO;
//		this.inventoryDTO = inventoryDTO;
//		this.bc = this;
//		this.bs = new BattleService();
////		this.ms = new MonsterService();
//		this.ss = new SkillService();
//	}

	public void selectAllMonsters() {
		List<MonsterDTO> monsterList = new ArrayList<>();
		
//		monsterList = ms.selectAllMonsters();
		
	}
	
	public void selectAllSkills() {
		List<SkillDTO> skillList = new ArrayList<>();
		
		
	}
	
	//	chrDTO
	//	monDTO
	// 등장 확률이 0이 아닌 몬스터의 DTO를 가져오고, 몬스터를 생성(추후 구현)
	//		List<MonsterDTO> monsterList = bs.fightMonster();
	//		List<MonsterDTO> fightMonList = new ArrayList<>();
	//	skillDTO
	//	SkillService ss = new SkillService();
	//		List<SkillDTO> skillList = ss.selectAllSkills();

	public void createChr() {
		BattleChr battleChr = new BattleChr();
		battlePage.add(battleChr);
	}

	public void createMon() {
		// 몬스터 생성
//		numOfMon = 1;	// 1 ~ 4 사이의 난수로 변경
//		for(int i = 0; i < numOfMon; i++) {
			//			fightMonList.add(i, Mon);
//		}

		BattleMon battleMon = new BattleMon(battlePage, this);
		this.battleMon = battleMon;
		battlePage.add(battleMon);
	}

	public void createMenu() {
		// 전투 메뉴 생성
		BattleMenu battleMenu = new BattleMenu(this);
		battlePage.add(battleMenu);
		this.battleMenu = battleMenu;
		
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
		int resultAtt = 0;
		int resultDef = 0;
		int checkMp = 0;

		switch(attackType) {		// characterDTO();
			case "attack" :
				resultAtt = bs.chrAttack(attackType, subMenuName);
				break;
			case "skill" :
				checkMp = bs.checkMp(subMenuName); 
				if(checkMp > 0) {
					resultAtt = bs.chrAttack(attackType, subMenuName);
				} else {
					createMenu();
				}
				break;
			default : System.out.println("캐릭터 공격 error"); break;
		}
		
		if(resultAtt > 0) {
			int remainMon = bs.isOtherMonAlive();
			if(remainMon > 0) {
				resultDef = bs.monAttack();
			} else {
				winReward();
			}
		} else {
			createMenu();
		}
		
		if(resultDef > 0) {
			createMenu();
		} else {
			defeatPenalty();
		}
	}
	
	public void winReward() {
		
		ViewUtil.changePanel(mf, battlePage, new FieldCharacterBattle(mf, inventoryDTO, characterDTO));
	}

	public void defeatPenalty() {
		int maxHp = 100;
		int maxMp = 50;
		int chrExp = 20;
		int chrHp = maxHp / 10;
		int chrMp = maxMp / 10;
		if(chrExp > 20) {
			chrExp /= 20;
		} else {
			chrExp = 0;
		}

		ViewUtil.changePanel(mf, battlePage, new VillageView(mf, characterDTO));
	}

	private void useItem() {
		System.out.println("물약 사용");	// 인벤토리로 연결
	}

	private void runAway() {
		ViewUtil.changePanel(mf, battlePage, new FieldCharacterBattle(mf, inventoryDTO, characterDTO));
	}
}
