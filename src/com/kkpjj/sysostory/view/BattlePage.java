package com.kkpjj.sysostory.view;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BattlePage extends JPanel {

	private JFrame mf;
	
	public BattlePage(JFrame mf) {
		// 전투화면 패널 생성, 배경 추가, 레이아웃 설정
		this.mf = mf;

		// 전투 메인화면 구성
		this.setBounds(0, 0, 800, 420);
		this.setLayout(null);
		this.setOpaque(false);
				
		// 캐릭터 생성
		JPanel chrPanel = new BattleChrPanel();
		// 몬스터 생성
		JPanel monPanel = new BattleMonPanel();
		// 전투 메뉴 생성
		JPanel menuPanel = new BattleMenuPanel();
		
		this.add(chrPanel);
		this.add(menuPanel);
		this.add(monPanel);
		
		mf.add(this);
	}
	
	Image bg = new ImageIcon("images/battle_bg.png").getImage().getScaledInstance(800, 420, 0);
	
	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);
	}
}
