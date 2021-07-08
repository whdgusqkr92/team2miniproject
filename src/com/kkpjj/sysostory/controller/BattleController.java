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
	private CharacterDTO chrDTO;
	private InventoryDTO invenDTO;
	private BattleMon battleMon;
	private BattleMenu battleMenu;
	private String attackType;
	private String subMenuName;
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


	public BattleController(JFrame mf, JPanel battlePage, CharacterDTO chrDTO, InventoryDTO invenDTO) {

		this.mf = mf;
		this.battlePage = battlePage;
		this.chrDTO = chrDTO;
		this.invenDTO = invenDTO;
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
		MonsterDTO monDTO = new MonsterDTO();
		for(int i = 0; i < monsterList.size(); i++) {
			if(selectMonCode == monsterList.get(i).getMonCode()) {
				monDTO = monsterList.get(i);
			}
		}

		BattleMon battleMon = new BattleMon(battlePage, this, monDTO);
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
		System.out.println(attackType);
		System.out.println(subMenuName);
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
		MonsterDTO monDTO = new MonsterDTO();
		for(int i = 0; i < monsterList.size(); i++) {
			if(selectMonCode == monsterList.get(i).getMonCode()) {
				monDTO = monsterList.get(i);
			}
		}

		SkillDTO skillDTO = new SkillDTO();
		for(int i = 0; i < skillList.size(); i++) {
			if(subMenuName == skillList.get(i).getSkillName()) {
				skillDTO = skillList.get(i);
			}
		}

		int chrHp = chrDTO.getChrHp();
		int monHp = monDTO.getMonHp();
		int checkMp = chrDTO.getChrMp();

		switch(attackType) {		// characterDTO();
			case "attack" :
				monHp = bs.chrAttack(attackType, subMenuName, chrDTO, monDTO);
				break;
			case "skill" :
				checkMp = bs.checkMp(subMenuName, chrDTO, skillDTO);
				if(checkMp > 0) {
					monHp = bs.chrAttack(attackType, subMenuName, chrDTO, monDTO);
				} else {
					createMenu();
				}
				break;
		}
		System.out.println("MON_HP" + monHp);
		if(monHp > 0) {
			chrHp = bs.monAttack(chrDTO, monDTO);

		} else {
			winReward(chrDTO, monDTO);
		}

		System.out.println("CHR_HP" + chrHp);
		if(chrHp > 0) {

			createMenu();
		} else {
			defeatPenalty(chrDTO);
		}
	}

	// 전투 승리 시 보상

	public void winReward(CharacterDTO chrDTO, MonsterDTO monDTO) {
		int chrGold = chrDTO.getChrGold();
		int chrExp = chrDTO.getChrExp();
		int chrMaxExp = chrDTO.getChrMaxExp();
		int dropGold = monDTO.getDropGold();
		int monExp = monDTO.getMonExp();
		
		chrGold += dropGold;
		chrExp += monExp;
		
		while(chrExp > chrMaxExp) {
			levelup(chrDTO);			
		}
		
		bs.updateChrInfo(chrDTO);
		
		ViewUtil.changePanel(mf, battlePage, new FieldCharacterBattle(mf, invenDTO, chrDTO));
	}

	private void levelup(CharacterDTO chrDTO) {
		chrDTO.setChrExp(chrDTO.getChrExp() - chrDTO.getChrMaxExp());
		chrDTO.setChrLevel(chrDTO.getChrLevel() + 1);
		chrDTO.setChrMaxHp((int) (chrDTO.getChrMaxHp() * 1.2));
		chrDTO.setChrMaxMp((int) (chrDTO.getChrMaxMp() * 1.15));
		chrDTO.setChrMaxExp((int) (chrDTO.getChrMaxExp() * 1.25 + 25));
		chrDTO.setChrAtt((int) (chrDTO.getChrAtt() * 1.2 + 3));
		chrDTO.setChrDef((int) (chrDTO.getChrDef() * 1.05 + 5));
		chrDTO.setChrHp(chrDTO.getChrMaxHp());
		chrDTO.setChrMp(chrDTO.getChrMaxMp());
		

	}

	// 전투 패배 시 패널티
	public void defeatPenalty(CharacterDTO chrDTO) {
		int chrExp = chrDTO.getChrExp();
		int chrMaxHp = chrDTO.getChrMaxHp();
		int chrMaxMp = chrDTO.getChrMaxMp();
		int chrMaxExp = chrDTO.getChrMaxExp();
		
		if(chrExp > chrMaxExp / 0.2) {
			chrDTO.setChrExp(chrExp - (int) (chrMaxExp / 0.2));
		} else {
			chrDTO.setChrExp(0);
		}
		
		chrDTO.setChrHp(chrMaxHp / 10);
		chrDTO.setChrMp(chrMaxMp / 10);
		chrDTO.setChrExp(chrExp);
		
		// DTO DB에 저장

		ViewUtil.changePanel(mf, battlePage, new VillageView(mf, chrDTO));
	}

	// 아이템 사용
	private void useItem() {
		
		System.out.println("물약 사용");	// 인벤토리로 연결
	}

	// 도망가기
	private void runAway() {
		// DB에 DTO 저장
		ViewUtil.changePanel(mf, battlePage, new FieldCharacterBattle(mf, invenDTO, chrDTO));
	}
}