package com.kkpjj.sysostory.view;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

// 캐릭터 이미지 추가, 레이아웃 설정
public class BattleChrPanel extends JPanel {

		Image chr = new ImageIcon("images/battle_chr.png").getImage();
		
		public BattleChrPanel() {
			this.setLayout(null);
			this.setOpaque(false);
		}
		
		@Override
		public void paintComponent(Graphics g) {
			g.drawImage(chr, 0, 0, getWidth(), getHeight(), this);
		}
	}
