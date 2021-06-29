package com.kkpjj.sysostory.view;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

// 몬스터 레이아웃 설정, 위치 설정
public class BattleMonPanel extends JPanel {

	public BattleMonPanel() {
		this.setLayout(null);
		this.setOpaque(false);

		JPanel firstMon = new FirstMon();
		firstMon.setBounds(0, 0, 64, 28);
		JPanel secondMon = new SecondMon();
		secondMon.setBounds(25, 84, 64, 28);
		JPanel thirdMon = new ThirdMon();
		thirdMon.setBounds(25, 168, 64, 28);
		JPanel fourthMon = new FourthMon();
		fourthMon.setBounds(0, 252, 64, 28);

		this.add(firstMon);
		this.add(secondMon);
		this.add(thirdMon);
		this.add(fourthMon);
	}
}

// 몬스터 이미지 추가
class FirstMon extends JPanel {

	Image mon = new ImageIcon("images/mon_yellow_slime.png").getImage();

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(mon, 0, 0, getWidth(), getHeight(), this);
	}
}

class SecondMon extends JPanel {

	Image mon = new ImageIcon("images/mon_red_slime.png").getImage();

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(mon, 0, 0, getWidth(), getHeight(), this);
	}
}

class ThirdMon extends JPanel {

	Image mon = new ImageIcon("images/mon_yellow_slime.png").getImage();

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(mon, 0, 0, getWidth(), getHeight(), this);
	}
}

class FourthMon extends JPanel {

	Image mon = new ImageIcon("images/mon_red_slime.png").getImage();

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(mon, 0, 0, getWidth(), getHeight(), this);
	}
}