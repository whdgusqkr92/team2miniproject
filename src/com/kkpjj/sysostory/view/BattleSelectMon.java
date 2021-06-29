package com.kkpjj.sysostory.view;

import java.awt.Rectangle;
import java.util.List;

public class BattleSelectMon {
	private Rectangle firstMon;
	private Rectangle secondMon;
	private Rectangle thirdMon;
	private Rectangle fourthMon;
	
	public void selectMon(String attackType, String attackName, List<Rectangle> mon) {		
		this.firstMon = mon.get(0);		
		this.secondMon = mon.get(1);
		this.thirdMon = mon.get(2);
		this.fourthMon = mon.get(3);
		
		System.out.println(firstMon);
		System.out.println(secondMon);
		System.out.println(thirdMon);
		System.out.println(fourthMon);
		
	}
}
