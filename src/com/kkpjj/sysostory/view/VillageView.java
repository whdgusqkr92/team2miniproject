package com.kkpjj.sysostory.view;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VillageView extends JFrame {
	
	private JFrame mf;
	private JPanel mainPanel;
	private JPanel posionShopPanel;
	private JPanel weaponShopPanel;
	private JPanel armorShopPanel;
	private JPanel statusPanel;
	private JPanel mapPanel;

	public VillageView() {
		
		// 마을화면 프레임 생성
		mf = new JFrame();

		mf.setSize(810, 630);
		mf.setLayout(null);
		mf.setTitle("sysoStory");
		mf.setFont(new Font("둥근모꼴", Font.PLAIN, 16));
		
		// 하단 상태 패널
		statusPanel = new JPanel();
		statusPanel.setBounds(0, 420, 560, 180);
		
		// 하단 맵 정보 패널
		mapPanel = new JPanel();
		mapPanel.setBounds(560, 420, 240, 180);

		Image statusBg = new ImageIcon("images/status.png").getImage().getScaledInstance(560, 180, 0);
		JLabel label1 = new JLabel(new ImageIcon(statusBg));
		
		Image mapBg = new ImageIcon("images/map.png").getImage().getScaledInstance(240, 180, 0);
		JLabel label2 = new JLabel(new ImageIcon(mapBg));
		
		statusPanel.add(label1);
		mapPanel.add(label2);
		
//		mf.getContentPane().add(statusPanel);
//		mf.getContentPane().add(mapPanel);
		
		// 메인 화면 구성
		mainPanel = new MainView();
		mainPanel.setBounds(0, 0, 800, 420);
		
		// 물약상인
		posionShopPanel = new PotionShopView();
		posionShopPanel.setBounds(98, 55, 70, 100);
		
		// 무기상인
		weaponShopPanel = new WeaponShopView();
		weaponShopPanel.setBounds(200, 60, 70, 100);
		
		// 장비상인
		armorShopPanel = new ArmorShopView();
		armorShopPanel.setBounds(400, 80, 70, 100);

		mainPanel.add(posionShopPanel);
		mainPanel.add(weaponShopPanel);
		mainPanel.add(armorShopPanel);

		mf.add(mainPanel);

		mf.setLocationRelativeTo(null);
		mf.setResizable(false);
		mf.setVisible(true);
		mf.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

class MainView extends JPanel {

	Image bg = new ImageIcon("images/battle_bg.png").getImage().getScaledInstance(800, 420, 0);

	public MainView() {
		this.setLayout(null);
		this.setOpaque(false);
	}
	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);
	}
}