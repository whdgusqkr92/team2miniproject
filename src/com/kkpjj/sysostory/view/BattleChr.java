package com.kkpjj.sysostory.view;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import com.kkpjj.sysostory.controller.BattleController;

// 캐릭터 레이아웃 설정, 이미지 추가
public class BattleChr extends JPanel {
	
	public BattleChr() {
		// 레이아웃 설정
		init();
		// 몬스터 생성
		BattleController bc = new BattleController();
		bc.createMon();
	}
	
	private void init() {
		this.setBounds(150, 178, 64, 64);
		this.setLayout(null);
		this.setOpaque(false);
	}
	
	// 캐릭터 이미지 추가
	Image chr = new ImageIcon("images/battle_chr.png").getImage();

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(chr, 0, 0, getWidth(), getHeight(), this);
	}
}
