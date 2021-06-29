package com.kkpjj.sysostory.view;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

// 전투메뉴 배경 추가, 레이아웃 설정, 전투 세부메뉴(버튼) 추가
class BattleMenuPanel extends JPanel {
	
	private SubMenu subMenu;
//	private SubMenu attackSubMenu;
//	private SubMenu skillSubMenu;
//	private SubMenu potionSubMenu;
//	private SubMenu runSubMenu;
	
	Image battleMenuBg = new ImageIcon("images/battle_menu.png").getImage();

	public BattleMenuPanel(List<Rectangle> mon) {
		
		this.setLayout(null);
		this.setOpaque(false);
		
		// 전투 세부메뉴 추가
		JButton attackMenu = new AttackMenu();
		attackMenu.setBounds(24, 20, 31, 31);
		JButton skillMenu = new SkillMenu();
		skillMenu.setBounds(71, 20, 31, 31);
		JButton potionMenu = new PotionMenu();
		potionMenu.setBounds(118, 20, 31, 31);
		JButton runMenu = new RunMenu();
		runMenu.setBounds(165, 20, 31, 31);
		
		subMenu = new SubMenu(mon);
		subMenu.setBounds(24, 60, 170, 155);
		subMenu.setVisible(true);
		
//		attackSubMenu = new AttackButton();
//		attackSubMenu.setBounds(24, 60, 170, 155);
//		attackSubMenu.setVisible(true);
//		skillSubMenu = new SkillButton();
//		skillSubMenu.setBounds(24, 60, 170, 155);
//		skillSubMenu.setVisible(false);
//		potionSubMenu = new PotionButton();
//		potionSubMenu.setBounds(24, 60, 170, 155);
//		potionSubMenu.setVisible(false);
//		runSubMenu = new RunButton();
//		runSubMenu.setBounds(24, 60, 170, 155);
//		runSubMenu.setVisible(false);
		
		this.add(attackMenu);
		this.add(skillMenu);
		this.add(potionMenu);
		this.add(runMenu);
		this.add(subMenu);
//		this.add(attackSubMenu);
//		this.add(skillSubMenu);
//		this.add(potionSubMenu);
//		this.add(runSubMenu);
		
		// 메뉴 선택 시 화면 전환
//		attackMenu.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				attackSubMenu.setVisible(true);
//				skillSubMenu.setVisible(false);
//				potionSubMenu.setVisible(false);
//				runSubMenu.setVisible(false);
//			}
//		});
//
//		skillMenu.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				attackSubMenu.setVisible(false);
//				skillSubMenu.setVisible(true);
//				potionSubMenu.setVisible(false);
//				runSubMenu.setVisible(false);
//			}
//		});
//
//		potionMenu.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				attackSubMenu.setVisible(false);
//				skillSubMenu.setVisible(false);
//				potionSubMenu.setVisible(true);
//				runSubMenu.setVisible(false);
//			}
//		});
//
//		runMenu.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				attackSubMenu.setVisible(false);
//				skillSubMenu.setVisible(false);
//				potionSubMenu.setVisible(false);
//				runSubMenu.setVisible(true);
//			}
//		});
	}

	// 전투메뉴 배경 추가
	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(battleMenuBg, 0, 0, getWidth(), getHeight(), this);
	}
}

// 메뉴 이미지 추가
class AttackMenu extends JButton {

	Image attackMenuIcon = new ImageIcon("images/battle_attack_icon.png").getImage();

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(attackMenuIcon, 0, 0, getWidth(), getHeight(), this);
	}
}

class SkillMenu extends JButton {

	Image skillMenuIcon = new ImageIcon("images/battle_skill_icon.png").getImage();

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(skillMenuIcon, 0, 0, getWidth(), getHeight(), this);
	}
}

class PotionMenu extends JButton {

	Image potionMenuIcon = new ImageIcon("images/battle_potion_icon.png").getImage();

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(potionMenuIcon, 0, 0, getWidth(), getHeight(), this);
	}
}

class RunMenu extends JButton {

	Image runMenuIcon = new ImageIcon("images/battle_run_icon.png").getImage();

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(runMenuIcon, 0, 0, getWidth(), getHeight(), this);
	}
}