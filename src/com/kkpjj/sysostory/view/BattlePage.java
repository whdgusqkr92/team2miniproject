package com.kkpjj.sysostory.view;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.kkpjj.sysostory.controller.BattleController;

// 전투 메인화면 레이아웃 설정, 캐릭터, 몬스터 생성, 배경 추가
public class BattlePage extends JPanel {

	private JFrame mf;
	private JPanel chrPanel;
	
	public BattlePage(JFrame mf) {
		this.mf = mf;
		// 전투 메인화면 레이아웃 설정
		init();
		// 캐릭터, 몬스터 생성 후 프레임에 추가
		createComponents();
		// 프레임에 전투 메인화면 추가
		this.mf.add(this);
	}
	
	private void init() {
		this.setBounds(0, 0, 800, 420);
		this.setLayout(null);
		this.setOpaque(false);
	}
	
	private void createComponents() {
		BattleController bc = new BattleController(mf);
		// 캐릭터 생성
		bc.createChr();
		// 몬스터 생성
		bc.createMon();
		// 전투메뉴 생성
		bc.createMenu();
	}

	private void addChrPanel() {
		this.add(chrPanel);
	}
	
	// 배경화면 추가
	Image bg = new ImageIcon("images/battle_bg.png").getImage().getScaledInstance(800, 420, 0);
	
	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);
	}
}
