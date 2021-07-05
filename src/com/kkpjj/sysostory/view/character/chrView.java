package com.kkpjj.sysostory.view.character;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class chrView extends JPanel {
	
	public chrView() {
		
		// 레이아웃 설정
		init();
		
	}
	
	private void init() {
		this.setBounds(300, 80, 55, 80);
		this.setLayout(null);
		this.setOpaque(false);
	}
	
	// 캐릭터 이미지 추가
	Image chr = new ImageIcon("images/character/캐릭터정면.png").getImage();

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(chr, 0, 0, getWidth(), getHeight(), this);
	}

}
