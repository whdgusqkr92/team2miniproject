package com.kkpjj.sysostory.view;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VillageView extends JPanel {
	
	private JFrame mf;
	private JPanel mainPanel;
	private JPanel posionShopPanel;
	private JPanel weaponShopPanel;
	private JPanel armorShopPanel;
	private JPanel statusPanel;
	private JPanel mapPanel;

	public VillageView(JFrame mf) {
		
		// 마을화면 프레임 생성
		this.mf = mf;
		
		new StatusPanel(mf);	// 하단 패널 
		
		// 메인 화면 구성
		mainPanel = new MainView(mf);
		mainPanel.setBounds(0, 0, 800, 420);
		
		// 물약상인
		posionShopPanel = new PotionShopView(mf);
//		posionShopPanel.setBounds(200, 250, 55, 80);
		
		// 무기상인
		weaponShopPanel = new WeaponShopView(mf);
//		weaponShopPanel.setBounds(400, 60, 55, 80);
		
		// 장비상인
		armorShopPanel = new ArmorShopView(mf);
//		armorShopPanel.setBounds(200, 100, 50, 80);
		
		
		mainPanel.add(posionShopPanel);
		mainPanel.add(weaponShopPanel);
		mainPanel.add(armorShopPanel);
		

		mf.add(mainPanel);

//		mf.setLocationRelativeTo(null);
//		mf.setResizable(false);
//		mf.setVisible(true);
//		mf.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
//		posionShopPanel.setVisible(true);
//		weaponShopPanel.setVisible(true);
//		armorShopPanel.setVisible(true);
		
		mf.repaint();
		mf.revalidate();
		
	}
}

class MainView extends JPanel {
	
	private JFrame mf;

	Image bg = new ImageIcon("images/village.png").getImage().getScaledInstance(800, 420, 0);

	public MainView(JFrame mf) {
		this.mf = mf;
		this.setLayout(null);
		this.setOpaque(false);
	}
	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);
	}
	
}













