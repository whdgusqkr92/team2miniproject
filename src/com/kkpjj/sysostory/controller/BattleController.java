package com.kkpjj.sysostory.controller;

import com.kkpjj.sysostory.view.BattleMenu;
import com.kkpjj.sysostory.view.BattleMon;

public class BattleController {

	private BattleMon menuPanel;
	private String attackType;
	private String subMenuName;
	
	public void createMon() {
		// 몬스터 생성
		// (생성 몬스터 개체수 추가)
		this.menuPanel = new BattleMon();
	}
	
	public void createMenu() {
		// 전투 메뉴 생성
		BattleMenu menuPanel = new BattleMenu();
//		menuPanel.selectMon();
	}
	
	public void selectMon() {
		
	}

	public void selectSubMenu(String attackType, String subMenuName) {
		this.attackType = attackType;
		this.subMenuName = subMenuName;
		
		switch(attackType) {
			case "normal" : characterAttack(attackType, subMenuName); break;
			case "skill" : characterAttack(attackType, subMenuName); break;
			case "potion" : useItem(); break;
			case "run" : runAway(); break;
			default : System.out.println("알 수 없는 오류가 발생했습니다.");
		}
	}

	private void characterAttack(String attackType, String subMenuName) {
		// 캐릭터 공격력, 몬스터 체력, 몬스터 방어력, 선택 몬스터, 
		
		System.out.println("기본공격이냐.. 스킬공격이냐..");
		//		BattleSubMenu subMenu = new BattleSubMenu();
		//		this.attackType = attackType;
		//		int ranMonNo = 4;
		//		subMenu.selectSubMenu(attackType);

	}
	
	private void useItem() {
		System.out.println("물약 사용");
	}
	
	private void runAway() {
		System.out.println("도망~");
	}
	
	//	
	//	public void checkMp() {
	//		int chrMp = 50;
	//		int mpConsume = 25;
	//		
	//		if(chrMp > mpConsume) {
	//			System.out.println("스킬 발사!!");
	//		} else {
	//			System.out.println("MP가 부족합니다.");
	//		}
	//	}

}
