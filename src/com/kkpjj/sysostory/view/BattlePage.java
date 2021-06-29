package com.kkpjj.sysostory.view;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BattlePage extends JPanel {

	private JFrame mf;
	private JPanel mainPanel;
	private JPanel monPanel;
	private JPanel chrPanel;
	private JPanel battleMenuPanel;
	//	private JPanel statusPanel;
	//	private JPanel mapPanel;

	public BattlePage(JFrame mf) {
		// 전투화면 프레임 생성
		this.mf = mf;

		// 전투 메인화면 구성
		mainPanel = new MainPanel();
		mainPanel.setBounds(0, 0, 800, 420);
				
		// 캐릭터
		chrPanel = new BattleChrPanel();
		chrPanel.setBounds(150, 178, 64, 64);
		// 몬스터
		monPanel = new BattleMonPanel();
		monPanel.setBounds(550, 60, 200, 300);
		List<Rectangle> mon = ((BattleMonPanel) monPanel).monPosition();
		// 전투 메뉴
		battleMenuPanel = new BattleMenuPanel(mon);
		battleMenuPanel.setBounds(290, 80, 220, 240);
		
		mainPanel.add(chrPanel);
		mainPanel.add(monPanel);
		mainPanel.add(battleMenuPanel);

		mf.add(mainPanel);
	}
}

// 메인 전투화면에 이미지 추가, 레이아웃 설정
class MainPanel extends JPanel {

	Image bg = new ImageIcon("images/battle_bg.png").getImage().getScaledInstance(800, 420, 0);

	public MainPanel() {
		this.setLayout(null);
		this.setOpaque(false);
	}
	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);
	}
}
