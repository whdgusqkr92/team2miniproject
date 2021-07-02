package com.kkpjj.sysostory.controller;

public class BattleController {
	
	String attackType;

	public void selectSubMenu(String attackType, String subMenuName) {
		System.out.println(attackType);
		System.out.println(subMenuName);
	}
	
	public void characterAttack(String attackType) {
		
//		BattleSubMenu subMenu = new BattleSubMenu();
		this.attackType = attackType;
		int ranMonNo = 4;
//		subMenu.selectSubMenu(attackType);
		
//		switch(attackType) {
//			case "normal" : System.out.println("기본공격"); break;
//			case "skill" : System.out.println("스킬공격"); break;
//			case "potion" : System.out.println("아이템사용"); break;
//			case "run" : System.out.println("도망가기"); break;
//			default : System.out.println("알 수 없는 오류가 발생했습니다.");
//		}
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
