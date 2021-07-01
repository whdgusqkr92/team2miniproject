package com.kkpjj.sysostory.view;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

// 캐릭터 이미지 추가, 레이아웃 설정
public class BattleChrPanel extends JPanel {
	
	public BattleChrPanel() {
		this.setBounds(150, 178, 64, 64);
		this.setLayout(null);
		this.setOpaque(false);
	}
	
	Image chr = new ImageIcon("images/battle_chr.png").getImage();

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(chr, 0, 0, getWidth(), getHeight(), this);
	}
}
