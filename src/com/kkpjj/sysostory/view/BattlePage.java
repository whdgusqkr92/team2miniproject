package com.kkpjj.sysostory.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BattlePage extends JFrame {

	private JFrame mf;
	private JPanel mainPanel;
	private JPanel monPanel;
	private JPanel chrPanel;
	private JPanel battleMenuPanel;
	//	private JPanel statusPanel;
	//	private JPanel mapPanel;

	public BattlePage() {
		// 전투화면 프레임 생성
		mf = new JFrame();

		mf.setSize(800, 600);
		mf.setLayout(null);
		mf.setTitle("sysoStory");
		
		// 메인 전투화면 구성
		mainPanel = new MainPanel();
		mainPanel.setBounds(0, 0, 800, 420);
		// 캐릭터
		chrPanel = new BattleChrPanel();
		chrPanel.setBounds(150, 178, 64, 64);
		// 몬스터
		monPanel = new BattleMonPanel();
		monPanel.setBounds(550, 60, 200, 300);
		// 전투 메뉴
		battleMenuPanel = new BattleMenuPanel();
		battleMenuPanel.setBounds(290, 80, 220, 240);

		mainPanel.add(chrPanel);
		mainPanel.add(monPanel);
		mainPanel.add(battleMenuPanel);

		mf.add(mainPanel);

		mf.setLocationRelativeTo(null);
		mf.setResizable(false);
		mf.setVisible(true);
		mf.setDefaultCloseOperation(EXIT_ON_CLOSE);
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
