package com.kkpjj.sysostory.view.character;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MoveField extends JPanel {
	
	private JFrame mf;
	
	public MoveField(JFrame mf) {
		
		// 레이아웃 설정
		this.mf = mf;
		init();
		
	}
	
	private void init() {
		this.setBounds(700, 290, 50, 40);
		this.setLayout(null);
		this.setOpaque(false);
	}
	
	// 캐릭터 이미지 추가
	Image chr = new ImageIcon("images/우측화살표.png").getImage();

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(chr, 0, 0, getWidth(), getHeight(), this);
	}
		

}
