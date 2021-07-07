package com.kkpjj.sysostory.controller;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.kkpjj.sysostory.model.dto.CharacterDTO;
import com.kkpjj.sysostory.model.dto.InventoryDTO;
import com.kkpjj.sysostory.model.dto.MonsterDTO;
import com.kkpjj.sysostory.model.dto.SkillDTO;
import com.kkpjj.sysostory.model.service.BattleService;
import com.kkpjj.sysostory.view.ViewUtil;
import com.kkpjj.sysostory.view.battle.BattleChr;
import com.kkpjj.sysostory.view.battle.BattleMenu;
import com.kkpjj.sysostory.view.battle.BattleMon;
import com.kkpjj.sysostory.view.character.FieldCharacterBattle;
import com.kkpjj.sysostory.view.character.VillageView;

public class BattleController {

	private JFrame mf;
	private JPanel battlePage;
	private BattleService bs;
	private CharacterDTO characterDTO;
	private InventoryDTO inventoryDTO;
	private BattleMon battleMon;
	private BattleMenu battleMenu;
	private String attackType;
	private String subMenuName;
	private int numOfMon;
	private int monCode;
	private List<MonsterDTO> monsterList;
	private List<SkillDTO> skillList;


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

	public BattleController(JFrame mf, JPanel battlePage, CharacterDTO characterDTO, InventoryDTO inventoryDTO) {
		this.mf = mf;
		this.battlePage = battlePage;
		this.characterDTO = characterDTO;
		this.inventoryDTO = inventoryDTO;
		this.bs = new BattleService();
	}

	public void selectAllMonsters() {
		List<MonsterDTO> monsterList = new ArrayList<>();

		this.monsterList = bs.selectAllMonsters();
	}

	public void selectAllSkills() {
		List<SkillDTO> skillList = new ArrayList<>();

		this.skillList = bs.selectAllSkills();
	}

	//	chrDTO
	//	monDTO
	// 등장 확률이 0이 아닌 몬스터의 DTO를 가져오고, 몬스터를 생성(추후 구현)
	//		List<MonsterDTO> monsterList = bs.fightMonster();
	//		List<MonsterDTO> fightMonList = new ArrayList<>();
	//	skillDTO
	//	SkillService ss = new SkillService();
	//		List<SkillDTO> skillList = ss.selectAllSkills();

	// 캐릭터 생성
	public void createChr() {
		BattleChr battleChr = new BattleChr();
		battlePage.add(battleChr);
	}

	// 몬스터 생성
	public void createMon() {
		//		numOfMon = 1;	// 1 ~ 4 사이의 난수로 변경
		//		for(int i = 0; i < numOfMon; i++) {
		//			fightMonList.add(i, Mon);
		//		}

		int selectMonCode = 1;
		MonsterDTO monsterDTO = new MonsterDTO();
		for(int i = 0; i < monsterList.size(); i++) {
			if(selectMonCode == monsterList.get(i).getMonCode()) {
				monsterDTO = monsterList.get(i);
			}
		}

		BattleMon battleMon = new BattleMon(battlePage, this, monsterDTO);
		this.battleMon = battleMon;
		battlePage.add(battleMon);
	}

	// 전투 메뉴 생성
	public void createMenu() {
		BattleMenu battleMenu = new BattleMenu(this);
		battlePage.add(battleMenu);
		this.battleMenu = battleMenu;
	}

	// 사용자 행동 선택
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

	// 기본 공격 및 스킬 공격
	public void characterAttack(int selectMonNo, int selectMonCode) {
		MonsterDTO monsterDTO = new MonsterDTO();
		for(int i = 0; i < monsterList.size(); i++) {
			if(selectMonCode == monsterList.get(i).getMonCode()) {
				monsterDTO = monsterList.get(i);
			}
		}

		SkillDTO skillDTO = new SkillDTO();
		for(int i = 0; i < skillList.size(); i++) {
			if(subMenuName == skillList.get(i).getSkillName()) {
				skillDTO = skillList.get(i);
			}
		}

		int resultAtt = 0;
		int resultDef = 0;
		int checkMp = 0;

		switch(attackType) {		// characterDTO();
		case "attack" :
			resultAtt = bs.chrAttack(attackType, subMenuName, characterDTO, monsterDTO);
			break;
		case "skill" :
			checkMp = bs.checkMp(subMenuName, characterDTO, skillDTO);
			if(checkMp > 0) {
				resultAtt = bs.chrAttack(attackType, subMenuName, characterDTO, monsterDTO);
			} else {
				createMenu();
			}
			break;
		default : System.out.println("캐릭터 공격 error"); break;
		}

		if(resultAtt > 0) {
			int remainMon = bs.isOtherMonAlive();
			if(remainMon > 0) {
				resultDef = bs.monAttack(characterDTO, monsterDTO);

			} else {
				winReward(characterDTO, monsterDTO);
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

	// 전투 승리 시 보상
	public void winReward(CharacterDTO characterDTO, MonsterDTO monsterDTO) {
		int chrExp = characterDTO.getChrExp();
		int chrMaxExp = characterDTO.getChrMaxExp();
		int monExp = monsterDTO.getMonExp();

		chrExp += monExp;


		ViewUtil.changePanel(mf, battlePage, new FieldCharacterBattle(mf, inventoryDTO, characterDTO));
	}

	// 전투 패배 시 패널티
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

	// 아이템 사용
	private void useItem() {
		System.out.println("물약 사용");	// 인벤토리로 연결
	}

	// 도망가기
	private void runAway() {
		ViewUtil.changePanel(mf, battlePage, new FieldCharacterBattle(mf, inventoryDTO, characterDTO));
	}
}