package com.kkpjj.sysostory.koobongean;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BattlePage extends JPanel {

	private JFrame mf;
	private JPanel mainPanel;
	private JPanel chrPanel;

	private JPanel menuPanel;
	private JPanel monPanel;

	public BattlePage(JFrame mf) {
		// 전투화면 프레임 생성
		this.mf = mf;

		// 전투 메인화면 구성
		mainPanel = new MainPanel();
		mainPanel.setBounds(0, 0, 800, 420);
				
		// 캐릭터 생성
//		chrPanel = new BattleChrPanel();
//		// 전투 메뉴 생성
//		menuPanel = new BattleMenuPanel();
//		// 몬스터 생성
//		monPanel = new BattleMonPanel();
		
		mainPanel.add(chrPanel);
		mainPanel.add(menuPanel);
		mainPanel.add(monPanel);
		
		this.mf.add(mainPanel);
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